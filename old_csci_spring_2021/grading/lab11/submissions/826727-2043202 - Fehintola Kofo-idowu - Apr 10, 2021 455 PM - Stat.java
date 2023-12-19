/*
 * [CSCI 1301].java
 * Author:  [Fehintola Kofo-Idowu] 
 * Submission Date:  [4/10/2021]
 *
 * Purpose: to compute the min, max, mode, and average of these values. 
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
	
	 public Stat(){
	       data = new double[1];
	       data[0] = 0.0;

	   }
	 public Stat(double[] d) {
	        data = new double[d.length];
	        
	        for (int i = 0; i < d.length; i++)
	            data[i] = d[i];
	        data = d;
	    }
	 public double[] getData() {
	        double[] d = new double[data.length];
	        
	        for (int i = 0; i < data.length; i++)
	            d[i] = data[i];
	        return d;
	    }
	 
	 public void setData(double[] d) {
	       double[] data = new double[d.length];
	        
	        for (int i = 0; i < d.length; i++) {
	        
	            data[i] = d[i];
	        }
	        data = d;
	    }
	 public boolean equals(Stat s) {
	       double sdata[] = s.getData();
	       if (data.length != sdata.length)
	           return false;
	       for (int i = 0; i < data.length; i++) {
	           if (data[i] != sdata[i])
	               return false;
	       }
	       return true;
	   }
	 public String toString() {
	       String s = "";
	       for (int i = 0; i < data.length; i++) {
	           if (i == data.length - 1)
	               s += data[i];
	           else
	               s += data[i] + ", ";
	       }
	       return "[" + s + "]";
	   }
	 
	 public double min() {
	        double mini = data[0];
	        for (int i = 1; i < data.length; i++)
	            if (mini > data[i])
	                mini = data[i];
	        return mini;
	    }
	   public double max() {
	       double maxi = data[0];
	       for (int i = 1; i < data.length; i++) {
	           if (data[i] > maxi)
	               maxi = data[i];

	       }
	       return maxi;

	   }
	   public double average() {
	        double sum = 0;
	        for (int i = 0; i < data.length; i++)
	            sum += data[i];
	        return sum / data.length;
	    }
	   public double mode() {
	   if(data.length==1)
	        return data[0];
	    double maxnum;
	    double [] datamode = new double [data.length];  //store frequency
	    int maxcount = -1;  

	    for(int i = 0; i < data.length; i++)
	    {           
	        int count = 1;  
	        for(int j = i+1; j < data.length; j++)
	        {  
	            if(data[i] == data[j])
	            {  
	                count++;   
	                datamode[j] = maxcount;  
	            }  
	        }  
	        if(datamode[i] != maxcount)  
	            datamode[i] = count;  
	    }  


	    for (int i = 0; i < datamode.length; i++)   // sort array in decreasing order
	    {
	        for (int j = i + 1; j < datamode.length; j++) 
	        {
	            if (datamode[i] < datamode[j]) 
	            {
	                maxnum = data[i];
	                data[i] = data[j];
	                data[j] = maxnum;

	                maxnum = datamode[i];
	                datamode[i] = datamode[j];
	                datamode[j] = maxnum;
	            }
	        }
	    }

	    if(datamode[0] == datamode[1])
	        return Double.NaN;
	    else
	        return data[0];

	}
		   

}


