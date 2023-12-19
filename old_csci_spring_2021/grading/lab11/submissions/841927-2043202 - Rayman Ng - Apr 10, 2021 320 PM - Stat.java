/*
 * CSCI1301.java
 * Author: Rayman Ng
 * Submission Date: 4/10/2021
 *
 * Purpose: This program provides several methods to use on a Stat class object. Beyond regular getter and setter methods, there are methods that can be used to find the minimum,maximum,
 * average, or mode of a set of values. There's also an equals method which can compare the values of different Stat objects to see if they'er equal to each other, and a toString method
 * to help list out the values in an easy to read way.  
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
		double [] userData = new double [d.length];
		for(int i = 0; i < d.length; i++) {
			userData[i] = d[i];
		}
		data = userData; 
	}
	public double[] getData() {
		double[] copyArray = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			copyArray[i] = data[i];
		}
		return copyArray;
	}
	public void setData(double [] d) {
		double [] userData = new double [d.length];
		for(int i = 0; i < d.length; i++) {
			userData[i] = d[i];
		}
		data = userData; 
	}
	public boolean equals(Stat s) {
		int instance = 0;
		if(this.data.length != s.data.length) {
			return false;
		}
		else {
			for(int i = 0; i < this.data.length; i++) {
				if(this.data[i] == s.data[i]) {
					instance++;
				}
			}
			if(instance == this.data.length) {
				return true;
			}
			else 
				return false;
		} 
	}
	public String toString() {
		String arrayValues = "";
		for(int i = 0; i < this.data.length; i++) {
			if(i == this.data.length -1) {
				arrayValues = arrayValues + data[i];
			}
			else {
				arrayValues = arrayValues + data[i] + ", ";
			}
		}
		return "[" + arrayValues + "]";
	}
	public double min() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double minimum = data[0];
			for(int i = 0; i < this.data.length; i++) {
				if(minimum > data[i]) {
					minimum = data[i];
				}
			}
			return minimum;
		}
	}
	public double max() {
		if(this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double maximum = data[0];
			for(int i = 0; i < this.data.length; i++) {
				if(maximum < data[i]) {
					maximum = data[i];
				}
			}
			return maximum;
		}
	}
	public double average() {
		if(this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double sum = 0;
			double average;
			for(int i = 0; i < this.data.length; i++) {
				sum = sum + data[i];
			}
			average = sum/this.data.length;
			return average;
		}
	}
	public double mode() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		else {
			int ties = 0;
			int previousInstance = -1;
			int instance = 0;
			double mostOccured = data[0];
			if(this.data.length == 1) {
				return mostOccured;
			}
			for(int j = 0; j < this.data.length; j++) {
				for(int i = 0; i < this.data.length; i++) {
					if(data[j] == data[i]) {
						instance++;
					}
				}
				//First run through, and there are multiple of a number. 
				if((previousInstance == -1) && (instance > 1)) {
					mostOccured = data[j];
					previousInstance = instance;
					instance = 0;
				}
				//Every other run through. 
				else if((previousInstance != -1) && (previousInstance < instance)) {
					mostOccured = data[j];
					previousInstance = instance;
					instance = 0;
				}
				//If multiple numbers share the same amount of occurences, then none can be considered the mode.  
				else if((previousInstance == instance) &&(mostOccured != data[j])) {
					ties = instance;
					instance = 0;
				}
				else {
					instance = 0;
				}
			}
			if(previousInstance > ties) {
				return mostOccured;
			}
			else {
				return Double.NaN;
			}
		
		}
	}
}
