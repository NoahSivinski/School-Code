/*
 * Stat.java

 * Author:  Scott Wagner 
 * Submission Date:  4/14/2021
 *
 * Purpose: A series of statistical methods to be applied to 
 * 1-D arrays specified in driver.
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

	// Default constructor: array with single element 0.0.
	public Stat() {
		double[] defaultArray = {};
		data = defaultArray;
	}

	// Assigns data to specified values.
	public Stat(double[] d) {

		// Null check.
		if (d == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else if (d.length == 0) {
			double[] emptyArray = {};
			data = emptyArray;
		}

		else {

			// Copies d values to new array.
			double[] newArray = new double[d.length];

			for (int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}
			data = newArray;
		}
	}

	// Int constructor
	public Stat(int[] i) {

		// Null check
		if (i == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else if (i.length == 0) {
			double[] emptyArray = {};
			data = emptyArray;
		}

		else {

			// Copies parameter values.
			double[] newArray = new double[i.length];

			for (int j = 0; j < newArray.length; j++) {
				newArray[j] = i[j];
			}
			data = newArray;
		}
	}

	// Long constructor
	public Stat(long[] lo) {

		// Null check
		if (lo == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else if (lo.length == 0) {
			double[] emptyArray = {};
			data = emptyArray;
		}

		else {

			// Copies parameter values.
			double[] newArray = new double[lo.length];

			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = lo[i];
			}
			data = newArray;
		}
	}

	// Float constructor
	public Stat(float[] f) {

		// Null check
		if (f == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else if (f.length == 0) {
			double[] emptyArray = {};
			data = emptyArray;
		}

		else {

			// Copies parameter values.
			double[] newArray = new double[f.length];

			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = f[i];
			}
			data = newArray;
		}
	}

	// Data value accessor.
	public double[] getData() {
		double[] newData = new double[data.length];

		// Copies contents of data to instanced newData.
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		return newData;
	}

	// Double mutator.
	public void setData(double[] d) {

		// Null check.
		if (d == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else if (d.length == 0) {
			double[] emptyArray = {};
			data = emptyArray;
		} else {

			// Copies d values to new array.
			double[] newArray = new double[d.length];

			for (int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}
			data = newArray;
		}
	}

	// int mutator
	public void setData(int[] i) {

		// Null check.
		if (i == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else if (i.length == 0) {
			double[] emptyArray = {};
			data = emptyArray;
		} else {

			double[] newArray = new double[i.length];

			for (int j = 0; j < newArray.length; j++) {
				newArray[j] = i[j];
			}
			data = newArray;
		}
	}

	// long mutator
	public void setData(long[] lo) {

		// Null check.
		if (lo == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else if (lo.length == 0) {
			double[] emptyArray = {};
			data = emptyArray;
		} else {
			double[] newArray = new double[lo.length];

			for (int j = 0; j < newArray.length; j++) {
				newArray[j] = lo[j];
			}
			data = newArray;
		}
	}

	// float mutator
	public void setData(float[] f) {

		// Null check.
		if (f == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else if (f.length == 0) {
			double[] emptyArray = {};
			data = emptyArray;
		} else {
			double[] newArray = new double[f.length];

			for (int j = 0; j < newArray.length; j++) {
				newArray[j] = f[j];
			}
			data = newArray;
		}
	}

	// Equals method
	public boolean equals(Stat s) {
		boolean isEqual = false;
		double[] newArray = new double[data.length];

		// Copies contents of data to instanced newData.
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}

		// Compares for equality.
		if (s == null) {
			return false;
		}
		
		if (s.data.length != newArray.length) {
			return false;
		} 

		for (int j = 0; j < data.length; j++) {
			if (newArray[j] == s.data[j]) {
				isEqual = true;
			} else if (newArray[j] != s.data[j]) {
				isEqual = false;
			}
		}
		if (isEqual == true) {
			return true;
		} else {
			return false;
		}
	}

	// toString method: returns curated data elements from Stat object.
	public String toString() {

		String arrayDataString = "";

		if (data.length == 0) {
			return "[]";
		} else if (data == null) {
			return "[]";
		}

		else {

			double[] newArray = new double[data.length];
			for (int j = 0; j < data.length; j++) {
				newArray[j] = data[j];
			}
			// Sets array to String.
			for (int i = 0; i < newArray.length; i++) {
				arrayDataString += newArray[i] + ", ";
			}

			// Formats string
			arrayDataString = arrayDataString.substring(0, (arrayDataString.length() - 2));
			arrayDataString = "[" + arrayDataString + "]";

			return arrayDataString;
		}

	}

	// min method: returns smallest element in data array.
	public double min() {

		// Null check.
		if (data == null) {
			return Double.NaN;
		} else if (data.length == 0) {
			return Double.NaN;
		}

		else {

			double[] newArray = new double[data.length];

			// Copies data values into instanced array.
			for (int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
			}

			// Compares for minimum value.
			double minValue = newArray[0];
			for (int i = 0; i < newArray.length; i++) {
				if (newArray[i] < minValue) {
					minValue = newArray[i];
				}
			}
			return minValue;
		}
	}

	// max method: returns greatest element in array.
	public double max() {

		// Null check.
		if (data == null) {
			return Double.NaN;
		} else if (data.length == 0) {
			return Double.NaN;
		}

		else {
			double[] newArray = new double[data.length];

			// Copies data values into instanced array.
			for (int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
			}
			// Compares for max value
			double maxValue = newArray[0];
			for (int i = 0; i < newArray.length; i++) {
				if (newArray[i] > maxValue) {
					maxValue = newArray[i];
				}
			}
			return maxValue;
		}
	}

	// average method: returns average of all element values.
	public double average() {

		// Null check.
		if (data == null) {
			return Double.NaN;
		} else if (data.length == 0) {
			return Double.NaN;
		}

		else {

			double[] newArray = new double[data.length];
			double sum = 0;

			// Copies data values into instanced array.
			for (int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
			}
			// Adds all elements.
			for (int i = 0; i < newArray.length; i++) {
				sum += newArray[i];
			}
			return (sum / (newArray.length));
		}
	}

	// mode method: returns most frequently occurring value in array.
	public double mode() {
		if (data == null) {
			return Double.NaN;
		} else if (data.length == 0) {
			return Double.NaN;
		}

		else {
			double[] newArray = new double[data.length];

			// Copies data values into instanced array.
			for (int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
			}

			// Counts occurrence of each element.
			int[] occurrenceCounter = new int[data.length];
			int greatestElem = 0;
			double mostOccurringElem = data[0];

			for (int i = 0; i < newArray.length; i++) {
				for (int j = 0; j < newArray.length; j++) {
					if (newArray[i] == newArray[j]) {
						occurrenceCounter[i]++;
					}
				}
			}

			// Sets mode value.
			for (int i = 0; i < newArray.length; i++) {
				if (occurrenceCounter[i] > greatestElem) {
					greatestElem = occurrenceCounter[i];
					mostOccurringElem = newArray[i];
				}
			}

			// Checks for non-unique values.
			for (int i = 0; i < newArray.length; i++) {
				if (occurrenceCounter[i] == greatestElem) {
					if (newArray[i] != mostOccurringElem) {
						return Double.NaN;
					}
				}
			}
			return mostOccurringElem;
		}
	}

	// Resets data array.
	public void reset() {

		double[] emptyArray = {};
		data = emptyArray;
	}

	// Appends with double.
	public void append(double[] d) {

		// Null check
		if (d == null) {
		} else if (d.length == 0) {}

		else {
			double[] newArray = new double[d.length + data.length];
			int counter = 0;

			for (int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
				counter++;
			}
			for (int i = counter; i < newArray.length; i++) {
				for (int j = 0; j < d.length; j++) {
					newArray[i++] = d[j];
				}
			}
			data = newArray;
		}
	}

	// Appends with int.
	public void append(int[] i) {

		// Null check.
		if (i == null) {
		} else if (i.length == 0) {
		}

		else {
			double[] newArray = new double[i.length + data.length];
			int counter = 0;

			for (int l = 0; l < data.length; l++) {
				newArray[l] = data[l];
				counter++;
			}
			for (int l = counter; l < newArray.length; l++) {
				for (int j = 0; j < i.length; j++) {
					newArray[l++] = i[j];
				}
			}
			data = newArray;
		}
	}

	// Appends with long.
	public void append(long[] lo) {

		// Null check.
		if (lo == null) {
		} else if (lo.length == 0) {
		}

		else {
			double[] newArray = new double[lo.length + data.length];
			int counter = 0;

			for (int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
				counter++;
			}
			for (int i = counter; i < newArray.length; i++) {
				for (int j = 0; j < lo.length; j++) {
					newArray[i++] = lo[j];
				}
			}
			data = newArray;
		}
	}

	// Appends with double.
	public void append(float[] f) {

		// Null check.
		if (f == null) {
		} else if (f.length == 0) {
		}

		else {
			double[] newArray = new double[f.length + data.length];
			int counter = 0;

			for (int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
				counter++;
			}
			for (int i = counter; i < newArray.length; i++) {
				for (int j = 0; j < f.length; j++) {
					newArray[i++] = f[j];
				}
			}
			data = newArray;
		}
	}

	// Checks if data is empty.
	public boolean isEmpty() {

		if (data == null) {
			return true;
		} else if (data.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Checks number of times an element occurs.
	private double occursNumberOfTimes(double value) {

		double[] newArray = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		double count = 0;

		for (int i = 0; i < data.length; i++) {
			if (newArray[i] == value) {
				count++;
			}
		}
		return count;
	}

	// Returns variance
	public double variance() {

		Stat varObj = new Stat();

		// Null check.
		if (data == null) {
			return Double.NaN;
		} else if (data.length == 0) {
			return Double.NaN;
		}

		else {
			double variance;
			double sum = 0;

			double[] newArray = new double[data.length];
			for (int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
			}
			varObj.setData(newArray);
			double mean = varObj.average();

			for (int i = 0; i < newArray.length; i++) {
				newArray[i] -= mean;
			}
			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = Math.pow(newArray[i], 2);
			}
			for (int i = 0; i < newArray.length; i++) {
				sum += newArray[i];
			}
			variance = sum / data.length;

			return variance;

		}
	}

	// Returns standard deviation
	public double standardDeviation() {

		Stat varObj = new Stat();
		// Null check
		if (data == null) {
			return Double.NaN;
		} else if (data.length == 0) {
			return Double.NaN;
		}

		else {
			double variance;
			double sum = 0;

			double[] newArray = new double[data.length];

			// Calculates variance.
			for (int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
			}
			varObj.setData(newArray);
			double mean = varObj.average();

			for (int i = 0; i < newArray.length; i++) {
				newArray[i] -= mean;
			}
			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = Math.pow(newArray[i], 2);
			}
			for (int i = 0; i < newArray.length; i++) {
				sum += newArray[i];
			}
			variance = sum / data.length;

			return Math.sqrt(variance);

		}

	}
}
