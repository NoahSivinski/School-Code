/*
 * Stat.java
 * Author:  Eric Shindell
 * Submission Date:  11/12/2021
 *
 * Purpose: 11/5/21 Purpose - This program creates double arrays and lets the user
 * find out specific information about those arrays using the methods called.
 * For example, the user can find the minimum value, maximum value, average of all
 * values (otherwise known as the mean value) and the most commonly seen value within
 * the array. It also lets the user modify the array after declaring it with setData
 * and getData, as well as show the array more legibly with toString. Finally, the program
 * contains a boolean equals method that checks if two arrays created by the user equal one 
 * another, returning true if they do and false if they do not.
 * 
 * 11/12/21 Purpose - The program now also has the added abilities to create arrays using
 * float, int, and long data types, as well as setData using those types. The user can
 * now reset the array back to an empty array, as well as add arrays together using append
 * statements. Finally, the user can find out the number of times a number occurs, the variance
 * and standard deviation of the array, as well as if an array is empty.
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
	
	//Variable
	private double[] data;
	
	//----------------------------------------------
	// Stat, if empty, gives an array only containing 0.0
	//----------------------------------------------
	public Stat() {
		double[] data = {};
		this.setData(data);
	}
	
	//----------------------------------------------
	// Stat Double - sets the array to the variables given
	//----------------------------------------------
	public Stat(double[] d) {
		this.setData(d);
	}
	
	//----------------------------------------------
	// Stat Float sets the array to the variables given
	//----------------------------------------------
	public Stat(float[] f) {
		this.setData(f);
	}
	
	//----------------------------------------------
	// Stat Int- sets the array to the variables given
	//----------------------------------------------
	public Stat(int[] i) {
		this.setData(i);
	}
	
	//----------------------------------------------
	// Stat Long - sets the array to the variables given
	//----------------------------------------------
	public Stat(long[] lo) {
		this.setData(lo);
	}
		
	//----------------------------------------------
	// setData Float - assigns a new value to data
	//----------------------------------------------
	public void setData(float[] f) {
		if(f == null) {
			double[] data = {};
			this.setData(data);
		}
		else {
			this.data = new double[f.length];
			for(int j = 0; j < f.length; j++) {
				this.data[j] = f[j];
			}
		}
	}
	
	//----------------------------------------------
	// setData Double - assigns a new value to data
	//----------------------------------------------
	public void setData(double[] d) {
		if(d == null) {
			double[] data = {};
			this.setData(data);
		}
		else {
			this.data = new double[d.length];
			for(int j = 0; j < d.length; j++) {
				this.data[j] = d[j];
			}
		}
	}
	
	//----------------------------------------------
	// setData Int - assigns a new value to data. 
	//----------------------------------------------
	public void setData(int[] i) {
		if(i == null) {
			double[] data = {};
			this.setData(data);
		}
		else {
			this.data = new double[i.length];
			for(int j = 0; j < i.length; j++) {
				this.data[j] = i[j];
			}
		}
	}
	
	//----------------------------------------------
	// setData Long - assigns a new value to data
	//----------------------------------------------
	public void setData(long[] lo) {
		if(lo == null) {
			double[] data = {};
			this.setData(data);
		}
		else {
			this.data = new double[lo.length];
			for(int j = 0; j < lo.length; j++) {
				this.data[j] = lo[j];
			}
		}
	}
	
	//----------------------------------------------
	// getData - returns the value of data
	//----------------------------------------------
	public double[] getData() {
		double[] output = new double[data.length];
		for(int i = 0; i < this.data.length; i++) {
			output[i] = this.data[i];
		}
		return output;
	}
	
	
	//----------------------------------------------
	// Equals - Checks if an array is equal to another array s, returning true if it is equal.
	//----------------------------------------------
	
	public boolean equals(Stat s) {
		if(s == null) {
		}
		else {
			if(s.data.length == this.data.length) {
				for(int i = 0; i < this.data.length; i++){
					if(s.data[i] != this.data[i]) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	
	//----------------------------------------------
	// reset - Clears the data array
	//----------------------------------------------	
	public void reset() {
		double[] data = {};
		this.setData(data);
	}
	
	//----------------------------------------------
	// Append Int
	//----------------------------------------------	

	public void append(int[] i) {
		if(i == null) {
			
		}
		else {
			double[] output = new double[this.data.length + i.length];
			for(int j = 0; j < this.data.length; j++) {
				output[j] = this.data[j];
			}
			for(int j = 0, k = this.data.length; k < this.data.length + i.length; k++, j++) {
				output[k] = i[j];
			}
			
			
			this.data = output;
		}
	}
	
	//----------------------------------------------
	// Append Float
	//----------------------------------------------

	public void append(float[] f) {
		if(f == null) {
			
		}
		else {
			double[] output = new double[this.data.length + f.length];
			for(int j = 0; j < this.data.length; j++) {
				output[j] = this.data[j];
			}
			for(int j = 0, k = this.data.length; k < this.data.length + f.length; k++, j++) {
				output[k] = f[j];
			}
			
			this.data = output;
		}
	}	
	
	//----------------------------------------------
	// Append Long
	//----------------------------------------------
	
	public void append(long[] lo) {
		if(lo == null) {
			
		}
		else {
			double[] output = new double[this.data.length + lo.length];
			for(int j = 0; j < this.data.length; j++) {
				output[j] = this.data[j];
			}
			for(int j = 0, k = this.data.length; k < (this.data.length + lo.length); k++, j++) {
				output[k] = lo[j];
			}
			
			this.data = output;
		}
	}
	
	//----------------------------------------------
	// Append Double
	//----------------------------------------------
	
	public void append(double[] d) {
		if(d == null) {
			
		}
		else {
			double[] output = new double[this.data.length + d.length];
			for(int j = 0; j < this.data.length; j++) {
				output[j] = this.data[j];
			}
			for(int j = 0, k = this.data.length; k < this.data.length + d.length; k++, j++) {
				output[k] = d[j];
			}
			
			this.data = output;
		}
	}
	
	//----------------------------------------------
	// isEmpty - Returns true if the data object has length 0, false otherwise
	//----------------------------------------------
	
	public boolean isEmpty() {
		if(this.data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//----------------------------------------------
	// toString - returns a string version of the array.
	//----------------------------------------------
	public String toString() {
		String output = "[";
		for(int i = 0; i < this.data.length; i++) {
			output = output + this.data[i];
			if(i < this.data.length - 1) { //Makes it so that ', ' isn't printed for the last variable
				output = output + ", ";
			}
		}
		output = output + "]";
		return output;
	}
	
	//----------------------------------------------
	// min - Finds the lowest value within the data array
	//----------------------------------------------
	
	public double min() {
		if(this.isEmpty()) {
			return Double.NaN;
		}
		else {
			double output = this.data[0];
			for(int i = 0; i < this.data.length; i++) {
				if(this.data[i] < output) {
					output = this.data[i];
				}
			}
			return output;
		}
	}
	
	//----------------------------------------------
	// max - Finds the highest value within the data array
	//----------------------------------------------
	
	public double max() {
		if(this.isEmpty()) {
			return Double.NaN;
		}
		else {
			double output = this.data[0];
			for(int i = 0; i < this.data.length; i++) {
				if(this.data[i] > output) {
					output = this.data[i];
				}
			}
			return output;
		}
	}
	
	//----------------------------------------------
	// average - Adds up all variables then divides by the length.
	//----------------------------------------------
	
	public double average() {
		if(this.isEmpty()) {
			return Double.NaN;
		}
		else {
			double avg = 0;
			for(int i = 0; i < this.data.length; i++) {
				avg = avg + this.data[i];
			}
			avg = avg / this.data.length;
			return avg;
		}
	}
	
	//----------------------------------------------
	// mode - Finds the most common variable within the array
	//----------------------------------------------
	
	public double mode() {
		if(this.isEmpty()) {
			return Double.NaN;
		}
		else {
			int counter;
			int counterBest = 1;
			double var;
			double currentBest = 0;
			for(int i = 0; i < this.data.length; i++) {
			
				var = this.data[i];
				counter = 0;
			
				for(int j = i; j < this.data.length;j++) {
					if(var == this.data[j]) {
						counter++;
					}
				}
			
				if(counter > counterBest) { //Checks which is more common, then sets the more common one to the currentBest
					counterBest = counter;
					currentBest = var;
				}
				else if(counter == counterBest) {
					counterBest = 1; //Everything occurs at least once, so 1.
				}
			
			}
			if(counterBest == 1) { //If counterBest is 1, then there are at least two most common variables.
				currentBest = Double.NaN;
			}
			return currentBest;
		}
	}
	
	//----------------------------------------------
	// occursNumberOfTimes - Finds how many times that value occurs
	//----------------------------------------------
	
	private int occursNumberOfTimes (double value) {
		
		int times = 0;
		
		for(int i = 0; i < this.data.length; i++) {
			
			if (this.data[i] == value) {
				times++;
			}

		}
		
		return times;
	}
	
	//----------------------------------------------
	// Variance - Finds the variance of the data array.
	//----------------------------------------------
	
	public double variance() {
		if(this.isEmpty()) {
			return Double.NaN;
		}
		else {
			double difference = 0;
			
			for (int i = 0; i < this.data.length; i++) {
				difference = difference + (Math.pow(this.data[i] - this.average(), 2));
			}
			double output = difference / this.data.length;
			return output;
		}
	}
	
	//----------------------------------------------
	// standardDeviation - Finds the square root of the variance
	//----------------------------------------------
	
	public double standardDeviation() {
		if(this.isEmpty()) {
			return Double.NaN;
		}
		else {
			double output;
			output = Math.sqrt(this.variance());
			return output;
		}
	}
	
	public static void main(String[] args) {
		
		double[] data1 = {50.0, 60.0};
		float[] data2 = {70.0F, 80.0F};
		int[] data3 = {90, 100};
		long[] data4 = {100L, 110L};
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data1);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data2);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data3);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data4);
		System.out.println("stat1 data = " + stat1.toString());
		data1 = null;
		stat1.setData(data1);
		System.out.println("stat1 data = " + stat1.toString());
		
	}
	
}
