/*
 * Stat.java
 * Author:  Claire Fortenberry 
 * Submission Date:  5 November 2021
 *
 * Purpose: This program utilizes object oriented programming to store an array of double values.
 * It contains public methods to allow a user to determine the min, max, mode, and average of the 
 * values in the array without altering the value of the private instance variable data. 
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
	
	// default constructor
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
	
	// constructor: reference to new array is assigned to data
	public Stat(double[] d) {
		double[] temp = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			temp[i] = d[i];
		}
		data = temp;
	}
	
	// getData(): retrieves values of data and returns reference to new array with the same values
	public double[] getData() {
		double[] temp = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		return temp;
	}
	
	// setData(): assigns to data a reference to the new array d
	public void setData(double[] d) {
		double[] temp = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			temp[i] = d[i];
		}
		data = temp;
	}
	
	// equals(Stat s): returns true if calling object and s have the same values and false otherwise
	public boolean equals (Stat s) {
		double[] temp = new double[s.getData().length];
		if(temp.length != data.length) { // check if length of calling object and s are compatible
			return false;
		}
		for (int i = 0; i < data.length; i++) {
			if (temp[i] != data[i]) {
				return false;
			}
		}
		return true;
	}
	
	// toString(): returns string representation of data elements
	public String toString() {
		String dataString = "[";
		for (int i = 0; i < data.length-1; i++) {
			dataString += data[i] + ", ";
		}
		
		dataString += data[data.length-1] + "]"; // adds last value of data to avoid trailing commas 
		return dataString;
	}
	
	// min(): returns minimum value of data
	public double min() {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}
	
	// max(): returns maximum value of data
	public double max() {
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}
	
	// average(): returns average of data values
	public double average() {
		double sum = 0.0;
		double average = 0.0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		average = sum / data.length;
		return average;
	}
	
	// mode(): returns mode if there is a value that occurs most frequently and Double.NaN otherwise
	public double mode() {
		int count = 0;
		int maxCount = 0;
		boolean multiMode = false;
		double mode = data[0];
		
		for (int i = 0; i < data.length; i++) {
			count = 0; // reset count after each iteration of for loop
			for(int j = 0; j < data.length; j++) {
				if (data[i] == data[j]) {
					count++; // keeps track of how many times a value occurs in the array
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mode = data[i];
				multiMode = false;
			}
			else if(count == maxCount && data[i] != mode) { // checks if there are multiple values that occur with the same frequency 
				multiMode = true;
			}
		}
			if (multiMode) {
				return Double.NaN;
			}
			else {
				return mode;
			}
	}
	
	// main method for test cases
	public static void main(String[] args) { 
		Stat stat1 = new Stat(); 
		System.out.println("stat1 data = " + stat1.toString()); 
		System.out.println("stat1 min = " + stat1.min()); 
		System.out.println("stat1 max = " + stat1.max()); 
		System.out.println("stat1 average = " + stat1.average()); 
		System.out.println("stat1 mode = " + stat1.mode()); 
		System.out.println("stat1 data = " + stat1.toString()); 
		 
		
	}

}
