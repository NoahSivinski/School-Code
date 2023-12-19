/*
 * Stat.java
 * Author:  Carla Pena
 * Submission Date:  9 April 2021
 *
 * Purpose: This program was created to store a memory
 * location of data. The purpose ultimately 
 * allows a user to organize min, max, mode, and average
 * from the data entered. 
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
	
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
	
	public Stat(double[] d) {
		this.data = d;
	}
	
	public double[] getData() {
		return this.data;
	}
	
	public void setData(double[] d) {
		this.data = d;
	}
	
	public boolean equals(Stat s) {
		boolean areTheyEqual = true;
		
		if (this.data.length == s.getData().length) {
			double[] sArray = s.getData();
			
			int i = 0;
			while (i < data.length) {
				if (data[i] == sArray[i]) {
					areTheyEqual = true;
					i++;
				}
				else {
					areTheyEqual = false;
					break;
				}
			}
		}
			
		return areTheyEqual;
	}
	
	public String toString() {
		String doubleArray = "[";
		
		for(int i = 0; i < data.length; i++) {
			doubleArray += data[i];
			if (i != (data.length - 1)) {
				doubleArray += ", ";
			}
		}
		
		doubleArray += "]";
		return doubleArray;
	}
	
	public double min() {
		double minNumber = data[0];
		int i = 0;
		
		while (i < data.length) {
			if (minNumber > data[i]) {
				minNumber = data[i];
				i = 0;
			}
			else {
				i++;
			}
		}
		return minNumber;
	}
	
	public double max() {
		double maxNumber = data[0];
		int i = 0;
		
		while (i < data.length) {
			if (maxNumber < data[i]) {
				maxNumber = data[i];
				i = 0;
			}
			else {
				i++;
			}
		}
		return maxNumber;
	}
	
	public double average() {
		double avgArray = 0;
		
		for(int i = 0; i < data.length; i++) {
			avgArray += data[i];
		}
		
		return avgArray / data.length;
	}
	
	public double mode() {
		double most = 0.0;
		int doubleCount = 0;
		
		for (int i = 0; i < data.length; i++) {
			int currentDoubleCount = 0;
			for (int j = 0; j < data.length; j++) {
				if (data[i] == data[j]) {
					currentDoubleCount++;
				}
			}
			if (currentDoubleCount > doubleCount) {
				most = data[i];
				doubleCount = currentDoubleCount;
			}
			else if (currentDoubleCount == doubleCount) {
				most = Double.NaN;
				doubleCount = 0;
			}
		}
		
		if (doubleCount > 1) {
			return most;
		}
		else {
			return Double.NaN;
		}
	}

}
