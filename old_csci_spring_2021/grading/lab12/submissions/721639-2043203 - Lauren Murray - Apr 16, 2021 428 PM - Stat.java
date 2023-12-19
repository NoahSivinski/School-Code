/*
 * CSCI1301.java
 * Author:  Lauren Murray
 * Submission Date:  4/16/2021
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
		data = new double[0];
	}
	
	public Stat(double[] d) {
		double dd[] = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dd[i] = d[i];
		}
		this.data = dd;
		
	}
	
	public Stat(float[] f) {
		double dd[] = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			dd[i] = (double)(f[i]);
		}
		this.data = dd;
	}

	
	public Stat(int[] i) {
		double dd[] = new double[i.length];
		for (int j = 0; j < i.length; j++) {
			dd[j] = (double) (i[j]);
		}
		this.data=dd;
		
	}
	
	public Stat(long[] f) {
		double dd[] = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			dd[i] = (double) (f[i]);
		}
		this.data = dd;
	}
	
	public double [] getData() {
		double d[] = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			d[i] = data[i];
		}
		return d;
	}
	
	public void setData(double[] d) {
		try {
			double dd[] = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				dd[i] = d[i];
			}
			this.data = dd;
		} catch (NullPointerException e) {
			this.data = new double[0]; 
		}
	}
	
	public void setData(float[] d) {
		double dd[] = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dd[i] = (double) d[i];
		}
		this.data = dd;
	}
	
	public void setData(int[] d) {
		double dd[] = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dd[i] = (double) d[i];
		}
		this.data = dd;
	}
	public void setData(long[] d) {
		double dd[] = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dd[i] = (double) d[i];
		}
		this.data = dd;
		   
	}
	
	public boolean equals(Stat s) {
		boolean result = true;
		try {
			if (s.data.length == this.data.length) {
				for (int i = 0; i < s.data.length; i++) {
					if (s.data[i]!= this.data[i]) {
						return false;
					}
				}
			} else {
				return false;
			}
			return result;
		} catch (NullPointerException e) {
			return false;
		}
	}
	
	public void reset () {
		double da[] = new double[0];
		this.data = da;
	}
	
	public void append(double[] d) {
		try {
			if (d.length > 0) {
				int arcount = 0;
				int len = this.data.length + d.length;
				double[] res = new double[len];
				for (int i = 0; i < data.length; i++) {
					res[i] = this.data[i];
				}
				for (int i = data.length; i < len; i++) {
					res[i] = d[arcount];
					arcount++;
				}
				this.data = res;
			}
		} catch (NullPointerException e) {
			
		}
	} 
	public void append(float[] d) {
		if (d.length > 0) {
			int arcount = 0;
			int len = this.data.length + d.length;
			double[] res = new double[len];
			for (int i = 0; i < data.length; i++) {
				res[i] = this.data[i];
			}
			
			for (int i = data.length; i < len; i++) {
				res[i] = Double.valueOf(d[arcount]);
				arcount++;
			}
			this.data = res;
		}
	}
	
	public void append(int[] d) {
		if (d.length > 0) {
			int arcount = 0;
			int len = this.data.length + d.length;
			double[] res = new double[len];
			for (int i = 0; i < data.length; i++) {
				res[i] = this.data[i];
			}
			for (int i = data.length; i < len; i++) {
				
				res[i] = Double.valueOf(d[arcount]);
				arcount++;
			}
			this.data = res;
		}
	}
	
	public void append(long[] d) {
		if (d.length > 0) {
			int arcount = 0;
			int len = this.data.length + d.length;
			double[] res = new double[len];
			for (int i = 0; i < data.length; i++) {
				res[i] = this.data[i];
			}
			for (int i = data.length; i < len; i++) {
				res[i] = Double.valueOf(d[arcount]);
				arcount++;
			}
			this.data=res;
		}
	}
	
	public boolean isEmpty() {
		if(this.data.length ==0)
			return true;
		
		return false;
	}
	
	public String toString() {
		String result = "[";
		for (int i = 0; i < this.data.length; i++) {
			result = result + " " + this.data[i];
		}
		return result + "]";
	}
	
	public double min() {
		if (this.data.length > 0) {
			double m = this.data[0];
			for (int i = 0; i < this.data.length; i++) {
				if (m > data[i]) {
					m = data[i];
				}
			}
			return m;
		} else if (this.data.length == 0) {
			return Double.NaN;
		}
		return Double.NaN;
	}
	
	public double max() {
		if (this.data.length > 0) {
			double m = this.data[0];
			for (int i = 0; i < this.data.length; i++) {
				if (m < data[i]) {
					m = data[i];
				}
			}
			return m;
		} else if (this.data.length == 0) {
			return Double.NaN;
		}
		return Double.NaN;
	}
	
	public double average() {
		double s = 0;
		for (int i = 0; i < this.data.length; i++) {
			s = s + this.data[i];
		}
		return s / this.data.length;
	}
	
	public double mode() {
		if (this.data.length > 0) {
			int modeCount = 0;
			double modeElement = this.data[0];
			for (int i = 0; i < this.data.length; i++) {
				int numCount = 0;
				double num = data[i];
				for (int j = 0; j < this.data.length; j++) {
					if (data[j] == data[i]) {
						numCount++;
					}
				}
				if (numCount > modeCount) {
					modeCount = numCount;
					modeElement = num;
				}
			}
			return modeElement;
		} else if (this.data.length == 0) {
			return Double.NaN;
		}
		return Double.NaN;
	}
	
	public int occursNumberOfTimes(double value) {
		
		int count = 0;
		for (int i = 0; i < this.data.length; i++) {
			
			if(this.data[i] == value) {
				count++;
			}
		}
		return count;
	}
	
	public double variance() {
		double average = 0;
		
		for (int i = 0; i < this.data.length; i++) {
			average = average + this.data[i];
		}
		
		average = average / this.data.length;
		double var = 0;
		for (int i = 0; i < this.data.length; i++) {
			var = var + Math.pow(this.data[i] - average, 2);
		}
		
		return var / this.data.length;
	}
	
	public double standardDeviation() {
		double variance = variance();
		return Math.sqrt(variance);
			
	}
	
	public static void main(String[] args) {
		//Example 1
		double[] data1 = {};
		Stat stat1 = new Stat(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation());
		System.out.println("stat1 is empty = " +stat1.isEmpty() + "\n");
		
		//Example 2
		double[] data2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Stat stat2 = new Stat(data2);
		System.out.println("stat1 data = " + stat2.toString());
		System.out.println("stat1 min = " + stat2.min());
		System.out.println("stat1 max = " + stat2.max());
		System.out.println("stat1 average = " + stat2.average());
		System.out.println("stat1 mode = " + stat2.mode()); 
		System.out.println("stat1 variance = " + stat2.variance());
		System.out.println("stat1 standard deviation = " + stat2.standardDeviation());
		System.out.println("stat1 is empty = " + stat2.isEmpty() + "\n");
		
		stat2.reset();
		System.out.println("stat1 data = " + stat2.toString());
		System.out.println("stat1 min = " + stat2.min());
		System.out.println("stat1 max = " + stat2.max());
		System.out.println("stat1 average = " + stat2.average());
		System.out.println("stat1 mode = " + stat2.mode());
		System.out.println("stat1 variance = " + stat2.variance());
		System.out.println("stat1 standard deviation = " + stat2.standardDeviation());
		System.out.println("stat1 is empty = " + stat2.isEmpty() + "\n");
		
		//Example 3
		float[] data3 = {10.0F, 10.0F};
		Stat stat3 = new Stat(data3);
		System.out.println("stat1 data = " + stat3.toString());
		System.out.println("stat1 min = " + stat3.min());
		System.out.println("stat1 max = " + stat3.max());
		System.out.println("stat1 average = " + stat3.average());
		System.out.println("stat1 mode = " + stat3.mode());
		System.out.println("stat1 variance = " + stat3.variance());
		System.out.println("stat1 standard deviation = " + stat3.standardDeviation() + "\n");
		
		long[] data4 = {80L, 60L};
		
		stat3.append(data4);
		System.out.println("stat1 data = " + stat3.toString());
		System.out.println("stat1 min = " + stat3.min());
		System.out.println("stat1 max = " + stat3.max());
		System.out.println("stat1 average = " + stat3.average());
		System.out.println("stat1 mode = " + stat3.mode());
		System.out.println("stat1 variance = " + stat3.variance());
		System.out.println("stat1 standard deviation = " + stat3.standardDeviation());
		
		//Example 4
		System.out.println("\n");
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
		Stat stat4 = new Stat();
		
		System.out.println("stat1 data = " + stat4.toString());
		
		stat4.append(data);
		
		System.out.println("stat1 has been altered.");
		
		System.out.println("stat1 data = " + stat4.toString());
		System.out.println("stat1 min = " + stat4.min());
		System.out.println("stat1 max = " + stat4.max());
		System.out.println("stat1 average = " + stat4.average());
		System.out.println("stat1 mode = " + stat4.mode());
		System.out.println("stat1 variance = " + stat4.variance());
		System.out.println("stat1 standard deviation = " + stat4.standardDeviation());
		
		//Example 5
		System.out.println("\n");
		double[] data5 = {50.0,60.0};
		float[] data6 = {70.0F, 80.0F};
		int[] data7 = {90, 100};
		long[] data8 = {100L, 110L};
		
		Stat stat5 = new Stat();
		System.out.println("stat1 data = " + stat5.toString());
		stat5.setData(data5);
		System.out.println("stat1 data = " + stat5.toString());
		stat5.setData(data6);
		System.out.println("stat1 data = " + stat5.toString());
		stat5.setData(data7);
		System.out.println("stat1 data = " + stat5.toString());
		stat5.setData(data8);
		System.out.println("stat1 data = " + stat5.toString());
		data5 = null;
		stat5.setData(data5);
		System.out.println("stat1 data = " + stat5.toString());
		
		//Example 6
		System.out.println("\n");
		double[] data9 = {50.0, 60.0};
		float[] data10 = { 70.0F, 80.0F};
		int[] data11 = {90, 100};
		long[] data12 = {100L, 110L};
		Stat stat6 = new Stat();
		
		System.out.println("stat1 data = " + stat6.toString());
		stat6.append(data9);
		System.out.println("stat1 data = " + stat6.toString());
		stat6.append(data10);
		System.out.println("stat1 data = " + stat6.toString());
		stat6.append(data11);
		System.out.println("stat1 data = " + stat6.toString());
		stat6.append(data12);
		data9 = null;
		stat6.append(data9);
		
		System.out.println("stat1 data = " + stat6.toString());
		System.out.println("stat1 min = " + stat6.min());
		System.out.println("stat1 max = " + stat6.max());
		System.out.println("stat1 average = " + stat6.average());
		System.out.println("stat1 mode = " + stat6.mode());
		System.out.println("stat1 variance = " + stat6.variance());
		System.out.println("stat1 standard deviation = " + stat6.standardDeviation() + "\n");
		
		//Example 7
		System.out.println("\n");
		double[] data13 = {10,10};
		int[] data14 = {10,10};
		Stat stat7 = new Stat(data13);
		Stat stat8 = new Stat(data14);
		Stat stat9 = new Stat();
		Stat stat10 = null;
		System.out.println("stat1 data = " + stat7.toString());
		System.out.println("stat2 data = " + stat8.toString());
		System.out.println("stat2 data = " + stat8.toString());
		System.out.println("stat1 equals stat2 = " + stat7.equals(stat8));
		System.out.println("stat1 equals stat3 = " + stat7.equals(stat9));
		System.out.println("stat1 equals stat4 = " + stat7.equals(stat10));
		
		//Example 8
		System.out.println("\n");
		double[] data21 = {};
		double[] data22 = { 25 };
		float[] data23 = {};
		float[] data24 = { 25 };
		int[] data25 = {};
		int[] data26 = { 50 };
		long[] data27 = {};
		long[] data28 = { 12 };
		
		Stat stat11 = new Stat();
		stat11.append(data21);
		stat11.append(data22);
		stat11.append(data23);
		stat11.append(data24);
		stat11.append(data25);
		stat11.append(data26);
		stat11.append(data27);
		stat11.append(data28);
		data21 = null;
		stat11.append(data21);
		
		System.out.println("stat1 data =  " + stat11.toString());
		System.out.println("stat1 min = " + stat11.min());
		System.out.println("stat1 max = " + stat11.max());
		System.out.println("stat1 average = " + stat11.average());
		System.out.println("stat1 mode = " + stat11.mode());
		System.out.println("stat1 variance = " + stat11.variance());
		System.out.println("stat1 standard deviation = " + stat11.standardDeviation() + "\n");
		
	}
}
	
	//Below this line are the tests for the original Stat program (Lab 11).
	//They are commented out so they do not run. 
	//public static void main(String[] args) {
		//Example 1
	/*
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
	*/

















