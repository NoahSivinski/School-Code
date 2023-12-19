/*
 * Stat.java
 * Author:  Derek Li
 * Submission Date:  11/12/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program creates a stat object that stores a double array
 * which can then be returned or manipulated to return the
 * median, mean, mode, deviation, or standard deviation of said double array.
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
		if (d == null)
			d = new double[0];
		data = new double[d.length];
		for(int i = 0; i < d.length; i++)
			data[i] = d[i];
	}

	
	
	
	public Stat(int[] i)
	{
		data = new double[i.length];
		for(int j = 0; j < i.length; j++)
				data[j] = i[j];	
	}
	
	
	
	public Stat(long[] lo)
	{
		data = new double[lo.length];
		for(int i = 0; i < lo.length; i++)
				data[i] = lo[i];	
	}
	
	
	
	public Stat(float[] f)
	{
		data = new double[f.length];
		for(int i = 0; i < f.length; i++)
				data[i] = f[i];	
	}
	
	
	
	//sets the array data to values of d
	public void setData(double[] d)
	{
		if(d == null)
		{
			double[] e = null;
			data = e;
		}
		else
		{
			double[] values = new double[d.length];
			for(int i = 0; i < d.length; i++)
				values[i] = d[i];
			data = values;
		}
	}
	
	
	
	public void setData(int[] i)
	{
		if(i == null)
		{
			double[] d = null;
			data = d;
		}
		else
		{
			double[] values = new double[i.length];
			for(int j = 0; j < i.length; j++)
				values[j] = i[j];
			data = values;
		}
	}
	
	
	
	public void setData(long[] lo)
	{
		if(lo == null)
		{
			double[] d = null;
			data = d;
		}
		else
		{
			double[] values = new double[lo.length];
			for(int i = 0; i < lo.length; i++)
				values[i] = lo[i];
			data = values;
		}
	}
	
	
	
	public void setData(float[] f)
	{
		if(f == null)
		{
			double[] d = null;
			data = d;
		}
		else
		{
			double[] values = new double[f.length];
			for(int i = 0; i < f.length; i++)
				values[i] = f[i];
			data = values;
		}
	}
	
	
	
	//returns a double[] with the same values as data
	public double[] getData()
	{
		double[] output = new double[data.length];
		for(int i = 0; i < data.length; i++)
			output[i] = data[i];
		return output;
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
	
	
	//clears the data array
	public void reset()
	{
		double[] d = null;
		data = d;
	}
	
	
	//creates a new double array of the original elements in data followed by the elements in d
	public void append(double[] d)
	{
		if(d != null)
		{
			double[] output = new double[data.length + d.length];
			for(int j = 0; j < output.length; j++)
			{
				if (j < data.length)
					output[j] = data[j];
				else
					output[j] = d[j - data.length];
			}
			data = output;
		}
	}
	
	
	
	public void append(int[] i )
	{
		if(i != null)
		{
			double[] output = new double[data.length + i.length];
			for(int j = 0; j < output.length; j++)
			{
				if (j < data.length)
					output[j] = data[j];
				else
					output[j] = i[j - data.length];
			}
			data = output;
		}
	}
	
	
	
	public void append(long[] lo)
	{
		if(lo != null)
		{
			double[] output = new double[data.length + lo.length];
			for(int j = 0; j < output.length; j++)
			{
				if (j < data.length)
					output[j] = data[j];
				else
					output[j] = lo[j - data.length];
			}
			data = output;
		}
	}
	
	
	
	public void append(float[] f)
	{
		if(f != null)
		{
			double[] output = new double[data.length + f.length];
			for(int j = 0; j < output.length; j++)
			{
				if (j < data.length)
					output[j] = data[j];
				else
					output[j] = f[j - data.length];
			}
			data = output;
		}
	}
	
	
	//returns true if data is empty, false otherwise
	public boolean isEmpty()
	{
		return (data.length == 0);
	}
	
	
	
	//returns the minimum of the data array
	public double min()
	{
		if(isEmpty())
			return Double.NaN;
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
		if(isEmpty())
			return Double.NaN;
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
		if(isEmpty())
			return Double.NaN;
		double output = 0.0;
		int count = 0;
		for(int i = 0; i < data.length; i++)
			output += data[i];
		return output / count;
	}
	
	
	//returns the mode of the data array
	public double mode()
	{
		if(isEmpty())
			return Double.NaN;
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
	
	
	//returns the variance of data
	public double variance()
	{
		if(isEmpty())
			return Double.NaN;
		double sum = 0;
		double mean = average();
		for(int i = 0; i < data.length; i++)
		{
			sum += Math.pow(mean - data[i], 2);
		}
		return sum / data.length;
	}
	
	
	//returns the standard deviation of data
	public double standardDeviation()
	{
		if(isEmpty())
			return Double.NaN;
		return Math.sqrt(variance());
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
