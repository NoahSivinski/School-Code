/*
 * Stat.java
 * Author:  Claire Fortenberry 
 * Submission Date:  12 November 2021
 *
 * Purpose: The original program utilizes object oriented programming to store an array of double values.
 * It contains public methods to allow a user to determine the min, max, mode, and average of the 
 * values in the array without altering the value of the private instance variable data. This is an expanded version of the
 * original Stat.java program and now allows the user to create arrays of type int, long, and float. It also allows the user 
 * to add elements to an array that has already been created, compute the variance of the array's elements, compute the standard deviation
 * of the array's elements, reset the array to an empty one, check if an array is empty, and check how many times a particular value occurs within the array.  
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

//ASK ABOUT EX 4-8

public class Stat {

	private double[] data;
	
	// default constructor
	public Stat() {
		data = new double[0];
	}
	
	// constructor: reference to new array d is assigned to data
	public Stat(double[] d) {
		double[] temp = d;
		if (d == null) { //checks for null parameter 
			temp = new double[0]; //assigns empty array
		}
		else { //assigns temp to data
			temp = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				temp[i] = d[i];
			}
			data = temp;
		}
	}
	
	
	// constructor: reference to new array f is assigned to data
	public Stat(float[] f) {
		double[] temp;
		if (f == null) { //checks for null parameter
			temp = new double[0];
		}
		else {
			temp = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				temp[i] = (double)f[i];
			}
			data = temp;
		}
	}
	
	// constructor: reference to new array i is assigned to data
	public Stat(int[] i) {
		double[] temp;
		if (i == null) { //checks for null parameter
			temp = new double[0];
		}
		else {
			temp = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				temp[j] = (double)i[j];
			}
			data = temp;
		}
	}
	
	// constructor: reference to new array lo is assigned to data
	public Stat(long[] lo) {
		double[] temp;
		if (lo == null) { //checks for null parameter
			temp = new double[0];
		}
		else {
			temp = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				temp[i] = (double)lo[i];
			}
			data = temp;
		}
	}
	
	// getData(): retrieves values of data and returns reference to new array with the same values
	public double[] getData() {
		double[] temp = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		return temp;
	}
	
	// setData(): assigns to data a reference to the new array d
	public void setData(double[] d) {
		if (d != null) { //checks for null parameter
			double[] temp = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				temp[i] = d[i];
			}
			data = temp;
		}
		else {
			data = new double[0];
		}
	}
	
	// setData(float[] f): assigns to data a reference to the new array f
	public void setData(float[] f) {
		if (f != null) { //checks for null parameter
			double[] temp = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				temp[i] = (double)f[i];
			}
			data = temp;
		}
		else {
			data = new double[0];
		}
	}
	
	// setData(int[] i): assigns to data a reference to the new array i
	public void setData(int[] i) {
		if (i != null) { //checks for null parameter
			double[] temp = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				temp[j] = (double)i[j];
			}
			data = temp;
		}
		else {
			data = new double[0];
		}
	}
	
	// setData(long[] lo): assigns to data a reference to the new array lo
	public void setData(long[] lo) {
		if (lo != null) { //checks for null parameter
			double[] temp = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				temp[i] = (double)lo[i];
			}
			data = temp;
		}
		else {
			data = new double[0];
		}
	}
	
	// equals(Stat s): returns true if calling object and s have the same values and false otherwise
	public boolean equals (Stat s) {
		boolean isEqual = true;
		if (s != null && s.getData().length == data.length) {
			for (int i = 0; i < data.length; i++) {
				if (s.getData()[i] != data[i]) {
					isEqual = false;
				}
			}
		}
		else {
			isEqual = false;
			
		}
		return isEqual;
	}
	
	// reset(): assigns new empty double array to data
	public void reset() { data = new double[0]; }
	
	// append(double[] d)
	public void append(double[] d) {
		if (d != null) { //checks for null parameter
			int count = 0;
			int length = data.length + d.length;
			double[] temp = new double[length];
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			for (int i = data.length; i < length; i++) {
				temp[i] = d[count];
				count++;
			}
			data = temp;
		}
	}
	
	// append(float[] f)
	public void append(float[] f) {
		if (f != null) { //checks for null parameter
			int count = 0;
			int length = data.length + f.length;
			double[] temp = new double[length];
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			for (int i = data.length; i < length; i++) {
				temp[i] = f[count];
				count++;
			}
			data = temp;
		}
	}
	
	// append(int[] i)
	public void append(int[] i) {
		if (i != null) { //checks for null parameter
			int count = 0;
			int length = data.length + i.length;
			double[] temp = new double[length];
			for (int j = 0; j < data.length; j++) {
				temp[j] = data[j];
			}
			for (int j = data.length; j < length; j++) {
				temp[j] = i[count];
				count++;
			}
			data = temp;
		}
	}
	
	// append(long[] lo):
	public void append(long[] lo) {
		if (lo != null) { //checks for null parameter
			int count = 0;
			int length = data.length + lo.length;
			double[] temp = new double[length];
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			for (int i = data.length; i < length; i++) {
				temp[i] = lo[count];
				count++;
			}
			data = temp;
		}
	}
	
	// isEmpty(): returns true if data array is empty or false otherwise
	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// toString(): returns string representation of data elements
	public String toString() {
		String dataString = "[";
		if (data.length == 0) {
			dataString += "]";
		}
		else {
			for (int i = 0; i < data.length-1; i++) {
				dataString += data[i] + ", ";
			}
		
			dataString += data[data.length-1] + "]"; // adds last value of data to avoid trailing commas
		}
		return dataString;
		
	}
	
	// min(): returns minimum value of data
	public double min() {
		double min = 0.0;
		if (data.length == 0) {
			min = Double.NaN;
		}
		else {
			min = data[0];
			for (int i = 0; i < data.length; i++) {
				if (min > data[i]) {
					min = data[i];
				}
			}
		}
		return min;
	}
	
	// max(): returns maximum value of data
	public double max() {
		double max = 0.0;
		if (data.length == 0) {
			max = Double.NaN;
		}
		else {
			for (int i = 0; i < data.length; i++) {
				if (max < data[i]) {
					max = data[i];
				}
			}
		}
		return max;
	}
	
	// average(): returns average of data values
	public double average() {
		double sum = 0.0;
		double average = 0.0;
		if (data.length == 0) {
			average = Double.NaN;
		}
		else {
			for (int i = 0; i < data.length; i++) {
				sum += data[i];
			}
			average = sum / data.length;
		}
		return average;
	}
	
	// mode(): returns mode if there is a value that occurs most frequently and Double.NaN otherwise
	public double mode() {
		int count = 0;
		int maxCount = 0;
		boolean multiMode = false;
		double mode = 0.0;
		if (data.length == 0) {
			mode = Double.NaN;
		}
		else {
			for (int i = 0; i < data.length; i++) {
				count = 0; // reset count after each iteration of for loop
				for(int j = 0; j < data.length; j++) {
					if (data[i] == data[j]) {
						count++; // keeps track of how many times a value occurs in the array
					}
				}
				if (count > maxCount) {
					maxCount = count;
					mode = data[i];
					multiMode = false;
				}
				else if(count == maxCount && data[i] != mode) { // checks if there are multiple values that occur with the same frequency 
					multiMode = true;
				}
			}
			if (multiMode) {
				mode = Double.NaN;
			}
		}
		return mode;
	}
	
	// occursNumberOfTimes(): returns number of times a value occurs in the data array
	public int occursNumberOfTimes(double value) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if(data[i] == value) {
				count++;
			}
		}
		return count;
	}
	
	// variance(): returns variance of the elements in the data array or Double.NaN if data array is empty
	public double variance() {
		double distance = 0.0;
		double average = 0.0;
		double sum = 0.0;
		double variance = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		average = sum / data.length;
		
		for (int i = 0; i < data.length; i++) {
			distance = Math.pow((average - data[i]), 2);
			variance += distance;
		}
		
		if(data.length == 0) {
			variance = Double.NaN;
		}
		
		variance = variance / data.length;
		return variance;
	}
	
	// standardDeviation(): returns the square root of the variance or Double.NaN if data array is empty
	public double standardDeviation() {
		double standardDeviation = 0.0;
		double distance = 0.0;
		double average = 0.0;
		double sum = 0.0;
		double variance = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		average = sum / data.length;
		
		for (int i = 0; i < data.length; i++) {
			distance = Math.pow((data[i] - average), 2);
			variance += distance;
		}
		
		if (data.length == 0) {
			standardDeviation = Double.NaN;
		}
		
		variance = variance / data.length;
		standardDeviation = Math.sqrt(variance);
		
		return standardDeviation;
	}
	
	// main method for test cases
	public static void main(String[] args) { 
		double[] data1 = {}; 
		double[] data2 = {  }; 
		float[] data3 = {}; 
		float[] data4 = {  }; 
		int[] data5 = {}; 
		int[] data6 = {  }; 
		long[] data7 = {}; 
		long[] data8 = {  }; 
		 
		Stat stat1 = new Stat(); 
		stat1.append(data1); 
		stat1.append(data2); 
		stat1.append(data3); 
		stat1.append(data4); 
		stat1.append(data5); 
		stat1.append(data6); 
		stat1.append(data7); 
		stat1.append(data8); 
		data1 = null; 
		stat1.append(data1); 
		 

		System.out.println("stat1 data = " + stat1.toString()); 
		System.out.println("stat1 min = " + stat1.min()); 
		System.out.println("stat1 max = " + stat1.max()); 
		System.out.println("stat1 average = " + stat1.average()); 
		System.out.println("stat1 mode = " + stat1.mode()); 
		System.out.println("stat1 variance = " + stat1.variance()); 
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
	}

}
