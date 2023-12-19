/*
 * Stat.java
 * Author:  Matthew Hargrove 
 * Submission Date:  4/9/2021
 *
 * Purpose: To extrapolate data based on the array of numbers given and give set functions for different main arguments.
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

	public Stat(double[] d) { //2. second constructor with double[] parameter
		data = new double[d.length];
		for (int i = 0; i < data.length; i++)
			data[i] = d[i];
	}

	public double[] getData() {
		double currentData[] = new double[data.length];
		for (int i = 0; i < data.length; i++)
			currentData[i] = data[i];
		return currentData;
	}

	public void setData(double[] d) {
		data = new double[d.length];
		for (int i = 0; i < data.length; i++)
			data[i] = d[i];
	}

	public boolean equals(Stat s) {
		if (data.length != s.data.length)
			return false;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != s.data[i])
				return false;
		}
		return true;
	}


	public String toString() { 
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
			if (max < data[i])
				max = data[i];
		}
		return max;
	}

	public double average() {
		double total = 0;
		for (int i = 0; i < data.length; i++)
			total += data[i];
		return (total / data.length);

	}

	public double mode() { //22. return mode of an array
		if (data.length != 0) {
			double mode = 0, count = 1;

			for (int i = 0; i < data.length; i++) {
				int maxCount = 0;
				for (int j = i; j < data.length; j++) {
					if (Math.abs(data[i] - data[j]) <= 0.000001)
						maxCount++;
				}
				if (maxCount > count) {
					mode = data[i];
					count = maxCount;
				}
				else if (maxCount == count) {
					mode = Double.NaN;
				}
			}


			return mode;
		}
		else
			return Double.NaN;
	}

}

	