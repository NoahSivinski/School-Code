/*
 * Stat.java
 * Author:  Evan McKinney 
 * Submission Date:  11/12/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *	This class allows the creation of a Stat object that holds a single array of double values.
 *	Included are many useful functions, like min, max, average, and mode. These functions do exactly what their name says. 
 *	Also included are constructors, toString, equals method, accessor methods, and mutator methods. In addition, it is able
 *	to handle null objects, empty arrays, and other types of integers. Added are variance and standard deviation methods.
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

	//used to compare doubles
	public static final double THRESHOLD = 0.000000001;

	//default constructor, sets data to an empty array
	public Stat() {
		double[] d = new double[0];
		data = d;
	}

	//constructors, make a deep copy of the parameter and stores it in data
	public Stat(double[] d){
		setData(d);
	}

	public Stat(float[] f) {
		setData(f);
	}

	public Stat(int[] i) {
		setData(i);
	}

	public Stat(long[] lo) {
		setData(lo);
	}

	//mutator methods, set data to a reference to a copy of the parameter
	public void setData(float[] f) {
		if(f == null) {
			data = new double[0];
		}else {
			data = new double[f.length];
			for(int i = 0; i < data.length; i++) {
				data[i] = f[i];
			}
		}
	}

	public void setData(double[] d) {
		if(d == null) {
			data = new double[0];
		}else {
			data = new double[d.length];
			for(int i = 0; i < data.length; i++) {
				data[i] = d[i];
			}
		}
	}

	public void setData(int[] i) {
		if(i == null) {
			data = new double[0];
		}else {
			data = new double[i.length];
			for(int j = 0; j < data.length; j++) {
				data[j] = i[j];
			}
		}	
	}

	public void setData(long[] lo) {
		if(lo == null) {
			data = new double[0];
		}else {
			data = new double[lo.length];
			for(int i = 0; i < data.length; i++) {
				data[i] = lo[i];
			}
		}
	}
 
	//accessor method, returns a reference to a copy of data array
	public double[] getData() {
		double[] d = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			d[i] = data[i];
		}
		return d;
	}

	//equals method checks if the values of each array are equal to each other
	public boolean equals(Stat s) {
		if(s == null) {
			return false;
		}else {
			double[] d = s.getData();
			if(data.length != d.length) {
				return false;
			}
			for(int i = 0; i < d.length; i++) {
				if(Math.abs(data[i] - d[i]) > THRESHOLD) {
					return false;
				}
			}
			return true;
		}
	}

	//clears data, sets data to an empty array
	public void reset() {
		data = new double[0];
	}

	//append methods, makes a new array with data values then parameter values
	public void append(int[] i) {
		if(i != null) {
			double[] a = new double[data.length + i.length];
			for(int j = 0; j < data.length; j++) {
				a[j] = data[j];
			}
			for(int j = 0; j < i.length; j++) {
				a[j + data.length] = i[j];
			}
			data = a;
		}
	}

	public void append(float[] f) {
		if(f != null) {
			double[] a = new double[data.length + f.length];
			for(int i = 0; i < data.length; i++) {
				a[i] = data[i];
			}
			for(int i = 0; i < f.length; i++) {
				a[i + data.length] = f[i];
			}
			data = a;
		}
	}

	public void append(long[] lo) {
		if(lo != null) {
			double[] a = new double[data.length + lo.length];
			for(int i = 0; i < data.length; i++) {
				a[i] = data[i];
			}
			for(int i = 0; i < lo.length; i++) {
				a[i + data.length] = lo[i];
			}
			data = a;
		}
	}

	public void append(double[] d) {
		if(d != null) {
			double[] a = new double[data.length + d.length];
			for(int i = 0; i < data.length; i++) {
				a[i] = data[i];
			}
			for(int i = 0; i < d.length; i++) {
				a[i + data.length] = d[i];
			}
			data = a;
		}
	}

	//isEmpty returns true if data length is 0, otherwise it returns false
	public boolean isEmpty() {
		return data.length == 0;
	}

	//toString
	public String toString() {
		String s = "[";
		for(int i = 0; i < data.length - 1; i++) {
			s = s + data[i] + ", ";
		}
		//makes sure there won't be an index out of bounds error
		if(data.length > 0) {
			s = s + data[data.length - 1];
		}
		s = s + "]";
		return s;
	}

	//returns the minimum of the data array
	public double min() {
		if(data.length == 0) {
			return Double.NaN;
		}
		double min = data[0];
		for(int i = 1; i < data.length; i++) {
			if(data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}

	//return the max of the data array
	public double max() {
		if(data.length == 0) {
			return Double.NaN;
		}
		double max = data[0];
		for(int i = 1; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	//returns the mean value of all the values in the data array
	public double average() {
		if(data.length == 0) {
			return Double.NaN;
		}
		double sum = 0.0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / data.length;
	}

	//returns the value that appears most often in the data array. If no such value exists, Double.NaN is returned
	public double mode() {
		int frequency = 0;
		int maxFreq = 0;
		int maxFreqIndex = 0;
		int count = 1;
		for(int i = 0; i < data.length; i++) {
			double d = data[i];
			//finds frequency of d
			frequency = occursNumberOfTimes(d);
			//if the number of times d appears is more than the current maximum frequency, 
			//then the frequency becomes the new max frequency, and the index of the value in the data array
			//is kept. Also, the counter is reset.
			if(frequency > maxFreq) {
				maxFreq = frequency;
				maxFreqIndex = i;
				count = 1;
			}else if(frequency == maxFreq) {
				//increments count to measure how many times the maxFreq appears
				count++;
			}
		}
		//if count == maxFreq, then we know that value that appeared maxFreq times is the mode
		//for example, if an array is {1,1,8}, then the maxFreq is 2 and it appeared 2 times, for each value of 1, so it's the mode
		//but if the array is {1,1,8,8}, then the maxFreq is 2 and it appeared 4 times b/c each value has a frequency of 2, 
		//which means there is no mode
		if(count == maxFreq) {
			return data[maxFreqIndex];
		}else {
			return Double.NaN;
		}
	}

	private int occursNumberOfTimes(double value) {
		int frequency = 0;
		for(int i = 0; i < data.length; i++) {
			if(Math.abs(value - data[i]) < THRESHOLD) {
				frequency++;
			}
		}
		return frequency;
	}

	//variance returns the variance of the data, where variance is the sum of the difference of each value from the mean squared.
	//Returns NaN when data is empty
	public double variance() {
		if(data.length == 0) {
			return Double.NaN;
		}

		double average = average();
		double varianceSum = 0;
		for(int i = 0; i < data.length; i++) {
			varianceSum += Math.pow(average - data[i], 2);
		}
		return varianceSum / data.length;
	}

	//standardDeviation returns the square root of the variance when data isn't empty. Returns NaN when data is empty
	public double standardDeviation() {
		return Math.sqrt(variance());
	}
}
