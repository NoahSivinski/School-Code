/*
 * [Stat].java
 * Author:  [Quinton Heald] 
 * Submission Date:  [4-10-21]
 *
 * Purpose: The Stat class establishes multiple variables referenced
 * from a UML. The methods allow the user to do certain functions to 
 * change the data array, as well as find the mode,average, min value, max value
 * and equality of the calling array (and in the case of comparison, compared to the
 * array that is being called. The class also contains a function to print
 * out a select array as a string to see each of its individual values.
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
		// creates the stat double array with single element

		double[] array = new double[1];

		array[0] = 0.0;

		data = array;

	}

	public Stat(double[] d) {

		// creates double array with assigned values and length of d

		double[] newArray = new double[d.length];

		for (int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}

		data = newArray;

	}

	public double[] getData() {

		// gets the values of data and places them within a new double array

		double[] getArray = new double[data.length];

		for (int i = 0; i < data.length; i++) {
			getArray[i] = data[i];
		}

		return (getArray);

	}

	public void setData(double[] d) {
		// sets the values of the data array

		double[] setArray = new double[d.length];

		for (int i = 0; i < d.length; i++) {
			setArray[i] = d[i];
		}

		data = setArray;

	}

	public boolean equals(Stat s) {
		// compares calling array to called array to see if both length and values are
		// equal

		double threshold = 0.000000001;

		if (data.length != s.data.length)
			return false;

		for (int i = 0; i < data.length; i++) {

			if (Math.abs(data[i] - s.data[i]) > threshold)
				return false;
		}

		return true;

	}

	public String toString() {
		// prints out array as a string

		String arrayString = "[";

		for (int i = 0; i < data.length; i++) {

			arrayString = arrayString + data[i];

			if (i < data.length - 1) {
				arrayString = arrayString + ", ";
			}

		}

		arrayString = arrayString + "]";
		return arrayString;

	}

	public double min() {
		// finds minimum value of data array

		double min = data[0];

		for (int i = 1; i < data.length; i++) {
			if (data[i] < min)
				min = data[i];
		}

		return min;

	}

	public double max() {
		// finds maximum value of data array

		double max = data[0];

		for (int i = 1; i < data.length; i++) {
			if (data[i] > max)
				max = data[i];
		}
		return max;

	}

	public double average() {
		// finds average of data array

		double average = 0;

		for (int i = 0; i < data.length; i++) {
			average = average + data[i];
		}

		average = average / data.length;

		return average;

	}

	public double mode() {
		// finds mode of data array

		double threshold = 0.000000001;
		double modeMax = 0;
		int counterMax = 0;

		for (int i = 0; i < data.length; ++i) {
			// sets the index that will be compared against in the loop using the j integer
			double modeValue = data[i];

			// uses a loop that goes through each index of data, and then runs through
			// the data array a second time while comparing the value of the j index to the
			// index of
			// the i integer
			int count = 0;
			for (int j = i; j < data.length; ++j) {
				// adds to count if significant values are found
				if (Math.abs(data[i] - data[j]) < threshold) {
					++count;
				}
			}

			if (count > counterMax) {
				modeMax = modeValue;

				// if no significant values are found (remains zero) or multiple are found,
				// returns NaN
			} else if (count == counterMax) {
				modeMax = Double.NaN;
			}
		}

		return modeMax;

	}

}
