/*
 * Stat.java
 * Author:  Cole Lanham
 * Submission Date:  4/10/21
 *
 * Purpose: This program allowed for us to gain hands on experience with
 * creating and testing classes and methods. This class allows for us
 * to create array objects utilizing different types of constructors and
 * then obtain information such as min, max, mode, etc. This lab also pushed
 * our understanding in object oriented programming by allowing us to work with
 * arrays.
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
	//Fields:
	private double[] data;

	
	//Default Constructor
	public Stat() { 
		this.data = new double[1];
		data[0] = 0;
	}
	
	//Standard Constructor Utilizing Input Values
	public Stat(double[] d) {
		double [] dCopy = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dCopy[i] = d[i];
		}
		data = dCopy;
	}
	
	//Getter for Data
	public double[] getData() {
		double [] dCopy = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			dCopy[i] = data[i];
		}
		return dCopy;
	}
	
	//Setter for data
	public void setData(double[] d) {
		double [] dCopy = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dCopy[i] = d[i];
		}
		data = dCopy;
	}
	
	//Take compares two Stat objects and returns a boolean value if their values are equals (utilizes a threshold comparison)
	public boolean equals(Stat s) { 
		double THRESHOLD = 0.00001;
		boolean equalsIsTrue = false;
		if (this.data.length == s.data.length) {
			for (int i = 0; i < data.length; i++) {
				if (Math.abs(this.data[i] - s.data[i]) < THRESHOLD)//Need to use a Threshold comparison since we're working with doubles
					equalsIsTrue = true;
			}
		}
		return equalsIsTrue;
	}
	
	//Method to help with outputting our array
	public String toString() {
		String toReturn = "[";
		for (int i = 0; i < data.length - 1; i++) {
			toReturn += data[i] + ", ";
		}
		toReturn += data[data.length - 1] + "]";
		return toReturn; 
	}
	
	//Method for finding min value in an array
	public double min() { 
		double minnimum = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < minnimum) {
				minnimum = data[i];
			}
		}
		return minnimum;
	}
	
	//Method for finding max value in an array
	public double max() {
		double maximum = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > maximum) {
				maximum = data[i];
			}
		}
		return maximum;
	}
	
	//Method for finding average in array
	public double average() {
		double average = 0;
		for (int i = 0; i < data.length; i++) {
			average += data[i];
		}
		average = average / data.length;
		return average;
	}
	
	//Method for mode calculation and logic.
	public double mode() {
		double THRESHOLD = 0.00001;
		double mode = 0; //Actual value for the mode 
		int minModeCount = 0;
		
		for (int i = 0; i < data.length; i++) {
			int equalValues = 0; //Always one since there will always be one set of equalities.
			for (int n = 0; n < data.length; n++) {
				if (Math.abs(data[i] - data[n]) < THRESHOLD) //Equals comparison 
					++equalValues;
			}

			if ((equalValues == minModeCount) && (!(Math.abs(mode - data[i])< THRESHOLD))) {
				mode = Double.NaN;
			}
			
			else if (equalValues > minModeCount) {
				mode = data[i];
				minModeCount = equalValues;
			}

		}
			return mode;
	}
	
	
}
