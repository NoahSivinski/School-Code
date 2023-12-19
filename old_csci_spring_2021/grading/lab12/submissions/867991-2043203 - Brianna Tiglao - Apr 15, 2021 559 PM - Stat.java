/*
 * Stat.java
 * Author:  Brianna Tiglao 
 * Submission Date:  April 15, 2021
 *
 * Purpose: The purpose of this code is to take data sets and run them
 * through stat methods such as finding the min, the max, the mode, etc.
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
		if (d == null) {
			double [] dCopy = new double[0];
			data = dCopy;
		}
		else {
			double[] dCopy = new double[d.length];
			for (int i = 0; i < d.length; i++){
				dCopy[i] = d[i];
			}
			data = dCopy;
		}
	}

	public Stat(float[] f) {
		if (f == null) {
			double [] dCopy = new double[0];
			data = dCopy;
		}
		else {
			double[] fCopy = new double[f.length];
			for (int i = 0; i < f.length; i++){
				fCopy[i] = (double)f[i];
			}
			data = fCopy;
		}
	}

	public Stat(int[] i) {
		if (i == null) {
			double [] dCopy = new double[0];
			data = dCopy;
		}
		else {
			double[] iCopy = new double[i.length];
			for (int in = 0; in < i.length; in++){
				iCopy[in] = (double)i[in];
			}
			data = iCopy;
		}
	}

	public Stat(long[] lo) {
		if (lo == null) {
			double [] dCopy = new double[0];
			data = dCopy;
		}
		else {
			double[] loCopy = new double[lo.length];
			for (int i = 0; i < lo.length; i++){
				loCopy[i] = (double)lo[i];
			}
			data = loCopy;
		}
	}

	public void setData(float[] f) {
		if (f == null) {
			double [] dCopy = new double[0];
			data = dCopy;
		}
		else {
			double[] fCopy = new double[f.length];
			for (int i = 0; i < f.length; i++){
				fCopy[i] = (double)f[i];
			}
			data = fCopy;
		}
	}

	public void setData(double[] d) {
		if (d == null) {
			double [] dCopy = new double[0];
			data = dCopy;
		}
		else {
			double[] dCopy = new double[d.length];
			for (int i = 0; i < d.length; i++){
				dCopy[i] = d[i];
			}
			data = dCopy;
		}
	}

	public void setData(int[] i) {
		if (i == null) {
			double [] dCopy = new double[0];
			data = dCopy;
		}
		else {
			double[] iCopy = new double[i.length];
			for (int in = 0; in < i.length; in++){
				iCopy[in] = (double)i[in];
			}
			data = iCopy;
		}
	}

	public void setData(long[] lo) {
		if (lo == null) {
			double [] dCopy = new double[0];
			data = dCopy;
		}
		else {
			double[] loCopy = new double[lo.length];
			for (int i = 0; i < lo.length; i++){
				loCopy[i] = (double)lo[i];
			}
			data = loCopy;
		}
	}

	public double[] getData() {
		double[] dataCopy = new double[data.length];
		for (int i = 0; i < data.length; i++){
			dataCopy[i] = data[i];
		}
		return dataCopy;
	}

	public boolean equals(Stat s) {
		if (s == null) {
			return false;
		}
		double[] sData = s.getData();
		if (sData.length != data.length) {
			return false;
		}
		for (int i = 0; i < data.length; i++) {
			if (sData[i] != data[i]) {
				return false;
			}
		}

		return true;
	}

	public void reset() {
		data = new double[0];
	}

	public void append(int[] i) {
		if (i != null) {
			double [] iAppend = new double [data.length + i.length];
			for (int in = 0; in < data.length; in++) {
				iAppend[in] = data[in];
			}
			for (int in = 0; in < i.length; in++) {
				iAppend[in + data.length] = (double)i[in];
			}
			data = iAppend;
		}
	}

	public void append(float[] f) {
		if (f != null) {
			double [] fAppend = new double [data.length + f.length];
			for (int i = 0; i < data.length; i++) {
				fAppend[i] = data[i];
			}
			for (int i = 0; i < f.length; i++) {
				fAppend[i + data.length] = (double)f[i];
			}
			data = fAppend;
		}
	}

	public void append(long[] lo) {
		if (lo != null) {
			double [] loAppend = new double [data.length + lo.length];
			for (int i = 0; i < data.length; i++) {
				loAppend[i] = data[i];
			}
			for (int i = 0; i < lo.length; i++) {
				loAppend[i + data.length] = (double)lo[i];
			}
			data = loAppend;
		}
	}

	public void append(double[] d) {
		if (d != null) {
			double [] dAppend = new double [data.length + d.length];
			for (int i = 0; i < data.length; i++) {
				dAppend[i] = data[i];
			}
			for (int i = 0; i < d.length; i++) {
				dAppend[i + data.length] = (double)d[i];
			}
			data = dAppend;
		}
	}

	public boolean isEmpty() {
		boolean isEmpty = true;

		if (data.length == 0) {
			return isEmpty;
		}

		return !isEmpty;
	}

	public String toString() {
		String output = "[";

		if (data.length > 0) {
			for (int i = 0; i < data.length - 1; i++) {
				output += data[i] + ", ";
			}
			output += data[data.length - 1];
		}
		return output + "]";
	}

	public double min() {
		double min = Integer.MAX_VALUE;

		for(int i = 0; i < data.length; i++){
			if(data[i] < min) {
				min = data[i];
			}
		}
		if (data.length == 0) {
			return Double.NaN;
		}
		return min;
	}

	public double max() {
		double max = Integer.MIN_VALUE;

		for(int i = 0; i < data.length; i++){
			if(data[i] > max) {
				max = data[i];
			}
		}
		if (data.length == 0) {
			return Double.NaN;
		}
		return max;
	}

	public double average() {
		double sum = 0;

		for (int i = 0; i < data.length; i++){
			sum += data[i];
		}
		if (data.length == 0) {
			return Double.NaN;
		}
		return sum / data.length;
	}

	public double mode() {
		double modeVal = 0;
		int maxValCount = 0;
		
		if (data.length == 0) {
			return Double.NaN;
		}

		for(int i = 0; i < data.length; i++) {
			int valCount = 0;

			for (int j = i; j < data.length; j++) {
				if (data[i] == data[j]) {
					valCount++;
				}
			}
			if (valCount > maxValCount) {
				maxValCount = valCount;

				modeVal = data[i];
			}
			else if (valCount == maxValCount) {

				modeVal = Double.NaN;
			}
		}

		return modeVal;
	}

	public double variance() {
		double difference = 0;
		double mean = this.average();

		for (int i = 0; i < data.length; i++) {
			difference += Math.pow(data[i] - mean, 2);
		}
		return difference/data.length;
	}

	public double standardDeviation() {
		if (data.length == 0) {
			return Double.NaN;
		}
		return Math.sqrt(this.variance());
	}
}
