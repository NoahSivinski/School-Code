/*
 * Stat.java
 * Author:  Ethan Milley 
 * Submission Date:  4/8/21
 *
 * Purpose: This program is a public class that is supposed to be 
 * used in a main method to create arrays of a length defined by the
 * user and that holds values that are determined by the user. It 
 * also can find the min, max, mean, mode, variance, and standard
 * deviation of the arrays and finds if the arrays are equal to each 
 * other or empty. It also can change the values of an already created
 * array and add values to the array.The class has 5 constructors: a 
 * default and 4 that create an array with a length defined by the user 
 * and fills the array with double versions of the original values in 
 * the data set. 
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
		double[] array = new double[0];
		data = array;
	}
	
	public Stat(double[] d) {//Constructor that creates an array the length of d and fills it with the values in the data set
		if (d.length == 0) {
			double[] array = new double[0];
			data = array;
		}
		else {
			double[] array = new double[d.length];
			for (int i = 0; (i < d.length); i++) {
				array[i] = d[i];
			}
			data = array;
		}
	}
	
	public Stat(float[] f) {//Constructor that creates an array the length of f and fills it with the values in the data set
		if (f.length == 0) {
			double[] array = new double[0];
			data = array;
		}
		else {
			double[] array = new double[f.length];
			for (int i = 0; (i < f.length); i++) {
				array[i] = f[i];
			}
			data = array;
		}
	}
	
	public Stat(int[] i) {//Constructor that creates an array the length of i and fills it with the values in the data set
		if (i.length == 0) {
			double[] array = new double[0];
			data = array;
		}
		else {
			double[] array = new double[i.length];
			for (int c = 0; (c < i.length); c++) {
				array[c] = i[c];
			}
			data = array;
		}
	}
	
	
	public Stat(long[] lo) {//Constructor that creates an array the length of lo and fills it with the values in the data set
		if (lo.length == 0) {
			double[] array = new double[0];
			data = array;
		}
		else {
			double[] array = new double[lo.length];
			for (int i = 0; (i < lo.length); i++) {
				array[i] = lo[i];
			}
			data = array;
		}
	}
	
	public void setData(float[] f){//Sets the values in the variable: "data" to new specified values
		if ((f == null) || (f.length == 0)) {
			double[] array = new double[0];
			data = array;
		}
		else {
			double[] array = new double[f.length];
			for (int i = 0; (i < f.length); i++) {
				array[i] = f[i];
			}
			data = array;
		}
	}
	
	public void setData(double[] d){//Sets the values in the variable: "data" to new specified values
		if ((d == null) || (d.length == 0)) {
			double[] array = new double[0];
			data = array;
		}
		else {
			double[] array = new double[d.length];
			for (int i = 0; (i < d.length); i++) {
				array[i] = d[i];
			}
			data = array;
		}
	}
	
	public void setData(int[] i){//Sets the values in the variable: "data" to new specified values
		if ((i == null) || (i.length == 0)) {
			double[] array = new double[0];
			data = array;
		}
		else {
			double[] array = new double[i.length];
			for (int c = 0; (c < i.length); c++) {
				array[c] = i[c];
			}
			data = array;
		}
	}
	
	public void setData(long[] lo){//Sets the values in the variable: "data" to new specified values
		if ((lo == null) || (lo.length == 0)) {
			double[] array = new double[0];
			data = array;
		}
		else {
			double[] array = new double[lo.length];
			for (int i = 0; (i < lo.length); i++) {
				array[i] = lo[i];
			}
			data = array;
		}
	}
	
	public double[] getData() {//Method for returning the values in the variable: data
		
		if (data.length == 0) {
			double[] array = new double[0];
			return array;
		}
		
		else {
			double[] array = new double[data.length];
		
			for (int i = 0; (i < data.length); i++) {
				array[i] = data[i];
			}
			return array;
		}	
	}
	
	public boolean equals(Stat s){//Compares two arrays and finds if they are equal to each other
		boolean equals = true;
		
		if (s == null) {
			equals = false;
		}
		else if (data.length == (s.data).length) {
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
	
	public void reset() {//Creates a new empty array and sets it to the variable: data
		double[] array = new double[0];
		data = array;
	}
	
	public void append(int[] i) {//Adds user selected values of type int to the array
		if ((i != null) && (i.length > 0)) {
			double[] array = new double[data.length + i.length];
			
			for (int c = 0; (c < data.length); c++) {
				array[c] = data[c];
			}
			for (int c = data.length; (c < array.length); c++) {
				array[c] = i[c - data.length];
			}
			data = array;
		}
	}
	
	public void append(float[] f) {//Adds user selected values of type float to the array
		if ((f != null) && (f.length > 0)) {
			double[] array = new double[data.length + f.length];
			
			for (int c = 0; (c < data.length); c++) {
				array[c] = data[c];
			}
			for (int c = data.length; (c < array.length); c++) {
				array[c] = f[c - data.length];
			}
			data = array;
		}
	}
	
	public void append(long[] lo) {//Adds user selected values of type long to the array
		if ((lo != null) && (lo.length > 0)) {
			double[] array = new double[data.length + lo.length];
			
			for (int c = 0; (c < data.length); c++) {
				array[c] = data[c];
			}
			for (int c = data.length; (c < array.length); c++) {
				array[c] = lo[c - data.length];
			}
			data = array;
		}
	}
	
	public void append(double[] d) {//Adds user selected values of type double to the array
		if ((d != null) && (d.length > 0)) {
			double[] array = new double[data.length + d.length];
			
			for (int c = 0; (c < data.length); c++) {
				array[c] = data[c];
			}
			for (int c = data.length; (c < array.length); c++) {
				array[c] = d[c - data.length];
			}
			data = array;
		}
	}
	
	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {//Returns the variable: "data" as a string
		if (data.length == 0) {
			return "[]";
		}
		else {
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
	}
	
	public double min() {//Returns minimum value in the array
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double minimum = data[0];
			
			for (int i = 0; (i < data.length); i++) {//Finds minimum value
				if (data[i] < minimum) {
					minimum = data[i];
				}
			}
			
			return minimum;
		}
		
	}
	
	public double max() {//Returns maximum value in the array
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double maximum = data[0];
			
			for (int i = 0; (i < data.length); i++) {//Finds maximum value
				if (data[i] > maximum) {
					maximum = data[i];
				}
			}
			
			return maximum;
		}
	}
	
	public double average() {//Returns the average of the array
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double average = 0;
			
			for (int i = 0; (i < data.length); i++) {//Adds all values in the array together
				average += data[i];
			}
			
			average = (average/data.length);//Finds the average
			
			return average;
		}
	}
	
	public double mode() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			int tempCount = 0;//Used to compare the amount of times a variable appears
			int modeCount = 0;
			double mode = 0;
			int extraModeCount = 0;//Used if multiple values appear more than once
			
			for (int i = 0; (i < data.length); i++) {//Finds the mode
				tempCount = occuresNumberOfTimes(data[i]);
				
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
	
	private int occuresNumberOfTimes(double value) {
		int count = 0;
		
		for (int c = 0; (c < data.length); c++) {
			if (value == data[c]) {
				count++;
			}
		}
		return count;
	}
	
	public double variance() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double[] array = new double[data.length];
			
			double variance = 0;
			
			double average = 0;
			for (int i = 0; (i < data.length); i++) {//Adds all values in the array together
				average += data[i];
			}
			average = (average/data.length);//Finds the average
			
			for (int i = 0; (i < data.length); i++) {//fills an array that holds the squared distance between each value in "data" and the mean
				array[i] = data[i] - average;
				array[i] = (array[i] * array[i]);
			}
			
			for (int i = 0; (i < array.length); i++) {//Adds all values in the array together
				variance += array[i];
			}
			
			variance = (variance / data.length);
			
			return variance;
		}
	}
	
	public double standardDeviation() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double[] array = new double[data.length];
			
			double variance = 0;
			
			double average = 0;
			for (int i = 0; (i < data.length); i++) {//Adds all values in the array together
				average += data[i];
			}
			average = (average/data.length);//Finds the average
			
			for (int i = 0; (i < data.length); i++) {//fills an array that holds the squared distance between each value in "data" and the mean
				array[i] = data[i] - average;
				array[i] = (array[i] * array[i]);
			}
			
			for (int i = 0; (i < array.length); i++) {//Adds all values in the array together
				variance += array[i];
			}
			
			variance = (variance / data.length);
			
			return (Math.pow(variance, 0.5));
		}
	}
}
