/*
 * [CSCI 1301].java
 * Author:  [Yanlin Chen] 
 * Submission Date:  [11/5/2021]
 *
 * Purpose: Compare double array
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

	//default Stat constructor
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
	//Stat constructor
	public Stat(double[] d){
		double[] newD = new double[d.length];
		for (int index = 0; index < d.length; index++) {
			newD[index] = d[index];
		}
		data = newD;
	}
	//getData
	public double[] getData(){
		double[] newG = new double[data.length];
		for (int index = 0; index < data.length; index++) {
			newG[index] = data[index];
		}
		return newG;
	}
	//setData
	public void setData(double[] set) {
		double[] copyD = set ;
		data = copyD;
	}
	//equals
	public boolean equals(Stat s) {
		int equal = 0;
		double[] newS = s.data;
		for (int index = 0; index < newS.length; index++) {
			if (data[index] != newS[index]) {
				equal += 1;
			}
		}
		if (equal == 0)
			return true;
		else
			return false;
	}
	//toString
	public String toString() {
		String s1 = "[";
		for (int index = 0; index <= data.length - 1; index++) {
			if (index < data.length - 1)
				s1 = s1 + data[index] + ", ";
			else if (index == data.length - 1)
				s1 = s1 + data[index] + "]";
		}
		return s1;
	}
	//minimum
	public double min() {
		double min = 0;
		min = data[0];
		for (int index = 0; index <= data.length - 1; index++) {
			if (min > data[index])
				min = data[index];
		}
		return min;
	}
	//maximum
	public double max() {
		double max = 0;
		max = data[0];
		for (int index = 0; index <= data.length - 1; index++) {
			if (max < data[index])
				max = data[index];
		}
		return max;
	}
	//average
	public double average() {
		double ave = 0;
		double sum = 0;
		for (int index = 0; index <= data.length - 1; index++) {
			sum += data[index];
		}
		ave = sum / data.length;
		return ave;
	}
	//mode
	public double mode() {
		int currentMax = 0;
		double theNum = 0;
		if (data.length == 1) {
			theNum = data[0];
			return theNum;
		}
		else {
			for (int i = 0; i <= data.length - 1; i++) {
				int count = 0;
				for (int ii = 0; ii <= data.length - 1; ii++) {
					if (data[i] == data[ii]) 
						count++;
				}
				if (currentMax < count) {
					currentMax = count;
					theNum = data[i];
				}
				else if (currentMax == count) {
					if (theNum != data[i])
						theNum = Double.NaN;
				}
			if (currentMax > 1)
				theNum += 0;
			else
				theNum = Double.NaN;
			}
			return theNum;
		}
	}
}
