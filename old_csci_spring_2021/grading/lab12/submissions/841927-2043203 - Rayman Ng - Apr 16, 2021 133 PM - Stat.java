/*
 * CSCI1301.java
 * Author: Rayman Ng
 * Submission Date: 4/16/2021
 *
 * Purpose: This program provides several methods to use on a Stat class object. Beyond regular getter and setter methods, there are methods that can be used to find the minimum,maximum,
 * average, mode, variance, or standard deviation of a set of values. There's also an equals method which can compare the values of different Stat objects to see if they'er equal to each other, and a toString method
 * to help list out the values in an easy to read way.  
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
	private double [] data;

	public Stat() {
		data = new double[0];
	}
	public Stat(double[] d) {
		this.setData(d);
	}
	public Stat(int[] i) {
		this.setData(i);
	}
	public Stat(long [] lo) {
		this.setData(lo);
	}
	public Stat(float [] f) {
		this.setData(f);
	}
	public void setData(double [] d) {
		if((d == null) || (d.length == 0)) {
			data = new double[0];
		}
		else {
			double [] newArray = new double[d.length];
			for (int j = 0; j < d.length; j++) {
				newArray[j] = d[j];
			}
			data = newArray;
		}
	}
	public void setData(int [] i) {
		if((i == null) || (i.length == 0)) {
			data = new double[0];
		}
		else { 
			double [] newArray = new double[i.length];
			for(int j = 0; j < i.length; j++) {
				newArray[j] = i[j];
			}
			data = newArray;
		}
	}
	public void setData(long[] lo) {
		if((lo == null) || (lo.length == 0)) {
			data = new double[0];
		}
		else { 
			double [] newArray = new double[lo.length];
			for(int j = 0; j < lo.length; j++) {
				newArray[j] = lo[j];
			}
			data = newArray;
		}
	}
	public void setData(float [] f) {
		if((f == null) || (f.length == 0)) {
			data = new double[0];
		}
		else { 
			double [] newArray = new double[f.length];
			for(int j = 0; j < f.length; j++) {
				newArray[j] = f[j];
			}
			data = newArray;
		}
	}
	public double[] getData () {
		double[] copyArray = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			copyArray[i] = data[i];
		}
		return copyArray;
	}
	public boolean equals(Stat s) {
		int instance = 0;
		if((s == null) || (this.data.length != s.data.length)) {
			return false;
		}
		else {
			for(int i = 0; i < this.data.length; i++) {
				if(this.data[i] == s.data[i]) {
					instance++;
				}
			}
			if(instance == this.data.length) {
				return true;
			}
			else 
				return false;
		} 
	}
	public void reset() {
		double [] resetArray = new double[0];
		data = resetArray;
	}
	public void append(double [] d) {
		if (d != null) {
			double [] appendArray = new double [d.length + this.data.length];
			for (int j = 0; j < this.data.length; j++) {
				appendArray[j] = data[j];
			}
			for(int j = 0, transition = this.data.length; j < d.length; j++, transition++) {
				appendArray[transition] = d[j];
			}
			data = appendArray;

		}
	}
	public void append(int [] i) {
		if (i != null) {
			double [] appendArray = new double [i.length + this.data.length];
			for (int j = 0; j < this.data.length; j++) {
				appendArray[j] = data[j];
			}
			for(int j = 0, transition = this.data.length; j < i.length; j++, transition++) {
				appendArray[transition] = i[j];
			}
			data = appendArray;
		}
	}
	public void append (long [] lo) {
		if (lo != null) {
			double [] appendArray = new double [lo.length + this.data.length];
			for (int j = 0; j < this.data.length; j++) {
				appendArray[j] = data[j];
			}
			for(int j = 0, transition = this.data.length; j < lo.length; j++, transition++) {
				appendArray[transition] = lo[j];
			}
			data = appendArray;
		}
	}
	public void append (float [] f) {
		if (f != null) {
			double [] appendArray = new double [f.length + this.data.length];
			for (int j = 0; j < this.data.length; j++) {
				appendArray[j] = data[j];
			}
			for(int j = 0, transition = this.data.length; j < f.length; j++, transition++) {
				appendArray[transition] = f[j];
			}
			data = appendArray;
		}
	}
	public boolean isEmpty() {
		if(data.length == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString () {
		String arrayValues = "";
		for(int i = 0; i < this.data.length; i++) {
			if(i == this.data.length -1) {
				arrayValues = arrayValues + data[i];
			}
			else {
				arrayValues = arrayValues + data[i] + ", ";
			}
		}
		return "[" + arrayValues + "]";
	}
	public double min() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double minimum = data[0];
			for(int i = 0; i < this.data.length; i++) {
				if(minimum > data[i]) {
					minimum = data[i];
				}
			}
			return minimum;
		}
	}
	public double max() {
		if(this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double maximum = data[0];
			for(int i = 0; i < this.data.length; i++) {
				if(maximum < data[i]) {
					maximum = data[i];
				}
			}
			return maximum;
		}
	}
	public double average() {
		if(this.data.length == 0) {
			return Double.NaN;
		}
		else {
			double sum = 0;
			double average;
			for(int i = 0; i < this.data.length; i++) {
				sum = sum + data[i];
			}
			average = sum/this.data.length;
			return average;
		}
	}
	private int occursNumberOfTimes(double value) {
		int instance = 0;
		for(int j = 0; j < this.data.length; j++) {	
			if(value == data[j]) {
				instance++;
			}
		}
		return instance;
	}
	public double mode() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		else if (this.data.length == 1) {
			return data[0];
		}
		else {
			int ties = 0;
			int previousInstance = -1;
			double mostOccured = data[0];
			for(int j = 0; j < this.data.length; j++) {
				int instances = this.occursNumberOfTimes(data[j]);

				//First run through, and there are multiple of a number. 
				if((previousInstance == -1) && (instances > 1)) {
					mostOccured = data[j];
					previousInstance = instances;
				}
				//Every other run through. 
				else if((previousInstance != -1) && (previousInstance < instances)) {
					mostOccured = data[j];
					previousInstance = instances;
				}
				//If multiple numbers share the same amount of occurences, then none can be considered the mode.  
				else if((previousInstance == instances) &&(mostOccured != data[j])) {
					ties = instances;
				}
			}
			if(previousInstance > ties) {
				return mostOccured;
			}
			else {
				return Double.NaN;
			}
		}
	}
	public double variance() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			double sum = 0;
			for (int j = 0; j < this.data.length; j++) {
				sum = sum + Math.pow((data[j] - this.average()),2);
			}
			return sum / this.data.length;
		}
	}
	public double standardDeviation() {
		if (data.length == 0) {
			return Double.NaN;
		}
		else {
			return Math.sqrt(this.variance());
		}
	}
}
