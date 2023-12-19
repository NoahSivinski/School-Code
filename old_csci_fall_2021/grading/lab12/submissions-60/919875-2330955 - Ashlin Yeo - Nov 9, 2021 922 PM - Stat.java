/*
 * Stat.java
 * Author:  Ashlin Yeo
 * Submission Date:  11/9/2021
 *
 * Purpose: The Stat class stores an array of double values. 
 * It contains several methods used to compare arrays, as well
 * as find minimums,maximums, and modes.
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

	//1. Stat() - default constructor for Stat
	public Stat() {
		data = new double[0];
	}

	//2. Stat(double[] d) - constructs a Stat object using the values held in d
	public Stat(double[] d) {
		double[] dataCopy = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dataCopy[i] = d[i];
		}
		data = dataCopy;
	}

	//3. Stat(float[] f) - constructs a Stat object using the values held in f
	public Stat(float[] f) {
		double[] dataCopy = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			dataCopy[i] = f[i];
		}
		data = dataCopy;
	}

	//4. Stat(int[] i) - constructs a Stat object using the values held in i
	public Stat(int[] i) {
		double[] dataCopy = new double[i.length];
		for (int j = 0; j < i.length; j++) {
			dataCopy[j] = i[j];
		}
		data = dataCopy;
	}

	//5. Stat(long[] lo) - constructs a Stat object using the values held in lo
	public Stat(long[] lo) {
		double[] dataCopy = new double[lo.length];
		for (int i = 0; i < lo.length; i++) {
			dataCopy[i] = lo[i];
		}
		data = dataCopy;
	}

	//6. setData(float[] f) - sets the values of the data array
	public void setData(float[] f) {
		if (f == null) {
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else {
			double[] dataCopy = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				dataCopy[i] = f[i];

			}
			data = dataCopy;
		}
	}

	//7. setData(double[] d) - sets the values of the data array
	public void setData(double[] d) {
		if (d == null) {
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else {
			double[] dataCopy = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				dataCopy[i] = d[i];

			}
			data = dataCopy;
		}
	}

	//8. setData(int[] i) - sets the values of the data array
	public void setData(int[] i) {
		if (i == null) {
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else {
			double[] dataCopy = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				dataCopy[j] = i[j];

			}
			data = dataCopy;
		}
	}

	//9. setData(long[] lo) - sets the values of the data array
	public void setData(long[] lo) {
		if (lo == null) {
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else {
			double[] dataCopy = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				dataCopy[i] = lo[i];

			}
			data = dataCopy;
		}
	}
	//10. getData() - retrieves the values of data
	public double[] getData() {
		double[] dataCopy = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			dataCopy[i] = data[i];
		}
		data = dataCopy;
		return dataCopy;
	}

	//11. equals(Stat s) - returns true if the data objects of both the calling Stat object and the passed
	//stat object s have the same values and are in the same order
	public boolean equals(Stat s) {
		if(s == null) {
			return false;
		}
		else if (s.data.length != data.length) {
			return false;
		}
		else if(s.getData().length == 0) {
			return false;
		}
		else {
			boolean status = true;
			if (s.data.length != data.length) {
				return false;
			}
			else {
				status = true;
				for (int j = 0; j < data.length && status == true; j++) {
					if(s.data[j] == data[j]) {
						status = true;
					}
					else {
						status = false;
					}
				}
				return status;
			}
		}
	}

	//12. reset() - clears the data array
	public void reset() {
		double[] dataCopy = new double[0];
		data = dataCopy;
	}

	//13. append(int[] i) - creates a new double array containing the elements of data
	//followed by those of the array passed as a parameter
	public void append(int[] i) {
		double[] dataCopy = new double[data.length + i.length];
		if (i != null) {
			for (int j = 0; j < data.length; j++) {
				dataCopy[j] = data[j];
			}
			for (int j = data.length, k = 0; j < dataCopy.length; j++, k++) {
				dataCopy[j] = i[k];
			}
			data = dataCopy;
		}
	}

	//14. append(float[] f) - creates a new double array containing the elements of data
	//followed by those of the array passed as a parameter
	public void append(float[] f) {
		double[] dataCopy = new double[data.length + f.length];
		if (f != null) {
			for (int j = 0; j < data.length; j++) {
				dataCopy[j] = data[j];
			}
			for (int j = data.length, k = 0; j < dataCopy.length; j++, k++) {
				dataCopy[j] = f[k];
			}
			data = dataCopy;
		}

	}

	//15. append(long[] lo) - creates a new double array containing the elements of data
	//followed by those of the array passed as a parameter
	public void append(long[] lo) {
		double[] dataCopy = new double[data.length + lo.length];
		if (lo != null) {
			for (int j = 0; j < data.length; j++) {
				dataCopy[j] = data[j];
			}
			for (int j = data.length, k = 0; j < dataCopy.length; j++, k++) {
				dataCopy[j] = lo[k];
			}
			data = dataCopy;
		}

	}

	//16. append(double[] d) - creates a new double array containing the elements of data
	//followed by those of the array passed as a parameter
	public void append(double[] d) {
		if (d != null) {
			double[] dataCopy = new double[data.length + d.length];
			for (int j = 0; j < data.length; j++) {
				dataCopy[j] = data[j];
			}
			for (int j = data.length, k = 0; j < dataCopy.length; j++, k++) {
				dataCopy[j] = d[k];
			}
			data = dataCopy;
		}

	}

	//17. isEmpty() - returns the boolean value true if the data object is empty
	public boolean isEmpty() {
		if (data.length == 0){
			return true;
		}
		else {
			return false;
		}
	}

	//18. toString() - returns a String representation of the data elements stored in the Stat object
	public String toString() {
		String arrayValues = "[";
		if(data.length == 0) {
			return "[]";
		}
		else {
			for (int i = 0; i < data.length - 1; i++) {
				arrayValues += data[i] + ", ";
			}
			arrayValues += data[data.length - 1];
			arrayValues += "]";
			return arrayValues;
		}
	}

	//19. min() - returns the minimum of the data array
	public double min() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double minimum = data[0];
			for (int i = 0; i < data.length; i++) {
				if(data[i] < minimum) {
					minimum = data[i];
				}
			}
			return minimum;
		}
	}

	//20. max() - returns the maximum of the data array
	public double max() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double maximum = data[0];
			for (int i = 0; i < data.length; i++) {
				if(data[i] > maximum) {
					maximum = data[i];
				}
			}
			return maximum;
		}
	}

	//21. average() - returns the average of the data array as a double value
	public double average() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double sum = 0;
			for (int i = 0; i < data.length; i++) {
				sum += data[i];
			}
			return sum / data.length;
		}
	}

	//22. mode() - returns the mode of the data array. If one value does not occur more frequently than all others,
	//returns Double.NaN
	public double mode() {
		if (data.length != 0) {
			double mode = 0;
			int maxFrequency = 0;
			for (int i = 0; i < data.length; i++) {
				int frequency = 1;
				for (int j = i + 1; j < data.length; j++) {
					if(data[i] == data[j]) {
						frequency++;
					}
				}
				if (maxFrequency < frequency) {
					maxFrequency = frequency;
					mode = data[i];
				}
				else if(maxFrequency == frequency) {
					mode = Double.NaN;
				}
			}
			return mode;
		}
		else {
			return Double.NaN;
		}
	}

	//24. variance() - returns the variance of the data in the data array
	public double variance() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double variance = 0;
			for (int i = 0; i < data.length; i++) {
				double squaredValue = Math.pow(data[i] - average(), 2);
				variance += squaredValue;
			}
			return variance / data.length;
		}
	}

	//25. standardDeviation() - returns the square root of the variance
	public double standardDeviation() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			return Math.sqrt(variance());
		}
	}
}
