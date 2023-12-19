/*
 * Stat.java
 * Author:  Deborah Orekoya
 * Submission Date:  04/10/2021
 *
 * Purpose: 
 * 
 * The purpose of this program is to continue practicing defining 
 * my own classes using a UML class diagram. I had to implement
 * public methods to compute the min, max, mode, and average of
 * these values. I also implemented methods to “get” and “set” 
 * the values held by data. And most importantly, I had to make
 * sure that the data is a private instance variable.
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
		data = new double[1];
		data[0] = 0.0;
	}

	public Stat(double[] d) {
		double[] newArray = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
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

	public void setData(double[] d) {
		double[] newArray = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}

	public boolean equals(Stat s) {
		double sdata[] = s.getData();
		if(data.length != sdata.length)
			return false;
		for (int i = 0; i < data.length; i++) {
			if(data[i] != sdata[i])
				return false;
		}
		return true;
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
		double min = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < min)
				min = data[i];
		}
		return min;
	}

	public double max() {
		double max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max)
				max = data[i];
		}
		return max; 
	}

	public double average() {
		double sum = 0.0;
		for(int i = 0; i < data.length; i++) {
			sum = data[i] + sum;
		}
		return sum / data.length;
	}

	public double mode() {
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
}
