/**
 * Stat.java
 * Author:  Jordyn Fulbright
 * Submission Date:  March 10th
 *
 * Purpose: This class allows the user to create arrays and have their data
 * printed. It also calculates the average of the data, the mode of the data 
 * and the maximum data value as well as the minimum data value.
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
	
//Constructor
	public Stat() { 

		this.data = new double[1];
		data[0] = 0.0;
	}
//constructor with parameter
	public Stat(double[] d) {
		int length = d.length;
		data = new double[length];

		for (int i = 0; i < length; i++) {

			data[i] = d[i];
		}

	}
//uses a loop to create a new copy of the data
	public double[] getData() {

		double dataAccessor[] = new double[data.length];

		for (int i = 0; i < data.length; i++) {

			dataAccessor[i] = data[i];

		}
		return dataAccessor;
	}
//uses a loop to set new data
	public void setData(double[] d) {

		int length = d.length;
		data = new double[length];

		for (int i = 0; i < length; i++) {

			data[i] = d[i];
		}

	}
// checks to see if the length and data of each of the arrays is the same
	public boolean equals(Stat s) {
		boolean equals = true;
		if (this.data.length == s.data.length) {

			for (int i = 0; i < data.length; i++) {

				if (this.data[i] == s.data[i]) {

				} else {
					equals = false;
				}
			}
		} else {
			equals = false;

		}

		if (equals) {

			return true;
		} else {
			return false;
		}
	}

	public String toString() {

		String dataString = "";
		for (int i = 0; i < data.length; i++) {
			dataString += data[i];
			if (i < (data.length - 1)) {

				dataString += "," + " ";
			}

		}
		return "[" + dataString + "]";

	}

	public double min() {
		double min = data[0];

		for (int i = 1; i < data.length; i++) {
			if (min < data[i]) {

			} else {

				min = data[i];
			}

		}

		return min;
	}

	public double max() {
		double max = data[0];

		for (int i = 1; i < data.length; i++) {
			if (max > data[i]) {

			} else {

				max = data[i];

			}

		}

		return max;

	}

	public double average() {
		double sum = 0;
		double average;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];

		}
		average = sum / data.length;

		return average;
	}

	public double mode() {
		int counter = 0;
		int modeCounter = 0;
		boolean none = false;
		double mode = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++)
				if (data[i] == data[j]) {

					counter++;

				} else {

				}

			if (counter > modeCounter) {

				mode = data[i];
				modeCounter = counter;
				counter = 0;
				none = false;

			} else if (counter == modeCounter) {

				none = true;
			} else {

				modeCounter = counter;
				counter = 0;
				none = true;

			}

		}
		if (none) {
			return Double.NaN;
		} else {
			return mode; // work on this
		}

	}

}
