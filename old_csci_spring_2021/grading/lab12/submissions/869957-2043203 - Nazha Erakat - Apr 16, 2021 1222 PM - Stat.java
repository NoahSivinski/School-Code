/*
 * Stat.java
 * Author:  Nazha Erakat
 * Submission Date:  4/16/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? this program takes a class and creates two arrays and will find the min, max, mode, average, variance, and the standard deviation of values inputted by the user.
 * It also takes into account null arrays and empty arrays. 
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
	final double THRESHOLD = 0.000000001;

	public Stat() {
		data = new double[0];
	}

	public Stat(double[] d) {

		data = new double[d.length]; // I changed the letter i to z for all of the loops so I don't get mixed up with
										// the int i array
		for (int z = 0; z < data.length; z++) {
			data[z] = d[z];
		}
	}

	public Stat(float[] f) {
		setData(f);
	}

	public Stat(int[] i) {
		setData(i);
	}

	public Stat(long[] lo) {
		setData(lo);
	}

	public void setData(float[] f) {
		double[] newArray = new double[0];

		if (f != null) {
			newArray = new double[f.length];
			data = newArray;
			for (int z = 0; z < f.length; z++) {
				newArray[z] = f[z];
			}

		} else if (f == null || isEmpty()) {
			newArray = new double[0];
		}
		data = newArray;
	}

	public void setData(double[] d) {
		double[] newArray = new double[0];
		if (d != null) {
			newArray = new double[d.length];
			data = newArray;
			for (int z = 0; z < d.length; z++) {
				newArray[z] = d[z];
			}
		} else if (d == null || isEmpty()) {
			newArray = new double[0];
		}
		data = newArray;
	}

	public void setData(int[] i) {
		double[] newArray = new double[0];

		if (i != null) {
			newArray = new double[i.length];
			data = newArray;
			for (int z = 0; z < i.length; z++) {
				newArray[z] = i[z];
			}
		} else if (i == null || isEmpty()) {
			newArray = new double[0];
		}
		data = newArray;
	}

	public void setData(long[] lo) {
		double[] newArray = new double[0];

		if (lo != null) {
			newArray = new double[lo.length];
			data = newArray;
			for (int z = 0; z < lo.length; z++) {
				newArray[z] = lo[z];
			}
		} else if (lo == null || isEmpty()) {
			newArray = new double[0];
		}
		data = newArray;
	}

	public double[] getData() {

		double newArray[] = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}

	public boolean equals(Stat s) {
		boolean equals = false;
		if (s != null && ((data.length - s.data.length) < THRESHOLD)) {
			for (int z = 0; z < s.data.length; z++) {
				if (data[z] - s.data[z] < THRESHOLD) {
					equals = true;
				}
			}
		} else if (s == null || isEmpty()) {
			equals = false;
		}
		return equals;
	}

	public void reset() {
		data = new double[0];
	}

	public void append(int[] i) {
		if (i != null) {
			double[] newArray = new double[data.length + i.length];

			for (int z = 0; z < newArray.length; z++) { // changed the variable to z instead of j
				if (z < data.length)
					newArray[z] = data[z];
				else
					newArray[z] = i[z - data.length];
			}

			data = newArray;
		}
	}

	public void append(float[] f) {
		if (f != null) {
			double[] newArray = new double[data.length + f.length];

			for (int z = 0; z < newArray.length; z++) {
				if (z < data.length)
					newArray[z] = data[z];
				else
					newArray[z] = f[z - data.length];
			}
			data = newArray;
		}
	}

	public void append(long[] lo) {
		if (lo != null) {
			double[] newArray = new double[data.length + lo.length];

			for (int z = 0; z < newArray.length; z++) {
				if (z < data.length)
					newArray[z] = data[z];
				else
					newArray[z] = lo[z - data.length];
			}
			data = newArray;
		}
	}

	public void append(double[] d) {
		if (d != null) {
			double[] newArray = new double[data.length + d.length];

			for (int z = 0; z < newArray.length; z++) {
				if (z < data.length)
					newArray[z] = data[z];
				else
					newArray[z] = d[z - data.length];
			}
			data = newArray;
		}
	}

	public boolean isEmpty() {
		final double THRESHOLD = 0.000000001;
		boolean empty = false;
		if (data.length < THRESHOLD) {
			empty = true;
		} else {
			empty = false;
		}
		return empty;
	}

	public String toString() {
		if (isEmpty() || data == null) // empty case
			return "[]";
		String str = "[";
		for (int z = 0; z < data.length; z++) {
			str = str + data[z];
			if (z == data.length - 1)
				str += "]";
			else
				str += ", ";
		}

		return str;
	}

	public double min() {
		if (!isEmpty()) {
			double min = data[0];
			for (int z = 0; z < data.length; z++) {
				if (min > data[z]) {
					min = data[z];
				}
			}

			return min;
		} else {
			return Double.NaN;
		}

	}

	public double max() {
		if (!isEmpty()) {
			double max = data[0];
			for (int z = 0; z < data.length; z++) {
				if (max < data[z]) {
					max = data[z];
				}
			}
			return max;
		} else {
			return Double.NaN;
		}

	}

	public double average() {
		if (!isEmpty()) {
			double total = 0;
			for (int z = 0; z < data.length; z++) {
				total = total + data[z];
			}
			double average = total / data.length;
			return average;
		} else {
			return Double.NaN;
		}

	}

	public double mode() {
		final double THRESHOLD = 0.000000001;
		if (!isEmpty()) {

			double mode = 0;
			int maxCount = 0;
			int currentCount = 0;
			for (int z = 0; z < data.length; z++) {
				double currentValue = data[z];
				currentCount = 0;
				for (int j = z; j < data.length; j++) {
					if (Math.abs(data[z] - data[j]) <= THRESHOLD) {
						currentCount++;
					}
				}
				if (currentCount > maxCount) {
					maxCount = currentCount;
					mode = currentValue;
				} else if (currentCount == maxCount) {
					mode = Double.NaN;
				}
			}

			return mode;
		} else {
			return Double.NaN;
		}
	}

	private int occursNumberOfTimes(double value) {
		int counter = 0;
		for (int z = 0; z < data.length; z++) {
			if (data[z] == value)
				counter++;
		}
		return counter;
	}

	public double variance() {
		if (!isEmpty()) {
			double distance = 0;

			for (int z = 0; z < data.length; z++)
				distance += Math.pow(data[z] - average(), 2);

			return distance / data.length;
		} else
			return Double.NaN;
	}

	public double standardDeviation() {
		if (!isEmpty()) {
			return Math.sqrt(variance());
		} else {
			return Double.NaN;
		}
	}

}
