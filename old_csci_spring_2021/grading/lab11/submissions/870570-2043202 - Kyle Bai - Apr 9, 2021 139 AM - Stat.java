/*
 * [Stat].java
 * Author:  [KyleBai] 
 * Submission Date:  [04/09/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * In this lab we are practice defining the classes and implementing a class.
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
	private double [] data;
	public Stat() {
		data = new double[] {0.0};
	}

	public Stat(double[] d) {

		double[] array = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			array[i] = d[i];
		}
		data = array;
	}

	public double[] getData() {

		double[] array = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			array[i] = data[i];
		}
		return array;
	}

	public void setData(double[] d) {

		double[] array = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			array[i] = d[i];
			data = array;
		}	
	}
	// Check the length
	public boolean equals(Stat s) {

		if (data.length != s.data.length)
			return false;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != s.data[i])
				return false;
		}
		return true;
	}
	
	public String toString() {

		String string = "";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1)
				string = string + data[i];
			else
				string = string + data[i] + ", ";
		}
		String finalString = "[" + string + "]";
		return finalString;
	}
	//find the minimum from the data
	public double min() {

		double minimum = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < minimum)
				minimum = data[i];
		}
		return minimum;
	}
	//find the maximum from the data
	public double max() {

		double maximum = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > maximum)
				maximum = data[i];
		}
		return maximum;
	}
	//find the average from the data
	public double average() {

		double total = 0;
		for (int i = 0; i < data.length; i++) {
			total = total + data[i];
		}
		double ave = total / data.length;
		return ave;
	}
	//find the mode from the data
	public double mode() {

		int maxCount = 0;
		double number = data[0];
		for (int i = 0; i < data.length; i++) {
			int count = 0;
			double numCount = data[i];
			for (int j = 0; j < data.length; j++) {
				if (data[j] == data[i])
					count++;
			}
			if (count > number) {
				maxCount = count;
				number = data[i];
			}
		}
		if (number != 0 &&  number <= 2) {
			return Double.NaN;
		}
		else {
			return number;
		}
	}
	
	public static void main(String[] args) {
		// copy the examples input from lab pdf and paste here
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
		double[] data2 = {100.34, 50.01, 50.01, -8};
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		stat1 = new Stat(data);
		System.out.println("stat1 has been altered.");
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode() + "\n");
		Stat stat2 = new Stat();
		stat2.setData(data2);
		Stat stat3 = new Stat(stat1.getData());
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("stat3 data = " + stat3.toString());
		System.out.println();
		System.out.println("stat1 is equal to stat2 using \"equals()\"? " +
		stat1.equals(stat2));
		System.out.println("stat1 is equal to stat3 using \"equals()\"? " +
		stat1.equals(stat3));
		System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3));
	}
}