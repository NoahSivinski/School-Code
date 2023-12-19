/*
 * Stat.java
 * Author:  Nataly Garcia 
 * Submission Date: April 15th 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? In the program, there are 
 * multiple methods the user can use to change the data set, 
 * compare the set to other set, find calculations
 * within the set, etc. Using constructors, modifiers, arrays, 
 * and different types of methods, actions can be taken
 * to receive output for a certain function.
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
		if (d == null) {
			data = new double[0];
		}
		else {
			data = new double[d.length];
			for (int x = 0; x < d.length; x++) {
				data[x] = d[x];
			}
		}
	}

	public Stat(float[] f) {
		if (f == null) {
			data = new double[0];
		}
		else {
			data = new double[f.length];
			for (int x = 0; x < f.length; x++) {
				data[x] = f[x];
			}
		}
	}

	public Stat(int[] i) {
		if (i == null) {
			data = new double[0];
		}
		else {
			data = new double[i.length];
			for (int x = 0; x < i.length; x++) {
				data[x] = i[x];
			}
		}
	}

	public Stat(long[] lo) {
		if (lo == null) {
			data = new double[0];
		}
		else {
			data = new double[lo.length];
			for (int x = 0; x < lo.length; x++) {
				data[x] = lo[x];
			}
		}
	}

	public void setData(float[] f) {
		if (f == null) {
			data = new double[0];
		}
		else {
			data = new double[f.length];
			for (int x =0; x < f.length; x++) {
				data[x] = f[x];
			}
		}
	}

	public void setData(double[] d) { 
		if (d == null) {
			data = new double[0];
		}
		else {
			data = new double[d.length];
			for (int x = 0; x < d.length; x++) {
				data[x] = d[x];
			}
		}
	}

	public void setData(int[] i) {
		if (i == null) {
			data = new double[0];
		}
		else {
			data = new double[i.length];
			for (int x = 0; x < i.length; x++) {
				data[x] = i[x];
			}
		}
	}

	public void setData(long[] lo) {
		if (lo == null) {
			data = new double[0];
		}
		else {
			data = new double[lo.length];
			for (int x = 0; x < lo.length; x++) {
				data[x] = lo[x];
			}
		}
	}

	public double[] getData(){ 
		double[] data2;
		if (data == null) {
			data2 = new double[0];
		}
		else {
			data2 = new double[data.length];
			for (int x = 0; x < data.length; x++) {
				data2[x] = data[x];
			}
		}
		return data2;
	}

	public boolean equals(Stat s) { 
		if (s == null) {
			return false;
		}
		else {
			double[] sData = s.getData();
			if (data.length == sData.length) {
				for (int x= 0; x < data.length; x++) {
					if (data[x] != sData[x]) {
						return false;
					}
				}
				return true;
			}
			else {
				return false;
			}
		}
	}

	public void reset() {
		data = new double[0];
	}

	public void append(int[] i) {
		if (i != null) {
			int numberOfDataElements = data.length;
			double[] iData = getData();
			data = new double[data.length + i.length];
			for (int y = 0; y < numberOfDataElements; y++) {
				data[y] = iData[y];
			}
			for (int z = 0; z < i.length; z++) {
				data[z + numberOfDataElements] = i[z];
			}
		}
	}

	public void append(float[] f) {
		if (f != null) {
			int numberOfDataElements = data.length;
			double[] fData = getData();
			data = new double[data.length + f.length];
			for (int y = 0; y < numberOfDataElements; y++) {
				data[y] = fData[y];
			}
			for (int z = 0; z < f.length; z++) {
				data[z + numberOfDataElements] = f[z];
			}
		}
	}

	public void append(long[] lo) {
		if (lo != null) {
			int numberOfDataElements = data.length;
			double[] loData = getData();
			data = new double[data.length + lo.length];
			for (int y = 0; y < numberOfDataElements; y++) {
				data[y] = loData[y];
			}
			for (int z = 0; z < lo.length; z++) {
				data[z + numberOfDataElements] = lo[z];
			}
		}
	}

	public void append(double[] d) {
		if (d != null) {
			int numberOfDataElements = data.length;
			double[] dData = getData();
			data = new double[data.length + d.length];
			for (int y = 0; y < numberOfDataElements; y++) {
				data[y] = dData[y];
			}
			for (int z = 0; z < d.length; z++) {
				data[z + numberOfDataElements] = d[z];
			}
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

	public String toString() { 
		String myString = "[";
		for (int x = 0; x < data.length; x++) {
			myString += data[x] + ", ";
		}
		if (data.length == 0) {
			myString = "[]";
		}
		else {
			myString = myString.substring(0, myString.length() - 2) + "]";
		}
		return myString;
	}

	public double min() { 
		if (data.length == 0) {
			return Double.NaN;
		}
		double min = data[0];
		for (int x = 0; x < data.length; x++) {
			if (data[x] < min) {
				min = data[x];
			}
		}
		return min;
	}

	public double max() { 
		if (data.length == 0) {
			return Double.NaN;
		}
		double max = data[0];
		for (int x = 0; x < data.length; x++) {
			if (data[x] > max) {
				max = data[x];
			}
		}
		return max;
	}

	public double average() { 
		if (data.length == 0) {
			return Double.NaN;
		}
		double sumOfData = 0;
		for (int x = 0; x < data.length; x++) {
			sumOfData += data[x];
		}
		double average = sumOfData / (data.length);
		return average;
	}

	public double mode() { 
		if (data.length == 0) {
			return Double.NaN;
		}
		double count = 0;
		double value = 0;
		for (int x = 0; x < data.length; x++) {
			int currentCount = occursNumberOfTimes(data[x]);
			if (currentCount > count) {
				value = data[x];
				count = currentCount;
			}
		}
		for (int x = 0; x < data.length; x++) {
			int currentCount = occursNumberOfTimes(data[x]);
			if ((currentCount == count) && (value != data[x])) {
				return Double.NaN;
			}
		}
		return value;
	}

	private int occursNumberOfTimes(double value){
		int currentCount = 0;
		for (int x = 0; x < data.length; x++) {
			if (value == data[x]) {
				currentCount += 1;
			}
		}
		return currentCount;
	}

	public double variance() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double[] data2 = getData();
		double average = average();
		for (int y = 0; y < data2.length; y++) {
			data2[y] = Math.pow((data2[y] - average), 2);
		}
		double sumOfDataSquared = 0;
		for (int z = 0; z < data2.length; z++) {
			sumOfDataSquared += data2[z];
		}
		double variance = sumOfDataSquared / (data2.length);
		return variance;
	}

	public double standardDeviation() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double variance = variance();
		double standardDeviation = Math.sqrt(variance);
		return standardDeviation;
	}
}
