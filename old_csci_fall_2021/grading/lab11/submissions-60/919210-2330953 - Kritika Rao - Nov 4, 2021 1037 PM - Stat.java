/*
 * [Stat].java
 * Author:  [Kritika Rao] 
 * Submission Date:  [11/05/21]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program can look at arrays and can find different
 * data values. The program can find the minimum value, 
 * the maximum value, the average of all values, and the
 * mode. Once the program finds that value based on the
 * method call, the program will print out the correct
 * data value. 
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

	//default constructor
	public Stat() {
		data = new double[1];
		data[0] = 0.0;

	}
	//constructor with one paramater
	public Stat(double[] d) {
		double[] newArray = new double[d.length];
		//putting all values in array d, in array newArray
		for(int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		//initializing instance variable
		data = newArray;

	}
	//getter method
	public double[] getData() {
		//creating a new array that will store the same values as the data array 
		double[] newArray = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		} 
		//returning reference to the new array that was created 
		return newArray;


	}
	//Mutator method
	public void setData(double[] d) {
		//creating a new array containing exactly the elements of d and assigning it to
		//data a reference to the new array
		double[] newArray = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}
	//Returns the boolean value true if the data objects of both the calling
	//Stat object and the passed Stat object s have the same values (and in the same order).
	//Otherwise, it returns false. 
	public boolean equals(Stat s) {
		boolean checker = true;
		double[] sData = s.getData();
		for(int i = 0; i < data.length && checker == true; i++) {
			if(data[i] == sData[i]) {
				checker = true;
			}
			else {
				checker = false;
			}
		}
		return checker;
	}
	//Returns a String representation of the data elements stored in the Stat object.
	//Use the samples listed below as guidelines for formatting.
	public String toString() {
		String dataValues = "[";
		for(int i = 0; i < data.length - 1; i++) {
			dataValues += data[i] + ", ";
		}
		dataValues += data[data.length - 1] + "]";
		return dataValues;

	}
	//Returns the minimum of the data array.
	public double min() {
		double minValue;
		int arrayFirstIndex = 0;
		minValue = data[arrayFirstIndex];
		for(int i = 0; i < data.length; i++) {
			if(data[i] < minValue) {
				minValue = data[i];
			}
		}
		return minValue;

	}
	//Returns the maximum of the data array
	public double max() {
		double maxValue;
		int arrayFirstIndex = 0;
		maxValue = data[arrayFirstIndex];
		for(int i = 0; i < data.length; i++) {
			if(data[i] > maxValue) {
				maxValue = data[i];
			}
		}
		return maxValue;

	}
	//Returns the average of the data array. 
	public double average() {
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		double average = sum / data.length;
		return average;
	}
	//returns the value that occurs the most in the array
	//if no mode is found, returns NaN
	public double mode() {
		double mode = 0;
		int mostFrequent = 0;
		for (int i = 0; i < data.length; i++)   
		{  
			int frequency = 1;
			for (int j = i + 1; j < data.length; j++)   
			{  
				if(data[i] == data[j]) {
					frequency++;
				}

				if(frequency > mostFrequent) {
					mostFrequent = frequency;
					mode = data[i];
				}
				else if(mostFrequent == frequency) {
					mode = Double.NaN;
				}
			}
		} 
		return mode;

	} 


}
