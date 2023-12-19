
/*
 * CSCI1301 27827
 * Stat.java
 * Author:  Casey Wesolowski 
 * Submission Date:  April 16th, 2021
 *
 * Purpose:  The purpose of Stat.java is to continue to practice
 * defining and implementing classes using a given UML diagram.
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

public class Stat{
	
	private double[] data; //private double instance data
	
	public static final double THRESHOLD = 0.000000001;	
	
	//Stat – default constructor – a double array with only 0.0
	public Stat()	{
		if (data.length == 0)	{
			data = null;
			return;
		}
		else	{
			data = new double[] {0.0};
			return;
		}
	}
	//Stat – constructs a Stat objects using the values in d
	public Stat(double[] d)	{
		if (data == null)	{
			double[] empty = new double[0];
			data = empty;
		}
		else	{
			data = d;
		}
	}
	//Stat float
	public Stat(float[] f)	{
		if (data == null)	{
			double[] empty = new double[0];
			data = empty;
		}
		else	{
			int n = data.length; //prevents the float to double error
			f = new float[n];
			for (int i = 0; i < n; i++) {
				f[i] = (float)data[i];
			}
		}	
	}
	
	//Stat int
	public Stat(int[] i)	{
		if (data == null)	{
			double[] empty = new double[0];
			data = empty;
		}
		else	{
			int n = data.length; //prevents the int to double error
			i = new int[n];
			for (int j = 0; j < n; j++) {
				i[j] = (int)data[j];
			}
		}
	}
	
	//Stat long
	public Stat(long[] lo)	{
		if (data == null)	{
			double[] empty = new double[0];
			data = empty;
		}
		else	{
			int n = data.length; //prevents the long to double error
			lo = new long[n];
			for (int i = 0; i < n; i++) {
				lo[i] = (long)data[i];
			}
		}
	}
	
	//setData float: void
	public void setData(float[] f)	{
		if (data != null)	{
			int n = data.length; 
			f = new float[n];
			for (int i = 0; i < n; i++) {
				f[i] = (float)this.data[i];
			}
		}
		else	{
			double[] empty = new double[0];
			data = empty;
		}
	}
	//setData double: void
	public void setData(double[] d) { 
		if (data != null)	{
			this.data = d;
		}
		else	{
			double[] empty = new double[0];
			data = empty;
		}
	}
	//setData int: void
	public void setData(int[] i)	{
		if (data != null)	{
			int n = data.length; 
			i = new int[n];
			for (int j = 0; j < n; j++) {
				i[j] = (int)this.data[j];
			}
		}
		else	{
			double[] empty = new double[0];
			data = empty;
		}
		
	}
	
	//setData long: void
	public void setData(long[] lo)	{
		if (data != null)	{
			int n = data.length; 
			lo = new long[n];
			for (int i = 0; i < n; i++) {
				lo[i] = (long)this.data[i];
			}
		}
		else	{
			double[] empty = new double[0];
			data = empty;
		}
	}
	
	//Should create a new array containing the same values as data
	public double[] getData()	{
		double[] array = this.data;
		return array;
	}
	//equals – true if the data objects of both the calling Stat object and 
	//passed Stat object s have the same values
	public boolean equals(Stat s) {
		if(this.getData() == getData())	{
			return true;
		}
		else	{
			return false;
		}
	}
	//reset(): void
	//Clears the data array
	public void reset()	{
		double[] empty = new double[0];
		this.data = empty;
	}
	//append(int[] i): void
	public void append(int[] i)	{
		if (data != null)	{
			double[] array = data;
			int n = data.length; 
			i = new int[n];
			for (int j = 0; j < n; j++) {
				i[j] = (int)this.data[j];
			}
		}
		else	{
			//Else this method does nothing
		}
	}
	
	//append(float[] f): void
	public void append(float[] f)	{
		if (data != null)	{
			double[] array = data;
			int n = data.length; 
			f = new float[n];
			for (int i = 0; i < n; i++) {
				f[i] = (float)this.data[i];
			}
		}
		else	{
			//Else this method does nothing
		}
	}
	
	//append(long[] lo): void
	public void append(long[] lo)	{
		if (data != null)	{
			double[] array = data;
			int n = data.length; 
			lo = new long[n];
			for (int i = 0; i < n; i++) {
				lo[i] = (long)this.data[i];
			}
		}
		else	{
			//Else this method does nothing
		}
	}
	//append(double[] d): void
	public void append(double[] d)	{
		if (data != null)	{
			double[] array = data;
			int n = data.length; 
			d = new double[n];
			for (int i = 0; i < n; i++) {
				d[i] = this.data[i];
			}
		}
		else	{
			//Else this method does nothing
		}
	}
	//isEmpty(): boolean
	//returns true if the data object is empty
	public boolean isEmpty()	{
		if(data.length == 0) {
			return true;
		}
		else	{
			return false;
		}
	}
	//toString
	public String toString() {
		if (data != null)	{
			String printArray = "";
			for(int i = 0; i < data.length - 1; i++) {
				printArray += data[i] + ", ";
			}
			printArray += data[data.length];
			return "[" + printArray + "]";
		}
		else	{
			return "[ ]";
		}
	}	
		
	//min – returns the minimum value of the data array
	public double min()	{
		double minimum;
		for(int i = 0; i < data.length; i++ )	{
			for(int j = i + 1; j < data.length; j++)	{
				if(data[i] > data[j]) {
					minimum = data[i];
					data[i] = data[j];
					data[j] = minimum;
				}
			}
		}
		return data[0];
	}
	//max – returns the maximum value of the data array
	public double max()	{
		double maximum;
		for(int i = 0; i < data.length; i++) {
			for(int j = i + 1; j < data.length; j++) {
				if(data[i] < data[j])	{
					maximum = data[j];
					data[j] = data[i];
					data[i] = maximum;
				}
			}
		}
		return data[0];
		
	}
	//average – returns the average value of the data array
	public double average()	{
		double added = 0;
		for(int i = 0; i < data.length; i++)	{
			added = added + data[i];
		}
		added = added / data.length;
		return added;
	}
	//average – returns the value that occurs the most in the data array
	public double mode()	{
		double most = 0;
		int counter = 0, currentCount = 0;
		for (int i = 0; i < data.length; i++) {
		    double current = data[i];
		    currentCount = 1;
		    for (int j = i + 1; j < data.length; j++) {
		        if (Math.abs(data[j] - current) < THRESHOLD) {
		            ++currentCount;
		        } 
		    }
		    if (currentCount >= counter) {
		    	counter = currentCount;
		        most = current;
		    } 
		    else {
		        most = Double.NaN;
		    }
		}
		return most;
	}
	//-occursNumberOfTimes(double value): int
	public int occursNumberOfTimes()	{
	    int count=0,currentInt=0;
	    for (int i = 0; i < data.length; i++)
	    {
	    currentInt = (int)data[i];
	    count=0;

	       for (int j = 0; j < data.length; j++)
	           {
	             if (currentInt == data[j])
	                {
	                  count++;
	                 }
	            }
	            System.out.println(count);
	      }
	    return count;
	}
	//variance(): double
	public double variance()	{
        // Compute mean (average 
        // of elements)
        double sum = 0;
        int n = data.length;
          
        for (int i = 0; i < n; i++)
            sum += data[i];
        	double mean = (double)sum / 
                      (double)n;
      
        // Compute sum squared 
        // differences with mean.
        double sqDiff = 0;
        for (int i = 0; i < n; i++) 
            sqDiff += (data[i] - mean) * 
                      (data[i] - mean);
          
        return (double)sqDiff / n;
	}
	//standardDeviation(): double
	public double standardDeviation()	{
		return Math.sqrt(variance());
	}
	
	public static void main(String[] args) {
		double[] data1 = {};

		
		
	}
}










//I have no idea what I'm doing
