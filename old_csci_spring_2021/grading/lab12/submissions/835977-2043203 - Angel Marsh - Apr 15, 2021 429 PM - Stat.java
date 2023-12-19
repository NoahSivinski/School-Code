/*
 * Stat.java
 * Author:  Angel Marsh 
 * Submission Date:  April 15, 2021
 *
 * Purpose: The purpose of this program is to manipulate an array
 * of double values and to compute and display the minimum, maximum,
 * mode, and average of these values as well as the variance and
 * standard deviation in the data set and whether the array is
 * empty.
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

	// default constructor for Stat that creates a double array with a length of 0
	public Stat() {
		double[] array = new double[0];
		data = array;
	}

	// creates a double array of d's length & assigns the reference to data
	public Stat(double[] d) {
		setData(d);
	}

	// retrieves the values of data
	public double[] getData() {
		double[] getterArray = new double[data.length];
		int i = 0;
		// loop to fill array with data's values
		while (i < data.length) {
			getterArray[i] = data[i];
			i++;
		}
		return getterArray;
	}

	// sets the values of the data array
	public void setData(double[] d) {
		if (d == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else {
			double[] newArray = new double[d.length];
			data = newArray;
			// loop to fill array with d's values
			for (int i = 0; i < d.length; i++) {
				data[i] = d[i];
			}
		}
	}

	// checks if the calling Stat object & passed Stat object s's data objects have
	// the same values (in the same order)
	public boolean equals(Stat s) {
		boolean elementsAreEqual = true;
		if (s == null) {
			elementsAreEqual = false;
		} else if (getData().length != s.getData().length) {
			elementsAreEqual = false;
		} else {
			int i = 0;
			// loop ends if the elements don't equal each other or when the end of the array
			// is reached
			while (elementsAreEqual && i < s.getData().length) {
				if (getData()[i] != s.getData()[i]) {
					elementsAreEqual = false;
				}
				i++;
			}
		}
		return elementsAreEqual;
	}

	// returns the String version of the array
	public String toString() {
		String dataString = "[";
		// case for if the array is empty
		if (isEmpty()) {
			dataString += "";
		} else {
			for (int i = 0; i < data.length; i++) {
				// there must be a comma & space after every element in the array except the
				// last one
				if (i != data.length - 1) {
					dataString = dataString + data[i] + ", ";
				} else {
					dataString = dataString + data[i];
				}
			}
		}
		dataString += "]";
		return dataString;
	}

	// returns the element with the lowest value in the array
	public double min() {
		double min;
		// case for if the array is empty
		if (isEmpty()) {
			min = Double.NaN;
		} else {
			min = data[0];
			for (int i = 0; i < data.length; i++) {
				if (data[i] < min) {
					min = data[i];
				}
			}
		}
		return min;
	}

	// returns the element with the greatest value in the array
	public double max() {
		double max = 0;
		// case for if the array is empty
		if (isEmpty()) {
			max = Double.NaN;
		} else {
			max = data[0];
			for (int i = 1; i < data.length; i++) {
				if (data[i] > max) {
					max = data[i];
				}
			}
		}
		return max;
	}

	// returns the mean of the elements in the array
	public double average() {
		double mean = 0;
		if (isEmpty()) {
			mean = Double.NaN;
		} else {
			double sum = 0;
			for (int index = 0; index < data.length; index++) {
				sum = sum + data[index];
			}
			mean = sum / data.length;
		}
		return mean;
	}

	// returns the number that appears most frequently in the array
	public double mode() {
		// for comparing doubles
		final double THRESHOLD = 0.000000001;
		double mode = 0;
		// to track how many times the same element appears
		int counter = 0;
		// to see if one number appears more than all others
		int overallCounter = 0;
		// case for if the array is empty
		if (isEmpty()) {
			mode = Double.NaN;
		} else {
			for (int i = 0; i < data.length; i++) {
				counter = 0;
				for (int j = i; j < data.length; j++) {
					if (Math.abs(data[i] - data[j]) <= THRESHOLD) {
						counter++;
					}
				}
				if (counter > overallCounter) {
					overallCounter = counter;
					mode = data[i];
				} else if (counter == overallCounter) {
					mode = Double.NaN;
				}
			}
		}
		return mode;
	}

	// Part II
	// creates a double array of i's length & assigns the reference to data
	Stat(int[] i) {
		setData(i);
	}

	// creates a double array of lo's length & assigns the reference to data
	Stat(long[] lo) {
		setData(lo);
	}

	// creates a double array of f's length & assigns the reference to data
	public Stat(float[] f) {
		setData(f);
	}

	// clears the data array
	public void reset() {
		double[] resetArray = {};
		data = resetArray;
	}

	// creates an array containing data's values followed by d's values
	public void append(double[] d) {
		if (d == null) {

		} else {
			double[] doubleAppend = new double[data.length + d.length];
			// loop to fill array with data & d's values
			for (int i = 0; i < data.length + d.length; i++) {
				if (i < data.length) {
					doubleAppend[i] = data[i];
				} else {
					doubleAppend[i] = d[i - data.length];
				}
			}
			data = doubleAppend;
		}
	}

	// creates an array containing data's values followed by i's values
	public void append(int[] i) {
		if (i == null) {

		} else {
			double[] intAppend = new double[data.length + i.length];
			// loop to fill array with data & i's values
			for (int j = 0; j < data.length + i.length; j++) {
				if (j < data.length) {
					intAppend[j] = (int) data[j];
				} else {
					intAppend[j] = i[j - data.length];
				}
			}
			data = intAppend;
		}
	}

	// creates an array containing data's values followed by lo's values
	public void append(long[] lo) {
		if (lo == null) {

		} else {
			double[] longAppend = new double[data.length + lo.length];
			// loop to fill array with data & lo's values
			for (int i = 0; i < data.length + lo.length; i++) {
				if (i < data.length) {
					longAppend[i] = (long) data[i];
				} else {
					longAppend[i] = lo[i - data.length];
				}
			}
			data = longAppend;
		}
	}

	// creates an array containing data's values followed by f's values
	public void append(float[] f) {
		if (f == null) {

		} else {
			double[] floatAppend = new double[data.length + f.length];
			// loop to fill array with data & f's values
			for (int i = 0; i < data.length + f.length; i++) {
				if (i < data.length) {
					floatAppend[i] = (float) data[i];
				} else {
					floatAppend[i] = f[i - data.length];
				}
			}
			data = floatAppend;
		}
	}

	// sets the values of the data array
	public void setData(int[] i) {
		if (i == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else {
			double[] intArray = new double[i.length];
			data = intArray;
			// loop to fill array with i's values
			for (int j = 0; j < i.length; j++) {
				data[j] = (double) i[j];
			}
		}
	}

	// sets the values of the data array
	public void setData(long[] lo) {
		if (lo == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else {
			double[] longArray = new double[lo.length];
			data = longArray;
			// loop to fill array with lo's values
			for (int i = 0; i < lo.length; i++) {
				data[i] = (double) lo[i];
			}
		}
	}

	// sets the values of the data array
	public void setData(float[] f) {
		if (f == null) {
			double[] emptyArray = {};
			data = emptyArray;
		} else {
			double[] floatArray = new double[f.length];
			data = floatArray;
			// loop to fill array with f's values
			for (int i = 0; i < f.length; i++) {
				data[i] = (double) f[i];
			}
		}
	}

	// checks if the data object is empty
	public boolean isEmpty() {
		boolean isEmpty;
		if (data.length == 0) {
			isEmpty = true;
		} else {
			isEmpty = false;
		}
		return isEmpty;
	}

	// return the number of times a value occurs in the array
	private double occursNumberOfTimes(double value) {
		final double THRESHOLD = 0.000000001;
		int numberOfTimes = 0;
		int i = 0;
		for (i = 0; i < data.length; i++) {
			if (Math.abs(data[i] - value) < THRESHOLD) {
				numberOfTimes++;
			}
		}
		return numberOfTimes;
	}

	// returns the variance of data
	public double variance() {
		double difference = 0;
		double squaredDifference = 0;
		double sum = 0;
		double variance = 0;
		if (isEmpty()) {
			variance = Double.NaN;
		} else {
			for (int i = 0; i < data.length; i++) {
				difference = data[i] - average();
				squaredDifference = Math.pow(difference, 2);
				sum += squaredDifference;
			}
			variance = sum / (data.length);
		}
		return variance;
	}

	// returns the square root of the variance
	public double standardDeviation() {
		double standardDeviation = 0;
		if (isEmpty()) {
			standardDeviation = Double.NaN;
		} else {
			standardDeviation = Math.sqrt(variance());
		}
		return standardDeviation;
	}

}
