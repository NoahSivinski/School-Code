/*
 * Stat.java
 * Author:  Vietmy Vo
 * Submission Date:  04/15/2021
 *
 * Purpose: The purpose of this program is to use the class to find things such as minimum, maximum, average, mode, variance, and 
 * standard deviation. The program can do this by using the different methods that take values from the array.
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

	double[] data;

	public Stat() {
		data = new double[0];

	}

	public Stat(double[] d) {
		if (d == null)
			data = null;
		double[] newArray = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}

	public Stat(float[] f) {
		if (f == null)
			data = null;
		double[] newArray = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			newArray[i] = f[i];
		}
		data = newArray;
	}

	public Stat(int[] i) {
		if (i == null)
			data = null;
		double[] newArray = new double[i.length];
		for (int j = 0; j < i.length; j++) {
			newArray[j] = i[j];
		}
		data = newArray;
	}

	public Stat(long[] lo) {
		if (lo == null)
			data = null;
		double[] newArray = new double[lo.length];
		for (int i = 0; i < lo.length; i++) {
			newArray[i] = lo[i];
		}
		data = newArray;
	}

	public void setData(float[] f) {
		if (f == null)
			data = null;
		else {
			double[] newArray = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
			data = newArray;
		}
	}

	public void setData(double[] d) {
		if (d == null)
			data = null;
		else {
			double[] newArray = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}
			data = newArray;
		}
	}

	public void setData(int[] i) {
		if (i == null)
			data = null;
		else {
			double[] newArray = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				newArray[j] = i[j];
			}
			data = newArray;
		}
	}

	public void setData(long[] lo) {
		if (lo == null)
			data = null;
		else {
			double[] newArray = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				newArray[i] = lo[i];
			}
			data = newArray;
		}
	}

	public double[] getData() {
		double[] newArray = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}

	public boolean equals(Stat s) {
		if (s == null)
			return false;

		if (s.data.length != data.length)
			return false;
		for (int i = 0; i < data.length; i++)
			if (s.data[i] != data[i])
				return false;
		return true;
	}

	public void reset() {
		double[] newArray = new double[0];
		data = newArray;
	}

	public void append(int[] i) {
		if (i == null)
			return;
		double[] newArray = new double[data.length + i.length];
		for (int j = 0; j < data.length; j++) {
			newArray[j] = data[j];
		}
		for (int j = 0; j < i.length; j++) {
			newArray[data.length + j] = i[j];
		}
		data = newArray;
	}

	public void append(float[] f) {
		if (f == null)
			return;
		double[] newArray = new double[data.length + f.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		for (int i = 0; i < f.length; i++) {
			newArray[data.length + i] = f[i];
		}
		data = newArray;
	}

	public void append(long[] lo) {
		if (lo == null)
			return;
		double[] newArray = new double[data.length + lo.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		for (int i = 0; i < lo.length; i++) {
			newArray[data.length + i] = lo[i];
		}
		data = newArray;
	}

	public void append(double[] d) {
		if (d == null)
			return;
		double[] newArray = new double[data.length + d.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		for (int i = 0; i < d.length; i++) {
			newArray[data.length + i] = d[i];
		}
		data = newArray;
	}

	public boolean isEmpty() {
		if (data.length == 0)
			return true;
		return false;
	}

	public String toString() {

		if (data == null)
			return "[]";
		String dataArray = "";

		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1)
				dataArray = dataArray + data[i];
			else
				dataArray = dataArray + data[i] + ", ";
		}

		return "[" + dataArray + "]";

	}

	public double min() {

		if (isEmpty())
			return Double.NaN;
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}

	public double max() {
		if (isEmpty())
			return Double.NaN;
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}

	public double average() {
		if (isEmpty())
			return Double.NaN;
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = data[i] + sum;
		}
		double mean = sum / data.length;
		return mean;
	}

	public double mode() {
		if (isEmpty())
			return Double.NaN;
		double[] frequency = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i] == data[j]) {
					frequency[i]++;
				}
			}
		}
		double maxNumber = 0;
		double mode = data[0];
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > maxNumber) {
				maxNumber = frequency[i];
				mode = data[i];
			}
		}
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] == maxNumber) {
				if (mode != data[i]) {
					return Double.NaN;
				}
			}
		}
		return mode;
	}

	public int occursNumberOfTimes(double value) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				count++;
			}
		}
		return count;
	}

	public double variance() {
		if (isEmpty())
			return Double.NaN;
		double average = average();
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + (data[i] - average) * (data[i] - average);
		}
		return sum / data.length;
	}

	public double standardDeviation() {
		if (isEmpty())
			return Double.NaN;
		return Math.sqrt(variance());

	}

}
