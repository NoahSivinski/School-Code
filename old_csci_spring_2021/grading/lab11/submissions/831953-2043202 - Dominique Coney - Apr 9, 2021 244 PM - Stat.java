/*
 * Stat.java
 * Author:  Dominique Coney
 * Submission Date:  4/9/2021
 *
 * Purpose: The purpose of this code is to use arrays to store different data of the Stat class. The UML diagram is also utilized as somewhat of a skeleton for the structure of the program.
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

	private double data[];
	public Stat() {
		data = new double[1];
		data[0] = 0.0;	
	}
	public Stat(double[] d) {
		double[] newArray = new double[d.length];
		for(int j = 0; j<d.length; j++) {
			newArray[j] = d[j];
		}
		data = newArray;
	}
	public double[] getData() {
		double[] newArray = new double[data.length];
		for(int j = 0; j<data.length; j++) {
			newArray[j] = data[j];
		}
		return newArray;
	}
	public void setData(double[] d) {
		double[] newArray = new double[d.length];
		for(int j = 0; j<d.length; j++) {
			newArray[j] = d[j];
		}
		data = newArray;
	}
	public boolean equals(Stat s) {
		double sData[] = s.getData();
		if(data.length == sData.length)
			return true;
		for(int j = 0; j<data.length; j++) {
			if(data[j] == sData[j])
				return true;
			}
			return false;
		}
	public String toString() {
		String dataElements = "";
		for(int j = 0; j<data.length; j++) {
			if(j == data.length - 1)
				dataElements += data[j];
			else
				dataElements += data[j] + ",";
		}
		return "[" + dataElements + "]";
		}
	public double min() {
		double min = data[0];
		for(int j = 1; j<data.length; j++) {
			if(data[j]<min)
				min = data[j];
		}
		return min;
	}
	public double max() {
		double max = data[0];
		for(int j = 1; j<data.length; j++) {
			if(data[j]>max)
				max = data[j];
		}
		return max;
	}
	public double average() {
		double sum = 0.0;
		for(int j = 0; j<data.length; j++) {
			sum += data[j];
		}
		return (sum/data.length);
	}
	public double mode() {
		double maxNum = 0.0;
		int maxCount = 0;
		for(int j = 0; j<data.length; j++) {
			int numCount = 0;
			for(int i = 0; i<data.length; i++ ) {
				if(data[j] == data[i])
					numCount ++;
			}
			if (numCount > maxCount) {
				maxCount = numCount;
				maxNum = data[j];
			}
		}
		if(maxCount > 1)
			return maxNum;
		else
			return Double.NaN;
	}
		

}
