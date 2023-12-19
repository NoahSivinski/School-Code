/*
 * Stat.java
 * Author:  Austin Debrody
 * Submission Date:  11/5/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * This class stores an array of double values called data.
 * It then uses public methods to compute the min, max, mode,
 * and average of these values. There are also get and set
 * methods for the values held in data. 
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
		
	private double[] data; // creates a private double array "data"
	
	/*
	 * default constructor for Stat
	 * creates double array with 0.0
	 */
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
	
	/*
	 * constructs a Stat object using value held in d
	 */
	public Stat(double[] d) {
		data = new double[d.length];
		for(int i = 0; i < d.length; i ++) {
			data[i] = d[i];
		}
	}
	
	/*
	 * accessor method used to retrieve values of data
	 */
	public double[] getData() {
		double [] dataCopy = new double[data.length];
		
		for(int i = 0; i < data.length; i ++) {
			dataCopy[i] = data[i];
		}
		
		return dataCopy;
	}
	
	/*
	 * mutator method used to set the values of the 
	 * data array
	 */
	public void setData(double[] d) {
		double [] dataCopy = new double[d.length];
		
		for(int i = 0; i < d.length; i ++) {
			dataCopy[i] = d[i];
		}
		
		data = new double[d.length];
		for(int i = 0; i < d.length; i ++) {
			data[i] = dataCopy[i];
		}
	}
	
	/*
	 * returns boolean value true if data objects of
	 * both the calling Stat object and the passed Stat 
	 * object s have the same values (in the same order).
	 * Otherwise, it return false.
	 */
	public boolean equals(Stat s) {
		if(s.getData().length != getData().length) {
			return false;
		}
		
		for(int i = 0; i < s.getData().length; i++) {
			if(s.getData()[i] != getData()[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * Returns a String representation of the data elements 
	 * stored in the Stat object
	 */
	public String toString() {
		String arrayData = "[";
		
		for(int i = 0; i < getData().length - 1; i++) {
			arrayData += getData()[i] + ", ";
		}
	
		
		arrayData += getData()[getData().length - 1] + "]";
		
		return arrayData;
	}
	
	// returns the minimum of the data array
	public double min() {
		double min = getData()[0];
		
		for(int i = 0; i < getData().length; i++) {
			if(getData()[i] < min) {
				min = getData()[i];
			}
		}
		
		return min;
	}
	
	// return ths maximum of the data array
	public double max() {
		double max = getData()[0];
		
		for(int i = 0; i < getData().length; i++) {
			if(getData()[i] > max) {
				max = getData()[i];
			}
		}
		
		return max;
	}
	
	// returns the average of the data array
	public double average() {
		double sum = 0;
		double average;
		
		for(int i = 0; i < getData().length; i++) {
			sum += getData()[i];
		}
		
		average = sum / getData().length;
		
		return average;
	}
	
	// returns the mode of the data array- value that occurs most frequently
	public double mode() {
		double mode = -1000000;
		int maxCount = 0;
		int count;
		
		for (int i = 0; i < getData().length; ++i) {
		    count = 1;
		    for (int j = i + 1; j < getData().length; ++j) {
		        if (Math.abs(getData()[j] - getData()[i]) < 0.0000001) {
		            count++;
		        } 
		    }
		    if (count > maxCount) {
		        maxCount = count;
		        mode = getData()[i];
		    } else if (count == maxCount) {
		        mode = Double.NaN;
		    }
		}
		
		return mode;
	}
	
	
	
	public static void main(String[] args) {
		// main method to test the implementation of the various methods within the class
		// no code here otherwise

	}


}
