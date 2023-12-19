/*
 * Stat.java
 * Author:  Justin Hesse 
 * Submission Date:  4/16/2021
 *
 * Purpose: Contains methods for a Stat object.
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

	// Stat - default constructor 
	public Stat(){
		data = new double [0];
		//data[0] = 0.0;
	}

	// Stat - constructor method for creating a Stat object using d[]. Overloaded for multiple array types.
	public Stat(double[] d) {
		if (d != null) {
			data = new double [d.length];
			for (int i = 0; i < d.length; i++) {
				data [i] = d [i];
			}
		}
		else {
			data = new double[0];
		}
	}

	public Stat(float[] f) {
		if (f != null) {
			data = new double [f.length];
			for (int i = 0; i < f.length; i++) {
				data [i] = f [i];
			}
		}
		else {
			data = new double[0];
		}
	}

	public Stat(int[] i) {
		if (i != null) {
			data = new double [i.length];
			for (int j = 0; j < i.length; j++) {
				data [j] = i [j];
			}
		}
		else {
			data = new double[0];
		}

	}

	public Stat(long[] lo) {
		if(lo != null) {
			data = new double [lo.length];
			for (int i = 0; i < lo.length; i++) {
				data [i] = lo [i];
			}
		}
		else {
			data = new double [0];
		}
	}

	// getData - Returns a reference to a copy of data[]
	public double[] getData() {
		double[] dataCopy;
		if(data.length == 0) {
			dataCopy = new double[0];
		}
		else {
			dataCopy = new double[data.length];
			for (int i = 0; i < data.length; i++) {
				dataCopy[i] = data[i];
			}
		}
		return dataCopy;
	}

	// setData - allows the modification of data[] by passing another array d[]. Overloaded for multiple array types.
	public void setData(double[] d) {
		if(d != null) {
			data = new double [d.length];
			for (int i = 0; i < d.length; i++) {
				data[i] = d[i];
			}
		}
		else {
			data = new double[0];
		}
	}

	public void setData(int[] i) {
		if(i != null) {
			data = new double [i.length];
			for (int j = 0; j < i.length; j++) {
				data[j] = i[j];
			}
		}
		else {
			data = new double[0];
		}
	}

	public void setData(long[] lo) {
		if(lo != null) {
			data = new double [lo.length];
			for (int i = 0; i < lo.length; i++) {
				data[i] = lo[i];
			}
		}
		else {
			data = new double[0];
		}
	}

	public void setData(float[] f) {
		if(f != null) {
			data = new double [f.length];
			for (int i = 0; i < f.length; i++) {
				data[i] = f[i];
			}
		}
		else {
			data = new double[0];
		}
	}

	// equals - tests if two arrays are logically equivalent
	// returns true if both arrays have the same length and contain
	// the same values in the same order
	public boolean equals(Stat s) {
		if(s != null) {
			double[] sValues = s.getData();
			if(sValues.length != data.length) {
				return false;
			}
			for (int i = 0; i < sValues.length; i++) {
				if (Math.abs(sValues[i] - data[i]) > 0.000000001) {
					return false;
				}
			}
		}
		else {
			return false;
		}
		return true;
	}
	
	// reset - Clears the data array by creating a new empty array and assigning it to data[]
	public void reset() { 
		double [] emptyData = new double [0];
		data = emptyData;
	}

	// append - adds the elements of the passed array onto data[]. Overloaded for multiple array types.
	public void append(double[] d) {		
		if(d != null) {
			double[] appendHelper = new double[d.length + data.length];
			for (int i = 0; i <= 1; i++) {		//Outer loop controls which array is being added to appendHelper
				if (i == 0) {
					for(int j = 0; j < data.length; j++) {	//This loop assigns the values of data[] to appendHelper[]
						appendHelper[j] = data[j];
					}
				}
				else if(i == 1) {
					for(int k = 0; k < d.length; k++) {		//This loop assigns the values of the passed array to appendHelper[]
						appendHelper[data.length + k] = d[k];
					}			
				}
			}
			data = appendHelper;
		}
	}

	public void append(int[] i) {
		if(i != null) {
			double[] appendHelper = new double[i.length + data.length];
			for (int j = 0; j <= 1; j++) {
				if (j == 0) {
					for(int k = 0; k < data.length; k++) {
						appendHelper[k] = data[k];
					}
				}
				else if(j == 1) {
					for(int h = 0; h < i.length; h++) {
						appendHelper[data.length + h] = i[h];
					}			
				}
			}
			data = appendHelper;
		}
	}

	public void append(long[] lo) {
		if(lo != null) {
			double[] appendHelper = new double[lo.length + data.length];
			for (int i = 0; i <= 1; i++) {
				if (i == 0) {
					for(int j = 0; j < data.length; j++) {
						appendHelper[j] = data[j];
					}
				}
				else if(i == 1) {
					for(int k = 0; k < lo.length; k++) {
						appendHelper[data.length + k] = lo[k];
					}			
				}
			}
			data = appendHelper;
		}
	}

	public void append(float[] f) {
		if(f != null) {
			double[] appendHelper = new double[f.length + data.length];
			for (int i = 0; i <= 1; i++) {
				if (i == 0) {
					for(int j = 0; j < data.length; j++) {
						appendHelper[j] = data[j];
					}
				}
				else if(i == 1) {
					for(int k = 0; k < f.length; k++) {
						appendHelper[data.length + k] = f[k];
					}			
				}
			}
			data = appendHelper;
		}
	}
	
	// isEmpty - returns true if data[] has a length of 0. Returns false otherwise
	public boolean isEmpty() {
		if(data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	// toString returns the values of data[] as a formatted String
	public String toString() {
		String statString ="[";
		for (int i = 0; i < data.length; i++) {
			if (i != data.length - 1) {
				statString = statString + data[i] + ", ";
			}
			else {
				statString = statString + data[i];
			}
		}
		return statString + "]";
	}

	// min - returns the smallest value in data[]
	public double min() {
		if (data.length != 0) {
			double min = data[0];
			for(int i = 1; i < data.length; i++) {
				if (data[i] < min) {
					min = data[i];
				}
			}
			return min;
		}
		else {
			return Double.NaN;
		}
	}

	// max - returns the largest value in data[]
	public double max() {
		if (data.length != 0) {
			double max = data[0];
			for(int i = 1; i < data.length; i++) {
				if (data[i] > max) {
					max = data[i];
				}
			}
			return max;
		}
		else {
			return Double.NaN;
		}
	}

	// average - returns the average of all values in data[]
	public double average() {
		if (data.length != 0) {
			double average = 0;
			for(int i = 0; i < data.length; i++) {
				average = average + data[i];
			}
			return average / data.length;
		}
		else {
			return Double.NaN;
		}
	}

	// mode - returns the most frequently occurring value in data[]
	// If there is no mode or there are multiple modes, returns Double.NaN
	public double mode() {
		if (data.length != 0) {
			double finalMode = 0;
			double finalCount = 0;
			for (int i = 0; i < data.length; i++) {	//Outer loop used to set currentMode and currentCount for each value of data[]
				double currentMode = data[i];
				double currentCount = 1;
				for(int j = i + 1; j < data.length; j++) { //Inner loop used to compare currentMode to every other value of data[]
					if (Math.abs(data[j] - currentMode) < 0.000000001) {
						currentCount++;
					}
				}
				if (currentCount > finalCount) {  //Compares currentCount to finalCount after each value is tested
					finalCount = currentCount;	//assigns finalCount and finalMode new values if the previously tested value occurred
					finalMode = currentMode;	//more frequently
				}
				else if (currentCount == finalCount) {
					finalMode = Double.NaN;		//if there is no unique value, finalMode is assigned the value of Double.NaN
				}
			}
			return finalMode;
		}
		else {
			return Double.NaN;
		}
	}


	// variance - returns the variance of the data in the data array
	public double variance() {
		if (data.length != 0) {
			double variance = 0;
			double sumOfSquares = 0;			
			double distanceToMean = 0;			
			for (int i = 0; i < data.length; i++){
				distanceToMean = data[i] - this.average();
				sumOfSquares = sumOfSquares + (distanceToMean * distanceToMean);
			}
			variance = sumOfSquares / data.length;
			return variance;
		}
		else {
			return Double.NaN;
		}
	}
	
	// standardDeviation - Returns the square root of the variance
	public double standardDeviation() {
		if (data.length != 0) {
			return Math.sqrt(this.variance());
		}
		else {
			return Double.NaN;
		}
	}

}
