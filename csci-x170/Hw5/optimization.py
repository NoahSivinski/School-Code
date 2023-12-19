"""HW4: Optimize a portfolio.
 
Copyright 2-22, Georgia Institute of Technology (Georgia Tech) 
Copyright 9-22, University of Georgia
Atlanta, Georgia 30332 

All Rights Reserved 
 
Georgia Tech & The University of Georgia asserts copyright ownership of 
this template and all derivative works, including solutions to the projects 
assigned in this course. Students and other users of this template code are 
advised not to share it with others or to make it available on publicly 
viewable websites including repositories such as github and gitlab.  

This copyright statement should not be removed or edited. 
 
Sharing with other current or future students of UGA or GTech is prohibited and 
is subject to being investigated as a UGA & GTech honor code violation. 
 
-----do not edit anything above this line--- 
"""

import pandas as pd
import numpy as np
import datetime as dt
import matplotlib.pyplot as plt
import scipy.optimize as spo
import argparse

import sys
sys.path.insert(0, './portfolio')   # make sure that util works
# XX add a subdirectory containing util.py (part of template & in zipfile)
# XX and analysis.py scripts
# XX do not EDIT util.py  - stick with its API
from portfolio.util import get_data, plot_normalized_data


# XX uncomment below - once you add in your analysis in the portfolio directory
# from portfolio.analysis import get_portfolio_value, get_portfolio_stats, plot_normalized_data

# make a data string work
def str2dt(strng):
    year, month, day = map(int, strng.split('-'))
    return dt.datetime(year, month, day)


# suggested structure - works for 1 allocation schem - you need
def find_optimal_allocations(prices):
    """Find optimal allocations for a stock portfolio, optimizing for
    Volatility for now.

        Parameters
        ----------
                prices: daily prices for each stock in portfolio - note we don't need 
                the period is already embedded in prices.
        Returns
        -------
                allocs: optimal allocations, as fractions that sum to 1.0
        """

    # Inner method - has access to prices, optimizer use this method
    # to figure out how to get an optimal allocation
    def eval_allocationVOL(allocs):
        # make sure that the allocs are normalized. if not normalize them

        # set a fake value (for now) of what we are returning for now
        # Insert some code here.
        port_val = get_portfolio_value(prices, allocs)
        std_daily_ret = get_portfolio_status(port_val)[2]
        retval = std_daily_ret

        # suggestion get the std_daily_ret from analysis.
        # get_portfolio_value(prices, allocs)
        # get_portfolio_stats(prices, allocs) --> this returns SR & Volatility

        # you may want to check that retval is valid e.g. & is not NaN
        return retval

    # AFTER Inner method "find_optimal_allocations" begins here
    fn = "[find_optimal_allocations]"

    # --- Set/get an initial guess ----
    # 	guess is alloc so set it to something -
    # 	it may be fake below, or it may not be, just make
    # 	sure that you have an initial guess...
    even_allocs = [1.0 / prices.shape[1]] * prices.shape[1]
    # alloc = even_allocs (if you ever mean to copy a list it is NOT deep copied)
    # deep copying is illustrated by .copy() below
    allocs = even_allocs.copy()

    # --- set/get constraints ----

    # 	allocations must sum to 1 (same as 1 - sum = 0)
    # 	example from documenation web page @ scipy
    # 	   To constrain the sum of all values in the input array to be less than 50,
    # 	   You can uue the anonymous function lambada defining the function on the spot
    #      as follows:
    #       constraints = ({ 'type': 'ineq', 'fun': lambda inputs: 50.0 - np.sum(inputs) })

    #  adjusted (SIMPLE!) just type in the code according to the above but make
    #  3 possible modifications - 
    # 		1st correcting the sum of allocations:
    #  	   		allocations must sum to 1 (which is equivalent to: 1 - sum = 0)
    #
    #  		2nd since it is equal = you may try 'ineq' to 'eq' for the 2nd parameter
    #  		above. will it make a difference?
    #  		3rd replace input with allocs
    # below set constraints
    # constraints = ({ 'type': 'eq', 'fun': lambda inputs: 1 - np.sum(inputs) })

    # --- set/get bounds ----
    # https://docs.scipy.org/doc/scipy/reference/generated/scipy.optimize.minimize.html
    # sets bound for EACH staock
    # number of stocks is the number of columns you can get it from shape[1]
    # shape[0] gives you number of rows in frame,
    # shape[1] give you number of columns in a frame.

    bounds = ((0.0, 1.0),) * prices.shape[1]  # bounds for each stock

    return_val = allocs
    Xguess = np.array(allocs)
    result_VOL = spo.minimize(eval_allocationVOL, Xguess, method='SLSQP', bounds=bounds)
    Cguess = 1.0 / prices.shape[1]
    function_Cguess = [Cguess] * prices.shape[1]
    cons = ({'type': 'eq', 'fun': lambda function_Cguess: 1.0 - np.sum(function_Cguess)})
    bnds = [(0, 1) for x in prices.columns]
    allocs = result_VOL.x
    return allocs
    print(f"***result_VOL = {result_VOL.x}")
    return return_val

def error_optimal_allocs(allocs, prices):
    port_val = get_portfolio_value(prices, allocs)
    cum_ret, avg_daily_ret, std_daily_ret, sharp_ratio = get_portfolio_status(port_val)
    error = std_daily_ret
    return error

def get_portfolio_status(port_val):
    sf = 252.0
    rfr = 0.0

    daily_rets = port_val.copy()
    daily_rets[1:] = (daily_rets[1:] / daily_rets[:-1].values) - 1
    daily_rets = daily_rets[1:]

    cum_ret = (port_val[-1] / port_val[0]) - 1

    avg_daily_ret = daily_rets.mean()
    std_daily_ret = daily_rets.std()
    sharpe_ratio = np.sqrt(sf) * (np.mean(daily_rets - rfr) / daily_rets.std())

    return cum_ret, avg_daily_ret, std_daily_ret, sharpe_ratio

def get_portfolio_value(prices, allocs):
    normed = prices / prices.iloc[0, :]
    alloced = normed * allocs
    port_val = alloced.sum(axis=1)
    return port_val

def assess_portfolio(allocs, prices):
    sv = 1000000.0
    rfr = 0.0
    sf = 252.0
    norm_prices = prices * allocs * sv
    port_val = norm_prices.sum(axis=1)
    period_end = port_val.iloc[-1]
    commul = port_val.pct_change()
    cr = (period_end - sv) / sv
    adr = commul[1:].mean()
    sddr = commul[1:].std()
    sr = np.sqrt(sf) * (commul[1:] - rfr).mean() / ((commul[1:] - rfr).std())
    return [cr, adr, sddr, sr, port_val]


def run_assess_portfolio(allocs, prices):
    return -1.0 * assess_portfolio(allocs, prices)[3]

def optimize_portfolio(
        sd=dt.datetime(2010, 1, 1),
        ed=dt.datetime(2010, 12, 31),
        syms=["GOOG", "AAPL", "GLD", "XOM"],  # mutable = should be None (left in for readability)
        gen_plot=True,
        flags=[True, True, False, True, True]  # mutable = should be None (left in for readability)
        # [SR,   VOLATILITY, Custom, Even-Plot, SPY-Plot}
):
    """ 
    This function should find the optimal allocations for a given set of stocks.

    You should (at least) optimize for at least 1 method set by the first three
    flags(boolean) set in the flags list. The order of the flags is:
        - Sharpe ratio
        - Volatility
        - Custom 	- your own method

    You can optimize accordint to all optimization methods simulatenousy
    in 1 function call - OR you can require only one can be optimized for
    each  call to optimize_portfolio - it is up to you decide on how you
    like to implement this.

    The function should accept as input a list of symbols as well as start and
    end dates and return a list of floats (as a one-dimensional numpy array)
    that represents the allocations to each of the equities. You can take
    advantage of routines developed in the optional assess portfolio project
    to compute daily portfolio value and statistics.
 
    :param sd: A datetime object that represents the start date, defaults to 1/1/2010 
    :type sd: datetime 
    :param ed: A datetime object that represents the end date, defaults to 12/31/2010
    :type ed: datetime 
    :param syms: A list of symbols that make up the portfolio (note that your code
        should support any symbol in the data directory)
    :type syms: list 
    :param gen_plot: If True, optionally create a plot named plot.png. The autograder
        will always call your code with gen_plot = False.
    :type gen_plot: bool 

    :param flags: A list of boolean that sets optimization methods and what to plot
        [<Include a Plot an Even Portfolio Allocation> <Include plotting SPY> ]
    :type flags: list of booleans

    :return: A tuple containing the portfolio allocations, cumulative return, average d
        aily returns, standard deviation of daily returns, and Sharpe ratio.
        --> ** HERE it SHOULD return the 1st selected optimization method,
            SET in the 'flag' list.
    :rtype: tuple 
    """

    # Read in adjusted closing prices for given symbols, date range 
    dates = pd.date_range(sd, ed)
    prices_all = get_data(syms, dates)  # automatically adds SPY
    prices = prices_all[syms]  # only portfolio symbols
    prices_SPY = prices_all["SPY"]  # only SPY, for comparison later
    prices = prices/prices.iloc[0,:]
    print(f"***Got data {prices_all.head(2)}")  # sanity check - comment when cleaning code.

    # XXX  make sure to fill forward - and backward for prices make
    # sure you define the proper commands in the proper order.

    # Next address the Objective: to find the allocations
    # for an optimal portfolio
    # Note - that the values provided here in the template ARE NOT meant to
    # be correct for a test case it just serves as a suggestion what
    # to fill in or modify.
    # For the below command/method you are free to define/modify both
    # the return, and its input parameters
    noa = len(syms)
    allocs = noa * [1.0 / noa, ]
    allocsEV = [0.25, 0.25, 0.25, 0.25]
    bnds = tuple((0, 1) for x in range(noa))
    cons = ({'type': 'eq', 'fun': lambda x: np.sum(x) - 1})
    results = spo.minimize(run_assess_portfolio, allocs, args=(prices,), method='SLSQP', bounds=bnds, constraints=cons)
    cr, adr, sddr, sr, port_val = assess_portfolio(prices, results.x)
    cr2, adr2, sddr2, sr2, port_val2 = assess_portfolio(prices, allocsEV)
    allocsVOL = find_optimal_allocations(prices)
    cr3, adr3, sddr3, sr3, port_val3 = assess_portfolio(prices, allocsVOL)
    allocs = results.x
    print(f"***Optimal allocation: {allocs}")

    if gen_plot:
        # add code to plot here
        df_temp = pd.concat([port_val, prices_SPY, port_val2, port_val3], keys=['Portfolio', 'SPY', 'EV', 'VOL'], axis=1)
        df_temp = df_temp / df_temp.iloc[0, :]
        ax = df_temp.plot(title='Daily Portfolio Value and SPY')
        ax.set_ylabel('Normalized Prices')
        ax.set_xlabel('Dates')
        plt.show()
        pass

    return allocs, cr, adr, sddr, sr


def test_code(args=None):
    start_date  = str2dt(args.start_date)
    end_date    = str2dt(args.end_date)
    symbols     = args.symbols
    gen_plot    = args.gen_plot

    # Optimize & Assess the portfolio
    flags = [True, True, True, False]
    allocations, cum_ret, avg_daily_ret, std_daily_ret, sharpe_ratio = \
        optimize_portfolio(
            sd=start_date,
            ed=end_date,
            syms=symbols,
            gen_plot=True,
            flags = flags
    )

    # Print statistics 
    # some formatting - ideas?
    # format each item in a list
    format_list = " ".join(f" {x:8s} " for x in symbols)
    sym_list = "\t[ " + format_list + " ]"
    print(f"{sym_list}")

    format_list = " ".join(f" {x:08f} " for x in allocations)
    init_string = "\t[ " + format_list + " ]  Allocation Vol"
    print(f"{init_string}")

    print()
    # Is there a better way of doing multi-tabs? fill formatting should be better
    tabs = '\t' * 6
    print(f"Allocations: {tabs}{allocations}")
    print(f"Start Date:  {tabs}{start_date}")
    print(f"End Date:    {tabs}{end_date}")
    print(f"Symbols:     {tabs}{symbols}")
    print(f"Sharpe Ratio:{tabs}{sharpe_ratio}")

    print(f"Volatility (stdev(daily returns)):\t{std_daily_ret}")
    print(f"Average Daily Return:\t\t\t\t{avg_daily_ret}")
    print(f"Cumulative Return:\t\t\t\t\t{cum_ret}")


if __name__ == "__main__":
    # This code WILL NOT be called by the auto grader 
    # Do not assume that it will be called 

    # initialize input parameters
    gen_plot    = True
    start_value = 1000000
    start_date  = '2021-01-01'
    end_date    = '2021-06-30'
    symbols     = ['GOOG', 'GLD', 'AAPL', 'XOM']
    #symbols     = ['IBM', 'X', 'GLD', 'JPM']

    # get command line argumens 

    # instatiate/set the command lineparser -
    parser = argparse.ArgumentParser(
        prog='optimization',
        add_help=True,
        description='Short Sample'
    )

    # symbols: a list - nargs = '*' do denote the list feature
    # XXX you can  add some of your own, e.g., a 'verbose' flag.

    parser.add_argument('-p', action="store_false",
                        dest="gen_plot",
                        default=True)
    parser.add_argument('-c', action="store",
                        type=float,
                        dest="start_value",
                        default=start_value)
    parser.add_argument('-x', action="store",
                        nargs='*',
                        dest="symbols",
                        default=symbols)
    parser.add_argument('-b', action="store",
                        dest="start_date",
                        default=start_date)
    parser.add_argument('-e', action="store",
                        dest="end_date",
                        default=end_date)

    # set the remaining  command line args - see commented out
    # print statements below.
    args = parser.parse_args()

    print(f"-p \t{args.gen_plot} (plotting)")
    print(f"-c \t{args.start_value} (start_value)")
    print(f"-b \t{args.start_date} (start_date)")
    print(f"-e \t{args.end_date} (end_date)")
    print(f"-x \t{args.symbols}")

    test_code(args)
