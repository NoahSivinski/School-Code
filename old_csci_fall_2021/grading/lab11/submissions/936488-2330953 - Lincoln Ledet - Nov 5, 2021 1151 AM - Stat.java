
//*******************************************************
/*
* Stat.java
* Author: Lincoln Ledet
* Submission Date:  11/5/21
* Lab 11 – Classes and Methods
* 
* Purpose: this program intakes a double array and then has methods to
* find various statistics such as average,max,min,mode etc.
* 
* 
*  * Statement of Academic Honesty:
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
//*******************************************************
public class Stat {
	private double[] data;
	
	public Stat(){//constructor  without array 
		double[] tempData = {0.0};
		data = tempData;
	}
	
	public Stat(double [] d){// constructor with double array
		data = new double[d.length];
		for (int i = 0; i<d.length; i++) {
			data[i] = d[i];
		}
		
		
		
	}
	
	public double[] getData() {//returns new array with identical data
		double[] newArray = new double[data.length];
		for (int i = 0; i<data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}
	
	public void setData(double[] d) {//sets new array with identical data
		data = new double[d.length];
		for (int i = 0; i<d.length; i++) {
			data[i] = d[i];
		}
	}
	public boolean equals(Stat s){//checks to see if arrays are equal
		return (toString().equals(s.toString()));
	}

	public String toString() {//returns string of array
		String dataString = "[";
		for (int i = 0; i < data.length; i++) {
			dataString += data[i];
			if (i < data.length-1)
			{
				dataString += ",";
			}

		}
		dataString += "]";
		return dataString;
	}
	public double max() {//finds max
		double max = data[0];
		for (double num: data) {
			if (max<num) {
				max = num;
			}
		}
		return max;
	}
	public double min() {//finds min
		double min = data[0];
		for (double num: data) {
			if (num<min) {
				min = num;
			}
		}
		return min;
	}
	public double average() {//adds up array then divides by length
		double total = 0;
		for (double num: data) {
			total += num;
		}
		return (total/data.length);
	}
	public double mode() {//finds most common number
		
		int frequency = 0;
		double mode = 0;
		int previousFrequency = 0;
		boolean noMode = true; 
		for (double num1: data) {
			for (double num2: data) {
				if (num1 == num2) {
					frequency+= 1 ;
				}
				
			}
			if (frequency>previousFrequency) {
				mode = num1;
			} 
			
			previousFrequency = frequency;
			if (frequency > 1){
				noMode = false; 
			}
			frequency = 0;
				
		}
		if (noMode){
			return Double.NaN;
			
		}
		return mode ;
	}
	

}
