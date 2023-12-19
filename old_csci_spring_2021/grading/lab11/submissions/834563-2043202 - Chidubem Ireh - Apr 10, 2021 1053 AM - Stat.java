/*
 * Stat.java
 * Author:  Chidubem Ireh
 * Submission Date:  4/10/21
 *
 * Purpose:The purpose of this program is to learn how to use Arrays in a different context
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

	private double data[];
	public Stat()
	{
	   data = new double[1];
	   data[0] = 0.0;
     }
	public Stat(double[] d) 
	{
   double[] newArray = new double[d.length];
   for (int i = 0; i < d.length; i++) 
   {
   newArray[i] = d[i];
   }
   data = newArray;
	}
	 
	public double[] getData() 
	 {
   double[] newArray = new double[data.length];
   for (int i = 0; i < data.length; i++)
   {
    newArray[i] = data[i];
   }
   return newArray;
   }
	
	 public void setData(double[] d)
	 {
   double[] newArray = new double[d.length];
   for (int i = 0; i < d.length; i++)
   {
       newArray[i] = d[i];
   }
   data = newArray;
   }
	 
	 public boolean equals(Stat s) 
	 {
       double sdata[] = s.getData();
       if (data.length != sdata.length)
           return false;
       for (int i = 0; i < data.length; i++) 
       {
           if (data[i] != sdata[i])
               return false;
       }
       return true;
	   }

	   public String toString()
	   {
       String arrayData = "";
       for (int i = 0; i < data.length; i++) 
       {
           if (i == data.length - 1)
               arrayData += data[i];
           else
               arrayData += data[i] + ", ";
       }
       return "[" + arrayData + "]";
	   }
//min values
	   public double min() {
       double min = data[0];
       for (int i = 1; i < data.length; i++) 
       {
       if (data[i] < min)
       min = data[i];
       }
       return min;
	   }
//max values
	   public double max()
	   {
       double max = data[0];
       for (int i = 1; i < data.length; i++) 
       {
       if (data[i] > max)
       max = data[i];
       }
       return max;

	   }
	   
	   public double average() 
	   {
       double sum = 0.0;
       for (int i = 0; i < data.length; i++) 
       {
    	sum += data[i];
       }
       return sum / data.length;
	   }
//mode
	   public double mode() 
	   {
       double maxNum = data[0];
       int maxNumCount = 1;
       for (int i = 0; i < data.length; i++) 
       {
       int numCount = 0;
       for (int j = 0; j < data.length; j++) 
       {
       if (data[i] == data[j])
           numCount++;
       }
       if (numCount > maxNumCount) 
       {
       maxNumCount = numCount;
       maxNum = data[i];
       }
       }
       if (maxNumCount > 1)
       return maxNum;
       else
       return Double.NaN;
   }
	 
	  
}
