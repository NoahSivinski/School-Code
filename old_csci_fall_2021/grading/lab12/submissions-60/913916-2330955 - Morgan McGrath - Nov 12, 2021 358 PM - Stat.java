/*
 * Stat.java
 * Author:  Morgan McGrath 
 * Submission Date:  11/12/2021
 *
 * Purpose: This program computes min, max, mode, and average
 * of a data set of doubles. 
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
	
	//instance variables
	private double[] data;
	
	//default constructor for Stat
	public Stat() {
		double [] d= new double[0];
		data=d;
	}
	//Constructs a Stat object using the values held in d
	public Stat(double[] d) {
		if(d==null) {
			data=new double[0];
		}
		else {
			double [] d2=new double[d.length];
			for(int i=0; i<d.length; i++) {
				d2[i]=d[i];
			}
			data=d2;
		}
	}
	//Constructs a Stat object using the values held in f
	public Stat(float[] f) {
		if(f==null) {
			data=new double[0];
		}
		else {
			double [] d=new double[f.length];
			for(int i=0; i<d.length; i++) {
				d[i]=(double)f[i];
			}
			data=d;
		}
	}
	//Constructs a Stat object using the values held in i
	public Stat(int[] i) {
		if(i==null) {
			data=new double[0];
		}
		else {
			double [] d=new double[i.length];
			for(int j=0; j<d.length; j++) {
				d[j]=(double)i[j];
			}
			data=d;
		}
	}
	//Constructs a Stat object using the values held in lo
	public Stat(long[] lo) {
		if(lo==null) {
			data=new double[0];
		}
		else {
			double [] d=new double[lo.length];
			for(int i=0; i<d.length; i++) {
				d[i]=(double)lo[i];
			}
			data=d;
		}
	}
	
	//Accessor method used to retrieve the values of data
	public double[] getData() {
		double [] d=new double[data.length];
		for(int i=0; i<data.length; i++) {
			d[i]=data[i];
		}
		return d;
	}
	//Mutator method used to set the values of the data array
	public void setData(double[] d) {
		if(d==null) {
			data=new double[0];
		}
		else {
			double [] d2=new double[d.length];
			for(int i=0; i<d.length; i++) {
				d2[i]=d[i];
			}
			data=d2;
		}
	}
	//Mutator method used to set the values of the data array when parameter is float
	public void setData(float[] f) {
		if(f==null) {
			data=new double[0];
		}
		else {
			double[] d=new double[f.length];
			for(int i=0; i<d.length; i++) {
				d[i]=(double)f[i];
			}
			data=d;
		}
	}
	//Mutator method used to set the values of the data array when the parameter is int
	public void setData(int[] i) {
		if(i==null) {
			data=new double[0];
		}
		else {
			double[] d=new double[i.length];
			for(int j=0; j<d.length; j++) {
				d[j]=(double)i[j];
			}
			data=d;
		}
	}
	//Mutator method used to set the values of the data array when the parameter is long
	public void setData(long[] lo) {
		if(lo==null) {
			data=new double[0];
		}
		else {
			double[] d=new double[lo.length];
			for(int i=0; i<d.length; i++) {
				d[i]=(double)lo[i];
			}
			data=d;
		}
	}
	
	//Returns the boolean value true if the data objects of both the calling
	//Stat object and the passed Stat object s have the same values (and in the same order). Otherwise, it
	//returns false. 
	public boolean equals(Stat s) {
		boolean isEqual=true;
		if(s==null) {
			isEqual=false;
		}
		else if(this.data.length!=s.data.length||s.data==null)
			isEqual=false;
		else {
			for(int i=0; i<this.data.length; i++) {
				if(this.data[i]!=s.data[i]) {
					isEqual=false;
				}
			}
		}
		return isEqual;
	}
	//This clears the data array
	public void reset() {
		double[] d=new double[0];
		data=d;
	}
	//These methods should create a new double array containing exactly those
	//elements of data followed by those of the array passed as parameter.
	public void append(int[] i) {
		if(i!=null) {
			double[] d=new double[data.length+i.length];
			int position=0;
			for(double value:data) {
				d[position]=value;
				position++;
			}
			for(int value:i) {
				d[position]=(double)value;
				position++;
			}
			data=d;
		}
	}
	
	public void append(float[] f) {
		if(f!=null) {
			double[] d=new double[data.length+f.length];
			int position=0;
			for(double value:data) {
				d[position]=value;
				position++;
			}
			for(float value:f) {
				d[position]=(double)value;
				position++;
			}
			data=d;
		}
	}
	
	public void append(long[] lo) {
		if(lo!=null) {
			double[] d=new double[data.length+lo.length];
			int position=0;
			for(double value:data) {
				d[position]=value;
				position++;
			}
			for(long value:lo) {
				d[position]=(double)value;
				position++;
			}
			data=d;
		}
	}
	
	public void append(double[] d) {
		if(d!=null) {
			double[] d2=new double[data.length+d.length];
			int position=0;
			for(double value:data) {
				d2[position]=value;
				position++;
			}
			for(double value:d) {
				d2[position]=value;
				position++;
			}
			data=d;
		}
	}
	//returns the boolean value true if the data object is empty (has length 0).
	//Otherwise, it returns false.
	public boolean isEmpty() {
		if(data.length==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Returns a String representation of the data elements stored in the Stat object
	public String toString() {
		String dataString="[";
		if(data.length>0) {
			for(int i=0; i<data.length-1;i++) {
				dataString+=data[i]+", ";
			}
			dataString+=data[data.length-1]+"]";
		}
		else {
			dataString+="]";
		}
		return dataString;
	}
	//Returns the minimum of the data array
	public double min() {
		if(isEmpty()==true) {
			return Double.NaN;
		}
		else {
			double min=data[0];
			for(int i=0; i<data.length; i++) {
				if(data[i]<min) {
					min=data[i];
				}
			}
			return min;
		}
	}
	//Returns the maximum of the data array
	public double max() {
		if(isEmpty()==true) {
			return Double.NaN;
		}
		else {
			double max=data[0];
			for(int i=0; i<data.length; i++) {
				if(data[i]>max) {
					max=data[i];
				}
			}
			return max;
		}
	}
	//Returns the average of the data array. The average is defined to be a double value
	//that returns the mean value of a given array of numbers
	public double average() {
		if(isEmpty()==true) {
			return Double.NaN;
		}
		else {
			double sum=0;
			for(int i=0; i<data.length; i++) {
				sum+=data[i];
			}
			double average=sum/data.length;
			return average;
		}
	}
	//If one value occurs more frequently in data than all others, then mode() should
	//return this value. Otherwise, mode() should return Double.NaN, indicating that no unique
	//value exists.
	public double mode() {
		double count=0, maxCount=0, mode=0;
		boolean multipleMode=false;
		for(int i=0; i<data.length; i++) {
			count=0;
			for(int j=0; j<data.length; j++) {
				if(data[j]==data[i]) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				mode=data[i];
				multipleMode=false;
			} 
			else if(mode!=data[i] && count==maxCount) {
				multipleMode=true;
			}
		}
		if(multipleMode) {
			return Double.NaN;
		}
		else if(data.length==0) {
			return Double.NaN;
		}
		else {
			return mode;
		}
	}
	
	//Returns the number of times the value occurs in the data array. 
	private int occursNumberOfTimes(double value) {
		int count=0;
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data.length; j++) {
				if(data[j]==data[i]) {
					count++;
				}
			}
		}
		return count;
	}
	//Returns the variance of the data array
	public double variance() {
		double variance=0;
		if(this.isEmpty()==true) {
			return Double.NaN;
		}
		else {
			double mean=this.average();
			for(int i=0; i<data.length; i++) {
				variance+=(data[i]-mean)*(data[i]-mean);
			}
			variance/=data.length;
			return variance;
		}
	}
	//Returns the square root of the variance. If the data array is
	//empty, then Double.NaN should be returned.
	public double standardDeviation() {
		if(this.isEmpty()==true) {
			return Double.NaN;
		}
		else {
			return Math.sqrt(this.variance());
		}
	}
	
	
	
}
