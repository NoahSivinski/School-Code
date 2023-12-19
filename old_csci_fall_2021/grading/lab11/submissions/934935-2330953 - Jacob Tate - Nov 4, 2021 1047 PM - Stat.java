/**
 * File name: Stat.java
 * Author: Jacob Tate
 * Submission Date: Thursday, November 4th, 2021.
 *
 *This program allows the user to take a defined array of double values, and
 *allows the user to acquire certain statistics on this arry of double values.
 *The user can get the average, the mode, the minimum, the maximum, and can check
 *when a data set is equal to another data set. 
 *
 *Statement of Academic Honesty:
 *
 *The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be playerMoveled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
*/
public class Stat 
{
	private double[] data;
	
	//Below code creates a default constructor, making a one-valued array with zero as the only value.
	public Stat()
	{
		data = new double[1];
		data[0] = 0.0;
	}
	//Below code creates a constructor alternate to the default constructor. It takes a array of doubles as input, then sets the data set inputed to the data set in this class.
	public Stat(double[] d)
	{
		data = new double[d.length];
		for(int i = 0; i < d.length; i++)
		{
			data[i] = d[i];
		}
	}
	
	//Below code checks if a data set is equal to another data set.
	public boolean equals(Stat s)
	{
		if(data.length != s.getData().length)
		{
			return false; 
		}
		double[] sCopy = new double[s.getData().length];
		for(int i = 0; i < data.length; i++)
		{
			sCopy[i] = s.getData()[i];
		}
		
		boolean isEqual = true;
		for(int i = 0; (i < data.length || i < s.getData().length); i++)
		{
			if(data[i] != s.data[i])
			{
				isEqual = false;
			}
		}
		return isEqual;
	}
	//Below code prints out the data set as if it were printed on a single line. The format came from the lab stimulus.
	public String toString()
	{
		String output = "[";
		for(int i = 0; i < data.length; i++)
		{
			if(i == data.length - 1)
			{
				output = output + data[i] + "]";
			}
			else
			{
				output = output + data[i] + ", ";
			}
		}
		return output;
	}
	//Below code returns the values stored in the double array variable data.
	public double[] getData()
	{
		double[] dataCopy = new double[data.length];
		for(int i = 0; i < data.length; i++)
		{
			dataCopy[i] = data[i];
		}
		return dataCopy;
		
	}
	
	//Below code sets the values in a data set. The method takes a double array/data set as an input, and assigns the values of the initial data vairable to the ones from the data set inputed by the method.
	public void setData(double[] d)
	{
		double[] newData = new double[d.length];
		for(int i = 0; i < d.length; i++)
		{
			newData[i] = d[i];
		}
		data = new double[d.length];
		for(int i = 0; i < d.length; i++)
		{
			data[i] = newData[i];
		}
	}
	//Below code loops through the data set/double array, and finds the minimum value.
	public double min()
	{
		double smallestValue = data[0];
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] < smallestValue)
			{
				smallestValue = data[i];
			}
		}
		return smallestValue;
	}
	//Below code loops through the data set/double array, and finds the maximum value.
	public double max()
	{
		double largestValue = data[0];
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] > largestValue)
			{
				largestValue = data[i];
			}
		}
		return largestValue;
	}
	//Below code loops through the data set/double array, and sums up all the numbers, then divides this sum by the number of values in the data set/double array.
	public double average()
	{
		double sum = 0.0;
		for(int i = 0; i < data.length; i++)
		{
			sum = sum + data[i];
		}
		double average = sum / data.length;
		return average;
	}
	//Below code loops through the data set/double array and attempts to find the mode. If there is one value in the data set/double array, it will return that number as the mode. If there are multiple modes, then it returns Double.NaN. Otherwise, it returns the mode.
	public double mode()
	{
		int count1 = 0;
		int maximumCounter = 0;
		double mode = 0.0;
		boolean isMultipleModes = false;
		for(int i = 0; i < data.length; i++)
		{
			count1 = 0;
			for(int j = 0; j < data.length; j++)
			{
				if(data[i] == data[j])
				{
					count1++;
				}
			}
			if(count1 > maximumCounter)
			{
				maximumCounter = count1;
				mode = data[i];
				isMultipleModes = false;
			}
			else if(count1 == maximumCounter && data[i] != mode)
			{
				isMultipleModes = true;
			}
			
		}
		if(isMultipleModes == true)
		{
			return Double.NaN;
		}
		else
		{
			return mode;
		}
	}
}
