/**
 * 
 *
 * [Stat].java 
 * 
 * Author: [Hunter Schramm] 
 * 
 * Submission Date: [04/16/21]
 *
 * Purpose: This program takes data from an array and finds the min, max, mode,
 * average, variance, and standard deviation of the values.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither received nor given
 * inappropriate assistance. I have not copied or modified code from any source
 * other than the course webpage or the course textbook. I recognize that any
 * unauthorized assistance or plagiarism will be handled in accordance with the
 * University of Georgia's Academic Honesty Policy and the policies of this
 * course. I recognize that my work is based on an assignment created by the
 * Department of Computer Science at the University of Georgia. Any publishing
 * or posting of source code for this assignment is strictly prohibited unless
 * you have written consent from the Department of Computer Science at the
 * University of Georgia.
 * 
 * /**
 * 
 * @author hunterschramm
 *
 */

public class Stat {
	
	   private double[] data;
	  
	   public Stat()
	   {
	       data = new double[0];
	   }
		   public Stat(double[] d)
		   {
		       if(d == null)
		           data = null;
		       else
		       {
		           data = new double[d.length];
		           for(int i=0; i<d.length; i++)
		               data[i] = d[i];
		       }
		   }
		   
		   //Stat float method
		   public Stat(float[] f)
		   {
		       if(f == null)
		           data = null;
		       else
		       {
		           data = new double[f.length];
		           for(int i=0; i<f.length; i++)
		               data[i] = f[i];
		       }
		   }
		   
		   //Stat int method
		   public Stat(int[] i)
		   {
		       if(i == null)
		           data = null;
		       else
		       {
		           data = new double[i.length];
		           for(int j=0; j<i.length; j++)
		               data[j] = i[j];
		       }
		   }
		   
		   //Stat long method
		   public Stat(long[] lo)
		   {
		       if(lo == null)
		           data = null;
		       else
		       {
		           data = new double[lo.length];
		           for(int i=0; i<lo.length; i++)
		               data[i] = lo[i];
		       }
		   }
		   
		   //setData float method
		   public void setData(float [] f)
		   {
		       if(f == null)
		           data = null;
		       else
		       {
		           data = new double[f.length];
		           for(int i=0; i<f.length; i++)
		               data[i] = f[i];
		       }
		   }
		   
		   //setData double method
		   public void setData(double [] d)
		   {
		       if(d == null)
		           data = null;
		       else
		       {
		           data = new double[d.length];
		           for(int i=0; i<d.length; i++)
		               data[i] = d[i];
		       }
		   }
		   
		   //setData int method
		   public void setData(int [] i)
		   {
		       if(i == null)
		           data = null;
		       else
		       {
		           data = new double[i.length];
		           for(int j=0; j<i.length; j++)
		               data[j] = i[j];
		       }
		   }
		   
		   //setData long method
		   public void setData(long [] lo)
		   {
		       if(lo == null)
		           data = null;
		       else
		       {
		           data = new double[lo.length];
		           for(int i=0; i<lo.length; i++)
		               data[i] = lo[i];
		       }
		   }
		   
		   //getData method
		   public double[] getData()
		   {
		       double newArray[] = new double[data.length];
		       for(int i=0; i<data.length; i++)
		           newArray[i] = data[i];
		       return newArray;
		   }
		   
		 /*Returns the boolean value true if the data objects of both the calling
		 Stat object and the passed Stat object s have the same values*/	   
		   public boolean equals(Stat s)
		   {
		       if(s == null)
		           return false;

		       if(data.length != s.data.length)
		           return false;
		          
		       for(int i=0; i< s.data.length; i++)
		       {
		           if(data[i]!= s.data[i])
		               return false;
		       }
		       return true;
		   }
		   
		   //reset method
		   public void reset()
		   {
		       double newArray[] = new double[0];
		       data = newArray;
		   }
		   
		   //append double method
		   public void append(double[] d)
		   {
		       if(d == null)
		           return;
		          
		       double newArray[] = new double[data.length + d.length];
		      
		       for(int j=0; j<data.length; j++)
		       {
		           newArray[j] = data[j];
		       }
		       for(int j=0; j<d.length; j++)
		       {
		           newArray[data.length + j] = d[j];
		       }
		       data = newArray;
		   }
		   
		   //append int method
		   public void append(int[] i)
		   {
		       if(i == null)
		           return;
		          
		       double newArray[] = new double[data.length + i.length];
		      
		       for(int j=0; j<data.length; j++)
		       {
		           newArray[j] = data[j];
		       }
		       for(int j=0; j<i.length; j++)
		       {
		           newArray[data.length + j] = i[j];
		       }
		       data = newArray;
		   }
		   
		   //append long method
		   public void append(long[] lo)
		   {
		       if(lo == null)
		           return;
		          
		       double newArray[] = new double[data.length + lo.length];
		      
		       for(int j=0; j<data.length; j++)
		       {
		           newArray[j] = data[j];
		       }
		       for(int j=0; j<lo.length; j++)
		       {
		           newArray[data.length + j] = lo[j];
		       }
		       data = newArray;
		   }
		   
		   //append float method
		   public void append(float[] f)
		   {
		       if(f == null)
		           return;
		          
		       double newArray[] = new double[data.length + f.length];
		      
		       for(int j=0; j<data.length; j++)
		       {
		           newArray[j] = data[j];
		       }
		       for(int j=0; j<f.length; j++)
		       {
		           newArray[data.length+j] = f[j];
		       }
		       data = newArray;
		   }
		   
		   //isEmpty method
		   public boolean isEmpty()
		   {
			   if (data == null)
			   		return true;
		       if(data.length == 0)
		           return true;
		       return false;
		   }
		   
		   //String representation of the data
		   public String toString()
		   {
		       if(isEmpty()) return "[]";
		       String s = "[";
		       
		       for(int i=0; i<data.length; i++)
		       {
		    	   if (i < data.length -1)
		           s = s + data[i] + ", ";
		    	   else
			           s = s + data[i] + " ";
		       }
		       s = s.trim() +  "]";
		       return s;
		   }
		   
		   //for loop to find the minimum of the array
		   public double min()
		   {
		       if(isEmpty())
		           return Double.NaN;
		          
		       double min = data[0];
		       for(int i=1; i<data.length; i++)
		       {
		           if(data[i] < min)
		               min = data[i];
		       }
		       return min;
		   }
		   
		   //for loop to find the maximum of the array
		   public double max()
		   {
		       if(isEmpty())
		           return Double.NaN;
		          
		       double max = data[0];
		       for(int i=1; i<data.length; i++)
		       {
		           if(data[i] > max)
		               max = data[i];
		       }
		       return max;
		   }
		   
		   //for loop to find the average of the array
		   public double average()
		   {
		       if(isEmpty())
		           return Double.NaN;
		          
		       double sum = 0.0;
		       for (int i = 0; i < data.length; i++) {

		           sum += data[i];
		       }
		       return sum / data.length;
		   }

		   //for loop to find the mode of the array
		   public double mode()
		   {
		       if(isEmpty())
		           return Double.NaN;
		          
		       int mx = 0;
		       double val = data[0];
		       for(int i=0; i<data.length; i++)
		       {
		           int k =  occursNumberOfTimes(data[i]);
		           
		           if(k > mx)
		           {
		               mx = k;
		               val = data[i];
		                
		           }
		           if (val == 1.0)
		        	   val = Double.NaN;
		       }
		       return val;
		   }
		   
		   //occursNumberOfTimes method
		   private int  occursNumberOfTimes(double value)
		   {
		       int count = 0;
		       for(int i=0; i<data.length; i++)
		       {
		           if(data[i]==value)
		               count++;
		       }
		       return count;
		   }
		   
		   //variance method
			public double variance() {
				if (isEmpty())
					return Double.NaN;

				double average = 0;

				for (int i = 0; i < this.data.length; i++) {
					average = average + this.data[i];
				}

				average = average / this.data.length;

				double var = 0;

				for (int i = 0; i < this.data.length; i++) {

					var = var + Math.pow(this.data[i] - average, 2);
				}

				return var / this.data.length;

			}
			
		   //standardDeviation method
		   public double standardDeviation()
		   {
		       if(isEmpty())
		           return Double.NaN;
		          
		       double variance = variance();
		       
		       return Math.sqrt(variance);
		   }
		
}
