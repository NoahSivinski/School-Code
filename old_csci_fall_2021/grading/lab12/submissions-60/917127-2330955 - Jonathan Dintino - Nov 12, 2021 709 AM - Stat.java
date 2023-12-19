/*
 * Stat.java
 * Author: Jonathan Dintino
 * Submission Date: 12 November 2021
 *
 * Purpose: This program will create a class called 'Stat' that will
 * be used to store an array of double values called 'data'. There
 * are various methods you can perform on these Stat instances that
 * will read and write to the data field.
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
	
	private double[] data; // store data array values
	
	/*
	 * Stat - construct a new stat object with a default data array
	 */
	public Stat() {
		data = new double[0];
	}
	
	/*
	 * Stat - construct a new double stat object given a data array
	 */
	public Stat(double[] d) {
		data = new double[d.length];
		for (int k = 0; k < d.length; k++) {
			data[k] = d[k];
		}
	}
	
	/*
	 * Stat - construct a new float stat object given a data array
	 */
	public Stat(float[] f) {
		data = new double[f.length];
		for (int k = 0; k < f.length; k++) {
			data[k] = f[k];
		}
	}
	
	/*
	 * Stat - construct a new int stat object given a data array
	 */
	public Stat(int[] i) {
		data = new double[i.length];
		for (int k = 0; k < i.length; k++) {
			data[k] = i[k];
		}
	}
	
	/*
	 * Stat - construct a new long stat object given a data array
	 */
	public Stat(long[] lo) {
		data = new double[lo.length];
		for (int k = 0; k < lo.length; k++) {
			data[k] = lo[k];
		}
	}
	
	/*
	 * getData - retrieve the values of data
	 */
	public double[] getData() {
		double[] newData = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		return newData;
	}
	
	/*
	 * setData - set data to a new array 'd' (float)
	 */
	public void setData(float[] f) {
		if (f == null) {
			data = new double[0];
		} else {
			double[] newData = new double[f.length];
			for (int k = 0; k < f.length; k++) {
				newData[k] = f[k];
			}
			data = newData;
		}
	}
	
	/*
	 * setData - set data to a new array 'd' (double)
	 */
	public void setData(double[] d) {
		if (d == null) {
			data = new double[0];
		} else {
			double[] newData = new double[d.length];
			for (int k = 0; k < d.length; k++) {
				newData[k] = d[k];
			}
			data = newData;
		}
	}
	
	/*
	 * setData - set data to a new array 'd' (int)
	 */
	public void setData(int[] i) {
		if (i == null) {
			data = new double[0];
		} else {
			double[] newData = new double[i.length];
			for (int k = 0; k < i.length; k++) {
				newData[k] = i[k];
			}
			data = newData;
		}
	}
	
	/*
	 * setData - set data to a new array 'd' (long)
	 */
	public void setData(long[] lo) {
		if (lo == null) {
			data = new double[0];
		} else {
			double[] newData = new double[lo.length];
			for (int k = 0; k < lo.length; k++) {
				newData[k] = lo[k];
			}
			data = newData;
		}
	}
	
	/*
	 * equals - returns if the calling stat object and stat 's' have
	 * 			the same data values in the same order
	 */
	public boolean equals(Stat s) {
		if (s == null) return false;
		if (data.length != s.data.length) {
			return false;
		}
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] != s.data[i]) return false;
		}
		
		return true;
	}
	
	/*
	 * reset - clears the data array
	 */
	public void reset() {
		data = new double[0];
	}
	
	/*
	 * append - appends more entries to the data array (int)
	 */
	public void append(int[] i) {
		if (i == null) return;
		double[] newData = new double[data.length + i.length];
		for (int k = 0; k < data.length; k++) {
			newData[k] = data[k];
		}
		for (int k = 0; k < i.length; k++) {
			newData[data.length + k] = i[k];
		}
		data = newData;
	}
	
	/*
	 * append - appends more entries to the data array (float)
	 */
	public void append(float[] f) {
		if (f == null) return;
		double[] newData = new double[data.length + f.length];
		for (int k = 0; k < data.length; k++) {
			newData[k] = data[k];
		}
		for (int k = 0; k < f.length; k++) {
			newData[data.length + k] = f[k];
		}
		data = newData;
	}
	
	/*
	 * append - appends more entries to the data array (long)
	 */
	public void append(long[] lo) {
		if (lo == null) return;
		double[] newData = new double[data.length + lo.length];
		for (int k = 0; k < data.length; k++) {
			newData[k] = data[k];
		}
		for (int k = 0; k < lo.length; k++) {
			newData[data.length + k] = lo[k];
		}
		data = newData;
	}
	
	/*
	 * append - appends more entries to the data array (double)
	 */
	public void append(double[] d) {
		if (d == null) return;
		double[] newData = new double[data.length + d.length];
		for (int k = 0; k < data.length; k++) {
			newData[k] = data[k];
		}
		for (int k = 0; k < d.length; k++) {
			newData[data.length + k] = d[k];
		}
		data = newData;
	}
	
	/*
	 * isEmpty - returns true if the data array has a length of zero
	 */
	public boolean isEmpty() {
		return data.length == 0;
	}
	
	/*
	 * toString - return a string representation of the data values
	 */
	public String toString() {
		String temp = "[";
		for (int i = 0; i < data.length; i++) {
			temp += data[i];
			if (i != data.length - 1) {
				temp += ", ";
			}
		}
		temp += ']';
		return temp;
	}
	
	/*
	 * min - returns the minimum value in the data array
	 */
	public double min() {
		if (isEmpty()) return Double.NaN;
		double m = data[0];
		for (int i = 0; i < data.length; i++) {
			m = (data[i] < m) ? data[i] : m;
		}
		return m;
	}
	
	/*
	 * max - returns the maximum value in the data array
	 */
	public double max() {
		if (isEmpty()) return Double.NaN;
		double m = data[0];
		for (int i = 0; i < data.length; i++) {
			m = (data[i] > m) ? data[i] : m;
		}
		return m;
	}
	
	/*
	 * average - returns the average values of the data array values
	 */
	public double average() {
		if (isEmpty()) return Double.NaN;
		double sum = 0;
		for (double value : data) {
			sum += value;
		}
		return sum / data.length;
	}
	
	/*
	 * mode - returns the unique value that occurs the most in the data
	 * 		  array. If there is no unique value returns NaN
	 */
	public double mode() {
		if (isEmpty()) return Double.NaN;
		int length = data.length;
		double[] values = new double[length]; // store the actual data values
		int[] frequency = new int[length]; // store the frequency of the data values
		int index = 0; // a counter value to keep track of our position in the value/frequency arrays
		
		boolean hasValue = false; // a reusable variable to indicate if a value is an element of an array
		int valueAt = 0; // indicates at what index an element is in an array
		
		double number = Double.NaN; // the number that uniquely occurs the most
		int max = 0; // the highest frequency value
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (values[j] == data[i]) {
					hasValue = true;
					valueAt = j;
				}
			}
			if (!hasValue) {
				values[index] = data[i];
				frequency[index] = 1;
				index++;
			} else {
				frequency[valueAt]++;
			}
			
			hasValue = false;
		}
		
		for (int i = 0; i < length; i++) {
			if (frequency[i] > max) {
				number = values[i];
				max = frequency[i];
			} else if (frequency[i] == max) {
				number = Double.NaN;
			}
		}
		
		return number;
	}
	
	/*
	 * occursNumberOfTimes - private helper method to return number of times 'value' occurs in the data array
	 */
	private int occursNumberOfTimes(double value) {
		int count = 0;
		for (int k = 0; k < data.length; k++) {
			if (data[k] == value) count++;
		}
		return count;
	}
	
	/*
	 * variance - returns the variance of the data array
	 */
	public double variance() {
		if (isEmpty()) return Double.NaN;
		double sum = 0;
		double mean = average();
		for (int k = 0; k < data.length; k++) {
			sum += Math.pow(data[k] - mean, 2);
		}
		return sum / data.length;
	}
	
	/*
	 * standardDeviation - returns the square root of the variance for the data array
	 */
	public double standardDeviation() {
		if (isEmpty()) return Double.NaN;
		return Math.sqrt(variance());
	}

}
