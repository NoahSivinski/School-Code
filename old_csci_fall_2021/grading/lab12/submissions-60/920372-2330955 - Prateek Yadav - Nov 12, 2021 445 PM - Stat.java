/*
 * Stat.java
 * Author:  Prateek Yadav
 * Submission Date: 11/12/2021
 * Due Date: 11/12/2021
 *
 *
 * Code Description:
 * This class constructs array objects and
 * allows for various statistical tests to 
 * be performed between them via methods.
 * 
 * It has been updated to take different
 * input parameters and perform new methods.
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
	
	//Default Constructor, creates a double array with length of 0
	public Stat(){
		data = new double[0];
	}
	
	//All other constructors iterate through the input array to copy the values into the private static double array of data.
	
	//Double Array Constructor
	public Stat(double[] d){
		if(d == null){
			data = new double[0];
		}
		else {
			data = new double [d.length];
			for(int i = 0; i < d.length; i++) {
				data[i] = d[i];
			}
		}
	}
	
	//Integer Array Constructor
	public Stat(int[] i) {
		if(i == null){
			data = new double[0];
		}
		else {
			data = new double [i.length];
			for(int j = 0; j < i.length; j++) {
				data[j] = i[j];
			}
		}
	}
	
	//Long Array Constructor
	public Stat(long[] lo) {
		if(lo == null){
			data = new double[0];
		}
		else {
			data = new double [lo.length];
			for(int j = 0; j < lo.length; j++) {
				data[j] = lo[j];
			}
		}
	}
	
	//Float Array Constructor
	public Stat(float[] f) {
		if(f == null){
			data = new double[0];
		}
		else {
			data = new double [f.length];
			for(int j = 0; j < f.length; j++) {
				data[j] = f[j];
			}
		}
	}
	//Conventional methods like accessors and mutators start here
	
	//isEmpty method - this is used so often, I will leave it up here
	//Checks if an array is empty or not
		public boolean isEmpty() {
			if(this.data.length == 0) {
				return true;
			}
			return false;
		}
		
		
	//Getter Method, Unchanged from last lab, returns via a copy array
	public double[] getData(){
		double[] copy = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			copy[i] = data[i];
		}
		return copy;
	}
	
	//All setter methods iterate through a copy array to reform the data array
	//If the array length is 0, an empty double array is made
	//Double Setter Method
	public void setData(double[] d) {
		if(d == null){
			data = new double[0];
		}
		else {
			double[] copy = new double[d.length];
			for(int i = 0; i < d.length; i++) {
				copy[i] = d[i];
			}
			data = new double[copy.length];
			for(int i = 0; i < copy.length; i++) {
				data[i] = copy[i];
			}
		}
	}
	//Integer Setter Method
	public void setData(int[] i) {
		if(i == null){
			data = new double[0];
		}
		else {
			double[] copy = new double[i.length];
			for(int j = 0; j < i.length; j++) {
				copy[j] = i[j];
			}
			data = new double[copy.length];
			for(int k = 0; k < copy.length; k++) {
				data[k] = copy[k];
			}
		}
	}
	//Long Setter Method
	public void setData(long[] lo) {
		if(lo == null){
			data = new double[0];
		}
		else {
			double[] copy = new double[lo.length];
			for(int i = 0; i < lo.length; i++) {
				copy[i] = lo[i];
			}
			data = new double[copy.length];
			for(int i = 0; i < copy.length; i++) {
				data[i] = copy[i];
			}
		}
	}
	//Float setter method
	public void setData(float[] f) {
		if(f == null){
			data = new double[0];
		}
		else {
			double[] copy = new double[f.length];
			for(int i = 0; i < f.length; i++) {
				copy[i] = f[i];
			}
			data = new double[copy.length];
			for(int i = 0; i < copy.length; i++) {
				data[i] = copy[i];
			}
		}
	}
	
	
	//To String replacement
	public String toString() {
		//Empty array case
		if(data.length == 0) {
			return "[]";
		}
		//For appending last element without a comma
		String s = "[";
		for(int i = 0; i < data.length-1; i++) {
			s += data[i] + ", ";
		}
		s += data[data.length-1] + "]";
		return s;
	}
	
	//Equality determiner
	public boolean equals(Stat s){
		//Null parameter case
		if(s == null){
			return false;
		}
		else {
			for(int i = 0; i < data.length; i++) {
				//If the arrays are different lengths, the equality method should fail from the get go
				if(this.data.length != s.data.length || this.data[i] != s.data[i]){
					return false;
				}
			}
		}
		return true;
	}
	
	//Minimum finder
	public double min() {
		//Empty array case
		if(this.isEmpty()) {
			return Double.NaN;
		}
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
		//Empty Array case
		if(this.isEmpty()) {
			return Double.NaN;
		}
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
		//Empty Array Case
		if(this.isEmpty()) {
			return Double.NaN;
		}
		double items = 0;
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
			items++;
		}
		//Summing all values^
		if(data.length == 1) {
			return data[0];
		}
		return sum/items;
	}
		
	//Mode determiner		
	public double mode() {
		//Empty array case
		if(this.isEmpty()) {
			return Double.NaN;
		}
		double[] set = getData();
		double mode = 0;
		double count = 0;
		double leadingCount = 0;
		double[] countArray = new double[set.length];
		double occurence = 0;
		
		//First loop finds the most frequent values
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
		
		//This loop determines what the highest number occurrence was, or the maximum value of the count array
		double biggest = countArray[0];
		for(int i = 1; i < countArray.length; i++) {
			if(countArray[i] > biggest) {
				biggest = countArray[i];
			}
		}
		
		//If the number of occurrences in the count array is higher than itself, we know there are two (greatest) modes of the same length
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
	
	//Resets the called Stat object and clears its array
	
	public void reset(){
		data = new double[0];
	}
	
	//Append methods start here
	//The original array is stored in a copy array. n stands for the original's length, m is the appended array's length, and k is the iteration integer used to avoid bounds errors when
	//adding values from the second array into the final array, which has a combined length of n + m
	
	
	//Double parameter appending
	public void append(double[] d){
		if(d != null) {
			int n = this.data.length;
			double[] copy = new double[n];
			for(int i = 0; i < n; i++) {
				copy[i] = data[i];
			}
			int m = d.length;
			data = new double[n + m];
			for(int i = 0; i < n; i++) {
				data[i] = copy[i];
			}
			int k = 0;
			for(int i = n; i < n + m; i++) {
				data[i] = d[k];
				k++;
			}
		}
	}
	
	//Integer parameter appending
	public void append(int[] i){
		if(i != null) {
			int n = this.data.length;
			double[] copy = new double[n];
			for(int j = 0; j < n; j++) {
				copy[j] = data[j];
			}
			int m = i.length;
			data = new double[n + m];
			for(int j = 0; j < n; j++) {
				data[j] = copy[j];
			}
			int k = 0;
			for(int j = n; j < n + m; j++) {
				data[j] = i[k];
				k++;
			}
		}
	}
	
	//Long parameter appending
	public void append(long[] lo){
		if(lo != null) {
			int n = this.data.length;
			double[] copy = new double[n];
			for(int i = 0; i < n; i++) {
				copy[i] = data[i];
			}
			int m = lo.length;
			data = new double[n + m];
			for(int i = 0; i < n; i++) {
				data[i] = copy[i];
			}
			int k = 0;
			for(int i = n; i < n + m; i++) {
				data[i] = lo[k];
				k++;
			}
		}
	}
	//Float parameter appending
	public void append(float[] f){
		if(f != null) {
			int n = this.data.length;
			double[] copy = new double[n];
			for(int i = 0; i < n; i++) {
				copy[i] = data[i];
			}
			int m = f.length;
			data = new double[n + m];
			for(int i = 0; i < n; i++) {
				data[i] = copy[i];
			}
			int k = 0;
			for(int i = n; i < n + m; i++) {
				data[i] = f[k];
				k++;
			}
		}
	}
	
	//Value counter (in an array), useful for mode, but not implemented in that method
	private int occursNumberOfTimes(double value) {
		int count = 0;
		for(int i = 0; i < this.data.length; i++) {
			if(Math.abs(data[i] - value) < 0.000000000001) {
				count++;
			}
		}
		return count;
	}
	
	//Variance calculator based on the data values minus the average, squared, stored, and averaged again
	public double variance() {
		double sum = 0;
		double n = data.length;
		double average = this.average();
		for(int i = 0; i < n; i++) {
			sum += Math.pow((data[i] - average) , 2);
		}
		sum /= n;
		return sum;
	}
	
	//The standard deviation of the set, squared variance values
	public double standardDeviation() {
		if(this.isEmpty()) {
			return Double.NaN;
		}
		else {
			return Math.pow(this.variance(), 0.5);
		}
	}
	
	//Main Method and Test cases were placed here
}
