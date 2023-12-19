/*
 * Stat.java
 * Author:  Jonathan Anderson
 * Submission Date:  11/6/2021
 *
 * Purpose: Performs several methods of Statistical analysis on a user given data set.
 * Program can find the max, min, mode, and average of data set. Can also tell if two data sets are equal, where
 * equal means that each element in the data set appears in the same order.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.
 */
public class Stat {
    private double[] data;

    //no args constructor is a data set of 0
    public Stat(){
        data = new double[1];
        data[0] = 0;
    }

    public Stat(double[] d){
        this.data = d;
    }

    public double[] getData(){
        double[] rtn = new double[data.length];
        //adds each data value into the return array
        for(int i = 0; i < data.length; i++){
            rtn[i] = data[i];
        }

        return rtn;
    }

    //sets data equal to data parameter
    public void setData(double[] d){
        this.data = d;
    }

    //determines if two stats are equal
    public boolean equals(Stat s){
        double[] sData = s.getData();
        boolean rtn = false;

        //makes sure the data sets are the same length
        if(sData.length == data.length){
            for(int i = 0; i < data.length; i++){
                //while looping through data sets, if two different values are at the same index, return false
                if(data[i] != sData[i]){
                    return rtn;
                }
            }
            //all data points were equal, so rtn is set to true
            rtn = true;
        }
        //returns false by default
        return rtn;
    }

    //returns a formatted String of all the datapoints in data
    public String toString(){
        String rtn = "[";

        for(int i = 0; i < data.length; i++){
            if(i < data.length - 1){
                rtn += data[i] + ", ";
            }
            else{
                rtn += data[i] + "]";
            }
        }

        return rtn;
    }

    //returns the minimum value in the data set
    public double min(){
        double min = data[0];

        //loops through array
        for(int i = 1; i < data.length; i++){
            //if the current data point is less than the current min, that datapoint becomes the new min
            if(data[i] < min){
                min = data[i];
            }
        }

        return min;
    }

    //returns the maximum value in the data set
    public double max(){
        double max = data[0];

        //loops through array
        for(int i = 1; i < data.length; i++){
            //if current data point is greater than current min, that datapoint becomes new maximum
            if(data[i] > max){
                max = data[i];
            }
        }

        return max;
    }

    //returns the average value of the datapoints
    public double average(){
        double sum = data[0];

        //calculates the sum of all data points in the set
        for(int i = 1; i < data.length; i++){
            sum += data[i];
        }

        //returns the sum divided by the number of values, which equals the average
        return sum / data.length;
    }

    public double mode(){
        int[] frequency = new int[data.length];
        double[] discard = new double[data.length];

        //fills discard array with NaN, so that it isn't filled with 0s, which could be in the dataset
        for(int i = 0; i < data.length; i++){
            discard[i] = Double.NaN;
        }

        /**
         * Loops through the data and counts the number of times that the current element appears in data, then
         * assigns that value to the same index in frequency. Secondary appearances of the same element are recorded
         * in frequency as 0.
         */
        for(int i = 0; i < data.length; i++){
            int count = 0;
            double current = data[i];
            boolean discardContainsCurrent = false;

            //checking to see if discard array contains current element
            for(int j = 0; j < data.length; j++){
                if(discard[j] == current){
                    discardContainsCurrent = true;
                }
            }

            //counts the number of times nondiscarded elements appear in data; if an element is discarded, count stays at 0
            for(int j = 0; j < data.length; j++){
                if(data[j] == current && !discardContainsCurrent){
                    count++;
                }
            }

            frequency[i] = count;
            discard[i] = current;
        }

        //finds the highest value count in frequency
        int max = frequency[0];
        int maxIndex = 0;
        for(int i = 1; i < frequency.length; i++){
            if(frequency[i] > max){
                max = frequency[i];
                maxIndex = i;
            }
        }

        //checks to see if max value appears multiple times in frequency; if so, return NaN
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] == max && i != maxIndex){
                return Double.NaN;
            }
        }

        return data[maxIndex];
    }
}
