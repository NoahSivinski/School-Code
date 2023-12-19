/*
 * Stat.java
 * Author:  Brandon Ho
 * Submission Date:  Nov 4 2021
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
		data = new double[1];
	}

	//constructor that sets data equal to d when called
	public Stat(double[] d) {
		double[] copyData = new double[d.length];
		for(int i = 0 ; i < d.length ; i++) {
			copyData[i] = d[i];
			data = copyData;
		}
	}

	//creates a new array and returns its reference
	public double[] getData() {
		double[] copyData = new double[data.length];
		for(int i = 0 ; i < data.length ; i++) {
			copyData[i] = data[i];
		}
		return copyData;
	}

	//set values of data
	public void setData(double[] d) {
		data = new double[d.length];
		for(int i = 0 ; i < d.length ; i++) {
			data[i] = d[i];
		}
	}

	//returns true if data in both objects have the same values in the same order
	public boolean equals(Stat s) {
		boolean same = true;
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

	//returns a string representation of the data
	public String toString() {
		String s = "[";
		for(int i = 0 ; i < data.length - 1 ; i++) {
			s += (data[i] + ", ");
		}
		s += (data[data.length - 1] + "]");
		return s;
	}

	//returns minimum of data array
	public double min() {
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

}
