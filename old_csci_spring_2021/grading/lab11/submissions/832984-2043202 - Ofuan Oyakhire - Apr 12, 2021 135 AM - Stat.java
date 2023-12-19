/*
 * Stat.java
 * Author: Ofuan Oyakhire
 * Submission Date: 04/12/21
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

    // Constructor
    public Stat() {
        data = new double[]{0.0};
    }

    // Constructor that takes in a array with type double
    public Stat(double[] d) {
        int length = d.length;
        data = new double[length];
        for (int i = 0; i < length; i++) {
            data[i] = d[i];
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

    // Setter - set the values of the data array
    public void setData(double[] d) {
        int length = d.length;
        data = new double[length];
        for (int i = 0; i < length; i++) {
            data[i] = d[i];
        }
    }

    // returns true if the data object of both stat object contains the same values
    public boolean equals(Stat s) {
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

    // Returns a String representation of the data elements stored in the Stat object
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
        int length = data.length;
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += data[i];
        }
        return sum / length;
    }

    // returns the mode
    public double mode() {
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

}
