/**
 * Stat.java
 * Author:  Anvita Nagireddi 
 * Submission Date:  Apr-11-2021
 * File name: Stat.java
 *
 * This program does the following:The Stat class stores an array of double values called data. 
 * As indicated by the class diagram, youwill need to implement public methods to compute 
 * the min, max, mode, and average of these values.
 * You will also implement methods to “get” and “set” the values held by data. Importantly, data should
 * be a private instance variable, meaning that each instance of the Stat class should have its own copy of
 * the data variable (each object would store different arrays of double values). 
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
public class Stat{
	double[] data;
	public Stat(){
		data = new double[]{0.0};
	}
	
	public Stat(double[] d){
		data = new double[d.length];
        for (int i = 0; i < data.length; i++)
        	data[i] = d[i];
	}
	
	//method for getting
	public double[] getData(){
		double[] tempArray = data;
		return tempArray;
	}
	
	//method for setting
	public void setData(double[] d){
		double[] tempArray = d;
		data = tempArray;
	}
	
	//method for comparing if equal
	public boolean equals(Stat s){
		for(int i = 0; i < data.length; i++) {
			if(data[i]!=(s.getData())[i]) {
				return false;
			}
		}
		return true;
	}
	
	//method for printing as string
	public String toString(){
		String tempStr = "[";
		for(int i = 0; i < data.length-1;i++) {
		tempStr = tempStr.concat(String.valueOf(data[i]).concat(", "));
		}
		tempStr = tempStr.concat(String.valueOf(data[data.length-1]));
		return tempStr + "]";
	}
	
	//method for minimum
	public double min(){
		double min = data[0];
		for(int i = 1; i <= data.length-1;i++) {
			double toCompare = data[i];
			if(min > toCompare) {
				min = toCompare;
			}
		}
		return min;
	}
	
	//method for maximum
	public double max(){
		double max = data[0];
		for(int i = 1; i <= data.length-1;i++) {
			double toCompare = data[i];
			if(max < toCompare) {
				max = toCompare;
			}
		}
		return max;
	}
	
	//method for average
	public double average(){
		double total = 0.0;
		for(int i = 0; i <= data.length-1;i++) {
			total = total + data[i];
		}
		double average = (total/(data.length));
		return average;
	}
	
	//method for mode
	public double mode(){
		int tempCount = 0;
		double tempMode = 0.0;
		int counter = 0;
		double mode = 0.0;
		if(data.length == 1) {
			mode = data[0];
			return mode;
		}
		for(int i = 0; i <= data.length-1;i++) {
			tempMode = data[i];
			for(int j = 0; j <= data.length-1-1;j++) {
				if(tempMode == data[j]) {
					tempCount ++;
				}
			}
			if(tempCount == counter) {
				return Double.NaN;
			}
			if(tempCount > counter) {
				counter = tempCount;
				mode = tempMode;
			}
		}
		if(counter == 1) {
			return Double.NaN;
		}
		else {
			return mode;
		}
	}

}
