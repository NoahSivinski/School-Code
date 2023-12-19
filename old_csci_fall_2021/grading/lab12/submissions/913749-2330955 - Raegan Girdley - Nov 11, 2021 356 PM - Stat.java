/*
 * Stat.java
 * Author:  Raegan Girdley
 * Submission Date:  11/11/2021
 *
 * Purpose: Takes array and modifies it/displays it/etc.
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
		
	double[] data, newData;
	float [] fData, fNewData;
	int[] iData, iNewData;
	long [] loData, loNewData;
	
	//creates empty array
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
	
	//creates array of doubles based on input
	public Stat(double[] d) {
		data = new double[d.length];
		for (int i  = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}
	
	//creates float array and places values into double data array
	public Stat(float[] f) {
		fData = new float[f.length];
		for (int i = 0; i < f.length; i++) {
			fData[i] = f[i];
			data[i] = fData[i];
		}
	}
	
	//creates int array and places values into double data array
	public Stat(int[] i) {
		iData = new int[i.length];
		for (int j = 0; j < i.length; j++) {
			iData[j] = i[j];
			data[j] = iData[j];
		}
	}
	
	//creates long array and places values into double data array
	public Stat(long[] lo) {
		loData = new long[lo.length];
		for (int i = 0; i < lo.length; i++) {
			loData[i] = lo[i];
			data[i] = loData[i];
		}
	}
	
	//retrieves array
	public double[] getData() {
		newData = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		return newData;
	}
	
	//modifies data in array
	public void setData(double[] d) {
		newData = new double[d.length];
		for (int i  = 0; i < d.length-1; i++) {
			newData[i] = d[i];
		}
		data = newData;
	}
	
	//modifies float array and sets reference to double data array
	public void setData(float[] f) {
		fNewData = new float[f.length];
		for (int i = 0; i < f.length-1; i++) {
			fNewData[i] = f[i];
			newData[i] = fNewData[i];
		}
		data = newData;
	}
	
	//modifies int array and sets reference to double data array
	public void setData(int[] i) {
		iNewData = new int[i.length];
		for (int j = 0; j < i.length-1; j++) {
			iNewData[j] = i[j];
			newData[j] = iNewData[j];
		}
		data = newData;
	}
	
	//modifies long array and sets reference to double data array
	public void setData(long[] lo) {
		loNewData = new long[lo.length];
		for (int i = 0; i < lo.length-1; i++) {
			loNewData[i] = lo[i];
			newData[i] = loNewData[i];
		}
		data = newData;
	}
	
	//checks if two arrays are equal
	public boolean equals(Stat s) {
		newData = s.getData();
		if (newData.length == data.length) {
			for (int i = 0; i < data.length-1; i++) {
				if (data[i] != newData[i]) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	//prints array out as string
	public String toString() {
			String output = "[";
			
			for (int i = 0; i < data.length; i++) {
				if (i < data.length - 1) {
					output += String.valueOf(data[i]) + ", ";
				}
				else {
					output += String.valueOf(data[i]);
				}
			}
			
			output += "]";
			return output;
	}
	
	//finds minimum value in array
	public double min() {
		double min = Integer.MAX_VALUE;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		
		return min;
	}
		
	//finds maximum value in array
	public double max() {
		double max = Integer.MIN_VALUE;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		
		return max;
	}
		
	//calculates average value in array
	public double average() {
		double average, total = 0;
		
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		
		average = total / data.length;
		return average;
	}
		
	//finds mode in array
	public double mode() {
		
		data = getData();
		int checker = 0, checker2 = 0, counter = 0, counter2 = 0;
		double mode = 0, mode2 = 0;
		
		for (int i = 0; i < data.length; i++) {
			int count = 0;
			for (int j = 0; j < data.length; j++) {
				if (data[j] == data[i]) {
					count++;
				}
			}
			
			if (count > checker) {
				checker = count;
				mode = data[i];
				counter = occursNumberOfTimes(mode);
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] != mode) {
				int count = 0;
				for (int j = 0; j < data.length; j++) {
					if (data[j] == data[i]) {
						count++;
					}
				}
				
				if (count > checker2) {
					checker2 = count;
					mode2 = data[i];
					counter2 = occursNumberOfTimes(mode2);
				}
			}	
		}
		
		if (isEmpty() || counter == counter2) {
			return Double.NaN;
		}
		else {
			return mode;
		}
		
	}
	
	//creates empty array
	public void reset() {
		newData = new double[0];
		data = newData;
	}
	
	//takes array of ints and adds it onto data
	public void append(int[] i) {
		if (i != null) {
			newData = getData();
			for (int j = newData.length, x = 0; j < newData.length+i.length; j++, x++) {
				newData[j] += i[x];
			}
			for (int j = 0; j < newData.length; j++) {
				data[j] = newData[j];
			}
		}
	}
	
	//takes array of floats and adds it onto data
	public void append(float[] f) {
		if (f != null) {
			newData = getData();
			for (int i = newData.length, x = 0; i < newData.length+f.length; i++, x++) {
				newData[i] += f[x];
			}
			for (int i = 0; i < newData.length; i++) {
				data[i] = newData[i];
			}
		}
	}
	
	//takes array of longs and adds it onto data
	public void append(long[] lo) {
		if (lo != null) {
			newData = getData();
			for (int i = newData.length, x = 0; i < newData.length+lo.length; i++, x++) {
				newData[i] += lo[x];
			}
			for (int i = 0; i < newData.length; i++) {
				data[i] = newData[i];
			}
		}
	}
	
	//takes array of doubles and adds it onto data
	public void append(double[] d) {
		if (d != null) {
			newData = getData();
			for (int i = newData.length, x = 0; i < newData.length+d.length; i++, x++) {
				newData[i] += d[x];
			}
			for (int i = 0; i < newData.length; i++) {
				data[i] = newData[i];
			}
		}
	}
	
	//checks if data is empty
	public boolean isEmpty() {
		if (getData().toString().length() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//checks how many times number occurs in array
	public int occursNumberOfTimes(double value) {
		data = getData();
		int occurrences = 0;
		for (int i = 0; i < getData().length; i++) {
			if (data[i] == value) {
				occurrences++;
			}
		}
		return occurrences;
	}
	
	//finds variance of array
	public double variance() {
		double result = 0, mean = 0;
		int tempValue, total = 0, intMean = 0;
		data = getData();
		
		//finds mean
		for (int i = 0; i < data.length; i++) {
			total += data[i];
			
		}
		mean = total / data.length;
		total = 0;
		
		//finds variance
		for (int i = 0; i < data.length; i++) {
			tempValue = 0;
			tempValue = (int)data[i] - (int)mean;
			tempValue *= tempValue;
			total += tempValue;
		}
		result = total / data.length;
		
		if (isEmpty()) {
			return Double.NaN;
		}
		else {
			return result;
		}
	}
	
	//finds standard deviation
	public double standardDeviation() {
		double standardDeviation = 0;
		if (isEmpty()) {
			return Double.NaN;
		}
		else {
			standardDeviation = Math.sqrt(variance());
			return standardDeviation;
		}
	}
 
}
