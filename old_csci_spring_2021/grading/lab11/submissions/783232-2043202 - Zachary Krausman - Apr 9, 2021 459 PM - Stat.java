/*
 * Stat.java
 * Author: Zachary Krausman 
 * Submission Date:  9 April 2021
 *
 * Purpose: To continue working with UML and setting up different constructors and methods. 
 * Several data sets in arrays will be tested and the methods created should correctly find
 * and display tasks like the maximum value in the data set, or the mode, etc.
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

	// The default constructor for Stat Creates a double array having one single element 0.0
	public Stat() {
		data = new double[]{0.0};
	}

	// Constructs a Stat object using values in d.
	public Stat(double[] d) {
		this.data = d;
	}

	// Getter method used to retrieve values of data
	public double[] getData() {
		double[] data1 = new double[data.length];
		for (int i = 0; i < data.length; i++) { // must loop through each item in data and copy it to new array
			data1[i] = data[i];
		}
		return data1;
	}

	// Setter method used to set the values of the data array
	public void setData(double[] d) {
		data = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			data[i] = d[i]; // passing each item from d into the array data
		}
	}

	// Returns boolean value true if the data objects of both the calling Stat object and the passed State object s have the same values
	public boolean equals(Stat s) {
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
		
		// Returns the minimum of the data set array
		public double min() {
			double min = data[0]; // set min to first number in data array
			for (int i = 0; i < data.length; i++) {
				if (min > data[i]) { // compare first number to every other number in array
					min = data[i]; // if new number smaller than previous min, set min to that new number
				}
			}
			return min;
		}
		
		// Returns the maximum of the data set array
		public double max() {
			double max = data[0]; // set max to first number in data array
			for (int i = 0; i < data.length; i++) {
				if (max < data[i]) { // compare first number to every other number in array
					max = data[i]; // if new number larger than previous max, set max to that new number
				}
			}
			return max;
		}
		
		// Returns the average of the data array
		public double average() {
			double average = 0.0;
			double total = 0.0;
			for (int i = 0; i < data.length; i++) {
				average = average + data[i];
				total++;
			}
			return average = average / total;
		}
		
		// Returns the value that occurs most frequently in the collection of values
		public double mode() {
			int modeCounter = 0; // used to check if there is a mode
			double modeNumber = 0.0; // will store number that is mode
//			int noMode = 0; // didn't have time to fix NaN issue
			
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
//					noMode++;
				}
			}
			if (modeCounter == 0) { // no mode
				return Double.NaN;
			}
			return modeNumber; // returns the number that is the mode
		}
}
