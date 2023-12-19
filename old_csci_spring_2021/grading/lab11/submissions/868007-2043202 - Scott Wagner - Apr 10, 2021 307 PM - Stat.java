/*
 * Stat.java

 * Author:  Scott Wagner 
 * Submission Date:  4/9/2021
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
		double[] defaultArray = { 0.0 };
	}

	// Assigns data to specified values.
	public Stat(double[] d) {
		double[] newArray = new double[d.length];

		// Copies d values to new array.
		for (int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
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

	// Data value mutator.
	public void setData(double[] d) {
		double[] newArray = new double[d.length];

		// Copies d values to new array.
		for (int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}

	// Equals method
	public boolean equals(Stat s) {
		boolean isEqual = false;
		double[] newArray = new double[data.length];
		double[] compareArray = new double[data.length];

		// Copies contents of data to instanced newData.
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}

		// Compares for equality.
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
		double[] newArray = new double[data.length];
		for (int j = 0; j < data.length; j++) {
			newArray[j] = data[j];
		}

		// Sets array to String.
		String arrayDataString = "";
		for (int i = 0; i < newArray.length; i++) {
			arrayDataString += newArray[i] + ", ";
		}

		// Formats string
		arrayDataString = arrayDataString.substring(0, (arrayDataString.length() - 2));
		arrayDataString = "[" + arrayDataString + "]";

		return arrayDataString;

	}

	// min method: returns smallest element in data array.
	public double min() {
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

	// max method: returns greatest element in array.
	public double max() {
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

	// average method: returns average of all element values.
	public double average() {
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

	// mode method: returns most frequently occurring value in array.
	public double mode() {
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
