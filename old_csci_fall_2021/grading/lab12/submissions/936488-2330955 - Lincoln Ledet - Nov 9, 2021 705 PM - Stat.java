
//*******************************************************
/*
* Stat.java
* Author: Lincoln Ledet
* Submission Date:  11/9/21
* Lab 12 – More on Classes, Objects, and Methods
* 
* Purpose: This program contains a variety of methods for 
* Manipulating and calculating values in an array. Its methods include 
* a constructor and setter for any type of array, reset, isEmpty, 
* standardDeviation etc.
*
* 
* 
*  * Statement of Academic Honesty:
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
//*******************************************************
public class Stat {
	private double[] data;

	public Stat() {// constructor without array
		double[] tempData = {};
		data = tempData;
	}

	public Stat(double[] d) {// constructor with double array
		data = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}

	public Stat(int[] i) {// constructor with int array
		data = new double[i.length];
		for (int j = 0; j < i.length; j++) {
			data[j] = (double) i[j];
		}
	}

	public Stat(long[] lo) {// constructor with long array
		data = new double[lo.length];
		for (int i = 0; i < lo.length; i++) {
			data[i] = (double) lo[i];
		}
	}

	public Stat(float[] f) {// constructor with float array
		data = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			data[i] = (double) f[i];
		}
	}

	public double[] getData() {// returns new array with identical data
		double[] newArray = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}

	public void setData(double[] d) {// sets new array with identical data

		if (d == null) {// if d is null creates empty array
			double[] tempData = {};
			data = tempData;
			return;
		}
		data = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}

	public void setData(int[] i) {// sets new array with identical data
		if (i == null) {
			double[] tempData = {};
			data = tempData;
			return;
		}
		data = new double[i.length];
		for (int j = 0; j < i.length; j++) {
			data[j] = i[j];
		}
	}

	public void setData(long[] lo) {// sets new array with identical data
		if (lo == null) {
			double[] tempData = {};
			data = tempData;
			return;
		}
		data = new double[lo.length];
		for (int i = 0; i < lo.length; i++) {
			data[i] = lo[i];
		}
	}

	public void setData(float[] f) {// sets new array with identical data
		if (f == null) {
			double[] tempData = {};
			data = tempData;
			return;
		}
		data = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			data[i] = f[i];
		}
	}

	public boolean equals(Stat s) {// checks to see if arrays are equal
		if (s == null) {
			return false;
		}

		return (toString().equals(s.toString()));
	}

	public void reset() {// checks to see if arrays are equal
		double[] tempData = {};
		data = tempData;
	}

	public void append(int[] i) {// appends additional array to data set
		if (i == null) {
			return;
		}

		double[] tempData = new double[(data.length + i.length)];
		for (int j = 0; j < data.length; j++) {
			tempData[j] = (double) data[j];
		}
		for (int j = 0; j < i.length; j++) {
			tempData[j + data.length] = i[j];
		}
		data = tempData;
	}

	public void append(float[] f) {
		if (f == null) {
			return;
		}
		double[] tempData = new double[(data.length + f.length)];
		for (int j = 0; j < data.length; j++) {
			tempData[j] = (double) data[j];
		}
		for (int j = 0; j < f.length; j++) {
			tempData[j + data.length] = f[j];
		}
		data = tempData;
	}

	public void append(long[] lo) {
		if (lo == null) {
			return;
		}
		double[] tempData = new double[(data.length + lo.length)];
		for (int j = 0; j < data.length; j++) {
			tempData[j] = (double) data[j];
		}
		for (int j = 0; j < lo.length; j++) {
			tempData[j + data.length] = lo[j];
		}
		data = tempData;
	}

	public void append(double[] d) {
		if (d == null) {
			return;
		}
		double[] tempData = new double[(data.length + d.length)];
		for (int j = 0; j < data.length; j++) {
			tempData[j] = (double) data[j];
		}
		for (int j = 0; j < d.length; j++) {
			tempData[j + data.length] = d[j];
		}
		data = tempData;
	}

	public boolean isEmpty() {// checks to see if array is empty
		if (data.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {// returns string of array
		String dataString = "[";
		for (int i = 0; i < data.length; i++) {
			dataString += data[i];
			if (i < data.length - 1) {
				dataString += ",";
			}

		}
		dataString += "]";
		return dataString;
	}

	public double max() {// finds max
		if (data.length == 0) {
			return (Double.NaN);
		}
		double max = data[0];
		for (double num : data) {
			if (max < num) {
				max = num;
			}
		}
		return max;
	}

	public double min() {// finds min
		if (data.length == 0) {
			return (Double.NaN);
		}
		double min = data[0];
		for (double num : data) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

	public double average() {// adds up array then divides by length
		if (data.length == 0) {
			return (Double.NaN);
		}
		double total = 0;
		for (double num : data) {
			total += num;
		}
		return (total / data.length);
	}

	public double mode() {// finds most common number

		int frequency = 0;
		double mode = 0;
		int previousFrequency = 0;
		boolean noMode = true;
		for (double num1 : data) {
			for (double num2 : data) {
				if (num1 == num2) {
					frequency += 1;
				}
			}
			if (frequency > previousFrequency) {
				mode = num1;
			}
			previousFrequency = frequency;
			if (frequency > 1) {
				noMode = false;
			}
			frequency = 0;
		}
		if (noMode) {
			return Double.NaN;
		}
		return mode;
	}

	public int occursNumberOfTimes(double value) {
		int amount = 0;
		for (int i = 0; i < data.length; i++) {// for loop counts number of occurances
			if (data[i] == value) {
				amount += 1;
			}
		}
		return amount;
	}

	public double variance() {
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			total += Math.pow((data[i] - average()), 2);// adds up difference \between values and averages.
		}
		return total / data.length;
	}

	public double standardDeviation() {// takes square root of variance
		return Math.pow(variance(), .5);
	}

}
