/*
 * Stat.java
 * Author:  Samir Hadi Cisneros 
 * Submission Date:  04/16/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program is a builds off of lab 11's Stat Class and uses of methods Stat, getData, 
 * setData, equals, toString, min, max, average, mode, append, isEmpty, reset, occursNumberOfTimes,
 * variance, and standardDeviation. The class also creates a private instance variable of data. 
 * This class stores all of the integers in the data set in arrays.
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
 * 
 * I Agree
 */

// Defines the class Stat

public class Stat {

	// Private double array data

	private double data[];

	// Cconstructor that creates an array which holds doubles starting with 0.0

	public Stat() {
		data = new double[0];
	} 

	
	// Creates a stat object using the numbers from d. 
	//an array holding doubles is then created. It has the same length as d and contains copies of the values of d.

	public Stat(double[] d) {
		if (d == null) {
			this.data = new double[0];
			return;
		} 
		else {
			double[] data = new double[d.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = d[c];
			} 
			this.data = data;
		} 
	} 

	
	//creates another stat object this time using float values
	//this creates an array of f and holds the exact values of f

	public Stat(float[] f) {
		if (f == null) {
			this.data = new double[0];
			return;
		} 
		else {
			double[] data = new double[f.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (float) f[c];
			} 
			this.data = data;
		} 
	} 

	
	//creates another stat object 
	//creates an array with the same length as c and holds the values of c 

	public Stat(int[] i) {
		if (i == null) {
			this.data = new double[0];
			return;
		} 
		else {
			double[] data = new double[i.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (int) i[c];
			} 
			this.data = data;
		} 
	} 

	
	//creates a stat object using the numbers from lo (long values)
	//creates an array that is the same length as lo 
	public Stat(long[] lo) {
		if (lo == null) {
			this.data = new double[0];
			return;
		} //End of if condition
		else {
			double[] data = new double[lo.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (long) lo[c];
			} 
			this.data = data;
		} //End of else condition
	} 

	

	//mutator method used to create and store the numbers in the array
	//makes a new array with float that holds values from f 
	public void setData(float[] f) {
		if (f == null) {
			this.data = new double[0];
			return; 
		} 
		else {
			double[] data = new double[f.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (double) f[c];
			} 
			this.data = data;
		} 
	} 

	
	
	//mutator sets the numbers of the array and it contains the values from d 
	//uses setter method

	public void setData(double[] d) {
		if (d == null) {
			this.data = new double[0];
			return;
		} 
		else {
			double[] data = new double[d.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = d[c];
			} 
			this.data = data;
		}
	} 

	
	//mutator sets the numbers in the array
	//creates an int array which contains values from c

	public void setData(int[] i) {
		if (i == null ) {
			this.data = new double[0];
			return;
		} 
		else {
			double[] data = new double[i.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (double) i[c];
			} 
			this.data = data;
		} 
	} 

	
	//mutator sets values in the array 
	//creates an array using the long (lo) values from above

	public void setData(long[] lo) {
		if (lo == null) {
			this.data = new double[0];
			return;
		} 
		else {
			double[] data = new double[lo.length];
			for (int c = 0; c < data.length; c++) {
				data[c] = (double) lo[c];
			} 
			this.data = data;
		} 
	} 

	
	
	//accessor (getter) method gets values from the data
	//makes a new array and contains the values accessed from the data

	public double [] getData() {
		double temp[] = new double[data.length];
		for (int c = 0; c < data.length; c++) {
			temp[c] = data[c];
		}  
		return temp;
	} 

	
	//boolean is true if the data in stat have the same values
	//otherwise if they don't equal it is false

	public boolean equals(Stat s) {
		if (s == null || s.data.length == 0) {
			return false;
		}
		for (int c = 0; c < data.length; c++) {
			if (data[c] == s.data[c]) {
				return true;
			} 
		} 
		return false;
	} 

	
	//this resets the array. An empty double array is made and assigned to the data

	public void reset() {
		double[] data = new double[0];
		this.data = data;
	} 


	
	//this method makes a double array which holds the exact data like those in the array
	// A reference to this array should be assigned to data. If the parameter is null, then the method will do nothing (no no array created).
	//uses the append method on the int array

	public void append(int[] i) {
		if (i != null) {
			double[] data = new double[this.data.length + i.length];
			if (!(this.data.length == 0)) {
				for (int c = 0; c < this.data.length; c++) {
					data[c] = this.data[c];
				} 
			} 
			for(int c = this.data.length; c < this.data.length + i.length; c++) {
				data[c] = (double) i[c-this.data.length];
			} 
			this.data = data;
		} 
	} 

	
	
	//this method creates a new double array with the same elements of data 
	//uses the append method on the float array

	public void append(float[] f) {
		if (f != null) {
			double[] data = new double[this.data.length + f.length];
			if (!(this.data.length == 0)) {
				for (int c = 0; c < this.data.length; c++) {
					data[c] = this.data[c];
				} 
			} 
			for(int c = this.data.length; c < this.data.length + f.length; c++) {
				data[c] = (float) f[c-this.data.length];
			} 
			this.data = data;
		} 
	} 

	//These methods should create a new double array containing exactly those elements of data followed by those of the array passed as parameter. 
	//uses the append method on the long array

	public void append(long[] lo) {
		if (lo != null) {
			double[] data = new double[this.data.length + lo.length];
			if (!(this.data.length == 0)) {
				for (int c = 0; c < this.data.length; c++) {
					data[c] = this.data[c];
				} 
			} 
			for(int c = this.data.length; c < this.data.length + lo.length; c++) {
				data[c] = (double) lo[c-this.data.length];
			} 
			this.data = data;
		} 
	} 

	/*
	 * Method creates a new double array containing exactly those
	 * elements of data followed by those of the array of type double passed as parameter. A reference to this array
	 * should be assigned to data. 
	 */

	public void append(double[] d) {
		if (d != null) {
			double[] data = new double[this.data.length + d.length];
			if (!(this.data.length == 0)) {
				for (int c = 0; c < this.data.length; c++) {
					data[c] = this.data[c];
				} 
			} 
			for(int c = this.data.length; c < this.data.length + d.length; c++) {
				data[c] = (double) d[c-this.data.length];
			} 
			this.data = data;
		} 
	} 


	//boolean is true if the data object is empty
	//empty if length zero

	public boolean isEmpty() {
		if (this.data.length == 0) {
			return true;
		} 
		return false;
	} 

	
	 //Returns a String representation of the data elements stored in the Stat object.
	 

	public String toString() {
		String str = "[";
		for (int c = 0; c < data.length; c++) {
			str += (c == (data.length -1)) ? data[c] : data[c] + ", ";  
		} 
		str += "]";
		return str; 		 
	} 

	//outputs the minimum value of the data set
	
	public double min() {
		if (this.data.length == 0) {
			return Double.NaN;
		} 
		double min = data[0];
		for (int c = 0; c < data.length; c++) {
			if (min > data[c]) {
				min = data [c];
			} 
		} 
		return min;
	} 

	//outputs the maximum value of the data set

	public double max() {
		if (this.data.length == 0) {
			return Double.NaN;
		} 
		double max = data[0];
		for (int c = 0; c < data.length; c++) {
			if (max < data[c]) {
				max = data[c];
			} 
		} 
		return max;
	} 

	//outputs the average of the data set

	public double average() {
		if (this.data.length == 0) {
			return Double.NaN;
		} 
		double average = 0;
		for (int c = 0; c < data.length; c++) {
			average += data[c];
		} 
		return average = average / data.length;
	} 

	//returns the mode of the dataset
	//if one value happens more prevalently than others, it will return this value
	//if there is no mode, it will return Double.Nan

	public double mode() {
		double maxValue = Double.NaN;
		int maxCount = 0;
		for (int c = 0; c < data.length; ++c) {
			int count = 0;
			for (int i = c; i < data.length; ++i) {
				if (data[i] == data[c])
					++count;
			} 
			if (count == maxCount || this.data.length == 0) {
				maxValue = Double.NaN;
			} 
			else if (count > maxCount) {
				maxCount = count;
				maxValue = data[c];
			} // End of else if condition
		} 
		return maxValue;
	} 

	//Returns the number of times the value occurs in the data array. This is a private helper method for the mode() 

	private int occursNumberOfTimes(double value) {
		int count = 0;
		for(int c = 0; c < this.data.length; c++) {
			if(this.data[c] == value) {
				count++;
			} 
		} 
		return count;
	}
	

	//outputs the variance of the data in the array
	//sum divided by the number of elements in the data

	public double variance() {
		double variance = 0;
		for(int c = 0; c < this.data.length; c++) {
			variance = variance + Math.pow(this.data[c] - average(),2);
		} 
		return variance / this.data.length;
	} 

	//outputs the square root of the variance

	public double standardDeviation() {
		if (this.data.length == 0) {
			return Double.NaN;
		} 
		return Math.sqrt(variance());
	} 


	//insert public static void main(String[] args) { 
	//insert example main methods
	}
