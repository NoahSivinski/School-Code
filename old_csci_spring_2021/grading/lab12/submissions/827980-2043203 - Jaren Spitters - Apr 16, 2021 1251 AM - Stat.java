/*
 * Stat.java
 * Author:  Jaren Spitters 
 * Submission Date:  4/16/21
 *
 * Purpose: This program stores an array of double values and computes the minimum, maximum, mode, average, variance, and standard 
 * deviation of these values. There are also methods for getting and setting the array of values and manipulating the arrays by 
 * adding on to them using an append() method. It can set and append with arrays of type double, float, int and long. Lastly, it 
 * can compare two different arrays the user gives it.
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
	private static final double THRESHOLD = 0.000000001;
	
	public Stat() {
		
		this.data = new double[0];
	}
		
	public Stat(double[] d) {
		
		double[] newArray;
		
		if (d == null) {
			
			newArray = new double [0];
			
		} else {
			
			newArray = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				newArray[i] = d[i];
			}
		}
		
		this.data = newArray;
	}
	
	public Stat(float[] f) {
		
		double[] newArray;
		
		if (f == null) {
			
			newArray = new double[0];
		
		} else {
		
			newArray = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				newArray[i] = f[i];
			}
		}
		
		this.data = newArray;
	}
	
	public Stat(int[] i) {
		
		double[] newArray;
		
		if (i == null) {
			
			newArray = new double[0];
			
		} else {
			
			newArray = new double[i.length];
			for (int x = 0; x < i.length; x++) {
				newArray[x] = i[x];
			}
		}
		
		this.data = newArray;
	}
	
	public Stat(long[] lo) {
		
		double[] newArray;
		
		if (lo == null) {
			
			newArray = new double[0];
			
		} else {
			
			newArray = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				newArray[i] = lo[i];
			}
		}
		
		this.data = newArray;
	}
	
	public double[] getData() {
		
		double[] newArray = new double[this.data.length];
		
		for (int i = 0; i < this.data.length; i++) {
			
			newArray[i] = this.data[i];
		}
		
		return newArray;
	}
	
	public void setData(double[] d) {
		
		double[] newArray;
		
		if (d == null) {
			
			newArray = new double[0];
		
		} else {
		
			newArray = new double[d.length];
		
			for (int i = 0; i < d.length; i++) {
			
				newArray[i] = d[i];
			}
		}
		
		this.data = newArray;
	}
	
	public void setData(float[] f) {
		
		double[] newArray;
		
		if (f == null) {
			
			newArray = new double[0];
		
		} else {
		
			newArray = new double[f.length];
		
			for (int i = 0; i < f.length; i++) {
			
				newArray[i] = f[i];
			}
		}
		
		this.data = newArray;
	}
	
	public void setData(int[] i) {
		
		double[] newArray;
		
		if (i == null) {
			
			newArray = new double[0];
		
		} else {
		
			newArray = new double[i.length];
		
			for (int x = 0; x < i.length; x++) {
			
				newArray[x] = i[x];
			}
		}
		
		this.data = newArray;
	}
	
	public void setData(long[] lo) {
		
		double[] newArray;
		
		if (lo == null) {
			
			newArray = new double[0];
		
		} else {
		
			newArray = new double[lo.length];
		
			for (int i = 0; i < lo.length; i++) {
			
				newArray[i] = lo[i];
			}
		}
		
		this.data = newArray;
	}
	
	public boolean equals(Stat s) {
		
		Boolean elementsAreEqual = true;
		
		if (s == null) {
			
			return false;
		
		} else {
			
			if ((Math.abs(this.data.length - s.data.length) < THRESHOLD)) {
		
				for (int i = 0; i < this.data.length; i++) {
				
					if (Math.abs(this.data[i] - s.data[i]) < THRESHOLD) {
					
					elementsAreEqual = true;
				
					} else {
					
					elementsAreEqual = false;
					i = this.data.length;
				}
			}
			
			return elementsAreEqual;
		
			} else { 
			
				return false;
			}
		}
	}
	
	public void reset() {
		
		double[] newArray = new double[0];
		this.data = newArray;
	}
	
	public void append(double[] d) {
		
		if (d != null) {
			
			double[] newArray = new double[d.length + this.data.length];
			int i = 0;
				
			while (i < this.data.length) {
			
				newArray[i] = this.data[i];
				i++;
			}

			while (i < (d.length + this.data.length)) {
				
				newArray[i] = d[i - this.data.length];
				i++;
			}
			
			this.data = newArray;
		}
	}
	
	public void append(float[] f) {
		
		if (f != null) {
			
			double[] newArray = new double[f.length + this.data.length];
			int i = 0;
			
			while (i < this.data.length) {
			
				newArray[i] = this.data[i];
				i++;
			}
			
			while (i < (f.length + this.data.length)) {
				
				newArray[i] = f[i - this.data.length];
				i++;
			}
			
			this.data = newArray;
		}
	}
	
	public void append(int[] i) {
		
		if (i != null) {
			
			double[] newArray = new double[i.length + this.data.length];
			int x = 0;
				
			while (x < this.data.length) {
			
				newArray[x] = this.data[x];
				x++;
			}
			
			while (x < (i.length + this.data.length)) {
				
				newArray[x] = i[x - this.data.length];
				x++;
			}
			
			this.data = newArray;
		}
	}
	
	public void append(long[] lo) {
		
		if (lo != null) {
			
			double[] newArray = new double[lo.length + this.data.length];
			int i = 0;
			
			while (i < this.data.length) {
			
				newArray[i] = this.data[i];
				i++;
			}
			
			while (i < (lo.length + this.data.length)) {
				
				newArray[i] = lo[i - this.data.length];
				i++;
			}
			
			data = newArray;
		}
	}
	
	public boolean isEmpty() {
		
		return this.data.length == 0;
	}
	
	public String toString() {
		
		String newString = "";
		
		if (!this.isEmpty()) {
			
			for (int i = 0; i < this.data.length - 1; i++) {
				String number = (data[i] + ", ");
				newString += number;
			}
		
			newString += data[data.length - 1];
		}
		
		return ("[" + newString + "]");
	}
	
	public double min() {
		
		if (this.isEmpty()) {
			
			return Double.NaN;
		
		} else {
			
			double minValue = data[0];
		
			for (int i = 0; i < this.data.length; i++) {
			
				if (data[i] < minValue) { 
		         
					minValue = data[i]; 
				}
			}
		
			return minValue;
		}
	}
	
	public double max() {
		
		if (this.isEmpty()) {
			
			return Double.NaN;
		
		} else {
			
			double maxValue = data[0];
		
			for (int i = 0; i < this.data.length; i++) {
			
				if (data[i] > maxValue) { 
		         
					maxValue = data[i]; 
				}
			}
		
			return maxValue;
		}
	}
	
	public double average() {
		
		if (this.isEmpty()) {
			
			return Double.NaN;
			
		} else {
			
			double sum = 0;
				
			for (int i = 0; i < this.data.length; i++) {
			
				sum += this.data[i];
			}
		
			return sum / this.data.length;
		}
	}
	
	public double mode() {
		
		if (this.isEmpty()) {
			
			return Double.NaN;
		
		} else {
		
			double maxValue = -1.0d;
			int maxCount = 0;
		
			for (int i = 0; i < data.length; ++i) {
		    
				double currentValue = data[i];
				int currentCount = 1;
		   
				for (int j = i + 1; j < data.length; ++j) {
		        
					if (Math.abs(data[j] - currentValue) < THRESHOLD) {
		            
						++currentCount;
					} 
				}
		    
				if (currentCount > maxCount) {
		        
					maxCount = currentCount;
					maxValue = currentValue;
		    
				} else if (currentCount == maxCount) {
		        
					maxValue = Double.NaN;
				}
			}
		
			return maxValue;
		}
	}
	
	@SuppressWarnings("unused")
	private int occursNumberOfTimes(double value) {
		
		int count = 0;
		
		for (int i = 0; i < this.data.length; i++) {
			
			if (Math.abs(this.data[i] - value) < THRESHOLD) {
				
				count++;
			}
		}
		
		return count;
	}
	
	public double variance() {
		
		if (this.isEmpty()) {
			
			return Double.NaN;
			
		} else {
		
			double sum = 0;
			
			for (int i = 0; i < this.data.length; i++) {
				
				sum += Math.pow((this.data[i] - this.average()),2);
			}
			
			return sum/this.data.length;
		}
	}
	
	public double standardDeviation() {
		
		if (this.isEmpty()) {
			
			return Double.NaN;
			
		} else {
			
			return Math.sqrt(this.variance());
		}
	}
}
