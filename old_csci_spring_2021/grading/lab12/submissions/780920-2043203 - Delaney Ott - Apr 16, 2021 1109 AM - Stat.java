/*
 * Stat.java
 * Author:  Delaney Ott 
 * Submission Date:  April 16th, 2021
 *
 * Purpose: This program is designed to tell the user the minimum, maximum,
 * average, and mode of the given array. This is a modified version of the Stat class
 * program from Lab11.
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
	
	public Stat() {
		this.data = new double[0];

	}
	
	public Stat(double[] d) {
		setData(d);
	}
	public Stat(float[] f) {
		setData(f);
	}
	public Stat(int[] i) {
		setData(i);
	}
	public Stat(long[] lo) {
		setData(lo);
	}
	public void setData(float[] f) {
		if(f!=null) {
			double[] dataCopy2 = new double[f.length];
			for(int i = 0; i < f.length; i++) {
				dataCopy2[i] = f[i];
			}
			this.data = dataCopy2;
		} else {
			this.data = new double[0];
		}
	}
	public void setData(double[] d) {
		if(d!=null) {
			double[] dataCopy2 = new double[d.length];
			for(int i = 0; i < d.length; i++) {
				dataCopy2[i] = d[i];
			}
			this.data = dataCopy2;
		} else {
			this.data = new double[0];
		}
	}
	public void setData(int[] i) {
		if(i!=null) {
			double[] dataCopy2 = new double[i.length];
			for(int count = 0; count < i.length; count++) {
				dataCopy2[count] = i[count];
			}
			this.data = dataCopy2;
		} else {
			this.data = new double[0];
		}
	}
	public void setData(long[] lo) {
		if(lo!=null) {
			double[] dataCopy2 = new double[lo.length];
			for(int i = 0; i < lo.length; i++) {
				dataCopy2[i] = lo[i];
			}
			this.data = dataCopy2;
		} else {
			this.data = new double[0];
		}
	}
	public double[] getData() {
		double[] dataCopy = new double[this.data.length];
		for(int i = 0; i < this.data.length; i++) {
			dataCopy[i] = this.data[i];
		}
		return dataCopy;
	}
	public boolean equals(Stat s) {
		if(s == null) {
			return false;
		}
		double[] anotherArray = s.getData();
		if(this.data.length == anotherArray.length) {
			for(int i = 0; i < this.data.length; i++) {
				if(this.data[i] == anotherArray[i]) {
					if(i == this.data.length-1) {
						return true;
					}
				} else {
					return false;
				}
				
			}
		}
		return false;
	}
	public void reset() {
		double[] r = new double[0];
		this.data = r;
	}
	public void append(int[] i) {
		if(i!=null){
			double[] r = new double[this.data.length + i.length];
			for(int count = 0; count < this.data.length; count++) {
				r[count] = this.data[count];
			}
			for(int count = 0; count < i.length; count++) {
				r[count + this.data.length] = i[count];
			}
			this.data = r;
		}
	}
	public void append(float[] f) {
		if(f!=null){
			double[] r = new double[this.data.length + f.length];
			for(int i = 0; i < this.data.length; i++) {
				r[i] = this.data[i];
			}
			for(int i = 0; i < f.length; i++) {
				r[i + this.data.length] = f[i];
			}
			this.data = r;
		}
	}
	public void append(long[] lo) {
		if(lo!=null){
			double[] r = new double[this.data.length + lo.length];
			for(int i = 0; i < this.data.length; i++) {
				r[i] = this.data[i];
			}
			for(int i = 0; i < lo.length; i++) {
				r[i + this.data.length] = lo[i];
			}
			this.data = r;
		}
	}
	public void append(double[] d) {
		if(d!=null){
			double[] r = new double[this.data.length + d.length];
			for(int i = 0; i < this.data.length; i++) {
				r[i] = this.data[i];
			}
			for(int i = 0; i < d.length; i++) {
				r[i + this.data.length] = d[i];
			}
			this.data = r;
		}
	}
	public boolean isEmpty() {
		if(this.data.length == 0) {
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		String arrayString = "";
		for(int i = 0; i < this.data.length; i++) {
			arrayString = arrayString + this.data[i]+"";
			if(i < this.data.length - 1) {
				arrayString += ", ";
			}
		}
		return "[" + arrayString + "]";
	}
	public double min() {
		if(this.isEmpty()) {
			return Double.NaN;
		} else {
			double min = this.data[0];
			for(int i = 0; i < this.data.length; i++) {
				if(this.data[i] < min){
					min = this.data[i];
				}
				
			}
			return min;
		}	
	}
	public double max() {
		if(this.isEmpty()) {
			return Double.NaN;
		} else {
			double max = this.data[0];
			for(int i = 0; i < this.data.length; i++) {
				if(this.data[i] > max){
					max = this.data[i];
				}
				
			}
			return max;
		}
	}
	public double average() {
		if(this.isEmpty()) {
			return Double.NaN;
		} else {
			double numerator = 0;
			for(int i = 0; i < this.data.length; i++) {
				numerator = numerator + this.data[i];
			}
			return numerator/this.data.length;
		}
	}
	public double mode() {
		if(this.isEmpty()) {
			return Double.NaN;
		} else {
			double mode = -9999;
			int repeated1 = 0, repeated2 = 0;
			for(int count = 0; count < this.data.length; count++) {
				for(int count2 = 0; count2 < this.data.length; count2++) {
					if((count!=count2) && (this.data[count] == this.data[count2])) {
						repeated2++;
						if(repeated2 > repeated1) {
							mode = this.data[count];
						}
						if((repeated1 == repeated2)&&(mode!=this.data[count])){
							mode = -9999;
						}
						repeated1 = repeated2;
					}
					repeated2 = 0;
				}
			}
			if(mode == -9999) {
				return Double.NaN;
			}
			return mode;
		}
	}
	public double variance() {
		if(this.isEmpty()) {
			return Double.NaN;
		} else {
			double sum = 0;
			for(int i = 0; i < this.data.length; i++) {
				double distance = Math.pow((this.data[i] - this.average()), 2);
				sum += distance;
			}
			return sum/this.data.length;
		}
	}
	public double standardDeviation() {
		if(this.isEmpty()) {
			return Double.NaN;
		} else {
			double sD = Math.sqrt(this.variance());
			return sD;
		}
	}
}

