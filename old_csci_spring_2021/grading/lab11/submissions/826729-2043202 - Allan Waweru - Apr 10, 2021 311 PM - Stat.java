/*
 * Stat.java
 * Author:  Allan Waweru
 * Submission Date:  [04/10/2021]
 *
 * Purpose: Implement a class called Stat that is described using a UML 1 class diagram
 * 
 * Statement of Academic Honesty: The following code represents my own work. I have neither
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


	public Stat() {		//The default constructor for Stat
		data = new double[1];
		data[0] = 0.0;
	}

	public Stat(double[] d) {	//Constructs a Stat object using the values held in d
		double newD[] = new double[d.length];
		for (int i = 0; i < d.length; i++)	{
			newD[i] = d[i];
		}
		this.data = newD;
	}

	public double[] getData() {		//accessor method used to retrieve the values of data
		double newD[] = new double[data.length];
		for (int i = 0; i < data.length; i++)
			newD[i] = data[i];
		return newD;
	}

	public void setData(double[] d) {	//mutator method used to set the values of the array
		double newD[]= new double[d.length];
		for (int i = 0; i < d.length; i++) {
			newD[i] = d[i];
		}
		this.data = newD;
	}

	public boolean equals(Stat s) {		// Checks if both data sets have same length
		if (s.data.length != data.length)
			return false;
		for (int i = 0; i < data.length; i++)
			if (s.data[i] != data[i])
				return false;
		return true;
	}

	public String toString() {	//Returns a String representation of the data elements
		String result = "[";
		for (int i = 0; i < this.data.length; i++) {
			result += data[i];
			if (i == data.length - 1)
				result += "]";
			else 
				result += ", ";
		}

		return result;
	}

	public boolean isEmpty() { 	//return boolean data is empty
		return data.length == 0;
	}

	public double min() {	//minimum value of the data array
		if (!isEmpty()) {
			double min = data[0];
			for (int i = 0; i < data.length; i++) {
				if (min > data[i])
					min = data[i];
			}

			return min;
		}
		else
			return Double.NaN;
	}
	public double max() { //maximum value of the  array
		if (!isEmpty()) {
			double max = data[0];
			for (int i = 0; i < data.length; i++) {
				if (max < data[i])
					max = data[i];
			}

			return max;
		}
		else 
			return Double.NaN;
	}

	public double average() { 	//return average of the array
		if (!isEmpty()) {
			double sum = 0;
			for (int i = 0; i < data.length; i++) {
				sum += data[i];
			}
			return sum / data.length;
		}
		else
			return Double.NaN;
	}

	public double mode() {	//mode of the data array
		int modeCount = 0;
		double modeElement = this.data[0];
		for(int i = 0; i < this.data.length; i++) {
			int numberCount = 0;
			double num = data[i];

			for(int j = 0; j < this.data.length; j++) {
				if(data[j] == data[i]) {
					numberCount++;
				}
			}
			if(numberCount>modeCount) {
				modeCount = numberCount;
				modeElement = num;
			}
		}
		return modeElement;
	}
}
