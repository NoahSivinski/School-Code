/*
 * [Stat].java
 * Author:  [Anchal Patel] 
 * Submission Date:  [April 16, 2021]
 *
 * Purpose: The purpose of my program is to compute the maximun, minimum, mode, and average of a
 * group of values. My program does these tasks by implementing public methods.
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
	
	private double[] data;

	
	public Stat()
	{
		data = new double[0];
	}

	
	public Stat(double[] d)
	{
		if(d==null)
			data=null;
		else
		{
			data = new double[d.length];
			for(int i=0; i<d.length; i++)
				data[i] = d[i];
		}
	}
	
	public Stat(float[] f)
	{
		if(f==null)
			data=null;
		else
		{
			data = new double[f.length];
			for(int i=0; i<f.length; i++)
				data[i] = f[i];
		}
	}
	
	public Stat(int[] i)
	{
		if(i==null)
			data=null;
		else
		{
			data = new double[i.length];
			for(int j=0; j<i.length; j++)
				data[j] = i[j];
		}
	}
	
	public Stat(long[] lo)
	{
		if(lo==null)
			data=null;
		else
		{
			data = new double[lo.length];
			for(int i=0; i<lo.length; i++)
				data[i] = lo[i];
		}
	}
	
	public void setData(float [] f)
	{
		if(f==null)
			data=null;
		else
		{
			data = new double[f.length];
			for(int i=0; i<f.length; i++)
				data[i] = f[i];
		}
	}
	
	public void setData(double [] d)
	{
		if(d==null)
			data=null;
		else
		{
			data = new double[d.length];
			for(int i=0; i<d.length; i++)
				data[i] = d[i];
		}
	}
	
	public void setData(int [] i)
	{
		if(i==null)
			data=null;
		else
		{
			data = new double[i.length];
			for(int j=0; j<i.length; j++)
				data[j] = i[j];
		}
	}
	
	public void setData(long [] lo)
	{
		if(lo==null)
			data=null;
		else
		{
			data = new double[lo.length];
			for(int i=0; i<lo.length; i++)
				data[i] = lo[i];
		}
	}

	public double[] getData()
	{
		double tmp[] = new double[data.length];
		for(int i=0; i<data.length; i++)
			tmp[i] = data[i];
		return tmp;
	}
	
	public boolean equals(Stat s)
	{
		if(s==null)
			return false;

		if(data.length!=s.data.length)
			return false;

		for(int i=0; i<s.data.length; i++)
		{
			if(data[i]!=s.data[i])
				return false;
		}
		return true;
	}
	
	public void reset()
	{
		double tmp[] = new double[0];
		data = tmp;
	}
	
	public void append(double[] d)
	{
		if(d==null)
			return;

		double tmp[] = new double[data.length+d.length];

		for(int j=0; j<data.length; j++)
		{
			tmp[j] = data[j];
		}
		for(int j=0; j<d.length; j++)
		{
			tmp[data.length+j] = d[j];
		}
		data = tmp;
	}
	
	public void append(int[] i)
	{
		if(i==null)
			return;

		double tmp[] = new double[data.length+i.length];

		for(int j=0; j<data.length; j++)
		{
			tmp[j] = data[j];
		}
		for(int j=0; j<i.length; j++)
		{
			tmp[data.length+j] = i[j];
		}
		data = tmp;
	}
	
	public void append(long[] lo)
	{
		if(lo==null)
			return;

		double tmp[] = new double[data.length+lo.length];

		for(int j=0; j<data.length; j++)
		{
			tmp[j] = data[j];
		}
		for(int j=0; j<lo.length; j++)
		{
			tmp[data.length+j] = lo[j];
		}
		data = tmp;
	}
	
	public void append(float[] f)
	{
		if(f==null)
			return;

		double tmp[] = new double[data.length+f.length];

		for(int j=0; j<data.length; j++)
		{
			tmp[j] = data[j];
		}
		for(int j=0; j<f.length; j++)
		{
			tmp[data.length+j] = f[j];
		}
		data = tmp;
	}
	
	public boolean isEmpty()
	{
		if(data.length==0)
			return true;
		return false;
	}
	
	public String toString()
	{
		if(isEmpty()) return "[]";
		String s = "[";
		for(int i=0; i<data.length; i++)
		{
			s = s + data[i] + " ";
		}
		s = s.trim() + "]";
		return s;
	}
	
	public double min()
	{
		if(isEmpty())
			return Double.NaN;

		double mn = data[0];
		for(int i=1; i<data.length; i++)
		{
			if(data[i] < mn)
				mn = data[i];
		}
		return mn;
	}
	
	public double max()
	{
		if(isEmpty())
			return Double.NaN;

		double mx = data[0];
		for(int i=1; i<data.length; i++)
		{
			if(data[i] > mx)
				mx = data[i];
		}
		return mx;
	}
	
	public double average()
	{
		if(isEmpty())
			return Double.NaN;

		double sum = 0;
		for(int i=1; i<data.length; i++)
		{
			sum = sum + data[i];
		}
		return sum/data.length;
	}
	
	public double mode()
	{
		if(isEmpty())
			return Double.NaN;

		int mx = 0;
		double val = data[0];
		for(int i=0; i<data.length; i++)
		{
			int k = occursNumberOfTimes(data[i]);
			if(k > mx)
			{
				mx = k;
				val = data[i];
			}
		}
		return val;
	}
	
	private int occursNumberOfTimes(double value)
	{
		int count = 0;
		for(int i=0; i<data.length; i++)
		{
			if(data[i]==value)
				count++;
		}
		return count;
	}
	
	public double variance()
	{
		if(isEmpty())
			return Double.NaN;

		double avg = average();
		double sum = 0;
		for(int i=0; i<data.length; i++)
		{
			sum = sum + (data[i] - avg)*(data[i] - avg);
		}
		return sum/data.length;
	}
	
	public double standardDeviation()
	{
		if(isEmpty())
			return Double.NaN;

		return Math.sqrt(variance());
	}
	
	


}

