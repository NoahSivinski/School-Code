/*
 * Stat.java
 * Author:  Malinda Uboh
 * Submission Date: 11/12/2021
 *
 * Purpose: This program uses the Stat class, that is based off
 * of a given UML diagram and given method descriptions, to 
 * store an array of double values declared data. This program 
 * uses these values to execute the methods below. 
 *
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

	// declare instance variable of the class
	private double[] data;

	// create double array with a length of zero
	public Stat() {

		data = new double[0];

	}

	// construct a Stat object using the values held in d
	public Stat(double[] d) {

		if (d == null) {
			data = new double[0];
		}

		else {

			double[] valuesOfParameter = new double[d.length];

			for (int j = 0; j < d.length; j++) {
				valuesOfParameter[j] = d[j];
			}

			data = valuesOfParameter;
		}

	}

	// construct a Stat object using the values held in i
	public Stat(int[] i) {

		if (i == null) {
			data = new double[0];
		}

		else {

			double[] valuesOfParameter = new double[i.length];

			for (int j = 0; j < i.length; j++) {
				valuesOfParameter[j] = i[j];
			}

			data = valuesOfParameter;
		}

	}
	// construct a Stat object using the values held in lo
	public Stat(long[] lo) {

		if (lo == null) {
			data = new double[0];
		}

		else {

			double[] valuesOfParameter = new double[lo.length];

			for (int j = 0; j < lo.length; j++) {
				valuesOfParameter[j] = lo[j];
			}

			data = valuesOfParameter;
		}

	}
	// construct a Stat object using the values held in f
	Stat(float[] f) {

		if (f == null) {
			data = new double[0];
		}

		else {

			double[] valuesOfParameter = new double[f.length];

			for (int j = 0; j < f.length; j++) {
				valuesOfParameter[j] = f[j];
			}

			data = valuesOfParameter;
		}

	}

	// create a new double array containing the elements d
	public void setData(double[] d) {

		if (d != null) {

			double[] elementsOfParameter = new double[d.length];

			for (int j = 0; j < d.length; j++) {
				elementsOfParameter[j] = d[j];
			}
			data = elementsOfParameter;
		}

		else {

			data = new double[0];

		}
	}
	// create a new double array containing the elements i
	public void setData(int[] i) {
		
		if (i != null) {

			double[] elementsOfParameter = new double[i.length];

			for (int j = 0; j < i.length; j++) {
				elementsOfParameter[j] = i[j];
			}
			data = elementsOfParameter;
		}

		else {

			data = new double[0];

		}
	}
	// create a new double array containing the elements lo
	public void setData(long[] lo) {

		if (lo != null) {

			double[] elementsOfParameter = new double[lo.length];

			for (int j = 0; j < lo.length; j++) {
				elementsOfParameter[j] = lo[j];
			}
			data = elementsOfParameter;
		}

		else {

			data = new double[0];

		}
	}
	// create a new double array containing the elements f
	public void setData(float[] f) {

		if (f != null) {

			double[] elementsOfParameter = new double[f.length];

			for (int j = 0; j < f.length; j++) {
				elementsOfParameter[j] = f[j];
			}
			data = elementsOfParameter;
		}

		else {

			data = new double[0];

		}
	}

	// retrieve the values of data
	public double[] getData() {

		double[] valuesOfData = new double[data.length];

		for (int j = 0; j < data.length; j++) {
			valuesOfData[j] = data[j];
		}
		return valuesOfData;
	}

	// Return true if both objects have the same values in the same order
	public boolean equals(Stat s) {

		if (s == null) {
			return false;
		}
		
		if (data.length != s.data.length) {
			return false;
		}

		for (int j = 0; j < data.length; j++) {
			if (data[j] != s.data[j]) {
				return false;
			}
		}
		return true;

	}
	//clear the data array
	public void reset() {

		double[] clearArray = new double[0];

		data = clearArray;

	}
	
	//return the elements of data followed by the elements of d
	public void append(double[] d) {

	if (d != null) {

			double[] combinedElements = new double[data.length + d.length];

			for (int j = 0; j < data.length; j++) {
				combinedElements[j] = data[j];
			}

			for (int j = 0; j < d.length; j++) {
				combinedElements[data.length + j] = d[j];

			}
			data = combinedElements;
		}
	else { 
		return;
	}

	}
	//return the elements of data followed by the elements of i
	public void append(int[] i) {

		if (i != null)  {

			double[] combinedElements = new double[data.length + i.length];

			for (int j = 0; j < data.length; j++) {
				combinedElements[j] = data[j];
			}

			for (int j = 0; j < i.length; j++) {
				combinedElements[data.length + j] = i[j];

			}
			data = combinedElements;

		}
		else { 
			return;
		}

	}
	//return the elements of data followed by the elements of lo
	public void append(long[] lo) {

		if (lo != null) {

			double[] combinedElements = new double[data.length + lo.length];

			for (int j = 0; j < data.length; j++) {
				combinedElements[j] = data[j];
			}

			for (int j = 0; j < lo.length; j++) {
				combinedElements[data.length + j] = lo[j];

			}
			data = combinedElements;

		}
		else { 
			return;
		}

	}
	//return the elements of data followed by the elements of f
	public void append(float[] f) {

		if (f != null) {

			double[] combinedElements = new double[data.length + f.length];

			for (int j = 0; j < data.length; j++) {
				combinedElements[j] = data[j];
			}

			for (int j = 0; j < f.length; j++) {
				combinedElements[data.length + j] = f[j];

			}
			data = combinedElements;

		}
		else { 
			return;
		}

	}
//returns true if the data object has a length of zero, false otherwise
	public boolean isEmpty() {

		if (data.length == 0) {
			return true;

		}
		return false;

	}

	// return string representation of data elements stored in the Stat object
	public String toString() {

		String statData = "";

		for (int i = 0; i < data.length; i++) {

			if (i == data.length - 1) {
				statData += data[i];
			}

			else {
				statData += data[i] + ", ";
			}
		}
		return ("[" + statData + "]");
	}

	// return minimum value in the data array
	public double min() {

		if (isEmpty()) {

			return Double.NaN;
		}

	else {
		double min = data[0];

		for (int i = 0; i < data.length; i++) {

			if (min > data[i]) {
				min = data[i];
			}

		}
		return min;
		}
	}

	// return maximum value in the data array
	public double max() {

		if (isEmpty()) {

			return Double.NaN;
		}

		else {	
		double max = data[0];

		for (int i = 0; i < data.length; i++) {

			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
		}
		
		

	}

	// return the average of the data array
	public double average() {

		if (isEmpty()) {

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

	// return the mode of the data array
	public double mode() {

		if (isEmpty()) {

			return Double.NaN;
		}

		else {
			
		
		double threshold = .000000001;
		double mode = 0;
		int frequencyCountOfMostFreq = 0;
		for (int i = 0; i < data.length; i++) {
			int frequencyCounter = 1;
			for (int j = i + 1; j < data.length; j++) {
				if (Math.abs(data[j] - data[i]) < threshold) {
					frequencyCounter++;
				}
			}
			if (frequencyCounter > frequencyCountOfMostFreq) {
				frequencyCountOfMostFreq = frequencyCounter;
				mode = data[i];
			} else if (frequencyCounter == frequencyCountOfMostFreq) {
				mode = Double.NaN;
			}

		}
		return mode;
		}
	}

	//Returns the variance of the data in the data array.
	public double variance() {
		
		if (isEmpty()) {

			return Double.NaN;
		}
		else {
		double mean = average();
		double differenceSquared = 0;

		for (int z = 0; z < data.length; z++) {

			differenceSquared += (data[z] - mean) * (data[z] - mean);

		}

		double variance = differenceSquared / data.length;
		return variance;
		}
	}
  // Returns the square root of the variance
	public double standardDeviation() {
		if (isEmpty()) {

			return Double.NaN;
		}
		
		else {
		double stanDev = Math.sqrt(variance());
		return stanDev;
		}
	}
	
	
	
}
