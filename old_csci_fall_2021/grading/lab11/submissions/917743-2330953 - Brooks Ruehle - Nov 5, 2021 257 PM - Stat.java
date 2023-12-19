/*
 * CSCI1301.java
 * Author:  Brooks Ruehle 
 * Submission Date:  Nov. 5, 2021
 *
 * Purpose: The purpose of this lab is to create a class that stores
 * an array of doubles that has several different methods that can be
 * used on the array.
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
	
	public static final double THRESHOLD = 0.000000001;
	
	public Stat() {
		double[] d = {0};
		data = d;
	}
	
	public Stat(double[] d) {
		double[] result = new double[3];
		
		for(int i = 0; i < d.length; i++) {
			result[i] = d[i];
			}
		data = result;
	}
	public double[] getData() {
		double[] result = data;
		return result;
	}
	
	public void setData(double[] d) {
		double[] result = d;
		data = result;
	}
	
	public boolean equals(Stat s) {
		
		boolean result = true;
		if(this.data.length == s.data.length) {
			for(int i = 0; i < this.data.length; i++) {
				
				if(!(Math.abs(this.data[i] - s.data[i]) <= THRESHOLD)) {
					result = false;
					}
				}
			}
		else {
			result = false;
			}
		
		return result;
	}
	
	public String toString() {
		
		String result = "";
		result += "[";
		
		for(int i = 0; i < this.data.length - 1; i++) {
			result += this.data[i] +", ";
			}
		result += this.data[this.data.length - 1] + "]";
		return result;
	}
	
	public double min() {
		
		double minimum = this.data[0];
		
		for(int i = 1; i < this.data.length; i++) {
			
			if(this.data[i] < minimum) {
				minimum = this.data[i];
				}
			}
		return minimum;
	}
	
	public double max() {
		
		double maximum = this.data[0];
		
		for(int i = 1; i < this.data.length; i++) {
			
			if(this.data[i] > maximum) {
				maximum = this.data[i];
				}
			}
		return maximum;
	}
	
	public double average() {
		
		double total = 0;
		for(int i = 0; i < this.data.length; i++) {
			total += this.data[i];
		}
		double result = total / (double) this.data.length;
		return result;
		
	}
	
	public double mode() {
		
		double currentTally = 0;
		double greatestTally = 0;
		double currentMode = -1;
		for(double cur : this.data) {
			currentTally = 0;
			for(double cur2 : this.data) {
				
				if(Math.abs(cur - cur2) <= THRESHOLD) {
					currentTally++;
					if(currentTally > greatestTally) {
						greatestTally = currentTally;
						currentMode = cur;
						
					}
				}
			}
			
		}
		if(Math.abs(greatestTally - 1) <= THRESHOLD) {
			return Double.NaN;
			}
		else {
			return currentMode;
		}
		
	}
	
}