/*
 * Stat.java
 * Author:  Deborah Orekoya
 * Submission Date:  04/16/2021
 *
 * Purpose: 
 * 
 * The purpose of this program is to continue practicing working
 * with some subtleties of one dimensional arrays and focus on 
 * method overloading. This program is a modified version of the 
 * previous lab and expands its functionality.
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

	public Stat() {
		data = new double[0];
	}

	public Stat(double[] d) {
		double[] newArray = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}

	public Stat(float[] f) {
		double[] newArray = new double[f.length];
		for(int i = 0; i < f.length; i++) {
			newArray[i] = f[i];
		}
		data = newArray;
	}

	public Stat(int[] i) {
		double[] newArray = new double[i.length];
		for(int j = 0; j < i.length; j++) {
			newArray[j] = i[j];
		}
		data = newArray;
	}
	public Stat(long[] lo) {
		double[] newArray = new double[lo.length];
		for(int i = 0; i < lo.length; i++) {
			newArray[i] = lo[i];
		}
		data = newArray;
	}

	public void setData(float[] f) {
		double[] newArray = new double[0];
		if (f != null) {
			newArray = new double[f.length];
			for(int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
		}
		data = newArray;
	}

	public void setData(double[] d) {
		double[] newArray = new double[0];
		if (d != null) {
			newArray = new double[d.length];
			for(int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}
		}
		data = newArray;
	}

	public void setData(int[] i) {
		double[] newArray = new double[0];
		if (i != null) {
			newArray = new double[i.length];
			for(int j = 0; j < i.length; j++) {
				newArray[j] = i[j];
			}
		}
		data = newArray;
	}

	public void setData(long[] lo) {
		double[] newArray = new double[0];
		if (lo != null) {
			newArray = new double[lo.length];
			for(int i = 0; i < lo.length; i++) {
				newArray[i] = lo[i];
			}
		}
		data = newArray;
	}

	public double[] getData() {
		double[] newArray = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}

	public boolean equals(Stat s) {
		if (s == null)
			return false;
		if(data.length != s.data.length)
			return false;
		for (int i = 0; i < s.data.length; i++) {
			if(data[i] != s.data[i])
				return false;
		}
		return true;
	}
	public void reset() {
		double newArray[] = new double[0];
		data = newArray;
	}

	public void append(int[] i) {
		if (i == null)
			return;
		double newArray[] = new double[data.length + i.length];

		for (int j = 0; j < data.length; j++) {
			newArray[j] = data[j];
		}
		for (int j = 0; j < i.length; j++) {
			newArray[data.length + j] = i[j];
		}
		data = newArray;
	}

	public void append(float[] f) {
		if (f == null)
			return;
		double newArray[] = new double[data.length + f.length];

		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		for (int i = 0; i < f.length; i++) {
			newArray[data.length + i] = f[i];
		}
		data = newArray;
	}
	public void append(long[] lo) {
		if(lo == null)
			return;

		double newArray[] = new double[data.length + lo.length];

		for(int i = 0; i < data.length; i++)
		{
			newArray[i] = data[i];
		}
		for(int i = 0; i < lo.length; i++)
		{
			newArray[data.length+i] = lo[i];
		}
		data = newArray;
	}
	public void append(double[] d) {
		if(d == null)
			return;

		double newArray[] = new double[data.length + d.length];

		for(int i = 0; i < data.length; i++)
		{
			newArray[i] = data[i];
		}
		for(int i = 0; i < d.length; i++)
		{
			newArray[data.length+i] = d[i];
		}
		data = newArray;
	}
	public boolean isEmpty() {
		if (data.length == 0)
			return true;
		else {
			return false;
		}
	}
	public String toString() {
		String arrayData = "";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1)
				arrayData += data[i];
			else
				arrayData += data[i] + ", ";
		}
		return "[" + arrayData + "]";	
	}

	public double min() {
		if (isEmpty())
			return Double.NaN;
		double min = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < min)
				min = data[i];
		}
		return min;
	}

	public double max() {
		if (isEmpty())
			return Double.NaN;
		double max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max)
				max = data[i];
		}
		return max; 
	}

	public double average() {
		if (isEmpty())
			return Double.NaN;
		double sum = 0.0;
		for(int i = 0; i < data.length; i++) {
			sum = data[i] + sum;
		}
		return sum / data.length;
	}

	public double mode() {
		if (isEmpty())
			return Double.NaN;
		if(data.length==1)
			return data[0];
		double maxNumber;
		double [] datamode = new double [data.length];  
		int maxNumberCount = -1;  

		for(int i = 0; i < data.length; i++)
		{           
			int numberCount = 1;  
			for(int j = i+1; j < data.length; j++)
			{  
				if(data[i] == data[j])
				{  
					numberCount++;   
					datamode[j] = maxNumberCount;  
				}  
			}  
			if(datamode[i] != maxNumberCount)  
				datamode[i] = numberCount;  
		}  


		for (int i = 0; i < datamode.length; i++)  
		{
			for (int j = i + 1; j < datamode.length; j++) 
			{
				if (datamode[i] < datamode[j]) 
				{
					maxNumber = data[i];
					data[i] = data[j];
					data[j] = maxNumber;

					maxNumber = datamode[i];
					datamode[i] = datamode[j];
					datamode[j] = maxNumber;
				}
			}
		}
		if(datamode[0] == datamode[1])
			return Double.NaN;
		else
			return data[0];
	}

	public double variance() {
		if(isEmpty())
			return Double.NaN;

		double sum = 0.0;
		for(int i = 0; i < data.length; i++)
		{
			sum = sum + (data[i] - average()) * (data[i] - average());
		}
		return sum / data.length;
	}

	public double standardDeviation() {
		if(isEmpty())
			return Double.NaN;

		return Math.sqrt(variance());
	}
}