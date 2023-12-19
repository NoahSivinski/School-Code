/*
 * Stat.java
 * Author:  Alice Szymkiewicz 
 * Submission Date:  04/10/2021
 *
 * Purpose:
 * 
 * This Stat class is created based on the UML provided and
 * stores the data array. There are two constructors created.
 * The first is the default constructor that will have the
 * single element 0.0. The second constructor creates a double 
 * array d. This constructor creates a constructorCopy so the 
 * private data variable is not modified. The method getData is the
 * accessor method that gets the values of the data array and returns
 * such values. The mutator method, or setData creates a new
 * array that assigns data a reference to the new array. The 
 * rest of the methods return values based on testing the array
 * such as min and max that return the minimum and maximum value 
 * of the data array. These values are printed out in a driver class
 * that print out the return values in a main method.
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
	public static final double THRESHOLD = 0.000000001;

	public Stat() {
		double[] start = new double[1];
		start[0] = 0.0;
		data = start;
	}

	public Stat(double[] d) {
		double[] constructorCopy = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			constructorCopy[i] = d[i];
		}
		data = constructorCopy;
	}

	public double[] getData() {
		double[] getCopy = new double[data.length];
		for (int f = 0; f < data.length; f++) {
			getCopy[f] = data[f];
		}
		return getCopy;
	}

	public void setData(double[] d) {
		double[] setCopy = new double[d.length];
		for (int k = 0; k < d.length; k++) {
			setCopy[k] = d[k];
		}
		data = setCopy;
	}

	public boolean equals(Stat s) {
		if ((s.getData().length) == data.length) {
			for (int j = 0; j < data.length; j++) {
				if (!(Math.abs((s.getData()[j]) - data[j]) < THRESHOLD)) {
					return false;
				}
			}
			return true;
		} 
		else {
			return false;
		}
	}

	public String toString() {
		String printStatement = "[";
		for (int a = 0; a < data.length; a++) {
			printStatement += data[a];
			if (!(a == (data.length - 1))) {
				printStatement += ", ";
			} 
			else {
				printStatement += "]";
			}
		}
		return printStatement;
	}

	public double min() {
		double min = data[0];
		for (int b = 1; b < data.length; b++) {
			if (data[b] < min) {
				min = data[b];
			}
		}
		return min;
	}

	public double max() {
		double max = data[0];
		for (int c = 1; c < data.length; c++) {
			if (data[c] > max) {
				max = data[c];
			}
		}
		return max;
	}

	public double average() {
		double sum = 0;
		for (int h = 0; h < data.length; h++) {
			sum += data[h];
		}
		return (sum / data.length);
	}

	public double mode() {
		double maxNum = 0;
		int maxCount = 0;
		for (int x = 0; x < data.length; x++) {
			int count = 0;
			for (int z = 0; z < data.length; z++) {
				if (data[z] == data[x])
					count++;
			}

			if (count > maxCount) {
				maxCount = count;
				maxNum = data[x];
			}
		}
		if (maxCount > 0) {
			return maxNum;
		} 
		else {
			return Double.NaN;
		}
	}
	
}