/*
 * [Stat].java
 * Author:  [Chris Hernandez] 
 * Submission Date:  [4/8/2021]
 *
 * Purpose: This program stores an array of double values called data. It computes the 
 * min, max, mode, and average of the data and contains methods under certain instances
 * of the class. Lab 12 adds more methods to use arrays of int, long, and float. Adds a
 * way to handle null parameters and append methods.
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
		data = new double[0];
	}
	
	// Constructs Stat object using double values in d.
	public Stat(double [] d) {
		// New lab parameter
		if (d == null) {
			data = null;
		}
		else {
			// Creates double array of same length as d.
			data = new double[d.length];
			for (int i = 0; i < data.length; i++) {
				// Creates a reference to the new array assigned to data.
				data[i] = d[i];
			}
		}
	}
	
	// Constructs Stat object using float values in f.
	public Stat(float [] f) {
		// New lab parameter
		if (f == null) {
			data = null;
		}
		else {
			// Creates double array of same length as f
			data = new double[f.length];
			for (int i = 0; i < data.length; i++) {
				data[i] = f[i];
			}
		}
	}
	
	// Constructs Stat object using int values in i.
	public Stat(int [] i) {
		// New lab parameter
		if (i == null) {
			data = null;
		}
		else {
			// Creates double array of same length i
			data = new double[i.length];
			for (int j = 0; j < data.length; j++) {
				data[j] = i[j];
			}
		}
	}
	
	// Constructs Stat object using long values in lo
	public Stat(long [] lo) {
		// New lab parameter
		if (lo == null) {
			data = null;
		}
		else {
			// Creates double array of same length lo
			data = new double[lo.length];
			for (int i = 0; i < data.length; i++) {
				data[i] = lo[i];
			}
		}
	}
	
	// Setter method to set float values of new data array
	public void setData(float [] f) {
		// New lab parameter
		if (f == null) {
			data = null;
		}
		else {
			// Creates new array containing same elements.
			data = new double[f.length];
			for (int i = 0; i < data.length; i++) {
				// Assigns data a reference in new array.
				data[i] = f[i];
			}
		}
	}
	
	// Setter method to set double values of new data array.
	public void setData(double [] d) {
		// New lab parameter
		if (d == null) {
			data = null;
		}
		else {
			// Creates new array containing same elements. 
			data = new double[d.length];
			for (int i = 0; i < data.length; i++) {
				// Assigns data a reference in new array.
				data[i] = d[i];
			}
		}
	}
	// Setter method to set int values of new data array	
	public void setData(int [] i) {
		// New lab parameter
		if (i == null) {
			data = null;
		}
		else {
			// Creates new array containing same elements.
			data = new double[i.length];
			for (int j = 0; j < data.length; j++) {
				// Assigns data a reference in a new array.
				data[j] = i[j];
			}
		}
	}
	// Setter method to set int values of new data array
	public void setData(long [] lo) {
		// New lab parameter
		if (lo == null) {
			data = null;
		}
		else {
			// Creates new array containing same elements
			data = new double[lo.length];
			for (int i = 0; i < data.length; i++) {
				// Assigns data a reference in new array
				data[i] = lo[i];
			}
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
	
	// Checks if values are the same values/order
	public boolean equals(Stat s) {
		// New lab parameter
	    if(s == null) {
	        return false;	    	
	    }
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
	
	// Clears the data array
	public void reset() {
		// Creates a new array 
		double newArray[] = new double[0];
		// Data is reassigned
		data = newArray;
	}
	
	// Method that creates a new double array containing int data
	public void append(int [] i) {
		// New lab parameter
		if (i == null) {
			return;
		}
		// New array containing elements 
		double newArray[] = new double[data.length + i.length];
		for (int j = 0; j < data.length; j++) {
			newArray[j] = data[j];
		}
		for (int j = 0; j < i.length; j++) {
			newArray[data.length + j] = i[j];
		}
		// Reassigns reference to new array
		data = newArray;
	}
	
	// Method that creates a new double array containing float data
	public void append(float[] f) {
		// New lab parameter
		if (f == null) {
			return;
		}
		// New array containing elements
		double newArray[] = new double[data.length + f.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		for (int i = 0; i < f.length; i++) {
			newArray[data.length + i] = f[i];
		}
		// Reassigns reference to new array
		data = newArray;
	}
	
	// Method that creates a new double array containing long data
	public void append(long[] lo) {
		// New lab parameter
		if (lo == null) {
			return;
		}
		// New array containing elements
		double newArray[] = new double[data.length + lo.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		for (int i = 0; i < lo.length; i++) {
			newArray[data.length + i] = lo[i];
		}
		// Reassigns reference to new array
		data = newArray;
	}
	
	public void append(double[] d) {
		// New lab parameter
		if (d == null) {
			return;
		}
		// New array containing elements
		double newArray[] = new double[data.length + d.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		for (int i = 0; i < d.length; i++) {
			newArray[data.length + i] = d[i];
		}
		// Reassigns reference to new array
		data = newArray;
	}
	
	// Checks if data is null or empty
	public boolean isEmpty() {
		// New lab parameter
		if(data == null) {
			return true;
		}
		if(data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Returns string of data elements with specific formatting
	public String toString() {
		// New lab parameter
		if (isEmpty() == true) {
			return "[]";
		}
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
		// New lab parameter
		if (isEmpty() == true) {
			return Double.NaN;
		}
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
		// New lab parameter
		if (isEmpty() == true) {
			return Double.NaN;
		}
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
		// New lab parameter
		if (isEmpty() == true) {
			return Double.NaN;
		}
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum/data.length;
	}
	
	// Returns mode of the data array (value that occurs most frequently).
	public double mode() {
		// New lab parameter
		if (isEmpty() == true) {
			return Double.NaN;
		}
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
	// Returns the number of times the value occurs in the data array. (Optional Implementation to mode() method)
	private int occursNumberOfTimes(double value) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if(data[i] == value) {
				count++;
			}
		}
		return count;
	}
	
	// Returns the variance of data in the data array
	public double variance() {
		// New lab parameter
		if (isEmpty() == true) {
			return Double.NaN;
		}
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + (data[i] - average()) * (data[i] - average());
		}
		// Returns variance
		return sum/data.length;
	}
	
	// Calculates and returns standard deviation
	public double standardDeviation() {
		// New lab parameter
		if (isEmpty() == true) {
			return Double.NaN;
		}
		// Standard Deviation calculation
		return Math.sqrt(variance());
	}
}



