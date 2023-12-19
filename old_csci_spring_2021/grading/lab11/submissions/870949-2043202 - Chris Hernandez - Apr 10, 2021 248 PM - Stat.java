/*
 * [Stat].java
 * Author:  [Chris Hernandez] 
 * Submission Date:  [4/8/2021]
 *
 * Purpose: This program stores an array of double values called data. It computes the 
 * min, max, mode, and average of the data and contains methods under certain instances
 * of the class.
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
	
	private double [] data;
	
	// Default constructor of Stat. Creates double array having a single element of 0.0
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
	
	// Constructs Stat object using values in d.
	public Stat(double [] d) {
		// Creates double array of same length as d.
		data = new double[d.length];
		for (int i = 0; i < data.length; i++) {
			// Creates a reference to the new array assigned to data.
			data[i] = d[i];
		}
	}
	
	// Getter method to retrieve values of data.
	public double [] getData() {
		// Creates new array containing values contained in data.
		double newArray[] = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		// Returns reference to new array.
		return newArray;
	}
	
	// Setter method to set values of new data array.
	public void setData(double [] d) {
		// Creates new array containing same elements. 
		data = new double[d.length];
		for (int i = 0; i < data.length; i++) {
		// Assigns data a reference in new array.
			data[i] = d[i];
		}
	}
	
	// Checks if values are the same values/order
	public boolean equals(Stat s) {
		// Checks length of both data
		if (s.data.length != data.length) {
			return false;
		}
		// Checks if values are equal
		for(int i = 0; i < data.length; i++) {
			if (s.data[i] != data[i]) {
				return false;
			}
		}
		return true;
	}
	// Returns string of data elements with specific formatting
	public String toString() {
		String s = "[";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1) {
				s += data[i];
			}
			else {
				s += data[i] + ", ";
			}
		}
		return s + "]";
	}
	
	// Returns minimum of data array.
	public double min() {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}
	
	// Returns maximum of data array.
	public double max() {
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}
	
	// Returns average of the data array
	public double average() {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum/data.length;
	}
	
	// Returns mode of the data array (value that occurs most frequently).
	public double mode() {
		double value = data[0];
		int maxCount = 1;
		// Looks for mode value by seeing which occurs the most.
		for(int i = 0; i < data.length; i++) {
			int count = 0;
			for (int j = 0; j < data.length; j++) {
				if(data[i] == data[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				value = data[i];
			}
		}
		// Checks if the value is uniquely one or not
		for(int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				continue;
			}
			int count = 0;
			for(int j = 0; j < data.length; j++) {
				if(data[i] == data[j]) {
					count++;
				}
			}
			// If no unique value exists, returns Double.NaN
			if(count == maxCount)
				return Double.NaN;
		}
		return value;
	}
}


