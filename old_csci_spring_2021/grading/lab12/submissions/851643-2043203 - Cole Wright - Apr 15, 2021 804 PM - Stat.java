/*
 *Stat.java 
 *
 * Author: Cole Wright 
 * Submission Date: 4/15/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This code uses arrays to store data and do many things with it. Such as mode, comparing multiple data points, and finding the max in the data point. It uses a UML diagram to visually represent many classes within the data double.
 * The program uses doubles to store each method and their instructions. The code tests the programmer's ability to utilize public and private doubles, strings, arrays, and multiple method types. It builds off of the last code
 * we did and includes nulls as a possible data value. The programmer must account for this as well as many other new methods that have been added.
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
			data = null;
		}
		double[] newArray = new double[d.length];
		for (int x = 0; x < d.length; x++) {
			newArray[x] = d[x];
		}
		data = newArray;
	}

	public Stat(float[] f) {
		if (f == null) {
			data = null;
		} else {
			data = new double[f.length];
			for (int x = 0; x < f.length; x++) {
				data[x] = f[x];
			}

		}
	}

	public Stat(int[] i) {
		if (i == null) {
			data = null;
		} else {
			data = new double[i.length];
			for (int x = 0; x < i.length; x++) {
				data[x] = i[x];
			}
		}
	}

	public Stat(long[] lo) {
		if (lo == null) {
			data = null;
		} else {
			data = new double[lo.length];
			for (int x = 0; x < lo.length; x++) {
				data[x] = lo[x];
			}
		}
	}

	public void setData(float[] f) {
		if (f == null) {
			data = null;
		} else {
			data = new double[f.length];
			for (int x = 0; x < f.length; x++) {
				data[x] = f[x];
			}
		}
	}

	public void setData(double[] d) {
		if (d == null) {
			data = null;
		} else {
			double[] newArray = new double[d.length];
			for (int x = 0; x < d.length; x++) {
				newArray[x] = d[x];
			}
			data = newArray;
		}
	}

	public void setData(int[] i) {
		if (i == null) {
			data = null;
		} else {
			for (int x = 0; x < i.length; x++) {
				data[x] = i[x];
			}
		}
	}

	public void setData(long[] lo) {
		if (lo == null) {
			data = null;
		} else {
			for (int x = 0; x < lo.length; x++) {
				data[x] = lo[x];
			}
		}
	}

	public double[] getData() {
		double[] newArray = new double[data.length];
		for (int x = 0; x < data.length; x++) {
			newArray[x] = data[x];
		}
		return newArray;
	}

	public boolean equals(Stat s) {
		if (s != null) {
			double sdata[] = s.getData();
			if (data.length != sdata.length)
				return false;
			for (int x = 0; x < data.length; x++) {
				if (data[x] != sdata[x])
					return false;
			}
			return true;
		} else
			return false;
	}

	public void reset() {
		double newArray[] = new double[0];
		data = newArray;
	}

	public void appened(int[] i) {

		if (i != null) {

			double newArray[] = new double[data.length + i.length];
			for (int x = 0; x < data.length; x++) {
				newArray[x] = data[x];
			}
			for (int x = 0; x < i.length; x++) {
				newArray[data.length + x] = i[x];
			}
			data = newArray;
		}
	}

	public void append(int[] f) {
		if (f != null) {

			double newArray[] = new double[data.length + f.length];
			for (int x = 0; x < data.length; x++) {
				newArray[x] = data[x];
			}
			for (int x = 0; x < f.length; x++) {

				newArray[data.length + x] = f[x];
			}
			data = newArray;
		}
	}

	public void append(float[] f) {
		if (f != null) {

			double newArray[] = new double[data.length + f.length];
			for (int x = 0; x < data.length; x++) {
				newArray[x] = data[x];
			}
			for (int x = 0; x < f.length; x++) {

				newArray[data.length + x] = f[x];
			}
			data = newArray;
		}
	}

	public void append(long[] lo) {
		if (lo != null) {

			double newArray[] = new double[data.length + lo.length];
			for (int x = 0; x < data.length; x++) {
				newArray[x] = data[x];
			}
			for (int x = 0; x < lo.length; x++) {

				newArray[data.length + x] = lo[x];
			}
			data = newArray;
		}
	}

	public void append(double[] d) {

		if (d != null) {

			if (data != null) {
				double newArray[] = new double[data.length + d.length];

				for (int x = 0; x < data.length; x++) {
					newArray[x] = data[x];
				}
				for (int x = 0; x < d.length; x++) {

					newArray[data.length + x] = d[x];
				}
				data = newArray;
			}
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
		if (data != null) {
			if (isEmpty())
				return "[]";

			String arrayData = "";
			for (int x = 0; x < data.length; x++) {
				if (x == data.length - 1)
					arrayData += data[x];
				else
					arrayData += data[x] + ", ";
			}
			return "[" + arrayData + "]";
		} else {
			return "[]";
		}

	}

	public double min() {
		if (data != null) {
			if (isEmpty()) {
				return Double.NaN;
			}
			double min = data[0];
			for (int x = 1; x < data.length; x++) {
				if (data[x] < min)
					min = data[x];

			}
			return min;

		} else {
			return Double.NaN;
		}
	}

	public double max() {
		if (isEmpty()) {
			return Double.NaN;
		}
		double max = data[0];
		for (int x = 1; x < data.length; x++) {
			if (data[x] > max)
				max = data[x];

		}
		return max;

	}

	public double average() {
		if (isEmpty()) {
			return Double.NaN;
		}
		double avg = 0.0;
		for (int x = 0; x < data.length; x++) {

			avg += data[x];
		}
		return avg / data.length;
	}

	public double mode() {
		if (isEmpty()) {
			return Double.NaN;
		}
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
			}
		}
		if (highNumberCount > 1)
			return maxNumber;
		else {
			return Double.NaN;
		}
	}

	public double variance() {
		if (isEmpty()) {
			return Double.NaN;
		} else {
			double avg = average();
			double sum = 0;
			for (int x = 0; x < data.length; x++) {
				sum = sum + (data[x] - avg) * (data[x] - avg);

			}
			return sum / data.length;
		}
	}

	public double standardDeviation() {
		if (isEmpty()) {
			return Double.NaN;
		} else {
			return Math.sqrt(variance());
		}
	}

	public static void main(String[] args) {

	}

}