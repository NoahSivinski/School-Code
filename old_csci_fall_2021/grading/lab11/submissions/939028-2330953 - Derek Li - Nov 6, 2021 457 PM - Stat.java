/*
 * Stat.java
 * Author:  Derek Li
 * Submission Date:  11/6/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program creates a stat object that stores a double array
 * which can then be returned or manipulated to return the
 * median, mean, or mode of said double array.
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

public class Stat 
{
	//instance variables
	private double[] data;
	
	
	
	//default constructor
	public Stat()
	{
		double[] data = {0.0};
	}
	
	
	
	//constructs an instance of Stat using the values stored in d
	public Stat(double[] d)
	{
		data = new double[d.length];
		for(int i = 0; i < d.length; i++)
			data[i] = d[i];
	}
	
	
	//returns a double[] with the same values as data
	public double[] getData()
	{
		double[] output = new double[data.length];
		for(int i = 0; i < data.length; i++)
			output[i] = data[i];
		return output;
	}
	
	
	//sets the array data to values of d
	public void setData(double[] d)
	{
		double[] values = new double[d.length];
		for(int i = 0; i < d.length; i++)
			values[i] = d[i];
		data = values;
	}
	
	
	//returns true if data in this object and object s have the same values 
	//in the same order, false otherwise
	public boolean equals(Stat s)
	{
		double other[] = s.getData();
		if (other.length != data.length)
			return false;
		for(int i = 0; i < data.length; i++)
		{
			if(other[i] != data[i])
				return false;
		}
		return true;
	}
	
	
	//returns the minimum of the data array
	public double min()
	{
		double min = data[0];
		for(int i = 1; i < data.length; i++)
		{
			if (data[i] < min)
				min = data[i];
		}
		return min;
	}
	
	
	//returns the maximum of the data array
	public double max()
	{
		double max = data[0];
		for (int i = 1; i < data.length; i++)
		{
			if(data[i] > max)
				max = data[i];
		}
		return max;
	}
	
	
	//returns the average of the data array
	public double average()
	{
		double output = 0.0;
		int count = 0;
		for(int i = 0; i < data.length; i++)
			output += data[i];
		return output / count;
		
	}
	
	
	//returns the mode of the data array
	public double mode()
	{
		double output;
		boolean isThere;
		int count = 0, displacement = 0;
		
		double[] compare = new double[data.length];
		
		//find all unique integers and put them in compare
		for(int i = 0; i < data.length; i++)
		{
			isThere = false;
			for(int j = 0; j < data.length; j++)
			{
				if(data[i] == compare[j])
					isThere = true;
			}
			if (!isThere)
			{
				compare[i] = data[i];
				count++;
			}
		}
		
		
		
		
		double[] uniqueIntegers = new double[count];
		
		//initialize uniqueIntegers with all the unique integers
		for(int j = 0; j < compare.length; j++)
		{
			if (compare[j] != 0.0d)
				uniqueIntegers[j - displacement] = compare[j];
			else
				displacement++;
		}
		
		//find which integer occurs the most
		double uniqueIntegersCount[] = new double[uniqueIntegers.length];
		for(int i = 0; i < uniqueIntegers.length; i++)
		{
			for(int j = 0; j < compare.length; j++)
			{
				if (uniqueIntegers[i] == data[j])
					uniqueIntegersCount[i]++;
			}
		}
		
		//find the max occurring integer
		double max = uniqueIntegersCount[0];
		int maxPos = 0;
		boolean isUnique = true;
		for(int i = 1; i < uniqueIntegers.length; i++)
		{
			if(uniqueIntegersCount[i] > max)
			{
				max = uniqueIntegersCount[i];
				maxPos = i;
			}
		}
		
		//see if the max is not unique
		for(int i = 0; i < uniqueIntegersCount.length; i++)
		{
			if (maxPos != i)
			{
				if (max == uniqueIntegersCount[i])
					isUnique = false;
			}
		}
		if(isUnique)
			return uniqueIntegers[maxPos];
		else
			return Double.NaN;
	}
	
	//returns a string representation of the object in the format [data[value1], data[value2], ...]
	public String toString()
	{
		String output = "[";
		for(int i = 0; i < data.length - 1; i++)
		{
			output += data[i] + ", ";
		}
		//data will never be empty as it cannot be a null length
		return output + data[data.length - 1] + "]";
	}
}
