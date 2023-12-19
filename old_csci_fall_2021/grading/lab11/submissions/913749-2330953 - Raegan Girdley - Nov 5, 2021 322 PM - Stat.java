/*
 * Stat.java
 * Author:  Raegan Girdley
 * Submission Date:  11/5/2021
 *
 * Purpose: Takes array and modifies it/displays it/etc.
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
		
	double[] data, newData;
		
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
		
	public Stat(double[] d) {
		data = new double[d.length];
		for (int i  = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}
		
	public double[] getData() {
		newData = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		return newData;
	}
	
	public void setData(double[] d) {
		newData = new double[d.length];
		for (int i  = 0; i < d.length-1; i++) {
			newData[i] = d[i];
		}
		data = newData;
	}
		
	public boolean equals(Stat s) {
		newData = s.getData();
		if (newData.length == data.length) {
			for (int i = 0; i < data.length-1; i++) {
				if (data[i] != newData[i]) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
		
	public String toString() {
			String output = "[";
			
			for (int i = 0; i < data.length; i++) {
				if (i < data.length - 1) {
					output += String.valueOf(data[i]) + ", ";
				}
				else {
					output += String.valueOf(data[i]);
				}
			}
			
			output += "]";
			return output;
	}
		
	public double min() {
		double min = Integer.MAX_VALUE;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		
		return min;
	}
		
	public double max() {
		double max = Integer.MIN_VALUE;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		
		return max;
	}
		
	public double average() {
		double average, total = 0;
		
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		
		average = total / data.length;
		return average;
	}
		
	public double mode() {
		
		double mode = Double.NaN;
		int checker = 0, counter = 0, duplicate = 0;
		
		for (int i = 0; i < data.length; i++) {
			
			counter = 0;
			
			for (int j = 0; j < data.length; j++) {
				
				if (data[i] == data[j]) {
					counter++;
				}
				
			}
			
			if (counter > checker) {
				checker = counter;
				mode = data[i];
			}
		}
		
		return mode;
		
	}

}
