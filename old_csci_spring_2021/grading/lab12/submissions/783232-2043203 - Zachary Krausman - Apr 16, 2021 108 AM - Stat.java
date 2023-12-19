/*
 * Stat.java
 * Author: Zachary Krausman 
 * Submission Date:  16 April 2021
 *
 * Purpose: To continue setting up different constructors and methods and to work with method overloading.
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

	// -------------------------
	// Constructors
	// -------------------------
	// The default constructor for Stat Creates a double array having one single element 0.0
	public Stat() {
		data = new double[]{};
	}

	// Constructs a Stat object using values in d of type double.
	public Stat(double[] d) {
		this.data = d;
	}

	// Constructs a Stat object using values in d of type int
	public Stat(int[] i) {
		if (i == null) { // if no input given (null) an empty array is assigned to data
			this.data = new double[] {}; 
		}
		this.data = new double[i.length]; // make an array of length d
		for (int j = 0; j < data.length; j++) {
			this.data[j] = i[j]; // pass copy of values from input array into data
		}
	}

	// Constructs a Stat object using values in d of type long
	public Stat(long[] lo) {
		if (lo == null) { // if no input given (null) an empty array is assigned to data
			this.data = new double[] {}; 
		}
		this.data = new double[lo.length]; // make an array of length d
		for (int i = 0; i < data.length; i++) {
			this.data[i] = lo[i]; // pass copy of values from input array into data
		}
	}

	// Constructs a Stat object using values in d of type float
	public Stat(float[] f) {
		if (f == null) { // if no input given (null) an empty array is assigned to data
			this.data = new double[] {}; 
		}
		this.data = new double[f.length]; // make an array of length d
		for (int i = 0; i < data.length; i++) {
			this.data[i] = f[i]; // pass copy of values from input array into data
		}
	}


	// -------------------------
	// Setters
	// -------------------------
	// Setter method used to set the values of the data array type float
	public void setData(float[] f) {
		if (f == null) { // if no input given (null) an empty array is assigned to data
			this.data = new double[] {}; 
		}
		if (f != null) {
			this.data = new double[f.length]; // make an array of length d
			for (int i = 0; i < data.length; i++) {
				this.data[i] = f[i]; // pass copy of values from input array into data
			}
		}
	}

	// Setter method used to set the values of the data array type double
	public void setData(double[] d) {
		if (d == null) { // if no input given (null) an empty array is assigned to data
			this.data = new double[] {}; 
		}
		if (d != null) {
			this.data = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				data[i] = d[i]; // passing each item from d into the array data
			}
		}
	}

	// Setter method used to set the values of the data array type int
	public void setData(int[] i) {
		if (i == null) { // if no input given (null) an empty array is assigned to data
			this.data = new double[] {}; 
		}
		if (i != null) {
			this.data = new double[i.length]; // make an array of length d
			for (int j = 0; j < data.length; j++) {
				this.data[j] = i[j]; // pass copy of values from input array into data
			}
		}
	}

	// Setter method used to set the values of the data array type long
	public void setData(long[] lo) {
		if (lo == null) { // if no input given (null) an empty array is assigned to data
			this.data = new double[] {}; 
		}
		if (lo != null) {
			this.data = new double[lo.length]; // make an array of length d
			for (int i = 0; i < data.length; i++) {
				this.data[i] = lo[i]; // pass copy of values from input array into data
			}
		}
	}


	// -------------------------
	// Getter
	// -------------------------
	// Getter method used to retrieve values of data
	public double[] getData() {
		double[] data1 = new double[data.length];
		for (int i = 0; i < data.length; i++) { // must loop through each item in data and copy it to new array
			data1[i] = data[i];
		}
		return data1;
	}


	// -------------------------
	// Equals
	// -------------------------
	// Returns boolean value true if the data objects of both the calling Stat object and the passed State object s have the same values
	public boolean equals(Stat s) {
		if (s != null) {
			double[] data1 = s.getData();
			if (data.length != s.getData().length) {
				return false; // if the lengths don't equal, return false
			}
			for (int i = 0; i < s.getData().length; i++) {
				if (data[i] != data1[i]) { // checks for same order
					return false;
				}
			}
			return true; // if lengths are the same return true
		}
		else {
			return false;
		}
	}


	// -------------------------
	// Reset
	// -------------------------
	// Clears the data array and a new empty double array is created and assigned to data
	public void reset() {
		data = new double[] {};
	}


	// -------------------------
	// Appenders
	// -------------------------
	// These create new double arrays containing exactly those elements of data followed by those of the array passed as parameter.
	public void append(int[] i) {
		if (i != null) {
			double[] dataAppend = new double[data.length + i.length]; // make array of length data + i
			for (int j = 0; j < data.length; j++) { // transfer elements from data into dataAppend array
				dataAppend[j] = data[j];
			}
			for (int k = 0; k < i.length; k++) { // transfer elements from i into dataAppend array
				dataAppend[k + data.length] = i[k]; // start indexed after elements from data array
			}
			data = dataAppend; // put elements from dataAppend array into data array
		}
	}

	public void append(float[] f) {
		if (f != null) {
			double[] dataAppend = new double[data.length + f.length]; // make array of length data + f
			for (int j = 0; j < data.length; j++) { // transfer elements from data into dataAppend array
				dataAppend[j] = data[j];
			}
			for (int k = 0; k < f.length; k++) { // transfer elements from f into dataAppend array
				dataAppend[k + data.length] = f[k]; // start indexed after elements from data array
			}
			data = dataAppend; // put elements from dataAppend array into data array
		}
	}

	public void append(long[] lo) {
		if (lo != null) {
			double[] dataAppend = new double[data.length + lo.length]; // make array of length data + lo
			for (int j = 0; j < data.length; j++) { // transfer elements from data into dataAppend array
				dataAppend[j] = data[j];
			}
			for (int k = 0; k < lo.length; k++) { // transfer elements from lo into dataAppend array
				dataAppend[k + data.length] = lo[k]; // start indexed after elements from data array
			}
			data = dataAppend; // put elements from dataAppend array into data array
		}
	}

	public void append(double[] d) {
		if (d != null) {
			double[] dataAppend = new double[data.length + d.length]; // make array of length data + d
			for (int j = 0; j < data.length; j++) { // transfer elements from data into dataAppend array
				dataAppend[j] = data[j];
			}
			for (int k = 0; k < d.length; k++) { // transfer elements from d into dataAppend array
				dataAppend[k + data.length] = d[k]; // start indexed after elements from data array
			}
			data = dataAppend; // put elements from dataAppend array into data array
		}
	}


	// -------------------------
	// isEmpty
	// -------------------------
	// Check to see if the data object is empty
	public boolean isEmpty() {
		if (data.length == 0) {
			return true; // empty data object, return true
		}
		else {
			return false;
		}
	}


	// -------------------------
	// toString
	// -------------------------
	// Returns String representation of the data elements stored in the Stat object
	public String toString() {
		String printer = "[";
		for (int i = 0; i < data.length; i++) {
			if (i < data.length - 1) {
				printer = printer + data[i] + ", ";
			}
			else{ // makes sure last value in data array doesn't have a comma after it
				printer = printer + data[i];  
			}
		}
		printer = printer + "]";
		return printer;
	}


	// -------------------------
	// Minimum
	// -------------------------
	// Returns the minimum of the data set array
	public double min() {
		if (this.isEmpty() == true) { // empty array, no minimum found
			return Double.NaN;
		}
		double min = data[0]; // set min to first number in data array
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) { // compare first number to every other number in array
				min = data[i]; // if new number smaller than previous min, set min to that new number
			}
		}
		return min;
	}


	// -------------------------
	// Maximum
	// -------------------------
	// Returns the maximum of the data set array
	public double max() {
		if (this.isEmpty() == true) { // empty array, no maximum found
			return Double.NaN;
		}
		double max = data[0]; // set max to first number in data array
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) { // compare first number to every other number in array
				max = data[i]; // if new number larger than previous max, set max to that new number
			}
		}
		return max;
	}


	// -------------------------
	// Average
	// -------------------------
	// Returns the average of the data array
	public double average() {
		if (this.isEmpty() == true) { // empty array, no average found
			return Double.NaN;
		}
		double average = 0.0;
		double total = 0.0;
		for (int i = 0; i < data.length; i++) {
			average = average + data[i]; // sum of array elements
			total++;
		}
		return average = average / total;
	}


	// -------------------------
	// Mode
	// -------------------------
	// Returns the value that occurs most frequently in the collection of values
	public double mode() {		
		int modeCounter = 0; // used to check if there is a mode
		double modeNumber = 0.0; // will store number that is mode
		boolean noMode = false;

		for (int i = 0; i < data.length; i++) { // loop to cycle through entire array
			int counter = 0; // resets on each iteration to see if there is a number with a higher occurrence and therefore the new mode than the last occurrence

			for (int j = 0; j < i; j++) { // loop to check each number against the previous numbers
				if (data[j] == data[i]) { // compares the numbers in data against every other number and itself
					counter++; // if the number is the same, there is another occurrence and perhaps a new mode
				}
			}
			if (counter > modeCounter ) { // if there is a mode, the modeCounter updates
				modeCounter = counter; // the modeCounter is now the highest amount of a certain number, this will now be used to check for another mode
				modeNumber = data[i]; // stores the number of array data that is the mode
			}
		}
		if (modeCounter == 0 || noMode == true) { // no mode
			return Double.NaN;
		}
		return modeNumber; // returns the number that is the mode
	}


	// -------------------------
	// Occur Number Of Times
	// -------------------------
	// Help mode find the number of times a value appears (was unsure how to make it work properly in program)
	private int occursNumberOfTimes(double value) {
		int occurs = 0; // number of times an element appears in the array
		for (int i = 0; i < data.length; i++) { 
			if (data[i] == value) {
				occurs++;
			}	
		}
		return occurs;
	}


	// -------------------------
	// Variance
	// -------------------------
	// Returns variance of data array!
	public double variance() {
		double calcOne = 0.0; // difference between the value of each element of the data array and mean, then squared
		double calcTwo = 0.0; // sum of squared values
		double averageVar = average(); // to save time from having to recalculate repeatedly
		for (int i = 0; i < data.length; i++) {
			calcOne = Math.pow((data[i] - averageVar), 2);
			calcTwo += calcOne;
		}
		return calcTwo / data.length; // calculated variance
	}


	// -------------------------
	// Standard Deviation
	// -------------------------
	// Returns Standard Deviation of the data in the data array
	public double standardDeviation() {
		return Math.sqrt(this.variance());
	}
}
