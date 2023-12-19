/*
 * Stat.java
 * Author:  Austin Debrody
 * Submission Date:  11/12/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * This class stores an array of double values called data.
 * It then uses public methods to compute the min, max, mode,
 * and average of these values. There are also get and set
 * methods for the values held in data. The class will overload 
 * the setData method (and the class constructors as well), 
 * creating versions that use arrays of int, long, and float 
 * values as parameters and handles null parameters properly
 * (i.e. runtime errors should not occur when a parameter is 
 * null). A double array will still be used internally by the 
 * Stat class to store the values. The Stat class is to allow 
 * for an array of 0 elements and requires an altercation of
 * the Stat class. 
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
		double[] data = new double[0];
		setData(data);
	}
	
	/*
	 * constructs a Stat object using value held in Double d
	 */
	public Stat(double[] d) {
		setData(d);
	}
	
	/*
	 * constructs a Stat object using value held in float f
	 */
	public Stat(float[] f) {
		setData(f);
	}
	
	/*
	 * constructs a Stat object using value held in integer i
	 */
	public Stat(int[] i) {
		setData(i);
	}
	
	/*
	 * constructs a Stat object using value held in long lo
	 */
	public Stat(long[] lo) {
		setData(lo);
	}
	
	/*
	 * mutator method used to set the values of the 
	 * data array given float f
	 */
	public void setData(float[] f) {
		if(f == null) {
			double[] dataCopy = {};
			this.setData(dataCopy);
		}else {
			data = new double[f.length];
			
			for(int i = 0; i < f.length; i ++) {
				data[i] = f[i];
			}
		}
	}
	
	/*
	 * mutator method used to set the values of the 
	 * data array given double d
	 */
	public void setData(double[] d) {
		if(d == null) {
			double[] dataCopy = {};
			this.setData(dataCopy);
		}else {
			data = new double[d.length];
			
			for(int i = 0; i < d.length; i ++) {
				data[i] = d[i];
			}
		}
	}
	
	/*
	 * mutator method used to set the values of the 
	 * data array given integer i
	 */
	public void setData(int[] i) {
		if(i == null) {
			double[] dataCopy = {};
			this.setData(dataCopy);
		}else {
			data = new double[i.length];
			
			for(int x = 0; x < i.length; x ++) {
				data[x] = i[x];
			}
		}
	}
	
	/*
	 * mutator method used to set the values of the 
	 * data array given long lo
	 */
	public void setData(long[] lo) {
		if(lo == null) {
			double[] dataCopy = {};
			this.setData(dataCopy);
		}else {
			data = new double[lo.length];
			
			for(int i = 0; i < lo.length; i ++) {
				data[i] = lo[i];
			}
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
	 * returns boolean value true if data objects of
	 * both the calling Stat object and the passed Stat 
	 * object s have the same values (in the same order).
	 * Otherwise, it return false.
	 */
	public boolean equals(Stat s) {
		if(s != null) {
			if(s.data.length != data.length) {
				return false;
			}
			
			for(int i = 0; i < s.data.length; i++) {
				if(s.data[i] != data[i]) {
					return false;
				}
			}
			
			return true;
		}
		
		return false;
	}
	
	/*
	 * clears the data array
	 */
	public void reset() {
		double[] data = new double[0];
		setData(data);
	}
	
	// appends integer arrays
	public void append(int[] i) {
		if(i != null) {
			double [] dataCopy = new double[i.length + data.length];
			for(int x = 0; x < data.length; x++) {
				dataCopy[x] = data[x];
			}
			
			for(int x = 0, k = data.length; k < data.length + i.length; k++, x++) {
				dataCopy[k] = i[x];
			}
			
			data = dataCopy;
		}
	}
	
	// appends float arrays
	public void append(float[] f) {
		if(f != null) {
			double [] dataCopy = new double[f.length + data.length];
			for(int i = 0; i < data.length; i++) {
				dataCopy[i] = data[i];
			}
			
			for(int i = 0, k = data.length; k < data.length + f.length; k++, i++) {
				dataCopy[k] = f[i];
			}
			
			data = dataCopy;
		}
	}
	
	// appends long arrays
	public void append(long[] lo) {
		if(lo != null) {
			double [] dataCopy = new double[lo.length + data.length];
			for(int i = 0; i < data.length; i++) {
				dataCopy[i] = data[i];
			}
			
			for(int i = 0, k = data.length; k < data.length + lo.length; k++, i++) {
				dataCopy[k] = lo[i];
			}
			
			data = dataCopy;
		}
	}
	
	// appends double arrays
	public void append(double[] d) {
		if(d != null) {
			double [] dataCopy = new double[d.length + data.length];
			for(int i = 0; i < data.length; i++) {
				dataCopy[i] = data[i];
			}
			
			for(int i = 0, k = data.length; k < data.length + d.length; k++, i++) {
				dataCopy[k] = d[i];
			}
			
			data = dataCopy;
		}
	}
	
	
	/*
	 * returns the boolean value true if the data 
	 * object is empty (has length 0). Otherwise, 
	 * it returns false
	 */
	public boolean isEmpty() {
		if(data.length == 0) {
			return true;
		} 
		
		return false;
	}
		
	/*
	 * Returns a String representation of the data elements 
	 * stored in the Stat object
	 */
	public String toString() {
		String arrayData = "[";
		
		for(int i = 0; i < data.length; i++) {
			arrayData += getData()[i];
			if(i < data.length - 1) {
				arrayData += ", ";
			}
		}
	
		
		arrayData += "]";
		
		return arrayData;

	}
	
	// returns the minimum of the data array
	public double min() {
		if(data.length != 0) {
			double min = data[0];
			
			for(int i = 0; i < data.length; i++) {
				if(data[i] < min) {
					min = data[i];
				}
			}
			
			return min;
		}
		
		return Double.NaN;
	}
	
	// return the maximum of the data array
	public double max() {
		if(data.length != 0) {
			double max = data[0];
			
			for(int i = 0; i < data.length; i++) {
				if(data[i] > max) {
					max = data[i];
				}
			}
			
			return max;
		}
		
		return Double.NaN;
	}
	
	// returns the average of the data array
	public double average() {
		if(data.length != 0) {
			double sum = 0;
			double average;
			
			for(int i = 0; i < data.length; i++) {
				sum += data[i];
			}
			
			average = sum / data.length;
			
			return average;
		}
		
		return Double.NaN;
	}
	
	// returns the mode of the data array- value that occurs most frequently
	public double mode() {
		if(data.length != 0) {
			double mode = -1000000;
			int maxCount = 0;
			int count;
			
			for (int i = 0; i < data.length; ++i) {
			    count = 1;
			    for (int j = i + 1; j < data.length; ++j) {
			        if (Math.abs(data[j] - getData()[i]) < 0.0000001) {
			            count++;
			        } 
			    }
			    if (count > maxCount) {
			        maxCount = count;
			        mode = data[i];
			    } else if (count == maxCount) {
			        mode = Double.NaN;
			    }
			}
			
			return mode;
		}
		
		return Double.NaN;
	}
	
	/*
	 * returns the number of times the value occurs in
	 * the data array. This is a private helper method
	 * for the mode() method
	 */
	private int occursNumberOfTimes(double value) {
		int count = 0;
		
		for(int i = 0; i < getData().length; i ++) {
			if(getData()[i] == value) {
				count ++;
			}
		}
		
		return count;
	}
	
	/*
	 * returns the variance of the data in the data
	 * array. To compute this, find the difference 
	 * between the value of each element of the data 
	 * array and the mean, square this distance, and 
	 * then sum these squared values. The variance 
	 * is this sum divided by the number of elements 
	 * in data. 
	 */
	public double variance() {
		if(data.length != 0) {
			double varSum = 0;
			for(int i = 0; i < getData().length; i++) {
				varSum += Math.pow(data[i] - average(), 2);
			}
			
			double variance = varSum / data.length;
			return variance;
		}
		
		return Double.NaN;
	}
	
	/*
	 * returns the square root of the variance.
	 * If the data array is empty, then Double.NaN 
	 * should be returned.
	 */
	public double standardDeviation() {
		if(data.length != 0) {
			double stdDev = Math.sqrt(variance());
			
			return stdDev;
		}
		
		return Double.NaN;
	}
	
	
	public static void main(String[] args) {
		// main method to test the implementation of the various methods within the class
		// no code here otherwise

		
	}


}
