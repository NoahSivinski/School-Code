/*
 * Stat.java
 * Author:  Sunny Shah 
 * Submission Date:  04/10/2021
 *
 * Purpose: This class stores an array of double values called data. This program will implement public methods to 
 * compute the min, max, mode, and average of these values. This program will also implement methods to “get” and 
 * “set” the values held by data. The data is a private instance variable, meaning that each instance
 *  of the Stat class has its own copy of the data variable
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

	private double data[];

	//creates a double array with a element of 0.0
	public Stat() {

		data = new double[1];
		data [0] = 0.0;

	}

	//copies values from d to a new array dTwo
	public Stat(double[] d) {

		double[] dTwo = new double[d.length];

		//copies values from d to a new array dTwo
		for (int i = 0; i < d.length; i++) 
		{
			dTwo[i] = d[i];
		}

		//reference of dTwo to data
		data = dTwo;
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

	//copies values from d to dFour
	public void setData(double[] d) {

		double[] dFour = new double[d.length];

		//copies values from d to dFour
		for (int i = 0; i < d.length; i++) 
		{
			dFour[i] = d[i];
		}

		//reference of dFour to data
		data = dFour;
	}

	//Checks if the arrays contain the same values in the same order
	public boolean equals(Stat s) {

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

	//Returns the average of the data array
	public double average() {

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

		double modeData = data[0];
		int frequency = 0; //number of occurrences of the value

		//finds the most occurring value
		for (int i = 0; i < data.length; i++) 
		{
			int counter = 0; //counter increases each time a value matches to calculate the amount of frequency

			//compares each value of the data to all the other values
			for (int z = 0; z < data.length; z++) 
			{
				if (data[i] == data[z])
				{
					counter++;
				}
			}

			if (counter > frequency)
			{
				frequency = counter;
				modeData = data[i];
			}
		}

		//checks if there is another value that occurs the same amount of time as the value preceding it
		for (int i = 0; i < data.length; i++)
		{
			int counter = 0; //counter increases each time a value matches to calculate the amount of frequency

			//compares each value of the data except the first most occurring value to all the other values
			if (data[i] != modeData)
			{
				for (int z = 0; z < data.length; z++)
				{
					if (data[i] == data[z])
						counter++;
				}
			}

			//if all of the values occur once or if more than 1 values occur the same frequency, then return NaN
			if (counter == frequency)
				return Double.NaN;
		}

		return modeData;
	}
}


