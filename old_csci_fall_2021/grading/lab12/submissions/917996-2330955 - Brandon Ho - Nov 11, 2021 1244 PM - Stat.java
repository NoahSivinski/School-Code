/*
 * Stat.java
 * Author:  Brandon Ho
 * Submission Date: Nov 11 2021
 *
 * Purpose: Java class that gives statistics of given data and holds the data.
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

	// default constructor
	public Stat() {
		setEmptyArray();
	}

	//constructor that sets data equal to d when called
	public Stat(double[] d) {
		if(d == null) {
			setEmptyArray();
		}
		else if(d.length == 0) {
			setEmptyArray();
		}
		else {
			double[] copyData = new double[d.length];
			for(int i = 0 ; i < d.length ; i++) {
				copyData[i] = d[i];
				data = copyData;
			}
		}

	}

	//constructor that converts float array to double array and sets as data
	public Stat(float[] f) {
		if(f == null) {
			setEmptyArray();
		}
		else if(f.length == 0) {
			setEmptyArray();
		}
		else {
			double[] copyData = new double[f.length];
			for(int i = 0 ; i < f.length ; i++) {
				copyData[i] = (double) f[i];
			}
			data = copyData;
		}
	}

	//constructor that converts int array to double array and sets as data
	public Stat(int[] i) {
		if(i == null) {
			setEmptyArray();
		}
		else if(i.length == 0) {
			setEmptyArray();
		}
		else {
			double[] copyData = new double[i.length];
			for(int j = 0 ; j < i.length ; j++) {
				copyData[j] = (double) i[j];
			}
			data = copyData;
		}
	}

	//constructor that converts long array to double array and sets as data
	public Stat(long[] lo) {
		if(lo == null) {
			setEmptyArray();
		}
		else if(lo.length == 0) {
			setEmptyArray();
		}
		else {
			double[] copyData = new double[lo.length];
			for(int i = 0 ; i < lo.length ; i++) {
				copyData[i] = (double) lo[i];
			}
			data = copyData;
		}
	}

	//set values of data
	public void setData(double[] d) {
		if(d == null) {
			setEmptyArray();
		}
		else if(d.length == 0) {
			setEmptyArray();
		}
		else {
			data = new double[d.length];
			for(int i = 0 ; i < d.length ; i++) {
				data[i] = d[i];
			}
		}
	}

	//sets values of data from a float array into double array data
	public void setData(float[] f) {
		if(f == null) {
			setEmptyArray();
		}
		else if(f.length == 0) {
			setEmptyArray();
		}
		else {
			data = new double[f.length];
			for(int i = 0 ; i < f.length ; i++) {
				data[i] = (double) f[i];
			}
		}
	}

	//sets values of data from a int array into double array data
	public void setData(int[] i) {
		if(i == null) {
			setEmptyArray();
		}
		else if(i.length == 0) {
			setEmptyArray();
		}
		else {
			data = new double[i.length];
			for(int j = 0 ; j < i.length ; j++) {
				data[j] = (double) i[j];
			}
		}
	}


	//sets values of data from a long array into double array data
	public void setData(long[] lo) {
		if(lo == null) {
			setEmptyArray();
		}
		else if(lo.length == 0) {
			setEmptyArray();
		}
		else {
			data = new double[lo.length];
			for(int i = 0 ; i < lo.length ; i++) {
				data[i] = (double) lo[i];
			}
		}
	}


	//sets data as an empty double array
	private void setEmptyArray() {
		double [] emptyArray = new double[0];
		data = emptyArray;
	}

	//creates a new array and returns its reference
	public double[] getData() {
		double[] copyData = new double[data.length];
		for(int i = 0 ; i < data.length ; i++) {
			copyData[i] = data[i];
		}
		return copyData;
	}


	//returns true if data in both objects have the same values in the same order
	public boolean equals(Stat s) {
		boolean same = true;
		if(s == null) {
			return false;
		}
		if(s.data.length != data.length) {
			return false;
		}
		for(int i = 0 ; i < data.length ; i++) {
			if(data[i] != s.data[i]) {
				same = false;
			}
		}
		return same;
	}

	//resets data to empty array;
	public void reset() {
		setEmptyArray();
	}

	//adds values of array in parameter to the end of data
	public void append(double[] d) {
		if(d != null) {
			double[] copyData = new double[d.length + data.length];
			for(int i = 0 ; i < data.length; i++) {
				copyData[i] = data[i];
			}
			for(int i = data.length ; i < d.length + data.length ; i++) {
				copyData[i] = d[i - data.length];
			}
			data = copyData;
		}

	}

	//adds values of int array in parameter to the end of data
	public void append(int[] i) {
		if(i != null) {
			double[] copyData = new double[i.length + data.length];
			for(int j = 0 ; j < data.length; j++) {
				copyData[j] = data[j];
			}
			for(int j = data.length ; j < i.length + data.length ; j++) {
				copyData[j] = (double) i[j - data.length];
			}
			data = copyData;
		}

	}

	//adds values of float array in parameter to the end of data
	public void append(float[] f) {
		if(f != null) {
			double[] copyData = new double[f.length + data.length];
			for(int i = 0 ; i < data.length; i++) {
				copyData[i] = data[i];
			}
			for(int i = data.length ; i < f.length + data.length ; i++) {
				copyData[i] = (double) f[i - data.length];
			}
			data = copyData;
		}

	}

	//adds values of long array in parameter to the end of data
	public void append(long[] lo) {
		if(lo != null) {
			double[] copyData = new double[lo.length + data.length];
			for(int i = 0 ; i < data.length; i++) {
				copyData[i] = data[i];
			}
			for(int i = data.length ; i < lo.length + data.length ; i++) {
				copyData[i] = (double) lo[i - data.length];
			}
			data = copyData;
		}

	}

	//returns true if array data is empty
	public boolean isEmpty() {
		if(data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}


	//returns a string representation of the data
	public String toString() {
		if(isEmpty()) {
			return "[]";
		}
		String s = "[";
		for(int i = 0 ; i < data.length - 1 ; i++) {
			s += (data[i] + ", ");
		}
		s += (data[data.length - 1] + "]");
		return s;
	}

	//returns minimum of data array
	public double min() {
		if(isEmpty()) {
			return Double.NaN;
		}
		double x = data[0];
		for (int i = 1 ; i < data.length ; i++) {
			if(x > data[i]) {
				x = data[i];
			}
		}
		return x;
	}

	//returns the maximum value in the data
	public double max() {
		if(isEmpty()) {
			return Double.NaN;
		}
		double x = data[0];
		for (int i = 1 ; i < data.length ; i++) {
			if(x < data[i]) {
				x = data[i];
			}
		}
		return x;
	}

	//calculates and returns the average of the data
	public double average() {
		if(isEmpty()) {
			return Double.NaN;
		}
		double x = data[0];
		for (int i = 1 ; i < data.length ; i++) {
			x += data[i];
		}
		return x / data.length;
	}

	//returns the value of the data that occurs the most often, returns NaN if mode does not exist
	public double mode() {
		int highestCount = 0;
		double highestValue = 0;
		boolean sameCount = false;

		if(isEmpty()) {
			return Double.NaN;
		}
		for(int i = 0 ; i < data.length ; i++) {
			int count = 0;
			for(int j = 0 ; j < data.length ; j++) {
				if (data[i] == data[j]) {
					count++;
				}
				if(i > 0) {
					if(count == highestCount && highestValue != data[i]) {
						sameCount = true;
					}
				}

				if(highestCount < count) {
					highestCount = count;
					highestValue = data[i];
					sameCount = false;
				}

			}

		}
		if (sameCount && data.length > 1) {
			return Double.NaN;
		}
		else {
			return highestValue;
		}
	}

	//returns number of times a value occurs in an array
	private int occursNumberOfTimes(double value) {
		int count = 0;
		for(int i = 0 ; i < data.length ; i++) {
			if (data[i] == value) {
				count++;
			}
		}
		return count;
	}

	public double variance() {
		if(isEmpty()) {
			return Double.NaN;
		}
		double mean = average();
		double sum = 0;
		for(int i = 0 ; i < data.length ; i++) {
			double difference = data[i] - mean;
			difference = (difference * difference);
			sum += difference;
		}
		double variance = sum / data.length;
		return variance;

	}

	public double standardDeviation() {
		if(isEmpty()) {
			return Double.NaN;
		}
		else {
			return Math.sqrt(variance());
		}
	}

}
