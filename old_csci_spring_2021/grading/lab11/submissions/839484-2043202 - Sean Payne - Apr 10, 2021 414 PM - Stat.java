/*
 * Stat.java
 * Author:  Sean Payne 
 * Submission Date:  04/10/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *      This program displays crucial info based on arrays. 
 * Classic statistical categories are the crucial info mentioned.
 * This program is meant to be utilized by call.
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
		double sdata[] = s.getData();
		if (data.length != sdata.length)
			return false;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != sdata[i])
				return false;
		}
		return true;
	}

	public String toString() {
		String arrayData = "";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1)
				arrayData += data[i];
			else
				arrayData += data[i] + ", ";
		}
		return "[" + arrayData + "]";
	}

	public double min() {
		double min = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < min)
				min = data[i];
		}
		return min;
	}

	public double max() {
		double max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max)
				max = data[i];
		}
		return max;
	}

	public double average() {
		double sum = 0.0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / data.length;
	}

	public double mode() {
		if (data.length == 1)
			return data[0];
		double temp; // Serves as a temporary placeholder
		double[] frequency = new double[data.length]; // store frequency
		int checked = -1; // array spot checked

		for (int i = 0; i < data.length; i++) {
			int count = 1;
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] == data[j]) {
					count++;
					frequency[j] = checked;
				}
			}
			if (frequency[i] != checked)
				frequency[i] = count;
		}

		for (int i = 0; i < frequency.length; i++) // sorts the array in decreasing order
		{
			for (int j = i + 1; j < frequency.length; j++) {
				if (frequency[i] < frequency[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;

					temp = frequency[i];
					frequency[i] = frequency[j];
					frequency[j] = temp;
				}
			}
		}

		if (frequency[0] == frequency[1])
			return Double.NaN;
		else
			return data[0];

	}

}
