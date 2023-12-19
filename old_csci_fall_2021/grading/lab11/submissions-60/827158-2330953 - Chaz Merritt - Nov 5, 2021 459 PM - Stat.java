/*
 * Stat.java
 * Author:  Charles Merritt 
 * Submission Date:  11/5/2021
 *
 * Purpose: For this assignment we are given a UML diagram and instructed to
 * implement methods in this class for a variety of statistical functions using
 * OOP principles.
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

	public Stat(double[] s) {
		double[] newData = new double[s.length];
		for (int i = 0; i < s.length; i++) {
			newData[i] = s[i];
		}
		data = newData;

	}

	public double[] getData() {
		double[] newData = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		return newData;
	}

	public void setData(double[] s) {
		double[] newData = new double[s.length];
		for (int i = 0; i < s.length; i++) {
			newData[i] = s[i];
		}
		data = newData;
	}

	public boolean equals(Stat other) {
		double eqdata[] = other.getData();
		if (data.length != eqdata.length)
			return false;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != eqdata[i])
				return false;
		}
		return true;
	}

	public String toString() {
		String arrayString = "";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1)
				arrayString += data[i];
			else
				arrayString += data[i] + ", ";
		}
		return "[" + arrayString + "]";
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
		double maxNumber = 0.0;
		int maxCount = 0;
		int maxCountCount = 0;
		for (int i = 0; i < data.length; i++) {
			int modeCount = 0;
			for (int j = 0; j < data.length; j++) {
				if (data[i] == data[j])
					modeCount++;
			}
			if (modeCount > maxCount) {
				maxCount = modeCount;
				maxNumber = data[i];
				maxCountCount++;
			}
		}

		if (maxCount > 1) {
			return maxNumber;
		}
		else if (maxCountCount != 1) {
			return Double.NaN;
		}
		else
			return Double.NaN;
	}



	public static void main(String[] args) {

		double[] data1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// mode = NaN, max = 10, min = 1, avg = 5.5
		double[] data2 = { 1.0, 1.0, 1.0, 2.0, 3, 4, 5, 6, 7, 7, 80};
		// mode = 1.0, max = 80, min = 1.0, avg = 10.6363
		double[] data3 = { 0, 1.0, 2.0, 3.0, 3.0, 4.0, 4.0, 5.0};
		// mode = NaN, max = 5.0, min = 0, avg = 2.75
		double[] data4 = { 0.00, 10, -25.0, 50.67, 100.111, 10, 2.54, 0.15, 2500.123, 10, 2.54, 2.54, -10};
		/* mode = returns first mode of 10, max = 2500.123, min = -25.0, avg = 204.129
		 * mode cannot handle multiple modes
		 */ 
		double[] data5 = { -5, -5, 7, 7.0, 7.00, 7};
		// mode = 7, max = 7, min = -5, avg = 3
		double[] data6 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// equals data1
		Stat stat1 = new Stat(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode() + "\n");

		Stat stat2 = new Stat(data2);
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("stat2 min = " + stat2.min());
		System.out.println("stat2 max = " + stat2.max());
		System.out.println("stat2 average = " + stat2.average());
		System.out.println("stat2 mode = " + stat2.mode() + "\n");

		Stat stat3 = new Stat(data3);
		System.out.println("stat3 data = " + stat3.toString());
		System.out.println("stat3 min = " + stat3.min());
		System.out.println("stat3 max = " + stat3.max());
		System.out.println("stat3 average = " + stat3.average());
		System.out.println("stat3 mode = " + stat3.mode() + "\n");

		Stat stat4 = new Stat(data4);
		System.out.println("stat4 data = " + stat4.toString());
		System.out.println("stat4 min = " + stat4.min());
		System.out.println("stat4 max = " + stat4.max());
		System.out.println("stat4 average = " + stat4.average());
		System.out.println("stat4 mode = " + stat4.mode() + "\n");

		Stat stat5 = new Stat(data5);
		System.out.println("stat5 data = " + stat5.toString());
		System.out.println("stat5 min = " + stat5.min());
		System.out.println("stat5 max = " + stat5.max());
		System.out.println("stat5 average = " + stat5.average());
		System.out.println("stat5 mode = " + stat5.mode() + "\n");

		Stat stat6 = new Stat(data6);
		System.out.println("stat6 data = " + stat6.toString());
		System.out.println("stat6 min = " + stat6.min());
		System.out.println("stat6 max = " + stat6.max());
		System.out.println("stat6 average = " + stat6.average());
		System.out.println("stat6 mode = " + stat6.mode() + "\n");

		System.out.println("stat1 is equal to stat2 using equals()? " + stat1.equals(stat2));
		// false
		System.out.println("stat1 is equal to stat6 using equals()? " + stat1.equals(stat6));
		// true
		System.out.println("stat6 is equal to stat1 using equals()? " + stat6.equals(stat1));
		// true


		double[] data7 = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9}; 
		double[] data8 = {100.34, 50.01, 50.01, -8}; 
		Stat stat7 = new Stat(); 

		System.out.println("stat7 data = " +   stat7.toString()); 

		stat7 = new Stat(data7); 

		System.out.println("stat1 has been altered."); 
		System.out.println("stat1 data = " +   stat7.toString()); 

		System.out.println("stat1 min = " + stat7.min()); 
		System.out.println("stat1 max = " + stat7.max()); 
		System.out.println("stat1 average = " + stat7.average()); 
		System.out.println("stat1 mode = " + stat7.mode() + "\n"); 

		Stat stat8 = new Stat(); 
		stat8.setData(data8); 
		Stat stat9 = new Stat(stat8.getData()); 

		System.out.println("stat8 data = " +   stat8.toString()); 
		System.out.println("stat9 data = " +   stat9.toString()); 
		System.out.println(); 
		System.out.println("stat9 is equal to stat8 using \"equals()\"? " + stat9.equals(stat8)); 

		System.out.println("stat7 is equal to stat9  using \"equals()\"? " + stat7.equals(stat9)); 

		System.out.println("stat8 is equal to stat9  using \"==\"? " + (stat8 == stat9));
	}

}

