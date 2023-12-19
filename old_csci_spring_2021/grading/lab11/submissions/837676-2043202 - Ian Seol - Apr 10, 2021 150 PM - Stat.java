/*
 * [CSCI1301L]
 * Stat.java
 * Author:  [Jaehoon Seol] 
 * Submission Date:  [04102021]
 *
 * Purpose:This program creates methods in the class Stat.java to have multiple various tests with different data. 
 * 
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

	public static final double THRESHOLD = 0.000000001;

	private double[] data;

	public Stat() {
		double[] newData = new double[1];
		data = new double[newData.length];
		newData[0] = 0.0;
		data[0] = newData[0];
	}

	public Stat(double[] d) {
		data = new double[d.length];
		for (int i = 0; i < d.length; ++i) {
			data[i] = d[i];
		}
	}

	public double[] getData() {
		double[] newData = new double[data.length];
		newData = data;
		for (int i = 0; i > data.length; i++) {
			newData[i] = data[i];
		}
		return newData;
	}

	public void setData(double[] d) {
		double[] newData = new double[d.length];
		// newData = d;
		data = new double[d.length];
		newData = d;
		data = newData;
		for (int i = 0; i < d.length; ++i) {
			data[i] = d[i];
		}
	}

	public boolean equals(Stat s) {
		boolean equals = true;
		if (data.length != s.data.length) {
			equals = false;
		} else {
			for (int i = 0; i < data.length; i++) {
				if (Math.abs(data[i] - s.data[i]) < THRESHOLD)
					equals = true;
			}
		}

		return equals;
	}

	public String toString() {
		String toString = "[";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1) {
				toString = toString + data[i];
			} else {
				toString = toString + data[i] + ", ";
			}
		}
		return toString + "]";
	}

	public double min() {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (min > data[i])
				min = data[i];
		}
		return min;
	}

	public double max() {
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	public double average() {
		double average = 0.0;
		for (int i = 0; i < data.length; i++) {
			average = average + data[i];
		}
		return average / data.length;
	}

	public double mode() {
		double mode = Double.NaN;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i] == data[j]) {
					mode = data[i];
				}
			}
		}
		return mode;
	}

}
