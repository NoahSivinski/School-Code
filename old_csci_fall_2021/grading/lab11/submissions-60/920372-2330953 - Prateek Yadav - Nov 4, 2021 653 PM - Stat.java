/*
 * Stat.java
 * Author:  Prateek Yadav
 * Submission Date: 11/4/2021
 * Due Date: 11/5/2021
 *
 *
 * Code Description:
 * This class constructs array objects and
 * allows for various statistical tests to 
 * be performed between them via methods.
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
 * 
 * I agree with this statement^
 */



public class Stat {
	
	private double[] data;
	
	//Default Constructor
	public Stat(){
		data = new double[1];
		data[0] = 0.0;
	}
	
	//Constructor
	public Stat(double[] d){
		data = new double [d.length];
		for(int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
	}
	
	//Getter Method
	public double[] getData(){
		double[] copy = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			copy[i] = data[i];
		}
		return copy;
	}
	
	//Setter Method
	public void setData(double[] d) {
		double[] copy = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			copy[i] = d[i];
		}
		data = new double[copy.length];
		for(int i = 0; i < copy.length; i++) {
			data[i] = copy[i];
		}
	}
	
	//To String replacement
	public String toString() {
		String s = "[";
		for(int i = 0; i < data.length-1; i++) {
			s += data[i] + ", ";
		}
		s += data[data.length-1] + "]";
		return s;
	}
	
	//Equality determiner
	public boolean equals(Stat s){
		for(int i = 0; i < data.length; i++) {
			if(this.data[i] != s.data[i]){
				return false;
			}
		}
		return true;
	}
	
	//Minimum finder
	public double min() {
		double smallest = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i]< smallest) {
				smallest = data[i];
			}
		}
		return smallest;
	}
	
	//Maximum finder
	public double max() {
		double biggest = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i]> biggest) {
				biggest = data[i];
			}
		}
		return biggest;
	}
	
	//Average calculator
	public double average() {
		double items = 0;
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
			items++;
		}
		if(data.length == 1) {
			return data[0];
		}
		return sum/items;
	}
		
	//Mode determiner		
	public double mode() {
		double[] set = getData();
		double mode = 0;
		double count = 0;
		double leadingCount = 0;
		double[] countArray = new double[set.length];
		double occurence = 0;
		
		
		for(int i = 0; i < set.length; i++) {
			for(int j = 0; j < set.length; j++) {
				if(Math.abs(set[i]-set[j])<0.000001){
					count++;
				}
			}
			if(count > leadingCount) {
				mode = set[i];
				leadingCount = count;
			}
			countArray[i] = count;
			count = 0;
		}
		
		
		double biggest = countArray[0];
		for(int i = 1; i < countArray.length; i++) {
			if(countArray[i] > biggest) {
				biggest = countArray[i];
			}
		}
		
		
		for (int i = 0; i < countArray.length; i++) {
			occurence = countArray[i];
			for(int j = 0; j < countArray.length; j++) {
				if(Math.abs(countArray[j] - occurence) < 0.000000001) {
					count ++;
				}
			}
			if (count != occurence && occurence == biggest) {
				mode = Double.NaN;
			}
			count = 0;
		}
		return mode;
		
	}
	
	//Main Method and Test cases were placed here

}
