/*
 * CSCI 1301.java
 * Author: Joo Young Kang
 * Submission Date:  April 16, 2021
 *
 * Purpose: This lab is a continuation from the Stat.java from Lab 11. However, this involves the usage
 * of additional methods and formulas such as overloading, overriding, and finding standard deviation.
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

	private double data []; // creates private data array
	
		public Stat() { // public class
			
			double[] tempData = new double[0]; // creates new double array with size 0
			data = tempData; // sets data equal to tempData
		}
		
		public Stat(double[] d) { // public class that accepts double value
			
			double[] emptyArray = {}; // creates new empty array containing nothing
			
			if(d==null) { // if condition that checks whether input "d" equals null
				this.data = emptyArray; // true then data equals emptyArray
			}
			
			else {
				double inputArray1[] = new double[d.length]; // false then new array is created that is the size d
				
				for (int i=0; i<d.length; i++) { // for loop
					inputArray1[i] = d[i]; // empty array equals d at i
				}
				this.data = inputArray1; // data equals the array
			}
			
		}
		
		public Stat(float[] f) { // public class that accepts float value
			
			double[] emptyArray = {}; // creates new empty array containing nothing
			
			if(f==null) { // if condition that checks whether "d" equals null
				this.data = emptyArray; // data equals array
			}
			
			else {
				double[] inputArray2 = new double[f.length]; // false then new array is created that is the size f
				
				for (int i=0; i<f.length; i++) { // for loop
					inputArray2[i] = f[i]; // empty array equals f at i
				}	
				this.data = inputArray2; // data equals array
			}
		}
		
		public Stat(int[] i) { // public class that accepts int value
			
			double[] emptyArray = {}; // creates new empty array containing nothing
			
			if (i==null) { // if condition that checks whether "i" equals null
				this.data = emptyArray; // data equals array
			}
			
			else {
				double inputArray3[] = new double[i.length]; // false then new array is created that is the size i
				
				for (int j=0; j<i.length; j++) { // for loop
					inputArray3[j] = i[j]; // empty array equals i at j
				}
				this.data = inputArray3; // data equals array
			}
		}
		
		public Stat(long[] lo) { // public class that accepts lo value
			
			double[] emptyArray = {}; // create new empty array
			
			if (lo==null) { // creates new empty array containing nothing
				this.data = emptyArray; // data equals array
			}
			
			else {
				double inputArray4[] = new double[lo.length]; // false then new array is created that is the size lo
				
				for (int i=0; i<lo.length; i++) {  // for loop
					inputArray4[i] = lo[i]; //empty array equals lo at i
				}
				this.data = inputArray4; // data equals array
			}
		}
		
		// setter
		public void setData(double[] d) { // sets data to double value
			
			double[] emptyArray = {}; // create new empty array
			
			if (d==null) { // creates new empty array containing nothing
				this.data = emptyArray; // data equals array
			}
			else {
				
				double inputArray5[] = new double[d.length]; // false then new array is created that is the size d
				
				for (int i=0; i<d.length; i++) { // for loop
					inputArray5[i] = d[i]; // array equals d at i
				}
				this.data = inputArray5; // data equals array
			}
		}
		
		// setter
		public void setData(int[] i) { // sets data to int value
			
			double[] emptyArray = {}; // create new empty array
			
			if (i==null) { // creates new empty array containing nothing
				this.data = emptyArray; // data equals array
			}
			else {
				
				double inputArray6[] = new double[i.length]; // false then new array is created that is the size d
				
				for (int j=0; j<i.length; j++) { // for loop
					inputArray6[j] = i[j]; // array equals i at j
				}
				this.data = inputArray6; // data equals array
			}
		}
		// setter
		public void setData(long[] lo) { // sets data to lo value
			
			double[] emptyArray = {}; // create new empty array
			
			if (lo==null) { // creates new empty array containing nothing
				this.data = emptyArray; // data equals array
			}
			else {
				
				double inputArray7[] = new double[lo.length]; // false then new array is created that is the size lo
				
				for (int i=0; i<lo.length; i++) { // for loop
					inputArray7[i] = lo[i]; // array equals lo at i
				}
				this.data = inputArray7; // data equals array
			}
		}
		// setter
		public void setData(float[] f) { // sets data to float value
			
			double[] emptyArray = {}; // create new empty array
			
			if (f==null) { // for loop
				this.data = emptyArray; // data equals empty array
			}
			else {
				
				double inputArray8[] = new double[f.length]; // false then new array is created that is the size f
				
				for (int i=0; i<f.length; i++) { // for loop
					inputArray8[i] = f[i]; // array equals f at i
				}
				this.data = inputArray8; // data equals array
			}
		}
		
		// getter
		public double[] getData() { // retrieves the set data value
			
			double[] inputArray9 = new double[data.length]; // create new empty array
			
			for (int i=0; i<data.length; i++) { // for loop
				inputArray9[i] = data[i]; //array equals data at i
			}
			return inputArray9; // return new array
		}
		
		// equals method
		public boolean equals(Stat s) { // boolean that equals Stat method s value
			
			if(s==null) { // if condition where s equals null
				return false;
			}
			
			if (s.data.length == data.length) { // if condition size of s data equals default data
				for (int i=0; i<s.data.length; i++) { // for loop through data
					if (s.data[i] != data[i]) { // if condition where s data does not equal to default data at i
						return false;
					}
				}
			}
			else {
				return false;
			}
			return true; // if none of the condition applies then return true as a default return
		}
		
		// reset method
		public void reset() {
			
			double emptyArray[] = {}; // create array that is empty
			this.data = emptyArray; // set data equal to the emptyArray
		}
		
		// append method: double
		public void append(double[] d) { // set data where it accepts double value
			
			if (d==null) { // if condition where d equls null
				return;
			}
			else {
				
				int combineLength = data.length + d.length; // new length that equals data and d size combined
				
				double inputArray10[] = new double[combineLength]; // creates new array with size of combined data lengths
				
				for (int i=0; i<data.length; i++) { // for loop
					inputArray10[i] = data[i]; // set array equal to data at i
				}	
				for (int j=0; j<d.length; j++) { // for loop
					inputArray10[data.length+j] = d[j]; // array contains data size plus j value
				}
				this.data = inputArray10; // data equals to array
			}
		}
		
		// append method: int
		public void append(int[] i) { // set data where it accepts int value
			
			if (i==null) { // if condition where i equals null
				return;
			}
			else {
				
				int combineLength = data.length + i.length; //  new length that equals data and d size combined
				
				double inputArray11[] = new double[combineLength]; // creates new arary with size of combined data lengths
				
				for (int j=0; j<data.length; j++) { // for loop
					inputArray11[j] = data[j]; // set array equal to data at j
				}
				
				for (int k=0; k<i.length; k++) { // for loop
						inputArray11[data.length+k] = i[k]; // array contains data size plus k value
				}
				this.data = inputArray11; // data equals to array
			}
		}
		
		// append method: long
		public void append(long[] lo) { // set data where it accepts lo value
			
			if (lo==null) { // if condition where lo equals null
				return;
			}
			else {
				
				int combineLength = data.length + lo.length; // new length that equals data and d size combined
				
				double inputArray12[] = new double[combineLength]; // creates new array with size of combined data lengths
				
				for (int i=0; i<data.length; i++) { // for loop
					inputArray12[i] = data[i]; // set array equal to data at i
				}
				
				for (int j=0; j<lo.length; j++) { // for loop
					inputArray12[data.length+j] = lo[j]; // array contains data size plus j value
				}
				this.data = inputArray12; // data equals to array
			}
		}
		
		// append method: float
		public void append(float[] f) { // set data where it accepts float value
			
			if (f==null) { // if condition where f equals null
				return;
			}
			else {
				
				int combineLength = data.length + f.length; // new length that equals data and f size combined.
				
				double inputArray13[] = new double[combineLength]; // creates new array with size of combined data lengths
				
				for (int i=0; i<data.length; i++) { // for loop 
					inputArray13[i] = data[i]; // set array equal to data at i
				}
				
				for (int j=0; j<f.length; j++) { // for loop
					inputArray13[data.length+j] = f[j]; // array contains data size plus j value
				}
				this.data = inputArray13; // sets data equal to array
			}
		}
		
		// empty method
		public boolean isEmpty() {
			
			if (data.length == 0) { // if condition where size of data equals to 0
				return true;
			}
			else {
				return false; // if condition is false, then return false
			}
		}
		
		// toString method
		public String toString() { // toString method
			
			String bracket = "["; // String with a bracket method
			
			if (data.length < 1) { // for loop that if the size is smaller than 1; this produces an empty bracket
				String emptyBracket = "[]";
				return emptyBracket;
			}
			
			for (int i=0; i<data.length; i++) { // for loop through array
				if (i != data.length-1) { // if condition to determine whether data[] is the last index
					bracket = bracket + data[i] + ", "; // if not then data[i] is added with ", "
				}
				else {
					bracket = bracket + data[i] + "]"; // if data[] is the last index then data[i] with last bracket "]"
					bracket = bracket.trim(); // get rid of leading and trailing space
				}
			}
			return bracket; // return bracket
		}
		
		// minimum method
		public double min() {
			
			if (data.length == 0) {
				return Double.NaN;
			}
			else {
				double minimumNumber = this.data[0]; // create double value that equals data[] at first index
				
				for (int i=0; i<data.length; i++) { // for loop through array
					if (minimumNumber > data[i]) { // if condition that tests whether the first double value is greater than next data[] value
						minimumNumber = data[i]; // if true, then data[] at that index becomes the the new minimumNumber
					}
				}
				return minimumNumber; // return minimumNumber
			}
		}
		
		// maximum method
		public double max() {
			
			if (data.length == 0) {
				return Double.NaN;
			}
			else {
				double maximumNumber = this.data[0]; // create double value that equals data[] at first index
				
				for (int i=0; i<data.length; i++) {	// for loop through array
					if (maximumNumber < data[i]) { // if condition that tests whether the first double value is less than next data[] value
						maximumNumber = data[i]; // if true, then data[] at that index becomes the the new maximumNumber
					}
				}
				return maximumNumber; // return maximumNumber
			}
		}
		
		// average method
		public double average() { // average method
			
			if (data.length == 0) {
				return Double.NaN;
			}
			else {
				double averageNumber = this.data[0]; // create double value that equals the first data[] value
				
				for (int i=1; i<data.length; i++) { // for loop through data array starting at index 1
					averageNumber = averageNumber + data[i]; // average number equals to average number plus the next data[i]
				}
				averageNumber = (averageNumber / data.length); // averageNumber is averageNumber divided by data size
				return averageNumber; // return averageNumber
			}
		}
		
		// mode method
		public double mode() { // mode method
			
			if (data.length < 1) { // if condition when data size is smaller than 1
				return Double.NaN; // if true, return double value of ".NaN"
			}
			
			int[] maxFrequency = new int [data.length]; // the maximum number of times a certain value within the data[]
			
			for (int i=0; i<data.length; i++) { // for loop through the data array
				for (int j=0; j<data.length; j++) { // second for loop through the data array to correspond to first loop
					if(data[i]==data[j]) { // if condition to to compare first and second array
						maxFrequency[i]++; // if true, increase count of a certain number within the data array
					}
				}
			}
			
			int maxCounter = 0; // set counter to count max value
			double modeValue = data[0]; // set double value to first value in data[]
			
			for (int i=0; i<maxFrequency.length; i++) { // for loop through based on maxFrequency value size
				if (maxFrequency[i] > maxCounter) { // if condition for maxFrequency greater than maxCounter
					maxCounter = maxFrequency[i]; // assigns maxCounter equal to maxFrequency at index
					modeValue = data[i]; // assign modeVale to the data[] at the index
				}
			}
			
			for (int i=0; i<maxFrequency.length; i++) { // for loop through based on maxFrequenct value size
				if(maxFrequency[i] == maxCounter) { // if condition that compares the maxFrequency and maxCounter
					if(modeValue != data[i]) { // if condition when modeValue does not equal to data[]
						return Double.NaN; // if true, return double value of ".NaN"
					}
				}
			}
			
			for (int i=0; i<maxFrequency.length; i++) { // for loop through array based on maxFrequency length
				if(maxFrequency[i] == maxCounter) { // if condition to compare maxFrequency  and maxCounter at the index
					if(modeValue != data[i]) { // if condition that compares and determine whether or not modeValue does not equal data[] at index
						return Double.NaN; // return double value of ".NaN"
					}
				}
			}
			return modeValue; // return modeValue
		}
		
		// Number of occurence method
		private int occursNumberOfTimes(double value) { // private instance that accepts double value
			
			int counter = 0; // counter that takes count starting from 0
			
			for (int i=0; i<data.length; i++) { // for loop
				if(data[i] == value) { // if condition where data at i equals value
					counter++; // add up counter
				}
			}
			return counter; // return counter
		}
		
		// variance method
		public double variance() { // double value class
			
			double totalSum = 0; //double value that starts at 0
			
			if (data.length == 0) { // if condition where data size equals 0
				return Double.NaN;
			}
			
			for (int i=0; i<data.length; i++) { // for loop
				double differenceSqr = Math.pow((data[i] - average()),2); // difference square formula
				totalSum = totalSum + differenceSqr; // cumulative add up after each loop to totalSum value
			}
			return totalSum/data.length; // return totalSum value divided by data size
		}
		
		// standard deviation method
		public double standardDeviation() { // double value class
			
			if (data.length == 0) { // if condition where data size equals 0
				return Double.NaN;
			}
			else {
				return Math.sqrt(variance()); // uses variance class and squares the value
			}
		}
}

