import pandas as pd

def assess_symbol( symbol ):
    data_df = pd.read_csv( f'{symbol}.csv', index_col='Date', parse_dates=True)
    data_df["--- Blank --- "] = ""

    shifted =  "Close.shift(1)"
    data_df[shifted] = data_df.Close.shift(1)

    inter_day =  "Inter Day Return"

    data_df[inter_day] = (data_df.Close / data_df[shifted] - 1)*100
    start       = '11/1/21'
    stop        = '6/1/22'
    adj_close = 'Adj Close'
    daily_average = data_df.loc[start:stop][adj_close].mean()
    print(f'\nDaily Average {daily_average}')
    inter_day_mean = data_df.loc[start:stop][inter_day].mean()
    print( f'\nInter Day Mean {inter_day_mean}' )

    data_df.to_csv("daily_return.csv", index=True)
    return data_df['Close'].max()

def test_run( symbols ):
    """ Function Called from main """
    for symbol in symbols:
        print( f'\nMax Close is:\t\t{assess_symbol(symbol) }')

if __name__ == '__main__':

    symbols = ['COIN']

    test_run(symbols)