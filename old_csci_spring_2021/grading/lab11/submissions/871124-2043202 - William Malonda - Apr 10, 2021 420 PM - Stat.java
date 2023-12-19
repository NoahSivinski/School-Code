/*
 * Stat.java
 * Author:  William Malonda 
 * Submission Date: April 10, 2021
 *
 * Purpose: The program Stat.java stores a double array of values from the main method which are 
 * used to find things such as the minimum value, maximum value, mode, and average for those values. 
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

	// Declared data as a private double array
	private double[] data;

	// Creates a double array with one element of "0.0"
	public Stat() {
		double[] statArray = new double[1];
		statArray [0] = 0.0;
	}

	// Creates a double array and copies the length and values of d and references
	// it as "array" which is then assigned to data
	public Stat(double[] d) {
		double[] array = new double[0];
		if (d != null) {
			array = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				array[i] = d[i];
			}
		}
		data = array;
	}

	// Retrieves data values by creating an array with the same values used in data
	// and references it as "array" which is then returned
	public double[] getData() {
		double[] array = new double[0];
		if (data != null) {
			array = new double[data.length];
			for (int i = 0; i < data.length; i++) {
				array[i] = data[i];
			}
		}
		return array;
	}

	// Creates a new array called "array" and copies the elements of data and
	// assigns the array to data
	public void setData(double[] d) {
		double[] array = new double[0];
		if (d != null) {
			array = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				array[i] = d[i];
			}
		}
		data = array;
	}

	// If the data of s and the called object are equal, returns true, otherwise
	// returns false
	public boolean equals(Stat s) {
		if (this.data.length == s.data.length) {
			return true;
		} else {
			return false;
		}
	}

	// Returns a string of the data elements as s
	public String toString() {
		String s = "[";
		for (int i = 0; i < data.length; i++) {
			s = s + data[i];
			if (i == data.length - 1) {
				s = s + "]";
			} else {
				s = s + ", ";
			}
		}
		return s;
	}

	// Finds the minimum value of the array and returns it
	public double min() {
		double minValue = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < minValue) {
				minValue = data[i];
			}
		}
		return minValue;
	}

	// Finds the maximum value of the array and returns it
	public double max() {
		double maxValue = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > maxValue) {
				maxValue = data[i];
			}
		}
		return maxValue;
	}

	// Finds the average value of the array and returns it
	public double average() {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		double average = sum / data.length;
		return average;
	}

	// Finds the mode of the array and returns it
	public double mode() {
		double modeCount = 0;
		double mode = 0;

		double currentCount = 0;

		if (data.length == 0) {
			for (double num : data) {
				currentCount = 0;
				for (double element : data) {
					if (num == element) {
						currentCount++;
					}
				}
				if (currentCount > modeCount) {
					modeCount = currentCount;
					mode = num;
				}
			}
			return mode;

		} else {
			return Double.NaN;
		}
	}

	// Main method for testing
	public static void main(String[] args) {
		
	}
}
