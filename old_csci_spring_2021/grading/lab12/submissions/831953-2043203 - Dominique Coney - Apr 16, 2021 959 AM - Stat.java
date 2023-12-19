/*
 * Stat.java
 * Author:  Dominique Coney
 * Submission Date:  4/16/2021
 *
 * Purpose: The purpose of this code is to use arrays to store different data of the Stat class. The UML diagram is also utilized as somewhat of a skeleton for the structure of the program. It is an addition to the previous lab with new and altered methods.
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
		} else {
			double[] newArray = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}
			data = newArray;
		}
	}

	public Stat(float[] f) {
		if (f == null) {
			data = new double[0];
		} else {

			double[] newArray = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
			data = newArray;
		}
	}

	public Stat(int[] i) {
		if (i == null) {
			data = new double[0];
		} else {

			double[] newArray = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				newArray[j] = i[j];
			}
			data = newArray;
		}
	}

	public Stat(long[] lo) {
		if (lo == null) {
			data = new double[0];
		} else {

			double[] newArray = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				newArray[i] = lo[i];
			}
			data = newArray;
		}
	}

	public void setData(float[] f) {
		if (f == null) {
			data = new double[0];
		} else {
			double[] newArray = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
			data = newArray;
		}
	}

	public void setData(double[] d) {
		if (d == null) {
			data = new double[0];
		} else {
			double[] newArray = new double[d.length];
			for (int j = 0; j < d.length; j++) {
				newArray[j] = d[j];
			}
			data = newArray;
		}
	}

	public void setData(int[] i) {
		if (i == null) {
			data = new double[0];
		} else {
			double[] newArray = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				newArray[j] = i[j];
			}
			data = newArray;
		}
	}

	public void setData(long[] lo) {
		if (lo == null) {
			data = new double[0];
		} else {
			double[] newArray = new double[lo.length];
			for (int j = 0; j < lo.length; j++) {
				newArray[j] = lo[j];
			}
			data = newArray;
		}
	}

	public double[] getData() {
		double[] newArray2 = new double[data.length];
		for (int j = 0; j < data.length; j++) {
			newArray2[j] = data[j];
		}
		return newArray2;
	}

	public boolean equals(Stat s) {
		if (s == null) {
			return false;
		}
		if (data.length == s.getData().length) {
			for (int j = 0; j < s.getData().length; j++) {
				if (s.getData()[j] != data[j]) {

					return false;
				}
			}
		} else {
			return false;
		}
		return true;

	}

	public void reset() {
		double[] newArray3 = new double[0];
		data = newArray3;
	}

	public void append(int[] i) {
		if (i != null) {
			double[] totalLength = new double[data.length + i.length];
			for (int j = 0; j < data.length; j++) {
				totalLength[j] = data[j];
			}
			for (int j = 0; j < i.length; j++) {
				totalLength[data.length + j] = i[j];
			}
			for (int k = 0; k < totalLength.length; k++) {
			}
			data = totalLength;
		} else {
			return;
		}
	}

	public void append(float[] f) {
		if (f != null) {
			double[] totalLength = new double[data.length + f.length];
			for (int j = 0; j < data.length; j++) {
				totalLength[j] = data[j];
			}
			for (int j = 0; j < f.length; j++) {
				totalLength[data.length + j] = f[j];
			}
			for (int i = 0; i < totalLength.length; i++) {
			}
			data = totalLength;
		} else {
			return;
		}
	}

	public void append(long[] lo) {
		if (lo != null) {
			double[] totalLength = new double[data.length + lo.length];
			for (int j = 0; j < data.length; j++) {
				totalLength[j] = data[j];
			}
			for (int j = 0; j < lo.length; j++) {
				totalLength[data.length + j] = lo[j];
			}
			for (int i = 0; i < totalLength.length; i++) {
			}
			data = totalLength;
		} else {
			return;
		}
	}

	public void append(double[] d) {
		if (d != null) {
			double[] totalLength = new double[data.length + d.length];
			for (int j = 0; j < data.length; j++) {
				totalLength[j] = data[j];
			}
			for (int j = 0; j < d.length; j++) {
				totalLength[data.length + j] = d[j];
			}
			for (int i = 0; i < totalLength.length; i++) {
			}
			data = totalLength;
		} else {
			return;
		}
	}

	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String dataElements = "";
		for (int j = 0; j < data.length; j++) {
			if (j == data.length - 1)
				dataElements += data[j];
			else
				dataElements += data[j] + ",";
		}
		return "[" + dataElements + "]";
	}

	public double min() {
		if (isEmpty()) {
			return Double.NaN;
		} else {
			double min = data[0];
			for (int j = 1; j < data.length; j++) {
				if (data[j] < min)
					min = data[j];
			}
			return min;
		}
	}

	public double max() {
		if (isEmpty()) {
			return Double.NaN;
		} else {
			double max = data[0];
			for (int j = 1; j < data.length; j++) {
				if (data[j] > max)
					max = data[j];
			}
			return max;
		}
	}

	public double average() {
		if (isEmpty()) {
			return Double.NaN;
		} else {
			double sum = 0.0;
			for (int j = 0; j < data.length; j++) {
				sum += data[j];
			}
			return (sum / data.length);
		}
	}

	public double mode() {
		if (isEmpty()) {
			return Double.NaN;
		} else {
			double maxNum = 0.0;
			int maxCount = 0;
			for (int j = 0; j < data.length; j++) {
				int numCount = 0;
				for (int i = 0; i < data.length; i++) {
					if (data[j] == data[i])
						numCount++;
				}
				if (numCount > maxCount) {
					maxCount = numCount;
					maxNum = data[j];
				}
			}
			if (maxCount > 1) {
				return maxNum;
			} else {
				return Double.NaN;
			}
		}
	}

	public int occursNumberOfTimes(double value) {
		int count = 0;
		for (int j = 0; j < data.length; j++) {
			if (data[j] == value)
				count++;
		}
		return count;
	}

	public double variance() {
		if (isEmpty()) {
			return Double.NaN;
		} else {
			double sum = 0;
			double average = average();
			for (int j = 0; j < data.length; j++) {
				sum = ((data[j] - average) * (data[j] - average)) + sum;
			}
			return (sum / data.length);
		}
	}

	public double standardDeviation() {
		if (isEmpty()) {
			return Double.NaN;
		} else {
			return Math.sqrt(variance());
		}
	}

}