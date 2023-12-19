/*
 * Stat.java
 * Author:  Lanie Snyder
 * Submission Date:  April 10, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program creates a class named Stat. It has an array of double
 * values called data. There are two constructor methods. There are 
 * also definitions for the methods getData, setData, equals, toString,
 * min, max, average, and mode.
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
	//a single element that is 0.0
	public Stat() {
		
		data = new double[1];
		data[0] = 0.0;
	}
	
	//This method constructs a Stat object using the values help in d.
	//It creates a new array with copies of the values in d. A reference 
	//to the new array is assigned to data

	public Stat(double[] d) {
		
		double[] newD = new double[d.length];
		
		for (int i = 0; i < d.length; i++)
		{
			newD[i] = d[i];
		}
		data = newD;
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
	
	//This is a mutator method to set the values of the data array.
	//It creates a new array with the same elements as d. It then
	//assigns to data a reference to the new array.
	public void setData(double[] d) {
		
		double[] setDataArray = new double[d.length];
		
		for (int i = 0; i < d.length; i++)
			 setDataArray[i] = d[i];
		
		data = setDataArray;
	}
	
	//This method returns true if both the calling and passed Stat 
	//objects have the same values in the same order. Otherwise it 
	//returns false.
	public boolean equals(Stat s) {
		boolean equal; 
		equal = false;
		
		int count;
		count = 0;
		
		if (s.data.length == this.data.length) //The lengths are the same
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
	
	//This method returns the minimum of the data array.
	public double min() {
		
		double minimum;
		int count;
		count = 0;
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
		return minimum;
	}
	
	//This method returns the maximum of the data array.
	public double max() {
		
		double maximum;
		int count;
		count = 0;
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
		return maximum;
	}
	
	//This method returns the average (mean) of the data array.
	public double average() {
		
		double sum;
		int count;
		count = 0;
		sum = 0;
		
		while (count < data.length)
		{
			sum = sum + data[count];
			count = count + 1;
		}
		return (sum / data.length) ;
	}
	
	//This method returns the mode of the data array. If there is not
	//a more or there is more than one mode, the method returns Double.NaN.
	public double mode() {
		
		double mode;
		int highestAmountSoFar;
		mode = 0;
		highestAmountSoFar = 0;
		int currentAmount;
		
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
		return mode;
	}
}
