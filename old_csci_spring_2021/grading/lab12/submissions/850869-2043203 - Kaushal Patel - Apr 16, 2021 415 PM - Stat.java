/*
 * Stat.java
 * Author: Kaushalkumar A. Patel
 * Submission Date: 04-16-2021
 *
 * Purpose: A brief paragraph description of the program. What does it do?
 * The Stat class stores an array of various floating type values,.these values
 * will be called data. As indicated by the class diagram, we will need to implement 
 * public methods to compute the min, max, mode, and average of these values. 
 * We will also implement methods to "get" and “set” the values held by data, 
 * which would be in arrays. 
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
	
	// The default constructor for Stat.
	public Stat() {
		data = new double[0];
	}
		
	// Constructs a Stat object using the values held in d with double[] parameter.
	public Stat(double[] d) {
		setData(d);
	}
	
	// Constructs a Stat object using the values held in d with float[] parameter.
	public Stat(float[] f) {
		setData(f);
	}
	
	// Constructs a Stat object using the values held in d with int[] parameter.
	public Stat(int[] i) {
		setData(i);
	}
	
	// Constructs a Stat object using the values held in d with long[] parameter.
	public Stat(long[] lo) {
		setData(lo);
	}
	
	// This is a mutator (set or setter) method used to set the values of the 
	// float data array.
	public void setData(float[] f) {
		double[] newArray = new double[0];
		if (f != null) {
			newArray = new double[f.length];
				
			for (int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
		}
		data = newArray;
	}
	
	// This is a mutator (set or setter) method used to set the values of the 
	// double data array.
	public void setData(double[] d) {
		double[] newArray = new double[0];
		if (d != null) {
			newArray = new double[d.length];
				
			for (int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}
		}
		data = newArray;
	}
	
	// This is a mutator (set or setter) method used to set the values of the 
	// int data array.
	public void setData(int[] i) {
		double[] newArray = new double[0];
		if (i != null) {
			newArray = new double[i.length];
				
			for (int j = 0; j < i.length; j++) {
				newArray[j] = i[j];
			}
		}
		data = newArray;
	}
	
	// This is a mutator (set or setter) method used to set the values of the 
	// long data array.
	public void setData(long[] lo) {
		double[] newArray = new double[0];
		if (lo != null) {
			newArray = new double[lo.length];
				
			for (int i = 0; i < lo.length; i++) {
				newArray[i] = lo[i];
			}
		}
		data = newArray;
	}
	
	// This is an accessor (get or getter) method used to retrieve the values of
	// data.
	public double[] getData() {
		return data;
	}
	
	// Returns the boolean value true if the data objects of both the calling Stat
	// object and the passed Stat object s have the same values.
	public boolean equals(Stat s) {
		boolean equality = true;
		
		if (s != null && s.data.length == data.length) {
			for (int i = 0; i < s.data.length; i++) {
				if (Math.abs(s.data[i] - data[i]) > 0.001) {
					equality = false;
					break;
				}
			}
		}
		else {
			equality = false;
		}
		return equality;
	}
	
	// This clears the data array. A new empty double array is created and assigned to data.
	public void reset() {
		data = new double[0];
	}
	
	// These methods create a new double array containing exactly those 
	// elements of data followed by those of the array passed as parameter.
	public void append(int[] i) {
		if (i != null) {
			double[] newArray = new double[data.length + i.length];
			
			for (int j = 0; j < newArray.length; j++) {
				if (j < data.length)
					newArray[j] = data[j];
				else
					newArray[j] = i[j - data.length];
			}
			data = newArray;
		}
	}
	
	// These methods create a new double array containing exactly those 
	// elements of data followed by those of the array passed as parameter.
	public void append(float[] f) {
		if (f != null) {
			double[] newArray = new double[data.length + f.length];
			
			for (int j = 0; j < newArray.length; j++) {
				if (j < data.length)
					newArray[j] = data[j];
				else
					newArray[j] = f[j - data.length];
			}
			data = newArray;
		}
	}
	
	// These methods create a new double array containing exactly those 
	// elements of data followed by those of the array passed as parameter.
	public void append(long[] lo) {
		if (lo != null) {
			double[] newArray = new double[data.length + lo.length];
			
			for (int j = 0; j < newArray.length; j++) {
				if (j < data.length)
					newArray[j] = data[j];
				else
					newArray[j] = lo[j - data.length];
			}
			data = newArray;
		}
	}
	
	// These methods create a new double array containing exactly those 
	// elements of data followed by those of the array passed as parameter.
	public void append(double[] d) {
		if (d != null) {
			double[] newArray = new double[data.length + d.length];
			
			for (int j = 0; j < newArray.length; j++) {
				if (j < data.length)
					newArray[j] = data[j];
				else
					newArray[j] = d[j - data.length];
			}
			data = newArray;
		}
	}
	
	// Returns boolean data of 0.0 if empty.
	public boolean isEmpty() {
		return data.length == 0;
	}
	
	// Returns a String representation of the data elements stored in the Stat
	// object.
	public String toString() { 
		if (isEmpty()) 
			return "[]";
		String s = "[";
		for (int i = 0; i < data.length; i++) {
			s += data[i];
			if (i == data.length - 1)
				s += "]";
			else 
				s += ", ";
		}
		return s;
	}
	
	// Returns the minimum of the data array.
	public double min() { 
		if (!isEmpty()) {
			double min = data[0];
			for (int i = 0; i < data.length; i++) {
				if (min > data[i])
					min = data[i];
			}
			return min;
		}
		else
			return Double.NaN;
	}
	
	// Returns the maximum of the data array.
	public double max() { 
		if (!isEmpty()) {
			double max = data[0];
			for (int i = 0; i < data.length; i++) {
				if (max < data[i])
					max = data[i];
			}
			return max;
		}
		else 
			return Double.NaN;
	}
	
	// Returns the average of the data array.
	public double average() { 
		if (!isEmpty()) {
			double sum = 0;
			for (int i = 0; i < data.length; i++) {
				sum += data[i];
			}
			return sum / data.length;
		}
		else
			return Double.NaN;
	}
	
	// The mode is the value that occurs most frequently in a collection of values.
	public double mode() {
		if (!isEmpty()) {
			double mode = 0, iteration = 1;
			
			for (int i = 0; i < data.length; i++) {
				int temp = 0;
				for (int j = i; j < data.length; j++) {
					if (Math.abs(data[i] - data[j]) <= 0.001)
						temp++;
				}
				if (temp > iteration) {
					mode = data[i];
					iteration = temp;
				}
				else if (temp == iteration) {
					mode = Double.NaN;
				}
			}
			return mode;
		}
		else
			return Double.NaN;
	}
	
	// Returns the number of times the value occurs in the data array.
	private int occursNumberOfTimes(double d) { 
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == d)
				counter++;
		}
		return counter;
	}
	
	// Returns the variance of the data in the data array.
	public double variance() {
		if (!isEmpty()) {
			double distance = 0;
			
			for (int i = 0; i < data.length; i++)
				distance += Math.pow(data[i] - average(), 2);
			
			return distance / data.length;
		}
		else
			return Double.NaN;
	}
	
	// Returns the square root of the variance.
	public double standardDeviation() {
		return Math.sqrt(variance());
	}
}