/*
 * Stat.java
 * Author: Everett Wayman
 * Submission Date: 04/15/21
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
		data = new double[0];
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
	
	// This method Stat(float[] f) creates an object with float data and changes it to double.
	public Stat (float[] f) {
		if (f == null) {
			double[] copy = new double[0];
			
			data = copy;
		}
		else {
			double[] copy = new double[f.length];
			
			for (int i = 0; i < f.length; i++) {
				copy[i] = f[i];
			}
			data = copy;
		}
	}
	
	// This method Stat(int[] i) creates an object with integer data and changes it to double.
	public Stat (int[] i) {
		if (i == null) {
			double[] copy = new double[0];
			
			data = copy;
		}
		else {
			double[] copy = new double[i.length];
			
			for (int k = 0; k < i.length; k++) {
				copy[k] = i[k];
			}
			data = copy;
		}
	}
	
	// This method Stat(long[] lo) creates an object with long data and changes it to double.
	public Stat (long[] lo) {
		if (lo == null) {
			double[] copy = new double[0];
			
			data = copy;
		}
		else {
			double[] copy = new double[lo.length];
			
			for (int i = 0; i < lo.length; i++) {
				copy[i] = lo[i];
			}
			data = copy;
		}
	}
	// This method setData (float[] f) sets the data values of float variables to double.
	public void setData (float[] f) {
		if (f == null) {
			double[] copy = new double[0];
			
			data = copy;
		}
		else {
			double[] copy = new double[f.length];
			
			for (int i = 0; i < f.length; i++) {
				copy[i] = f[i];
			}
			data = copy;
		}
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
	
	// This method setData (int[] i) sets the data values of integers variables to double.
	public void setData (int[] i) {
		if (i == null) {
			double[] copy = new double[0];
			
			data = copy;
		}
		else {
			double[] copy = new double[i.length];
			
			for (int k = 0; k < i.length; k++) {
				copy[k] = i[k];
			}
			data = copy;
		}
	}
	
	// This method setData (long[] lo) sets the data values of long variables to double.
	public void setData (long[] lo) {
		if (lo == null) {
			double[] copy = new double[0];
			
			data = copy;
		}
		else {
			double[] copy = new double[lo.length];
			
			for (int i = 0; i < lo.length; i++) {
				copy[i] = lo[i];
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
	
	// This method will reset the data in an array to the empty array.
	public void reset() {
		double[] copy = new double[0];
		
		data = copy;
	}
	
	// This append(in[] i) method will create a new double array containing the original data and the data of i.
	public void append(int[] i) {
		if (i == null ) {
		}
		else {
			double[] copy = new double[data.length + i.length];
			
			for (int k = 0; k < data.length; k++) {
				copy[k] = data[k];
			}
			for (int k = 0; k < i.length; k++) {
				copy[k + data.length] = i[k];
			}
			data = copy;
		}
	}
	
	// This append(float[] f) method will create a new double array containing the original data and the data of f.
	public void append(float[] f) {
		if (f == null ) {
		}
		else {
			double[] copy = new double[data.length + f.length];
			
			for (int i = 0; i < data.length; i++) {
				copy[i] = data[i];
			}
			for (int i = 0; i < f.length; i++) {
				copy[i + data.length] = f[i];
			}
			data = copy;
		}
	}
	
	// This append (long[] lo) method will create a new double array containing the original data and the data of lo.
	public void append(long[] lo) {
		if (lo == null ) {
		}
		else {
			double[] copy = new double[data.length + lo.length];
			
			for (int i = 0; i < data.length; i++) {
				copy[i] = data[i];
			}
			for (int i = 0; i < lo.length; i++) {
				copy[i + data.length] = lo[i];
			}
			data = copy;
		}
	}
	
	// This append(double[] d) method will create a new double array containing the original data and the data of d.
	public void append(double[] d) {
		if (d == null ) {
		}
		else {
			double[] copy = new double[data.length + d.length];
			
			for (int i = 0; i < data.length; i++) {
				copy[i] = data[i];
			}
			for (int i = 0; i < d.length; i++) {
				copy[i + data.length] = d[i];
			}
			data = copy;
		}
	}
	
	// This method tests if the array is empty and returns a boolean based on if it is or not.
	public boolean isEmpty() {
		if ((data == null) || (data.length == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Here the method toString() turns the array numbers into a string by looping through
	// each number and adding them to the string dataString.
	public String toString() {
		String dataString = "";
		for (int i = 0; i < data.length; i++) {
			dataString = dataString + data[i];
			
			if (i < data.length - 1) {
				dataString = dataString + ", ";
			}
		}
		return "[" + dataString + "]";
	}
	
	// Here the method min() loops through the values of the array to find the smallest number.
	public double min() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double minValue = data[0];
			for (int i = 0; i < data.length; i++) {
				if (data[i] < minValue) {
					minValue = data[i];
				}
			}
			return minValue;
		}
	}
	
	// Here the method max() loops through the values of the array to find the largest number.
	public double max() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double maxValue = 0;
			for (int i = 0; i < data.length; i++) {
				if (data[i] > maxValue) {
					maxValue = data[i];
				}
			}
			return maxValue;
		}
	}
	
	// The method average() loops through the array adding the numbers up then divides by the 
	// data.length to get the average of all the numbers.
	public double average() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double sum = 0.0;
			double averageValue;
			for (int i = 0; i < data.length; i++) {
				sum = sum + data[i];
			}
			averageValue = sum / data.length;
			
			return averageValue;
		}
	}
	
	// Here the method mode() loops through the array keeping count of how many times a number 
	// appears in the array and returns the most frequent appearing number.
	// If there is more than one mode it returns NaN.
	public double mode()
	{
	   if ((data == null) || (data.length == 0)) {
		   return Double.NaN;
	   }
	   else {
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
	
	// This method will calculate the variance found in the data set. It does this by finding the difference of
	// an each element and the average, then the absolute value of that difference, then this is squared and the sum of these squared
	// values are added up and divided by the length of the data to get variance.
	public double variance() {
		double variance = 0;
		double varianceSum = 0;
		double absValue = 0;
		
		double average = this.average();
		
		for (int i = 0; i < data.length; i++) {
			absValue = Math.abs(data[i] - average);
			varianceSum += absValue * absValue;
		}
		variance = varianceSum / data.length;
		return variance;
	}
	
	// This method just returns the squared root of the variance to get the standard deviation.
	public double standardDeviation() {
		if ((data == null) || (data.length == 0)) {
			   return Double.NaN;
		   }
		   else {
			   double standardDeviation = Math.sqrt(this.variance());
			   
			   return standardDeviation;
		   }
	}
}
