/*
 * [Stat].java
 * Author:  [Davis Klein] 
 * Submission Date:  [11/7/2021]
 *
 * Purpose: This program performs a variety of actions on an array.
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
	
	private static double[] data; //private instance variable data
	
	//default constructor creates a new array with one value of 0.0
	public Stat() {
		data = new double [1];
		data[0] = 0.0;
	}
	
	//constructors for all data types
	public Stat(double[] d) {
		int arrayLength = d.length;
		double[] newArray = new double[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}
	
	public Stat(int[] i) {
		int arrayLength = i.length;
		if (i == null) {
			double[] newArray = new double[0];
			data = newArray;
		}
		else {
			double[] newArray = new double[arrayLength];
			for (int j = 0; j < arrayLength; j++) {
				newArray[j] = i[j];
			}
			data = newArray;
		}
	}
	
	public Stat(long[] lo) {
		int arrayLength = lo.length;
		if (lo == null) {
			double[] newArray = new double[0];
			data = newArray;
		}
		else {
			double[] newArray = new double[arrayLength];
			for (int j = 0; j < arrayLength; j++) {
				newArray[j] = lo[j];
			}
			data = newArray;
		}
	}
	
	public Stat(float[] f) {
		int arrayLength = f.length;
		if (f == null) {
			double[] newArray = new double[0];
			data = newArray;
		}
		else {
			double[] newArray = new double[arrayLength];
			for (int j = 0; j < arrayLength; j++) {
				newArray[j] = f[j];
			}
			data = newArray;
		}
	}
	
	//assigns the parameter input to data
	//different methods for various data types
	public void setData(double[] d) {
		int arrayLength = d.length;
		double[] newArray = new double[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}
	
	public void setData(int[] i) {
		if (i == null) {
			double[] newArray = new double[0];
			data = newArray;
		}
		int arrayLength = i.length;
		double[] newArray = new double[arrayLength];
		for (int j = 0; j < arrayLength; j++) {
			newArray[j] = i[j];
		}
		data = newArray;
	}
	
	public void setData(long[] lo) {
		if (lo == null) {
			double[] newArray = new double[0];
			data = newArray;
		}
		int arrayLength = lo.length;
		double[] newArray = new double[arrayLength];
		for (int j = 0; j < arrayLength; j++) {
			newArray[j] = lo[j];
		}
		data = newArray;
	}
	
	public void setData(float[] f) {
		if (f == null) {
			double[] newArray = new double[0];
			data = newArray;
		}
		int arrayLength = f.length;
		double[] newArray = new double[arrayLength];
		for (int j = 0; j < arrayLength; j++) {
			newArray[j] = f[j];
		}
		data = newArray;
	}
	
	//returns an array with the values of the instance variable
	public double[] getData() {
		int arrayLength = data.length;
		double[] newArray = new double[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}
	
	//checks if the two arrays are completely equal, else returns false
	public boolean equals(Stat s) {
		double statData[] = s.getData();
		if (data.length != statData.length) {
			return false;
		}
		for (int i = 0; i < data.length; i++) {
			if (data[i] != statData[i]) {
				return false;
			}
		}
		return true;
	}
	
	//resets the instance variable data to an empty double array
	public void reset() {
		double[] newArray = new double[0];
		data = newArray;
	}
	
	//appends the input parameter data to the existing data in the data instance variable
	//different methods for different data types
	public void append(double[] d) {
		if (d != null) {
			int parameterLength = d.length;
			int dataLength = data.length;
			int arrayLength = parameterLength + dataLength;
			double[] newArray = new double[arrayLength];
			int indexHolder = 0;
			for (int i = 0; i < parameterLength; i++) {
				newArray[indexHolder] = d[i];
				indexHolder++;
			}
			for (int j = 0; j < dataLength; j++) {
				newArray[indexHolder] = data[j];
				indexHolder++;
			}
			data = newArray;
		}
	}
	
	public void append(int[] i) {
		if (i != null) {
			int parameterLength = i.length;
			int dataLength = data.length;
			int arrayLength = parameterLength + dataLength;
			double[] newArray = new double[arrayLength];
			int indexHolder = 0;
			for (int k = 0; k < parameterLength; k++) {
				newArray[indexHolder] = i[k];
				indexHolder++;
			}
			for (int j = 0; j < dataLength; j++) {
				newArray[indexHolder] = data[j];
				indexHolder++;
			}
			data = newArray;
		}
	}
	
	public void append(long[] lo) {
		if (lo != null) {
			int parameterLength = lo.length;
			int dataLength = data.length;
			int arrayLength = parameterLength + dataLength;
			double[] newArray = new double[arrayLength];
			int indexHolder = 0;
			for (int i = 0; i < parameterLength; i++) {
				newArray[indexHolder] = lo[i];
				indexHolder++;
			}
			for (int j = 0; j < dataLength; j++) {
				newArray[indexHolder] = data[j];
				indexHolder++;
			}
			data = newArray;
		}
	}
	
	public void append(float[] f) {
		if (f != null) {
			int parameterLength = f.length;
			int dataLength = data.length;
			int arrayLength = parameterLength + dataLength;
			double[] newArray = new double[arrayLength];
			int indexHolder = 0;
			for (int i = 0; i < parameterLength; i++) {
				newArray[indexHolder] = f[i];
				indexHolder++;
			}
			for (int j = 0; j < dataLength; j++) {
				newArray[indexHolder] = data[j];
				indexHolder++;
			}
			data = newArray;
		}
	}
	
	//returns true if data array has length 0, else false
	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//creates a string of the array, formatted with brackets and commas
	public String toString() {
		String dataString = "";
		for (int i = 0; i < data.length - 1; i++) {
			dataString += data[i] + ", ";
		}
		dataString += data[data.length - 1];
		dataString = "[" + dataString + "]";
		return dataString;
	}
	
	//returns the smallest double val in the array
	public double min() {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				data[i] = min;
			}
		}
		return min;
	}
	
	//returns the largest double val in the array
	public double max() {
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				data[i] = max;
			}
		}
		return max;
	}
	
	//returns the average value of the array
	public double average() {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		double avg = sum / data.length;
		return avg;
	}
	
	//returns the value that occurs the most in the array, or not
	public double mode() {
		double mode = 0.0;
		int maxMode = 0;
		for (int i = 0; i < data.length; i++) {
			int modeCount = 0;
			for (int k = 0; k < data.length; k++) {
				if (data[i] == data[k]) {
					modeCount++;
				}
			}
			if (modeCount > 0) {
				maxMode = modeCount;
				mode = data[i];
			}
		}
		if (maxMode > 1) {
			return mode;
		}
		else {
			return Double.NaN;
		}
		
	}
	
	//computes the variance of the data held in the data instance variable
	public static double variance() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double sum = 0;
			for (int i = 0; i < data.length; i++) {
				sum += data[i];
			}
			double mean = sum / data.length;
			double variance = 0;
			for (int i = 0; i < data.length; i++) {
				variance += (Math.abs(data[i] - mean)) * (Math.abs(data[i] - mean));
			}
			variance = variance / data.length;
			return variance;
		}
	}
	
	//returns the standard deviation of the data held in data
	public double standardDeviation() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double variance = Stat.variance();
			return Math.sqrt(variance);
		}
	}
}
