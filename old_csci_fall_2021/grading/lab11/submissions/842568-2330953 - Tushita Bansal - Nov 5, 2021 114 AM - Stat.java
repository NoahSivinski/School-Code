/*
 * Stat.java
 * Author: Tushita Bansal
 * Submission Date:  Novermber 4, 2021
 *
 * Purpose: Finds different aspects of an Array that is inputted by the user.
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
	
	public Stat() {
		data = new double[0];
	}
	
	public Stat(double[] d) {
		setData(d);
	}
	public Stat(float[] flo) { 
		setData(flo);
	}
	
	public Stat(int[] inte) { 
		setData(inte);
	}
	
	public Stat(long[] lon) { 
		setData(lon);
	}
	
	
	public void setData(float[] flo) {
		double[] newArray = new double[0];
		if (flo != null) {
			newArray = new double[flo.length];
				
			for (int i = 0; i < flo.length; i++) {
				newArray[i] = flo[i];
			}
		}
		data = newArray;
	}
	
	public void setData(double[] d) {
		double[] newArray = new double[0];
		if(d != null) {
			newArray = new double [d.length];
			for(int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}
		}
		data = newArray;
	}
	
	
	
	public double[] getData() {
		return data;
	}
	
	
	public void setData(int[] inte) {
		double[] newArray = new double[0];
		if (inte != null) {
			newArray = new double[inte.length];
				
			for (int j = 0; j < inte.length; j++) {
				newArray[j] = inte[j];
			}
		}
		data = newArray;
	}
	
	public void setData(long[] lon) { //9. mutator method for long[] data
		double[] newArray = new double[0];
		if (lon != null) {
			newArray = new double[lon.length];
				
			for (int i = 0; i < lon.length; i++) {
				newArray[i] = lon[i];
			}
		}
		data = newArray;
	}
	
	//Equals Method
	public boolean equals(Stat s) {
		boolean equal = true;
		
		if( s != null && s.data.length == data.length) {
			for (int i = 0; i < s.data.length; i++) {
				if(Math.abs(s.data[i] - data[i]) > .0000001) {
					equal = false;
				}
			}
		}
		else {
			equal = false;
		}
		return equal;
		}
		
	public void reset() {
		data = new double[0];
	}
	
	public void append(int[] inte) { 
		if (inte != null) {
			double[] newArray = new double[data.length + inte.length];
			
			for (int j = 0; j < newArray.length; j++) {
				if (j < data.length) {
					newArray[j] = data[j];}
				else {
					newArray[j] = inte[j - data.length];}
			}
			data = newArray;
		}
	}
	
	public void append(float[] flo) { 
		if (flo != null) {
			double[] newArray = new double[data.length + flo.length];
			
			for (int j = 0; j < newArray.length; j++) {
				if (j < data.length) {
					newArray[j] = data[j];}
				else {
					newArray[j] = flo[j - data.length];}
			}
			data = newArray;
		}
	}
	
	public void append(long[] lon) { 
		if (lon != null) {
			double[] newArray = new double[data.length + lon.length];
			
			for (int j = 0; j < newArray.length; j++) {
				if (j < data.length) {
					newArray[j] = data[j];}
				else {
					newArray[j] = lon[j - data.length];}
			}
			data = newArray;
		}
	}
		
	public void append(double[] d) { 
		if (d != null) {
			double[] newArray = new double[data.length + d.length];
			
			for (int j = 0; j < newArray.length; j++) {
				if (j < data.length) {
					newArray[j] = data[j];}
				else {
					newArray[j] = d[j - data.length];}
			}
			data = newArray;
		}
	}
	
	
	//This method checks to see whether or not the array is empty
		public boolean isEmpty() {
			return data.length == 0;
		}
	//toString Method
	public String toString() {
		if(isEmpty()) {
			return "[]";
		}
		String s= "[";
		for (int i = 0; i < data.length; i++) {
			s += data[i];
			if(i == data.length-1) {
				s += "]";
			}
			else {
				s += ", ";
			}
		}
		return s;
	}
	//Min Method
	public double min() {
		if(!isEmpty()) {
			double min = data[0];
		
			
			for (int i = 0; i < data.length; i++) {
				if (data[i] < min) {
					min = data[i];
				}
			}
			return min;
		}
		
		
		else {
			return Double.NaN;
		}
				
		}
	//Max Method
	public double max() {
		if(!isEmpty()) {
		double max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		
	}
		return max;	
		}
		else {
			return Double.NaN;
		}
	}
	//Average Method
	public double average() {
		if(!isEmpty()) {
			
		
		double averageNumber;
		double number = 0;
		for (int i = 0; i < data.length; i++) {
			number += data[i];
		}
		return averageNumber = number/data.length;
		
		}
		else {
			return Double.NaN;
		}
		}
	//Mode Method
	public double mode() {
		 
		if(!isEmpty()) {
			double mode = 0, repeat = 1;
			
			for(int i = 0; i < data.length; i++) {
				int x = 0;
				for(int j = i; j < data.length; j++) {
					if(Math.abs(data[i] - data[j]) <= .0000001) {
						x++;
					}
				}
				if(x > repeat) {
					mode = data[i];
					repeat = x;
				}
				else if(x == repeat) {
					mode = Double.NaN;
				}
			}
			return mode;
		}
		else {
			return Double.NaN;
		}	
}
	private int occursNumberOfTimes(double d) { 
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == d)
				count++;
		}
		
		return count;
	}
	public double variance() { 
		if (!isEmpty()) {
			double distance = 0;
			
			for (int i = 0; i < data.length; i++)
				distance += Math.pow(data[i] - average(), 2);
			
			return distance / data.length;
		}
		else {
			return Double.NaN;}
		
	}
	public double standardDeviation() { 
		return Math.sqrt(variance());
	}
		
		
}
	
	