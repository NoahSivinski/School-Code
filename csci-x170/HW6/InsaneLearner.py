import BagLearner as bl
import LinRegLearner as lr
import numpy as np

'''
import InsaneLearner as it
learner = it.InsaneLearner(verbose = False) # constructor
learner.addEvidence(Xtrain, Ytrain) # training step
Y = learner.query(Xtest) # query
'''

class InsaneLearner(object):

    def __init__(self, verbose=False, **kwargs):
        self.verbose = verbose
        self.learners = [
            bl.BagLearner(learner=lr.LinRegLearner, bags=20, kwargs=kwargs) for _ in range(20)
        ]

    def author(self):
        return 'ncs34188'

    def addEvidence(self, data_x, data_y):
        for learner in self.learners:
            learner.addEvidence(data_x, data_y)

    def query(self, points):
        predicts = [learner.query(points) for learner in self.learners]
        return np.mean(predicts, axis=0)

if __name__ == "__main__":
    print("not implemented")