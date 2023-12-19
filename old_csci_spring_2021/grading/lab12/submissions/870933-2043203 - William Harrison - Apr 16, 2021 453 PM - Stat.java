/*
 * Stat.java
 * Author:  Will Harrison
 * Submission Date:  4/16/2021
 *
 * Purpose: This program uses contructors, setters, getters,
 * and methods to create arrays to be used in the StatTester
 * class. These methods create multiple useful modifiers to 
 * solve for equations like min, max, average, mode, variance,
 * and standard deviation.
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

	private double [] data;

	public Stat() {
		double[] stat = new double[0];
		data = stat;
	}

	public Stat (double[] d) {
		if (d == null) {
			double[] emptyD = new double[0];
			data = emptyD;
		}
		double[] doubleArray = new double[d.length];
		for(int index = 0; index < d.length; index++) {
			doubleArray[index] = d[index];
		}
		data = doubleArray;
	}
	public Stat (float[] f) {
		if (f == null) {
			double[] emptyF = new double[0];
			data = emptyF;
		}
		else {
		double[] floatArray = new double[f.length];
		for(int index = 0; index < f.length; index++) {
			floatArray[index] = f[index];
		}
		data = floatArray;
		}
	}
	public Stat (int[] i) {
		if (i == null) {
			double[] emptyI = new double[0];
			data = emptyI;
		}
		else {
		double[] intArray = new double [i.length];
		for(int index = 0; index < i.length; index++) {
			intArray[index] = i[index];
		}
		data = intArray;
		}
	}
	public Stat (long[] lo) {
		if (lo == null) {
			double[] emptyLo = new double [0];
			data = emptyLo;
		}
		else {
		double[] longArray = new double [lo.length];
		for(int index = 0; index < lo.length; index++) {
			longArray[index] = lo[index];
		}
		data = longArray;
		}
	}
	public void setData (float[] f) {
		if (f == null) {
			double[] emptyF = new double [0];
			data = emptyF;
		}
		else {
		double[] floatArray = new double[f.length];
		for(int index = 0; index < f.length; index++) {
			floatArray[index] = f[index];
		}
		data = floatArray;
		}
	}
	public void setData (double[] d) {
		if (d == null) {
			double[] emptyD = new double [0];
			data = emptyD;
		}
		else {
		double[] doubleArray = new double[d.length];
		for(int index = 0; index < d.length; index++) {
			doubleArray[index] = d[index];
		}
		data = doubleArray;
		}
	}
	public void setData (int[] i) {
		if (i == null) {
			double[] emptyI = new double [0];
			data = emptyI;
		}
		else {
		double[] intArray = new double [i.length];
		for(int index = 0; index < i.length; index++) {
			intArray[index] = i[index];
		}
		data = intArray;
		}
	}
	public void setData (long[] lo) {
		if (lo == null) {
			double[] emptyLo = new double [0];
			data = emptyLo;
		}
		else {
		double[] longArray = new double [lo.length];
		for(int index = 0; index < lo.length; index++) {
			longArray[index] = lo[index];
		}
		data = longArray;
		}
	}
	public double[] getData() {
		double[] getDataArray = new double [data.length];
		for(int index = 0; index < data.length; index++) {
			getDataArray[index] = data[index];
		}
		return getDataArray;
	}
	public boolean equals(Stat s) {
		boolean space = false;
		if (s == null) {
			return false;
		}
		else {
			double THRESHOLD = 0.000000001;
			if (s.data.length == data.length) {
				for(int index = 0; index < data.length; index++) {
					if(Math.abs(s.data[index] - data[index]) < THRESHOLD) {
						return true;
					}
					else return false;
				}
			}
			else return false;
		}
		return space;
	}
	public void reset() {
		double[] resetArray = new double [0];
		data = resetArray; 
	}
	public void append (int[] i) {
		if (i == null) {
		}
		else {
			int tester = data.length;
			double[] appendInt = new double [i.length + data.length];
			for(int index = 0; index < data.length; index++) {
				appendInt[index] = data[index];
			}
			for(int index = 0; index < i.length; index++) {
				appendInt[tester] = i[index];
				tester++;
			}
			data = appendInt;
		}
	}
	public void append (float[] f) {
		if (f == null) {
		}
		else {
			double[] appendFloat = new double [f.length + data.length];
			for(int index = 0; index < data.length; index++) {
				appendFloat[index] = data[index];
			}
			for(int index = data.length; index < f.length + data.length; index++) {
				appendFloat[index] = f[index - data.length];
			}
			data = appendFloat;
		}
	}
	public void append (long[] lo) {
		if (lo == null) {
		}
		else {
			double[] appendLong = new double [lo.length + data.length];
			for(int index = 0; index < data.length; index++) {
				appendLong[index] = data[index];
			}
			for(int index = data.length; index < lo.length + data.length; index++) {
				appendLong[index] = lo[index - data.length];
			}
			data = appendLong;
		}
	}
	public void append (double[] d) {
		if (d == null) {
		}
		else {
			double[] appendDouble = new double [d.length + data.length];
			for(int index = 0; index < data.length; index++) {
				appendDouble[index] = data[index];
			}
			for(int index = data.length; index < d.length + data.length; index++) {
				appendDouble[index] = d[index - data.length];
			}
			data = appendDouble;
		}
	}
	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		}
		else
			return false;
	}
	public String toString() {
		String toString = "";
		for(int index = 0; index < data.length; index++) {
			toString = toString + data[index];
			if(index < data.length - 1) {
				toString = toString + ", ";
			}
		}
		return "[" + toString + "]";
	}
	public double min() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double minNumber = data[0];
			for(int index = 0; index < data.length; index++) {
				if (data[index] < minNumber) {
					minNumber = data[index];

				}
			}
			return minNumber;
		}
	}
	public double max() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double maxNumber = data[0];
			for(int index = 0; index < data.length; index++) {
				if (data[index] > maxNumber) {
					maxNumber = data[index];
				}
			}
			return maxNumber;
		}
	}
	public double average() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double sum = 0;
			for(int index = 0; index < data.length; index++) {
				sum = sum + data[index];
			}
			double average = sum / data.length;
			return average;
		}
	}
	public double mode() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double threshold = 0.000000001;
			int modeCounter = 0;
			double mode = 0;
			for(int index = 0; index < data.length; index++) {
				int counter = 0;
				for(int ind = index; ind < data.length; ind++) {
					if (Math.abs(data[index] - data[ind]) < threshold) {
						counter++;
					}
					if (counter > modeCounter) {
						mode = data[index];
						modeCounter = counter;
					}
					else if (counter == modeCounter) {
						mode = Double.NaN;
					}
				}
			}
			return mode;
		}
	}
	public double variance() {
		if(data.length == 0) {
			return Double.NaN;
		}
		else {
			double sumAvg = 0;
			double sumVar = 0;
			double varNumbers = 0;
			for(int index = 0; index < data.length; index++) {
				sumAvg = sumAvg + data[index];
			}
			double average = sumAvg / data.length;
			for(int index = 0; index < data.length; index++) {
				varNumbers = (Math.pow(data[index] - average , 2));
				sumVar = sumVar + varNumbers;
			}
			double variance = sumVar / data.length;
			return variance;
		}
	}
	public double standardDeviation() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double sumAvg = 0;
			double sumVar = 0;
			double varNumbers = 0;
			for(int index = 0; index < data.length; index++) {
				sumAvg = sumAvg + data[index];
			}
			double average = sumAvg / data.length;
			for(int index = 0; index < data.length; index++) {
				varNumbers = (Math.pow(data[index] - average , 2));
				sumVar = sumVar + varNumbers;
			}
			double variance = sumVar / data.length;
			double standardDeviation = Math.sqrt(variance);
			return standardDeviation;
		}
	}

}
