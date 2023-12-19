/*
 * [Stat].java
 * Author:  [Sona Makkanal] 
 * Submission Date:  [4/16/21]
 *
 * Purpose: This program is a modified version of lab 11 that contains an addition of series of methods that are tested and implemented in the main method.
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

	//variable
	private double[] data;

	// default constructor (1)
	public Stat() {
		double[] data = new double[0];
		this.data = data;

	}

	// constructors (2)
	public Stat(double[] d) {
		setData(d);
		data = getData();
	}
	
	//(3)
	public Stat(int[] i) {
		setData(i);
	}
	
	//(4)
	public Stat(long[] lo) {
		setData(lo);
	}
	
	//(5)
	public Stat(float[] f) {
		setData(f);
	}
	
	//setData double (6)
	public void setData(double[] d) {
		if (d != null) {
			double[] doubleArray = new double[d.length];
			for (int i = 0; i < doubleArray.length; i++)
			doubleArray[i] = d[i];
			data = doubleArray;
		}

		else {
			double[] emptyArray = new double[0];
			data = emptyArray;
		}

	}
	
	//setData int (7)
	public void setData(int[] i) {
		double[] intArray = new double[i.length];
		for (int a = 0; a < intArray.length; a++)
		intArray[a] = (double) i[a];
		data = intArray;
	}
	
	//setData long (8)
	public void setData(long[] lo) {
		double[] longArray = new double[lo.length];
		for (int i = 0; i < longArray.length; i++)
		longArray[i] = (double) lo[i];
		data = longArray;
	}
	
	//setData float (9)
	public void setData(float[] f) {
		double[] floatArray = new double[f.length];
		for (int i = 0; i < floatArray.length; i++)
		floatArray[i] = (double) f[i];
		data = floatArray;
	}

	// accessor method getData (10)
	public double[] getData() {
		if (data == null) {
			return null;
		}
		double data1[] = new double[data.length]; //Data = data1
		for (int i = 0; i < data.length; i++) {
			data1[i] = this.data[i];
		}
			
		return data1;

	}

	// equals method (11)
	public boolean equals(Stat s) {
		if (s == null) {
			return false;
		}
		s.toString();
		data.toString();
		boolean elementsMatch = true;
		if (s.getData().length != data.length) {
			elementsMatch = false;
		} else {
			int i = 0;
			while (elementsMatch && (i < s.getData().length)) {
				if (s.getData()[i] != data[i]) {
					elementsMatch = false;
				}
				i++;
			}
		}
		return elementsMatch;

	}
	
	//reset method (12)
	public void reset() {
		double[] resetArray = new double[0];
		data = resetArray;
	}
	
	//append double (13)
	public void append(double[] d) {
		if (d != null) {
			double[] appendArray = new double[data.length + d.length];
			for (int i = 0; i < data.length; i++) 
				appendArray[i] = data[i];
			for (int j = 0; j < d.length; j++) {
				appendArray[data.length + j] = d[j];
			}
			data = appendArray;
		}

		else {

		}
	}
	
	//append int (14)
	public void append(int[] i) {
		double[] appendArray = new double[data.length + i.length];
		for (int a = 0; a < data.length; a++) 
			appendArray[a] = data[a];
		for (int j = 0; j < i.length; j++) {
			appendArray[data.length + j] = (double) i[j];
		}
		data = appendArray;
	}
	
	//append long (15)
	public void append(long[] lo) {
		double[] appendArray = new double[data.length + lo.length];
		for (int i = 0; i < data.length; i++) 
			appendArray[i] = data[i];
		for (int j = 0; j < lo.length; j++) {
			appendArray[data.length + j] = (double) lo[j];
		}
		data = appendArray;
		
	}
	
	//append float (16)
	public void append(float[] f) {
		double[] appendArray = new double[data.length + f.length];
		for (int i = 0; i < data.length; i++) 
			appendArray[i] = data[i];
		for (int j = 0; j < f.length; j++) {
			appendArray[data.length + j] = (double) f[j];
		}
		data = appendArray;
	}

	//isEmpty method (17)
	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		} else {
			return false;
		}

	}
	
	// toString method (18)
	public String toString() {
		String arrayData = "";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1)
				arrayData += data[i];
			else arrayData += data[i] + ",";
		}
		return "[" + arrayData + "]";
	}

	// min method (19)
	public double min() {
		if (isEmpty() == false) {
			double min = data[0];

			for (int i = 0; i < data.length; i++) {
				if (data[i] <= min) {
					min = data[i];
				}
			}

			return min;

		} else {
			return Double.NaN;
		}
	}


	// max method (20)
	public double max() {
		if (isEmpty() == false) {
			double max = data[0];

			for (int i = 0; i < data.length; i++) {
				if (data[i] >= max) {
					max = data[i];
				}
			}
			return max;

		} else {
			return Double.NaN;
		}
	}


	// average method (21)
	public double average() {
		if (isEmpty() == false) {
			double sum = 0;
			double average = 0;
			for (int i = 0; i < data.length; i++) {
				sum = sum + data[i];
				average = sum / data.length;
			}
			return average;

		} else {
			return Double.NaN;
		}
	}

	// mode method (22)
	public double mode() {
		double maxValue = 0, maxCount = 0;
		boolean value = false;

		for (int i = 0; i < data.length - 1; ++i) {
			double count = 0;

			for (int j = i + 1; j < data.length; ++j) {

				if (data[i] == data[j]) {

					count++;
				}

			} // end of inner loop
			if (count == maxCount)
				value = true;

			if (count > maxCount) {
				value = false;
				maxCount = count;
				maxValue = data[i];
			}

		} // end of outer loop

		if (maxCount == 0 || value == true) {
			return Double.NaN;
		}

		return maxValue;
	}

	
	//occursNumerOfTimes (23)
	private int occursNumberOfTimes(double value) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				count++;
			}
		}
		return count;
	}
	
	//variance (24)
	public double variance() {
		double mean = average();
		double value = 0;
		for (double element : data) {
			value += (element - mean) * (element - mean);
		}
		return value / data.length;
	}
	
	//standardDeviation (25)
	public double standardDeviation() {
		return Math.sqrt(variance());
	}

}
