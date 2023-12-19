/*
 * [CSCI1301L]
 * Stat.java
 * Author:  [Jaehoon Seol] 
 * Submission Date:  [04162021]
 *
 * Purpose:This program creates methods in the class Stat.java to have multiple various tests with different data. 
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

	// setting threshold to compare doubles
	public static final double THRESHOLD = 0.000000001;

	// new data double array
	private double[] data;

	// Stat methods to set passed parameter to data array for each types of data begins(double, float, long, etc)
	public Stat() {
		double[] newData = new double[0];
		data = new double[newData.length];
		data = newData;
	}

	public Stat(double[] d) {
		if (d == null) {
			double[] newData = new double[0];
			data = new double[newData.length];
			data = newData;
		} else {
			data = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				data[i] = d[i];
			}
		}
	}

	public Stat(float[] f) {
		if (f == null) {
			double[] newData = new double[0];
			data = new double[newData.length];
			data = newData;
		} else {
			data = new double[f.length];
			float[] newData = new float[f.length];
			newData = f;
			for (int i = 0; i < f.length; i++) {
				data[i] = (float) newData[i];
			}
		}
	}

	public Stat(int[] i) {
		if (i == null) {
			double[] newData = new double[0];
			data = new double[newData.length];
			data = newData;
		} else {
			data = new double[i.length];
			int[] newData = new int[i.length];
			newData = i;
			for (int j = 0; j < i.length; j++) {
				data[j] = (int) newData[j];
			}
		}
	}

	public Stat(long[] lo) {
		if (lo == null) {
			double[] newData = new double[0];
			data = new double[newData.length];
			data = newData;
		} else {
			data = new double[lo.length];
			long[] newData = new long[lo.length];
			newData = lo;
			for (int j = 0; j < lo.length; j++) {
				data[j] = (long) newData[j];
			}
		}
	}
	
	// Stat methods to set passed parameter to data array for each types of data ends(double, float, long, etc)
	
	// setters start here
	public void setData(float[] f) {
		if (f == null) {
			double[] newData = new double[0];
			data = new double[newData.length];
			data = newData;
		} else {
			float[] newData = new float[f.length];
			data = new double[f.length];
			newData = f;
			for (int i = 0; i < f.length; ++i) {
				data[i] = (float) newData[i];
			}
		}
	}

	public void setData(double[] d) {
		if (d == null) {
			double[] newData = new double[0];
			data = new double[newData.length];
			data = newData;
		} else {
			double[] newData = new double[d.length];
			// newData = d;
			data = new double[d.length];
			newData = d;
			data = newData;
			for (int i = 0; i < d.length; ++i) {
				data[i] = d[i];
			}
		}
	}

	public void setData(int[] i) {
		if (i == null) {
			double[] newData = new double[0];
			data = new double[newData.length];
			data = newData;
		} else {
			int[] newData = new int[i.length];
			data = new double[i.length];
			newData = i;
			for (int j = 0; j < i.length; ++j) {
				data[j] = (int) newData[j];
			}
		}
	}

	public void setData(long[] lo) {
		if (lo == null) {
			double[] newData = new double[0];
			data = new double[newData.length];
			data = newData;
		} else {
			long[] newData = new long[lo.length];
			data = new double[lo.length];
			newData = lo;
			for (int i = 0; i < lo.length; ++i) {
				data[i] = (long) newData[i];
			}
		}
	}
	// setters end here

	// getter
	public double[] getData() {
		double[] newData = new double[data.length];
		newData = data;
		for (int i = 0; i > data.length; i++) {
			newData[i] = data[i];
		}
		return newData;
	}

	// comparing if data elements are equal to data elements passed through parameter
	public boolean equals(Stat s) {
		boolean equals = true;
		if (s == null) {
			equals = false;
		} else if (data.length != s.data.length) {
			equals = false;
		} else {
			for (int i = 0; i < data.length; i++) {
				if (Math.abs(data[i] - s.data[i]) < THRESHOLD)
					equals = true;
			}
		}
		return equals;
	}

	// resets data to null
	public void reset() {
		double[] newData = new double[data.length];
		data = new double[newData.length];
		newData = null;
		data = newData;
	}

	// append methods start here : attaches passed data to existing data
	public void append(int[] i) {
		if (i != null) {
			int[] paramData = new int[i.length];
			paramData = i;
			int[] savedData = new int[data.length];
			for (int j = 0; j < data.length; j++) {
				savedData[j] = (int) data[j];
			}

			data = new double[data.length + i.length];
			for (int j = 0; j < savedData.length; ++j) {
				data[j] = (int) savedData[j];
			}

			for (int j = 0; j < i.length; j++) {
				data[savedData.length + j] = (int) paramData[j];
			}

		} else {
			// do nothing
		}
	}

	public void append(float[] f) {
		if (f != null) {
			float[] paramData = new float[f.length];
			paramData = f;
			float[] savedData = new float[data.length];
			for (int i = 0; i < data.length; i++) {
				savedData[i] = (float) data[i];
			}

			data = new double[data.length + f.length];
			for (int i = 0; i < savedData.length; ++i) {
				data[i] = (float) savedData[i];
			}

			for (int i = 0; i < f.length; i++) {
				data[savedData.length + i] = (float) paramData[i];
			}

		} else {
			// do nothing
		}
	}

	public void append(long[] lo) {
		if (lo != null) {
			long[] paramData = new long[lo.length];
			paramData = lo;
			long[] savedData = new long[data.length];
			for (int i = 0; i < data.length; i++) {
				savedData[i] = (long) data[i];
			}
			data = new double[data.length + lo.length];
			for (int i = 0; i < savedData.length; ++i) {
				data[i] = (long) savedData[i];
			}

			for (int i = 0; i < lo.length; i++) {
				data[savedData.length + i] = (long) paramData[i];
			}

		} else {
			// do nothing
		}
	}

	public void append(double[] d) {
		if (d != null) {
			double[] paramData = new double[d.length];
			paramData = d;
			double[] savedData = new double[data.length];
			for (int i = 0; i < data.length; i++) {
				savedData[i] = data[i];
			}
			data = new double[data.length + d.length];
			for (int i = 0; i < savedData.length; ++i) {
				data[i] = savedData[i];
			}
			for (int i = 0; i < d.length; i++) {
				data[savedData.length + i] = paramData[i];
			}

		} else {
			// do nothing
		}
	}
	// append methods end here

	// checking if data array is null or has 0 length
	public boolean isEmpty() {
		if (data == null) {
			return true;
		} else if (data.length == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// shows string representation of data
	public String toString() {
		String toString = "[";
		if (data == null) {
			return toString + "]";
		}

		else {
			for (int i = 0; i < data.length; i++) {
				if (i == data.length - 1) {
					toString = toString + data[i];
				} else {
					toString = toString + data[i] + ", ";
				}
			}
			return toString + "]";
		}
	}

	// finds minimum value
	public double min() {
		if (data == null) {
			return Double.NaN;
		} else if (data.length == 0) {
			return Double.NaN;
		} else {
			double min = data[0];
			for (int i = 0; i < data.length; i++) {
				if (min > data[i])
					min = data[i];
			}
			return min;
		}
	}

	// finds maximum value
	public double max() {
		if (data == null) {
			return Double.NaN;
		} else if (data.length == 0) {
			return Double.NaN;
		} else {
			double max = data[0];
			for (int i = 0; i < data.length; i++) {
				if (data[i] > max) {
					max = data[i];
				}
			}
			return max;
		}
	}
	
	// finds average value
	public double average() {
		if (data == null) {
			return Double.NaN;
		} else if (data.length == 0) {
			return Double.NaN;
		} else {
			double average = 0.0;
			for (int i = 0; i < data.length; i++) {
				average = average + data[i];
			}
			return average / data.length;
		}
	}

	// finds statistical mode of a data
	public double mode() {
		double mode;
		if (data == null) {
			mode = Double.NaN;
			return mode;
		} else if (data.length == 0) {
			mode = Double.NaN;
			return mode;
		} else {
			mode = Double.NaN;
			int finalCount = 1;
			int counter2;
			for (int i = 0; i < data.length - 1; i++) {
				double temporaryMode = data[i];
				counter2 = 0;
				for (int j = 0; j < data.length; j++) {
					if (data[j] == temporaryMode) {
						counter2++;
					}
				}
				if (counter2 > finalCount) {
					mode = temporaryMode;
					finalCount = counter2;
				} else if (counter2 == finalCount) {
					// do nothing
				}
			}
		}
		return mode;
	}

	// counts how frequent the passed double value occurs
	public int occursNumberOfTimes(double value) {
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			if (Math.abs(data[i] - value) < THRESHOLD) {
				counter++;
			}
		}
		return counter;
	}

	// finds statistical variance
	public double variance() {
		if (data == null) {
			return Double.NaN;
		} else if (data.length == 0) {
			return Double.NaN;
		} else {
			double[] differences = new double[data.length];
			double[] variables = new double[data.length];
			double sum = 0;
			for (int i = 0; i < data.length; i++) {
				differences[i] = data[i] - average();
				variables[i] = Math.pow(differences[i], 2);
				sum = sum + variables[i];
			}
			return sum / data.length;
		}
	}

	// finds statistical standard deviation 
	public double standardDeviation() {
		if (data == null) {
			return Double.NaN;
		} else if (data.length == 0) {
			return Double.NaN;
		} else {
			return Math.sqrt(variance());
		}
	}

}
