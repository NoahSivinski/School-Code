/*
 * [Stat].java
 * Author:  [Tiffany Chen] 
 * Submission Date:  [April 16, 2021]
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
	
	// Default Constructor
	public Stat() {
		data = new double[0];
	}
	// Construct stat object
	public Stat(double[] d) { 
		setData(d);
	}
	
	public Stat(float[] f) { 
		setData(f);
	}
	
	public Stat(int[] i) { 
		setData(i);
	}
	
	public Stat(long[] lo) { 
		setData(lo);
	}
	//set values of the  data array
	public void setData(double[] d) { 
		double[] nArray = new double[0];
		if (d == null) 
			return;
		nArray = new double[d.length];
		for (int i = 0; i < d.length; i++) {
					nArray[i] = d[i];
				}
			
			data = nArray;
		}
		
	//set values of the data array
	public void setData(float[] f) { 
		double[] nArray = new double[0];
		if (f == null) 
			return;
		nArray = new double[f.length];	
		for (int i = 0; i < f.length; i++) {
				nArray[i] = f[i];
			}
		
		data = nArray;
	}
	

	//set values of the data array
	public void setData(int[] i) { 
		double[] nArray = new double[0];
		if (i == null) 
		return;
			nArray = new double[i.length];
				
			for (int j = 0; j < i.length; j++) {
				nArray[j] = i[j];
			}
		
		data = nArray;
	}
	
	//set values of the data array
	public void setData(long[] lo) { 
		double[] nArray = new double[0];
		if (lo == null)
		return;
			nArray = new double[lo.length];
				
			for (int i = 0; i < lo.length; i++) {
				nArray[i] = lo[i];
			}
		
		data = nArray;
	}
	
	public double[] getData() { 
		return data;
	}
	
	//boolean
	public boolean equals(Stat s) { 
		 if(s==null)
	           return false;

	       if(data.length!=s.data.length) //data array of both object have same values
	           return false;
	          
	       for(int i=0; i<s.data.length; i++)
	       {
				if (Math.abs(s.data[i] - data[i]) > 0.001)
	               return false;
	       }
	       return true;
	   }
		
	
	public void reset() { 
		data = new double[0];
	}
	
		   public void append(int[] i)
		   {
		       if(i==null)
		           return;
		          
		       double nArray[] = new double[data.length+i.length];
		      
		       for (int j = 0; j < nArray.length; j++) {
					if (j < data.length)
						nArray[j] = data[j];
					else
						nArray[j] = i[j - data.length];
				}
		       data = nArray;
		   }
// create a new double array 
   public void append(float[] f) {
	   if(f==null)
		   return;
	   
	   double nArray[] = new double[data.length+f.length];
		       for (int j = 0; j < nArray.length; j++) {
					if (j < data.length)
						nArray[j] = data[j];
					else
						nArray[j] = f[j - data.length];
				}
		       data = nArray;
		   }
   // create a  mew double array
   public void append(long[] lo) {
		  if(lo==null)
		    	return;
		          
		       double nArray[] = new double[data.length+lo.length];
		      
		       for (int j = 0; j < nArray.length; j++) {
					if (j < data.length)
						nArray[j] = data[j];
					else
						nArray[j] = lo[j - data.length];
				}
		       data = nArray;
		   }
		 
		//create a new double array 
		public void append(double[] d) { 
			if (d == null) 
				 return;
		          
			       double nArray[] = new double[data.length+d.length];
			      
			       for (int j = 0; j < nArray.length; j++) {
						if (j < data.length)
							nArray[j] = data[j];
						else
							nArray[j] = d[j - data.length];
					}
					
					data = nArray;
			   }

		//returns the boolean value if the data object has length 0
		public boolean isEmpty() { 
			return data.length == 0;
		}
		
		//eturns a String representation of the data elements
		public String toString() {
			if (isEmpty()) 
				return "[]";
			String s = "[";
			for (int i = 0; i < data.length; i++) {
				s = s + data[i];
				if (i == data.length - 1)
					s = s + "]";
				else 
					s = s + ", ";
			}
			
			return s;
		}
		
		//Return the minimum
		public double min() { 
			if (!isEmpty()) {
				double min = data[0];
				for (int i = 0; i < data.length; i++) {
					if (min > data[i])
						min = data[i];
				}
				
				return min;
			}
			else
				return Double.NaN;
		}
		
		//Return the maximum
		public double max() { 
			if (!isEmpty()) {
				double max = data[0];
				for (int i = 0; i < data.length; i++) {
					if (max < data[i])
						max = data[i];
				}
				
				return max;
			}
			else 
				return Double.NaN;
		}
		
		
		//Returns the average or mean of the values in the data array. 
		public double average() { 
			if (!isEmpty()) {
				double sum = 0;
				for (int i = 0; i < data.length; i++) {
					sum += data[i];
				}
				return sum / data.length;
			}
			else
				// if data is empty return Double.NaN
				return Double.NaN;
		}
		// Mode 
		// If one value occurs more frequently in a set of values then the mode should return the  value
		public double mode() { 
			
			if (!isEmpty()) {
				double mode = 0, value = 1;
				
				for (int i = 0; i < data.length; i++) {
					int max = 0;
					for (int j = i; j < data.length; j++) {
						if (Math.abs(data[i] - data[j]) <= 0.001)
							max++;
					}
					if (max > value) {
						mode = data[i];
						value = max;
					}
					else if (max == value) {
						mode = Double.NaN;
					}
				}
				
				
				return mode;
			}
			else
				return Double.NaN;
		}
		
		//Return number of time the value occurs in the data array.
		private int occursNumberOfTimes(double d) { 
			int count = 0;
			for (int i = 0; i < data.length; i++) {
				if (data[i] == d)
					count++;
			}
			
			return count;
		}
		
		//Returns the variance of the data in the data array.
		public double variance() { 
			if (!isEmpty()) {
				double distance = 0;
				
				for (int i = 0; i < data.length; i++)
					distance += Math.pow(data[i] - average(), 2);
				//sum divided by the number of elements in data
				return distance / data.length;
			}
			else
				return Double.NaN;
			
		}
		
		public double standardDeviation() { 
			return Math.sqrt(variance());
		}
	}