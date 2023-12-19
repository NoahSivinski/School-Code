/*
 * Stat.java
 * Author:  Jonathan Anderson
 * Submission Date:  11/12/2021
 *
 * Purpose: Performs several methods of Statistical analysis on a user given data set.
 *
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

    public Stat(){
        data = new double[0];
    }

    public Stat(double[] d){
       setData(d);
    }

    public Stat(int[] i){
       setData(i);
    }

    public Stat(long[] lo){
       setData(lo);
    }

    public Stat(float[] f){
        setData(f);
    }

    public double[] getData(){
        double[] rtn = new double[data.length];
        //adds each data value into the return array
        for(int i = 0; i < data.length; i++){
            rtn[i] = data[i];
        }

        return rtn;
    }

    public void setData(double[] d){
        //check to see if parameter is null
        if(d != null){
            double[] arr = new double[d.length];
            for(int i = 0; i < arr.length; i++){
                arr[i] = d[i];
            }
            data = arr;
        }
        else{
            //if parameter null set data to empty array
            data = new double[0];
        }
    }

    public void setData(int[] i){
        //check to see if parameter is null
        if(i != null) {
            double[] d = new double[i.length];
            for (int index = 0; index < d.length; index++) {
                d[index] = i[index];
            }
            data = d;
        }
        else{
            //if parameter null set data to empty array
            data = new double[0];
        }
    }

    public void setData(float[] f){
        //check to see if parameter is null
        if(f != null) {
            double[] d = new double[f.length];
            for (int i = 0; i < d.length; i++) {
                d[i] = f[i];
            }
            data = d;
        }
        else{
            //if parameter null set data to empty array
            data = new double[0];
        }
    }

    public void setData(long[] lo){
        //check to see if parameter is null
        if(lo != null) {
            double[] d = new double[lo.length];
            for (int i = 0; i < d.length; i++) {
                d[i] = (double) lo[i];
            }
            data = d;
        }
        else{
            //if parameter null set data to empty array
            data = new double[0];
        }
    }

    public void reset(){
        double[] clear = new double[0];
        data = clear;
    }

    public void append(int[] i){
        //checks to see if parameter is null
        if(i != null) {
            //creates a new array that is the length of both arrays
            int arrayLength = data.length + i.length;
            double[] appended = new double[arrayLength];

            //adds data to array first
            for (int index = 0; index < data.length; index++) {
                appended[index] = data[index];
            }
            //then adds datapoints from appended array second
            for (int index = 0; index < i.length; index++) {
                appended[data.length + index] = i[index];
            }

            data = appended;
        }
    }

    public void append(float[] f){
        if(f != null){
            int arrayLength = data.length + f.length;
            double[] appended = new double[arrayLength];

            for(int i = 0; i < data.length; i++){
                appended[i] = data[i];
            }

            for(int i = 0; i < f.length; i++){
                appended[data.length + i] = f[i];
            }

            data = appended;
        }
    }

    public void append(double[] d){
        if(d != null){
            int arrayLength = data.length + d.length;
            double[] appended = new double[arrayLength];

            for(int i = 0; i < data.length; i++){
                appended[i] = data[i];
            }
            for(int i = 0; i < d.length; i++){
                appended[data.length + i] = d[i];
            }

            data = appended;
        }
    }

    public void append(long[] lo){
        if(lo != null){
            int arrayLength = data.length + lo.length;
            double[] appended = new double[arrayLength];

            for(int i = 0; i < data.length; i++){
                appended[i] = data[i];
            }

            for(int i = 0; i < lo.length; i++){
                appended[data.length + i] = lo[i];
            }

            data = appended;
        }
    }

    //returns true if the array is empty (has length 0), false otherwise
    public boolean isEmpty(){
        return data.length == 0;
    }

    public int occursNumberOfTimes(double value){
        int count = 0;

        for(int i = 0; i < data.length; i++){
            if(data[i] == value){
                count++;
            }
        }

        return count;
    }

    public double variance(){
        if(isEmpty()){
            return Double.NaN;
        }

        double avg = average();
        double[] squaredDifferences = new double[data.length];

        //finding each data point's squared distance from the average of the data set
        for(int i = 0; i < data.length; i++){
            squaredDifferences[i] = Math.pow(Math.abs(data[i] - avg), 2);
        }

        double sum = 0;

        //finds the sum of the squared values
        for(double value : squaredDifferences){
            sum += value;
        }

        //returns the sum of squared values over the number of elements in the set, which equals variance
        return sum / data.length;
    }

    public double standardDeviation(){
        //returns Double.NaN if data is empty, otherwise returns square root of variance
        return isEmpty() ? Double.NaN : Math.sqrt(variance());
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

    //returns a formatted String of all the data points in data
    public String toString(){
        if(isEmpty()){
            return "[]";
        }

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
        if(isEmpty()){
            return Double.NaN;
        }

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
        if(isEmpty()){
            return Double.NaN;
        }

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

    //returns the average value of the data points
    public double average(){
        if(isEmpty()){
            return Double.NaN;
        }

        double sum = data[0];

        //calculates the sum of all data points in the set
        for(int i = 1; i < data.length; i++){
            sum += data[i];
        }

        //returns the sum divided by the number of values, which equals the average
        return sum / data.length;
    }

    public double mode(){
        if(isEmpty()){
            return Double.NaN;
        }

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
