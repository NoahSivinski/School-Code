/*
 * Stat.java
 * Author:  Charles Merritt 
 * Submission Date:  11/12/2021
 *
 * Purpose: For this assignment we are given a UML diagram and instructed to
 * implement methods in this class for a variety of statistical functions using
 * OOP principles.
 *
 * Statement of Academic Honesty: CEM
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
		data = new double[0];
	}

	public Stat(double[] d) {
		if (d == null) {
			data = null;
		}
		else {
			data = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				data[i] = d[i];
			}
		}
	}

	public Stat(float[] f) {
		if (f == null) {
			data = null;
		}
		else {
			data = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				data[i] = f[i];
			}
		}
	}

	public Stat(int[] i) {
		if (i == null) {
			data = null;
		}
		else {
			data = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				data[j] = i[j];
			}
		}
	}

	public Stat(long[] lo) {
		if (lo == null) {
			data = null;
		}
		else {
			data = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				data[i] = lo[i];
			}
		}
	}


	public double[] getData() {
		double[] newData = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		return newData;
	}

	public void setData(double[] d) {
		if (d == null) {
			data = null;
		}
		else {
			data = new double[d.length];
			for(int i = 0; i < d.length; i++)
				data[i] = d[i];
		}
	}

	public void setData(float[] f) {
		if (f == null) {
			data = null;
		}
		else {
			data = new double[f.length];
			for(int i = 0; i < f.length; i++)
				data[i] = f[i];
		}
	}

	public void setData(int[] i) {
		if (i == null) {
			data = null;
		}
		else {
			data = new double[i.length];
			for(int j = 0; j < i.length; j++)
				data[j] = i[j];
		}
	}

	public void setData(long[] lo) {
		if (lo == null) {
			data = null;
		}
		else {
			data = new double[lo.length];
			for(int i = 0; i < lo.length; i++)
				data[i] = lo[i];
		}
	}

	public boolean equals(Stat other) {
		if (other == null) {
			return false;
		}
		double eqdata[] = other.getData();
		if (data.length != eqdata.length)
			return false;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != eqdata[i])
				return false;
		}
		return true;
	}

	public void reset() {
		double[] resetData = new double[0];
		data = resetData;
	}

	public void append(int[] i) {
		if (i == null) {
			return;
		}
		else {
			double newData[] = new double[data.length+i.length];
			for (int j = 0; j < data.length; j++) {
				newData[j] = data[j];
			}
			for (int j = 0; j < i.length; j++) {
				newData[data.length + j] = i[j];
			}
			data = newData;
		}
	}

	public void append(float[] f) {
		if (f == null) {
			return;
		}
		else {
			double newData[] = new double[data.length+f.length];
			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
			}
			for (int i = 0; i < f.length; i++) {
				newData[data.length + i] = f[i];
			}
			data = newData;
		}
	}

	public void append(long[] lo) {
		if (lo == null) {
			return;
		}
		else {
			double newData[] = new double[data.length+lo.length];
			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
			}
			for (int i = 0; i < lo.length; i++) {
				newData[data.length + i] = lo[i];
			}
			data = newData;
		}
	}

	public void append(double[] d) {
		if (d == null) {
			return;
		}
		else {
			double newData[] = new double[data.length+d.length];
			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
			}
			for (int i = 0; i < d.length; i++) {
				newData[data.length + i] = d[i];
			}
			data = newData;
		}
	}

	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	private int occursNumberOfTimes(double value) {
		int occurs = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				occurs++;
			}
		}
		return occurs;
	}

	public String toString() {
		String arrayString = "";
		// empty check
		if (isEmpty()) {
			return "[]";
		}
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1)
				arrayString += data[i];
			else
				arrayString += data[i] + ", ";
		}
		return "[" + arrayString + "]";
	}

	public double min() {
		// empty check
		if (isEmpty()) {
			return Double.NaN;
		}
		double min = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < min)
				min = data[i];
		}
		return min;
	}

	public double max() {
		// empty check
		if (isEmpty()) {
			return Double.NaN;
		}
		double max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max)
				max = data[i];
		}
		return max;
	}

	public double average() {
		// empty check
		if (isEmpty()) {
			return Double.NaN;
		}
		double sum = 0.0;
		for (double datum : data) {
			sum += datum;
		}
		return sum / data.length;
	}

	public double variance() {
		// empty check
		if (isEmpty()) {
			return Double.NaN;
		}
		double avg = average();
		double sum = 0;
		for (double datum : data) {
			sum = sum + (datum - avg) * (datum - avg);
		}
		return sum/data.length;
	}

	public double standardDeviation() {
		// takes sqrt of variance()
		if (isEmpty()) {
			return Double.NaN;
		}
		return Math.sqrt(variance());
	}

	public double mode() {
		// Early check
		if (isEmpty()) {
			return Double.NaN;
		}

		// Find the highest count of a number (and that number)
		int maxCount = 0;
		double maxValue = 0;
		for (double num : data) {
			int count = occursNumberOfTimes(num);
			if (count > maxCount) {
				maxValue = num;
				maxCount = count;
			}
		}

		// Check to make sure there's only one mode
		for (double num : data) {
			int count = occursNumberOfTimes(num);
			// If the frequency is the same but the value is different from the current mode
			if (count == maxCount && num != maxValue) {
				return Double.NaN;
			}
		}

		return maxValue;
	}


	public static void main(String[] args) {

		double[] data1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// mode = NaN, max = 10, min = 1, avg = 5.5, variance = 8.25, SD = 2.87
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
		System.out.println("stat1 data = " + stat1);
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation());
		System.out.println("stat1 number of occurences(1) = " + stat1.occursNumberOfTimes(1));
		System.out.println("stat1 is empty = " + stat1.isEmpty() + "\n");
		

		Stat stat2 = new Stat(data2);
		System.out.println("stat2 data = " + stat2);
		System.out.println("stat2 min = " + stat2.min());
		System.out.println("stat2 max = " + stat2.max());
		System.out.println("stat2 average = " + stat2.average());
		System.out.println("stat2 mode = " + stat2.mode() + "\n");
		System.out.println("stat2 variance = " + stat2.variance()); 
		System.out.println("stat2 standard deviation = " + stat2.standardDeviation()); 
		System.out.println("stat2 is empty = " + stat2.isEmpty() + "\n"); 

		Stat stat3 = new Stat(data3);
		System.out.println("stat3 data = " + stat3);
		System.out.println("stat3 min = " + stat3.min());
		System.out.println("stat3 max = " + stat3.max());
		System.out.println("stat3 average = " + stat3.average());
		System.out.println("stat3 mode = " + stat3.mode() + "\n");
		System.out.println("stat3 variance = " + stat3.variance()); 
		System.out.println("stat3 standard deviation = " + stat3.standardDeviation()); 
		System.out.println("stat3 is empty = " + stat3.isEmpty() + "\n"); 

		Stat stat4 = new Stat(data4);
		System.out.println("stat4 data = " + stat4);
		System.out.println("stat4 min = " + stat4.min());
		System.out.println("stat4 max = " + stat4.max());
		System.out.println("stat4 average = " + stat4.average());
		System.out.println("stat4 mode = " + stat4.mode() + "\n");
		System.out.println("stat4 variance = " + stat4.variance()); 
		System.out.println("stat4 standard deviation = " + stat4.standardDeviation()); 
		System.out.println("stat4 is empty = " + stat4.isEmpty() + "\n"); 
		
		Stat stat5 = new Stat(data5);
		System.out.println("stat5 data = " + stat5);
		System.out.println("stat5 min = " + stat5.min());
		System.out.println("stat5 max = " + stat5.max());
		System.out.println("stat5 average = " + stat5.average());
		System.out.println("stat5 mode = " + stat5.mode() + "\n");
		System.out.println("stat5 variance = " + stat5.variance()); 
		System.out.println("stat5 standard deviation = " + stat5.standardDeviation()); 
		System.out.println("stat5 is empty = " + stat5.isEmpty() + "\n"); 

		Stat stat6 = new Stat(data6);
		System.out.println("stat6 data = " + stat6);
		System.out.println("stat6 min = " + stat6.min());
		System.out.println("stat6 max = " + stat6.max());
		System.out.println("stat6 average = " + stat6.average());
		System.out.println("stat6 mode = " + stat6.mode() + "\n");
		System.out.println("stat6 variance = " + stat6.variance()); 
		System.out.println("stat6 standard deviation = " + stat6.standardDeviation()); 
		System.out.println("stat6 is empty = " + stat6.isEmpty() + "\n"); 

		System.out.println("stat1 is equal to stat2 using equals()? " + stat1.equals(stat2));
		// false
		System.out.println("stat1 is equal to stat6 using equals()? " + stat1.equals(stat6));
		// true
		System.out.println("stat6 is equal to stat1 using equals()? " + stat6.equals(stat1));
		// true
		
		double[] data7 = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9}; 
		double[] data8 = {100.34, 50.01, 50.01, -8}; 
		Stat stat7 = new Stat(); 

		System.out.println("stat7 data = " + stat7);

		stat7 = new Stat(data7); 

		System.out.println("stat1 has been altered."); 
		System.out.println("stat1 data = " + stat7);

		System.out.println("stat1 min = " + stat7.min()); 
		System.out.println("stat1 max = " + stat7.max()); 
		System.out.println("stat1 average = " + stat7.average()); 
		System.out.println("stat1 mode = " + stat7.mode() + "\n"); 

		Stat stat8 = new Stat(); 
		stat8.setData(data8); 
		Stat stat9 = new Stat(stat8.getData()); 

		System.out.println("stat8 data = " + stat8);
		System.out.println("stat9 data = " + stat9);
		stat9.append(stat8.getData());
		System.out.println("stat8+9 append " + stat9);
		System.out.println(); 
		System.out.println("stat9 is equal to stat8 using \"equals()\"? " + stat9.equals(stat8)); 

		System.out.println("stat7 is equal to stat9  using \"equals()\"? " + stat7.equals(stat9)); 

		System.out.println("stat8 is equal to stat9  using \"==\"? " + (stat8 == stat9));

		System.out.println("reset test");
		System.out.println("stat9 before reset = " + stat9);
		stat9.reset();
		System.out.println("stat9 after reset = " + stat9);
		
	}

}

