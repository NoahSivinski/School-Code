/*
 * [Stat].java
 * Author:  [Kritika Rao] 
 * Submission Date:  [11/12/21]
 *
 * Purpose: This program can look at arrays and can find different
 * data values. The program can find the minimum value, 
 * the maximum value, the average of all values, and the
 * mode. Once the program finds that value based on the
 * method call, the program will print out the correct
 * data value. 
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

	//default constructor
	public Stat() {
		data = new double[0];
		//data[0] = 0.0;

	}
	//constructor with double[] parameter
	public Stat(double[] d) {
		if(d != null) {
		double[] newArray = new double[d.length];
		//putting all values in array d, in array newArray
		for(int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		//initializing instance variable
		data = newArray; }
		else {
			double[] newArray = new double[0];
			data = newArray;
		}

	}
	//Stat constructor with int[] parameter
	public Stat(int[] i) {
		if(i != null) {
			double[] newArray = new double[i.length];
			for(int j = 0; j < i.length; j++) {
				newArray[j] = i[j];
			}
			data = newArray;
		}
		else {

			double[] newArray = new double[0];
			data = newArray;
		}
	}
	//Stat constructor with long[] parameter
	public Stat (long[] lo) {
		if(lo != null) {
			double[] newArray = new double[lo.length];
			for(int i = 0; i < lo.length; i++) {
				newArray[i] = lo[i];
			}
			data = newArray;
		}
		else {

			double[] newArray = new double[0];
			data = newArray;
		}
	}
	//Stat constructor with float[] parameter
	public Stat (float[] f) {
		if(f != null) {
			double[] newArray = new double[f.length];
			for(int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
			data = newArray;
		}
		else {

			double[] newArray = new double[0];
			data = newArray;
		}

	}

	//getter method
	public double[] getData() {
		//creating a new array that will store the same values as the data array 
		double[] newArray = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		} 
		//returning reference to the new array that was created 
		return newArray;


	}
	//Mutator method with double[] parameter 
	public void setData(double[] d) {
		//creating a new array containing exactly the elements of d and assigning it to
		//data a reference to the new array
		if(d != null) {
			double[] newArray = new double[d.length];
			for(int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}
			data = newArray;
		}
		else {

			double[] newArray = new double[0];
			data = newArray;
		}
	}
	//Mutator method with int[] parameter
	public void setData(int[] i) {
		if(i != null) {
			double[] newArray = new double[i.length];
			for(int j = 0; j < i.length; j++) {
				newArray[j] = i[j];
			}
			data = newArray;
		}
		else {

			double[] newArray = new double[0];
			data = newArray;
		}
	}
	//Mutator method with long[] parameter
	public void setData (long[] lo) {
		if(lo != null) {
			double[] newArray = new double[lo.length];
			for(int i = 0; i < lo.length; i++) {
				newArray[i] = lo[i];
			}
			data = newArray;
		}
		else {

			double[] newArray = new double[0];
			data = newArray;
		}
	}
	//Mutator method with float[] parameter
	public void setData (float[] f) {
		if(f != null) {
			double[] newArray = new double[f.length];
			for(int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
			data = newArray;
		}
		else {
			double[] newArray = new double[0];
			data = newArray;
		}

	}

	//Returns the boolean value true if the data objects of both the calling
	//Stat object and the passed Stat object s have the same values (and in the same order).
	//Otherwise, it returns false. 
	public boolean equals(Stat s) {
		if(s == null) {
			return false;
		}
		else if(s.getData().length == 0){
			return false;
		}
		else if(s.data.length != data.length) {
			return false;
		}
		else {
		boolean checker = true;
		double[] sData = s.getData();
		for(int i = 0; i < data.length && checker == true; i++) {
			if(data[i] == sData[i]) {
				checker = true;
			}
			else {
				checker = false;
			}
		}
		return checker;
		}
	}
	//This clears the data array. A new empty double array is created and assigned to data.
	public void reset() {
		double[] newArray = new double[0];
		data = newArray;
	}
	
	//create a new double array containing exactly those elements of data followed by those of 
	//the array passed as parameter, If the parameter is null, then nothing is done
	public void append(double[] d) {
		if(d!= null) {
			double[] newArray = new double[(d.length + data.length)];
			for(int i = 0; i < data.length; i++) {
				newArray[i] = data[i];
			}
			int i = 0;
			for(int j = data.length; j < newArray.length; j++) {
				newArray[j] = d[i];
				i++;
			}
			data = newArray;
		}

	}
	//create a new double array containing exactly those elements of data followed by those of 
	//the array passed as parameter, If the parameter is null, then nothing is done
	public void append(int[] i) {
		if(i!= null) {
			double[] newArray = new double[(i.length + data.length)];
			for(int j = 0; j < data.length; j++) {
				newArray[j] = data[j];
			}
			int k = 0;
			for(int j = data.length; j < newArray.length; j++) {

				newArray[j] = i[k];
				k++;
			}
			data = newArray;
		}
	}
	//create a new double array containing exactly those elements of data followed by those of 
	//the array passed as parameter, If the parameter is null, then nothing is done
	public void append (long[] lo) {
		if(lo!= null) {
			double[] newArray = new double[(lo.length + data.length)];
			for(int j = 0; j < data.length; j++) {
				newArray[j] = data[j];
			}
			int i = 0;
			for(int j = data.length; j < newArray.length; j++) {
				newArray[j] = lo[i];
				i++;
			}
			data = newArray;
		}
	}
	//create a new double array containing exactly those elements of data followed by those of 
	//the array passed as parameter, If the parameter is null, then nothing is done
	public void append(float[] f) {
		if(f!= null) {
			double[] newArray = new double[(f.length + data.length)];
			for(int j = 0; j < data.length; j++) {
				newArray[j] = data[j];
			}
			int i = 0;
			for(int j = data.length; j < newArray.length; j++) {

				newArray[j] = f[i];
				i++;
			}
			data = newArray;
		}
	}
	//returns the boolean value true if the data object is empty (has length 0). Otherwise, it returns false
	public boolean isEmpty() {
		if(data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	//Returns a String representation of the data elements stored in the Stat object.
	//Use the samples listed below as guidelines for formatting.
	public String toString() {
		String dataValues = "[";
		if(data.length == 0) {
			return "[]";
		}
		else {

			for(int i = 0; i < data.length - 1; i++) {
				dataValues += data[i] + ", ";
			}
			dataValues += data[data.length - 1] + "]";
			return dataValues;
		}
	}
	//Returns the minimum of the data array.
	public double min() {
		if(data.length == 0) {
			return Double.NaN;
		}
		else {
			double minValue;
			int arrayFirstIndex = 0;
			minValue = data[arrayFirstIndex];
			for(int i = 0; i < data.length; i++) {
				if(data[i] < minValue) {
					minValue = data[i];
				}
			}
			return minValue;
		}

	}
	//Returns the maximum of the data array
	public double max() {
		if(data.length == 0) {
			return Double.NaN;
		}
		else {
			double maxValue;
			int arrayFirstIndex = 0;
			maxValue = data[arrayFirstIndex];
			for(int i = 0; i < data.length; i++) {
				if(data[i] > maxValue) {
					maxValue = data[i];
				}
			}
			return maxValue;
		}

	}
	//Returns the average of the data array. 
	public double average() {
		if(data.length == 0) {
			return Double.NaN;
		}
		else {
			double sum = 0;
			for(int i = 0; i < data.length; i++) {
				sum += data[i];
			}
			double average = sum / data.length;
			return average;
		}
	}
	//returns the value that occurs the most in the array
	//if no mode is found, returns NaN
	public double mode() {
		if(data.length != 0) {
			double mode = 0;
			int mostFrequent = 0;
			for (int i = 0; i < data.length; i++)   
			{  
				int frequency = 1;
				for (int j = i + 1; j < data.length; j++)   
				{  
					if(data[i] == data[j]) {
						frequency++;
					}
				}

					if(frequency > mostFrequent) {
						mostFrequent = frequency;
						mode = data[i];
					}
					else if(mostFrequent == frequency) {
						mode = Double.NaN;
					}
				
			} 
			return mode;
		}
		else {
			return Double.NaN;
		}
	}
	//Returns the variance of the data in the data array
	public double variance() {
		if(data.length != 0) {
			double average = average();
			double distanceSum = 0;
			
			for(int i = 0; i < data.length; i++) {
				distanceSum += Math.pow((data[i] - average), 2);
			}
			double theVariance = distanceSum / data.length; 
			return theVariance; 
		}
		else {
			return Double.NaN;
		}
	}
	//Returns the square root of the variance
	public double standardDeviation() {
		if(data.length != 0) {
			double theVariance = variance();
			double theSD = Math.sqrt(theVariance);
			return theSD;
		}
		else {
			return Double.NaN;
		}
	}



	public static void main(String[] args) {
		double[] data1 = {};
		double[] data2 = { 25 };
		float[] data3 = {};
		float[] data4 = { 25 };
		int[] data5 = {};
		int[] data6 = { 50 };
		long[] data7 = {};
		long[] data8 = { 12 };
		Stat stat1 = new Stat();
		stat1.append(data1);
		stat1.append(data2);
		stat1.append(data3);
		stat1.append(data4);
		stat1.append(data5);
		stat1.append(data6);
		stat1.append(data7);
		stat1.append(data8);
		data1 = null;
		stat1.append(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
	}

}

