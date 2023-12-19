from datetime import datetime, timedelta
import tkinter as tk


class Order:
    def __init__(self, price, quantity, customer_id, time_limit=None):
        self.price = price
        self.quantity = quantity
        self.customer_id = customer_id
        self.time_limit = time_limit
        self.create_time = datetime.now()

    def is_cancelled(self):
        if self.time_limit and datetime.now() - self.create_time >= self.time_limit:
            return True
        return False


class OrderBook:
    def __init__(self):
        self.buy_orders = []
        self.sell_orders = []
        self.customer_orders = {}
        self.average_time = timedelta()
        self.unfilled_orders = 0

    def add_buy_order(self, order):
        self.buy_orders.append(order)
        self.customer_orders[order.customer_id] = 0

    def add_sell_order(self, order):
        self.sell_orders.append(order)
        self.customer_orders[order.customer_id] = 0

    def fill_order(self, order):
        if order.price > 0:
            # Fill buy orders using the FIFO algorithm
            for i in range(len(self.sell_orders)):
                if self.sell_orders[i].price <= order.price and self.sell_orders[i].quantity <= order.quantity:
                    # Fill the order and update quantities
                    order.quantity -= self.sell_orders[i].quantity
                    self.sell_orders[i].quantity = 0
                    # Remove the filled sell order from the list
                    self.sell_orders.pop(i)
                    i -= 1
                    # Update the customer's order count
                    self.customer_orders[order.customer_id] += 1
                    self.customer_orders[self.sell_orders[i].customer_id] += 1
                    # Update the average time to fill an order
                    self.average_time += (datetime.now() - order.create_time)
                if order.quantity == 0:
                    break
        else:
            # Fill sell orders using the FIFO algorithm
            for i in range(len(self.buy_orders)):
                if self.buy_orders[i].price >= order.price and self.buy_orders[i].quantity <= order.quantity:
                    # Fill the order and update quantities
                    order.quantity -= self.buy_orders[i].quantity
                    self.buy_orders[i].quantity = 0
                    # Remove the filled buy order from the list
                    self.buy_orders.pop(i)
                    i -= 1
                    # Update the customer's order count
                    self.customer_orders[order.customer_id] += 1
                    self.customer_orders[self.buy_orders[i].customer_id] += 1
                    # Update the average time to fill an order
                    self.average_time += (datetime.now() - order.create_time)
                if order.quantity == 0:
                    break
        if order.quantity > 0:
            # If the order was not fully filled, add it to the order book
            if order.price > 0:
                self.buy_orders.append(order)
            else:
                self.sell_orders.append(order)
            self.unfilled_orders += 1

    def fill_most_satisfied_customers(self, order):
        if order.price > 0:
            # Fill buy orders using the most satisfied customers algorithm
            best_customer_id = None
            best_customer_count = float("inf")
            for customer_id, count in self.customer_orders.items():
                if count < best_customer_count and customer_id in self.sell_orders:
                    best_customer_id = customer_id
                    best_customer_count = count
            if best_customer_id:
                for i in range(len(self.sell_orders)):
                    if self.sell_orders[i].customer_id == best_customer_id and self.sell_orders[
                        i].price <= order.price and self.sell_orders[i].quantity <= order.quantity:
                        # Fill the order and update quantities
                        order.quantity -= self.sell_orders[i].quantity
                        self.sell_orders[i].quantity = 0
                        # Remove the filled sell order from the list
                        self.sell_orders.pop(i)
                        i -= 1
                        # Update the customer's order count
                        self.customer_orders[order.customer_id] += 1

    def fill_pro_rata(self, order):
        if order.price > 0:
            # Fill buy orders using the pro rata algorithm
            total_quantity = sum(order.quantity for order in self.sell_orders)
            for i in range(len(self.sell_orders)):
                sell_order = self.sell_orders[i]
                fill_quantity = order.quantity * (sell_order.quantity / total_quantity)
                # Fill the order and update quantities
                order.quantity -= fill_quantity
                sell_order.quantity -= fill_quantity
                # Update the customer's order count
                self.customer_orders[order.customer_id] += 1
                self.customer_orders[sell_order.customer_id] += 1
                # Update the average time to fill an order
                self.average_time += (datetime.now() - order.create_time)
                # Remove the filled sell order from the list if it is fully filled
                if self.sell_orders[i].quantity == 0:
                    self.sell_orders.pop(i)
                    i -= 1
            if order.quantity > 0:
                # If the order was not fully filled, add it to the order book
                self.buy_orders.append(order)
                self.unfilled_orders += 1
        else:
            # Fill sell orders using the pro rata algorithm
            total_quantity = sum(order.quantity for order in self.buy_orders)
            for i in range(len(self.buy_orders)):
                buy_order = self.buy_orders[i]
                fill_quantity = order.quantity * (buy_order.quantity / total_quantity)
                # Fill the order and update quantities
                order.quantity -= fill_quantity
                buy_order.quantity -= fill_quantity
                # Update the customer's order count
                self.customer_orders[order.customer_id] += 1
                self.customer_orders[buy_order.customer_id] += 1
                # Update the average time to fill an order
                self.average_time += (datetime.now() - order.create_time)
                # Remove the filled buy order from the list if it is fully filled
                if self.buy_orders[i].quantity == 0:
                    self.buy_orders.pop(i)
                    i -= 1
            if order.quantity > 0:
                # If the order was not fully filled, add it to the order book
                self.sell_orders.append(order)
                self.unfilled_orders += 1


class App(tk.Frame):
    def __init__(self, master=None):
        super().__init__(master)
        self.master = master
        self.engine = OrderBook()
        self.grid()
        self.create_widgets()
        # self.mainloop()

    def create_widgets(self):
        self.customer_id_label = tk.Label(self, text="Customer ID:")
        self.customer_id_label.grid(row=0, column=0)
        self.customer_id_entry = tk.Entry(self)
        self.customer_id_entry.grid(row=0, column=1)

        self.side_label = tk.Label(self, text="Side:")
        self.side_label.grid(row=1, column=0)
        self.side_var = tk.StringVar()
        self.side_option = tk.OptionMenu(self, self.side_var, "buy", "sell")
        self.side_option.grid(row=1, column=1)

        self.quantity_label = tk.Label(self, text="Quantity:")
        self.quantity_label.grid(row=2, column=0)
        self.quantity_var = tk.StringVar()
        self.quantity = tk.Entry(self)
        self.quantity.grid(row=2, column=1)

        self.price_label = tk.Label(self, text="Price:")
        self.price_label.grid(row=3, column=0)
        self.price_var = tk.StringVar()
        self.price = tk.Entry(self)
        self.price.grid(row=3, column=1)

        self.submit = tk.Button(self, text="Submit", command=self.add_order(self.side_var))
        self.submit.grid(row=4)

    def add_order(self, side):
        if side.get() == "buy":
            OrderBook.add_buy_order(Order(self.price, self.quantity, self.customer_id_entry))
        elif side.get() == "sell":
            OrderBook.add_sell_order(Order(self.price, self.quantity, self.customer_id_entry))


def main():
    App().mainloop()


main()
