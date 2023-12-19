/*
 * Stat.java
 * Author:  Morgan McGrath 
 * Submission Date:  11/5/2021
 *
 * Purpose: This program computes min, max, mode, and average
 * of a data set of doubles. 
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
	
	//instance variables
	private double[] data;
	
	//default constructor for Stat
	public Stat() {
		double [] d= {0.0};
		data=d;
	}
	//Constructs a Stat object using the values held in d
	public Stat(double[] d) {
		double [] d2=new double[d.length];
		for(int i=0; i<d.length; i++) {
			d2[i]=d[i];
		}
		data=d2;
	}
	//Accessor method used to retrieve the values of data
	public double[] getData() {
		double [] d=new double[data.length];
		for(int i=0; i<data.length; i++) {
			d[i]=data[i];
		}
		return d;
	}
	//Mutator method used to set the values of the data array
	public void setData(double[] d) {
		double [] d2=new double[d.length];
		for(int i=0; i<d.length; i++) {
			d2[i]=d[i];
		}
		data=d2;
	}
	//Returns the boolean value true if the data objects of both the calling
	//Stat object and the passed Stat object s have the same values (and in the same order). Otherwise, it
	//returns false. 
	public boolean equals(Stat s) {
		boolean isEqual=true;
		if(this.data.length!=s.data.length) {
			isEqual=false;
		}
		else {
			for(int i=0; i<this.data.length; i++) {
				if(this.data[i]!=s.data[i]) {
					isEqual=false;
				}
			}
		}
		return isEqual;
	}
	//Returns a String representation of the data elements stored in the Stat object
	public String toString() {
		String dataString="[";
		for(int i=0; i<data.length-1;i++) {
			dataString+=data[i]+", ";
		}
		dataString+=data[data.length-1]+"]";
		return dataString;
	}
	//Returns the minimum of the data array
	public double min() {
		double min=data[0];
		for(int i=0; i<data.length; i++) {
			if(data[i]<min) {
				min=data[i];
			}
		}
		return min;
	}
	//Returns the maximum of the data array
	public double max() {
		double max=data[0];
		for(int i=0; i<data.length; i++) {
			if(data[i]>max) {
				max=data[i];
			}
		}
		return max;
	}
	//Returns the average of the data array. The average is defined to be a double value
	//that returns the mean value of a given array of numbers
	public double average() {
		double sum=0;
		for(int i=0; i<data.length; i++) {
			sum+=data[i];
		}
		double average=sum/data.length;
		return average;
	}
	//If one value occurs more frequently in data than all others, then mode() should
	//return this value. Otherwise, mode() should return Double.NaN, indicating that no unique
	//value exists.
	public double mode() {
		double count=0, maxCount=0, mode=0;
		boolean multipleMode=false;
		for(int i=0; i<data.length; i++) {
			count=0;
			for(int j=0; j<data.length; j++) {
				if(data[j]==data[i]) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				mode=data[i];
				multipleMode=false;
			} 
			else if(mode!=data[i] && count==maxCount) {
				multipleMode=true;
			}
		}
		if(multipleMode) {
			return Double.NaN;
		}
		else {
			return mode;
		}
	}
	

}
