/*
 * Stat.java
 * Author:  Tenacity Murdie 
 * Submission Date:  11-01-2021
 *
 * Purpose: This class stores an array of data, and contains methods that
 * can compute the min, max, mode, and average of these values.
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
	
	/*
	 * Default constructor for Stat that has a single element
	 * of 0.0
	 */
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
	
	/*
	 * Constructs a Stat object using the values in d
	 */
	public Stat(double[] d) {
		double[] newArray = new double[d.length];
		for(int i = 0; i<d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}
	
	/*
	 * Retrieves the values of data
	 */
	public double[] getData() {
		double[] newArray = new double[data.length];
		for(int i = 0; i<data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}
	
	/*
	 * Sets the values of the data array
	 */
	public void setData(double[] d) {
		double[] newArray = new double[d.length];
		for(int i = 0; i<d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}
	
	/*
	 * Returns true if the data objects of both the calling object
	 * and the passed Stat object s have the same values in the 
	 * same order. Otherwise, returns false
	 */
	public boolean equals(Stat s) {
		boolean equals = true;
		double[] sArray = s.getData();
		for(int i = 0; i < data.length; i++) {
			if (data.length != sArray.length) {
				equals = false;
			}
			else if (data[i] != sArray[i]) {
				equals = false;
			}
		}
		return equals;
	}
	
	/*
	 * Returns a string representation of the data elements stored
	 * in the Stat object
	 */
	public String toString() {
		String dataRepresentation;
		dataRepresentation = "[";
		for (int i = 0; i<data.length-1; i++) {
			dataRepresentation += (data[i] + ", ");
		}
		dataRepresentation += (data[data.length -1] + "]");
		return dataRepresentation;
	}
	
	/*
	 * Returns the minimum of the data array
	 */
	public double min() {
		double min = data[0];
		for (int i = 0; i<data.length; i++) {
			if(data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}
	
	/*
	 * Returns the maximum of the data array
	 */
	public double max() {
		double max = data[0];
		for (int i = 0; i<data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		return max;
		
	}
	
	/*
	 * Returns the average of the data array.
	 */
	public double average() {
		double sum = 0;
		for (int i = 0; i <data.length; i++) {
			sum += data[i];
		}
		return (sum/data.length);
	}
	
	/*
	 * Returns the value that occurs most frequently in the data array
	 * If no such value exists, returns Double.NaN
	 */
	public double mode() {
		double mode = 0;
		int maxCount = 0;
		boolean modeExists = false;
		if(data.length == 1) {
			mode = data[0];
		}
		else {
			for (int i = 0; i < data.length; i++) {
				int count1 = 1;
				for (int j = i+1; j < data.length; j++) {
					if (Math.abs(data[i]-data[j]) < 0.000000001) {
						count1++;
					}
				}
				if (count1 > maxCount) {
					maxCount = count1;
					mode = data[i];
					modeExists = true;
				}
				else if (count1 == maxCount) {
					modeExists = false;
				}
			}
			if (modeExists == false) {
				mode = Double.NaN;
			}
		}
		return mode;
	}
}
