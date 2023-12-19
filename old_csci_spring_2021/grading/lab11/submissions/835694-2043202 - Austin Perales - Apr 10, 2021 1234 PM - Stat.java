/*
 * [Stat.java]
 * Author:  [Austin Perales] 
 * Submission Date:  [4/10/2021]
 *
 * This program does the following: 
 * [Stat.java] is a class that uses a double[] array, data and creates a constructor, getter, setter, and multiple other
 * methods that manipulate and return data requested by the user. The class contains: getData (creates a new array mirroring
 * data), setData (creates an array exactly like data and assigns a reference to data), equals (compares the Stat object to
 * the passed object), toString (creates a String from the values in the array), min (returns the min value in the array),
 * max (returns the max value in the array), average (returns the average of the numbers in the array), and mode (returns the
 * number that has the most instances in the array, or Double.NaN if this is not true). 
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
	
	//private instance array data
	private double[] data;
	
	//default constructor
	public Stat() {
		data = new double[] {0.0};
	}
	
	// creates a double array the same length as d with a copy of the values of d
	public Stat(double d[]) {
		double[] dd = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dd[i] = d[i];
		}
		this.data = dd;
	}
	
	//creates a new array containing exactly the values contained in data
	public double[] getData() {
		double[] d = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			d[i] = data[i];
		}
		return d;
	}

	//creates a new array containing the exact elements of d and assigns to data a reference to this new array
	public void setData(double d[]) {
		double[] dd = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dd[i] = d[i];
		}
		this.data = dd;
	}
	
	//returns true if the data objects of the Stat object and the passed object are the same, otherwise, it returns false
	public boolean equals(Stat s) {
		boolean result = true;
		if (s.data.length == this.data.length) {
			for (int i = 0; i < s.data.length; i++) {
				if (s.data[i] != this.data[i]) {
					return false;
				}
			}
		}
		else {
			return false;
		}
		
		return result;
	}
	
	//returns a String concatenation of the elements stored in the array (first starts with [ and then adds the next number
	//plus a ", " up until it reaches the last number, then it finishes with a ])
	public String toString() {
		String result = "[";
		for (int i = 0; i < this.data.length; i++) {
			if (i == this.data.length - 1 ) {
				result = result + this.data[i];
			}
			else {
				result = result + this.data[i] + ", ";
			}
		}
		result = result + "]";
		
		return result;	
	}
	
	//returns the min of the array (sets min to first number and then compares through the whole array)
	public double min() {
		double min = this.data[0];
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}
	
	//returns the max of the array (sets max to first number and then compares through the whole array)
	public double max() {
		double max = this.data[0];
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}
	
	//returns the average of the array
	public double average() {
		double sum = 0;
		for (int i = 0; i < this.data.length; i++) {
			sum = sum + this.data[i];
		}
		//sum divided by number of units in array give the average
		return sum / this.data.length;
	}
	
	//returns the number that occurs the most in the array (if not applicable, returns Double.NaN)
	public double mode() {
		
		//checks to see if the array is a length of 1, therefore there is only one mode, and it returns that value
		if (this.data.length == 1) {
			return data[0];
		}
		
		//initializing a new array d of length data and setting it equal to data
		double[] d = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			d[i] = data[i];
		}
		
		//initializing the variable temp as a temporary variable, frequency as an array to keep track of the number of times a
		//mode occurs, and visited as a placeholder for frequency.
		double temp;
		double[] frequency = new double[data.length];
		int visited = -1;
		
		//this double for loop goes through the array d and checks to see if a value is equal to another, and sets up
		//frequency values based off of how many times a number occurs
		for (int i = 0; i < d.length; i++) {
			int numCount = 1;
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] == d[j]) {
					numCount++;
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited) {
				frequency[i] = numCount;
			}
		}
		
		//this double loops sorts the array frequency in decreasing order and uses temp to set temporary values and assigns
		// the highest value first and then the lowest value last
		for (int i = 0; i < frequency.length; i++) {
			for (int j = i + 1; j < frequency.length; j++) {
				if (frequency[i] < frequency[j]) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
					
					temp = frequency[i];
					frequency[i] = frequency[j];
					frequency[j] = temp;
				}
			}
		}
		
		//if the two values in frequency are the same, it returns Double.NaN, else it returns the first value or the mode
		if (frequency[0] == frequency[1]) {
			return Double.NaN;
		}
		else {
			return d[0];
		}
	}
}