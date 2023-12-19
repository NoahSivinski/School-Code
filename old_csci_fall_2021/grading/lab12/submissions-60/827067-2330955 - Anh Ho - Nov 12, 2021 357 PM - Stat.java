import java.util.Arrays;

/*
 * Stat.java
 * Author:  Anh Ho
 * Submission Date:  11/01/2021
 *
 * Purpose: stuff
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

public class Stat {
	private double[] data;
	
	//default constructor without any parameters
	public Stat() {
		this.data = new double[0];
	}
	
	//constructor with double array as a parameter
	public Stat(double[] d) {
		if (d != null) {
			this.data = new double[d.length];
			for (int i=0; i<this.data.length;i++) { 
				this.data[i] = d[i];
			}
		}
		else {
			this.data = new double[0];
		}
	}
	
	//constructor with float array as parameter
	public Stat(float[] f) {
		if (f != null) {
			this.data = new double[f.length];
			for (int i=0; i<this.data.length;i++) { 
				this.data[i] = f[i];
			}
		}
		else {
			this.data = new double[0];
		}
	}
	
	//constructor with int array as parameter
	public Stat (int[] i) {
		if (i != null) {
			this.data = new double[i.length];
			for (int j=0; j<this.data.length;j++) { 
				this.data[j] = i[j];
			}
		}
		else {
			this.data = new double[0];
		}
	}
	
	//constructor with long array as parameter
	public Stat(long[] lo) {
		if (lo != null) {
			this.data = new double[lo.length];
			for (int i=0; i<this.data.length;i++) { 
				this.data[i] = lo[i];
			}
		}
		else {
			this.data = new double[0];
		}
	}
	
	//getter
	public double[] getData() {
		return this.data;
	}
	
	//setter with double parameter
	public void setData(double[] d) {
		if (d != null) {
			this.data = new double[d.length];
			for (int i=0; i<this.data.length;i++) { 
				this.data[i] = d[i];
			}
		}
		else {
			this.data = new double[0];
		}
	}
	
	//setter with float parameter
	public void setData(float[] f) {
		if (f != null) {
			this.data = new double[f.length];
			for (int i=0; i<this.data.length;i++) { 
				this.data[i] = f[i];
			}
		}
		else {
			this.data = new double[0];
		}
	}
	
	//setter with int parameter
	public void setData(int[] i) {
		if ( i != null) {
			this.data = new double[i.length];
			for (int j=0; j<this.data.length;j++) { 
				this.data[j] = i[j];
			}
		}
		else {
			this.data = new double[0];
		}
	}
	
	//setter with long parameter
	public void setData(long[] lo) {
		if (lo != null) {
			this.data = new double[lo.length];
			for (int i=0; i<this.data.length;i++) { 
				this.data[i] = lo[i];
			}
		}
		else {
			this.data = new double[0];
		}
	}
	
	//equals - check if 2 stat instances are equal
	public boolean equals(Stat s) {
		boolean result=false;
		if (s != null) {
			if (this.data.length == s.data.length) {
				if (this.data.length == 0 && s.data.length == 0) {
					result = true;
				}
				else {
					result = true;
					for (int i=0;i<this.data.length;i++) {
						if (this.data[i] != s.data[i]) {
							result = false;
						}
					}
				}
			}
		}
		return result;
	}
	
	//reset - reset data
	public void reset() {
		this.data = new double[0];
	}
	
	//append - add more data with int array parameter
	public void append(int[] i) {
		if (i != null) {
			double[] newArray = new double[i.length+this.data.length];
			for (int j=0;j<newArray.length;j++) {
				if (j < this.data.length) {
					newArray [j] = this.data[j];
				}
				else {
					newArray[j] = i[j-this.data.length];
				}
			}
			this.data= new double[newArray.length];
			for (int j=0; j<this.data.length; j++) {
				this.data[j] = newArray[j];
			}
		}
	}

	//append - add more data with double array parameter
	public void append(double[] d) {
		if (d != null) {
			double[] newArray = new double[d.length+this.data.length];
			for (int i=0;i<newArray.length;i++) {
				if (i < this.data.length) {
					newArray [i] = this.data[i];
				}
				else {
					newArray[i] = d[i-this.data.length];
				}
			}
			this.data= new double[newArray.length];
			for (int i=0; i<this.data.length; i++) {
				this.data[i] = newArray[i];
			}
		}
	}
	
	//append - add more data with float array parameter
	public void append(float[] f) {
		if (f != null) {
			double[] newArray = new double[f.length+this.data.length];
			for (int i=0;i<newArray.length;i++) {
				if (i < this.data.length) {
					newArray [i] = this.data[i];
				}
				else {
					newArray[i] = f[i-this.data.length];
				}
			}
			this.data= new double[newArray.length];
			for (int i=0; i<this.data.length; i++) {
				this.data[i] = newArray[i];
			}
		}
	}
	
	//append - add more data with long array parameter
	public void append(long[] lo) {
		if (lo != null) {
			double[] newArray = new double[lo.length+this.data.length];
			for (int i=0;i<newArray.length;i++) {
				if (i < this.data.length) {
					newArray [i] = this.data[i];
				}
				else {
					newArray[i] = lo[i-this.data.length];
				}
			}
			this.data= new double[newArray.length];
			for (int i=0; i<this.data.length; i++) {
				this.data[i] = newArray[i];
			}
		}	
	}
	
	//isEmpty - if current object has length 0 return true, else false
	public boolean isEmpty() {
		if (this.data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//toString - return the String value of the array
	public String toString() {
		String result = "[";
		if (!isEmpty()) {
			
			for (int i=0;i<this.data.length-1;i++) {
				result += this.data[i] + ", ";
			}
			result += this.data[this.data.length - 1] +"]";
		}
		else {
			result+= "]";
		}
		return result;
	}
	
	//min - return the minimum value in the array
	public double min() {
		if (!isEmpty()) {
			double min = this.data[0];
			for (int i=0;i<this.data.length;i++) {
				if (this.data[i] < min) {
					min = this.data[i];
				}
			}
		return min;
		}
		else {
			return Double.NaN;
		}
	}
	
	//max - return the minimum value in the array
	public double max() {
		if (!isEmpty()) {
			double max = this.data[0];
			for (int i=0;i<this.data.length;i++) {
				if (this.data[i] > max) {
					max = this.data[i];
				}
			}
			return max;
		}
		else {
			return Double.NaN;
		}
	}
	
	//average - 
	public double average() {
		if (!isEmpty()) {
			double sum = 0;
			for (int i=0;i<this.data.length;i++) {
				sum += this.data[i];
			}
			return sum/this.data.length;
		}
		else {
			return Double.NaN;
		}
	}
	
	
	//mode - 
	public double mode() {
		double[] numCount = new double[this.data.length];
		int frequency = 0;
		int nonModeCount = 0;
		int highestFrequency = 0;
		double modeCheck = Double.NaN;
		for (int i = 0; i < numCount.length; i++) {
			frequency = 0;
			for (int j = 0; j < this.data.length; j++) {
				if (this.data[i] == this.data[j]) {
					frequency++;
				}
			}
			//finds out what the highest frequency is for the set of data. For example, if the number 3
			//is found 3 times, then highestFrequency will be 3 when the method leaves this loop.
			if (frequency > highestFrequency) {
				highestFrequency = frequency;
			}
			numCount[i] = frequency;
		}
		//if numCount[i]'s frequency is the same as highestFrequency, then the corresponding value from
		//this.data[i] will be set to a value named modeCheck.
		//even if there are two values with the same highestFrequency in the data set, it shouldn't matter
		//because it checks for that in the next loop.
		for (int i = 0; i < numCount.length; i++) {
			if (numCount[i] == highestFrequency) {
				modeCheck = this.data[i];
			}
		}
		//if the frequency of numCount[j] is the same as highestFrequency AND the corresponding value
		//from this.data[j] is not equal to modeCheck, then nonModeCount++, meaning that there are two different
		//values with the same highestFrequency in the set of data.
		//even if there are two values with the same highestFrequency in the data set, it shouldn't matter what
		//value modeCheck is set to because there should only be one. for example, an array of {1, 1, 2, 2, 3, 4}
		//the values 1 and 2 have the same highestFrequency at two. From the last loop, modeCheck will be 2.
		//this shouldn't matter because if 2 is the only value with highestFrequency, then there should be no problem,
		//and nonModeCount should remain 0.
		//however, if highestFrequency is the same (which it is in this case for 1), this.data[j] checks that
		//and sees that it is NOT equal to modeCheck (in this case, 2), therefore, nonModeCount will increase by 1.
		for (int j = 0; j < numCount.length; j++) {
				if (numCount[j] == highestFrequency && this.data[j] != modeCheck) {
					nonModeCount++;
				}
		}
		//if nonModeCount is 0, then modeCheck, the mode, will return.
		if (nonModeCount == 0) {
			return modeCheck;
		}
		//otherwise, NaN will be returned
		else {
			return Double.NaN;
		}
	}
	
	//occursNumberOfTimes
	public int occursNumberOfTimes(double d) {
		int counter=0;
		for (int i=0;i<this.data.length;i++) {
			if (d == this.data[i]) {
				counter++;
			}
		}
		return counter;
	}
	
	//variance
	public double variance() {
		double sum=0;
		for (int i=0;i<this.data.length;i++) {
			sum += Math.pow(this.data[i] - this.average(), 2);
		}
		return sum/this.data.length;
	}
	
	//standardDeviation()
	public double standardDeviation() {
		if (!isEmpty()) {
			return Math.sqrt(this.variance());
		}
		else {
			return Double.NaN;
		}
	}
}	//close class
