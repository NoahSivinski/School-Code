""""""
"""
Template for implementing QLearner  

(c) 2022 Tucker Balch

Copyright 2022, Georgia Institute of Technology (Georgia Tech)
Atlanta, Georgia 30332
All Rights Reserved

Copyright 2022, The University of Georgia

-----do not edit anything above this line---

"""

import random as rand

import numpy as np


class QLearner(object):
    """
    This is a Q learner object.

    :param num_states: The number of states to consider.
    :type num_states: int
    :param num_actions: The number of actions available..
    :type num_actions: int
    :param alpha: The learning rate used in the update rule. Should range between 0.0 and 1.0 with 0.2 as a typical value.
    :type alpha: float
    :param gamma: The discount rate used in the update rule. Should range between 0.0 and 1.0 with 0.9 as a typical value.
    :type gamma: float
    :param rar: Random action rate: the probability of selecting a random action at each step. Should range between 0.0 (no random actions) to 1.0 (always random action) with 0.5 as a typical value.
    :type rar: float
    :param radr: Random action decay rate, after each update, rar = rar * radr. Ranges between 0.0 (immediate decay to 0) and 1.0 (no decay). Typically 0.99.
    :type radr: float
    :param dyna: The number of dyna updates for each regular update. When Dyna is used, 200 is a typical value.
    :type dyna: int
    :param verbose: If “verbose” is True, your code can print out information for debugging.
    :type verbose: bool
    """
    def __init__(
        self,
        num_states=100,
        num_actions=4,
        alpha=0.2,
        gamma=0.9,
        rar=0.5,
        radr=0.99,
        dyna=0,
        verbose=False,
    ):
        """
        Constructor method
        """
        self.verbose = verbose
        self.num_actions = num_actions
        self.s = 0
        self.a = 0
        self.num_states = num_states
        self.alpha = alpha
        self.gamma = gamma
        self.rar = rar
        self.radr = radr
        self.dyna = dyna

        # initial setting of the Q table
        self.Q = np.random.uniform(low=-1.0, high=1.0, size=(num_states, num_actions))


    def querysetstate(self, s):
        """
        Update the state without updating the Q-table

        :param s: The new state
        :type s: int
        :return: The selected action
        :rtype: int
        """
        self.s = s
        action = rand.randint(0, self.num_actions - 1)
        if rand.random() > self.rar:
            action = np.argmax(self.Q[s, ])
        if self.verbose:
            print(f"s = {s}, a = {action}")
        return action

    def query(self, s_prime, r):
        """
        Update the Q table and return an action

        :param s_prime: The new state
        :type s_prime: int
        :param r: The immediate reward
        :type r: float
        :return: The selected action
        :rtype: int
        """
        self.Q[self.s, self.a] = (1 - self.alpha) * self.Q[self.s, self.a] + self.alpha * (r + self.gamma * np.max(self.Q[s_prime, ]))
        if rand.random() <= self.rar:
            action = rand.randint(0, self.num_actions - 1)
        else:
            action = np.argmax(self.Q[s_prime, ])

        # factor in the discount rate
        self.rar = self.rar * self.radr

        """
        # checks to see if we're doing dyna.
        if self.dyna != 0:
            # increment TCount according to the lectures
            self.TCount[self.s, self.a, s_prime] = self.TCount[self.s, self.a, s_prime] + 1
            # Update T using the formula in the lectures
            self.T = self.TCount / self.TCount.sum(axis=2, keepdims=True)

            # Update R according to the lecture formula
            self.R[self.s, self.a] = (1 - self.alpha) * self.R[self.s, self.a] + (self.alpha * r)

            for i in range(0, self.dyna):
                # select a random a and s
                aSimulated = np.random.randint(low=0, high=self.num_actions)
                sSimulated = np.random.randint(low=0, high=self.num_states)
                # infer s' from T
                s_primeSimulated = np.random.multinomial(1, self.T[sSimulated, aSimulated,]).argmax()
                # compute R from s and a
                r = self.R[sSimulated, aSimulated]
                # update Q
                self.Q[sSimulated, aSimulated] = (1 - self.alpha) * self.Q[sSimulated, aSimulated] + self.alpha * (
                            r + self.gamma * np.max(self.Q[s_primeSimulated,]))
        """
        if self.verbose:
            print(f"s = {s_prime}, a = {action}, r={r}")
        return action


if __name__ == "__main__":
    print("Remember Q from Star Trek? Well, this isn't him")
