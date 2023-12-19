/*
 * Stat.java
 * Author: Chase Pitser
 * Submission Date: 11/05/2021
 *
 * Purpose: This java program is a class that contains the instance 
 * variables, constructors, and methods to create an object with an array of double 
 * values and provide different statistics of the data set when each specific 
 * method is called.
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
	
	//-----------
	// Stat()
	//-----------
	public Stat() {
		data = new double[] {0.0};
	}
	
	//-----------
	// Stat(double[] d)
	//-----------
	public Stat(double[] d) {
		data = new double[d.length];
		for(int i=0; i<d.length; i++) {
			data[i] = d[i];
		}
	}
	
	//-----------
	// getData()
	//-----------
	public double[] getData() {
		double[] d = new double[data.length];
		for(int i=0; i<data.length; i++) {
			d[i] = data[i];
		}
		return d;
	}
	
	//-----------
	// setData()
	//-----------
	public void setData(double[] d) {
		data = new double[d.length];
		for(int i=0; i<d.length; i++) {
			data[i] = d[i];
		}
	}
	
	//-----------
	// equals()
	//-----------
	public boolean equals(Stat s) {
		for(int i=0; i<data.length; i++) {
			if(data[i] != s.getData()[i]) {
				return false;
			}
		}
		return true;
	}
	
	//-----------
	// toString()
	//-----------
	public String toString() {
		String output = "[";
		for(int i=0; i<data.length-1; i++) {
			output += data[i]+", ";
		}
		output += data[data.length-1] + "]";
		return output;
	}
	
	//-----------
	// min()
	//-----------
	public double min() {
		double min = data[0];
		for(int i=1; i<data.length; i++){
			if(data[i]<min){
				min = data[i];
			}
		}
		return min;
	}
	
	//-----------
	// max()
	//-----------
	public double max() { 
		double max = data[0];
		for(int i=1; i<data.length; i++){
			if(data[i]>max){
				max = data[i];
			}
		}
		return max;
	}
	
	//-----------
	// average()
	//-----------
	public double average() {
		double total = 0;
		for(int i=0; i<data.length; i++) {
			total += data[i];
		}
		return total/data.length;
	}
	
	//-----------
	// mode()
	//-----------
	public double mode() {
		int modeIndex = 0;
		int modeCounter = 0;
		int counter;
		boolean modeInSet = true;
		for(int i=0; i<data.length; i++) {
			counter = 0;
			for(int j=0; j<data.length; j++) {
				if(data[j] == data[i]) {
					counter++;
				}
			}
			if(i==0) {
				modeIndex = 0;
				modeCounter = counter;
				modeInSet = true;
			}else if(counter>modeCounter && data[i]!=data[modeIndex]) {
				modeCounter = counter;
				modeIndex = i;
				modeInSet = true;
			}else if(counter == modeCounter && data[i]!=data[modeIndex]) {
				modeInSet = false;
			}
		}
		if(modeInSet) {
			return data[modeIndex];
		}else {
			return Double.NaN;
		}
	}
	
}
