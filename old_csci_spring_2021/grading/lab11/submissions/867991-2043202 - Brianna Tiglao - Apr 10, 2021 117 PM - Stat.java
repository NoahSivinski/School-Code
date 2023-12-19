/*
 * Stat.java
 * Author:  Brianna Tiglao 
 * Submission Date:  April 10, 2021
 *
 * Purpose: The purpose of this code is to take data sets and run them
 * through stat methods such as finding the min, the max, the mode, etc.
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
		data = new double[]{0.0};
	}

	public Stat(double[] d) {
		double[] dCopy = new double[d.length];
		for (int i = 0; i < d.length; i++){
			dCopy[i] = d[i];
		}
		data = dCopy;
	}

	public double[] getData() {
		double[] dataCopy = new double[data.length];
		for (int i = 0; i < data.length; i++){
			dataCopy[i] = data[i];
		}
		return dataCopy;
	}

	public void setData(double[] d) {
		double[] dCopy = new double[d.length];
		for (int i = 0; i < d.length; i++){
			dCopy[i] = d[i];
		}
		data = dCopy;
	}

	public boolean equals(Stat s) {
		double[] sData = s.getData();

		if (sData.length != data.length) {
			return false;
		}
		for (int i = 0; i < data.length; i++) {
			if (sData[i] != data[i]) {
				return false;
			}
		}

		return true;
	}

	public String toString() {
		String output = "[";
		for (int i = 0; i < data.length - 1; i++) {
			output += data[i] + ", ";
		}
		output += data[data.length - 1] + "]";

		return output;
	}

	public double min() {
		double min = Integer.MAX_VALUE;

		for(int i = 0; i < data.length; i++){
			if(data[i] < min) {
				min = data[i];
			}
		}

		return min;
	}

	public double max() {
		double max = Integer.MIN_VALUE;

		for(int i = 0; i < data.length; i++){
			if(data[i] > max) {
				max = data[i];
			}
		}

		return max;
	}

	public double average() {
		double sum = 0;

		for (int i = 0; i < data.length; i++){
			sum += data[i];
		}
		return sum / data.length;
	}

	public double mode() {
		double modeVal = 0;
		int maxValCount = 0;
		
		for(int i = 0; i < data.length; i++) {
			int valCount = 0;

			for (int j = i; j < data.length; j++) {
				if (data[i] == data[j]) {
					valCount++;
				}
			}
			if (valCount > maxValCount) {
				maxValCount = valCount;
				
				modeVal = data[i];
			}
			else if (valCount == maxValCount) {
				
				modeVal = Double.NaN;
			}
		}
		
		return modeVal;
	}
}
