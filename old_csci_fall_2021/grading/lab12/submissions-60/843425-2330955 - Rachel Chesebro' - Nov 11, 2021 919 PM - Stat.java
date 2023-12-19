/*
 * [Stat].java
 * Author:  [Rachel Chesebro'] 
 * Submission Date:  [11/12/2021]
 *
 * Purpose: The purpose of this program is to store methods, such as min, max, and average
 * that will be tested in the StatMethodCheck class. The UML diagram and method descriptions
 * such as toString() and mode() will be used to create this class.
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

	//declare private double data
	private double data[];
		
	//create Stat() method
	public Stat() {
		data = new double[1];
	}
	
	//create Stat(double[] d) method
	public Stat(double[] d) {
		setData(d);
	}
	
	//create Stat(float[] f) method
	public Stat(float[] f) {
		setData(f);
	}
	
	//create Stat(int[] i) method
	public Stat(int[] i) {
		setData(i);
	}
	
	//create Stat(long[] lo) method
	public Stat(long[] lo) {
		setData(lo);
	}
	
	//create setData(double) method
	public void setData(double[] d) {
		double[] newArray = new double[0];
		if(d != null) {
			newArray = new double[d.length];
			for(int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}
		}
		data = newArray;
	}
	
	//create setData(float) method
	public void setData(float[] f) {
		double[] newArray = new double[0];
		if(f != null) {
			newArray = new double[f.length];
			for(int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
		}
		data = newArray;
	}
	
	//create setData(int) method
	public void setData(int[] i) {
		double[] newArray = new double[0];
		if(i != null) {
			newArray = new double[i.length];
			for(int j = 0; j < i.length; j++) {
				newArray[j] = i[j];
			}
		}
		data = newArray;
	}
	
	//create setData(long) method
	public void setData(long[] lo) {
		double[] newArray = new double[0];
		if(lo != null) {
			newArray = new double[lo.length];
			for(int i = 0; i < lo.length; i++) {
				newArray[i] = lo[i];
			}
		}
		data = newArray;
	}
	
	//create getData() method
	public double [] getData() {
		double[] newArray = new double[0];
		if(data != null) {
			newArray = new double[data.length];
			for(int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
			}
		}
		return newArray;
	}
	
	//create equals() method to see if arrays are the same
	public boolean equals(Stat s) {
		if (data.length == s.getData().length) {
			for (int i = 0; i < data.length; i++) {
				if (data[i] == s.getData()[i]) {
					
				}
				else {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	//create reset method to clear the data array
	public void reset() {
		data = new double[0];
	}
	
	//create append method that creates a new double array containing exactly
	//those elements of data followed by those of the array passed as parameter
	public void append(int[] i) {
		if (i != null) {
			double[] newArray = new double[data.length + i.length];
			for (int j = 0; j < newArray.length; j++) {
				if (j < data.length) {
					newArray[j] = data[j];
				}
				else {
					newArray[j] = i[j - data.length];
				}
			}
			data = newArray;
		}
	}
	
	public void append(float[] f) {
		if (f != null) {
			double[] newArray = new double[data.length + f.length];
			for (int i = 0; i < newArray.length; i++) {
				if (i < data.length) {
					newArray[i] = data[i];
				}
				else {
					newArray[i] = f[i - data.length];
				}
			}
			data = newArray;
		}
	}
	
	public void append(long[] lo) {
		if (lo != null) {
			double[] newArray = new double[data.length + lo.length];
			for (int i = 0; i < newArray.length; i++) {
				if (i < data.length) {
					newArray[i] = data[i];
				}
				else {
					newArray[i] = lo[i - data.length];
				}
			}
			data = newArray;
		}
	}
	
	public void append(double[] d) {
		if (d != null) {
			double[] newArray = new double[data.length + d.length];
			for (int i = 0; i < newArray.length; i++) {
				if (i < data.length) {
					newArray[i] = data[i];
				}
				else {
					newArray[i] = d[i - data.length];
				}
			}
			data = newArray;
		}
	}
	
	//create isEmpty method to return boolean value of true if the data object is empty (length=0)
	public boolean isEmpty() {
		boolean empty;
		if (data.length == 0) {
			empty = true;
		}
		else {
			empty = false;
		}
		return empty;
	}
	
	//create toString() method to convert array to string
	public String toString() {
		String s = "[";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1) {
				s += data[i] + "]";
			}
			else {
				s += data[i] + ", ";
			}
		}
		return s;
	}
	
	//find minimum value in array
	public double min() {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] <  min) {
				min = data[i];
			}
		}
		return min;
	}
	
	//find maximum value in array
	public double max() {
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
	
	//find average value in array
	public double average() {
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		double average = total / data.length;
		return average;
	}
	
	//find mode of array, return NaN if no mode
	public double mode() {
		double mode = 0;
		boolean noMode = false;
		double modeIndex = 0;
		for (int i = 1; i < data.length; i++) {
			double count = 0;
			for (int j = 0; j < data.length; j++) {
				if (data[j] == data[i]) {
					count ++;
				}	
			}
			if (count == mode && modeIndex != data[i]) {
				noMode = true;
			}
			if (count > mode) {
				noMode = false;
				mode = count;
				modeIndex = data[i];
			}
		}
		if (noMode == true) {
			return Double.NaN;
		}
		return modeIndex;
	}
	
	//create occursNumberOfTimes method to return the number of times the value occurs in the data array
	private int occursNumberOfTimes(double d) {
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == d) {
				counter++;
			}
		}
		return counter;
	}

	//create variance method to return the variance of the array
	public double variance() {
		if (!isEmpty()) {
			double distance = 0;
			for (int i = 0; i < data.length; i++) {
				distance += Math.pow(data[i] - average(), 2);
			}
			return distance / data.length;
		}
		else {
			return Double.NaN;
		}
	}
	
	//create standardDeviation method to return the square root of the variance
	public double standardDeviation() {
		return Math.sqrt(variance());
	}
	
}
