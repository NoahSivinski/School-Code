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
                    if self.sell_orders[i].customer_id == best_customer_id and self.sell_orders[i]\
                            .price <= order.price and self.sell_orders[i].quantity <= order.quantity:
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

    def create_widgets(self):
        customer_id_label = tk.Label(self, text="Customer ID:")
        customer_id_label.grid(row=0, column=0)
        customer_id_entry = tk.Entry(self)
        customer_id_entry.grid(row=0, column=1)

        side_label = tk.Label(self, text="Side:")
        side_label.grid(row=1, column=0)
        side_var = tk.StringVar()
        side_option = tk.OptionMenu(self, side_var, "buy", "sell")
        side_option.grid(row=1, column=1)

        quantity_label = tk.Label(self, text="Quantity:")
        quantity_label.grid(row=2, column=0)
        quantity = tk.Entry(self)
        quantity.grid(row=2, column=1)

        price_label = tk.Label(self, text="Price:")
        price_label.grid(row=3, column=0)
        price = tk.Entry(self)
        price.grid(row=3, column=1)

        order = Order(price, quantity, customer_id_entry)

        submit = tk.Button(self, text="Submit", command=self.add_order(side_var.get(), order))
        submit.grid(row=4)

    def add_order(self, side, order):
        if side == "buy":
            self.engine.add_buy_order(order)
        elif side == "sell":
            self.engine.add_sell_order(order)


def main():
    App().mainloop()


main()
