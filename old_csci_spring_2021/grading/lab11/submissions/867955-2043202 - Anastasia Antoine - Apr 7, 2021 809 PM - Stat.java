/*
 * Stat.java
 * Author:  [Anastasia Antoine] 
 * Submission Date:  [4/7/2021]
 *
 * Purpose: This program will compute the minimum, maximum, average
 * and mode by putting in the data. 
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

	double[] data; 
		
	
	public Stat() {
		this.data = new double[1];
		data[0] = 0.0; 
	}
	
	public Stat (double[] d) {
		double[] newList = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			newList[i] = d[i];
		}
		this.data = newList; 
	}
	
	public double[] getData() {
		double[] newList = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			newList[i] = data[i];
		}
		return newList; 	
	}
	
	public void setData(double[] d) {
		double[] newList = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			newList[i] = d[i];
		}
		this.data = newList; 
	}
	
	public boolean equals(Stat s) {
		double sdata[] = s.getData();
		if (data.length != sdata.length) {
			return false;
		}
		for (int i = 0; i < data.length; i++) {
			if (data[i] != sdata[i]) {
				return false; 
			}
		}
		return true; 
	}
	
	public String toString() {
		String listData = ""; 
		for(int i = 0; i < data.length; i++) {
			if(i == data.length - 1) {
				listData += data[i];
			}
			else {
				listData += data[i] + ",";
			}
		}
		return "[" + listData + "]";
	}
	
	public double min() {
		double min = data[0];
		for(int i = 1; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min; 
	}
	
	public double max() {
		double max = data[0]; 
		for(int i = 1; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
	
	public double average () {
		double sum = 0.0;
		for(int i = 0; i< data.length; i++) {
			sum += data[i];
		}
		return sum / data.length;
	}
	
	public double mode() {
		double maxNumber = 0.0;
		int maxNumberCount = 0; 
		for(int i = 0; i < data.length; i++) {
			int numberCount = 0;
			for(int k =0; k < data.length; k++) {
				if(data[i]== data[k]) {
					numberCount++;
				}
			}
			if(numberCount > maxNumberCount) {
				maxNumberCount = numberCount;
				maxNumber = data[i];
			}
		}
		if(maxNumberCount > 1) {
			return maxNumber;
		}
		else {
			return Double.NaN;
		}
	}
	
		
			

	

}
