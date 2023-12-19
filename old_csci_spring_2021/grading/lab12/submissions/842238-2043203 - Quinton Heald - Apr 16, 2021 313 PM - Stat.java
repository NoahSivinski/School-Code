/*
 * [Stat].java
 * Author:  [Quinton Heald] 
 * Submission Date:  [4-16-21]
 *
 * Purpose: This program is an updated version of the Stat class, which includes
 * methods from the updated UML. The original methods the class includes allow the program to
 * print out a string of a selected array, find the minimum and maximum value of an array,
 * find the average of an array, and find the mode of an array. In addition to these old methods,
 * new methods have been implemented to increase the functionality of the Stat class.
 * The class can now create (using multiple constructors) and set arrays of multiple different types, including ints, longs,
 * doubles, and floats. Other new methods include the ability to reset an array, append a calling arrays values to 
 * the array being called, return a boolean on if a string is empty, recite the number of occurences of a specific
 * number within an array, as well as find the variance and standard deviation of an aray. Each method
 * also is programmed to handle null values should they receive one.

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

	// creates the stat double array with single element
	public Stat() {

		double[] array = new double[0];

		data = array;

	}

	// Constructs a stat object of equal length and values to a called double array
	public Stat(double[] d) {

		double[] newArray = new double[0];

		if (d == null) {
			data = newArray;
		} else {

			newArray = new double[d.length];

			for (int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}

			data = newArray;
		}

	}

	// Constructs a stat object of equal length and values to a called float array
	public Stat(float[] f) {

		double[] newArray = new double[0];

		if (f == null) {
			data = newArray;
		} else {

			newArray = new double[f.length];

			for (int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
			data = newArray;
		}

	}

	// Constructs a stat object of equal length and values to a called integer array
	public Stat(int[] i) {

		double[] newArray = new double[0];

		if (i == null) {
			data = newArray;
		} else {

			newArray = new double[i.length];

			for (int j = 0; j < i.length; j++) {
				newArray[j] = i[j];
			}

			data = newArray;
		}

	}

	// Constructs a stat object of equal length and values to a called long array
	public Stat(long[] lo) {

		double[] newArray = new double[0];

		if (lo == null) {
			data = newArray;
		} else {

			newArray = new double[lo.length];

			for (int i = 0; i < lo.length; i++) {
				newArray[i] = lo[i];
			}

			data = newArray;
		}

	}

	// sets the values and length of data to a called float array
	public void setData(float[] f) {

		double[] setArray = new double[0];

		if (f == null) {
			data = setArray;
		} else {

			setArray = new double[0];

			if (data == null) {
				data = setArray;
			} else {

				setArray = new double[f.length];

				for (int i = 0; i < f.length; i++) {
					setArray[i] = f[i];
				}

				data = setArray;
			}

		}

	}

	// sets the values and length of data to a called double array
	public void setData(double[] d) {

		double[] setArray = new double[0];

		if (d == null) {
			data = setArray;
		} else {

			setArray = new double[d.length];

			for (int i = 0; i < d.length; i++) {
				setArray[i] = d[i];
			}

			data = setArray;
		}

	}

	// sets the values and length of data to a called integer array
	public void setData(int[] i) {

		double[] setArray = new double[0];

		if (i == null) {
			data = setArray;
		} else {

			setArray = new double[i.length];

			for (int j = 0; j < i.length; j++) {
				setArray[j] = i[j];
			}

			data = setArray;
		}

	}

	// sets the values and length of data to that of a called long array
	public void setData(long[] lo) {

		double[] setArray = new double[0];

		if (lo == null) {
			data = setArray;
		} else {

			setArray = new double[lo.length];

			for (int i = 0; i < lo.length; i++) {
				setArray[i] = lo[i];
			}

			data = setArray;
		}

	}

	// gets the values of data and places them within a new double array
	public double[] getData() {

		double[] getArray = new double[data.length];

		for (int i = 0; i < data.length; i++) {
			getArray[i] = data[i];
		}

		return (getArray);

	}

	// compares the calling array to array being called to determine if their length
	// and values are equal
	public boolean equals(Stat s) {

		if (s == null) {
			return false;
		} else {

			double threshold = 0.000000001;

			if (data.length != s.data.length)
				return false;

			for (int i = 0; i < data.length; i++) {

				if (Math.abs(data[i] - s.data[i]) > threshold)
					return false;
			}

			return true;
		}

	}

	// resets the data array to an empty array
	public void reset() {

		double[] resetArray = new double[0];

		data = resetArray;

	}

	// appends integer arrays to data
	public void append(int[] i) {

		// this is used in each append method to check for null values
		if (i != null) {

			double[] appendInt = new double[data.length + i.length];

			for (int j = 0; j < data.length; j++) {
				appendInt[j] = data[j];
			}

			for (int j = 0; j < i.length; j++) {

				// adds the values of called array after all values of data have been put in
				appendInt[j + data.length] = i[j];

			}

			data = appendInt;

			// if null, array remains unchanged
		} else {

		}

	}

	// appends float arrays to data
	public void append(float[] f) {

		if (f != null) {

			double[] appendFloat = new double[data.length + f.length];

			for (int i = 0; i < data.length; i++) {
				appendFloat[i] = data[i];
			}

			for (int i = 0; i < f.length; i++) {

				appendFloat[i + data.length] = f[i];

			}

			data = appendFloat;

		} else {

		}

	}

	// appends long arrays to data
	public void append(long[] lo) {

		if (lo != null) {

			double[] appendLong = new double[data.length + lo.length];

			for (int i = 0; i < data.length; i++) {
				appendLong[i] = data[i];
			}

			for (int i = 0; i < lo.length; i++) {

				appendLong[i + data.length] = lo[i];

			}

			data = appendLong;

		} else {

		}

	}

	// appends double arrays to data
	public void append(double[] d) {

		double[] appendDouble = new double[0];

		if (d != null) {

			appendDouble = new double[data.length + d.length];

			for (int i = 0; i < data.length; i++) {
				appendDouble[i] = data[i];
			}

			for (int i = 0; i < d.length; i++) {

				appendDouble[i + data.length] = d[i];

			}

			data = appendDouble;

		} else {

		}

	}

	// boolean value for if the string is empty
	public boolean isEmpty() {

		if (data.length == 0)
			return true;
		else
			return false;

	}

	// prints out data as a string
	public String toString() {

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

	// finds minimum value of data
	public double min() {

		if (data.length == 0)
			return Double.NaN;
		else {

			double min = data[0];

			for (int i = 1; i < data.length; i++) {
				// once it finds a lesser value, that becomes the min value
				// it will only change if a lesser value is found
				if (data[i] < min)
					min = data[i];
			}

			return min;
		}

	}

	// finds maximum value of data
	public double max() {

		if (data.length == 0)
			return Double.NaN;
		else {

			double max = data[0];

			for (int i = 1; i < data.length; i++) {
				// once it finds a greater value, that becomes the max value
				// it will only change if a greater value is found
				if (data[i] > max)
					max = data[i];
			}
			return max;
		}

	}

	// finds average of data
	public double average() {

		if (data.length == 0)
			return Double.NaN;
		else {

			double average = 0;

			for (int i = 0; i < data.length; i++) {
				average = average + data[i];
			}

			average = average / data.length;

			return average;
		}

	}

	// finds mode of data
	public double mode() {

		if (data.length == 0)
			return Double.NaN;
		else {

			double threshold = 0.000000001;
			double modeMax = 0.0;
			int counterMax = 0;

			for (int i = 0; i < data.length; ++i) {

				int count = 0;

				// will run through array comparing the values past the index of
				// i to itself to look for similar values. If a value is the same
				// as the index of i (using threshold comparison) then count is added to.
				for (int j = i + 1; j < data.length; ++j) {

					if (Math.abs(data[i] - data[j]) < threshold) {
						++count;
					}
				}

				// if count surpasses counterMax, a new mode is found
				// counter max then is set to the amount of times the mode value was counted
				// if another numbers count is higher, that becomes the new mode
				if (count > counterMax) {
					counterMax = count;
					modeMax = data[i];

					// if count remains zero, or the max counter is reached a second time and is
					// equal
					// then no mode is returned
				} else if (count == counterMax) {
					modeMax = Double.NaN;

				}
			}

			return modeMax;
		}

	}

	// finds variance of data
	public double variance() {

		if (data.length == 0)
			return Double.NaN;
		else {

			double dataMean = 0;
			double variance = 0;
			double varianceAdd = 0;

			// finds the mean of data
			for (int i = 0; i < data.length; i++) {
				dataMean = dataMean + data[i];
			}

			dataMean = dataMean / data.length;

			// takes each of the values of data and subtracts the mean from them, then
			// squares and adds those values together
			for (int j = 0; j < data.length; j++) {

				variance = data[j] - dataMean;

				variance = Math.pow(variance, 2);

				varianceAdd = variance + varianceAdd;

			}

			variance = varianceAdd / data.length;

			return variance;

		}

	}

	// finds standard deviation of data
	public double standardDeviation() {
		if (data.length == 0)
			return Double.NaN;
		else {

			return Math.sqrt(variance());

		}

	}

}
