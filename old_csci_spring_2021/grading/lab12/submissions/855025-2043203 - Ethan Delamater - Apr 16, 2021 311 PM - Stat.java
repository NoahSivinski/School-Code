/*
 * Stat.java
 * Author:  Ethan Delamater 
 * Submission Date:  04/16/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program uses a compilation of statistic methods to calculate data.
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

	private double data[];

	public Stat() { // establishing constructors
		data = new double[0];
	}

	public Stat(double[] d) { // constructs a stat object using variables in d
		if (d == null) {
			this.data = new double[0];
			return;
		} else {
			double[] data = new double[d.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = d[c];
			}
			this.data = data;
		}
	}

	public Stat(float[] f) { // // constructs a stat object using variables in f
		if (f == null) {
			this.data = new double[0];
			return;
		} else {
			double[] data = new double[f.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (float) f[c];
			}
			this.data = data;
		}
	}

	public Stat(int[] i) { // constructs a stat object using variables in c
		if (i == null) {
			this.data = new double[0];
			return;
		} else {
			double[] data = new double[i.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (int) i[c];
			}
			this.data = data;
		}
	}

	public Stat(long[] lo) { // constructs a stat object using variables in lo
		if (lo == null) {
			this.data = new double[0];
			return;
		} // End of if condition
		else {
			double[] data = new double[lo.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (long) lo[c];
			}
			this.data = data;
		} // End of else condition
	}

	public void setData(float[] f) { // sets values of the data array and creates a type float array
		if (f == null) {
			this.data = new double[0];
			return;
		} else {
			double[] data = new double[f.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (double) f[c];
			}
			this.data = data;
		}
	}

	public void setData(double[] d) { // sets values of the data array and creates a type double array
		if (d == null) {
			this.data = new double[0];
			return;
		} else {
			double[] data = new double[d.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = d[c];
			}
			this.data = data;
		}
	}

	public void setData(int[] i) { // sets values of the data array and creates a type int array
		if (i == null) {
			this.data = new double[0];
			return;
		} else {
			double[] data = new double[i.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (double) i[c];
			}
			this.data = data;
		}
	}

	public void setData(long[] lo) { // sets values of the data array and creates a type long array
		if (lo == null) {
			this.data = new double[0];
			return;
		} else {
			double[] data = new double[lo.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (double) lo[c];
			}
			this.data = data;
		}
	}

	public double[] getData() { // retrieves values of data and creates a new array with these values
		double temp[] = new double[data.length];
		for (int c = 0; c < data.length; c++) {
			temp[c] = data[c];
		}
		return temp;
	}

	public boolean equals(Stat s) { // returns the boolean value as true if both calling and passed Stat objects
									// have the same values, otherwise returns false.
		if (s == null || s.data.length == 0) {
			return false;
		}
		for (int c = 0; c < data.length; c++) {
			if (data[c] == s.data[c]) {
				return true;
			}
		}
		return false;
	}

	public void reset() { // clears the data array
		double[] data = new double[0];
		this.data = data;
	}

	public void append(int[] i) { // creates a new double array containing exactly those elements of data followed
									// by those of the type int array
		if (i != null) {
			double[] data = new double[this.data.length + i.length];
			if (!(this.data.length == 0)) {
				for (int c = 0; c < this.data.length; c++) {
					data[c] = this.data[c];
				}
			}
			for (int c = this.data.length; c < this.data.length + i.length; c++) {
				data[c] = (double) i[c - this.data.length];
			}
			this.data = data;
		}
	}

	public void append(float[] f) { // creates a new double array containing exactly those elements of data followed
									// by those of the type float array
		if (f != null) {
			double[] data = new double[this.data.length + f.length];
			if (!(this.data.length == 0)) {
				for (int c = 0; c < this.data.length; c++) {
					data[c] = this.data[c];
				}
			}
			for (int c = this.data.length; c < this.data.length + f.length; c++) {
				data[c] = (float) f[c - this.data.length];
			}
			this.data = data;
		}
	}

	public void append(long[] lo) { // creates a new double array containing exactly those elements of data followed
									// by those of the type long array
		if (lo != null) {
			double[] data = new double[this.data.length + lo.length];
			if (!(this.data.length == 0)) {
				for (int c = 0; c < this.data.length; c++) {
					data[c] = this.data[c];
				}
			}
			for (int c = this.data.length; c < this.data.length + lo.length; c++) {
				data[c] = (double) lo[c - this.data.length];
			}
			this.data = data;
		}
	}

	public void append(double[] d) { // creates a new double array containing exactly those elements of data followed
										// by those of the type double array
		if (d != null) {
			double[] data = new double[this.data.length + d.length];
			if (!(this.data.length == 0)) {
				for (int c = 0; c < this.data.length; c++) {
					data[c] = this.data[c];
				}
			}
			for (int c = this.data.length; c < this.data.length + d.length; c++) {
				data[c] = (double) d[c - this.data.length];
			}
			this.data = data;
		}
	}

	public boolean isEmpty() { // returns the boolean value as true of the data object has a length of 0,
								// otherwise returns false
		if (this.data.length == 0) {
			return true;
		}
		return false;
	}

	public String toString() { // returns a string representation of the data stored in the stat object
		String str = "[";
		for (int c = 0; c < data.length; c++) {
			str += (c == (data.length - 1)) ? data[c] : data[c] + ", ";
		}
		str += "]";
		return str;
	}

	public double min() { // returns the minimum from the data array
		if (this.data.length == 0) {
			return Double.NaN;
		}
		double min = data[0];
		for (int c = 0; c < data.length; c++) {
			if (min > data[c]) {
				min = data[c];
			}
		}
		return min;
	}

	public double max() { // returns the maximum from the data array
		if (this.data.length == 0) {
			return Double.NaN;
		}
		double max = data[0];
		for (int c = 0; c < data.length; c++) {
			if (max < data[c]) {
				max = data[c];
			}
		}
		return max;
	}

	public double average() { // returns the average from the data array
		if (this.data.length == 0) {
			return Double.NaN;
		}
		double average = 0;
		for (int c = 0; c < data.length; c++) {
			average += data[c];
		}
		return average = average / data.length;
	}

	public double mode() { // returns the mode from the data array, if no mode returns NaN
		double maxValue = Double.NaN;
		int maxCount = 0;
		for (int c = 0; c < data.length; ++c) {
			int count = 0;
			for (int i = c; i < data.length; ++i) {
				if (data[i] == data[c])
					++count;
			}
			if (count == maxCount || this.data.length == 0) {
				maxValue = Double.NaN;
			} else if (count > maxCount) {
				maxCount = count;
				maxValue = data[c];
			} // end of else if condition
		}
		return maxValue;
	}

	public double variance() { // returns the variance of data in the data array
		double variance = 0;
		for (int c = 0; c < this.data.length; c++) {
			variance = variance + Math.pow(this.data[c] - average(), 2);
		}
		return variance / this.data.length;
	}

	public double standardDeviation() { // returns the square root of the variance
		if (this.data.length == 0) {
			return Double.NaN;
		}
		return Math.sqrt(variance());
	}

}