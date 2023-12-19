/*
 * Stat.java
 * Author:  Cole Lanham
 * Submission Date:  4/16/21
 *
 * Purpose: This program is an extension of our previous lab 
 * centered around creating and manipulating array objects. In 
 * comparison, this lab was primarily centered around overloading
 * methods with data types.Through this lab we were able to understand
 * how to overload methods and also how to condense code by calling
 * methods within other methods.
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
	//Fields:
	private double[] data;

	
	//Default Constructor
	public Stat() { 
		this.data = new double[0];
	}
	
	
	//Overloading Methods
	public Stat(double[] d) {
		makeDoubleCopy(d);
	}
	
	public Stat(float[] f) {
		makeFloatCopy(f);
	}
	
	public Stat(int[] i) {
		makeIntCopy(i);
	}
	
	public Stat(long[] lo) {
		makeLongCopy(lo);
	}
	
	
	//Overloading Setters
	public void setData(float[] f) {
		makeFloatCopy(f);
	}
	
	public void setData(double[] d) {
		makeDoubleCopy(d);
	}
	
	public void setData(int[] i) {
		makeIntCopy(i);
	}
	
	public void setData(long[] lo) {
		makeLongCopy(lo);
	}

	
	//Getter for Data
	public double[] getData() {
		double [] dCopy = new double[data.length];
			for (int i = 0; i < data.length; i++) {
				dCopy[i] = data[i];
			}
		return dCopy;

	}
	
	
	//Take compares two Stat objects and returns a boolean value if their values are equals (utilizes a threshold comparison) 
	public boolean equals(Stat s) { 
		double THRESHOLD = 0.00001;
		boolean equalsIsTrue = false;
		if ((this.data == null) || (s == null)) {
			return equalsIsTrue;
		}
		else {
		if (this.data.length == s.data.length) {
			for (int i = 0; i < data.length; i++) {
				if (Math.abs(this.data[i] - s.data[i]) < THRESHOLD)//Need to use a Threshold comparison since we're working with doubles
					equalsIsTrue = true;
			}
		}
		return equalsIsTrue;
		}
	}

	
	//Method to help with outputting our array
	public String toString() {
		if (this.data.length == 0) {
			return "[]";
		}
		else {
			String toReturn = "[";
			for (int i = 0; i < data.length - 1; i++) {
				toReturn += data[i] + ", ";
			}
			toReturn += data[data.length - 1] + "]";
			return toReturn; 
		}
	}
	
	
	//Reset Method
	public void reset() { 
		this.data = new double[0];
	}
	
	//Append Methods (Overloaded)
	public void append(double[] d) {
		if (d != null) {
			double[] newData = new double[this.data.length + d.length];
			for (int n = 0; n < (this.data.length); n++) {
				newData[n] = data[n];
			}
			for (int m = data.length, o = 0; m < newData.length; m++, o++) {
				newData[m] = d[o];
			}
			this.data = newData;
		}
	}
		
	public void append(int[] i) {
		if (i != null) {
			double[] newData = new double[this.data.length + i.length];
			for (int n = 0; n < (this.data.length); n++) {
				newData[n] = data[n];
			}
			for (int m = data.length, o = 0; m < newData.length; m++, o++) {
				newData[m] = i[o];
			}
			this.data = newData;
		}
	}
	
	public void append(long[] lo) {
		if (lo != null) {
			double[] newData = new double[this.data.length + lo.length];
			for (int n = 0; n < (this.data.length); n++) {
				newData[n] = data[n];
			}
			for (int m = data.length, o = 0; m < newData.length; m++, o++) {
				newData[m] = lo[o];
			}
			this.data = newData;
		}
	}
	
	public void append(float[] f) {
		if (f != null) {
			double[] newData = new double[this.data.length + f.length];
			for (int n = 0; n < (this.data.length); n++) {
				newData[n] = data[n];
			}
			for (int m = data.length, o = 0; m < newData.length; m++, o++) {
				newData[m] = f[o];
			}
			this.data = newData;
		}
	}
	

	
	public boolean isEmpty() {
		return this.data.length == 0;
	}
	
	
	//Method for finding min value in an array
	public double min() { 
		if (this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double minnimum = data[0];
			for (int i = 1; i < data.length; i++) {
				if (data[i] < minnimum) {
					minnimum = data[i];
				}
			}
			return minnimum;
		}
	}
	
	//Method for finding max value in an array
	public double max() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double maximum = data[0];
			for (int i = 1; i < data.length; i++) {
				if (data[i] > maximum) {
					maximum = data[i];
				}
			}
			return maximum;
		}
	}
	
	//Method for finding average in array
	public double average() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double average = 0;
			for (int i = 0; i < data.length; i++) {
				average += data[i];
			}
			average = average / data.length;
			return average;
		}
	}
	
	//Method for mode calculation and logic.
	public double mode() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double THRESHOLD = 0.00001;
			double mode = 0; //Actual value for the mode 
			int minModeCount = 0;

			for (int i = 0; i < data.length; i++) {
				int equalValues = 0; //Always one since there will always be one set of equalities.
				for (int n = 0; n < data.length; n++) {
					if (Math.abs(data[i] - data[n]) < THRESHOLD) //Equals comparison 
						++equalValues;
				}

				if ((equalValues == minModeCount) && (!(Math.abs(mode - data[i])< THRESHOLD))) {
					mode = Double.NaN;
				}

				else if (equalValues > minModeCount) {
					mode = data[i];
					minModeCount = equalValues;
				}

			}
			return mode;
		}
	}

	//Method which keeps track of matching values
	private int occursNumberOfTimes(double value) {
		int count = 0;
		double THRESHOLD = 0.00001;
		for (int i = 0; i < data.length; i++) {
			if (Math.abs(this.data[i] - value) < THRESHOLD) {
				count++;
			}
		}
		return count;
	}
	
	//Method which calculates and returns variance 
	public double variance() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double average = 0;
			double sumForVariance = 0;
			double variance = 0;

			for (int i = 0; i < data.length; i++) {
				average += data[i];
			}
			average = average / data.length;

			for (int i = 0; i < this.data.length; i++) {
				sumForVariance += (Math.pow((this.data[i] - average), 2));
			}
			variance = sumForVariance/data.length;
			return variance;
		}
	}
	
	//Method which calculates and returns standard deviation
	public double standardDeviation() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double average = 0;
			double sumForVariance = 0;
			double variance = 0;

			for (int i = 0; i < data.length; i++) {
				average += data[i];
			}
			average = average / data.length;

			for (int i = 0; i < this.data.length; i++) {
				sumForVariance += (Math.pow((this.data[i] - average), 2));
			}
			variance = sumForVariance/data.length;
			return Math.sqrt(variance);
		}
	}
	
	
	//--------Extra Methods----------
	//These are used in constructors and setters!
	private void makeFloatCopy(float[] inputArray) {
		if (inputArray == null) {
			this.data = new double[0];
		}
		else {
			double[] fCopy = new double[inputArray.length];
			for (int i = 0; i < inputArray.length; i++) { 
				fCopy[i] = inputArray[i];
			}
			this.data = fCopy;
		}
	}
	
	private void makeIntCopy(int[] inputArray) {
		if (inputArray == null) {
			this.data = new double[0];
		}
		else {
		double[] iCopy = new double[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) { 
			iCopy[i] = inputArray[i];
		}
		this.data = iCopy;
		}
	}
	
	private void makeLongCopy(long[] inputArray) {
		if (inputArray == null) {
			this.data = new double[0];
		}
		else {
			double[] lCopy = new double[inputArray.length];
			for (int i = 0; i < inputArray.length; i++) { //How can I make this into a method of it's own???
				lCopy[i] = inputArray[i];
			}
			this.data = lCopy;
		}
	}
	
	private void makeDoubleCopy(double[] inputArray) {
		if (inputArray == null) {
			this.data = new double[0];
		}
		else {
			double[] dCopy = new double[inputArray.length];
			for (int i = 0; i < inputArray.length; i++) { //How can I make this into a method of it's own???
				dCopy[i] = inputArray[i];
			}
			this.data = dCopy;
		}
	}
	

	
	
	
	
	
}
