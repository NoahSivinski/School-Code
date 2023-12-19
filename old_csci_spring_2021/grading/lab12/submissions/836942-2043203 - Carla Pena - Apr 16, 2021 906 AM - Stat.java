/*
 * Stat.java
 * Author:  Carla Pena
 * Submission Date:  16 April 2021
 *
 * Purpose: The purpose of this lab was to
 * create an understanding on how to use 
 * various methods to create a result. It
 * also consisted of being able to write code
 * to be transformed into doubles.
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

	private double[] data;
	
	public Stat() {
		this.data = new double[1];
		this.data[0] = 0.0;
	}
	
	public Stat(double[] d) {
		if (d.length > 0) {
			this.data = d;
		}
		else {
			this.data = new double[1];
			this.data[0] = 0.0;
		}
	}
	
	public Stat(float[] f) {
		if (f.length > 0) {
			this.data = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				this.data[i] = (double)f[i];
			}
		}
		else {
			this.data = new double[1];
			this.data[0] = 0.0;
		}
	}
	
	public Stat(int[] i) {
		if (i.length > 0) {
			this.data = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				this.data[j] = (double)i[j];
			}
		}
		else {
			this.data = new double[1];
			this.data[0] = 0.0;
		}
	}
	
	public Stat(long[] lo) {
		if (lo.length > 0) {
			this.data = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				this.data[i] = (double)lo[i];
			}
		}
		else {
			this.data = new double[1];
			this.data[0] = 0.0;
		}
	}
	
	public void setData(float[] f) {
		if (f.length > 0) {
			this.data = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				this.data[i] = (double)f[i];
			}
		}
		else {
			this.data = new double[0];
		}
	}
	
	public void setData(double[] d) {
		if (d.length > 0) {
			this.data = d;
		}
		else {
			data = new double[0];
		}
	}
	
	public void setData(int[] i) {
		if (i.length > 0) {
			data = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				this.data[j] = (double)i[j];
			}
		}
		else {
			data = new double[0];
		}
	}
	
	public void setData(long[] lo) {
		if (lo.length > 0) {
			this.data = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				this.data[i] = (double)lo[i];
			}
		}
		else {
			this.data = new double[0];
		}
	}
	
	public double[] getData() {
		return this.data;
	}
	
	public boolean equals(Stat s) {
		boolean areTheyEqual = true;
		
		if (this.data.length == s.getData().length) {
			double[] sArray = s.getData();
			
			int i = 0;
			while (i < data.length) {
				if (data[i] == sArray[i]) {
					areTheyEqual = true;
					i++;
				}
				else {
					areTheyEqual = false;
					break;
				}
			}
		}
			
		return areTheyEqual;
	}
	
	public void reset() {
		this.data = new double[0];
	}
	
	public void append(int[] i) {
		if (i.length > 0) {
			double[] tempArray = new double[data.length + i.length];
			for (int j = 0; j < data.length; j++) {
				tempArray[j] = data[j];
			}
			for (int j = 0; j < i.length; j++) {
				tempArray[data.length + j] = (double)i[j];
			}
			this.data = tempArray;
		}
	}
	
	public void append(float[] f) {
		if (f.length > 0) {
			double[] tempArray = new double[data.length + f.length];
			for (int i = 0; i < data.length; i++) {
				tempArray[i] = data[i];
			}
			for (int i = 0; i < f.length; i++) {
				tempArray[data.length + i] = (double)f[i];
			}
			this.data = tempArray;
		}
	}
	
	public void append(long[] lo) {
		if (lo.length > 0) {
			double[] tempArray = new double[data.length + lo.length];
			for (int i = 0; i < data.length; i++) {
				tempArray[i] = data[i];
			}
			for (int i = 0; i < lo.length; i++) {
				tempArray[data.length + i] = (double)lo[i];
			}
			this.data = tempArray;
		}
	}
	
	public void append(double[] d) {
		if (d.length > 0) {
			double[] tempArray = new double[data.length + d.length];
			for (int i = 0; i < data.length; i++) {
				tempArray[i] = data[i];
			}
			for (int i = 0; i < d.length; i++) {
				tempArray[data.length + i] = d[i];
			}
			this.data = tempArray;
		}
	}
	
	public boolean isEmpty() {
		if (this.data.length > 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String toString() {
		String doubleArray = "[";
		
		for(int i = 0; i < data.length; i++) {
			doubleArray += data[i];
			if (i != (data.length - 1)) {
				doubleArray += ", ";
			}
		}
		
		doubleArray += "]";
		return doubleArray;
	}
	
	public double min() {
		if (this.data.length > 0) {
			double minNumber = data[0];
			int i = 0;
			
			while (i < data.length) {
				if (minNumber > data[i]) {
					minNumber = data[i];
					i = 0;
				}
				else {
					i++;
				}
			}
			return minNumber;
		}
		else {
			return Double.NaN;
		}
	}
	
	public double max() {
		if (this.data.length > 0) {
			double maxNumber = data[0];
			int i = 0;
			
			while (i < data.length) {
				if (maxNumber < data[i]) {
					maxNumber = data[i];
					i = 0;
				}
				else {
					i++;
				}
			}
			return maxNumber;
		}
		else {
			return Double.NaN;
		}
	}
	
	public double average() {
		if (this.data.length > 0) {
			double avgArray = 0;
			
			for(int i = 0; i < data.length; i++) {
				avgArray += data[i];
			}
			
			return avgArray / data.length;
		}
		else {
			return Double.NaN;
		}
	}
	
	public double mode() {
		double most = 0.0;
		int doubleCount = 0;
		
		for (int i = 0; i < data.length; i++) {
			int currentDoubleCount = 0;
			for (int j = 0; j < data.length; j++) {
				if (data[i] == data[j]) {
					currentDoubleCount++;
				}
			}
			if (currentDoubleCount > doubleCount) {
				most = data[i];
				doubleCount = currentDoubleCount;
			}
			else if (currentDoubleCount == doubleCount) {
				most = Double.NaN;
				doubleCount = 0;
			}
		}
		
		if (doubleCount > 1) {
			return most;
		}
		else {
			return Double.NaN;
		}
	}
	
	private int occursNumberOfTimes(double value) {
		int doubleCount = 0;
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				doubleCount++;
			}
		}
		return doubleCount;
	}
	
	public double variance() {
		if (this.data.length > 0) {
			double variance = 0.0;
			for (int i = 0; i < data.length; i++) {
				double temp = average() - data[i];
				variance += (temp * temp);
			}
			return variance;
		}
		else {
			return Double.NaN;
		}
	}
	
	public double standardDeviation() {
		if (this.data.length > 0) {
			return Math.sqrt(variance());
		}
		else {
			return Double.NaN;
		}
	}

}
