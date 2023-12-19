"""Assess a betting strategy.
#  %s/\t//g
#  %s/ $//g
#  %s/\s\+$//

Copyright 2022, University of Georgia
Copyright 2022, Georgia Institute of Technology

Template code for CSCI x170

The University of Georgia & Georgia Institute of Technology
asserts copyright ownership of this template and all derivative
works, including solutions to the projects assigned in this course. Students
and other users of this template code are advised not to share it with others
or to make it available on publicly viewable websites including repositories
such as github and gitlab.  This copyright statement should not be removed
or edited.

We do grant permission to share solutions privately with non-students such
as potential employers. However, sharing with other current or future
students of CSCI x170 OR G-Tech's CS 7646 is prohibited and subject to being
investigated as a
UGA & GT honor code violation.

-----do not edit anything above this line---

Student Name: 	Noah Sivinski
UGA User ID: 	811729354
"""

import numpy as np
import pandas as pd
import matplotlib.pyplot as plt


def author():
    return 'ncs34188'


def gtid():
    return 811729354


def get_spin_result(win_prob):
    result = False

    if np.random.random() <= win_prob:
        result = True
    return result


def simulator_roulette(cnt_simulate, win_prob):
    """
    This function is a simulator of the double strategy (with no bankroll limit).
    Instead of stopping the game immediately after we win, we set a target of
    winning $80. In other words, once we reach our $80 goal, we stop.
    """

    winnings_all = []
    cnt = 0

    while cnt < cnt_simulate:
        winnings = 0
        winnings_trk = [winnings]

        while winnings < 80:
            tfwin = False
            bet = 1
            while not tfwin:
                # Roll the roulette
                tfwin = get_spin_result(win_prob)
                if tfwin:
                    winnings += bet
                else:
                    winnings -= bet
                    bet *= 2

                # keep track of winnings in each simulate
                winnings_trk.append(winnings)

        # keep track of all simulation
        winnings_all.append(winnings_trk)
        cnt += 1

    return winnings_all


def simulator_roulette_real(cnt_simulate, win_prob):
    """
    This function is a simulator of the double strategy (realistic)
    Now we assume a bank roll of $256, once lose all, we stop.
    note we could only bet on what we have!

    For Exp 1 and 2 persist $80 as reaching target.
    For Exp 2, $256 is the bank roll limit.
    The experimental results are used to calculate expected value.
    """
    winnings_all = []
    cnt = 0

    while cnt < cnt_simulate:
        winnings = 0
        winnings_trk = [winnings]
        totalbkroll = 256

        while (winnings < 80) and (winnings > -256):
            tfwin = False
            bet = 1
            while not tfwin:
                # Roll the roulette
                tfwin = get_spin_result(win_prob)
                if tfwin:
                    winnings += bet
                else:
                    winnings -= bet
                    bet *= 2

                    # now we have an upper bound for bet
                    if bet > (totalbkroll + winnings):
                        bet = totalbkroll + winnings

                        # keep track of winnings in each simulate
                winnings_trk.append(winnings)

                # break if we lose all 256
                if winnings <= -256:
                    break

                    # keep track of all simulation
        winnings_all.append(winnings_trk)
        cnt += 1

    return winnings_all


def my_experiments():
    bank_roll = 256
    green_slots = 2
    number_slots = 36
    p = 36 / 2
    win_prob = p / (green_slots + number_slots)
    print(win_prob)
    np.random.seed()  # do this only once

    # set random seed so we get same results
    print(get_spin_result(win_prob))

    # Experiment 1
    # Figure1
    winnings_all = simulator_roulette(10, win_prob)
    df_winnings = pd.DataFrame(winnings_all).T
    df_winnings = df_winnings.reindex(range(1000)).fillna(method='ffill')

    # plot Figure1
    ax = df_winnings.plot(title='Figure1')
    ax.axis([0, 300, -256, 100])
    ax.set_xlabel('Number of spin')
    ax.set_ylabel('Winnings')
    ax.legend(loc='lower right')
    plt.savefig('Figure1.png')
    plt.show()
    plt.close()

    # Figure2 & 3
    n = 1000
    winnings_all2 = simulator_roulette(n, win_prob)
    df_winnings2 = pd.DataFrame(winnings_all2).T
    df_winnings2 = df_winnings2.reindex(range(1000)).fillna(method='ffill')

    # calc mean & std!
    mu = df_winnings2.mean(axis=1)
    med = df_winnings2.median(axis=1)
    sigma = df_winnings2.std(axis=1)
    upperbd_mu = mu + sigma
    lowerbd_mu = mu - sigma
    upperbd_med = med + sigma
    lowerbd_med = med - sigma

    # plot Figure2
    ax = mu.plot(title='Figure2', label='Mean')
    upperbd_mu.plot(label='Mean+Std', ax=ax)
    lowerbd_mu.plot(label='Mean-Std', ax=ax)
    ax.axis([0, 300, -256, 100])
    ax.set_xlabel('Number of spin')
    ax.set_ylabel('Winnings')
    ax.legend(loc='lower right')
    plt.savefig('Figure2.png')
    plt.show()
    plt.close()

    # plot Figure3
    ax = med.plot(title='Figure3', label='Median')
    upperbd_med.plot(label='Median+Std', ax=ax)
    lowerbd_med.plot(label='Median-Std', ax=ax)
    ax.axis([0, 300, -256, 100])
    ax.set_xlabel('Number of spin')
    ax.set_ylabel('Winnings')
    ax.legend(loc='lower right')
    plt.savefig('Figure3.png')
    plt.show()
    plt.close()

    # P(Win $80 within 1000 sequential bets)
    prob1 = (df_winnings2.iloc[-1, :] == 80).sum() / float(n)
    print
    'Empirically, the probability of winning 80 within 1000 sequential bets is:', prob1
    # Expected value of our winnings after 1000 sequential bets
    expval1 = (df_winnings2.iloc[-1, :]).sum() / float(n)
    print
    'Empirically, the estimated expected value of our winnings after 1000 sequential bets is:', expval1

    # Experiment 2
    # Figure4 & 5
    winnings_all3 = simulator_roulette_real(n, win_prob)
    df_winnings3 = pd.DataFrame(winnings_all3).T
    df_winnings3 = df_winnings3.reindex(range(1000)).fillna(method='ffill')

    # calc mean & std
    mu = df_winnings3.mean(axis=1)
    med = df_winnings3.median(axis=1)
    sigma = df_winnings3.std(axis=1)
    upperbd_mu = mu + sigma
    lowerbd_mu = mu - sigma
    upperbd_med = med + sigma
    lowerbd_med = med - sigma

    # plot Figure4
    ax = mu.plot(title='Figure4', label='Mean')
    upperbd_mu.plot(label='Mean+Std', ax=ax)
    lowerbd_mu.plot(label='Mean-Std', ax=ax)
    ax.axis([0, 300, -256, 100])
    ax.set_xlabel('Number of spin')
    ax.set_ylabel('Winnings')
    ax.legend(loc='lower right')
    plt.savefig('Figure4.png')
    plt.show()
    plt.close()

    # plot Figure5
    ax = med.plot(title='Figure5', label='Median')
    upperbd_med.plot(label='Median+Std', ax=ax)
    lowerbd_med.plot(label='Median-Std', ax=ax)
    ax.axis([0, 300, -256, 100])
    ax.set_xlabel('Number of spin')
    ax.set_ylabel('Winnings')
    ax.legend(loc='lower right')
    plt.savefig('Figure5.png')
    plt.show()
    plt.close()

    # Realistic: P(Win $80 within 1000 sequential bets)
    prob2 = (df_winnings3.iloc[-1, :] == 80).sum() / float(n)
    print
    'Q4: Empirically, the probability of winning 80 within 1000 sequential bets is:', prob2
    # Realistic: Expected value of our winnings after 1000 sequential bets
    expval2 = (df_winnings3.iloc[-1, :]).sum() / float(n)
    print
    'Q5: Empirically, the estimated expected value of our winnings after 1000 sequential bets is:', expval2
    # Realistic: explore the trend of std.
    print
    'Q6: The standard deviation reaches a maximum value:', max(sigma), 'then stabilize as number of bets increase.'


# 0.4737
# np.nan_to_num(arr, nan=80)
def test_code():


    bank_roll = 256
    green_slots = 2
    number_slots = 36
    p = 36 / 2
    win_prob = p / (green_slots + number_slots)
    print(win_prob)
    np.random.seed()  # do this only once

    print(get_spin_result(win_prob))  # test the roulette spin

if __name__ == "__main__":
    test_code()
    my_experiments()
