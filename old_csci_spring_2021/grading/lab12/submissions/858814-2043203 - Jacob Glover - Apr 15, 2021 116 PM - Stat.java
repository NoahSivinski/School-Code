/*
 * Stat.java
 * Author:  Jacob Glover
 * Submission Date:  4/10/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program
 * compiles multiple arrays of numbers and uses different
 * methods to calculate statistics.
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
	
	public Stat() { // constructor
		double[] data = new double[0];
		this.data = data;
	}
	
	public Stat(double[] d) { // constructor with one parameter
		if (d == null) {
			double[] data = new double[0];
			this.data = data;
		} else {
			double[] data = new double[d.length];
			for (int i = 0; i < data.length; i++) {
				data[i] += d[i];
			}
			this.data = data;
		}	
	}
	
	public Stat(float[] f) { // constructor with float parameter
		if (f == null) {
			double[] data = new double[0];
			this.data = data;
		} else {
			double[] data = new double[f.length];
			for (int i = 0; i < data.length; i++) {
				data[i] += (double) f[i];
			}
			this.data = data;
		}
	}
	
	public Stat(int[] i) { // constructor with int parameter
		if (i == null) {
			double[] data = new double[0];
			this.data = data;
		} else {
			double[] data = new double[i.length];
			for (int g = 0; g < data.length; g++) {
				data[g] += (double) i[g];
			}
			this.data = data;
		}
	}
	
	public Stat(long[] lo) { // constructor with long parameter
		if (lo == null) {
			double[] data = new double[0];
			this.data = data;
		} else {
			double[] data = new double[lo.length];
			for (int i = 0; i < data.length; i++) {
				data[i] += (double) lo[i];
			} this.data = data;
		}
	}
	
	public void setData(float[] f) { // sets the array for float parameter
		if (f == null) {
			double[] getArray = new double[0];
			this.data = getArray;
		} else {
			double[] getArray = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				getArray[i] += (double) f[i];
			} this.data = getArray;
		}
	}
	
	public void setData(double[] d) { // sets the array
		if (d == null) {
			double[] getArray = new double[0];
			this.data = getArray;
		} else {
			double[] getArray = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				getArray[i] += d[i];
			} this.data = getArray;
		}
	}

	public void setData(int[] i) { // sets the array for int parameter
		if (i == null) {
			double[] data = new double[0];
			this.data = data;
		} else {
			double[] getArray = new double[i.length];
			for (int g = 0; g < i.length; g++) {
				getArray[g] += (double) i[g];
			} this.data = getArray;
		}
	}
	
	public void setData(long[] lo) { // sets the array for long parameter
		if (lo == null) {
			double[] data = new double[0];
			this.data = data;
		} else {
			double[] getArray = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				getArray[i] += (double) lo[i];
			} this.data = getArray;
		}
	}
	
	public double[] getData() {  // gets the array
		double[] getArray = new double[data.length]; 
		for (int i = 0; i < data.length; i++) {
			getArray[i] = getArray[i] + data[i];
		} return getArray;
	} 
	
	public boolean equals(Stat s) { // compares the arrays
		if (getData().length != s.getData().length) {
			return false;
		}
		double THRESHOLD = .0000000001; // threshold for comparing doubles in the array
		for (int i = 0; i < getData().length; i++) {
			if (getData()[i] - s.getData()[i] < THRESHOLD) { // compares the two arrays
		} else return false;
		} return true;
	}
	
	public void reset() { // resets and empties the array
		double[] data = new double[0];
		this.data = data;
	}
	
	public void append(int[] i) { // appends two arrays (one with int parameter)
		if (i == null) {
			
		} else {
			int newArrayLength = data.length + i.length;
			double[] appendArray = new double[newArrayLength];
			for (int g = 0; g < data.length; g++) {
				appendArray[g] += data[g];
			}
			for (int g = 0; g < i.length; g++) {
				appendArray[g + data.length] += (double) i[g];
			}
			this.data = appendArray;
		}
	}
	
	public void append(float[] f) { // appends two arrays (one with float parameter)
		if (f == null) {
			
		} else {
			int newArrayLength = data.length + f.length;
			double[] appendArray = new double[newArrayLength];
			for (int g = 0; g < data.length; g++) {
				appendArray[g] += data[g];
			}
			for (int g = 0; g < f.length; g++) {
				appendArray[g + data.length] += (double) f[g];
			}
			this.data = appendArray;
		}
	}
	
	public void append(long[] lo) { // appends two arrays (one with long parameter)
		if (lo == null) {
			
		} else {
			int newArrayLength = data.length + lo.length;
			System.out.println(newArrayLength);
			System.out.println(data.length);
			System.out.println(lo.length);
			double[] appendArray = new double[newArrayLength];
			for (int g = 0; g < data.length; g++) {
				appendArray[g] += data[g];	
			}
			for (int g = 0; g < lo.length; g++) {
				appendArray[data.length + g] += (double) lo[g];
			}
			this.data = appendArray;
		}
	}
	
	public void append(double[] d) { // appends two arrays with double parameter
		if (d == null) {
			
		} else {
			int newArrayLength = data.length + d.length;
			double[] appendArray = new double[newArrayLength];
			for (int g = 0; g < data.length; g++) {
				appendArray[g] += data[g];
			}
			for (int g = 0; g < d.length; g++) {
				appendArray[g + data.length] += (double) d[g];
			}
			this.data = appendArray;
		}
	}
	
	public boolean isEmpty() { // checks if the array is empty
		if (data.length == 0) return true;
		return false;
	}
	
	public String toString() { // prints array to user
		String toString = "[";
		
		for (int i = 0; i < data.length; i++) {
			toString += data[i];
			if ((data.length > 1) && (i < data.length-1)) { // for formatting purposes
				toString += ", ";
			}
		} 
		toString += "]";
		return toString;
	}
	
	public double min() { // collects the min number
		if (data.length == 0) return Double.NaN;
		double min = data[0];
		for (int i = 0; i < data.length; i++) {	
			if (data[i] < min){
				min = data[i];;
			} 
		} return min;
	}
	
	public double max() { // collects the max number
		if (data.length == 0) return Double.NaN;
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max){
				max = data[i];
			}
		} return max;
	}
	
	public double average() { // collects the average
		if (data.length == 0) return Double.NaN;
		double numbersToAverage = 0;
		for (int i = 0; i < data.length; i++) {
			numbersToAverage += data[i];
		} return numbersToAverage / data.length;
	}
	
	public double mode() { // collects the most repeated number
		if (data.length == 0) return Double.NaN;
		int maxNumberCount = 0; // keeps track of how many numbers the mode has
		double maxNumber = data[0]; // the mode
		boolean multipleMaximums = false; // boolean to determine whether there is a mode

		for (int i = 0; i < data.length; i++) { // loop to check the data
			int numberCount = 0;
			for (int h = 0; h < data.length; h++) { // loop that collects the most displayed numbers
				if (data[i] == data[h]) {
					numberCount++;
				} 
			} 
			if ((data[i] != maxNumber) && (numberCount == maxNumberCount)) { // if there is more than one mode
				multipleMaximums = true;
			} 
			
			if (numberCount > maxNumberCount) { // if there is only one current mode
				maxNumber = data[i];
				maxNumberCount = numberCount;
				multipleMaximums = false;
			} 
			
		} if (multipleMaximums){ // there is no mode
			return Double.NaN;
		}
		return maxNumber;
	}
	
	public int occursNumberOfTimes(double value) { // checks how many times the mode has a data point
		int numberCount = 0;
		int maxNumberCount = 0;
		for (int i = 0; i < data.length; i++) {
			for (int h = 0; i < data.length; h++) {
				if (data[i] == data[h]) {
					numberCount++;
				}
			if (numberCount > maxNumberCount) {
				maxNumberCount = numberCount;
			}
			}
		} return maxNumberCount;
	}
	
	public double variance() { // calculates the variance
		if (data.length == 0) return Double.NaN;
		double variance = 0; // Initialization
		double mean = 0;
		double sum = 0;
		double currentDistance = 0;
		
		for (int i = 0; i < data.length; i++) { // loop to find the mean
			double currentNumber = data[i];
			sum += currentNumber;
		}
		mean = sum/data.length;
		sum = 0;
		for (int i = 0; i < data.length; i++) { // loop for using the mean to find the variance
			currentDistance = Math.pow(data[i] - mean, 2);
			sum += currentDistance;
		}
		variance = sum/data.length;
		return variance;
	}
	
	public double standardDeviation() { // uses the variance to find the standard deviation
		if (data.length == 0) return Double.NaN;
		return Math.sqrt(variance());
	}
}
