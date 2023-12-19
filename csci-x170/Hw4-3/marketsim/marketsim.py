""" HW4 : Market simulator."""

import pandas as pd
import numpy as np
import datetime as dt
import os
from util import get_data, plot_data


def compute_portvals(orders_file = "./orders/orders.csv", start_val = 1000000, commission=9.95, impact=0.005):
    # this is the function the autograder will call to test your code
    # TODO: Your code here
    orders = pd.read_csv(orders_file, index_col='Date', parse_dates=True, na_values=['nan'],
                         usecols=['Date', 'Symbol', 'Order', 'Shares'])
    orders.sort_index(inplace=True)
    symbols = np.array(orders.Symbol.unique()).tolist()
    prices = get_data(symbols, pd.date_range(orders.index[0].to_datetime64(), orders.index[-1].to_datetime64()))
    pr = prices.index
    rows = orders.iterrows()
    series = pd.Series(start_val, pr)
    prices['Portfolio'], prices['Cash'] = series, series
    for symbol in symbols:  prices[symbol + ' Shares'] = pd.Series(0, pr)
    for left, row in rows:
        ord = row['Order']
        symbol = row['Symbol']
        share = row['Shares']
        symShare = symbol + ' Shares'
        shares = prices.loc[left:, symShare]
        cash = prices.loc[left, symbol] * share
        if ord == 'SELL':
            shares -= share
            cash *= (1 - impact)
            cash -= commission
            prices.loc[left:, 'Cash'] += cash
        else:
            shares += share
            cash *= (1 + impact)
            cash += commission
            prices.loc[left:, 'Cash'] -= cash
        prices.loc[left:, symShare] = shares
    rows = prices.iterrows()
    for left, row in rows:
        i = 0
        for symbol in symbols:
            symShare, sym = symbol + ' Shares', row[symbol]
            i += prices.loc[left, symShare] * sym
            prices.loc[left, 'Portfolio'] = prices.loc[left, 'Cash'] + i
    return prices.loc[:, 'Portfolio']
    # In the template, instead of computing the value of the portfolio, we just
    # read in the value of IBM over 6 months
    '''
    start_date  = dt.datetime(2008,1,1)
    end_date    = dt.datetime(2008,6,1)
    portvals    = get_data(['IBM'], pd.date_range(start_date, end_date))
    portvals    = portvals[['IBM']]  # remove SPY
    return portvals
    '''

def RunCode():
    # this is a helper function you can use to test your code
    # note that during autograding his function will not be called.
    # Define input parameters

    of = "./orders/orders2.csv"
    sv = 1000000

    # Process orders
    portvals = compute_portvals(orders_file = of, start_val = sv)
    if isinstance(portvals, pd.DataFrame):
        portvals = portvals[portvals.columns[0]] # just get the first column
    else:
        "warning, code did not return a DataFrame"
    print(portvals)
    # Get portfolio stats
    # Here we just fake the data. you should use your code from previous assignments.
    start_date = dt.datetime(2008,1,1)
    end_date = dt.datetime(2008,6,1)
    cum_ret, avg_daily_ret, std_daily_ret, sharpe_ratio = [0.2,0.01,0.02,1.5]
    cum_ret_SPY, avg_daily_ret_SPY, std_daily_ret_SPY, sharpe_ratio_SPY = [0.2,0.01,0.02,1.5]
    #sharpe_ratio = SQRT(samples_per_year)*MEAN(daily_rets - daily_rf) / std_daily_return

    # Compare portfolio against $SPX
    print( f"Start Date:  \t\t\t{start_date}" )
    print( f"End Date:    \t\t\t{end_date}" )

    print("")
    print( f"Sharpe Ratio of Fund: \t\t{sharpe_ratio}")
    print( f"Sharpe Ratio of SPY:  \t\t{sharpe_ratio_SPY}\n")

    print( f"Cumulative Return of Fund: \t{cum_ret}")
    print( f"Cumulative Return of SPY : \t{cum_ret_SPY}\n")

    print( f"Standard Deviation of Fund: \t{std_daily_ret}")
    print( f"Standard Deviation of SPY : \t{std_daily_ret_SPY}\n")

    print( f"Average Daily Return of Fund: \t{avg_daily_ret}")
    print( f"Average Daily Return of SPY : \t{avg_daily_ret_SPY}\n")

    print( f"Final Portfolio Value: \t\t{portvals[-1]}")

if __name__ == "__main__":
    RunCode()
