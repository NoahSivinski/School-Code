/*
 * Stst.java
 * Author:  jaren Spitters 
 * Submission Date:  4/10/21
 *
 * Purpose: this program holds methods that modify, create, and express the contents/ statistics of double arrays through 
 * the class object "Stat".
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
		
		this.data = new double[1];
		data[0] = 0.0;
	}
		
	public Stat(double[] d) {
		
		double[] newArray = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		
		data = newArray;
	}
	
	public double[] getData() {
		
		double[] newArray = new double[this.data.length];
		
		for (int i = 0; i < this.data.length; i++) {
			
			newArray[i] = this.data[i];
		}
		
		return newArray;
	}
	
	public void setData(double[] d) {
		
		double[] newArray = new double[d.length];
		
		for (int i = 0; i < d.length; i++) {
			
			newArray[i] = d[i];
		}
		
		data = newArray;
	}
	
	public boolean equals(Stat s) {
		
		Boolean elementsAreEqual = true;
		
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
	
	public String toString () {
		
		String newString = "";
		
		for (int i = 0; i < this.data.length - 1; i++) {
			String number = (data[i] + ", ");
			newString += number;
		}
		
		newString += data[data.length - 1];
		return ("[" + newString + "]");
	}
	
	public double min() {
		
		double minValue = data[0];
		
		for (int i = 0; i < this.data.length; i++) {
			
			if (data[i] < minValue) { 
		         
				minValue = data[i]; 
			}
		}
		
		return minValue;
	}
	
	public double max() {
		
		double maxValue = data[0];
		
		for (int i = 0; i < this.data.length - 1; i++) {
			
			if (data[i] > maxValue) { 
		         
				maxValue = data[i]; 
			}
		}
		
		return maxValue;
	}
	
	public double average() {
		
		double sum = 0;
				
		for (int i = 0; i < this.data.length; i++) {
			
			sum += this.data[i];
		}
		
		return sum / this.data.length;
	}
	
	public double mode() {
		
		 double mode = this.data[0];
		    int maxCount = 0;
		    for (int i = 0; i < this.data.length; i++) {
		        double value = this.data[i];
		        int count = 1;
		        for (int j = 0; j < this.data.length; j++) {
		            if (Math.abs(this.data[j] - value) < THRESHOLD) count++;
		            if (count > maxCount) {
		                mode = value;
		                maxCount = count;
		            }
		        }
		    }
		    
		    return mode;
	}

	
	
	
	
	
}