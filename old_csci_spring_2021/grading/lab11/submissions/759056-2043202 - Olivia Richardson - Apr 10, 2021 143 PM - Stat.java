
/*
 * CSCI1301.java
 * Author:  Olivia Richardson 
 * Submission Date:  April 10, 2021
 *
 * Purpose: The purpose of the lab is get familiar with UML class design
 * by creating multiple classes using constructors, access modifiers,
 * instance variables, void methods and methods which return values, methods
 * calling other methods, getter and setter methods, and the equals() method.
 * There are public methods with a private instance variable, which each instance 
 * of the Stat class used in this lab, has a copy of. Data has a reference type
 * so that it stores a reference to the memory location where the array is stored
 * and not actually store the array. 
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

	// the next 4 lines of code are the default constructor for the Stat class
	// it creates a double array with a single element
	public Stat() {
		double[] newDataArray = { 0.0 };
		data = newDataArray;

	}

	// the next 7 lines of code construct a stat object using the values held
	// in d and creates a double array of the same length
	public Stat(double[] d) {
		double[] newDataArray = new double[d.length]; // creating a new array of the same length as d & containing the
														// exact same values as d
		for (int i = 0; i < d.length; i++) {
			newDataArray[i] = d[i]; // holding copies of d values
		}
		data = newDataArray; // the new reference is assigned to data
	}

	// the next 7 lines of code use a getter method to retrieve the data
	// values and create a new array and return a reference to the new array
	public double[] getData() {
		double[] newDataArray = new double[data.length]; // creating a new array to replicate the data values
		for (int i = 0; i < data.length; i++) {
			newDataArray[i] = data[i];
		}
		return newDataArray; // returning a reference to the new array
	}

	// the next 7 lines of code is setter method that is used to set the values of
	// the data array and creates a new array of the exact elements of d and assigns
	// data a reference to the newly created array
	public void setData(double[] d) {
		double[] newDataArray = new double[d.length]; // creating the new array with the exact elements of d
		for (int i = 0; i < d.length; i++) {
			newDataArray[i] = d[i]; // holding copies of d values
		}
		data = newDataArray; // assigns data a reference to the new array & not simply assigning d to data
	}

	// the next 10 lines of code return the boolean value true if the data objects
	// of both calling Stat object and the passed Stat object s have the same values
	// (in the same order); otherwise false is returned. This is done with a for
	// loop and an if statement
	public boolean equals(Stat s) {
		double sStat[] = s.getData();
		if (data.length != sStat.length)
			return false;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != sStat[i])
				return false;
		}
		return true; // returns true if the two above conditions are not met
	}

	// the below 14 lines of code is used to return a String representation of the
	// data elements stored in the Stat object based on the samples listed in the
	// lab instructions guidelines for formatting
	public String toString() {
		String newDataArray = "";
		newDataArray += "["; // "[" is added to adhere to formatting guidelines
		for (double i = 0.0; i < data.length; i++) { // the double is used so the data is printed in the correct format
			newDataArray += data[(int) i]; // int cast used so data is printed in the #.# format
			if (i != data.length - 1) {
				newDataArray += ", "; // "," is added to adhere to formatting guidelines
			}
		}

		newDataArray += "]"; // "]" is added to adhere to formatting guidelines

		return newDataArray; // returns the string representation of the data stored in the stat object
	}

	// the below 9 lines of code return the minimum of the data array using an if
	// statement in a nested for loop
	public double min() {
		double min = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min; // returns the minimum of the data array
	}

	// the below 9 lines of code return the maximum of the data array using an if
	// statement in a nested for loop
	public double max() {
		double max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max; // returns the maximum of the data array
	}

	// the below 7 lines of code return the average of the data array
	public double average() {
		double averageOfData = 0.0; // the average is a double value that returns the mean value of a given array of
									// numbers
		for (int i = 0; i < data.length; i++) {
			averageOfData += data[i];
		}
		return averageOfData / data.length; // returns the mean value (also a double value) of a given array of numbers
	}

	// the below 19 lines of code are to determine what the mode is, if there is
	// one, or if there are multiple modes. if there is one value that occurs more
	// frequently in data than all others, then mode() returns that value. If there
	// is more than one mode, Double.Nan is returned by mode().This is all done with
	// a for loop with a nested for loop and if statement and an if statement
	// outside of the first for loop.
	public double mode() { // the mode is the value that occurs most frequently in a collection of values
		double mode = 0.0;
		int maxNumberCount = 0;
		for (int i = 0; i < data.length; i++) {
			int numberCount = 0;
			for (int m = 0; m < data.length; ++m) {
				if (data[i] == data[m])
					numberCount++;
			}
			if (numberCount > maxNumberCount) {
				maxNumberCount = numberCount;
				mode = data[i];
			}
		}
		if (maxNumberCount >= 1) {
			return mode; // double.nan is more than two modes
		} else
			return Double.NaN;
	}

//TODO example 5 mode is wrong
	public static void main(String[] args) { // needed for the example main methods to run
		// example main methods go below this comment line

	}

}