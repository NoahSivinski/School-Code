/*
 * Stat.java
 * Author:  Tenacity Murdie 
 * Submission Date:  11-11-2021
 *
 * Purpose: This class stores an array of data, and contains methods that
 * can compute the min, max, mode, average, variance, and standard deviation of these values.
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
	
	/*
	 * Default constructor for Stat that has a length of 0
	 */
	public Stat() {
		data = new double[0];
	}
	
	/*
	 * Constructs a Stat object using the values in d
	 * If the parameter is null, then an empty array is assigned
	 * to data
	 */
	public Stat(double[] d) {
		this.setData(d);
	}
	
	/*
	 * Constructs a Stat object using the values in i
	 * If the parameter is null, then an empty array is assigned
	 * to data
	 */
	public Stat(int[] i) {
		this.setData(i);
	}
	
	/*
	 * Constructs a Stat object using the values in lo
	 * If the parameter is null, then an empty array is assigned
	 * to data
	 */
	public Stat(long[] lo) {
		this.setData(lo);
	}
	
	/*
	 * Constructs a Stat object using the values in f
	 * If the parameter is null, then an empty array is assigned
	 * to data
	 */
	public Stat(float[] f) {
		this.setData(f);
	}
	
	/*
	 * Retrieves the values of data
	 */
	public double[] getData() {
		double[] newArray = new double[data.length];
		for(int i = 0; i<data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}
	
	/*
	 * Sets the values of the data array
	 */
	public void setData(float[] f) {
		if (f == null) {
			data = new double[0];
		}
		else {
			double[] newArray = new double[f.length];
			for(int i = 0; i<f.length; i++) {
				newArray[i] = (double)f[i];
			}
			data = newArray;
		}
	}
	
	/*
	 * Sets the values of the data array
	 */
	public void setData(double[] d) {
		if (d == null) {
			data = new double[0];
		}
		else {
			double[] newArray = new double[d.length];
			for(int i = 0; i<d.length; i++) {
				newArray[i] = d[i];
			}
			data = newArray;
		}
	}
	
	/*
	 * Sets the values of the data array
	 */
	public void setData(int[] i) {
		if (i == null) {
			data = new double[0];
		}
		else {
			double[] newArray = new double[i.length];
			for(int j = 0; j<i.length; j++) {
				newArray[j] = (double)i[j];
			}
			data = newArray;
		}
	}
	
	/*
	 * Sets the values of the data array
	 */
	public void setData(long[] lo) {
		if (lo == null) {
			data = new double[0];
		}
		else {
			double[] newArray = new double[lo.length];
			for(int i = 0; i<lo.length; i++) {
				newArray[i] = (double)lo[i];
			}
			data = newArray;
		}
	}

	
	/*
	 * Returns false if s is null.
	 * Returns true if the data objects of both the calling object
	 * and the passed Stat object s have the same values in the 
	 * same order. Otherwise, returns false
	 */
	public boolean equals(Stat s) {
		boolean equals;
		if (s == null) {
			equals = false;
		}
		else {
			equals = true;
			double[] sArray = s.getData();
			for(int i = 0; i < data.length; i++) {
				if (data.length != sArray.length) {
					equals = false;
				}
				else if (data[i] != sArray[i]) {
					equals = false;
				}
			}
		}
		return equals;
	}
	
	public void reset() {
		data = new double[0];
	}
	
	/*
	 * Returns a string representation of the data elements stored
	 * in the Stat object
	 */
	public String toString() {
		String dataRepresentation;
		if (data.length == 0) {
			dataRepresentation = "[]";
		}
		else {
			dataRepresentation = "[";
			for (int i = 0; i<data.length-1; i++) {
				dataRepresentation += (data[i] + ", ");
			}
			dataRepresentation += (data[data.length -1] + "]");
		}
		return dataRepresentation;
	}
	
	/*
	 * Creates a new double array containing exactly those elements of data
	 * followed by those of the array passed as parameter
	 * If the parameter is null, then the method does nothing
	 */
	public void append(double[] d) {
		if(d != null) {
			double[] newArray = new double[(d.length + data.length)];
			for(int i = 0; i <data.length; i++) {
				newArray[i] = data[i];
			}
			for(int i = 0, j = data.length; i<(d.length) && j<(data.length + d.length); i++, j++) {
				newArray[j] = d[i];
			}
			data = newArray;
		}
	}
	
	/*
	 * Creates a new double array containing exactly those elements of data
	 * followed by those of the array passed as parameter
	 * If the parameter is null, then the method does nothing
	 */
	public void append(int[] i) {
		if(i != null) {
			double[] newArray = new double[(i.length + data.length)];
			for(int index = 0; index <data.length; index++) {
				newArray[index] = data[index];
			}
			for(int index = 0, j = data.length; index<(i.length) && j<(data.length + i.length); index++, j++) {
				newArray[j] = (double)i[index];
			}
			data = newArray;
		}
	}
	
	/*
	 * Creates a new double array containing exactly those elements of data
	 * followed by those of the array passed as parameter
	 * If the parameter is null, then the method does nothing
	 */
	public void append(long[] lo) {
		if(lo != null) {
			double[] newArray = new double[(lo.length + data.length)];
			for(int i = 0; i <data.length; i++) {
				newArray[i] = data[i];
			}
			for(int i = 0, j = data.length; i<(lo.length) && j<(data.length + lo.length); i++, j++) {
				newArray[j] = (double)lo[i];
			}
			data = newArray;
		}
	}
	
	/*
	 * Creates a new double array containing exactly those elements of data
	 * followed by those of the array passed as parameter
	 * If the parameter is null, then the method does nothing
	 */
	public void append(float[] f) {
		if(f != null) {
			double[] newArray = new double[(f.length + data.length)];
			for(int i = 0; i <data.length; i++) {
				newArray[i] = data[i];
			}
			for(int i = 0, j = data.length; i<(f.length) && j<(data.length + f.length); i++, j++) {
				newArray[j] = (double)f[i];
			}
			data = newArray;
		}
	}
	
	/*
	 * Returns true if the data object is empty
	 * Otherwise, returns false
	 */
	public boolean isEmpty() {
		boolean isEmpty;
		if (data.length == 0) {
			isEmpty = true;
		}
		else {
			isEmpty = false;
		}
		return isEmpty;
	}
	
	/*
	 * Returns the minimum of the data array
	 */
	public double min() {
		double min;
		if (this.isEmpty() == true) {
			min = Double.NaN;
		}
		else {
			min = data[0];
			for (int i = 0; i<data.length; i++) {
				if(data[i] < min) {
					min = data[i];
				}
			}
		}
		return min;
	}
	
	/*
	 * Returns the maximum of the data array
	 */
	public double max() {
		double max;
		if (this.isEmpty() == true) {
			max = Double.NaN;
		}
		else {
			max = data[0];
			for (int i = 0; i<data.length; i++) {
				if(data[i] > max) {
					max = data[i];
				}
			}
		}
		return max;
		
	}
	
	/*
	 * Returns the average of the data array.
	 */
	public double average() {
		double sum;
		double answer;
		if (this.isEmpty() == true) {
			answer = Double.NaN;
		}
		else {
			sum = 0;
			for (int i = 0; i <data.length; i++) {
				sum += data[i];
			}
			answer = sum/data.length;
		}
		return (answer);
	}
	
	/*
	 * Returns the value that occurs most frequently in the data array
	 * If no such value exists, returns Double.NaN
	 */
	public double mode() {
		double mode = 0;
		int maxCount = 0;
		boolean modeExists = false;
		if (this.isEmpty() == true) {
			mode = Double.NaN;
		}
		else if(data.length == 1) {
			mode = data[0];
		}
		else {
			for (int i = 0; i < data.length; i++) {
				int count1 = this.occursNumberOfTimes(data[i]);
				if (count1 > maxCount) {
					maxCount = count1;
					mode = data[i];
					modeExists = true;
				}
				else if (count1 == maxCount && !(Math.abs(data[i] - mode) <0.000000001)) {
					modeExists = false;
				}
			}
			if (modeExists == false) {
				mode = Double.NaN;
			}
		}
		return mode;
	}
	
	/*
	 * Returns the number of times the value occurs in the data array
	 */
	private int occursNumberOfTimes(double value) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if(Math.abs(value - data[i]) <0.000000001) {
				count++;
			}
		}
		return count;
	}
		
	
	/*
	 * Returns the variance of the data in the data array
	 */
	public double variance() {
		double sum = 0;
		double distance;
		double square;
		double answer;
		if (this.isEmpty() == true) {
			answer = Double.NaN;
		}
		else {
			for (int i = 0; i<data.length; i++) {
				distance = Math.abs(data[i] - this.average());
				square = Math.pow(distance, 2);
				sum += square;
			}
			answer = sum/data.length;
		}
		return answer;
	}
	
	/*
	 * Returns the square root of the variance
	 */
	public double standardDeviation() {
		double answer;
		if (this.isEmpty() == true){
			answer = Double.NaN;
		}
		else {
			answer = Math.sqrt(this.variance());
		}
		return answer;
	}
	
}

