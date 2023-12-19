/*
 * Stat.java
 * Author:  Nataly Garcia 
 * Submission Date: April 10th 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This codes allows the user to
 * use different methods the coder has written. For example, if
 * the user wanted to find the average, the user would then use the
 * average() method. Using constructors and other methods, the user 
 * could change values of an array, etc.
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

	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}

	public Stat(double[] d) {
		data = new double[d.length];

		for (int x = 0; x < d.length; x++) {
			data[x] = d[x];
		}
	}

	public double[] getData(){ //This method copies the array rather than copying the address.
		double[] data2 = new double[data.length];

		for (int x = 0; x < data.length; x++) {
			data2[x] = data[x];
		}
		return data2;
	}

	public void setData(double[] d) { //Sets the new array exact to the first array.
		data = new double[d.length];

		for (int x = 0; x < d.length; x++) {
			data[x] = d[x];
		}
	}

	public boolean equals(Stat s) { //Checks to see if every value is equal in the arrays.
		double[] sData = s.getData();
		if (data.length == sData.length) {
			for (int x= 0; x < data.length; x++) {
				if (data[x] != sData[x]) {
					return false;
				}

			}
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() { //Prints out the array using commas and brackets.

		String myString = "[";
		for (int x = 0; x < data.length; x++) {
			myString += data[x] + ", ";
		}
		myString = myString.substring(0, myString.length() - 2) + "]";
		return myString;
	}

	public double min() { //Finds the minimum individually.
		double min = data[0];
		for (int x = 0; x < data.length; x++) {
			if (data[x] < min) {
				min = data[x];
			}
		}
		return min;
	}

	public double max() { //Finds the maximum individually.
		double max = data[0];
		for (int x = 0; x < data.length; x++) {
			if (data[x] > max) {
				max = data[x];
			}
		}
		return max;
	}

	public double average() { //Finds the sum of the array and then divides by the array length.
		double sumOfData = 0;

		for (int x = 0; x < data.length; x++) {
			sumOfData += data[x];
		}
		double average = sumOfData / (data.length);
		return average;
	}

	public double mode() { //First, it finds the largest count of one value, then it scans to see if there are the same count for any other value.
		double count = 0;
		double value = 0;

		for (int x = 0; x < data.length; x++) {
			double currentCount = 0;
			for (int y = 0; y < data.length; y++) {
				if (data[x] == data[y]) {
					currentCount += 1;
				}
			}
			if (currentCount > count) {
				value = data[x];
				count = currentCount;
			}
		}

		for (int x = 0; x < data.length; x++) {
			double currentCount = 0;
			for (int y = 0; y < data.length; y++) {
				if (data[x] == data[y]) {
					currentCount += 1;
				}
			}
			if ((currentCount == count) && (value != data[x])) {
				return Double.NaN;
			}
		}

		return value;
	}

}
