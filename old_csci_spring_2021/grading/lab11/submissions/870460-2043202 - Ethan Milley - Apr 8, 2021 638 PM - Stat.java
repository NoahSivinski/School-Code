/*
 * Stat.java
 * Author:  Ethan Milley 
 * Submission Date:  4/8/21
 *
 * Purpose: This program is a public class that is supposed to be 
 * used in a main method to create arrays of a length defined by the
 * user and that holds values that are determined by the user. It 
 * also can find the min, max, mean, and mode of the arrays and 
 * find if the arrays are equal to each other. It also can change
 * the values of an already created array. The class has 2
 * constructors: a default and one that creates an array with a 
 * length defined by the user. 
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

	private double[] data; //Creates variable: data
	
	public Stat() { //Default constructor
		double[] array = new double[1];
		array[0] = 0.0;
		data = array;
	}
	
	public Stat(double[] d) {//Constructor that creates an array the length of d
		double[] array = new double[d.length];
		for (int i = 0; (i < d.length); i++) {
			array[i] = d[i];
		}
		data = array;
	}
	
	public double[] getData() {//Method for returning the values in the variable: data
		double[] array = new double[data.length];
		
		for (int i = 0; (i < data.length); i++) {
			array[i] = data[i];
		}
		return array;
	}
	
	public void setData(double[] d){//Sets the values in the variable: "data" to new specified values
		double[] array = new double[d.length];
		for (int i = 0; (i < d.length); i++) {
			array[i] = d[i];
		}
		data = array;
	}
	
	public boolean equals(Stat s){//Compares two arrays and finds if they are equal to each other
		boolean equals = true;
		
		if (data.length == (s.data).length) {
			for (int i = 0; (i < data.length) && (equals); i++) {
				if (data[i] == s.data[i]) {
					equals = true;
				}
				else {
					equals = false;
				}
			}
		}
		else {
			equals = false;
		}
		
		return equals;
	}
	
	
	public String toString() {//Returns the variable: "data" as a string
		String dataString = "[";
		
		if (data.length == 1) {
		dataString += String.valueOf(data[0]);	
		}
		else {//Converts and formats the values of variable: "data" as a string
			for (int i = 0; (i < data.length); i++) {
				if (i == (data.length - 1)) {
					dataString += String.valueOf(data[i]);
				}
				else {
					dataString += (String.valueOf(data[i]) + ", ");
				}
			}
		}
		dataString += "]";
		
		return dataString;
	}
	
	public double min() {//Returns minimum value in the array
		double minimum = data[0];
		
		for (int i = 0; (i < data.length); i++) {//Finds minimum value
			if (data[i] < minimum) {
				minimum = data[i];
			}
		}
		
		return minimum;
	}
	
	public double max() {//Returns maximum value in the array
		double maximum = data[0];
		
		for (int i = 0; (i < data.length); i++) {//Finds maximum value
			if (data[i] > maximum) {
				maximum = data[i];
			}
		}
		
		return maximum;
	}
	
	public double average() {//Returns the average of the array
		double average = 0;
		
		for (int i = 0; (i < data.length); i++) {//Adds all values in the array together
			average += data[i];
		}
		
		average = (average/data.length);//Finds the average
		
		return average;
	}
	
	public double mode() {
		int tempCount = 0;//Used to compare the amount of times a variable appears
		int modeCount = 0;
		double mode = 0;
		int extraModeCount = 0;//Used if multiple values appear more than once
		
		for (int i = 0; (i < data.length); i++) {//Finds the mode
			tempCount = 0;
			
			for (int c = 0; (c < data.length); c++) {
				if (data[i] == data[c]) {
					tempCount++;
				}
			}
			if ((tempCount == modeCount) && (data[i] != mode)) {
				extraModeCount = tempCount;
			}
			else if (tempCount > modeCount) {
				modeCount = tempCount;
				mode = data[i]; 
			}
		}
		if (modeCount == extraModeCount) {//Used if more then one value appears the same amount of times as another value 
			mode = Double.NaN;
		}
		
		return mode;
	}
}
