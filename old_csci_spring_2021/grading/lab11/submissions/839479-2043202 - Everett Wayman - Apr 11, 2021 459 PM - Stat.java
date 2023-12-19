/*
 * Stat.java
 * Author: Everett Wayman
 * Submission Date: 04/11/21
 *
 * Purpose: This program uses different methods to find the
 * min, max, average, and mode of different one-dimensional arrays.
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
	
	// Here the method Stat() creates an object.
	public Stat() {
		data = new double[] {0};
	}
	
	// Here the method creates an object with data that is double.
	public Stat(double[] d) {
		if (d == null) {
			double[] copy = new double[0];
			data = copy;
		}
		else {
			double[] copy = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				copy[i] = d[i];
			}
			data = copy;
		}
	}
	
	// Here the method getData() copies the data from the array into a copy 
	// by looping through each index.
	public double[] getData() {
		double[] copy = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			copy[i] = data[i];
		}
		return copy;
	}
	
	// Here the method setData(double[] d) sets the values of data as doubles.
	public void setData(double[] d) {
		if (d == null) {
			double[] copy = new double[0];
			data = copy;
		} else {
			double[] copy = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				copy[i] = d[i];
			}
			data = copy;
		}
		
	}
	
	// The method equals(Stat s) returns a true if both objects have the same length
	// and the same elements within.
	public boolean equals(Stat s ) {
		if ((this == null || s == null) && !(this == null && s == null)) {
			return false;
		}
		if (data.length == s.data.length) {
			for (int i = 0; i < data.length; i++) {
				if (data[i] != s.data[i]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	// Here the method toString() turns the array numbers into a string by looping through
	// each number and adding them to the string dataString.
	public String toString() {
		String dataString = "[";
		for (int i = 0; i < data.length; i++) {
			if (i < data.length - 1) {
				dataString += data[i] + ", ";
			}
			else if (i == data.length - 1) {
				dataString += data[i] + "]";
			}
		}
		return dataString;
	}
	
	// Here the method min() loops through the values of the array to find the smallest number.
	public double min() {
		double minValue = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < minValue) {
				minValue = data[i];
			}
		}
		return minValue;
	}
	
	// Here the method max() loops through the values of the array to find the largest number.
	public double max() {
		double maxValue = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > maxValue) {
				maxValue = data[i];
			}
		}
		return maxValue;
	}
	
	// The method average() loops through the array adding the numbers up then divides by the 
	// data.length to get the average of all the numbers.
	public double average() {
		double sum = 0.0;
		double averageValue;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		averageValue = sum / data.length;
		
		return averageValue;
	}
	
	// Here the method mode() loops through the array keeping count of how many times a number 
	// appears in the array and returns the most frequent appearing number.
	// If there is more than one mode it returns NaN.
	public double mode()
	{
	    if(data.length == 1)
	        return data[0];
	    double temp;
	    double [] freq = new double [data.length]; 
	    int visited = -1;  

	    for (int i = 0; i < data.length; i++)
	    {           
	        int count = 1;  
	        for(int j = i + 1; j < data.length; j++)
	        {  
	            if(data[i] == data[j])
	            {  
	                count++;   
	                freq[j] = visited;  
	            }  
	        }  
	        if(freq[i] != visited)  
	            freq[i] = count;  
	    }  
	    
	    for (int i = 0; i < freq.length; i++)   
	    {
	        for (int j = i + 1; j < freq.length; j++) 
	        {
	            if (freq[i] < freq[j]) 
	            {
	                temp = data[i];
	                data[i] = data[j];
	                data[j] = temp;

	                temp = freq[i];
	                freq[i] = freq[j];
	                freq[j] = temp;
	            }
	        }
	    }

	    if (freq[0] == freq[1])
	        return Double.NaN;
	    else
	        return data[0];
	}
}
