/*
 * Stat.java
 * Author:  Jacob Glover
 * Submission Date:  4/10/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program
 * compiles multiple arrays of numbers and uses different
 * methods to calculate statistics.
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
	
	public Stat() { // constructor
		double[] data = new double[1];
		data[0] = 0;
		this.data = data;
	}
	
	public Stat(double[] d) { // constructor with one parameter
		double[] data = new double[d.length];
		for (int i = 0; i < data.length; i++) {
			data[i] += d[i];
		}
		this.data = data;
	}
	
	public double[] getData() {  // gets the array
		double[] getArray = new double[data.length]; 
		for (int i = 0; i < data.length; i++) {
			getArray[i] = getArray[i] + data[i];
		} return getArray;
		
	} 
	
	public void setData(double[] d) { // sets the array
		double[] getArray = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			getArray[i] += d[i];
		} data = getArray;
	}
	
	public boolean equals(Stat s) { // compares the arrays
		if (getData().length != s.getData().length) {
			return false;
		}
		double THRESHOLD = .0000000001; // threshold for comparing doubles in the array
		for (int i = 0; i < getData().length; i++) {
			if (getData()[i] - s.getData()[i] < THRESHOLD) { // compares the two arrays
		} else return false;
	} return true;
}
	
	public String toString() { // prints array to user
		String toString = "[";
		
		for (int i = 0; i < data.length; i++) {
			toString += data[i];
			if ((data.length > 1) && (i < data.length-1)) { // for formatting purposes
				toString += ", ";
			}
		} 
		toString += "]";
		return toString;
	}
	
	public double min() { // collects the min number
		double min = data[0];
		for (int i = 0; i < data.length; i++) {	
			if (data[i] < min){
				min = data[i];
			} 
		} return min;
	}
	
	public double max() { // collects the max number
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max){
				max = data[i];
			}
		} return max;
	}
	
	public double average() { // collects the average
		double numbersToAverage = 0;
		for (int i = 0; i < data.length; i++) {
			numbersToAverage += data[i];
		} return numbersToAverage / data.length;
	}
	
	public double mode() { // collects the most repeated number
		int maxNumberCount = 0; // keeps track of how many numbers the mode has
		double maxNumber = data[0]; // the mode
		boolean multipleMaximums = false; // boolean to determine whether there is a mode

		for (int i = 0; i < data.length; i++) { // loop to check the data
			int numberCount = 0;
			for (int h = 0; h < data.length; h++) { // loop that collects the most displayed numbers
				if (data[i] == data[h]) {
					numberCount++;
				} 
			} 
			if ((data[i] != maxNumber) && (numberCount == maxNumberCount)) { // if there is more than one mode
				multipleMaximums = true;
			} 
			
			if (numberCount > maxNumberCount) { // if there is only one current mode
				maxNumber = data[i];
				maxNumberCount = numberCount;
				multipleMaximums = false;
			} 
			
		} if ((data.length == 0) || (multipleMaximums)){ // there is no mode
			return Double.NaN;
		}
		return maxNumber;
	}
}
