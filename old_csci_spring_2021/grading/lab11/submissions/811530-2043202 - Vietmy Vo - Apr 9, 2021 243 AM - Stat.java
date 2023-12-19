/*
 * Stat.java
 * Author:  Vietmy Vo
 * Submission Date:  4/9/2021
 *
 * Purpose: The purpose of the class is to create a new array with contents of the old array to return it. It can also find values
 * such as the minimum,maximum,average, and mode.
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
		data = new double[1];
		data[0] = 0.0;

	}

	public Stat(double[] d) {
		double[] newArray = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}

	public double[] getData() {
		double[] newArray = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}

	public void setData(double[] d) {
		double[] newArray = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}

	public boolean equals(Stat s) {
		if (s.data.length != data.length)
			return false;
		for (int i = 0; i < data.length; i++)
			if (s.data[i] != data[i])
				return false;
		return true;
	}

	public String toString() {
		String dataArray = "";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1)
				dataArray = dataArray + data[i];
			else
				dataArray = dataArray + data[i] + ", ";
		}
		return "[" + dataArray + "]";
	}

	public double min() {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}

	public double max() {
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}

	public double average() {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = data[i] + sum;
		}
		double mean = sum / data.length;
		return mean;
	}

	public double mode() {
		double[] frequency = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i] == data[j]) {
					frequency[i]++;
				}
			}
		}
		double maxNumber = 0;
		double mode = data[0];
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > maxNumber) {
				maxNumber = frequency[i];
				mode = data[i];
			}
		}
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] == maxNumber) {
				if (mode != data[i]) {
					return Double.NaN;
				}
			}
		}
		return mode;
	}

}
