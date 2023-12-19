/*
 * Stat.java
 * Author:  William Malonda 
 * Submission Date: April 16, 2021
 *
 * Purpose: The program Stat.java is a modded version or a previous lab also called Stat.java 
 * that stores a double array of values from the main method which are used to find things such as
 * the minimum value, maximum value, mode, average, variance, frequency, and standard deviation for
 * those values. 
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

	// Declared data as a private double array
	private double[] data;

	// Creates a double array with a length of 0
	public Stat() {
		data = new double[0];
	}

	// If not null, creates a double array and copies the length and values of d and
	// references it as "array" which is then assigned to data for d
	public Stat(double[] d) {
		double[] array = new double[0];
		if (d != null) {
			array = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				array[i] = d[i];
			}
		}
		data = array;
	}

	// If not null, creates a double array and copies the length and values of d and
	// references it as "array" which is then assigned to data for f
	public Stat(float[] f) {
		double[] array = new double[0];
		if (f != null) {
			array = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				array[i] = f[i];
			}
		}
		data = array;
	}

	// If not null, creates a double array and copies the length and values of d and
	// references it as "array" which is then assigned to data for i
	public Stat(int[] i) {
		double[] array = new double[0];
		if (i != null) {
			array = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				array[j] = i[j];
			}
		}
		data = array;
	}

	// If not null, creates a double array and copies the length and values of d and
	// references it as "array" which is then assigned to data for lo
	public Stat(long[] lo) {
		double[] array = new double[0];
		if (lo != null) {
			array = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				array[i] = lo[i];
			}
		}
		data = array;
	}

	// If not null, creates a new array called "array" and copies the elements of
	// data and assigns the array to data for f
	public void setData(float[] f) {
		double[] array = new double[0];
		if (f != null) {
			array = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				array[i] = f[i];
			}
		}
		data = array;
	}

	// If not null, creates a new array called "array" and copies the elements of
	// data and assigns the array to data for d
	public void setData(double[] d) {
		double[] array = new double[0];
		if (d != null) {
			array = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				array[i] = d[i];
			}
		}
		data = array;
	}

	// If not null, creates a new array called "array" and copies the elements of
	// data and assigns the array to data for i
	public void setData(int[] i) {
		double[] array = new double[0];
		if (i != null) {
			array = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				array[j] = i[j];
			}
		}
		data = array;
	}

	// If not null, creates a new array called "array" and copies the elements of
	// data and assigns the array to data for lo
	public void setData(long[] lo) {
		double[] array = new double[0];
		if (lo != null) {
			array = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				array[i] = lo[i];
			}
		}
		data = array;
	}

	// Retrieves data values by creating an array with the same values used in data
	// and references it as "array" which is then returned
	public double[] getData() {
		double[] array = new double[0];
		if (data != null) {
			array = new double[data.length];
			for (int i = 0; i < data.length; i++) {
				array[i] = data[i];
			}
		}
		return array;
	}

	// If the data of s and the called object are equal, returns true, otherwise
	// returns false
	public boolean equals(Stat s) {
		if (this.data.length == s.data.length) {
			return true;
		} else {
			return false;
		}
	}

	// Clears data by creating a new double array with 0 length
	public void reset() {
		data = new double[0];
	}

	// If not null, creates a new double array containing elements of data and those
	// of the array passed and references it to data for i
	public void append(int[] i) {
		if (i != null) {
			double[] array = new double[data.length + i.length];

			for (int j = 0; j < array.length; j++) {
				if (j < data.length) {
					array[j] = data[j];
				} else {
					array[j] = i[j - data.length];
				}
			}
			data = array;
		}
	}

	// If not null, creates a new double array containing elements of data and those
	// of the array passed and references it to data for f
	public void append(float[] f) {
		if (f != null) {
			double[] array = new double[data.length + f.length];

			for (int i = 0; i < array.length; i++) {
				if (i < data.length) {
					array[i] = data[i];
				} else {
					array[i] = f[i - data.length];
				}
			}
			data = array;
		}
	}

	// If not null, creates a new double array containing elements of data and those
	// of the array passed and references it to data for lo
	public void append(long[] lo) {
		if (lo != null) {
			double[] array = new double[data.length + lo.length];

			for (int i = 0; i < array.length; i++) {
				if (i < data.length) {
					array[i] = data[i];
				} else {
					array[i] = lo[i - data.length];
				}
			}
			data = array;
		}
	}

	// If not null, creates a new double array containing elements of data and those
	// of the array passed and references it to data for d
	public void append(double[] d) {
		if (d != null) {
			double[] array = new double[data.length + d.length];

			for (int i = 0; i < array.length; i++) {
				if (i < data.length) {
					array[i] = data[i];
				} else {
					array[i] = d[i - data.length];
				}
			}
			data = array;
		}
	}

	// Returns true if the length of data is empty, otherwise false
	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Returns a string of the data elements as s
	public String toString() {
		String s = "[";
		if (isEmpty()) {
			return "[]";
		}
		for (int i = 0; i < data.length; i++) {
			s = s + data[i];
			if (i == data.length - 1) {
				s = s + "]";
			} else {
				s = s + ", ";
			}
		}
		return s;
	}

	// If the array is not empty, finds the minimum value of the array and returns
	// it
	public double min() {
		if (!isEmpty()) {
			double minValue = data[0];

			for (int i = 1; i < data.length; i++) {
				if (data[i] < minValue) {
					minValue = data[i];
				}
			}
			return minValue;
		} else {
			return Double.NaN;
		}
	}

	// If the array is not empty, finds the maximum value of the array and returns
	// it
	public double max() {
		if (!isEmpty()) {
			double maxValue = data[0];

			for (int i = 1; i < data.length; i++) {
				if (data[i] > maxValue) {
					maxValue = data[i];
				}
			}
			return maxValue;
		} else {
			return Double.NaN;
		}
	}

	// If the array is not empty, finds the average value of the array and returns
	// it
	public double average() {
		double sum = 0;
		if (!isEmpty()) {
			for (int i = 0; i < data.length; i++) {
				sum = sum + data[i];
			}
			double average = sum / data.length;
			return average;
		} else {
			return Double.NaN;
		}
	}

	// If the array is not empty, finds the mode of the array and returns it
	public double mode() {
		double modeCount = 0;
		double mode = 0;

		double currentCount = 0;

		if (!isEmpty()) {
			for (double num : data) {
				currentCount = 0;
				for (double element : data) {
					if (num == element) {
						currentCount++;
					}
				}
				if (currentCount > modeCount) {
					modeCount = currentCount;
					mode = num;
				}
			}
			return mode;
		} else {
			return Double.NaN;
		}
	}

	// Returns the number of times a specific value occurs in the array
	private int occursNumberofTimes(double value) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				count++;
			}
		}
		return count;
	}

	// If the array is not empty, returns the variance of the data array
	public double variance() {
		if (!isEmpty()) {
			double variance;
			double distance = 0;

			for (int i = 0; i < data.length; i++) {
				distance = distance + Math.pow(data[i] - average(), 2);
			}
			variance = distance / data.length;
			return variance;
		} else {
			return Double.NaN;
		}
	}

	// Returns standard deviation by square rooting variance
	public double standardDeviation() {
		return Math.sqrt(variance());
	}
}
