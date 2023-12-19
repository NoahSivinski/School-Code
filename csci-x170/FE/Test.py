import warnings
import matplotlib.pyplot as plt
import seaborn as sns
import numpy as np
from MatchingEngine import MatchingEngine

warnings.filterwarnings("ignore", category=UserWarning)

start_price = 100.0
engine = MatchingEngine(start_price)

for _ in range(100):
    side = 'B'
    price = np.random.normal(99, 5)
    if np.random.random() < 0.5:
        side = 'S'
        price = np.random.normal(100, 5)
    price = int(price * 10) / 10.0
    size = int(200 * np.random.random())
    print("\nAdding order, side={}, price={}, size={}".format(side, price, size))
    engine.addOrder(side, price, size)
    engine.prepareMatch()
    engine.matchOrders()
    engine.store()
    print("Buys filled:")
    print(engine.buys_filled)
    print("Sells filled:")
    print(engine.sells_filled)
    print("\n")
    print("The buy book:")
    print(engine.buys_prices)
    print(engine.buys_info)
    print("\nThe sell book:")
    print(engine.sells_prices)
    print(engine.sells_info)
    print("\n")

# Plot the resulting buy and sell order books
Buys = {-p: engine.buys_info[-p]["tot"] for p in engine.buys_prices}
Sells = {p: engine.sells_info[p]["tot"] for p in engine.sells_prices}
sns.distplot(list(Buys.keys()), hist_kws={"weights": list(Buys.values())}, kde=False, label="buys")
sns.distplot(list(Sells.keys()), hist_kws={"weights": list(Sells.values())}, kde=False, label="sells")
plt.legend(loc="upper right")
plt.title("Balanced buy/sell order books")
plt.show()

# Plot the time series of the best bid and the best ask prices
Bids = engine.bids
Asks = engine.asks
plt.plot(Bids, label="bid price")
plt.plot(Asks, label="ask price")
plt.title("bid/ask prices times series")
plt.legend(loc="upper right")
plt.xlabel("Time")
plt.ylabel("Price")
plt.show()
