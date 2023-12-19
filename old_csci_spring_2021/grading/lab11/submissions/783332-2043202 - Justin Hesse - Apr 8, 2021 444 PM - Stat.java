/*
 * Stat.java
 * Author:  Justin Hesse 
 * Submission Date:  [Submission date here]
 *
 * Purpose: Contains methods for a Stat object.
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
	
	// Stat - default constructor 
	public Stat(){
		data = new double [1];
		data[0] = 0.0;
	}
	
	// Stat - constructor method for creating a Stat object using d[]
	public Stat(double[] d) {
		data = new double [d.length];
		for (int i = 0; i < d.length; i++) {
			data [i] = d [i];
		}
	}

	// getData - Returns a reference to a copy of data[]
	public double[] getData() {
		double[] dataCopy = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			dataCopy[i] = data[i];
		}
		return dataCopy;
	}
	
	// setData - allows the modification of data[] by passing another array d[]
	public void setData(double[] d) {
		data = new double [d.length];
		for (int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}
	
	// equals - tests if two arrays are logically equivalent
	// returns true if both arrays have the same length and contain
	// the same values in the same order
	public boolean equals(Stat s) {
		double[] sValues = s.getData();
		if(sValues.length != data.length) {
			return false;
		}
		for (int i = 0; i < sValues.length; i++) {
			if (Math.abs(sValues[i] - data[i]) > 0.000000001) {
				return false;
			}
		}
		return true;
	}
	
	// toString returns the values of data[] as a formatted String
	public String toString() {
		String statString ="[";
		for (int i = 0; i < data.length; i++) {
			if (i != data.length - 1) {
			statString = statString + data[i] + ", ";
			}
			else {
				statString = statString + data[i];
			}
		}
		return statString + "]";
	}
	
	// min - returns the smallest value in data[]
	public double min() {
		double min = data[0];
		for(int i = 1; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}
	
	// max - returns the largest value in data[]
	public double max() {
		double max = data[0];
		for(int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	// average - returns the average of all values in data[]
	public double average() {
		double average = 0;
		for(int i = 0; i < data.length; i++) {
			average = average + data[i];
		}
		return average / data.length;
	}
	
	// mode - returns the most frequently occurring value in data[]
	// If there is no mode or there are multiple modes, returns Double.NaN
	public double mode() {
		double finalMode = 0;
		double finalCount = 0;
		for (int i = 0; i < data.length; i++) {	//Outer loop used to set currentMode and currentCount for each value of data[]
			double currentMode = data[i];
			double currentCount = 1;
			for(int j = i + 1; j < data.length; j++) { //Inner loop used to compare currentMode to every other value of data[]
				if (Math.abs(data[j] - currentMode) < 0.000000001) {
					currentCount++;
				}
			}
			if (currentCount > finalCount) {  //Compares currentCount to finalCount after each value is tested
				finalCount = currentCount;	//assigns finalCount and finalMode new values the previously tested value occurred
				finalMode = currentMode;	//more frequently
			}
			else if (currentCount == finalCount) {
				finalMode = Double.NaN;		//if there is no unique value, finalMode is assigned the value of Double.NaN
			}
		}
		return finalMode;
	}
}
