/*
 * [Stat].java
 * Author:  [Hriddhiman Dey] 
 * Submission Date:  [4/16/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program is similar to the previous one. This program creates versions
 * that use arrays of int, long, and float values as parameters and 
 * handles null parameter properly. It gives the min, max, average, mode
 * variance, standard deviation, based on the main method inserted. 
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
    
    // default constructor 
    public Stat() {
        data = new double[0];
    }
    
    // constructor that takes input for double
    // if it has no values then a blank array is made
    public Stat(double[] d) {
        if (d != null) {
            data = new double[d.length];
            int index = 0;
            for (int i = 0; i < d.length; i++, index++) {
                data[index] = d[index];
            }
        } else {
            data = new double[0];
        }
    }
    
    // constructor that takes input for float
    public Stat(float[] f) {
        if (f != null) {
            data = new double[f.length];
            int index = 0;
            for (int i = 0; i < f.length; i++, index++) {
                data[index] = f[index];
            }
        } else {
            data = new double[0];
        }
    }
    
    // constructor that takes input for int
    public Stat(int[] i) {
        if (i != null) {
            data = new double[i.length];
            int index = 0;
            for (int j = 0; j < i.length; j++, index++) {
                data[index] = i[index];
            }
        } else {
            data = new double[0];
        }
    }
    
    // constructor that takes input for long
    public Stat(long[] lo) {
        if (lo != null) {
            data = new double[lo.length];
            int index = 0;
            for (int i = 0; i < lo.length; i++, index++) {
                data[index] = lo[index];
            }
        } else {
            data = new double[0];
        }
    }
    
    // this method creates a new array and sets date equal to the array
    public void setData(float[] f) {
        if (f != null) {  
            double[] dCopy = new double[f.length];
            data = new double[dCopy.length];
            int index = 0;
            for (int i = 0; i < f.length; i++, index++) { 
                dCopy[index] = f[index];
                data[index] = dCopy[index];
            }
        } else {
            data = new double[0];
        }
    }
    
    // this method creates a new array and sets date equal to the array, like above
    public void setData(double[] d) {
        if (d != null) {    
            double[] dCopy = new double[d.length];
            data = new double[dCopy.length];
            int index = 0;
            for (int i = 0; i < d.length; i++, index++) { 
                dCopy[index] = d[index];
                data[index] = dCopy[index];
            }
        } else {
            data = new double[0];
        }
    }
    
    // this method creates a new array and sets date equal to the array
    public void setData(int[] i) {
        if (i != null) {    
            double[] dCopy = new double[i.length];
            data = new double[dCopy.length];
            int index = 0;
            for (int j = 0; j < i.length; j++, index++) { 
                dCopy[index] = i[index];
                data[index] = dCopy[index];
            }
        } else {
            data = new double [0];
        }
    }
    
    // this method creates a new array and sets date equal to the array
    public void setData(long[] lo) {
        if (lo != null) {    
            double[] dCopy = new double[lo.length];
            data = new double[dCopy.length];
            int index = 0;
            for (int i = 0; i < lo.length; i++, index++) { 
                dCopy[index] = lo[index];
                data[index] = dCopy[index];
            }
        } else {
            data = new double [0];
        }
    }
    
    // this method creates a new array that is a copy of the data and returns the copy
    public double[] getData() {
        double[] dataCopy = new double[data.length];
        int index = 0;
        for (int i = 0; i < data.length; i++, index++) { // the loop goes through each value and makes a copy
            dataCopy[index] = data[index];
        }
        return dataCopy;
    }
    
    // if data from input and the data are equal then it returns true, if not, false
    public boolean equals(Stat s) {
        boolean equals = true;
        if (s == null || isEmpty()) { // if either the input or the other array are null/empty, then equals is false
            equals = false;
            return equals;
        } else {
            if (s.getData().length != data.length) { // if their lengths are not the same then it's false
                equals = false;
            } else {
                int index = 0;
                for(int i = 0; i > data.length; i++, index++) {}
                if (s.getData()[index] != data[index]) {
                    equals = false;
                }
            }
            return equals;
        }
    }
    
    // this resets data to be equal to an empty array
    public void reset() {
        data = new double[0];
    }
    
    // this method adds another array to the end of the main "data" variable
    public void append(int[] i) {
        if (i != null) {    // if there is a value then the following code runs but if not nothing happens
            double[] dCopy = new double[data.length + i.length];
            int index = 0;
            int index2 = 0;
            for (int j = 0; j < dCopy.length; j++, index++) { 
                if (j < data.length) {
                    dCopy[index] = data[index];
                } else {
                    dCopy[index] = i[index2]; // index2 starts at 0 and then goes up in values
                    index2++;
                }
            }
            
            data = dCopy;
        }
    }
    
    // this method does the same as above but for inputs of floats
    public void append(float[] f) {
        if (f != null) {    
            double[] dCopy = new double[data.length + f.length];
            int index = 0;
            int index2 = 0;
            for (int j = 0; j < dCopy.length; j++, index++) { 
                if (j < data.length) {
                    dCopy[index] = data[index];
                } else {
                    dCopy[index] = f[index2];
                    index2++;
                }
            }
            
            data = dCopy;
        }
    }
 
    public void append(long[] lo) {
        if (lo != null) {    
            double[] dCopy = new double[data.length + lo.length];
            int index = 0;
            int index2 = 0;
            for (int j = 0; j < dCopy.length; j++, index++) { 
                if (j < data.length) {
                    dCopy[index] = data[index];
                } else {
                    dCopy[index] = lo[index2];
                    index2++;
                }
            }
            
            data = dCopy;
        }
    }
    
    // this method does the same as above but for inputs of doubles
    public void append(double[] d) {
        if (d != null) {    
            double[] dCopy = new double[data.length + d.length];
            int index = 0;
            int index2 = 0;
            for (int j = 0; j < dCopy.length; j++, index++) { 
                if (j < data.length) {
                    dCopy[index] = data[index];
                } else {
                    dCopy[index] = d[index2];
                    index2++;
                }
            }
            
            data = dCopy;
        }
    }
    
    // this method returns a true boolean if the data length is 0 which means it's empty
    public boolean isEmpty() {
        if (data.length == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // this method goes through each array value with a loop
    public String toString() {
        String arrayString = "";
        int index = 0;
        arrayString = arrayString.concat("[");
        if (!isEmpty()) {
            for (int i = 0; i < data.length; i++, index++) {
            if (i == data.length - 1) {
                arrayString = arrayString.concat(data[index] + "]");
            } else if (data.length <= 1) {
                arrayString = arrayString.concat(data[index] + "]");
            } else {
                arrayString = arrayString.concat(data[index] + ", ");
            }
            
            }
        } else {
            arrayString = arrayString.concat("]");
        }
        return arrayString;
    }
    
    // this method finds the minimum by going through each value in the array (except the first one)
    public double min() {
        if(!isEmpty()) {    
            double min = 0;
            int index = 0;
            for (int i = 0; i < data.length; i++, index++) {
                if (i == 0) {
                    min = data[index];
                } else { 
                    if (data[index] <= min) {
                        min = data[index];
                    }
                }
            }
            return min;
        } else {
            return Double.NaN;
        }
    }
    
    // similar to minimum but for maximum (so a value that is greater)
    public double max() {
        if(!isEmpty()) { 
            double max = 0;
            int index = 0;
            for (int i = 0; i < data.length; i++, index++) {
                if (i == 0) {
                    max = data[index];
                } else { 
                    if (data[index] >= max) {
                        max = data[index];
                    }
                }
            }
            return max;
        } else {
            return Double.NaN;
        }
    }
    
    // this method finds the average by going through each value and adding them together
    public double average() {
        if (!isEmpty()) {
            double average = 0;
            int index = 0;
            for (int i = 0; i < data.length; i++, index++) {
                average += data[index];
                }
            average /= data.length;
            return average;
        } else {
            return Double.NaN;
        }
    }
    
    // this method finds the mode
    public double mode() {
        // variables that are used are declared
        if (!isEmpty()) {
            double mode = 0.0 / 0; // default mode is NaN meaning it doesn't have one mode
            double oneMode = 0.0;
            int index = 0;
            int secondIndex = 0;
            int count = 0;
            int modeCount = 0;
            int previousCount = 1;
            boolean hasMode = false;
            
            // there's two loops that loop through each value of the array comparing it with another
            for (int i = 0; i < data.length; i++, index++)
                
                for (int j = 0; j < data.length; j++) {
                    // if the first value being measured is the same as the second value then the following code runs
                    if (data[index] - data[secondIndex] == 0) {
                        count++; // the number of times the first number being compared matches the second one increases
                         
                        // if the number of times is greater than any previous amount then that becomes the new mode
                        if (count > previousCount) {
                            modeCount = 0;
                            oneMode = data[index];
                            modeCount++;
                            previousCount = count;
                            if (count > 1) { 
                                hasMode = true;
                            }
                        // if there's a number that occurs the same number of times, mode is increased
                        } else if (count == previousCount && oneMode != data[index]) {
                            if (count != 1) {
                                modeCount++;
                            }
                        }
                    }  
                    secondIndex++;
                    
                    // once the array has been cycled through once, the index and count are reset    
                    if (secondIndex == data.length) {
                            secondIndex = 0;
                            count = 0;
                    }
                }
            
            // if the number of modes is smaller than or equal to one and it has a mode then mode's value is changed
            if (modeCount <= 1 && hasMode) {
                mode = oneMode;
            }
            return mode;
        } else {
            return Double.NaN;
        }
    }
   
    // this method returns variance which is the differences of the values with the average/mean, squared, and summed
    public double variance() {
        if(!isEmpty()) { // if the array is not empty 
            double variance = 0;
            int index = 0;
            for (int i = 0; i < data.length; i++, index++) {
                variance += Math.pow((average() - data[index]), 2);
            }
            
            variance /= data.length;
            return variance;
        } else {
            return Double.NaN;
        }
    
    }
    
    // the standard deviation is the square root of value of variance
    public double standardDeviation() {
        if (!isEmpty()) { // if the array is not empty
            return Math.sqrt(variance());
        } else {
            return Double.NaN;
        }
    }
    public static void main(String[] args) {
    	
    	double[] data1 = {};
    	double[] data2 = { 25 };
    	float[] data3 = {};
    	float[] data4 = { 25 };
    	int[] data5 = {};
    	int[] data6 = { 50 };
    	long[] data7 = {};
    	long[] data8 = { 12 };
    	Stat stat1 = new Stat();
    	stat1.append(data1);
    	stat1.append(data2);
    	stat1.append(data3);
    	stat1.append(data4);
    	stat1.append(data5);
    	stat1.append(data6);
    	stat1.append(data7);
    	stat1.append(data8);
    	data1 = null;
    	stat1.append(data1);
    	System.out.println("stat1 data = " + stat1.toString());
    	System.out.println("stat1 min = " + stat1.min());
    	System.out.println("stat1 max = " + stat1.max());
    	System.out.println("stat1 average = " + stat1.average());
    	System.out.println("stat1 mode = " + stat1.mode());
    	System.out.println("stat1 variance = " + stat1.variance());
    	System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
    }
}