/*
 * Stat.java
 * Author:  Delaney Ott 
 * Submission Date:  April 9th, 2021
 *
 * Purpose: This program is designed to tell the user the minimum, maximum,
 * average, and mode of the given array.
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
	
	public Stat() {
		this.data = new double[1];

	}
	
	public Stat(double[] d) {
		setData(d);
	}
	public double[] getData() {
		double[] dataCopy = new double[this.data.length];
		for(int i = 0; i < this.data.length; i++) {
			dataCopy[i] = this.data[i];
		}
		return dataCopy;
	}
	public void setData(double[] d) {
		if(d!=null) {
			double[] dataCopy2 = new double[d.length];
			for(int i = 0; i < d.length; i++) {
				dataCopy2[i] = d[i];
			}
			this.data = dataCopy2;
		} else {
			this.data = new double[0];
		}
	}
	public boolean equals(Stat s) {
		if(s == null) {
			return false;
		}
		double[] anotherArray = s.getData();
		if(this.data.length == anotherArray.length) {
			for(int i = 0; i < this.data.length; i++) {
				if(this.data[i] == anotherArray[i]) {
					if(i == this.data.length-1) {
						return true;
					}
				} else {
					return false;
				}
				
			}
		}
		return false;
	}
	public String toString() {
		String arrayString = "";
		for(int i = 0; i < this.data.length; i++) {
			arrayString = arrayString + this.data[i]+"";
			if(i < this.data.length - 1) {
				arrayString += ", ";
			}
		}
		return "[" + arrayString + "]";
	}
	public double min() {
		double min = this.data[0];
		for(int i = 0; i < this.data.length; i++) {
			if(this.data[i] < min){
				min = this.data[i];
			}
			
		}
		return min;
	}
	public double max() {
		double max = this.data[0];
		for(int i = 0; i < this.data.length; i++) {
			if(this.data[i] > max){
				max = this.data[i];
			}
			
		}
		return max;
	}
	public double average() {
		double numerator = 0;
		for(int i = 0; i < this.data.length; i++) {
			numerator = numerator + this.data[i];
		}
		return numerator/this.data.length;
	}
	public double mode() {
		int count1 = 0, count2 = 0;
		double mode1 = 0, mode2 = 0;
		for(int i = 0; i < data.length; i++) {
			mode1 = data[i];
			count1 = 0;
			for(int j = i + 1; j < data.length; j++) {
				if(mode1 == data[j]) {
					count1++;
				}
				if(count1 > count2) {
					mode2 = mode1;
					count2 = count1;
				} else if(count1 ==  count2) {
					mode2 = Double.NaN;
				}
			}
		}	
		return mode2;		
	}
}

