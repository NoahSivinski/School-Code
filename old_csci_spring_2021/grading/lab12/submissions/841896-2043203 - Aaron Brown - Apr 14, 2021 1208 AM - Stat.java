/*
 * Stat.java
 * Author: Aaron Brown
 * Submission Date: 04/14/2021
 *
 * Purpose: This source code contains many method that interact with Stat objects.
 * Stat objects just consists of a private array. There are constructor methods for
 * default objects and other constructors for different array values. The methods
 * allow for interactions with the objects, there are getters and setters for the
 * data array, and there are also helpful methods with many statistics related items.
 * The statistics methods are minimum, maximum, mode, average, variance, and standard 
 * deviation. There are two boolean methods, isEmpty and equals, which tell the user
 * if the current Stat object is empty or equals another Stat object. The other methods
 * are the reset and append methods which alter the data arrays by either clearing them
 * or adding more values to the data array. Finally the toString is replaced with one
 * that prints out the values of the data array.
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
	
	//This private array holds the data values.
	private double[] data;
	
	//For double comparison
	public static final double THRESHOLD = 0.000000001;
	
	/**
	 * This is the default constructor for Stat, it creates a double
	 * array that is empty..
	 */
	public Stat() {
		double[] temp = new double [0];
		data = temp;
	}
	
	/**
	 * This is the constructor for Stat when the values are given
	 * as doubles in a parameter of the method. If the parameter is
	 * null the data values are assigned an empty array.
	 */
	public Stat(double[] d) {
		if(d != null) {
			double[] temp = new double [d.length];
			for (int i = 0; i<d.length; i++) temp[i] = d[i];
			data = temp;
		}
		else {
			double[] temp = new double [0];
			data = temp;
		}
	}
	
	/**
	 * This is the constructor for Stat when the values are given
	 * as float values in a parameter of the method. If the parameter
	 * is null the data values are assigned an empty array.
	 */
	public Stat(float[] f) {
		if(f != null) {
			double[] temp = new double [f.length];
			for (int i = 0; i<f.length; i++) temp[i] = (double)f[i];
			data = temp;
		}
		else {
			double[] temp = new double [0];
			data = temp;
		}
	}
	
	/**
	 * This is the constructor for Stat when the values are given
	 * as integer values in a parameter of the method. If the
	 * parameter is null an empty array is assigned to data.
	 */
	public Stat(int[] i) {
		if(i != null) {
			double[] temp = new double [i.length];
			for (int j = 0; j<i.length; j++) temp[j] = (double)i[j];
			data = temp;
		}
		else {
			double[] temp = new double [0];
			data = temp;
		}
	}
	
	/**
	 * This is the constructor for Stat when the values are given
	 * as float values in a parameter of the method. If the parameter
	 * is null an empty array is assigned to data.
	 */
	public Stat(long[] lo) {
		if(lo != null) {
			double[] temp = new double [lo.length];
			for (int i = 0; i<lo.length; i++) temp[i] = (double)lo[i];
			data = temp;
		}
		else {
			double[] temp = new double [0];
			data = temp;
		}
	}
	
	/**
	 * This is the getter method for data which returns a copied array
	 * that contains the same values as the current Stat data.
	 */
	public double[] getData() {
		double[] temp = new double [data.length];
		for (int i = 0; i<data.length; i++) temp[i] = data[i];
		return temp;
	}
	
	/**
	 * This is the setter method for data which changes the current 
	 * array for data to the array given as a parameter.
	 */
	public void setData(double[] d) {
		if(d != null) {
			double[] temp = new double [d.length];
			for (int i = 0; i<d.length; i++) temp[i] = d[i];
			data = temp;
		}
		else {
			double[] temp = new double [0];
			data = temp;
		}
	}
	
	/**
	 * This is the setter method for float data which changes the current 
	 * array for data to the float array given as a parameter.
	 */
	public void setData(float[] f) {
		if(f != null) {
			double[] temp = new double [f.length];
			for (int i = 0; i<f.length; i++) temp[i] = (double)f[i];
			data = temp;
		}
		else {
			double[] temp = new double [0];
			data = temp;
		}
	}
	
	/**
	 * This is the setter method for int data which changes the current 
	 * array for data to the int array given as a parameter.
	 */
	public void setData(int[] i) {
		if(i != null) {
			double[] temp = new double [i.length];
			for (int j = 0; j<i.length; j++) temp[j] = (double)i[j];
			data = temp;
		}
		else {
			double[] temp = new double [0];
			data = temp;
		}
	}
	
	/**
	 * This is the setter method for long data which changes the current 
	 * array for data to the long array given as a parameter.
	 */
	public void setData(long[] lo) {
		if(lo != null) {
			double[] temp = new double [lo.length];
			for (int i = 0; i<lo.length; i++) temp[i] = (double)lo[i];
			data = temp;
		}
		else {
			double[] temp = new double [0];
			data = temp;
		}
	}
	
	/**
	 * This is the equals method which checks to see if two Stat
	 * objects have the same data, which means same values in the
	 * same spots. It returns a value of true if they do, false if not.
	 */
	public boolean equals(Stat s) {
		//This returns false is the parameter is null.
		if(s == null) return false;
		boolean run = true;
		/* This returns false if the lengths of the 
		 * data sets in both arrays are not equal.
		 */
		if(data.length != s.getData().length) return false;
		/* If the data values are the same length, the values
		 * are then fed through a loop that checks the values
		 * in each data set at the same spots. If they are 
		 * ever different, the value of run is set to false to
		 * break the loop.
		 */
		while(run) {
			for(int i = 0; i < data.length; i++) {
				double one = data[i];
				double two = s.getData()[i];
				if(Math.abs((one-two)) < THRESHOLD) run = true;
				else run = false;
			}
			/* If the loop ends (which means all values are the same
			 * the method returns the true value of run.
			 */
			return run;
		}
		//Otherwise the false value of run is returned.
		return run;
	}
	
	/**
	 * The reset method resets the data values. It creates a
	 * new empty array and sets the data equal to this array.
	 */
	public void reset() {
		double[] temp = new double [0];
		data = temp;
	}
	
	/**
	 * The append double method adds the parameter values
	 * to the data values that are already stored if the
	 * parameter is not null. Otherwise nothing happens.
	 */
	public void append(double[] d) {
		if(d != null) {
			double[] temp = new double [data.length + d.length];
			for (int i = 0; i<data.length; i++) temp[i] = data[i];
			for (int i = 0; i<d.length; i++) temp[i + data.length] = d[i];
			data = temp;
		}
	}
	
	/**
	 * The append integer method adds the parameter values
	 * to the data values that are already stored if the
	 * parameter is not null. Otherwise nothing happens.
	 */
	public void append(int[] i) {
		if(i != null) {
			double[] temp = new double [data.length + i.length];
			for (int j = 0; j<data.length; j++) temp[j] = data[j];
			for (int j = 0; j<i.length; j++) temp[j + data.length] = (double)i[j];
			data = temp;
		}
	}
	
	/**
	 * The append long method adds the parameter values
	 * to the data values that are already stored if the
	 * parameter is not null. Otherwise nothing happens.
	 */
	public void append(long[] lo) {
		if(lo != null) {
			double[] temp = new double [data.length + lo.length];
			for (int i = 0; i<data.length; i++) temp[i] = data[i];
			for (int i = 0; i<lo.length; i++) temp[i + data.length] = (double)lo[i];
			data = temp;
		}
	}
	
	/**
	 * The append float method adds the parameter values
	 * to the data values that are already stored if the
	 * parameter is not null. Otherwise nothing happens.
	 */
	public void append(float[] f) {
		if(f != null) {
			double[] temp = new double [data.length + f.length];
			for (int j = 0; j<data.length; j++) temp[j] = data[j];
			for (int i = 0; i<f.length; i++) temp[i + data.length] = (double)f[i];
			data = temp;
		}
	}
	
	/**
	 * The isEmpty method returns true if the data object has a length
	 * of 0, otherwise it returns false.
	 */
	public boolean isEmpty() {
		if(data.length == 0) return true;
		else return false;
	}
	
	/**
	 * The toString method replaces the generic object toString
	 * and prints out the data array.
	 */
	public String toString() {
		String temp = "[";
		if(data.length == 0) temp = "[]";
		for(int i = 0; i < data.length; i++) {
			double one = data[i];
			if((i+1) == data.length) temp = temp + one + "]";
			else temp = temp + one + ", ";
		}
		return temp;
	}
	
	/**
	 * This is the implementation of the minimum method
	 * which returns the smallest value in a data set.
	 */
	public double min() {
		if(data.length == 0) return Double.NaN;
		double minimum = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i] < minimum) minimum = data[i];
		}
		return minimum;
	}
	
	/**
	 * This is the implementation of the maximum method
	 * which returns the largest value in a data set.
	 */
	public double max() {
		if(data.length == 0) return Double.NaN;
		double maximum = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i] > maximum) maximum = data[i];
		}
		return maximum;
	}
	
	/**
	 * This is the average method which computes the 
	 * average of a dataset. This is done by adding 
	 * all the numbers together and dividing by the 
	 * array's length.
	 */
	public double average() {
		if(data.length == 0) return Double.NaN;
		double sum = 0;
		double average;
		for(int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		average = sum/(double)data.length;
		return average;
	}
	
	/**
	 * This method returns the most occurring number
	 * in the dataset. If the dataset only consists
	 * of one number that number is returned. Otherwise
	 * the program establish some double and int values
	 * to help with finding the mode of a larger set. 
	 * If the set has multiple numbers that occur the
	 * same amount of time, the NaN value is returned.
	 */
	public double mode() {
		if(data.length == 0) return Double.NaN;
		double mode;
		if(data.length == 1) mode = data[0];
		else {
			double currentMode = 0.0;
			double currentCheck;
			int otherOccurencesValue = 0;
			int currentMaxOccurences = 0;
			for(int i = 0 ; i < data.length; i++) {
				currentCheck = data[i];
				int numberOfOccurences = 0;
				for(int j =0; j < data.length; j++) {
				if(Math.abs(data[j] - currentCheck) < THRESHOLD) numberOfOccurences++;
				}
				if(numberOfOccurences > otherOccurencesValue) {
					currentMode = data[i];
					otherOccurencesValue = numberOfOccurences;
					currentMaxOccurences = numberOfOccurences;
				}
				if(currentCheck != currentMode && (currentMaxOccurences == numberOfOccurences)) {
					currentMode = Double.NaN;
				}
			}
			mode = currentMode;
		}
		return mode;
	}
	
	/**
	 * The variance method returns Not a Number if the data
	 * is empty, otherwise the method first finds the mean of
	 * the data. Then the method finds the difference between
	 * each element and squares this difference then add it
	 * into a total sum. The sum is then divided by the number
	 * of elements and the variance is returned.
	 */
	public double variance() {
		if(data.length == 0) return Double.NaN;
		else {
			double sum = 0;
			double mean = average();
			for(int i = 0; i < data.length; i++) {
				double currentValue = Math.pow((data[i] - mean) , 2);
				sum = sum + currentValue;
			}
			return (sum/(double)(data.length));
		}
	}
	
	/**
	 * For the standard deviation method, if the data array is empty
	 * not a number is returned, otherwise the square root of the 
	 * variance is returned.
	 */
	public double standardDeviation() {
		if(data.length == 0) return Double.NaN;
		double variance = variance();
		return Math.sqrt(variance);
	}
}
