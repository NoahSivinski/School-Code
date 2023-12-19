
/*
 * CSCI1301 27827
 * Circle / Stat.java
 * Author:  Casey Wesolowski 
 * Submission Date:  April 10th, 2021
 *
 * Purpose:  The purpose of Stat.java is to continue to practice
 * defining and implementing classes using a given UML diagram.
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
	
	private double[] data; //private double instance data
	
	public static final double THRESHOLD = 0.000000001;	
	
	//Stat – default constructor – a double array with only 0.0
	public Stat()	{
		data = new double[] {0.0};
		return;
	}
	//Stat – constructs a Stat objects using the values in d
	public Stat(double[] d)	{
		 data = d;
	}
	
	//Should create a new array containing the same values as data
	public double[] getData()	{
		double[] array = data;
		return array;
	}
	//Should create a new array containing the exact elements of d
	//And assign data a reference to the new array
	public double[] setData(double[] d) { 
		this.data = d;
		double[] newArray = d;
		return newArray;
	}
	//equals – true if the data objects of both the calling Stat object and 
	//passed Stat object s have the same values
	public boolean equals(Stat s) {
		if(setData(data) == getData())	{
			return true;
		}
		else	{
			return false;
		}
	}
	//toString
	public String toString() {
		String printArray = "";
		for(int i = 0; i < data.length - 1; i++) {
			printArray += data[i] + ", ";
		}
		printArray += data[data.length - 1];
		return "[" + printArray + "]";
	}
		
	//min – returns the minimum value of the data array
	public double min()	{
		double minimum;
		for(int i = 0; i < data.length; i++ )	{
			for(int j = i + 1; j < data.length; j++)	{
				if(data[i] > data[j]) {
					minimum = data[i];
					data[i] = data[j];
					data[j] = minimum;
				}
			}
		}
		return data[0];
	}
	//max – returns the maximum value of the data array
	public double max()	{
		double maximum;
		for(int i = 0; i < data.length; i++) {
			for(int j = i + 1; j < data.length; j++) {
				if(data[i] < data[j])	{
					maximum = data[j];
					data[j] = data[i];
					data[i] = maximum;
				}
			}
		}
		return data[0];
		
	}
	//average – returns the average value of the data array
	public double average()	{
		double added = 0;
		for(int i = 0; i < data.length; i++)	{
			added = added + data[i];
		}
		added = added / data.length;
		return added;
	}
	//average – returns the value that occurs the most in the data array
	public double mode()	{
		double most = 0;
		int counter = 0, currentCount = 0;
		for (int i = 0; i < data.length; i++) {
		    double current = data[i];
		    currentCount = 1;
		    for (int j = i + 1; j < data.length; j++) {
		        if (Math.abs(data[j] - current) < THRESHOLD) {
		            ++currentCount;
		        } 
		    }
		    if (currentCount >= counter) {
		    	counter = currentCount;
		        most = current;
		    } 
		    else {
		        most = Double.NaN;
		    }
		}
		return most;
	}
	
	public static void main(String[] args) {
		
		
	}
}










//I have no idea what I'm doing
