/*
 * Stat.java
 * Author:  Sunny Shah 
 * Submission Date:  04/16/2021
 *
 * Purpose: This class stores an array of double values called data. This program will implement public methods to 
 * compute the min, max, mode, and average of these values. This program will also implement methods to “get” and 
 * “set” the values held by data. The data is a private instance variable, meaning that each instance
 * of the Stat class has its own copy of the data variable. This program is then modified to overload the setData
 * method, creating versions that use arrays of int, long, and float values as parameters and handles null parameters
 * properly. This program will also define an additional set of methods, all called append, to add new values to the 
 * underlying data array. The class will also be modified to handle methods invoked with null as a parameter. 
 * This program will also implement methods to compute the variance and standard deviation of the stored data values.
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

	//The default constructor for Stat. double array having length 0.
	public Stat() {

		data = new double[0];

	}

	//Stat(double[] d), Stat(int[] i), Stat(long[] lo), Stat(float[] f)
	//Constructs a Stat object using the values held in the parameter array. 
	//Invoking the constructor creates a double array of the same length as the parameter array and 
	//holding copies of its values. A reference to this new array is assigned to data. 
	//if the parameter is null, then an empty array is assigned to data.

	//copies values from d to a new array dTwo
	public Stat(double[] d) {

		if(d == null)
		{
			data = null;
		}
		else
		{
			double[] dTwo = new double[d.length];

			//copies values from d to a new array dTwo
			for (int i = 0; i < d.length; i++) 
			{
				dTwo[i] = d[i];
			}

			//reference of dTwo to data
			data = dTwo;
		}
	}

	public Stat(float[] f) {

		if(f == null)
		{
			data = null;
		}
		else
		{
			data = new double[f.length];

			for(int i = 0; i < f.length; i++)
			{
				data[i] = f[i];
			}
		}
	}

	public Stat(int[] i) {

		if(i == null)
		{
			data = null;
		}
		else
		{
			data = new double[i.length];

			for(int z = 0; z < i.length; z++)
			{
				data[z] = i[z];
			}
		}
	}

	public Stat(long[] lo) {

		if(lo == null)
		{
			data = null;
		}
		else
		{
			data = new double[lo.length];

			for(int i = 0; i < lo.length; i++)
			{
				data[i] = lo[i];
			}
		}
	}

	//setData(double[] d), setData(int[] i), setData(long[] lo), setData(float[] f)
	//these methods are used to set the values of the data array. if the array used as parameter 
	//is not null, then each of these methods create a new double array containing exactly the elements 
	//of the parameter array. A reference to this new array is assigned to data. If the parameter is null,
	//then an empty array is assigned to data.
	public void setData(float[] f) {

		if(f == null)
		{
			this.data = new double[0];
			return;
		}
		else
		{
			data = new double[f.length];

			for(int i = 0; i < f.length; i++)
			{
				data[i] = f[i];
			}
		}
	}

	// create a new array containing exactly the elements of d and assign to
	// data a reference to this new array
	//copies values from d to dFour
	public void setData(double[] d) {

		if(d == null)
		{
			this.data = new double[0];
			return;
		}
		else
		{

			double[] dFour = new double[d.length];

			//copies values from d to dFour
			for (int i = 0; i < d.length; i++) 
			{
				dFour[i] = d[i];
			}

			//reference of dFour to data
			data = dFour;
		}
	}

	public void setData(int [] i) {

		if(i == null)
		{
			this.data = new double[0];
			return;
		}
		else
		{
			data = new double[i.length];

			for(int z = 0; z < i.length; z++)
			{
				data[z] = i[z];
			}
		}
	}

	public void setData(long [] lo) {

		if(lo == null)
		{
			this.data = new double[0];
			return;
		}
		else
		{
			data = new double[lo.length];

			for(int i = 0; i < lo.length; i++)
			{
				data[i] = lo[i];
			}
		}
	}

	//copies values from data to a new array dThree
	public double[] getData() {

		double[] dThree = new double[data.length];

		//copies values from data to a new array dThree
		for (int i = 0; i < data.length; i++)
		{
			dThree[i] = data[i];
		}

		return dThree;
	}

	//Checks if the arrays contain the same values in the same order
	public boolean equals(Stat s) {

		if(s == null)
		{
			return false;
		}

		double sData[] = s.getData();

		//returns false if the arrays' don't have the same length
		if (data.length != sData.length)
		{
			return false;
		}

		//returns false if the arrays' values don't match
		for (int i = 0; i < data.length; i++)
		{
			if (data[i] != sData[i])
			{
				return false;
			}
		}

		return true;
	}

	//This clears the data array. A new empty double array is created and assigned to data
	public void reset() {

		double dThree[] = new double[0];
		data = dThree;
	}

	//append(double[] d), append(int[] i), append(long[] lo), append(float[] f)
	//These methods create a new double array containing exactly those 
	//elements of data followed by those of the array passed as parameter. A reference to this array
	//is assigned to data. If the parameter is null, then no new arrays are created.
	public void append(int[] i) {

		if(i == null)
		{
			return;
		}

		double dThree[] = new double[data.length + i.length];

		for(int z = 0; z < data.length; z++)
		{
			dThree[z] = data[z];
		}

		for(int z = 0; z < i.length; z++)
		{
			dThree[data.length + z] = i[z];
		}
		data = dThree;
	}

	public void append(float[] f) {

		if(f == null)
		{
			return;
		}

		double dThree[] = new double[data.length + f.length];

		for(int i = 0; i < data.length; i++)
		{
			dThree[i] = data[i];
		}

		for(int i = 0; i < f.length; i++)
		{
			dThree[data.length + i] = f[i];
		}
		data = dThree;
	}

	public void append(long[] lo) {

		if(lo == null)
		{
			return;
		}

		double dThree[] = new double[data.length + lo.length];

		for(int i = 0; i < data.length; i++)
		{
			dThree[i] = data[i];
		}

		for(int i = 0; i < lo.length; i++)
		{
			dThree[data.length + i] = lo[i];
		}
		data = dThree;
	}

	public void append(double[] d) {

		if(d == null)
		{
			return;
		}

		double dThree[] = new double[data.length + d.length];

		for(int i = 0; i < data.length; i++)
		{
			dThree[i] = data[i];
		}

		for(int i = 0; i < d.length; i++)
		{
			dThree[data.length + i] = d[i];
		}
		data = dThree;
	}

	//returns the boolean value true if the data object is empty (has length 0). 
	//Otherwise, it returns false
	public boolean isEmpty() {

		if (this.data.length == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	//Returns a string containing the values in the Stat object
	public String toString() {

		String stringData = "";

		//stores the values in stringData
		for (int i = 0; i < data.length; i++)
		{
			//for the last value. does not put a comma
			if (i == data.length - 1)
			{
				stringData = stringData + data[i];
			}
			//until last value
			else
			{
				stringData = stringData + data[i] + ", ";
			}
		}

		return "[" + stringData + "]";

	}

	//Returns the minimum of the data array
	public double min() {

		//If the array is empty, then it returns Double.NaN.
		if(isEmpty())
		{
			return Double.NaN;
		}

		double minData = data[0];

		//Compares each value in data.
		for (int i = 0; i < data.length; i++)
		{
			if (minData > data[i])
			{
				minData = data[i];
			}
		}

		return minData;
	}

	//Returns the maximum of the data array
	public double max() {

		//If the array is empty, then it returns Double.NaN.
		if(isEmpty())
		{
			return Double.NaN;
		}

		double maxData = data[0];

		//Compares each value in data.
		for (int i = 0; i < data.length; i++) 
		{
			if (maxData < data[i])
			{
				maxData = data[i];
			}
		}

		return maxData;
	}

	//average method
	public double average() {

		//If the array is empty, then it returns Double.NaN.
		if(isEmpty())
		{
			return Double.NaN;
		}

		double total = 0; // total of all the values

		//adds all the values
		for (int i = 0; i < data.length; i++) 
		{
			total = total + data[i];
		}

		double averageData = (total / data.length); //average

		return averageData;
	}

	//Returns most occurring value
	//First the program finds the most occurring value, then checks if there is another 
	//value that occurs the same amount of time as the value preceding it. If there is 
	//then the program returns NaN. Also returns NaN, if all of the values occur only once.
	public double mode() {

		double modeData = 0;
		if (this.data.length > 0) 
		{
			modeData = this.data[0];
		}
		//If the array is empty, then it returns Double.NaN.
		else
		{
			return Double.NaN;
		}

		int frequency = 0; //number of occurrences of the value

		//finds the most occurring value
		for (int i = 0; i < this.data.length; i++) 
		{
			int counter = 0; //counter increases each time a value matches to calculate the amount of frequency

			//compares each value of the data to all the other values
			for (int z = 0; z < this.data.length; z++) 
			{
				if (this.data[i] == this.data[z])
				{
					counter++;
				}
			}

			if (counter > frequency)
			{
				frequency = counter;
				modeData = this.data[i];
			}
		}

		//checks if there is another value that occurs the same amount of time as the value preceding it
		for (int i = 0; i < this.data.length; i++)
		{
			int counter = 0; //counter increases each time a value matches to calculate the amount of frequency

			//compares each value of the data except the first most occurring value to all the other values
			if (this.data[i] != modeData)
			{
				for (int z = 0; z < this.data.length; z++)
				{
					if (this.data[i] == this.data[z])
						counter++;
				}
			}

			//if all of the values occur once or if more than 1 values occur the same frequency, then return NaN
			if (counter == frequency)
				return Double.NaN;
		}

		return modeData;
	}

	//Returns the number of times the value occurs in the data array.
	private int occursNumberOfTimes(double value) {

		int counter = 0;

		for(int i = 0; i < data.length; i++)
		{
			if(data[i] == value)
			{
				counter++;
			}
		}

		return counter;
	}

	//Returns the variance of the data in the data array. To compute variance, find 
	//the difference between the value of each element of the data array and the mean, square this distance, 
	//and then sum these squared values. The variance is this sum divided by the number of elements in data.
	public double variance() {

		//if the data array is empty, then Double.NaN is returned. 
		if(isEmpty())
		{
			return Double.NaN;
		}

		double average = average();
		double total = 0;

		for(int i=0; i<data.length; i++)
		{
			total = total + (data[i] - average) * (data[i] - average);
		}

		double variance = total / data.length;

		return variance;
	}

	//Returns the square root of the variance. 
	public double standardDeviation() {

		//If the data array is empty, then Double.NaN is returned.
		if(isEmpty())
		{
			return Double.NaN;
		}
		else
		{
			return Math.sqrt(variance());
		}
	}
}