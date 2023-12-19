/*
 * CSCI1301.java
 * Author:  Lauren Murray
 * Submission Date:  4/9/2021
 *
 * Purpose: This program stores an array of double values called "data", and
 * prints some numerical summaries of the data, including values such as the
 * minimum, maximum, and mode. The program can also output if one array is
 * equivalent to another array. 
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
		for (int i=0; i < d.length; i++) {
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
		if(data.length !=sdata.length)
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
			if (i == data.length -1) 
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
			sum +=data[i];
		}
		return sum/data.length;
	}
	public double mode() {
		double maxNumber = 0.0;
		int maxNumberCount=0;
		for (int i = 0; i < data.length; i++) {
			int numberCount = 0;
			for (int j = 0; j < data.length; j++) {
				if (data[i] == data [j])
					numberCount++;
			}
			if (numberCount > maxNumberCount) {
				maxNumberCount = numberCount;
				maxNumber = data[i];
			}
		}
		for (int i = 0; i < data.length; i++) {
			if (data[i] == maxNumber)
				continue;
			int numberCount = 0;
			for (int j = 0; j < data.length; j++) {
				if(data[i] == data[j])
					numberCount++;
			}

			if(numberCount == maxNumberCount)
				return Double.NaN;
		}
		return maxNumber;
		   
	}
	
	public static void main(String[] args) {
		//Example 1
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
		Stat stat3 = new Stat (stat1.getData());
		
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("stat3 data = " + stat3.toString());
		System.out.println();
		System.out.println("stat1 is equal to stat2 using \"equals()\"?" +
				stat1.equals(stat2));
		System.out.println("stat1 is equal to stat3 using \"equals()\"?" +
				stat1.equals(stat3));
		System.out.println("stat1 is equal to stat3 using \"==\"?" +
				(stat1==stat3));
		
		//Example2
		System.out.println(); //printing a new line to separate Examples/testing the methods
		double[] ex2Data = {10.0, 20.0, 30.0};
		Stat ex2stat1 = new Stat(ex2Data);

		ex2Data[0] = 100.0;
		ex2Data[1] = 200.0;
		ex2Data[2] = 300.0;

		Stat ex2stat2 = new Stat(ex2Data);

		System.out.println("stat1 data = " + ex2stat1.toString());
		System.out.println("stat2 data = " + ex2stat2.toString());
		System.out.println("The two arrays should be different");
		
		//Example 3
		System.out.println(); //printing a new line to separate Examples/testing the methods
		double[] ex3Data = {10.0, 20.0, 30.0};
		Stat ex3stat1 = new Stat(ex3Data);
		
		double[] ex3Data2 = ex3stat1.getData();
		System.out.println("The arrays are identical: " + (ex3Data == ex3Data2));

		//Example 4
		System.out.println(); //printing a new line to separate Examples/testing the methods
		double[] ex4Data = {10.0, 20.0, 30.0};
		Stat ex4stat1 = new Stat();
		ex4stat1.setData(ex4Data);
		Stat ex4stat2 = new Stat(ex4Data);
		double[] ex4Data2 = ex4stat1.getData();
		
		System.out.println("The arrays are identical: " + (ex4Data == ex4Data2));
		System.out.println("stat2 equals stat1: " + ex4stat2.equals(ex4stat1));
		System.out.println("stat1 equals stat2: " + ex4stat2.equals(ex4stat1));
		
		
		//Example 5 
		System.out.println(); //printing a new line to separate Examples/testing the methods
		Stat ex5stat1 = new Stat();
		System.out.println("stat1 data = " + ex5stat1.toString());
		System.out.println("stat1 min = " + ex5stat1.min());
		System.out.println("stat1 max = " + ex5stat1.max());
		System.out.println("stat1 average = " + ex5stat1.average());
		System.out.println("stat1 mode = " + ex5stat1.mode()); 
		System.out.println("stat1 data = " + ex5stat1.toString());
		
		//Example 6 - 
		System.out.println(); //printing a new line to separate Examples/testing the methods
		double[] ex6Data = {1,2,2,3,3,4};
		Stat ex6stat1 = new Stat(ex6Data);
		
		System.out.println("stat1 data = " + ex6stat1.toString());
		System.out.println("stat1 min = " + ex6stat1.min());
		System.out.println("stat1 max = " + ex6stat1.max());
		System.out.println("stat1 average = " + ex6stat1.average());
		System.out.println("stat1 mode = " + ex6stat1.mode()); 
		System.out.println("stat1 data = " + ex6stat1.toString());
		
		
		}
		
	}
	

















