/*
 * Stat.java
 * Author:  Melissa Neff 
 * Submission Date:  11/12/2021
 *
 * Purpose: The purpose of the program is to compute and display the
 * values for min, max, average, mode, variance, and standard deviation
 * for a set of data, as well as if two sets of data are equal to each other.
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
//Creates a double array:
	private double data[];
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
	//Creates a Stat object:
	public Stat(double d[]) {
		double[] newArray = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		this.data = newArray;
	}
	//new code starts here:
	public Stat(float f[]) {
		double[] newArray = new double[f.length];
		for(int i = 0; i < f.length; i++) {
			newArray[i] = (double)(f[i]);
		}
		this.data = newArray;
	}
	public Stat(int i[]) {
		double[] newArray = new double[i.length];
		for(int j = 0; j < i.length; j++) {
			newArray[j] = (double)(i[j]);
		}
		this.data = newArray;
	}
	public Stat(long lo[]) {
		double[] newArray = new double[lo.length];
		for(int i = 0; i < lo.length; i++) {
			newArray[i] = (double)(lo[i]);
		}
		this.data = newArray;
	}
	
	
	//Retrieves values of data:
	public double[] getData() {
		double[] newArray = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}
	//Sets values of data array:
	public void setData(double[] d) {
		if(d != null) {
		double[] newArray = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		this.data = newArray;
		}
		else {
			double[] anArray = new double[0];
			this.data = anArray;
		}
		
		
	}
	
	public void setData(float f[]) {
		if(f != null) {
		double[] newArray = new double[f.length];
		for(int i = 0; i < f.length; i++) {
			newArray[i] = (double)f[i];
		}
		this.data = newArray;
	}
		else {
			double[] anArray = new double[0];
			this.data = anArray;
		}
	}
	
	public void setData(int i[]) {
		if(i != null) {
		double[] newArray = new double[i.length];
		for(int j = 0; j < i.length; j++) {
			newArray[j] = (double)i[j];
		}
		this.data = newArray;
	}
		else {
			double[] anArray = new double[0];
			this.data = anArray;
		}
	}
	public void setData(long lo[]) {
		if(lo != null) {
		double[] newArray = new double[lo.length];
		for(int i = 0; i < lo.length; i++) {
			newArray[i] = (double)lo[i];
		}
		this.data = newArray;
	}
		else {
			double[] anArray = new double[0];
			this.data = anArray;
		}
	}
	
	//Returns true if both Stat objects have the same values, otherwise returns false:
	public boolean equals(Stat s) {
		if (s != null) {
		double sdata[] = s.getData();
		if(data.length != sdata.length)
			return false;
		for(int i = 0; i < data.length; i++) {
			if(data[i] == sdata[i])
				return true;
		}
			return false;
			}
		else {
			return false;
		}
	}
	
	
	//Resets data:
	public void reset() {
		data = new double[0];
	}
	
	//Append:
	public void append(double d[]) {
		if (d != null) {
		int newLength = this.data.length + d.length;
		double result[] = new double[newLength];
		for(int i = 0; i < data.length; i++) {
			result[i] = this.data[i];
		}
		for(int i = this.data.length; i < newLength; i++) {
			result[i] = (double)d[i - this.data.length];
		}
		this.data = result;
		}
		}
	
	
	
	
	public void append(float f[]) {
		if (f != null) {
		int newLength = this.data.length + f.length;
		double result[] = new double[newLength];
		for(int i = 0; i < data.length; i++) {
			result[i] = this.data[i];
		}
		for(int i = this.data.length; i < newLength; i++) {
			result[i] = (double)f[i - this.data.length];
		}
		this.data = result;
		}
	}
	
	public void append(int i[]) {
		if (i != null) {
		int newLength = this.data.length + i.length;
		double result[] = new double[newLength];
		for(int j = 0; j < data.length; j++) {
			result[j] = this.data[j];
		}
		for(int j = this.data.length; j < newLength; j++) {
			result[j] = (double)i[j - this.data.length];
		}
		this.data = result;
	}
	}
	
	public void append(long lo[]) {
		if (lo != null) {
		int newLength = this.data.length + lo.length;
		double result[] = new double[newLength];
		for(int i = 0; i < data.length; i++) {
			result[i] = this.data[i];
		}
		for(int i = this.data.length; i < newLength; i++) {
			result[i] = (double)lo[i - this.data.length];
		}
		this.data = result;
		} 
	}
	
	//Returns whether or not a string is empty:
	public boolean isEmpty() {
		if(data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Returns a string representation of data in the Stat object:
	public String toString() {
		String arrayData = "";
		if(isEmpty() || data.equals(null)) {
			return "[]";
		}
			else {
				for(int i = 1; i < data.length; i++) {
					if(i == data.length - 1) 
						arrayData += data[i];
					else 
						arrayData += data[i] + ", ";
				}
		}
		return "[" + arrayData + "]";
}
	
	//Calculates the minimum value from a set of data:
	public double min() {
		if(data.length == 0) {
			return Double.NaN;
		}
		double min = data[data.length - 1];
		for(int i = data.length - 1; i > 0; i--) {
			if(min > data[i])
				min = data[i];
		}
		return min;
	}
	//Calculates the maximum values from a set of data:
	public double max() {
		if(data.length == 0) {
			return Double.NaN;
		}
		double max = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i] > max)
				max = data[i];
		}
		return max;
	}
	//Calculates the average value from a set of data:
	public double average() {
		if(data.length == 0) {
			return Double.NaN;
		}
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		return sum / (data.length-1);
	}
	
	//Calculates the mode from a set of data:
	public double mode() {
		if(data.length == 0) {
			return Double.NaN;
		}
		int modeCount = 0;
		double modeElement = this.data[0];
		for(int i=0; i<this.data.length; i++) {
			int numCount = 0;
			double num = data[i];
			for(int j=0; j<this.data.length; j++) {
				if(data[j] == data[i]) {
					numCount++;
				}
			}
			if(numCount>modeCount) {
				modeCount = numCount;
				modeElement = num;
			}
		}
		return modeElement;
	}
	
	//number of times:
	public int occursNumberOfTimes(double number) {
		
		int count = 0;
		for(int i = 0; i < this.data.length; i++) {
			if(this.data[i] == number) {
				count++;
			}
		}
		return count;
	}
	//variance:
	public double variance() {
		if(data.length == 0) {
			return Double.NaN;
		}
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		double average = sum / (data.length - 1);
		 double difference = 0;
		 for(int i = 1; i < data.length; i++) {
			 difference = difference + (data[i] - average)*(data[i] - average);
		 }
		 return difference / (data.length - 1);
		 
		 
	}
	
	//standard deviation:
	public double standardDeviation() {
		if(data.length == 0) {
			return Double.NaN;
		}
		double variance = variance();
		return Math.sqrt(variance);
	}

	
	public static void main(String[] args) {
		//The following are example main methods for testing:
		//Ex. 1 (works)
		/*
		double[] data1 = {};
		Stat stat1 = new Stat(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation());
		System.out.println("stat1 is empty = " + stat1.isEmpty());
		*/
		
		//Ex. 2 (works)
		/*
		double[] data1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Stat stat1 = new Stat(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation());
		System.out.println("stat1 is empty = " + stat1.isEmpty() + "\n");
		stat1.reset();
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation());
		System.out.println("stat1 is empty = " + stat1.isEmpty() + "\n");
		*/
		
		//Ex. 3 (works)
		
		float[] data1 = {10.0F,10.0F};
		Stat stat1 = new Stat(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
		
		long[] data2 = {80L, 60L};
		stat1.append(data2);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
		
		
		//Ex. 4 (works)
		/*
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		stat1.append(data);
		System.out.println("stat1 has been altered.");
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
		*/
		
		//Ex. 5 (works)
		/*
		double[] data1 = {50.0, 60.0};
		float[] data2 = {70.0F, 80.0F};
		int[] data3 = {90, 100};
		long[] data4 = {100L, 110L};
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data1);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data2);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data3);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data4);
		System.out.println("stat1 data = " + stat1.toString());
		data1 = null;
		stat1.setData(data1);
		System.out.println("stat1 data = " + stat1.toString());
		*/
		
		//Ex. 6 (works)
/*
		double[] data1 = {50.0, 60.0};
		float[] data2 = {70.0F, 80.0F};
		int[] data3 = {90, 100};
		long[] data4 = {100L, 110L};
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		stat1.append(data1);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.append(data2);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.append(data3);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.append(data4);
		System.out.println("stat1 data = " + stat1.toString());
		//stops working here
		data1 = null;
		stat1.append(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
	*/	
		
		//Ex. 7 (works)
		/*
		double[] data1 = {10,10};
		int[] data2 = {10,10};
		Stat stat1 = new Stat(data1);
		Stat stat2 = new Stat(data2);
		Stat stat3 = new Stat();
		Stat stat4 = null;
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("stat1 equals stat2 = " + stat1.equals(stat2));
		System.out.println("stat1 equals stat3 = " + stat1.equals(stat3));
		//stops working here
		System.out.println("stat1 equals stat4 = " + stat1.equals(stat4));
		*/
		
		//Ex. 8 (works)
		/*
		double[] data1 = {};
		double[] data2 = { 25 };
		float[] data3 = {};
		float[] data4 = { 25 };
		int[] data5 = {};
		int[] data6 = { 50 };
		long[] data7 = {};
		long[] data8 = { 12 };
		Stat stat1 = new Stat();
		stat1.append(data1);
		stat1.append(data2);
		stat1.append(data3);
		stat1.append(data4);
		stat1.append(data5);
		stat1.append(data6);
		stat1.append(data7);
		stat1.append(data8);
		data1 = null;
		stat1.append(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
		*/
	}
}


