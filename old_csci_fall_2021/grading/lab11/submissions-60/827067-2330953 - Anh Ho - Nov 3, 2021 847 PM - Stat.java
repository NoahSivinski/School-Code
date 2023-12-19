import java.util.Arrays;

/*
 * Stat.java
 * Author:  Anh Ho
 * Submission Date:  11/01/2021
 *
 * Purpose: stuff
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

public class Stat {
	private double[] data;
	
	//default constructor without any parameters
	public Stat() {
		this.data = new double[] {0.0};
	}
	
	//constructor with double array as a parameter
	public Stat(double[] d) {
		this.data = new double[d.length];
		for (int i=0; i<this.data.length;i++) { 
			this.data[i] = d[i];
		}
	}
	
	//getter
	public double[] getData() {
		return this.data;
	}
	
	//setter
	public void setData(double[] d) {
		this.data = new double [d.length];
		for (int i=0; i<this.data.length;i++) { 
			this.data[i] = d[i];
		}
	}
	
	//equals - check if 2 stat instances are equal
	public boolean equals(Stat s) {
		return Arrays.equals(this.data, s.data);
	}
	
	//toString - return the String value of the array
	public String toString() {
		String result = "[";
		for (int i=0;i<this.data.length-1;i++) {
			result += this.data[i] + ", ";
		}
		result += this.data[this.data.length - 1] +"]";
		return result;
	}
	
	//min - return the minimum value in the array
	public double min() {
		double min = 0;
		for (int i=0;i<this.data.length;i++) {
			if (this.data[i] < min) {
				min = this.data[i];
			}
		}
		return min;
	}
	
	//max - return the minimum value in the array
	public double max() {
		double max = 0;
		for (int i=0;i<this.data.length;i++) {
			if (this.data[i] > max) {
				max = this.data[i];
			}
		}
		return max;
	}
	
	//average - 
	public double average() {
		double sum = 0;
		for (int i=0;i<this.data.length;i++) {
			sum += this.data[i];
		}
		return sum/this.data.length;
	}
	
	
	//mode - 
	public double mode() {
		double value = Double.NaN;
		int[] counter = new int[this.data.length];	//counter of each index value repeat
		for (int i=0;i<this.data.length;i++) {
			counter[i] = 0;	//initialize each being 0 (no repeat yet)
			for (int j=0;j<this.data.length;j++) {
				if (Double.compare(this.data[i], this.data[j]) == 0) {	//if there's a repeat, +1
					counter[i]++;	//counter for the index +1
				}
			}			
		}
		int max = 0;
		for (int i=0;i<counter.length;i++) {
			if (counter[i] > max) {	//find the highest # in counter
				max = counter[i];	//change value of max counter
			}
		}
		for (int i=0;i<counter.length;i++) {
			if (counter[i] == max) {
				for (int j=0;j<this.data.length;j++) {
					if (Double.compare(this.data[i], this.data[j]) == 0) {	//if there are no separate values that repeat the same amount of times
						value = this.data[i];	//get value
					}
					else {
						value = Double.NaN;
					}
				}			
			}
		}
		
		return value;
	}
}	//close class
