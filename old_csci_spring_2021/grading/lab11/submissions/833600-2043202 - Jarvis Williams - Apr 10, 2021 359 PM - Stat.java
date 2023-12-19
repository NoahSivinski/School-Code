/*
 * Circle.java
 * Author: Jarvis Williams
 * Submission Date:  4/9/2021
 *
 * Purpose: The purpose of this program is to be able to set and get
 * values for arrays and manipulate them with different methods
 * * Statement of Academic Honesty:
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
	//initializing data array
	private double data[] = {0.0};                                                                  //

	//Constructor to create array with single element (0.0)
	public Stat() {
		double newData [] = {0.0}; //creating aray for copy
		data = newData;
	}

	//Stat object to create a double array with the same values
	//of d
	public Stat(double[] d) { 
		
		double[] newArray = new double[d.length]; //create array with length of array d
		data = newArray; //copy array
		for (int i = 0; i < data.length; i++) {
			newArray[i] = d[i];
		}
	}

	//get the data for the values of data
	public double[] getData() {
		double[] getterArray = new double[data.length]; //create array with length of data
		//loop for getting values of array
		int i = 0;
		while (i < data.length) {
			getterArray[i] = data[i];
			i++;
		}
		return getterArray; //return get value
	}

	//set the values of the data array
	public void setData(double[] d) {
		double setterArray[] = new double[d.length]; //create array with length of array d
		//loop for getting values 
		int i = 0;
		while (i < d.length) {
			setterArray[i] = d[i];
			i++;
		}
		data = setterArray; //sets value for data
	}
	

	//Checks to see if data objects of calling object and stat object
	//have the same values
	public boolean equals(Stat s) {
		//initializing boolean variable
		boolean elementsEqual = true;
		//if length of called object is not equal to the stat object, elementsEqual is false
		if (getData().length != s.getData().length) {
			elementsEqual = false;
		}
		//loop to see if values of each array are equal
		else {
			int i = 0;
			while (elementsEqual && i < s.getData().length) {
				if (getData()[i] != s.getData()[i]) {
					elementsEqual = false;
				}
				i++;
			}
		}
		return elementsEqual; //return boolean value
	}

	//Changes the values of data from double to String
	public String toString() {
		
		//if data is empty, return NaN
		if (data.length == 0) {
			return "NaN";
		}
		//loop for getting values from data and changing them to string
		String dataString = "[";
		for (int i = 0; i < data.length; i++) {
			
			dataString += data[i];
			if (i == data.length - 1)
				dataString += "]";
			else 
				dataString += ", ";
		}
		return dataString; //returns string value for data
		
	}

	//returns the minimum value of data array
	public double min() {
		double min = data.length; //sets min value equal to length of data
		//finds min value for array
		for (int i = data.length - 1; i > -1; i--) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min; //returns min value

	}

	//returns the maximum value of data array
	public double max() {
		double max = data[0]; //sets max value equal to length of data
		//finds max value for array
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max; //returns max value
	}

	//finds the average of the data array
	public double average() {
		double sum = 0;
		for (int index = 0; index < data.length; index++) {
			sum = sum + data[index];
		}
		double average = sum / data.length;
		return average; //returns average of values of data array
	}

	//finds the mode of the data array
	public double mode() {
		//initializing variables
		double THRESHOLD = 0.000000001;
		double mode = 0;
		double count = 0;
		
		//loop to calculate mode
		for (int i = 0; i < data.length; i++) {
			int indexCount = 0;
			for (int j = i; j < data.length; j++) {
				if (Math.abs(data[i] - data[j]) <= THRESHOLD)
					indexCount++;
			}
			//if one mode, mode equals mode of array
			if (indexCount > count) {
				mode = data[i];
				count = indexCount;
			}
			//if more than one mode, mode equals NaN
			else if (indexCount == count) {
				mode = Double.NaN;
			}
		}
		return mode; //return mode value
	}

}