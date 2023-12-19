/*
 * [CSCI 1301].java
 * Author:  [Skyler Coleman] 
 * Submission Date:  [04/09/2021]
 *
 * Purpose: This program for Stat class stores an array of double 
 * values. It also holds the methods that compute the max, min, max,
 * mode, and average of these values.
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
		Stat.this.data = new double[] {0.0};
	}
		

	//Constructs Stat object
	public Stat(double[] d) {
		
		double newData[] = new double [d.length];
		
		for (int i = 0; i < d.length; i++)
		{
			newData[i] = d[i];
		}
		
		data = newData;
	}
	
	// retrieves value of data
	public double[] getData(){
		double Data2 [] = data;
		return Data2;
	}
	
	//sets the values of the data array
	public void setData(double[] d) {
		
double newData2[] = new double [d.length];
		
		for (int i = 0; i < d.length; i++)
		{
			newData2[i] = d[i];
		}
		
		data = newData2;
	}
	
	//returns whether or not the objects of the calling passed Stat object are equal with true or false
	public boolean equals(Stat s) {
		
		boolean doesEqual = true;
		
		if (data.length == s.data.length) {
			
		for(int i = 0; i < data.length; i++) {
			
			if(data[i] != s.data[i]) 
				doesEqual = false;
			}
		}
		
		else doesEqual = false;
		
		return doesEqual;
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
	
	// returns minimum value of the data array
	public double min() {
		
		double min = data[0]; 
		
		for(int i = 1; i < data.length; i++) {
			
			if (min > data[i])	
				min = data[i];
		}
		
		return min;
	}
	
	// returns maximum value of the data array
	public double max() {
		
		double max = data[0]; 
		
		for(int i = 1; i < data.length; i++) {
			if (max < data[i])	
				max = data[i];
			
		}
		
		return max;
	}
	
	// returns the average value of the data array
	public double average() {
		
		double sum = 0; 
		
		for(int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		
		double average = sum / data.length;
		
		return average;
	}
	
	// returns mode value of the data array
	public double mode() {
		
		double mode = Double.NaN; // mode of array, Double.NaN is a place holder value
		double mode2 = Double.NaN; // any value with more than 1 instance in array
		int count1; // the number of times a value in the array appears in an array
		int count2 = 0; //the highest number of times a value in the array occurs
		
		if (data.length == 1) {
			
			mode = data[0];
		}
		else {
			
		for(int i = 0; i < data.length; i++) {
			
			double number = data[i];
			count1 = 0;
			
			for(int j = 0; j < data.length; j++) {
				
				if (Math.abs(number - data[j]) < 0.000000001) {
					count1++;
					
					if (count1 > 1) {
						mode2 = number;
					}
				}
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
		
}
