/*
 * Stat.java
 * Author: Ofuan Oyakhire
 * Submission Date: 04/16/21
 *
 * Purpose: alter and find information of a double array
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

    //  Instance variable
    private double[] data;

    // Default Constructor
    public Stat() {
        data = createNewDoubleArray(null);
    }

    // Constructor that takes in a array with type double
    public Stat(double[] d) {
        data = createNewDoubleArray(d);
        for (int i = 0; i < data.length; i++) {
            data[i] = d[i];
        }
    }

    // Constructor that takes in a array with type float
    public Stat(float[] f) {
        if (isNull(f)) {
            data = createNewDoubleArray(null);
        } else {
            data = new double[f.length];
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = f[i];
        }
    }

    // Constructor that takes in a array with type int
    public Stat(int[] i) {
        if (isNull(i)) {
            data = createNewDoubleArray(null);
        } else {
            data = new double[i.length];
        }
        for (int j = 0; j < data.length; j++) {
            data[j] = i[j];
        }
    }

    // Constructor that takes in a array with type long
    public Stat(long[] lo) {
        if (isNull(lo)) {
            data = createNewDoubleArray(null);
        } else {
            data = new double[lo.length];
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = lo[i];
        }
    }

    // Setter - set the values of the data array with the float array
    public void setData(float[] f) {
        if (isNull(f)) {
            data = createNewDoubleArray(null);
        } else {
            data = new double[f.length];
        }

        for (int j = 0; j < data.length; j++) {
            data[j] = f[j];
        }
    }

    // Setter - set the values of the data array wit the double array
    public void setData(double[] d) {

        if (isNull(d)) {
            data = createNewDoubleArray(null);
        } else {
            data = new double[d.length];
        }

        for (int i = 0; i < data.length; i++) {
            data[i] = d[i];
        }
    }

    // Setter - set the values of the data array with the int array
    public void setData(int[] i) {
        if (isNull(i)) {
            data = createNewDoubleArray(null);
        } else {
            data = new double[i.length];
        }

        for (int j = 0; j < data.length; j++) {
            data[j] = i[j];
        }
    }

    // Setter - set the values of the data array with the long array
    public void setData(long[] lo) {
        if (isNull(lo)) {
            data = createNewDoubleArray(null);
        } else {
            data = new double[lo.length];
        }

        for (int j = 0; j < data.length; j++) {
            data[j] = lo[j];
        }
    }

    // Getter - retrieve the value of data
    public double[] getData() {
        int length = data.length;
        double[] temp = new double[length];
        for (int i = 0; i < length; i++) {
            temp[i] = data[i];
        }
        return temp;
    }

    // returns true if the data object of both stat object contains the same values
    public boolean equals(Stat s) {

        if(isNull(s)){
            return false;
        }

        double[] theirArray = s.getData();
        int myLength = data.length;
        int theirLength = theirArray.length;

        if (myLength != theirLength) {
            return false;
        }

        for (int i = 0; i < myLength; i++) {
            if (!(new Double(data[i]).equals(theirArray[i]))) {
                return false;
            }
        }
        return true;
    }

    // Clear all the value in the data array
    public void reset() {
        data = createNewDoubleArray(null);
    }

    // Append the int array to the data array
    public void append(int[] i) {
        if (isNull(i)) {
            return;
        }

        int oldDataLength = data.length;
        double[] temp = createAppendedArray(i.length);

        for (int j = 0; j < i.length; j++) {
            temp[oldDataLength + j] = i[j];
        }

        data = temp;
    }

    // Append the float array to the data array
    public void append(float[] f) {
        if (isNull(f)) {
            return;
        }

        int oldDataLength = data.length;
        double[] temp = createAppendedArray(f.length);

        for (int i = 0; i < f.length; i++) {
            temp[oldDataLength + i] = f[i];
        }

        data = temp;
    }

    // Append the long array to the data array
    public void append(long[] l) {
        if (isNull(l)) {
            return;
        }

        int oldDataLength = data.length;
        double[] temp = createAppendedArray(l.length);

        for (int i = 0; i < l.length; i++) {
            temp[oldDataLength + i] = l[i];
        }

        data = temp;
    }

    // Append the double array to the data array
    public void append(double[] d) {
        if (isNull(d)) {
            return;
        }

        int oldDataLength = data.length;
        double[] temp = createAppendedArray(d.length);

        for (int i = 0; i < d.length; i++) {
            temp[oldDataLength + i] = d[i];
        }

        data = temp;
    }

    // Check if see if the data array is empty or not
    public boolean isEmpty() {
        return data.length == 0;
    }

    // Returns a String representation of the data  array
    public String toString() {
        int length = data.length;
        String sb = "";
        sb += "[";
        for (int i = 0; i < length; i++) {
            sb += data[i];
            if (i < length - 1) {
                sb += (", ");
            }
        }
        sb += "]";
        return sb;
    }

    // returns the minimum of the data array
    public double min() {

        if (isEmpty()) {
            return Double.NaN;
        }

        double min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    // returns the maximum of the data array
    public double max() {

        if (isEmpty()) {
            return Double.NaN;
        }

        double max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    // returns the average of the data array
    public double average() {

        if (isEmpty()) {
            return Double.NaN;
        }

        int length = data.length;
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += data[i];
        }
        return sum / length;
    }

    // returns the mode of the data array
    public double mode() {

        if (isEmpty()) {
            return Double.NaN;
        }

        int length = data.length;
        double mode = data[0];
        int modeCount = 0;

        for (int i = 0; i < length; i++) {
            int tempCount = 0;
            for (int j = 0; j < length; j++) {
                if (data[i] == data[j]) {
                    tempCount++;
                }
            }
            if (tempCount > modeCount) {
                modeCount = tempCount;
                mode = data[i];
            } else if (tempCount == modeCount && mode != data[i]) {
                mode = Double.NaN;
            }
        }
        if (modeCount > 1 || length == 1) {
            return mode;
        } else {
            return Double.NaN;
        }
    }

    // Returns the number of times the value occurs in the data array
    private int occursNumberOfTimes(double value) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if ((new Double(value)).equals(data[i])) {
                count++;
            }
        }

        return count;
    }

    // return the variance of the data array
    public double variance() {
        if (isEmpty()) {
            return Double.NaN;
        }

        double average = average();
        double temp = 0;
        for (int i = 0; i < data.length; i++) {
            temp += Math.pow((data[i] - average), 2);
        }

        return temp / (data.length);

    }

    // returns the standard deviation of the data array
    public double standardDeviation() {
        if (isEmpty()) {
            return Double.NaN;
        }

        return Math.sqrt(variance());
    }

    // Return a new array with the length of the one pass through the parameter
    private double[] createNewDoubleArray(double[] d) {
        if (isNull(d)) {
            return new double[0];
        }

        return new double[d.length];
    }

    // Create a new array with the data's length and provided length;
    // Will add all the value from data to the new array
    private double[] createAppendedArray(int length) {
        double[] temp = new double[data.length + length];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        return temp;
    }

    // Returns true if the object is null
    private boolean isNull(Object o) {
        return o == null;
    }





}
