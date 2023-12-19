/*
 * Stat.java
 * Author:  Angel Marsh 
 * Submission Date:  April 10, 2021
 *
 * Purpose: The purpose of this program is to manipulate an array
 * of double values and to compute and display the minimum, maximum,
 * mode, and average of these values.
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

	// default constructor for Stat that creates a double array containing only 0.0
	public Stat() {
		double[] array = { 0.0 };
		data = array;
	}

	// creates a double array of d's length & assigns the reference to data
	public Stat(double[] d) {
		double[] newArray = new double[d.length];
		data = newArray;
		// loop to fill array with d's values
		for (int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
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
		double setterArray[] = new double[d.length];
		int i = 0;
		// loop to fill array w/ d's values
		while (i < d.length) {
			setterArray[i] = d[i];
			i++;
		}
		data = setterArray;
	}

	// checks if the calling Stat object & passed Stat object s's data objects have
	// the same values (in the same order)
	public boolean equals(Stat s) {
		boolean elementsAreEqual = true;
		if (getData().length != s.getData().length) {
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
		if (data.length == 0) {
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
		double min = data.length;
		// case for if the array is empty
		if (data.length == 0) {
			min = Double.NaN;
		} else {
			for (int i = data.length - 1; i > -1; i--) {
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
		if (data.length == 0) {
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
		double sum = 0;
		for (int index = 0; index < data.length; index++) {
			sum = sum + data[index];
		}
		double average = sum / data.length;
		return average;
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
		if (data.length == 0) {
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

}
