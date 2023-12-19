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
public class Stat 
	{
	private double[] data;
	
	public Stat() {
	    data = new double[0];
	
	}
	
	
	public Stat(double[] d) 
	{
	    double dd[] = new double[d.length];
	    for (int i = 0; i < d.length; i++)
	    {
	      dd[i] = d[i];
	    }
	    this.data = dd;
	}
	
	public Stat(float[] f) 
	{
	    double dd[] = new double[f.length];
	    for (int i = 0; i < f.length; i++) 
	    {
	      dd[i] = (double) (f[i]);
	    }
	    this.data = dd;
	}
	
	public Stat(int[] i) 
	{
	    double dd[] = new double[i.length];
	    for (int j = 0; j < i.length; j++)
	    {
	      dd[j] = (double) (i[j]);
	    }
	    this.data = dd;
	}
	
	public Stat(long[] f) 
	{
	    double dd[] = new double[f.length];
	    for (int i = 0; i < f.length; i++)
	    {
	      dd[i] = (double) (f[i]);
	    }
	    this.data = dd;
	}
	
	
	public double[] getData() 
	{
	    double d[] = new double[data.length];
	    for (int i = 0; i < data.length; i++) 
	    {
	      d[i] = data[i];
	    }
	    return d;
	}
	
	public void setData(double[] d)
	{
	    try
	    {
	      double dd[] = new double[d.length];
	      for (int i = 0; i < d.length; i++) 
	      {
	        dd[i] = d[i];
	      }
	      this.data = dd;
	    } catch (NullPointerException e) {
	      this.data = new double[0];
	    }
	}
	
	public void setData(float[] d) {
	    double dd[] = new double[d.length];
	    for (int i = 0; i < d.length; i++) {
	      dd[i] = (double) d[i];
	    }
	    this.data = dd;
	}
	
	public void setData(int[] d) {
	    double dd[] = new double[d.length];
	    for (int i = 0; i < d.length; i++) {
	      dd[i] = (double) d[i];
	    }
	    this.data = dd;
	}
	
	public void setData(long[] d) {
	    double dd[] = new double[d.length];
	    for (int i = 0; i < d.length; i++) {
	      dd[i] = (double) d[i];
	    }
	    this.data = dd;
	}
	  
	public boolean equals(Stat s) {
	    boolean result = true;
	    try {
	      if (s.data.length == this.data.length) {
	        for (int i = 0; i < s.data.length; i++) {
	          if (s.data[i] != this.data[i]) {
	            return false;
	
	          }
	        }
	      } else 
	      {
	        return false;
	      }
	      return result;
	    } 
	    catch (NullPointerException e)
	    {
	      return false;
	    }
	}
	
	public void reset() 
	{
	
	    double da[] = new double[0];
	
	    this.data = da;
	}
	
	public void append(double[] d)
	{
	    try 
	    {
	      if (d.length > 0)
	      {
	        int arcount = 0;
	        int len = this.data.length + d.length;
	        double[] res = new double[len];
	        for (int i = 0; i < data.length; i++) 
	        {
	          res[i] = this.data[i];
	        }
	
	        for (int i = data.length; i < len; i++)
	        {
	
	          res[i] = d[arcount];
	          arcount++;
	        }
	        this.data = res;
	      }
	    } 
	    catch (NullPointerException e) 
	    {}
	}
	
	public void append(float[] d) 
	{
	    if (d.length > 0) 
	    {
	      int arcount = 0;
	      int len = this.data.length + d.length;
	      double[] res = new double[len];
	      for (int i = 0; i < data.length; i++) 
	      {
	        res[i] = this.data[i];
	      }
	
	      for (int i = data.length; i < len; i++) 
	      {
	        res[i] = Double.valueOf(d[arcount]);
	        arcount++;
	      }
	      this.data = res;
	    }
	}
	
	public void append(int[] d) 
	{
	    if (d.length > 0) 
	    {
	      int arcount = 0;
	      int len = this.data.length + d.length;
	      double[] res = new double[len];
	      for (int i = 0; i < data.length; i++) 
	      {
	        res[i] = this.data[i];
	      }
	
	      for (int i = data.length; i < len; i++) 
	      {
	
	        res[i] = Double.valueOf(d[arcount]);
	        arcount++;
	      }
	      this.data = res;
	    }
	}
	
	public void append(long[] d) 
	{
	    if (d.length > 0) 
	    {
	      int arcount = 0;
	      int len = this.data.length + d.length;
	      double[] res = new double[len];
	      for (int i = 0; i < data.length; i++)
	      {
	        res[i] = this.data[i];
	      }
	
	      for (int i = data.length; i < len; i++) 
	      {
	
	        res[i] = Double.valueOf(d[arcount]);
	        arcount++;
	      }
	      this.data = res;
	    }
	}
	
	public boolean isEmpty() 
	{
	
	    if (this.data.length == 0)
	      return true;
	
	    return false;
	}
	
	
	public String toString() 
	{
	    String result = "[";
	for (int i = 0; i < this.data.length; i++) 
	{
	  result = result + " " + this.data[i];
	
	}
	return result + "]";
	}
	
	// minimum
	public double min() 
	{
	    if (this.data.length > 0) 
	    {
	      double m = this.data[0];
	      for (int i = 0; i < this.data.length; i++) 
	      {
	        if (m > data[i])
	        {
	          m = data[i];
	        }
	      }
	      return m;
	    } else if (this.data.length == 0)
	    {
	      return Double.NaN;
	    }
	    return Double.NaN;
	}
	
	// maximum
	public double max()
	{
	    if (this.data.length > 0)
	    {
	      double m = this.data[0];
	      for (int i = 0; i < this.data.length; i++)
	      {
	        if (m < data[i]) 
	        {
	          m = data[i];
	        }
	      }
	      return m;
	    } else if (this.data.length == 0) 
	    {
	      return Double.NaN;
	}
	return Double.NaN;
	}
	
//average
	public double average() 
	{
	    double s = 0;
	    for (int i = 0; i < this.data.length; i++)
	    {
	      s = s + this.data[i];
	    }
	    return s / this.data.length;
	}
	
	//  mode
	public double mode()
	{
	    if (this.data.length > 0) 
	    {
	      int modeCount = 0;
	      double modeElement = this.data[0];
	      for (int i = 0; i < this.data.length; i++) 
	      {
	        int numCount = 0;
	        double num = data[i];
	        for (int j = 0; j < this.data.length; j++)
	        {
	          if (data[j] == data[i]) {
	            numCount++;
	          }
	        }
	        if (numCount > modeCount) 
	        {
	          modeCount = numCount;
	          modeElement = num;
	        }
	      }
	      return modeElement;
	    } else if (this.data.length == 0) {
	      return Double.NaN;
	}
	return Double.NaN;
	}
	
	public int occursNumberOfTimes(double value) {
	
	    int count = 0;
	    for (int i = 0; i < this.data.length; i++) {
	
	      if (this.data[i] == value) {
	        count++;
	      }
	    }
	
	    return count;
	}
	
	public double variance()
	{
	
	    double average = 0;
	
	    for (int i = 0; i < this.data.length; i++) 
	    {
	
	      average = average + this.data[i];
	    }
	
	    average = average / this.data.length;
	
	    double var = 0;
	
	    for (int i = 0; i < this.data.length; i++) 
	    {
	
	      var = var + Math.pow(this.data[i] - average, 2);
	    }
	
	    return var / this.data.length;
	
	}
	//Standard Deviation
	public double standardDeviation() 
	{
	    double variance = variance();
	
	    return Math.sqrt(variance);
	}
	
}