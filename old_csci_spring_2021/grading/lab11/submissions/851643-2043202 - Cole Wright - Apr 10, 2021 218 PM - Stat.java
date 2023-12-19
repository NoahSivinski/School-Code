/*
 *Stat.java 
 *
 * Author: Cole Wright 
 * Submission Date: 4/10/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This code uses arrays to store data and do many things with it. Such as mode, comparing multiple data points, and finding the max in the data point. It uses a UML diagram to visually represent many classes within the data double.
 * The program uses doubles to store each method and their instructions. The code tests the programmer's ability to utilize public and private doubles, strings, arrays, and multiple method types.
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
		for (int x = 0; x < d.length; x++) {
			newArray[x] = d[x];
		}
		data = newArray;
	}

	public double[] getData() {
		double[] newArray = new double[data.length];
		for (int x = 0; x < data.length; x++) {
			newArray[x] = data[x];
		}
		return newArray;
	}

	public void setData(double[] d) {
		double[] newArray = new double[d.length];
		for (int x = 0; x < d.length; x++) {
			newArray[x] = d[x];
		}
		data = newArray;
	}

	public boolean equals(Stat s) {
		double sdata[] = s.getData();
		if (data.length != sdata.length)
			return false;
		for (int x = 0; x < data.length; x++) {
			if (data[x] != sdata[x])
				return false;
		}
		return true;
	}

	public String toString() {
		String arrayData = ""; 
		for (int x = 0; x < data.length; x++) {
			if (x == data.length - 1)
				arrayData += data[x];
			else
				arrayData += data[x] + ", ";
		}
		return "[" + arrayData + "]";
	}

	public double min() {
		double min = data[0];
		for (int x = 1; x < data.length; x++) {
			if (data[x] < min)
				min = data[x];

		}
		return min;

	}

	public double max() {
		double max = data[0];
		for (int x = 1; x < data.length; x++) {
			if (data[x] > max)
				max = data[x];

		}
		return max;

	}

	public double average() {
		double avg = 0.0;
		for (int x = 0; x < data.length; x++) {

			avg += data[x];
		}
		return avg / data.length;
	}

	public double mode() {
		double maxNumber = 0.0;
		int highNumberCount = 0;
		for (int x = 0; x < data.length; x++) {
			int numberCount = 0;
			for (int y = 0; y < data.length; y++) {
				if (data[x] == data[y])
					numberCount++;
			}
			if (numberCount > highNumberCount) {
				highNumberCount = numberCount;
				maxNumber = data[x];
			} else if (numberCount == highNumberCount) {
				highNumberCount = -1;
			} 
		}
		if (highNumberCount > 1)
			return maxNumber;
		else if (highNumberCount == -1) {
			return Double.NaN;
		} else {
			return Double.NaN;
		}
	}
	   public static void main(String[] args) {
		   
	   }



}
