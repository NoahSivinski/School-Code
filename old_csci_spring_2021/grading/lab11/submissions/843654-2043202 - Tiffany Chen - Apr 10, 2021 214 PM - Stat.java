/*
 * [Stat].java
 * Author:  [Tiffany Chen] 
 * Submission Date:  [April 10, 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *Create  a stat class from the UML diagram and method description.
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
			double[] data = {0.0};
			this.data = data;
		}
		public Stat(double[] d) { 
			setData(d);
		}
		
		
		//SET DATA VALUES
		public void setData(double[] d) { 
			double[] nArray = new double[0];
		
				nArray = new double[d.length];
					
				for (int i = 0; i < d.length; i++) {
					nArray[i] = d[i];
				}
			data = nArray;
			
		}
		
		
		//GET DATA VALUES
				public double[] getData() { 
					return data;
				}
				
				
		//EQUALS METHOD
		// compare if they equal the same number of values and length
		public boolean equals(Stat s) { 
			Stat d = this;
			if (d.data.length != s.data.length) 
			{
				return false;
			}
			else
			{
			for (int i = 0; i < d.data.length; i++) 
			{
				if (d.data[i] != s.data[i])
				{
					return false;
				}
			}
			return true;
		}
		}
		
		
		//return string to store stat object
		public String toString()
		{
			
			String string = "";
			Stat d = this;
			
			for (int i = 0; i < d.data.length; i++)
			{
				if (i == d.data.length - 1)
				{
					string = string + d.data[i];
				}
				else
				{
					string =  string + d.data[i] + ", ";
				}
			}
			return "[" + string + "]";
		}
		
		
		//MIN METHOD:  take the smallest value 
		public double min()
		{
			Stat d = this;
			double min = d.data[0];
			for(int i = 0; i < d.data.length; i++)
			{
				 if (min > data[i]) min = data[i];
			}
			return min;
		}
		
		
		//MAX METHOD: take the highest value
		public double max()
		{
			Stat d = this;
			double max = d.data[0];
	
			for(int i = 0; i < d.data.length; i++)
			{
				  if (max < data[i]) max = data[i];
			}
			return max;
		}
		
		
		//AVERAGE METHOD: return the average  of the values
		public double average()
		{
			Stat d = this;
			double average = d.data[0];
	
			for (int i = 1; i < d.data.length; i++)
			{
				average += d.data[i];
			}
			//all the  values added up divided by length
			average = average/d.data.length;
			return average;
		}
		
		
		//MODE METHOD
		public double mode()
		{
			Stat d = this;
			int value = 0;
			double mode = d.data[0];
		
			for (int i = 0; i < d.data.length; i++)
			{
				int count = 0;
				for (int s = i+1; s < d.data.length; s++)
				{
					if (d.data[i] == d.data[s])
					{
						count++;
					}
				}
				
				
				//if there's only one number in array
				if(d.data.length == 1)
				{
					mode = d.data[0];
				}
				
				
				//compare count with past biggest count
				if(count > value)
				{
					value = count;
					mode = d.data[i];
					
				}
				
				
				//if equal mode is NaN
				else if (value == count && d.data.length != 1)
				{
					mode = Double.NaN;
				}
			}
			return mode;
		}
	}