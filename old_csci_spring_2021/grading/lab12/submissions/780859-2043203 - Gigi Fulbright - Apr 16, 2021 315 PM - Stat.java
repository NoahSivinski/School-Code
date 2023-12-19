/**
 * Stat.java 
 * Author: Jordyn Fulbright 
 * Submission Date: April 16th
 *
 * Purpose: This class allows the user to create arrays and have their data
 * printed. It also calculates the average of the data, the mode of the data and
 * the maximum data value as well as the minimum data value. in additon, this class calculates
 * standard deviation and variance.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither received nor given
 * inappropriate assistance. I have not copied or modified code from any source
 * other than the course webpage or the course textbook. I recognize that any
 * unauthorized assistance or plagiarism will be handled in accordance with the
 * University of Georgia's Academic Honesty Policy and the policies of this
 * course. I recognize that my work is based on an assignment created by the
 * Department of Computer Science at the University of Georgia. Any publishing
 * or posting of source code for this assignment is strictly prohibited unless
 * you have written consent from the Department of Computer Science at the
 * University of Georgia.
 */
public class Stat {

	private double[] data;

//Constructor
	public Stat() {

		this.data = new double[0];

	}

//constructor with double parameter
	public Stat(double[] d) {
		if (d == null) {
			data = new double[0];
		} else {
			int length = d.length;
			data = new double[length];

			for (int i = 0; i < length; i++) {

				data[i] = d[i];
			}
		}
	}

	// constructor with int parameter
	public Stat(int[] i) {
		if (i == null) {
			data = new double[0];
		} else {
			int length = i.length;
			data = new double[length];

			for (int j = 0; j < length; j++) {

				data[j] = i[j];
			}
		}
	}

	// constructor with long parameter
	public Stat(long[] lo) {
		if (lo == null) {
			data = new double[0];
		} else {
			int length = lo.length;
			data = new double[length];

			for (int i = 0; i < length; i++) {

				data[i] = lo[i];
			}
		}
	}

	// constructor with float parameter
	public Stat(float[] f) {
		if (f == null) {
			data = new double[0];
		} else {
			int length = f.length;
			data = new double[length];

			for (int i = 0; i < length; i++) {

				data[i] = f[i];
			}
		}
	}

//uses a loop to create a new copy of the data
	public double[] getData() {

		double dataAccessor[] = new double[data.length];

		for (int i = 0; i < data.length; i++) {

			dataAccessor[i] = data[i];

		}
		return dataAccessor;
	}

//uses a loop to set new data
	public void setData(double[] d) {
		if (d == null) {
			data = new double[0];
		} else {

			int length = d.length;
			data = new double[length];

			for (int i = 0; i < length; i++) {

				data[i] = d[i];
			}
		}
	}

	// mutator method with int parameter
	public void setData(int[] i) {
		if (i == null) {
			data = new double[0];
		} else {
			int length = i.length;
			data = new double[length];

			for (int j = 0; j < length; j++) {

				data[j] = i[j];
			}
		}
	}

	// mutator method with long parameter
	public void setData(long[] lo) {
		if (lo == null) {
			data = new double[0];
		} else {
			int length = lo.length;
			data = new double[length];

			for (int j = 0; j < length; j++) {

				data[j] = lo[j];
			}
		}
	}

	// mutator method with float parameter
	public void setData(float[] f) {
		if (f == null) {
			data = new double[0];
		} else {
			int length = f.length;
			data = new double[length];

			for (int j = 0; j < length; j++) {

				data[j] = f[j];
			}
		}
	}

// checks to see if the length and data of each of the arrays is the same
	public boolean equals(Stat s) {
		boolean equals = true;
		if (s == null) {
			equals = false;
		} else if (this.data.length == s.data.length) {

			for (int i = 0; i < data.length; i++) {

				if (this.data[i] == s.data[i]) {

				} else {
					equals = false;
				}
			}
		} else {
			equals = false;

		}

		if (equals) {

			return true;
		} else {
			return false;
		}
	}

//reset method
	public void reset() {
		data = new double[0];
	}

//append method parameter double
	public void append(double[] d) {
		if (d == null) {

		} else {

			int originalLength = data.length;
			int newLength = originalLength + d.length;
			double newData[] = new double[newLength];
			for (int i = 0; i < originalLength; i++) {
				newData[i] = data[i];

			}
			for (int j = originalLength; j < newLength; j++) {
				newData[j] = d[j - originalLength];

			}
			data = new double[newData.length];
			for (int k = 0; k < newData.length; k++) {

				data[k] = newData[k];
			}
		}

	}

	// append method parameter int
	public void append(int[] i) {
		if (i == null) {

		} else {

			int originalLength = data.length;
			int newLength = originalLength + i.length;
			double newData[] = new double[newLength];
			for (int l = 0; l < originalLength; l++) {
				newData[l] = data[l];

			}
			for (int j = originalLength; j < newLength; j++) {
				newData[j] = i[j - originalLength];

			}
			data = new double[newData.length];
			for (int k = 0; k < newData.length; k++) {

				data[k] = newData[k];
			}
		}

	}

	// append method parameter long
	public void append(long[] lo) {
		if (lo == null) {

		} else {

			int originalLength = data.length;
			int newLength = originalLength + lo.length;

			double newData[] = new double[newLength];
			for (int i = 0; i < originalLength; i++) {
				newData[i] = data[i];

			}
			for (int j = originalLength; j < newLength; j++) {

				newData[j] = lo[j - originalLength];

			}
			data = new double[newData.length];
			for (int k = 0; k < newData.length; k++) {

				data[k] = newData[k];
			}
		}

	}

	// append method parameter float
	public void append(float[] f) {
		if (f == null) {

		} else {

			int originalLength = data.length;
			int newLength = originalLength + f.length;
			double newData[] = new double[newLength];
			for (int i = 0; i < originalLength; i++) {
				newData[i] = data[i];

			}
			for (int j = originalLength; j < newLength; j++) {
				newData[j] = f[j - originalLength];

			}
			data = new double[newData.length];
			for (int k = 0; k < newData.length; k++) {

				data[k] = newData[k];
			}
		}

	}

	// isEmpty boolean
	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {

		String dataString = "";
		for (int i = 0; i < data.length; i++) {
			dataString += data[i];
			if (i < (data.length - 1)) {

				dataString += "," + " ";
			}

		}
		return "[" + dataString + "]";

	}

	public double min() {
		if (this.isEmpty() == true) {
			return Double.NaN;
		} else {
			double min = data[0];

			for (int i = 1; i < data.length; i++) {
				if (min < data[i]) {

				} else {

					min = data[i];
				}

			}

			return min;
		}
	}

	public double max() {
		if (this.isEmpty() == true) {
			return Double.NaN;
		} else {
			double max = data[0];

			for (int i = 1; i < data.length; i++) {
				if (max > data[i]) {

				} else {

					max = data[i];

				}

			}

			return max;
		}
	}

	public double average() {
		if (this.isEmpty() == true) {
			return Double.NaN;
		} else {
			double sum = 0;
			double average;
			for (int i = 0; i < data.length; i++) {
				sum += data[i];

			}
			average = sum / data.length;

			return average;
		}
	}

	public double mode() {
		if (this.isEmpty() == true) {
			return Double.NaN;
		} else {
			double modeData[] = new double[data.length];
			for (int i = 0; i < modeData.length; i++) {
				for (int j = 1; j < modeData.length; j++) {

					if (data[i] == data[j]) {
						modeData[i] += 1;

					}

				}
			}

			{
				double mode = modeData[0];

				for (int i = 1; i < modeData.length; i++) {
					if (mode < modeData[i]) {

						mode = modeData[i];

					}

					else {

					}

				}
				double modeChecker = modeData[modeData.length - 1];
				for (int i = modeData.length - 1; i >= 0; i--) {
					if (modeChecker < modeData[i]) {

						modeChecker = modeData[i];

					}
				}
				if (mode != modeChecker) {
					return mode;
				} else {
					return Double.NaN;
				}
			}
		}
	}

	// private occurs number of times
	// variance
	public double variance() {

		double elementsSum = 0;
		double difference;

		for (int t = 0; t < data.length; t++) {
			difference = data[t] - this.average();

			difference = Math.pow(difference, 2);

			elementsSum += difference;

		}

		return (elementsSum / data.length);
	}

	// standard deviation
	public double standardDeviation() {
		if (this.isEmpty() == true) {
			return Double.NaN;
		} else {
			return Math.pow(this.variance(), 1.0 / 2.0);

		}
	}
}
