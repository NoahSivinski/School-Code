/*
 * Stat.java
 * Author:  Lanie Snyder
 * Submission Date:  April 16, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program creates a class named Stat. It has an array of double
 * values called data. There are five constructor methods. There are 
 * also definitions for the methods getData, setData, equals, reset,
 * append, isEmpty, toString, min, max, average, mode,
 * variance, and standardDeviation. There are four methods named setData. 
 * There are four methods named append. The methods with the same names 
 * differ based on the the type of values in the parameter.
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
	
	//Instance Variable
	private double [] data;
	
	//Methods
	
	//This is the default constructor for Stat. It creates a array with 
	//no elements.
	public Stat() {
		
		double[] defaultConstructorArray = new double[0];
		
		data = defaultConstructorArray;
	}
	
	//This method constructs a Stat object using the values held in d.
	//It creates a new double array with copies of the values in d. A 
	//reference to the new array is assigned to data. If the parameter
	//is null, then an empty array is assigned to data.

	public Stat(double[] d) {
		if (d == null) 
		{
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else
		{
			double[] newD = new double[d.length];
			
			for (int i = 0; i < d.length; i++)
			{
				newD[i] = d[i];
			}
			data = newD;
		}
	}
	
	//This method constructs a Stat object using the values held in f.
	//It creates a new double array with copies of the values in f. A 
	//reference to the new array is assigned to data. If the parameter
	//is null, then an empty array is assigned to data.
	public Stat(float[] f) {

		if (f == null)
		{
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else
		{
			double[] newF = new double[f.length];
			
			for (int i = 0; i < f.length; i++)
			{
				newF[i] = f[i];
			}
			data = newF;
		}
	}
	
	//This method constructs a Stat object using the values held in i.
	//It creates a new double array with copies of the values in i. A 
	//reference to the new array is assigned to data. If the parameter
	//is null, then an empty array is assigned to data.
	public Stat (int[] i) {

		if (i == null)
		{
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else
		{
			double[] newI = new double[i.length];
			
			for (int j = 0; j < i.length; j++)
			{
				newI[j] = i[j];
			}
			data = newI;
		}	
	
	}
	
	//This method constructs a Stat object using the values held in lo.
	//It creates a new double array with copies of the values in lo. A 
	//reference to the new array is assigned to data. If the parameter
	//is null, then an empty array is assigned to data.
	
	public Stat (long[] lo) {

		if (lo == null) 
		{
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else
		{
			double[] newLo = new double[lo.length];
			
			for (int i = 0; i < lo.length; i++)
			{
				newLo[i] = lo[i];
			}
			data = newLo;
		}
	}
	
	//This is a mutator method to set the values of the data array.
	//It creates a new double array with the same elements as f. It then
	//assigns to data a reference to the new array. If the parameter is 
	//null, an empty array is assigned to data.
	public void setData (float[] f) {
		if (f == null)
		{
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else 
		{
			double[] setDataArrayF = new double[f.length];
			
			for (int i = 0; i < f.length; i++)
				 setDataArrayF[i] = f[i];
			
			data = setDataArrayF;
		}
	}
	
	
	//This is a mutator method to set the values of the data array.
	//It creates a new double array with the same elements as d. It then
	//assigns to data a reference to the new array. If the parameter is 
	//null, an empty array is assigned to data.
	public void setData(double[] d) {
		if (d == null)
		{
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else 
		{
			double[] setDataArrayD = new double[d.length];
			
			for (int i = 0; i < d.length; i++)
				 setDataArrayD[i] = d[i];
			
			data = setDataArrayD;
		}
	}
	
	//This is a mutator method to set the values of the data array.
	//It creates a new double array with the same elements as i. It then
	//assigns to data a reference to the new array. If the parameter is
	//null, an empty array is assigned to data.

	public void setData (int[] i) {
		if (i == null)
		{
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else 
		{
			double[] setDataArrayI = new double[i.length];
			
			for (int j = 0; j < i.length; j++)
				 setDataArrayI[j] = i[j];
			
			data = setDataArrayI;
		}
	}

	//This is a mutator method to set the values of the data array.
	//It creates a new double array with the same elements as lo. It then
	//assigns to data a reference to the new array. If the parameter is 
	//null, an empty array is assigned to data.
	public void setData (long[] lo) {
		if (lo == null)
		{
			double[] emptyArray = new double[0];
			data = emptyArray;
		}
		else 
		{
			double[] setDataArrayLo = new double[lo.length];
			
			for (int i = 0; i < lo.length; i++)
				 setDataArrayLo[i] = lo[i];
			
			data = setDataArrayLo;
		}
	}
	
	//This is an accessor method to retrieve the values of data.
	//It creates a new array with the same values as data and returns
	//a reference to the new array.
	public double[] getData() {
		
		double[] getDataArray = new double[data.length];
		
		 for (int i = 0; i < data.length; i++)
			 getDataArray[i] = data[i];
		
		return getDataArray;
	}
	
	//This method returns true if both the calling and passed Stat 
	//objects have the same values in the same order. Otherwise it 
	//returns false. If s is null, it returns false.
	public boolean equals(Stat s) {
		boolean equal; 
		equal = false;
		
		int count;
		count = 0;
		
		if (s == null)
		{
			equal = false;
		}
		else if (s.data.length == this.data.length) //The lengths are the same
		{
			while (count < this.data.length)
			{
				//Can't use == because they are double values
				if (Math.abs(s.data[count] - this.data[count]) < 0.000000001) 
				{
					count ++;
				}
				else //Values are not the same
				{
					equal = false;
					count = this.data.length + 5; //to end the loop
				}
			}
			
			//All values were the same and only stopped because it checked them all
			if (count == this.data.length)
			{
				equal = true;
			}
		}
		else //The lengths are different
		{
			equal = false;
		}
		return equal;
	}
	
	
	//This method clears the data array. A new empty double array is
	//created and assigned to data.
	public void reset() {
		double[] emptyArray = new double[0];
		data = emptyArray;
	}
	
	//This method creates a new double array containing exactly those
	//elements of data followed by those of the array passed as parameter.
	//A reference to this array is assigned to data. If the parameter is 
	//null, then the method does nothing.
	public void append(int[] i) {
		int count; //Used to see where the first loop stops filling in the values from the first array
		count = 0; 
		if (i != null && data.length != 0)
		{
			double[] appendIArray = new double[(data.length) + (i.length)];
		
			//Sets the values from the first array to the new array
			for (int j = 0; j < data.length; j++)
			{
				
				appendIArray[j] = data[j];
				count = j;
			}
			count = count + 1; //Plus one to go to the next spot
			//Sets the values from the second array to the new array
			for (int j = 0; count < ((data.length) + (i.length)); j++)
			{
				appendIArray[count] = i[j];
				count = count + 1;
			}
			data = appendIArray;
		}
		//Sets the values from the second array to the new array if the first array 
		//does not have any values.
		if (data.length == 0) {
			double[] appendIArray2 = new double[i.length];
			for (int j = 0; j < i.length; j++)
			{
				appendIArray2[j] = i[j];
			}
			data = appendIArray2;
		}
	}
	
	//This method creates a new double array containing exactly those
	//elements of data followed by those of the array passed as parameter.
	//A reference to this array is assigned to data. If the parameter is 
	//null, then the method does nothing.
	public void append(float[] f) {
		int count; //Used to see where the first loop stops filling in the values from the first array
		count = 0; 
		
		if (f != null && data.length != 0)
		{
			double[] appendFArray = new double[(data.length) + (f.length)];
		
			//Sets the values from the first array to the new array
			for (int i = 0; i < data.length; i++)
			{
				
				appendFArray[i] = data[i];
				count = i;
			}
			count = count + 1; //Plus one to go to the next spot
			//Sets the values from the second array to the new array
			for (int i = 0; count < ((data.length) + (f.length)); i++)
			{
				appendFArray[count] = f[i];
				count = count + 1;
			}
			data = appendFArray;
		}
		//Sets the values from the second array to the new array if the first array 
		//does not have any values.
		if (data.length == 0) {
			double[] appendFArray2 = new double[f.length];
			for (int i = 0; i < f.length; i++)
			{
				appendFArray2[i] = f[i];
			}
			data = appendFArray2;
		}
	}
	
	//This method creates a new double array containing exactly those
	//elements of data followed by those of the array passed as parameter.
	//A reference to this array is assigned to data. If the parameter is 
	//null, then the method does nothing.
	public void append(long[] lo) {
		int count; //Used to see where the first loop stops filling in the values from the first array
		count = 0; 
		
		if (lo != null && data.length != 0)
		{
			double[] appendLoArray = new double[(data.length) + (lo.length)];
		
			//Sets the values from the first array to the new array
			for (int i = 0; i < data.length; i++)
			{
				
				appendLoArray[i] = data[i];
				count = i;
			}
			count = count + 1; //Plus one to go to the next spot
			//Sets the values from the second array to the new array
			for (int i = 0; count < ((data.length) + (lo.length)); i++)
			{
				appendLoArray[count] = lo[i];
				count = count + 1;
			}
			data = appendLoArray;
		}
		//Sets the values from the second array to the new array if the first array 
		//does not have any values.
		if (data.length == 0) {
			double[] appendLoArray2 = new double[lo.length];
			for (int i = 0; i < lo.length; i++)
			{
				appendLoArray2[i] = lo[i];
			}
			data = appendLoArray2;
		}	
	}
	
	//This method creates a new double array containing exactly those
	//elements of data followed by those of the array passed as parameter.
	//A reference to this array is assigned to data. If the parameter is 
	//null, then the method does nothing.
	public void append(double[] d) {
		int count; //Used to see where the first loop stops filling in the values from the first array
		count = 0; 
		
		if (d != null && data.length != 0)
		{
			double[] appendDArray = new double[(data.length) + (d.length)];
		
			//Sets the values from the first array to the new array
			for (int i = 0; i < data.length; i++)
			{
				
				appendDArray[i] = data[i];
				count = i;
			}
			count = count + 1; //Plus one to go to the next spot
			//Sets the values from the second array to the new array
			for (int i = 0; count < ((data.length) + (d.length)); i++)
			{
				appendDArray[count] = d[i];
				count = count + 1;
			}
			data = appendDArray;
		}
		//Sets the values from the second array to the new array if the first array 
		//does not have any values.
		if (data.length == 0) {
			double[] appendDArray2 = new double[d.length];
			for (int i = 0; i < d.length; i++)
			{
				appendDArray2[i] = d[i];
			}
			data = appendDArray2;
		}
	}
	
	//This method returns the boolean value true if the data object
	//is empty (has length 0). Otherwise, it returns false.
	public boolean isEmpty() {
		return (data.length == 0);
	}
	
	//This method returns a String representation of the data 
	//stored in the Stat object.
	public String toString() {
		
		String dataString;
		int count;
		count = 0;
		
		if (data.length == 1) //Only one value in array
		{
			dataString = "[" + data[0] + "]";
		}
		else //Array has multiple values
		{
			dataString = "[";
			
			while (count < (data.length - 1))
			{
				dataString = dataString + data[count] + ", ";
				count = count + 1;
			}
			//The last value in the array is added separate because it does not need ", " after it.
			if (count < data.length)
			{
				dataString = dataString + data[count];
			}
			
			dataString = dataString + "]";
		}
		return dataString;
	}
	
	//This method returns the minimum of the data array. If the 
	//array is empty, it returns Double.NaN
	public double min() {
		double minimum;
		int count;
		count = 0;

		if (this.isEmpty() == true)
		{
			minimum = Double.NaN;
		}
		else
		{
			minimum = data[count];
			if (data.length == 1)
			{
				minimum = data[0];
			}
			else 
			{
				while (count < (data.length - 1))
				{
					
					if (data[count + 1] < minimum)
					{
						minimum = data[count + 1]; 
					}
					count = count + 1;
				}
			}
		}
		return minimum;
	}
	
	//This method returns the maximum of the data array. If the 
	//array is empty, it returns Double.NaN
	public double max() {
		
		double maximum;
		int count;
		count = 0;
		
		if (this.isEmpty() == true)
		{
			maximum = Double.NaN;
		}
		else
		{
			maximum = data[count];
			if (data.length == 1)
			{
				maximum = data[0];
			}
			else 
			{
				while (count < (data.length - 1))
				{
		
					if (maximum < data[count + 1])
					{
						maximum = data[count + 1]; 
					}
					count = count + 1;
				}
			}
		}
		return maximum;
	}
	
	//This method returns the average (mean) of the data array. If the 
	//array is empty, it returns Double.NaN
	public double average() {
		
		double sum;
		int count;
		count = 0;
		sum = 0;
		double average = 0;
		
		if(this.isEmpty() == true)
		{
			average = Double.NaN;
		}
		else
		{
			while (count < data.length)
			{
				sum = sum + data[count];
				count = count + 1;
			}
			average = (sum / data.length);
		}
	
		return average;
	}
	
	//This method returns the mode of the data array. If there is not
	//a mode, there is more than one mode, or the data array is empty
	//the method returns Double.NaN.
	public double mode() {
		
		double mode;
		int highestAmountSoFar;
		mode = 0;
		highestAmountSoFar = 0;
		int currentAmount;
		
		if(this.isEmpty() == true)
		{
			mode = Double.NaN;
		}
		else
		{
			for (int i = 0; i < data.length; ++i) //Changes which value is the current value being checked 
			{
				currentAmount = 1; //To reset after each time
			    //Checks current value (i) against values to the left of it
			    for (int j = i + 1; j < data.length; ++j) 
			    {
			        if (Math.abs(data[i] - data[j]) < 0.000000001) //Values are the same
			        {
				            ++currentAmount;
				    } 
			    }
			    //There is a new mode or it is the first value being checked
			    if (currentAmount > highestAmountSoFar) 
			    {
			        highestAmountSoFar = currentAmount;
			        mode = data[i];
			    } 
			    //If no number is repeated or if there are multiple modes
			    else if (currentAmount == highestAmountSoFar) 
			    {
			        mode = Double.NaN;
			    }
			}
		}
		return mode;
	}
	
	//I did not use the method occursNumberOfTimes in the mode method, so
	//I did not waste code to declare it.
	
	
	
	//This method returns the variance of the data in the data array.
	//If the data array is empty, it returns Double.NaN.
	public double variance() {
		double variance;
		variance = 0;
		double mean;
		mean = this.average();
		int count;
		count = 0;
		double distance; //distance between the current value and the mean
		distance = 0;
		double distanceSquared;
		distanceSquared = 0;
		double distanceSquaredSum; //Sum of all the distances squared
		distanceSquaredSum = 0;
		
		if(this.isEmpty() == true)
		{
			variance = Double.NaN;
		}
		else
		{
			while (count < data.length) 
			{
				distance = data[count] - mean;
				distanceSquared = distance * distance;
				//This adds current distance squared to the rest of the distances squared
				distanceSquaredSum = distanceSquaredSum + distanceSquared;  
				count = count + 1;
			}
			variance = distanceSquaredSum / (data.length);
		}
		
		return variance;
	}
	
	//This method returns the square root of the variance.
	//If the data array is empty, it returns Double.NaN.
	public double standardDeviation() {
		double standardDeviation;
		
		if(this.isEmpty() == true)
		{
			standardDeviation = Double.NaN;
		}
		else 
		{
			standardDeviation = Math.sqrt(this.variance());
		}
		return standardDeviation;
	}
}
