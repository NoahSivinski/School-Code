/*
 * Stat.java
 * Author: Chase Pitser
 * Submission Date: 11/12/2021
 *
 * Purpose: This java program is a class that contains the instance 
 * variables, constructors, and methods to create an object with an array of double 
 * values and provide different statistics of the data set when each specific 
 * method is called.
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
	private double[] data;
	
	//-----------
	// + Stat()
	//-----------
	public Stat() {
		data = new double[0];
	}
	
	//-----------
	// + Stat(double[] d)
	//-----------
	public Stat(double[] d) {
		if(d==null) {
			data = new double[0];
		} else {
			data = new double[d.length];
			for(int i=0; i<d.length; i++) {
				data[i] = d[i];
			}
		}
	}
	
	//-----------
	// + Stat(float[] f)
	//-----------
	public Stat(float[] f) {
		if(f==null) {
			data = new double[0];
		} else {
			data = new double[f.length];
			for(int i=0; i<f.length; i++) {
				data[i] = f[i];
			}
		}
	}
	
	//-----------
	// + Stat(int[] i)
	//-----------
	public Stat(int[] i) {
		if(i==null) {
			data = new double[0];
		} else {
			data = new double[i.length];
			for(int j=0; j<i.length; j++) {
				data[j] = i[j];
			}
		}
	}
	
	//-----------
	// + Stat(long[] lo)
	//-----------
	public Stat(long[] lo) {
		if(lo==null) {
			data = new double[0];
		} else {
			data = new double[lo.length];
			for(int i=0; i<lo.length; i++) {
				data[i] = lo[i];
			}
		}
	}
	
	//-----------
	// + setData(float[] f): void
	//-----------
	public void setData(float[] f) {
		if(f==null) {
			data = new double[0];
		} else {
			data = new double[f.length];
			for(int i=0; i<f.length; i++) {
				data[i] = f[i];
			}
		}
	}
	
	//-----------
	// + setData(double[] d): void
	//-----------
	public void setData(double[] d) {
		if(d==null) {
			data = new double[0];
		} else {
			data = new double[d.length];
			for(int i=0; i<d.length; i++) {
				data[i] = d[i];
			}
		}
	}
	
	//-----------
	// + setData(int[] i): void
	//-----------
	public void setData(int[] i) {
		if(i==null) {
			data = new double[0];
		} else {
			data = new double[i.length];
			for(int j=0; j<i.length; j++) {
				data[j] = i[j];
			}
		}
	}
	
	//-----------
	// + setData(long[] lo): void
	//-----------
	public void setData(long[] lo) {
		if(lo==null) {
			data = new double[0];
		} else {
			data = new double[lo.length];
			for(int i=0; i<lo.length; i++) {
				data[i] = lo[i];
			}
		}
	}
	
	//-----------
	// + getData(): double[]
	//-----------
	public double[] getData() {
		double[] d = new double[data.length];
		for(int i=0; i<data.length; i++) {
			d[i] = data[i];
		}
		return d;
	}
	
	//-----------
	// + equals(Stat s): boolean
	//-----------
	public boolean equals(Stat s) {
		if(s==null){
			return false;
		} else if(s.getData().length == data.length){
			for(int i=0; i<data.length; i++) {
				if(data[i] != s.getData()[i]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	//-----------
	// + reset(): void
	//-----------
	public void reset() {
		data = new double[0];
	}
	
	//-----------
	// + append(int[] i): void
	//-----------
	public void append(int[] i) {
		if(i!=null) {
			int length = i.length + data.length;
			double[] newArray = new double[length];
			for(int j=0; j<data.length; j++) {
				newArray[j] = data[j];
			}
			for(int j=data.length, k=0; j<length; j++,k++) {
				newArray[j] = i[k];
			}
			data = newArray;
		}
	}
	
	//-----------
	// + append(float[] f): void
	//-----------
	public void append(float[] f) {
		if(f!=null) {
			int length = f.length + data.length;
			double[] newArray = new double[length];
			for(int j=0; j<data.length; j++) {
				newArray[j] = data[j];
			}
			for(int j=data.length, k=0; j<length; j++,k++) {
				newArray[j] = f[k];
			}
			data = newArray;
		}
	}
	
	//-----------
	// + append(long[] lo): void
	//-----------
	public void append(long[] lo) {
		if(lo!=null) {
			int length = lo.length + data.length;
			double[] newArray = new double[length];
			for(int j=0; j<data.length; j++) {
				newArray[j] = data[j];
			}
			for(int j=data.length, k=0; j<length; j++,k++) {
				newArray[j] = lo[k];
			}
			data = newArray;
		}
	}
	
	//-----------
	// + append(double[] d): void
	//-----------
	public void append(double[] d) {
		if(d!=null) {
			int length = d.length + data.length;
			double[] newArray = new double[length];
			for(int j=0; j<data.length; j++) {
				newArray[j] = data[j];
			}
			for(int j=data.length, k=0; j<length; j++,k++) {
				newArray[j] = d[k];
			}
			data = newArray;
		}
	}
	
	//-----------
	// + isEmpty(): boolean
	//-----------
	public boolean isEmpty() {
		if(data.length==0) {
			return true;
		} else {
			return false;
		}
	}
	
	//-----------
	// + toString(): String
	//-----------
	public String toString() {
		if(data.length==0) {
			return "[]";
		} else {
			String output = "[";
			for(int i=0; i<data.length-1; i++) {
				output += data[i]+", ";
			}
			output += data[data.length-1] + "]";
			return output;
		}
	}
	
	//-----------
	// + min(): double
	//-----------
	public double min() {
		if(data.length==0) {
			return Double.NaN;
		} else {
			double min = data[0];
			for(int i=1; i<data.length; i++){
				if(data[i]<min){
					min = data[i];
				}
			}
			return min;
		}
	}
	
	//-----------
	// + max(): double
	//-----------
	public double max() { 
		if(data.length==0) {
			return Double.NaN;
		} else { 
			double max = data[0];
			for(int i=1; i<data.length; i++){
				if(data[i]>max){
					max = data[i];
				}
			}
			return max;
		}
	}
	
	//-----------
	// + average(): double
	//-----------
	public double average() {
		if(data.length==0) {
			return Double.NaN;
		} else {
			double total = 0;
			for(int i=0; i<data.length; i++) {
				total += data[i];
			}
			return total/data.length;
		}
	}
	
	//-----------
	// + mode(): double
	//-----------
	public double mode() {
		if(data.length==0) {
			return Double.NaN;
		} else {
			int modeIndex = 0;
			int modeCounter = 0;
			int counter;
			boolean modeInSet = true;
			for(int i=0; i<data.length; i++) {
				counter = 0;
				for(int j=0; j<data.length; j++) {
					if(data[j] == data[i]) {
						counter++;
					}
				}
				if(i==0) {
					modeIndex = 0;
					modeCounter = counter;
					modeInSet = true;
				}else if(counter>modeCounter && data[i]!=data[modeIndex]) {
					modeCounter = counter;
					modeIndex = i;
					modeInSet = true;
				}else if(counter == modeCounter && data[i]!=data[modeIndex]) {
					modeInSet = false;
				}
			}
			if(modeInSet) {
				return data[modeIndex];
			} else {
				return Double.NaN;
			}
		}
	}
	
	//-----------
	//	- occursNumberOfTimes(double value): int
	//-----------
	private int occursNumberOfTimes(double value) {
		int counter = 0;
		for(int i=0; i<data.length; i++) {
			if(Math.abs(data[i]-value)<0.000001) {
				counter++;
			}
		}
		return counter;
	}
	
	//-----------
	// + variance(): double
	//-----------
	public double variance() {
		if(data.length==0) {
			return Double.NaN;
		} else {
			double sum = 0.0;
			for(int i=0; i<data.length; i++) {
				sum += Math.pow(Math.abs(data[i]-this.average()), 2);
			}
			return sum/data.length;
		}
	}
	
	//-----------
	// + standardDeviation(): double
	//-----------
	public double standardDeviation() {
		if(data.length==0) {
			return Double.NaN;
		}else {
			return Math.sqrt(this.variance());
		}
	}
}
