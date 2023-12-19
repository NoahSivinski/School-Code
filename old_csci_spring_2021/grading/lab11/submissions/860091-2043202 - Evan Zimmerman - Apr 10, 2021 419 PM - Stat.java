/*
 * Stat.java
 * Author:  Evan Zimmerman 
 * Submission Date:  10th April 2021
 *
 * Purpose: The exercise being explored by Lab #11 is to build understanding of classes and arrays.
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

	//declare data as a private double array
	private double[] data;
	
	//Stat() method without a constructor sets the value of data to a single double of value 0.0
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
	//Stat() method using an array of doubles as its constructor sets data to an array of doubles of
	//the same length as the constructor double, and copies the value of each index of the constructor
	//double to data
	public Stat(double[] d) {
		data = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}
	//Similar to the Stat(constructor) method, creates a referenceArray double and copies
	//each value of data, and returns the reference array.
	public double[] getData() {
		double[] referenceArray = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			referenceArray[i] = data[i];
		}
		return referenceArray;
	}
	//Creates a reference array where each value is the matching value of the constructor d, and
	//assigns data to the reference array.
	public void setData(double[] d) {
		double[] referenceArray = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			referenceArray[i] = d[i];
		}
		data = referenceArray;
	}
	//Creates a temporary boolean that is set to true by default, uses a for-loop to compare
	//each value of the two arrays, if the two values for an index are different, the boolean
	//is set to false and ends the loop. Afterwards, returns the value of the temporary boolean.
	public boolean equals(Stat s) {
		boolean tempBoolean;
		tempBoolean = true;
		for(int i = 0; i < s.getData().length && tempBoolean; i++) {
			if(this.data[i] != s.data[i]) {
				tempBoolean = false;
			}
		}
		return tempBoolean;
	}
	//Creates and returns a temporary String that is hard-set to begin with [ and end with ], and concats
	//each value of the array using +=.
	public String toString() {
		String tempString = "[";
		for(int i = 0; i<this.getData().length; i++) {
			tempString += this.data[i];
			//If the last value added to the String was not the last value of the array, adds a comma
			//and a space.
			if(i<this.getData().length-1) {
				tempString += ", ";
			}
		}
		tempString += "]";
		return tempString;
	}
	//Creates a temporary minimum value that is set to the first value of the array by default,
	//uses a for-loop to compare itself to each value in the array and sets itself
	//to a new value if it is greater than the value it is comparing itself to.
	public double min() {
		double tempMin;
		tempMin = this.data[0];
		for(int i = 0; i < this.getData().length; i++) {
			if(tempMin > this.data[i]) {
				tempMin = this.data[i];
			}
		}
		return tempMin;
	}
	//Similar to the minimum method, but changes the value if it is less than what it is comparing
	//itself to. 
	public double max() {
		double tempMax;
		tempMax = this.data[0];
		for(int i = 0; i < this.getData().length; i++) {
			if(tempMax < this.data[i]) {
				tempMax = this.data[i];
			}
		}
		return tempMax;
	}
	//Creates and returns a double that starts as a sum of all the values in the array and then
	//divides itself by the number of values in the array.
	public double average() {
		double tempSum = 0;
		for(int i = 0; i < this.getData().length; i++) {
			tempSum += this.data[i];
		}
		tempSum /= this.getData().length;
		return tempSum;
	}
	public double mode() {
		//Creates a reference array where the number of values is the number of values in the input
		//array, but where each value is the number of times that value appears in the original array.
		//If the input array is [2 1 1 1 3 3] then the reference array will be [1 3 3 3 2 2] because
		//in the original array 2 appears once, 1 appears thrice, and 2 appears twice. 
		int[] referenceArray = new int[this.getData().length];
		int currentCount;
		for(int i = 0; i < this.getData().length; i++) {
			currentCount = 0;
			//Checks each value of the orriginal array against all values in the array (including itself) 
			//and increases the currentCount variable for each match.
			for(int j = 0; j < this.getData().length; j++) {
				if(this.data[j] == this.data[i]) {
					currentCount+=1;
				}
			}
			//For each match each value has in the original array, assigns the number of matches
			//to the corresponding index in the reference array.
			referenceArray[i] = currentCount;
		}
		//Similar to the max() method, finds the maximum value in the reference array and stores its
		//index as a variable, because the same index in the original array will yield the mode.
		int tempMax = 0;
		int indexOfMode = 0;
		for(int i = 0; i < referenceArray.length; i++) {
			if(tempMax < referenceArray[i]) {
				tempMax = referenceArray[i];
				indexOfMode = i;
			}
		}
		//Checks if there are two values that appear the same number of times, such as if two different
		//values appear four times. For each time the maximum value appears, the incorrectnessChecker
		//variable is increased, and it sets the multipleModes variable to true if it appears more times
		//than the value itself. This is because of the way the reference value is set up: the value 3
		//will appear 3 times, 7 will appear 7 times, etc. so if 7 appears 14 times for example, it means
		//that there were multiple modes.
		int incorrectnessChecker = 0; 
		boolean multipleModes = false;
		for(int i = 0; i < referenceArray.length; i++) {
			if(referenceArray[i] == tempMax) {
				incorrectnessChecker++;
			}
			if(incorrectnessChecker > tempMax) {
				multipleModes = true;
			}
		}
		//If the maximum number of times every number shows up is only 1, or if there are multiple modes,
		//returns not a number. Otherwise, returns the value of the original array at the index of 
		//the highest value of the reference array.
		if(tempMax == 1 || multipleModes) {
			return Double.NaN;
		} else {
			return this.data[indexOfMode];
		}
	}
}
