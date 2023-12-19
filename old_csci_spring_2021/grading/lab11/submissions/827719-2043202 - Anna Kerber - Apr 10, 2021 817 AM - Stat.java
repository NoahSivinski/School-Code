/*
 * Stat.java
 * Author:  Anna Kerber
 * Submission Date:  4/10/21
 *
 * Purpose: The purpose of this program is to create methods that can
 * initialize an array, access and mutate the array, and perform 
 * mathematical operations on the array.
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
		data = new double[] { 0.0 };
	}

	public Stat(double[] d) {
		data = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}

	public double[] getData() {
		double[] newData = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		return (newData);

	}

	public void setData(double[] d) {
		double[] newData = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			newData[i] = d[i];
		}
		data = newData;
	}

	public boolean equals(Stat s) {
		if (this.getData().length != s.getData().length) {
			return false;
		}
		for (int i = 0; i < s.getData().length; i++) {
			if (s.getData()[i] != this.getData()[i]) {
			}
		}
		return true;
	}

	public String toString() {
		String print = "[";
		for (int i = 0; i < data.length; i++) {
			print += data[i] + ", ";
		}
		return print.substring(0, print.length() - 2) + "]";
	}

	public double min() {
		double min = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}

	public double max() {
		double max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	public double average() {
		int count = 0;
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			count++;
			sum += data[i];
		}
		return sum / count;
	}

	public double mode() {
		double maxValue = -1;
		int maxCount = 0, count = 0, uniqueCount = 0;
		double[] total = new double[data.length];
		double threshold = 0.000000001;

		for (int i = 0; i < data.length; i++) {
			count = 0;
			for (int j = 0; j < data.length; j++) {
				if (Math.abs(data[j] - data[i]) < threshold) {
					count++;
				}
			}

			if (count >= maxCount) {
				maxValue = data[i];
				maxCount = count;
				total[i] = count;
			}
		}

		for (int i = 0; i < total.length; i++) {
			if (Math.abs(maxCount - total[i]) == 0) {
				uniqueCount++;
			}
		}

		if (uniqueCount > maxCount) {
			return Double.NaN;
		}

		return maxValue;
	}

}
