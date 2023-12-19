/*
 * Stat.java
 * Author:  Nazha Erakat
 * Submission Date:  4/10/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? this program takes a class and creates two arrays and will find the min, max, mode and average of values inputted by the user. 
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

	public Stat() {
		data = new double[1];
		data[0] = 0.0;

	}

	public Stat(double[] d) {

		data = new double[d.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = d[i];
		}
	}

	public double[] getData() {
		double newArray[] = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}

	public void setData(double[] d) {
		data = new double[d.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = d[i];
		}
	}

	public boolean equals(Stat s) {
		if (data.length != s.data.length) {
			return false;
		}
		for (int i = 0; i < data.length; i++) {
			if (data[i] != s.data[i]) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < data.length; i++) {
			if (i != data.length - 1) {
				str = str + data[i] + ", ";
			} else {
				str = str + data[i];
			}
		}
		str += "]";
		return str;
	}

	public double min() {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}

	public double max() {
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}

	public double average() {
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			total = total + data[i];
		}
		double average = total / data.length;
		return average;
	}

	public double mode() {
		final double THRESHOLD = 0.000000001;
		double mode = 0;
		int maxCount = 0;
		int currentCount = 0;
		for (int i = 0; i < data.length; i++) {
			double currentValue = data[i];
			currentCount = 0;
			for (int j = i; j < data.length; j++) {
				if (Math.abs(data[i] - data[j]) <= THRESHOLD) {
					currentCount++;
				}
			}
			if (currentCount > maxCount) {
				maxCount = currentCount;
				mode = currentValue;
			} else if (currentCount == maxCount) {
				mode = Double.NaN;
			}
		}
		return mode;
	}
}
