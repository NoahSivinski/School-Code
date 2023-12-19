/*
 * Stat.java (modified)
 * Author:  Anna Kerber
 * Submission Date:  4/15/21
 *
 * Purpose: The purpose of this program is to create methods that can
 * initialize an array, access and mutate the array, and perform 
 * mathematical operations on the array. This time the program includes
 * cases for null parameters.
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
		data = new double[0];
	}

	public Stat(double[] d) {
		if (d != null) {
			data = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				data[i] = d[i];
			}
		} else {
			data = new double[0];
		}
	}

	public Stat(float[] f) {
		if (f == null) {
			data = null;
		} else {
			data = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				data[i] = f[i];
			}
		}
	}

	public Stat(int[] i) {
		if (i == null) {
			data = null;
		} else {
			data = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				data[j] = i[j];
			}
		}
	}

	public Stat(long[] lo) {
		if (lo == null) {
			data = null;
		} else {
			data = new double[lo.length];
			for (int j = 0; j < lo.length; j++) {
				data[j] = lo[j];
			}
		}
	}

	public void setData(float[] f) {
		if (f == null) {
			data = null;
		} else {
			double[] newData = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				newData[i] = f[i];
			}
			data = newData;
		}
	}

	public void setData(double[] d) {
		if (d == null) {
			data = null;
		} else {
			double[] newData = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				newData[i] = d[i];
			}
			data = newData;
		}
	}

	public void setData(int[] i) {
		if (i == null) {
			data = null;
		} else {
			double[] newData = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				newData[j] = i[j];
			}
			data = newData;
		}
	}

	public void setData(long[] lo) {
		if (lo == null) {
			data = null;
		} else {
			double[] newData = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				newData[i] = lo[i];
			}
			data = newData;
		}
	}

	public double[] getData() {
		if (data != null) {
			double[] newData = new double[data.length];
			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
			}
			return newData;
		}
		return null;
	}

	public boolean equals(Stat s) {
		if (s == null || s.getData() == null) {
			return false;
		}
		if (this.getData().length != s.getData().length) {
			return false;
		}
		for (int i = 0; i < s.getData().length; i++) {
			if (s.getData()[i] != this.getData()[i]) {
			}
		}
		return true;
	}

	public void reset() {
		data = new double[0];
	}

	public void append(int[] i) {
		if (i != null) {
			double[] newData = new double[data.length + i.length];
			for (int j = 0; j < data.length; j++) {
				newData[j] = data[j];
			}
			int k = 0;
			for (int j = data.length; j < newData.length; j++) {
				newData[j] = i[k];
				k++;
			}
			data = newData;
		}
	}

	public void append(float[] f) {
		if (f != null) {
			double[] newData = new double[data.length + f.length];
			for (int j = 0; j < data.length; j++) {
				newData[j] = data[j];
			}
			int i = 0;
			for (int j = data.length; j < newData.length; j++) {
				newData[j] = f[i];
				i++;
			}
			data = newData;
		}
	}

	public void append(long[] lo) {
		if (lo != null) {
			double[] newData = new double[data.length + lo.length];
			for (int j = 0; j < data.length; j++) {
				newData[j] = data[j];
			}
			int i = 0;
			for (int j = data.length; j < newData.length; j++) {
				newData[j] = lo[i];
				i++;
			}
			data = newData;
		}
	}

	public void append(double[] d) {
		if (d != null) {
			double[] newData = new double[data.length + d.length];
			for (int j = 0; j < data.length; j++) {
				newData[j] = data[j];
			}
			int i = 0;
			for (int j = data.length; j < newData.length; j++) {
				newData[j] = d[i];
				i++;
			}
			data = newData;
		}
	}

	public boolean isEmpty() {
		return (data.length == 0);
	}

	public String toString() {
		if (data != null && data.length != 0) {
			String print = "[";
			for (int i = 0; i < data.length; i++) {
				print += data[i] + ", ";
			}
			return print.substring(0, print.length() - 2) + "]";
		}
		return "[]";
	}

	public double min() {
		if (data.length != 0) {
			double min = data[0];
			for (int i = 1; i < data.length; i++) {
				if (data[i] < min) {
					min = data[i];
				}
			}
			return min;
		}
		return Double.NaN;
	}

	public double max() {
		if (data.length != 0) {
			double max = data[0];
			for (int i = 1; i < data.length; i++) {
				if (data[i] > max) {
					max = data[i];
				}
			}
			return max;
		}
		return Double.NaN;
	}

	public double average() {
		if (data.length != 0) {
			int count = 0;
			double sum = 0;
			for (int i = 0; i < data.length; i++) {
				count++;
				sum += data[i];
			}
			return sum / count;
		}
		return Double.NaN;
	}

	public double mode() {
		if (data.length != 0) {
			double maxValue = -1;
			int maxCount = 0, count = 0, uniqueCount = 0;
			double[] total = new double[data.length];
			double threshold = 0.000000001;

			for (int i = 0; i < data.length; i++) {
				count = 0;
				for (int j = 0; j < data.length; j++) {
					if (Math.abs(data[j] - data[i]) < threshold) {
						count++;
					}
				}

				if (count >= maxCount) {
					maxValue = data[i];
					maxCount = count;
					total[i] = count;
				}
			}

			for (int i = 0; i < total.length; i++) {
				if (Math.abs(maxCount - total[i]) == 0) {
					uniqueCount++;
				}
			}

			if (uniqueCount > maxCount) {
				return Double.NaN;
			}

			return maxValue;
		}
		return Double.NaN;
	}

	private int occursNumberOfTimes(double value) {
		double threshold = 0.000000001;
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (Math.abs(value - data[i]) < threshold) {
				count++;
			}
		}
		return count;
	}

	public double variance() {
		if (data.length!=0) {	
			double distanceSquared = 0;
			double mean = this.average();
			for (int i = 0; i < data.length; i++) {
				distanceSquared += Math.pow(data[i] - mean, 2);
			}
			return distanceSquared / data.length;
		}
		return Double.NaN;
	}

	public double standardDeviation() {
		if (data.length != 0) {
			return Math.pow(this.variance(), 0.5);
		}
		return Double.NaN;
	}

}
