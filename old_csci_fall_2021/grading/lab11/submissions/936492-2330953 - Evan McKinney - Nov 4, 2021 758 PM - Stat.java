/*
 * Stat.java
 * Author:  Evan McKinney 
 * Submission Date:  11/4/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *	This class allows the creation of a Stat object that holds a single array of double values.
 *	Included are many useful functions, like min, max, average, and mode. These functions do exactly what their name says. 
 *	Also included are constructors, toString, equals method, accessor methods, and mutator methods.
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

	//default constructor, sets data to a single element equal to 0.0
	public Stat() {
		double[] d = {0.0};
		data = d;
	}

	//constructor, makes a deep copy of the parameter and stores it in data
	public Stat(double[] d){
		data = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			data[i] = d[i];
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

	//mutator method, sets data to a reference to a copy of the parameter
	public void setData(double[] d) {
		data = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}

	//equals method checks if the values of each array are equal to each other
	public boolean equals(Stat s) {
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
			//this loop goes through the array and each time d appears, increments frequency
			//basically finds the frequency of d
			for(int j = 0; j < data.length; j++) {
				if(Math.abs(d - data[j]) < THRESHOLD) {
					frequency++;
				}
			}
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
			//frequency is reset to 0 because the loop moves on to a new value in the data array
			frequency = 0;
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
}
