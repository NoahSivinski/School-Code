/*
 * [CSCI1301].java
 * Author:  Adam Ruehle 
 * Submission Date:  November 5, 2021
 *
 * Purpose: The purpose of this lab is to create statistical objects and set them
 * to varying amounts of data values, then compare them. Methods in the lab will 
 * also return maximum, minimum, average, and mode values based on one of the objects.
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

	private double[] data;

	public static final double THRESHOLD = 0.000000001;

	/*
	 * Default constructor for Stat. Creates a double array having a single element
	 * 0.0.
	 */
	public Stat() {
		double[] d = { 0 };
		data = d;
	}

	/*
	 * Constructs a Stat object that holds an array with the values in data.
	 */
	public Stat(double[] d) {
		int dataLength = d.length;
		double[] result = new double[dataLength];
		for (int i = 0; i < d.length; i++) {
			result[i] = d[i];
		}
		data = result;
	}

	/*
	 * Retrieves values of data.
	 */
	public double[] getData() {
		double[] result = data;
		return result;
	}

	/*
	 * Sets the values of the data array.
	 */
	public void setData(double[] d) {
		double[] result = d;
		data = result;
	}

	/*
	 * If the calling Stat object and passed Stat object, s, have the same values,
	 * returns true.
	 */
	public boolean equals(Stat s) {
		boolean result = true;
		if (this.data.length == s.data.length) {
			for (int i = 0; i < this.data.length; i++) {
				if (!(Math.abs(this.data[i] - s.data[i]) <= THRESHOLD)) {
					result = false;
				}
			}
		} else {
			result = false;
		}
		return result;
	}

	/*
	 * Returns a String of the data elements stored in the Stat object.
	 */
	public String toString() {
		String result = "";
		result += "[";
		for (int i = 0; i < this.data.length - 1; i++) {
			result += this.data[i] + ", ";
		}
		result += this.data[this.data.length - 1] + "]";
		return result;
	}

	/*
	 * Returns min of data array.
	 */
	public double min() {
		double min = this.data[0];
		for (int i = 1; i < this.data.length; i++) {
			if (this.data[i] < min) {
				min = this.data[i];
			}
		}
		return min;
	}

	/*
	 * Returns max of data array.
	 */
	public double max() {
		double max = this.data[0];
		for (int i = 1; i < this.data.length; i++) {
			if (this.data[i] > max) {
				max = this.data[i];
			}
		}
		return max;
	}

	/*
	 * Returns average of data array.
	 */
	public double average() {
		double total = 0;
		for (int i = 0; i < this.data.length; i++) {
			total += this.data[i];
		}
		double result = total / (double) this.data.length;
		return result;
	}

	/*
	 * Returns value that occurs most frequently in data array, unless there is no
	 * unique value that occurs the most (will return Not a Number).
	 */
	public double mode() {
		double count = 0;
		double largest = 0;
		double mode = -1;
		for (double currrent : this.data) {
			count = 0;
			for (double current2 : this.data) {
				if (Math.abs(currrent - current2) <= THRESHOLD) {
					count++;
					if (count > largest) {
						largest = count;
						mode = currrent;
					}
				}
			}
		}
		if (Math.abs(largest - 1) <= THRESHOLD) {
			return Double.NaN;
		} else {
			return mode;
		}
	}
}
