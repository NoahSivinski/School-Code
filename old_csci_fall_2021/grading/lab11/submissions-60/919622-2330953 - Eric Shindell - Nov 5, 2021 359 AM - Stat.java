/*
 * Stat.java
 * Author:  Eric Shindell
 * Submission Date:  11/5/2021
 *
 * Purpose: This program creates double arrays and lets the user
 * find out specific information about those arrays using the methods called.
 * For example, the user can find the minimum value, maximum value, average of all
 * values (otherwise known as the mean value) and the most commonly seen value within
 * the array. It also lets the user modify the array after declaring it with setData
 * and getData, as well as show the array more legibly with toString. Finally, the program
 * contains a boolean equals method that checks if two arrays created by the user equal one 
 * another, returning true if they do and false if they do not.
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
		double[] data = {0.0};
		this.setData(data);
	}
	
	//----------------------------------------------
	// Stat - sets the array to the variables given
	//----------------------------------------------
	public Stat(double[] d) {
		this.setData(d);
	}
	
	//----------------------------------------------
	// getData - returns the value of data
	//----------------------------------------------
	public double[] getData() {
		double[] output = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			output[i] = this.data[i];
		}
		return output;
	}
	
	
	
	//----------------------------------------------
	// setData - assigns a new value to data
	//----------------------------------------------
	public void setData(double[] d) {
		data = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}
	
	
	//----------------------------------------------
	// Equals - Checks if an array is equal to another array s, returning true if it is equal.
	//----------------------------------------------
	
	public boolean equals(Stat s) {
		if(s.data.length == data.length) {
			for(int i = 0; i < data.length; i++){
				if(s.data[i] != data[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
		
	}
	
	//----------------------------------------------
	// toString - returns a string version of the array.
	//----------------------------------------------
	public String toString() {
		String output = "[";
		for(int i = 0; i < data.length; i++) {
			output = output + this.data[i];
			if(i < data.length - 1) { //Makes it so that ', ' isn't printed for the last variable
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
		double output = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i] < output) {
				output = data[i];
			}
		}
		return output;
	}
	
	//----------------------------------------------
	// max - Finds the highest value within the data array
	//----------------------------------------------
	
	public double max() {
		double output = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i] > output) {
				output = data[i];
			}
		}
		return output;
	}
	
	//----------------------------------------------
	// average - Adds up all variables then divides by the length.
	//----------------------------------------------
	
	public double average() {
		double avg = 0;
		for(int i = 0; i < data.length; i++) {
			avg = avg + data[i];
		}
		avg = avg / data.length;
		return avg;
	}
	
	//----------------------------------------------
	// mode - Finds the most common variable within the array
	//----------------------------------------------
	
	public double mode() {
		int counter;
		int counterBest = 1;
		double var;
		double currentBest = 0;
		for(int i = 0; i < data.length; i++) {
			
			var = data[i];
			counter = 0;
			
			for(int j = 0; j < data.length; j++) {
				if(var == data[j]) {
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
	
	
	
	
	
	public static void main(String[] args) {
		
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
		double[] data2 = {100.34, 50.01, 50.01, -8};
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		stat1 = new Stat(data);
		System.out.println("stat1 has been altered.");
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode() + "\n");
		Stat stat2 = new Stat();
		stat2.setData(data2);
		Stat stat3 = new Stat(stat1.getData());
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("stat3 data = " + stat3.toString());
		System.out.println();
		System.out.println("stat1 is equal to stat2 using \"equals()\"? " +
		stat1.equals(stat2));
		System.out.println("stat1 is equal to stat3 using \"equals()\"? " +
		stat1.equals(stat3));
		System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3));

		
	}
	
}
