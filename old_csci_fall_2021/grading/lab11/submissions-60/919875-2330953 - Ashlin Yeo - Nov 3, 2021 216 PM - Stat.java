/*
 * Stat.java
 * Author:  Ashlin Yeo
 * Submission Date:  11/3/2021
 *
 * Purpose: The stat class stores an array of double values. 
 * It contains several methods used to compare arrays, as well
 * as find minimums,maximums, and modes.
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

	//Stat() - default constructor for Stat
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}

	//Stat(double[] d) - constructs a Stat object using the values held in d
	public Stat(double[] d) {
		double[] dataCopy = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dataCopy[i] = d[i];
		}
		data = dataCopy;
	}

	//getData() - retrieves the values of data
	public double[] getData() {
		double[] dataCopy = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			dataCopy[i] = data[i];
		}
		data = dataCopy;
		return dataCopy;
	}

	//setData(double[] d) - sets the values of the data array
	public void setData(double[] d) {
		double[] dataCopy = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dataCopy[i] = d[i];
		}
		data = dataCopy;
	}

	//equals(Stat s) - returns true if the data objects of both the calling Stat object and the passed
	//stat object s have the same values and are in the same order
	public boolean equals(Stat s) {
		double[] sDataValue = s.getData();
		boolean status = true;
		for (int i = 0; i < data.length && status == true; i++) {
			if(data[i] == sDataValue[i]) {
				status = true;
			}
			else {
				status = false;
			}
		}
		return status;
	}


	//toString() - returns a String representation of the data elements stored in the Stat object
	public String toString() {
		String arrayValues = "[ ";
		for (int i = 0; i < data.length - 1; i++) {
			arrayValues += data[i] + ", ";
		}
		arrayValues += data[data.length - 1];
		arrayValues += "]";
		return arrayValues;
	}

	//min() - returns the minimum of the data array
	public double min() {
		double minimum = data[0];
		for (int i = 0; i < data.length; i++) {
			if(data[i] < minimum) {
				minimum = data[i];
			}
		}
		return minimum;
	}

	//max() - returns the maximum of the data array
	public double max() {
		double maximum = data[0];
		for (int i = 0; i < data.length; i++) {
			if(data[i] > maximum) {
				maximum = data[i];
			}
		}
		return maximum;
	}

	//average() - returns the average of the data array as a double value
	public double average() {
		double sum = 0;
		double numberOfValues = data.length;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / numberOfValues;
	}

	//mode() - returns the mode of the data array. If one value does not occur more frequently than all others,
	//returns Double.NaN
	public double mode() {
		double mode = 0;
		int maxFrequency = 0;
		for (int i = 0; i < data.length; i++) {
			int frequency = 1;
			for (int j = i + 1; j < data.length; j++) {
				if(data[i] == data[j]) {
					frequency++;
				}
				if (maxFrequency < frequency) {
					maxFrequency = frequency;
					mode = data[i];
				}
				else if(maxFrequency == frequency) {
					mode = Double.NaN;
				}
			}
		}
		return mode;
	}
}

