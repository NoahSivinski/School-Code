/*
 * [CSCI 1301].java
 * Author:  [Nicholas Corwin] 
 * Submission Date:  [4/16/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program modifies the stat class created in the previous lab, and expands on its functionality. This program overloads setData methods creating versions that use arrays of int, long, and float values as parameters and handles null parameters properly. 
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

        /**
         * 
         */
        public Stat() {
                super();
                data = new double[0];
        }

        /**
         * @param data
         */
        // Constructs a stat object using the values held in the parameter array 
        public Stat(double[] d) {
                super();
                this.data = new double[d.length];
                for (int i = 0; i < d.length; i++) {
                        this.data[i] = d[i];
                }
        }

        /**
         * @param data
         */
        // Constructs a stat object using the values held in the parameter array 
        public Stat(float[] f) {
                super();
                this.data = new double[f.length];
                for (int i = 0; i < f.length; i++) {
                        this.data[i] = f[i];
                }
        }

        /**
         * @param data
         */
        // Constructs a stat object using the values held in the parameter array 
        public Stat(int[] i) {
                super();
                this.data = new double[i.length];
                for (int j = 0; j < i.length; j++) {
                        this.data[j] = i[j];
                }
        }

        /**
         * @param data
         */
        // Constructs a stat object using the values held in the parameter array 
        public Stat(long[] lo) {
                super();
                this.data = new double[lo.length];
                for (int i = 0; i < lo.length; i++) {
                        this.data[i] = lo[i];
                }
        }

        /**
         * @param data
         */
        // Sets the values of the data array 
        public void setData(double[] d) {
                this.data = new double[d.length];
                for (int i = 0; i < d.length; i++) {
                        this.data[i] = d[i];
                }
        }

        /**
         * @param data
         */
        // Sets the values of the data array 
        public void setData(float[] f) {
                this.data = new double[f.length];
                for (int i = 0; i < f.length; i++) {
                        this.data[i] = f[i];
                }
        }

        /**
         * @param data
         */
        // Sets the values of the data array 
        public void setData(int[] i) {
                this.data = new double[i.length];
                for (int j = 0; j < i.length; j++) {
                        this.data[j] = i[j];
                }
        }

        /**
         * @param data
         */
        // Sets the values of the data array 
        public void setData(long[] lo) {
                this.data = new double[lo.length];
                for (int i = 0; i < lo.length; i++) {
                        this.data[i] = lo[i];
                }
        }

        /**
         * @param data
         */
        // Creates a new double array containing exactly those elements of data followed by those of the array passed as parameter.
        public void append(double[] d) {
                if (d != null) {
                        int newLength = d.length + data.length, i = 0;
                        double[] newData = new double[newLength];
                        for (i = 0; i < data.length; i++) {
                                newData[i] = data[i];
                        }
                        for (int j = 0; j < d.length; j++) {
                                newData[i++] = d[j];
                        }
                        data = newData;
                }
        }

        /**
         * @param data
         */
        // Creates a new double array containing exactly those elements of data followed by those of the array passed as parameter.
        public void append(long[] lo) {
        public void append(float[] f) {
                if (f != null) {
                        int newLength = f.length + data.length, i = 0;
                        double[] newData = new double[newLength];
                        for (i = 0; i < data.length; i++) {
                                newData[i] = data[i];
                        }
                        for (int j = 0; j < f.length; j++) {
                                newData[i++] = f[j];
                        }
                        data = newData;
                }
        }

        /**
         * @param data
         */
        // Creates a new double array containing exactly those elements of data followed by those of the array passed as parameter.
        public void append(int[] i) {
                if (i != null) {
                        int newLength = i.length + data.length, j = 0;
                        double[] newData = new double[newLength];
                        for (j = 0; j < data.length; j++) {
                                newData[j] = data[j];
                        }
                        for (int k = 0; k < i.length; k++) {
                                newData[j++] = i[k];
                        }
                        data = newData;
                }
        }

        /**
         * @param data
         */
        // Creates a new double array containing exactly those elements of data followed by those of the array passed as parameter.
        public void append(long[] lo) {

                if (lo != null) {
                        int newLength = lo.length + data.length, i = 0;
                        double[] newData = new double[newLength];
                        for (i = 0; i < data.length; i++) {
                                newData[i] = data[i];
                        }
                        for (int j = 0; j < lo.length; j++) {
                                newData[i++] = lo[j];
                        }
                        data = newData;
                }
        }

        // Creates a new array containing exactly the values contained in data and returns a reference to this new array
        public double[] getData() {

                double[] returnData = data;

                return returnData;
        }

        // Returns true if the data arrays of both objects, the calling stat object and the passed stat object s, have the same  values (and in the same order) otherwise, it returns false
        public boolean equals(Stat obj) {

                if (obj == null) {
                        return false;
                }
                if (data.length != obj.data.length)
                        return false;
                for (int i = 0; i < data.length; i++) {
                        if (data[i] != obj.data[i]) {
                                return false;
                        }
                }
                return true;
        }

        // Clears the data array 
        public void reset() {

                data = new double[0];
        }

        // Returns the boolean value true if the data object is empty otherwise false
        public boolean isEmpty() {

                if (data.length == 0)
                        return true;
                return false;

        }

        @Override
        //Returns a string representation of the data elements 
        public String toString() {

                StringBuilder str = new StringBuilder();
                str.append("[");
                for (int i = 0; i < data.length; i++) {
                        str.append(data[i]);
                        if (i != data.length - 1) {
                                str.append(", ");
                        }
                }
                str.append("]");
                return str.toString();
        }

        // Returns the minimum of the data array
        public double min() {

                if (data.length == 0)
                        return Double.NaN;
                double minNum = data[0];
                for (int i = 0; i < data.length; i++) {
                        if (minNum > data[i]) {
                                minNum = data[i];
                        }
                }
                return minNum;
        }

        // Returns max of data array 
        public double max() {

                if (data.length == 0)
                        return Double.NaN;
                double maxNum = data[0];
                for (int i = 0; i < data.length; i++) {
                        if (maxNum < data[i]) {
                                maxNum = data[i];
                        }
                }
                return maxNum;
        }

        // Returns the average or mean of values in data array 
        public double average() {

                if (data.length == 0)
                        return Double.NaN;
                double sum = 0;
                for (int i = 0; i < data.length; i++) {
                        sum += data[i];
                }
                return sum / data.length;
        }

        // Shows the value that occurs most frequently 
        public double mode() {

                int maxCount = 0, i;
                double maxValue = 0;
                boolean isNaN = true;

                for (i = 0; i < data.length; ++i) {

                        int count = occursNumberOfTimes(data[i]);
                        if (count > maxCount) {
                                maxCount = count;
                                maxValue = data[i];
                                isNaN = false;
                        } else if (count == maxCount && data[i] != maxValue) {
                                isNaN = true;
                        }
                }
                if (isNaN) {
                        return Double.NaN;
                }
                return maxValue;
        }

        // Returns the number of times the value occurs in the data array 
        private int occursNumberOfTimes(double value) {

                int count = 0;
                for (int i = 0; i < data.length; i++) {
                        if (data[i] == value)
                                count++;
                }
                return count;

        }

        // Returns the variance of the data array 
        public double variance() {

                if (data.length == 0)
                        return Double.NaN;

                double variance = 0, mean;
                mean = average();
                double sumOfDiffSquare = 0;

                for (int i = 0; i < data.length; i++) {
                        sumOfDiffSquare += (mean - data[i]) * (mean - data[i]);
                }

                variance = sumOfDiffSquare / data.length;
                return variance;
        }
        
        // Returns the square root of the variance 
        public double standardDeviation() {

                if (data.length == 0)
                        return Double.NaN;

                double stDev = 0;

                stDev = Math.sqrt(variance());
                return stDev;
        }
                
        		// Test main methods under here
                public static void main(String[] args) {
                	
        }
}