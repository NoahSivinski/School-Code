/*
 * Stat.java
 * Author:  Malinda Uboh
 * Submission Date: 11/2/2021
 *
 * Purpose: This program uses the Stat class, that is based off
 * of a given UML diagram and given method descriptions, to 
 * store an array of double values declared data. This program 
 * uses these values to exceute the methods that get and set the 
 * methods held by data and compute the max, min, mode, and average.
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

	// declare instance variable of the class
	private double[] data;

	// create double array with single element 0.0
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}

	// construct a Stat object using the values held in d
	public Stat(double[] d) {

		double[] valuesOfD = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			valuesOfD[i] = d[i];
		}
		data = valuesOfD;
	}

	// retrieve the values of data
	public double[] getData() {

		double[] valuesOfData = new double[data.length];

		for (int i = 0; i < data.length; i++) {
			valuesOfData[i] = data[i];
		}
		return valuesOfData;
	}

	// set the values of the data array
	public void setData(double[] d) {

		double[] newElementsOfD = new double[d.length];

		for (int i = 0; i < d.length; i++) {
			newElementsOfD[i] = d[i];
		}
		data = newElementsOfD;
	}

	// Return true if both objects have the same values in the same order
	public boolean equals(Stat s) {

		if (data.length != s.data.length) {
			return false;
		}

		for (int i = 0; i < data.length; i++) {
			if (data[i] != s.data[i]) {
				return false;
			}
		}
		return true;

	}

	// return string representation of data elements stored in the Stat object
	public String toString() {

		String statData = "";

		for (int i = 0; i < data.length; i++) {

			if (i == data.length - 1) {
				statData += data[i];
			}

			else {
				statData += data[i] + ", ";
			}
		}
		return ("[" + statData + "]");
	}

	// return minimum value in the data array
	public double min() {

		double min = data[0];

		for (int i = 0; i < data.length; i++) {

			if (min > data[i]) {
				min = data[i];
			}

		}
		return min;

	}

	// return maximum value in the data array
	public double max() {

		double max = data[0];

		for (int i = 0; i < data.length; i++) {

			if (max < data[i]) {
				max = data[i];
			}

		}

		return max;

	}

	// return the average of the data array
	public double average() {

		double sum = 0;

		for (int i = 0; i < data.length; i++) {

			sum += data[i];

		}

		return sum / data.length;

	}

	//return the mode of the data array
	public double mode() {
		double threshold = .000000001;
		double mode = 0;
		int frequencyCountOfMostFreq = 0;
		for (int i = 0; i < data.length; i++) {
			int frequencyCounter = 1;
			for (int j = i + 1; j < data.length; j++) {
				if (Math.abs(data[j] - data[i]) < threshold) {
					frequencyCounter++;
				}
			}
			if (frequencyCounter > frequencyCountOfMostFreq) {
				frequencyCountOfMostFreq = frequencyCounter;
				mode = data[i];
			} else if (frequencyCounter == frequencyCountOfMostFreq) {
				mode = Double.NaN;
			}

		}
		return mode;

	}

}
