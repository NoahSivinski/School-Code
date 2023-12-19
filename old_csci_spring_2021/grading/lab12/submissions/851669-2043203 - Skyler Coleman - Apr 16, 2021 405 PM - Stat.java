/*
 * [CSCI 1301].java
 * Author:  [Skyler Coleman] 
 * Submission Date:  [04/16/2021]
 *
 * Purpose: This program for Stat class stores an array of double 
 * values. It also holds the methods that compute the max, min, max,
 * mode, average, variation, and standard deviation of these values. 
 * It also contains a method that can conjoin two arrays.
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
	
	private double[] data; // private array of double values
	
	//default constructor for Stat
	public Stat() {
		Stat.this.data = new double[] {};
	}
		
	//Constructs double Stat object
	
	public Stat(double[] d) {
		
		this.setData(d);
		
	}
	
	public Stat(float[] f) {
		
		this.setData(f);
	}
		public Stat(int[] i) {
	
			this.setData(i);
	}
		public Stat(long[] lo) {
			
			this.setData(lo);
		}
		
	// retrieves value of data
	public double[] getData(){
		double Data2 [] = data;
		return Data2;
	}
	
	public void setData(float[] f) {
		
		if (f == null) {
			
			Stat.this.data = new double[] {};
		}
		else {
		double newData[] = new double [f.length];
		
		for (int i = 0; i < f.length; i++)
		{
			newData[i] = (double)f[i];
		}	
		
		data = newData;
		}
	}
	
	//sets the values of the data array
	public void setData(double[] d) {
		
	
		if (d == null) {
			
			Stat.this.data = new double[] {};
		}
		else {
		double newData2[] = new double [d.length];
		
		for (int i = 0; i < d.length; i++)
		{
			newData2[i] = d[i];
		}
		
		data = newData2;
		}
	}
	
	public void setData(int[] i) {
		
		if (i == null) {
			
			Stat.this.data = new double[] {};
		}
		else {
		double newData[] = new double [i.length];
		
		for (int j = 0; j < i.length; j++)
		{
			newData[j] = (double)i[j];
		}
		
		data = newData;
		}
	}
	
	public void setData(long[] lo) {
		
		if (lo == null) {
			
			Stat.this.data = new double[] {};
		}
		else {
		double newData[] = new double [lo.length];
		
		for (int i = 0; i < lo.length; i++)
		{
			newData[i] = (double)lo[i];
		}
		
		data = newData;	
		}
	}
	
	//returns whether or not the objects of the calling passed Stat object are equal with true or false
	public boolean equals(Stat s) {
		
		boolean doesEqual = true;
		
		if(s == null) {
			doesEqual = false;
		}
		
		else if (data.length == s.data.length) {
			
		for(int i = 0; i < data.length; i++) {
			
			if(data[i] != s.data[i]) 
				doesEqual = false;
			}
		}
		
		else doesEqual = false;
		
		return doesEqual;
	}
	
	//clears the data array
	public void reset() {
		
		double newData[] = new double[] {};
		
		data = newData;
	}
	
	//creates new away with first the values from data and then the values from the parameter 
	public void append(double[] d) {
		
		if (d != null) {
		
		double newData[] = new double[d.length + data.length];
		
		for (int i = 0; i < this.data.length; i++)
		{
			newData[i] = data[i];
		}
		
		for (int i = 0; i < d.length; i++)
		{
			newData[i + data.length] =  (double)d[i];
		}
		
		data = newData;
		}
	}
	
	public void append(float[] f) {
		
		if (f != null) {
		
		double newData[] = new double[f.length + data.length];
		
		for (int i = 0; i < this.data.length; i++)
		{
			newData[i] = data[i];
		}
		
		for (int i = 0; i < f.length; i++)
		{
			newData[i + data.length] = (double)f[i];
		}
		
		data = newData;
		}
	}

	public void append(int[] i) {
		
		if (i != null) {
		
		double newData[] = new double[i.length + data.length];
		
		for (int j = 0; j < this.data.length; j++)
		{
			newData[j] = data[j];
		}
		
		for (int j = 0; j < i.length; j++)
		{
			newData[j + data.length] = (double)i[j];
		}
		
		data = newData;
		}
	}
		
		public void append(long[] lo) {
			
			if (lo != null) {
			
			double newData[] = new double[lo.length + data.length];
			
			for (int i = 0; i < this.data.length; i++)
			{
				newData[i] = data[i];
			}
			
			for (int i = 0; i < lo.length; i++)
			{
				newData[i + data.length] = (double)lo[i];
			}
			
			data = newData;
			}
	}

	//returns string representation of the data element 
	public String toString() {
		
		String result = "";
		
		for(int i = 0; i < Stat.this.data.length; i++) {
			
			if (i == 0)	
				result = result + data[i];
			else
			result = result + ", " + data[i];
		}
		
		return "[" + result + "]";
	}

	//returns true if the array is empty and false if not
	public boolean isEmpty() {
		
		boolean isEmpty;
		if (data.length == 0) {
			isEmpty = true;
		}
		else
			isEmpty = false;
		
		return isEmpty;
	}
	
	// returns minimum value of the data array
	public double min() {
		
		double min;
		
		if (isEmpty()) {
			min = Double.NaN;
		}
		else {
		 min = data[0]; 
		
		for(int i = 1; i < data.length; i++) {
			
			if (min > data[i])	
				min = data[i];
			}
		}
		
		return min;
	}
	
	// returns maximum value of the data array
	public double max() {
		
		double max;
		if (isEmpty()) {
			max = Double.NaN;
		}
		else {  
		max = data[0]; 
		
		for(int i = 1; i < data.length; i++) {
			if (max < data[i])	
				max = data[i];
			}
		}
		
		return max;
	}
	
	// returns the average value of the data array
	public double average() {
	
		double average;
		
		if (isEmpty()) {
			average = Double.NaN;
		}
		else {
		double sum = 0; 
		
		for(int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		
		average = sum / data.length;
		}
		
		return average;
	}
	
	// returns mode value of the data array
	public double mode() {
		
		double mode = Double.NaN; // mode of array, Double.NaN is a place holder value
		double mode2 = Double.NaN; // any value with more than 1 instance in array
		int count1; // the number of times a value in the array appears in an array
		int count2 = 0; //the highest number of times a value in the array occurs
		
		if (isEmpty()) {
			mode = Double.NaN;
		}
		else if (data.length == 1) {
			
			mode = data[0];
		}
		else {
			
		for(int i = 0; i < data.length; i++) {
			
			double number = data[i];
			count1 = 0;
			
			if ( occursNumberOfTimes(data[i]) > 1) {
				count1 = occursNumberOfTimes(data[i]);
				mode2 = number;
			}
			
			if (count1 > count2) {
				
			count2 = count1;
			mode = number;
			}
			
			if (count2 == count1 && mode2 != mode)
				mode = Double.NaN;
			}
		}
		
			return mode;
		}
	
	// helper method for mode that returns the number of times a value occurs in an array
	private int occursNumberOfTimes(double value) {
		
		int count1 = 0; 
		int occursNumberOfTimes; 
		
		for(int i = 0; i < data.length; i++) {			
			if (Math.abs(value - data[i]) < 0.000000001) {
					count1++;
					}
			}
		occursNumberOfTimes = count1;
		
		return occursNumberOfTimes;
	}
	
	//returns variance of array
	public double variance() {
		
		double variance;
		
		if (isEmpty()) {
			variance = Double.NaN;
		}
		else {
		double sumOfDifferencesSquared = 0;
		double difference;
		
		for(int i = 0;i < data.length; i++) {
			difference = data[i] - this.average();
			
			sumOfDifferencesSquared =  sumOfDifferencesSquared + (difference * difference);
		}
		
		variance = sumOfDifferencesSquared / data.length;
		}
		
		return variance;
	}
	
	//returns standard deviation of array
	public double standardDeviation() {
		
		double standardDeviation;
		
		if (isEmpty()) {
			standardDeviation = Double.NaN;
		}
		else standardDeviation = Math.sqrt(this.variance());
		
		return standardDeviation;
		}
}
