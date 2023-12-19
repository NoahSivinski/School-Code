/*
 * Stat.java
 * Author:  Evan Zimmerman 
 * Submission Date:  16th April 2021
 *
 * Purpose: The exercise being explored by Lab #12 is to build understanding of overloading, constructors, etc.
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
	
	//Stat() method now sets data to an empty array
	public Stat() {
		data = new double[0];
	}
	//Stat() method using an array of doubles as its constructor sets data to an array of doubles of
	//the same length as the constructor double, and copies the value of each index of the constructor
	//double to data. If the constructor double is null, sets data to an empty array.
	public Stat(double[] d) {
		if(d == null || d.length == 0) {
			data = new double[0];
		} else {
			data = new double[d.length];
			for(int i = 0; i < d.length; i++) {
			data[i] = d[i];
			}
		}
	}
	//Stat method with integer constructor
	public Stat(int[] i) {
		if(i == null || i.length == 0) {
			data = new double[0];
		} else {
			data = new double[i.length];
			for(int j = 0; j < i.length; j++) {
			data[j] = i[j];
			}
		}
	}
	//Stat method with long constructor
	public Stat(long[] lo) {
		if(lo == null || lo.length == 0) {
			data = new double[0];
		} else {
			data = new double[lo.length];
			for(int i = 0; i < lo.length; i++) {
			data[i] = lo[i];
			}
		}
	}
	//Stat method with float constructor
	public Stat(float[] f) {
		if(f == null || f.length == 0) {
			data = new double[0];
		} else { 
			data = new double[f.length];
			for(int i = 0; i < f.length; i++) {
			data[i] = f[i];
			}
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
	//assigns data to the reference array. Now checks if the constructor double is null, and sets referenceArray to empty if so.
	public void setData(double[] d) {
		double[] referenceArray;
		if(d == null || d.length == 0) {
			referenceArray = new double[0];
		} else {
			referenceArray = new double[d.length];
			for(int i = 0; i < d.length; i++) {
				referenceArray[i] = d[i];
			}
		}
		data = referenceArray;
	}
	//setData method with integer constructor
	public void setData(int[] i) {
		double[] referenceArray;
		if(i == null || i.length == 0) {
			referenceArray = new double[0];
		} else {
			referenceArray = new double[i.length];
			for(int j = 0; j < i.length; j++) {
				referenceArray[j] = i[j];
			}
		}
		data = referenceArray;
	}
	//setData method with float constructor
	public void setData(float[] f) {
		double[] referenceArray;
		if(f == null || f.length == 0) {
			referenceArray = new double[0];
		} else {
			referenceArray = new double[f.length];
			for(int i = 0; i < f.length; i++) {
				referenceArray[i] = f[i];
			}
		}
		data = referenceArray;
	}
	//setData method with long constructor
	public void setData(long[] lo) {
		double[] referenceArray;
		if(lo == null || lo.length == 0) {
			referenceArray = new double[0];
		} else {
			referenceArray = new double[lo.length];
			for(int i = 0; i < lo.length; i++) {
				referenceArray[i] = lo[i];
			}
		}
		data = referenceArray;
	}
	//Creates a temporary boolean that is set to true by default, uses a for-loop to compare
	//each value of the two arrays, if the two values for an index are different, the boolean
	//is set to false and ends the loop. Afterwards, returns the value of the temporary boolean.
	//Now returns false if the constructor stat is null.
	public boolean equals(Stat s) {
		if(s == null) {
			return false;
		} else {
			boolean tempBoolean;
			tempBoolean = true;
			for(int i = 0; i < s.getData().length && tempBoolean; i++) {
				if(this.data[i] != s.data[i]) {
					tempBoolean = false;
				}
			}
			return tempBoolean;
		}
	}
	//Creates an empty array of length 0 and assigns it to data.
	public void reset() {
		double[] emptyArray = new double[0];
		data = emptyArray;
	}
	//If the constructor double is not empty, creates a local double appendedArray containing the contents of the
	//constructor double, and a double newData. newData is given the values of the original data and appendedArray,
	//afterwards, newData is assigned to data.
	public void append(double[] d) {
		if(d != null) {
			double[] appendedArray = new double[d.length];
			for(int i = 0; i < d.length; i++) {
				appendedArray[i] = d[i];
			}
			double[] newData = new double[d.length + getData().length];
			for(int i = 0; i < getData().length; i++) {
				newData[i] = data[i];
			}
			for(int i = getData().length; i < (d.length + getData().length); i++) {
				newData[i] = appendedArray[i-getData().length];
			}
			data = newData;
		}
	}
	//append method, with integer constructor
	public void append(int[] i) {
		if(i != null) {
			double[] appendedArray = new double[i.length];
			for(int j = 0; j < i.length; j++) {
				appendedArray[j] = i[j];
			}
			double[] newData = new double[i.length + getData().length];
			for(int j = 0; j < getData().length; j++) {
				newData[j] = data[j];
			}
			for(int j = getData().length; j < (i.length + getData().length); j++) {
				newData[j] = appendedArray[j-getData().length];
			}
			data = newData;
		}
	}
	//append method, with float constructor
	public void append(float[] f) {
		if(f != null) {
			double[] appendedArray = new double[f.length];
			for(int i = 0; i < f.length; i++) {
				appendedArray[i] = f[i];
			}
			double[] newData = new double[f.length + getData().length];
			for(int i = 0; i < getData().length; i++) {
				newData[i] = data[i];
			}
			for(int i = getData().length; i < (f.length + getData().length); i++) {
				newData[i] = appendedArray[i-getData().length];
			}
			data = newData;
		}
	}
	//append method, with long constructor
	public void append(long[] lo) {
		if(lo != null) {
			double[] appendedArray = new double[lo.length];
			for(int i = 0; i < lo.length; i++) {
				appendedArray[i] = lo[i];
			}
			double[] newData = new double[lo.length + getData().length];
			for(int i = 0; i < getData().length; i++) {
				newData[i] = data[i];
			}
			for(int i = getData().length; i < (lo.length + getData().length); i++) {
				newData[i] = appendedArray[i-getData().length];
			}
			data = newData;
		}
	}
	//Boolean that returns true if data is currently empty, and false if not
	public boolean isEmpty() {
		if(data == null || data.length == 0) {
			return true;
		} else {
			return false;
		}
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
	//Now returns NaN if data is empty.
	public double min() {
		if(data == null || data.length == 0) {
			return Double.NaN;
		} else {
			double tempMin;
			tempMin = this.data[0];
			for(int i = 0; i < this.getData().length; i++) {
				if(tempMin > this.data[i]) {
					tempMin = this.data[i];
				}
			}
			return tempMin;
		}
	}
	//Similar to the minimum method, but changes the value if it is less than what it is comparing
	//itself to. 
	//Now returns NaN if data is empty.
	public double max() {
		if(data == null || data.length == 0) {
			return Double.NaN;
		} else { 
			double tempMax;
			tempMax = this.data[0];
			for(int i = 0; i < this.getData().length; i++) {
				if(tempMax < this.data[i]) {
					tempMax = this.data[i];
				}
			}
			return tempMax;
		}
	}
	//Creates and returns a double that starts as a sum of all the values in the array and then
	//divides itself by the number of values in the array.
	//Now returns NaN if data is empty.
	public double average() {
		if(data == null || data.length == 0) {
			return Double.NaN;
		} else {
			double tempSum = 0;
			for(int i = 0; i < this.getData().length; i++) {
				tempSum += this.data[i];
			}
			tempSum /= this.getData().length;
			return tempSum;
		}
	}
	//Now returns NaN if data is empty.
	public double mode() {
		if(data == null || data.length == 0) {
			return Double.NaN;
		} else {
		//Creates a reference array where the number of values is the number of values in the input
		//array, but where each value is the number of times that value appears in the original array.
		//If the input array is [2 1 1 1 3 3] then the reference array will be [1 3 3 3 2 2] because
		//in the original array 2 appears once, 1 appears thrice, and 2 appears twice. 
			int[] referenceArray = new int[this.getData().length];
			int currentCount;
			for(int i = 0; i < this.getData().length; i++) {
				currentCount = 0;
			//Checks each value of the original array against all values in the array (including itself) 
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
	//Creates a local double tempSum that utilizes the given math formula to find variance, and returns it after
	//the for-loop. Returns NaN if data is empty.
	public double variance() {
		if(data == null || data.length == 0) {
			return Double.NaN;
		} else {
			double tempSum = 0;
			//For each iteration of the loop, tempSum adds the square of the difference of the data value and the array's average. 
			for(int i = 0; i < data.length; i++) {
				tempSum += Math.pow((data[i]-this.average()), 2);
			}
			tempSum /= data.length;
			return tempSum;
		}
	}
	//Uses Math.pow to return the square root of the variance method. Returns NaN if data is empty.
	public double standardDeviation() {
		if(data == null || data.length == 0) {
			return Double.NaN;
		} else {
			return(Math.pow(this.variance(), 0.5));
		}
	}
}
