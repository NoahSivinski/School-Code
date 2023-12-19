/*
 * [CSCI1301].java
 * Author:  Adam Ruehle 
 * Submission Date:  November 9, 2021
 *
 * Purpose: The purpose of this lab is to create Stat objects that hold
 * varying amounts of data and capable of calculation varying statistical
 * values of that data. The Stat object should allow appending data,
 * printing data, and comparison with other data sets.
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

	public static final double THRESHOLD = 0.000000001;

	// Method returns true if data set is null.
	public boolean isNull() {
		return this.data == null;
	}

	/*
	 * (1) Default constructor for Stat. Creates a double array having a single
	 * element 0.0.
	 */
	public Stat() {
		double[] d = new double[0];
		data = d;
	}

	/*
	 * (2, 3, 4, 5) Constructs a Stat object that holds an array with the values in
	 * data, if they are double, integer, long, or float type variables.
	 */
	public Stat(double[] d) {
		int dataLength = d.length;
		double[] result = new double[dataLength];
		for (int i = 0; i < d.length; i++) {
			result[i] = d[i];
		}
		data = result;
	}

	public Stat(int[] i) {
		int dataLength = i.length;
		double[] result = new double[dataLength];
		for (int j = 0; j < i.length; j++) {
			result[j] = i[j];
		}
		data = result;
	}

	public Stat(long[] lo) {
		int dataLength = lo.length;
		double[] result = new double[dataLength];
		for (int i = 0; i < lo.length; i++) {
			result[i] = lo[i];
		}
		data = result;
	}

	public Stat(float[] f) {
		int dataLength = f.length;
		double[] result = new double[dataLength];
		for (int j = 0; j < f.length; j++) {
			result[j] = f[j];
		}
		data = result;
	}

	/*
	 * (6, 7, 8, 9) Sets the values of the data array if the array used as parameter
	 * is not null or empty. If the parameter is null, then an empty array is
	 * assigned to data.
	 */
	public void setData(double[] d) {
		double[] result = d;
		if (this.data != null) {
			data = result;
		} else {
			data = new double[0];
		}
	}

	public void setData(int[] i) {
		int[] result = i;
		if (this.data != null) {
			for (int j = 0; j < data.length; j++) {
				data[j] = result[j];
			}
		} else {
			data = new double[0];
		}
	}

	public void setData(long[] lo) {
		long[] result = lo;
		if (this.data != null) {
			for (int j = 0; j < data.length; j++) {
				data[j] = result[j];
			}
		} else {
			data = new double[0];
		}
	}

	public void setData(float[] f) {
		float[] result = f;
		if (this.data != null) {
			for (int j = 0; j < data.length; j++) {
				data[j] = result[j];
			}
		} else {
			data = new double[0];
		}
	}

	/*
	 * (10) Retrieves values of data.
	 */
	public double[] getData() {
		double[] result = data;
		return result;
	}

	/*
	 * (11) Returns true if the calling Stat object and passed Stat object, s, have
	 * the same values in the same order.
	 */
	public boolean equals(Stat s) {
		if (s == null) {
			return this.isNull() || this.isEmpty();
		}
		if (this.isNull() && s.isNull()) {
			return true;
		}
		if (this.isEmpty() && s.isEmpty()) {
			return true;
		}
		if (this.data.length != s.data.length) {
			return false;
		}
		boolean result = true;
		for (int i = 0; i < this.data.length; i++) {
			if (!(Math.abs(this.data[i] - s.data[i]) <= THRESHOLD)) {
				result = false;
			}
		}
		return result;
	}

	/*
	 * (12) Clears the data array and assigns data a new empty double array.
	 */
	public void reset() {
		double[] reset = new double[0];
		data = reset;
	}

	/*
	 * (13, 14, 15, 16) These methods create a new double array containing the
	 * elements in data appended by the elements contained in the array passed as a
	 * parameter.
	 */
	public void append(double[] d) {
		if (d == null) {
			return;
		}
		if (this.isNull()) {
			this.data = new double[0];
		}
		double[] result = new double[this.data.length + d.length];
		int i = 0;
		for (double current : data) {
			result[i] = current;
			i++;
		}
		for (double current : d) {
			result[i] = current;
			i++;
		}
		data = result;
	}

	public void append(int[] i) {
		double[] result = new double[this.data.length + i.length];
		int j = 0;
		for (double current : data) {
			result[j] = current;
			j++;
		}
		for (double current : i) {
			result[j] = current;
			j++;
		}
		data = result;
	}

	public void append(long[] lo) {
		double[] result = new double[this.data.length + lo.length];
		int i = 0;
		for (double current : data) {
			result[i] = current;
			i++;
		}
		for (double current : lo) {
			result[i] = current;
			i++;
		}
		data = result;
	}

	public void append(float[] f) {
		double[] result = new double[this.data.length + f.length];
		int i = 0;
		for (double current : data) {
			result[i] = current;
			i++;
		}
		for (double current : f) {
			result[i] = current;
			i++;
		}
		data = result;
	}

	/*
	 * (17) Returns true if the data object is empty.
	 */
	public boolean isEmpty() {
		return this.data.length == 0;
	}

	/*
	 * (18) Returns a String of the data elements stored in the Stat object.
	 */
	public String toString() {
		String result = "[]";
		if (!this.isNull() && !this.isEmpty()) {
			result = "[";
			for (int i = 0; i < this.data.length - 1; i++) {
				result += this.data[i] + ", ";
			}
			result += this.data[this.data.length - 1] + "]";
		}
		return result;
	}


	/*
	 * (19) Returns the minimum value contained in a data array.
	 */
	public double min() {
		if (!this.isEmpty() && !this.isNull()) {
			double min = this.data[0];
			for (int i = 1; i < this.data.length; i++) {
				if (this.data[i] < min) {
					min = this.data[i];
				}
			}
			return min;
		} else {
			return Double.NaN;
		}
	}

	/*
	 * (20) Returns max of data array.
	 */
	public double max() {
		if (!this.isEmpty() && !this.isNull()) {
			double max = this.data[0];
			for (int i = 1; i < this.data.length; i++) {
				if (this.data[i] > max) {
					max = this.data[i];
				}
			}
			return max;
		} else {
			return Double.NaN;
		}
	}

	/*
	 * (21) Returns average of data array.
	 */
	public double average() {
		double total = 0;
		double result = 0;
		if (!this.isEmpty() && !this.isNull()) {
			for (int i = 0; i < this.data.length; i++) {
				total += this.data[i];
			}
			result = total / (double) this.data.length;
		} else {
			result = Double.NaN;
		}
		return result;
	}

	/*
	 * (22) Returns value that occurs most frequently in data array, unless there is
	 * no unique value that occurs the most (will return Not a Number).
	 */
	public double mode() {
		int count = -1;
		int largestCount = -1;
		double mode = Double.NaN;
		boolean duplicate = false;
		if (!this.isNull() && !this.isEmpty()) {
			for (double current : data) {
				if (current != mode) {
					count = occursNumberOfTimes(current);
					if (count > largestCount) {
						largestCount = count;
						mode = current;
						duplicate = false;
					} else if (count == largestCount) {
						duplicate = true;
					}
				}
			}
		}
		if (duplicate) {
			return Double.NaN;
		}
		return mode;
	}

	/*
	 * (23) Returns number of times a value returns in a data array.
	 */
	private int occursNumberOfTimes(double value) {
		int count = 0;
		for (double current : this.data) {
			if (Math.abs(value - current) <= THRESHOLD) {
				count++;
			}
		}
		return count;
	}

	/*
	 * (24) Returns the variance of the data in the data array.
	 */
	public double variance() {
		double[] values = new double[data.length];
		double result = 0;
		int i = 0;
		if (!this.isEmpty() && !this.isNull()) {
			for (double current : data) {
				values[i] = Math.abs(current - this.average());
				i++;
			}
			for (double current : values) {
				result += (current * current);
			}
			result = result / data.length;
			return result;
		} else {
			return Double.NaN;
		}
	}

	/*
	 * (25) Returns the Standard Deviation (square root of variance).
	 */
	public double standardDeviation() {
		if (this.variance() != Double.NaN && this.variance() >= 0) {
			double standardDeviation = 0;
			standardDeviation = Math.sqrt(this.variance());
			return standardDeviation;
		} else {
			return Double.NaN;
		}
	}
}
