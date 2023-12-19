/*
 * [Stat].java
 * Author:  [Rachel Chesebro'] 
 * Submission Date:  [11/05/2021]
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

	//create setData() method
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

}
