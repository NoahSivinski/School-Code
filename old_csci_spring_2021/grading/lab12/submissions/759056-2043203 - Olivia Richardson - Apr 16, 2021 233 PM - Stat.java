
/*
 * CSCI1301.java
 * Author:  Olivia Richardson 
 * Submission Date:  April 16, 2021
 *
 * Purpose: This is a modified version of the previous lab that's purpose was the following:
 * 			The purpose of the lab is get familiar with UML class design
 * 			by creating multiple classes using constructors, access modifiers,
 * 			instance variables, void methods and methods which return values, methods
 *			calling other methods, getter and setter methods, and the equals() method.
 *			There are public methods with a private instance variable, which each instance 
 *			of the Stat class used in this lab, has a copy of. Data has a reference type
 *			so that it stores a reference to the memory location where the array is stored
 *			and not actually store the array. 
 *	This lab is modified to overload the methods, use different types of arrays (int, long, 
 *	float values), to handle null parameters, and create methods to compute variance and
 *	standard deviation. 
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
	// it creates a double array with a length of 0
	public Stat() {
		double[] newDataArray = {};
		data = newDataArray;

	}

	// the next lines of code construct a stat object using the values held
	// in the parameter and creates a double array of the same length. if the
	// parameter is null, an empty array should be assigned to data
	public Stat(double[] d) {
		if (d == null) {
			double[] newDataArray = {};
			data = newDataArray;
		} else {
			double[] newDataArray = new double[d.length]; // creating a new array of the same length as d & containing
															// the
															// exact same values as d
			for (int i = 0; i < d.length; i++) {
				newDataArray[i] = d[i]; // holding copies of d values
			}
			data = newDataArray; // the new reference is assigned to data
		}
	}

	// the next lines of code construct a stat object using the values held
	// in the parameter and creates a double array of the same length. if the
	// parameter is null, an empty array should be assigned to data
	public Stat(float[] f) {
		if (f == null) {
			double[] newDataArray = {};
			data = newDataArray;
		} else {
			double[] newDataArray = new double[f.length]; // creating a new array of the same length as f & containing
															// the
			// exact same values as d
			for (int i = 0; i < f.length; i++) {
				newDataArray[i] = f[i]; // holding copies of d values
			}
			data = newDataArray; // the new reference is assigned to data
		}
	}

	// the next lines of code construct a stat object using the values held
	// in the parameter and creates a double array of the same length. if the
	// parameter is null, an empty array should be assigned to data
	public Stat(int[] i) {
		if (i == null) {
			double[] newDataArray = {};
			data = newDataArray;
		} else {
			double[] newDataArray = new double[i.length]; // creating a new array of the same length as i & containing
															// the
			// exact same values as d
			for (int h = 0; h < i.length; h++) {
				newDataArray[h] = i[h]; // holding copies of d values
			}
			data = newDataArray; // the new reference is assigned to data
		}
	}

	// the next lines of code construct a stat object using the values held
	// in the parameter and creates a double array of the same length. if the
	// parameter is null, an empty array should be assigned to data
	public Stat(long[] lo) {
		if (lo == null) {
			double[] newDataArray = {};
			data = newDataArray;
		} else {
			double[] newDataArray = new double[lo.length]; // creating a new array of the same length as lo & containing
															// the
			// exact same values as d
			for (int i = 0; i < lo.length; i++) {
				newDataArray[i] = lo[i]; // holding copies of d values
			}
			data = newDataArray; // the new reference is assigned to data
		}
	}

	// the next lines of code construct a stat object using the values held
	// in the parameter and creates a double array of the same length. if the
	// parameter is null, an empty array should be assigned to data
	public void setData(float[] f) {
		if (f == null) {
			double[] newDataArray = {};
			data = newDataArray;
		} else {
			double[] newDataArray = new double[f.length]; // creating the new array with the exact elements of d
			for (int i = 0; i < f.length; i++) {
				newDataArray[i] = f[i]; // holding copies of d values
			}
			data = newDataArray; // assigns data a reference to the new array & not simply assigning d to data
		}
	}

	// the next lines of code is setter method that is used to set the values of
	// the data array. if the array used as a parameter is not null, then the method
	// creates a new double array with the exact same elements of the parameter. if
	// the
	// parameter is null, than an empty array is assigned to data.
	public void setData(double[] d) {
		if (d == null) {
			double[] newDataArray = {};
			data = newDataArray;
		} else {
			double[] newDataArray = new double[d.length]; // creating the new array with the exact elements of d
			for (int i = 0; i < d.length; i++) {
				newDataArray[i] = d[i]; // holding copies of d values
			}
			data = newDataArray; // assigns data a reference to the new array & not simply assigning d to data
		}
	}

	// the next lines of code is setter method that is used to set the values of
	// the data array. if the array used as a parameter is not null, then the method
	// creates a new double array with the exact same elements of the parameter. if
	// the parameter is null, than an empty array is assigned to data.
	public void setData(int[] i) {
		if (i == null) {
			double[] newDataArray = {};
			data = newDataArray;
		} else {
			double[] newDataArray = new double[i.length]; // creating the new array with the exact elements of d
			for (int h = 0; h < i.length; h++) {
				newDataArray[h] = i[h]; // holding copies of d values
			}
			data = newDataArray; // assigns data a reference to the new array & not simply assigning d to data
		}
	}

	// the next lines of code is setter method that is used to set the values of
	// the data array. if the array used as a parameter is not null, then the method
	// creates a new double array with the exact same elements of the parameter. if
	// the parameter is null, than an empty array is assigned to data.
	public void setData(long[] lo) {
		if (lo == null) {
			double[] newDataArray = {};
			data = newDataArray;
		} else {
			double[] newDataArray = new double[lo.length]; // creating the new array with the exact elements of d
			for (int i = 0; i < lo.length; i++) {
				newDataArray[i] = lo[i]; // holding copies of d values
			}
			data = newDataArray; // assigns data a reference to the new array & not simply assigning d to data
		}
	}

	// the next 7 lines of code use a getter method to retrieve the data
	// values and create a new array and return a reference to the new array
	public double[] getData() {
		double[] newDataArray = new double[data.length]; // creating a new array to replicate the data values
		for (int i = 0; i < data.length; i++) {
			newDataArray[i] = data[i];
		}
		return newDataArray; // returning a reference to the new array even if data is an empty array
	}

	// the next lines of code return the boolean value true if the data objects
	// of both calling Stat object and the passed Stat object s have the same values
	// (in the same order); otherwise false is returned. This is done with a for
	// loop and an if statement

	public boolean equals(Stat s) {
		if (s != null) {
			double sStat[] = s.getData();
			if (data.length != sStat.length) {
				return false;
			}
			for (int i = 0; i < data.length; i++) {
				if (data[i] != sStat[i])
					return false;
			}
			return true; // returns true if the two above conditions are not met
		} else {
			return false;
		}
	}

	// this method clears the data array and a new empty double array is created
	// and assigned to data
	public void reset() {
		double[] newDataArray = {};
		data = newDataArray;
	}

	// the next method creates a new double array containing exactly those elements
	// of data
	// followed by those of the array passed as parameter. A reference to this array
	// is assigned
	// to data. if the parameter is null, the method should do nothing and not
	// create a new array.
	public void append(int[] i) {
		if (i != null) {
			double[] newDataArray = new double[i.length + data.length];
			for (int h = 0; h < data.length; h++) {
				newDataArray[h] = data[h];
			}
			for (int h = 0; h < i.length; h++) {
				newDataArray[h + data.length] = i[h];
			}
			data = newDataArray;
		} else {

		}
	}

	// the next method creates a new double array containing exactly those elements
	// of data
	// followed by those of the array passed as parameter. A reference to this array
	// is assigned
	// to data. if the parameter is null, the method should do nothing and not
	// create a new array.
	public void append(float[] f) {
		if (f != null) {
			double[] newDataArray = new double[f.length + data.length];
			for (int i = 0; i < data.length; i++) {
				newDataArray[i] = data[i];
			}
			for (int i = 0; i < f.length; i++) {
				newDataArray[i + data.length] = f[i];
			}
			data = newDataArray;
		} else {

		}
	}

	// the next method creates a new double array containing exactly those elements
	// of data
	// followed by those of the array passed as parameter. A reference to this array
	// is assigned
	// to data. if the parameter is null, the method should do nothing and not
	// create a new array.
	public void append(long[] lo) {
		if (lo != null) {
			double[] newDataArray = new double[lo.length + data.length];
			for (int i = 0; i < data.length; i++) {
				newDataArray[i] = data[i];
			}
			for (int i = 0; i < lo.length; i++) {
				newDataArray[i + data.length] = lo[i];
			}
			data = newDataArray;
		} else {

		}
	}

	// the next method creates a new double array containing exactly those elements
	// of data
	// followed by those of the array passed as parameter. A reference to this array
	// is assigned
	// to data. if the parameter is null, the method should do nothing and not
	// create a new array.
	public void append(double[] d) {
		if (d != null) {
			double[] newDataArray = new double[d.length + data.length];
			for (int i = 0; i < data.length; i++) {
				newDataArray[i] = data[i];
			}
			for (int i = 0; i < d.length; i++) {
				newDataArray[i + data.length] = d[i];
			}
			data = newDataArray;
		} else {

		}
	}

	// the next method returns the boolean value true if the data object is empty
	// (has length of 0). otherwise it returns false
	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		} else
			return false;
	}

	// the below lines of code is used to return a String representation of the
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

	// the below lines of code return the minimum of the data array using an if
	// statement in a nested for loop
	public double min() {
		if (data.length == 0) {
			return Double.NaN;
		} else {
			double min = data[0];
			for (int i = 1; i < data.length; i++) {
				if (data[i] < min) {
					min = data[i];
				}
			}
			return min; // returns the minimum of the data array
		}
	}

	// the below lines of code return the maximum of the data array using an if
	// statement in a nested for loop
	public double max() {
		if (data.length == 0) {
			return Double.NaN;
		} else {
			double max = data[0];
			for (int i = 1; i < data.length; i++) {
				if (data[i] > max) {
					max = data[i];
				}
			}
			return max; // returns the maximum of the data array
		}
	}

	// the below lines of code return the average of the data array
	public double average() {
		if (data.length == 0) {
			return Double.NaN;
		} else {
			double mean = 0.0; // the average is a double value that returns the mean value of a given array of
								// numbers
			for (int i = 0; i < data.length; i++) {
				mean += data[i];
			}
			return (mean / data.length); // returns the mean value (also a double value) of a given array of
											// numbers
		}
	}

	// the below lines of code are to determine what the mode is, if there is
	// one, or if there are multiple modes. if there is one value that occurs more
	// frequently in data than all others, then mode() returns that value. If there
	// is more than one mode, Double.Nan is returned by mode().This is all done with
	// a for loop with a nested for loop and if statement and an if statement
	// outside of the first for loop.
	public double mode() { // the mode is the value that occurs most frequently in a collection of values
		if (data.length == 0) {
			return Double.NaN;
		} else {
			double mode = 0.0;
			int maxNumberCount = 0;
			boolean modeIsNaN = false;
			for (int i = 0; i < data.length; i++) {
				int numberCount = 0;
				for (int m = i; m < data.length; ++m) {
					if (data[i] == data[m])
						numberCount++;
				}
				if (numberCount > maxNumberCount) {
					maxNumberCount = numberCount;
					mode = data[i];
					modeIsNaN = false;
				} else if (numberCount == maxNumberCount) {
					modeIsNaN = true;
				}
			}
			if (modeIsNaN == false) {
				return mode;
			} else {
				return Double.NaN; // double.nan is more than two modes
			}
		}
	}

	// the below method returns the variance of the data in the data array. the
	// difference between the value of each element of the data array and the mean,
	// then to square this value, then calculate the sum of these squared values,
	// and then divide this sum by the number of elements in the array data. double NaN
	// is returned if the data is empty
	public double variance() {
		double variance = 0;
		double mean = average();
		if (data.length == 0) {
			return Double.NaN;
		} else {
			for (int i = 0; i < data.length; i++) {
				variance += Math.pow(data[i] - mean, 2);
			}
			return (variance / data.length);
		}
	}

	// the below method returns the standard deviation which is calculated by taking the 
	// square root of the variance value. if the data array is empty, double nan is returned
	public double standardDeviation() {
		if (data.length == 0) {
			return Double.NaN;
		} else {
			double standardDeviation = Math.sqrt(variance());
			return standardDeviation;
		}

	}

}