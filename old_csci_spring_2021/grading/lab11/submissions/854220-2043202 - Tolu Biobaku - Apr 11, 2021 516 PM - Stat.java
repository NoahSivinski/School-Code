/*
 * Stat.java
 * Author:  Toluwani Biobaku
 * Submission Date:  04/11/2021
 *
 * Purpose: 
 * 
 * The purpose of this program is to continue practicing defining 
 * my own classes, in this case implementing a class called Stat that is described using a UML 1 class diagram.
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
		String dataArray = "";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1)
				dataArray += data[i];
			else
				dataArray+= data[i] + ", ";
		}
		return "[" + dataArray + "]";
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
		double maximumNum;
		double [] modefordata = new double [data.length];  
		int maximumNumCount = -1;  

		for(int i = 0; i < data.length; i++)
		{           
			int numberCount = 1;  
			for(int j = i+1; j < data.length; j++)
			{  
				if(data[i] == data[j])
				{  
					numberCount++;   
					modefordata[j] = maximumNumCount;  
				}  
			}  
			if(modefordata[i] != maximumNumCount)  
				modefordata[i] = numberCount;  
		}  


		for (int i = 0; i < modefordata.length; i++)  
		{
			for (int j = i + 1; j < modefordata.length; j++) 
			{
				if (modefordata[i] < modefordata[j]) 
				{
					maximumNum = data[i];
					data[i] = data[j];
					data[j] = maximumNum;

					maximumNum = modefordata[i];
					modefordata[i] = modefordata[j];
					modefordata[j] = maximumNum;
				}
			}
		}

		if(modefordata[0] == modefordata[1])
			return Double.NaN;
		else
			return data[0];
	}
}
