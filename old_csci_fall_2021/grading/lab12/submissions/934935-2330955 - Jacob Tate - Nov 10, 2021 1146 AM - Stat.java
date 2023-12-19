/**
 * File name: Stat.java
 * Author: Jacob Tate
 * Submission Date: Wednesday, November 10th, 2021.
 *
 *This program allows the user to take a defined array of double values, and
 *allows the user to acquire certain statistics on this array of double values.
 *The user can get the average, the mode, the minimum, the maximum, and can check
 *when a data set is equal to another data set. With the additional methods assigned,
 *the user can append the data set using an array of longs, ints, floats, and even other doubles.
 *Similarly, the user can set the double array data to array of longs, ints, floats, and even other doubles.
 *The constructors have also been made to initialize the data variable to an array of longs, ints, floats, and even other doubles.
 *The program will automatically convert the array, if needed, to doubles and assign to the variable data.
 *In additon, the user can find new statistics, including the variance and the standard deviation,
 *check if the data variable is empty.
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
		data = new double[0];
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
	//Below code creates a constructor alternate to the default constructor. It takes a array of floats as input, then sets the data set inputed to the data set in this class.
	public Stat(float[] f)
	{
		data = new double[f.length];
		for(int i = 0; i < f.length; i++)
		{
			data[i] = f[i];
		}
	}
	//Below code creates a constructor alternate to the default constructor. It takes a array of integers as input, converts them into doubles, then sets the data set inputed to the data set in this class.
	public Stat(int[] i)
	{
		data = new double[i.length];
		for(int j = 0; j < i.length; j++)
		{
			data[j] = i[j];
		}
	}
	//Below code creates a constructor alternate to the default constructor. It takes a array of longss as input, converts them into doubles, then sets the data set inputed to the data set in this class.
	public Stat(long[] lo)
	{
		data = new double[lo.length];
		for(int i = 0; i < lo.length; i++)
		{
			data[i] = lo[i];
		}
	}
	
	//Below code checks if a data set is equal to another data set. If the data set is null, then this will return false.
	public boolean equals(Stat s)
	{
		if(s == null)
		{
			return false;
		}
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
	//Below code creates an empty array.
	public void reset()
	{
		double[] emptyData = new double[0];
		data = new double[emptyData.length];
	}
	//Below code adds an array of integers, converts them to doubles, then adds the new doubles to an already existing array of doubles.
	public void append(int[] i)
	{
		if(i != null)
		{
			double[] newData = new double[data.length + i.length];
			for(int j = 0; j < data.length; j++)
			{
				newData[j] = data[j];
			}
			for(int k = 0; k < i.length; k++)
			{
				newData[k + data.length] = i[k];
			}
			
			data = new double[data.length + i.length];
			for(int x = 0; x < newData.length; x++)
			{
				data[x] = newData[x];
			}
		}
		
	}
	//Below code adds an array of floats, converts them to doubles, then adds the new doubles to an already existing array of doubles.
	public void append(float[] f)
	{
		if(f != null)
		{
			double[] newData = new double[data.length + f.length];
			for(int j = 0; j < data.length; j++)
			{
				newData[j] = data[j];
			}
			for(int k = 0; k < f.length; k++)
			{
				newData[k + data.length] = f[k];
			}
			
			data = new double[data.length + f.length];
			for(int x = 0; x < newData.length; x++)
			{
				data[x] = newData[x];
			}
		}
		
	}
	//Below code adds an array of longs, converts them to doubles, then adds the new doubles to an already existing array of doubles.
	public void append(long[] lo)
	{
		if(lo != null)
		{
			double[] newData = new double[data.length + lo.length];
			for(int j = 0; j < data.length; j++)
			{
				newData[j] = data[j];
			}
			for(int k = 0; k < lo.length; k++)
			{
				newData[k + data.length] = lo[k];
			}
			
			data = new double[data.length + lo.length];
			for(int x = 0; x < newData.length; x++)
			{
				data[x] = newData[x];
			}
		}
		
	}
	//Below code adds an array of doubles to a pre-existing array of doubles.
	public void append(double[] d)
	{
		if(d != null)
		{
			double[] newData = new double[data.length + d.length];
			for(int j = 0; j < data.length; j++)
			{
				newData[j] = data[j];
			}
			for(int k = 0; k < d.length; k++)
			{
				newData[k + data.length] = d[k];
			}
			
			data = new double[data.length + d.length];
			for(int x = 0; x < newData.length; x++)
			{
				data[x] = newData[x];
			}
		}
		
	}
	//Below code checks if the data set is empty, using the length of the array/data set.
	public boolean isEmpty()
	{
		if(data.length == 0)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	//Below code prints out the data set as if it were printed on a single line. The format came from the lab stimulus.
	public String toString()
	{
		String output = "[";
		if(isEmpty() == true)
		{
			output = output + "]";
		}
		else
		{
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
	//Below code sets the values in a data set. The method takes a float array/data set as an input, and assigns the values of the initial data variable to the ones from the data set inputed by the method.
	public void setData(float[] f)
	{
		if(f == null)
		{
			data = new double[0];
		}
		else
		{
			double[] newData = new double[f.length];
			for(int j = 0; j < f.length; j++)
			{
				newData[j] = f[j];
			}
			data = new double[f.length];
			for(int k = 0; k < f.length; k++)
			{
				data[k] = newData[k];
			}
		}
		
	}
	
	//Below code sets the values in a data set. The method takes a double array/data set as an input, and assigns the values of the initial data variable to the ones from the data set inputed by the method.
	public void setData(double[] d)
	{
		if(d == null)
		{
			data = new double[0];
		}
		else
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
		
	}
	//Below code sets the values in a data set. The method takes a integer array/data set as an input, converts its values to double, and assigns the values of the initial data variable to the ones from the data set inputed by the method.
	public void setData(int[] i)
	{
		if(i == null)
		{
			data = new double[0];
		}
		else
		{
			double[] newData = new double[i.length];
			for(int j = 0; j < i.length; j++)
			{
				newData[j] = i[j];
			}
			data = new double[i.length];
			for(int k = 0; k < i.length; k++)
			{
				data[k] = newData[k];
			}
		}
		
	}
	//Below code sets the values in a data set. The method takes a long array/data set as an input, converts its values to double, and assigns the values of the initial data variable to the ones from the data set inputed by the method.
	public void setData(long[] lo)
	{
		if(lo == null)
		{
			data = new double[0];
		}
		else
		{
			double[] newData = new double[lo.length];
			for(int i = 0; i < lo.length; i++)
			{
				newData[i] = lo[i];
			}
			data = new double[lo.length];
			for(int j = 0; j < lo.length; j++)
			{
				data[j] = newData[j];
			}
		}
		
	}
	//Below code loops through the data set/double array, and finds the minimum value.
	public double min()
	{
		if(isEmpty() == true)
		{
			return Double.NaN;
		}
		else
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
	}
	//Below code loops through the data set/double array, and finds the maximum value.
	public double max()
	{
		if(isEmpty() == true)
		{
			return Double.NaN;
		}
		else
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
	}
	//Below code loops through the data set/double array, and sums up all the numbers, then divides this sum by the number of values in the data set/double array.
	public double average()
	{
		if(isEmpty() == true)
		{
			return Double.NaN;
		}
		else
		{
			double sum = 0.0;
			for(int i = 0; i < data.length; i++)
			{
				sum = sum + data[i];
			}
			double average = sum / data.length;
			return average;
		}
		
	}
	//Below code loops through the data set/double array and attempts to find the mode. If there is one value in the data set/double array, it will return that number as the mode. If there are multiple modes, then it returns Double.NaN. Otherwise, it returns the mode.
	public double mode()
	{
		if(isEmpty() == true)
		{
			return Double.NaN;
		}
		else
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
	//Below code takes a double value as an input, and loops through the data set to see how often the value occurs. If the data value is found, the counter variable, initially set to zero, increases by the number of times the value is found.
	public int occursNumberOfTimes(double value)
	{
		int count = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] == value)
			{
				count++;
			}
		}
		return count;
	}
	//Below code prints the variance of a data set. It loops through, adding the square of the distances between the data point and the average, then proceeds to the next point and repeats.
	public double variance()
	{
		if(isEmpty() == true)
		{
			return Double.NaN;
		}
		else
		{
			double sum = 0.0;
			for(int i = 0; i < data.length; i++)
			{
				sum = sum + Math.pow((data[i]) - average(), 2);
			}
			return sum / data.length;
		}
		
	}
	//Below code prints out the standard deviation of a data set, using the function Math.sqrt and the variance method defined above.
	public double standardDeviation()
	{
		if(isEmpty() == true)
		{
			return Double.NaN;
		}
		else
		{
			return Math.sqrt(variance());
		}	
	}
	
}
