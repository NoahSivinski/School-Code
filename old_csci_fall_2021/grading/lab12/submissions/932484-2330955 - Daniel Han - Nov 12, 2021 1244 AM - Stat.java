/*
 * [Stat].java
 * Author:  [Daniel Han] 
 * Submission Date:  [11/12/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The program is a class with 2 constructors (default and one that sets the double[] array data) and the class has a private array that will hold double values named data.
 * The class has a variety of public methods that return the array, whether the array is equal or not, the toString, the minimum value, the maximum value, the average, and the mode.
 * The class also has a mutator method that can change data's memory reference.
 * The accessor method will return a memory reference instead of data's memory reference.
 * The stat class has added a lot of methods such as the variance or the standard deviation and now it can accept empty arrays.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */



public class Stat {
	//private instance variable data, which holds the memory reference for the double array
	private double[] data;

	//default constructor for stat, which takes in no parameters and sets the array to have only 1 element of 0.0
	public Stat() {
		//creates an array with a length of 1 and assigns the only element with 0.0
		data = new double[1];
		data[0] = 0.0;

	}

	//the other stat constructors that takes a parameter of arrays and sets the array of data the same as the array of d
	public Stat(double[] d) {

		//if d == null, then it will assign data to an empty arra
		if (d == null) {
			data = new double[0];
		}
		//else 
		else {
			//creates a new array with the same length and values of array d
			double[] newData = new double[d.length];
			//uses a for each loop to assign the values of array d in array newData
			for (int i = 0; i < d.length; i++) {
				newData[i] = d[i];
			}
			//assigns the variable data to the memory reference of the array newData
			data = newData;

		}

	}

	public Stat(float[] f) {

		//if f == null, then it will assign data to an empty array
		if (f == null) {
			data = new double[0];
		}
		//else 
		else {
			//creates a new array with the same length and values of array f
			double[] newData = new double[f.length];
			//uses a for each loop to assign the values of array f in array newData
			for (int i = 0; i < f.length; i++) {
				newData[i] = f[i];
			}
			//assigns the variable data to the memory reference of the array newData
			data = newData;

		}

	}

	public Stat(int[] i) {
		//if f == null, then it will assign data to an empty array
		if (i == null) {
			data = new double[0];
		}
		//else 
		else {
			//creates a new array with the same length and values of array i
			double[] newData = new double[i.length];
			//uses a for each loop to assign the values of array i in array newData
			for (int j = 0; j < i.length; j++) {
				newData[j] = i[j];
			}
			//assigns the variable data to the memory reference of the array newData
			data = newData;

		}

	}

	public Stat(long[] l) {

		//if l == null, then it will assign data to an empty array
		if (l == null) {
			data = new double[0];
		}
		//else 
		else {
			//creates a new array with the same length and values of array l
			double[] newData = new double[l.length];
			//uses a for each loop to assign the values of array l in array newData
			for (int i = 0; i < l.length; i++) {
				newData[i] = l[i];
			}
			//assigns the variable data to the memory reference of the array newData
			data = newData;

		}

	}

	//accessor method that returns a copy of the array data
	public double[] getData() {
		//creates an copy array to return
		double[] returnArray = new double[data.length];
		//uses a for loop to assign the values of array data into array returnArray
		for (int i = 0; i < data.length; i++) {
			returnArray[i] = data[i];
		}
		return returnArray;
	}

	//mutator method that intakes an array d
	public void setData(double[] d) {
		//if the parameter is null, then the array will be set to an empty array
		if (d == null) {
			data = new double[0];
		}
		else {
			//creates a new array with the same length and values of array d
			double[] newData = new double[d.length];
			//uses a for loop to assign values to newData
			for (int i = 0; i < d.length; i++) {
				newData[i] = d[i];
			}
			//sets the data variable to the reference location of newData
			data = newData;
		}
	}

	//mutator method that intakes the floats
	public void setData(float[] f) {
		//if the parameter is null, then the array will be set to an empty array
		if (f == null) {
			data = new double[0];
		}
		else {
			//creates a new array with the same length and values of array f
			double[] newData = new double[f.length];
			//uses a for loop to assign values to newData
			for (int i = 0; i < f.length; i++) {
				newData[i] = f[i];
			}
			//sets the data variable to the reference location of newData
			data = newData;
		}
	}

	//mutator method that intakes integers
	public void setData(int[] i) {
		//if the parameter is null, then the array will be set to an empty array
		if (i == null) {
			data = new double[0];
		}
		else {
			//creates a new array with the same length and values of array j
			double[] newData = new double[i.length];
			//uses a for loop to assign values to newData
			for (int j = 0; j < i.length; j++) {
				newData[j] = i[j];
			}
			//sets the data variable to the reference location of newData
			data = newData;
		}

	}

	//mutator method that intakes longs
	public void setData(long[] l) {
		//if the parameter is null, then the array will be set to an empty array
		if (l == null) {
			data = new double[0];
		}
		else {
			//creates a new array with the same length and values of array l
			double[] newData = new double[l.length];
			//uses a for loop to assign values to newData
			for (int i = 0; i < l.length; i++) {
				newData[i] = l[i];
			}
			//sets the data variable to the reference location of newData
			data = newData;
		}
	}


	//equals method that intakes another Stat object to see if they have the same values and the same array and returns a boolean value
	public boolean equals(Stat s) {
		//creates a double threshold variable to help check for double equality
		double threshold =  0.0000000001;
		//checks if the lengths are equal, if not, then it will return false
		if (this.data.length != s.data.length) {
			return false;
		}
		//uses a for loop to check if both data arrays have the same values in the same order, else, it will return false and exit the method
		for (int i = 0; i < data.length; i++) {
			//to check for double accuracy, finds the absolute value of the subtraction of both values then sees if it is less than a certain number
			if ( ! (Math.abs(this.data[i] - s.data[i]) < threshold) ) {
				//if the doubles do not match up, then it will return false
				return false;
			}
		}
		//if there are no differences found, then it will return true
		return true;
	}

	//the reset method that clears that data array
	public void reset() {
		//creates a new empty double array and assigns it to data
		data = new double[0];
	}

	//code block for the append method

	//append method that intakes a double array
	public void append(double[] d) {
		//if the parameter is null, then it will do nothing
		if(d == null) {
			//does nothing
		}
		//else will create a new array combining the lengths of the data array and of d
		else {
			double[] append = new double[data.length+d.length];
			//uses a for loop to add the d array onto the data array
			for(int i = 0; i < d.length; i++) {
				append[i+data.length] = d[i];

			}
			//sets data to append
			data = append;
		}
	}

	//append method that intakes a integer array
	public void append(int[] i) {
		//if the parameter is null, then it will do nothing
		if(i == null) {
			//does nothing
		}
		else {
			double[] append = new double[data.length+i.length];
			//uses a for loop to add the i array onto the data array
			for(int j = 0; j < i.length; j++) {
				append[j+data.length] = i[j];

			}
			//sets data to append
			data = append;
		}
	}

	//append method that intakes a long array
	public void append(long[] l) {
		//if the parameter is null, then it will do nothing
		if(l == null) {
			//does nothing
		}
		//else will create a new array combining the lengths of the data array and of l
		else {
			double[] append = new double[data.length+l.length];
			//uses a for loop to add the l array onto the data array
			for(int i = 0; i < l.length; i++) {
				append[i+data.length] = l[i];

			}
			//sets data to append
			data = append;
		}
	}

	//append method that intakes a float array
	public void append(float[] f) {
		//if the parameter is null, then it will do nothing
		if(f == null) {
			//does nothing
		}
		//else will create a new array combining the lengths of the data array and of f
		else {
			double[] append = new double[data.length+f.length];
			//uses a for loop to add the l array onto the data array
			for(int i = 0; i < f.length; i++) {
				append[i+data.length] = f[i];

			}
			//sets data to append
			data = append;
		}
	}

	//method isEmpty returns if the string has a length of zero
	public boolean isEmpty() {
		//if the length of the data array is 0, then it will return true
		return (data.length == 0);
	}

	//toString method to return a string representing the data inside the stat object following proper I/O
	public String toString() {
		//if the array is empty then it will output just a pair of brackets
		if(data.length == 0) {
			return ("[]");
		}
		//creates a returnString to return
		String returnString = "";
		returnString = "[";
		//uses a for loop to concatenate returnString and make it list all the values except for the final value
		for (int i = 0; i < data.length-1; i++) {
			returnString += data[i] + ", ";
		}
		//after the for loop ends, adds the final value and the final closing bracket
		returnString += data[data.length-1] + "]";
		//returns returnString
		return returnString;
	}

	//method that returns the minimum double value of the array
	public double min() {
		//if the length of the array is 0, then it will return double.NaN
		if (isEmpty()) {
			//if isEmpty, then it will return 0.0 / 0.0, which returns double.NaN
			return (0.0 / 0.0);
		}
		//creates a double to return that will hold the lowest value
		double returnDob = data[0];
		//uses a for each loop to iterate through all the numbers and assign the lowest to returnDob
		for (double i: data) {
			if (i < returnDob) {
				returnDob = i;
			}
		}

		//returns returnDob
		return returnDob;
	}

	//method that returns the maximum double value of the array
	public double max() {
		//if the length of the data array is 0, then it will return double.NaN
		if (isEmpty()) {
			//if is empty, then it will return 0.0 / 0.0
			return (0.0 / 0.0);
		}
		//creates double variable to return the largest value in the array and assigns it to the first number in the data array
		double maxDob = data[0];
		//uses a for each loop to iterate through all the numbers in the array and assign the lowest to maxDob
		for (double i: data) {
			if (i > maxDob) {
				maxDob = i;
			}
		}

		//returns the maxDob variable
		return maxDob;
	}


	//average method to return the average of all the values
	public double average() {
		//if the length of the data array is 0, then it will return double.NaN
		if (isEmpty()) {
			//if is empty, then it will return 0.0 / 0.0
			return (0.0 / 0.0);
		}
		//creates a double variable that will hold up all the added values inside the data array and a double variable that holds the average
		double addTotal = 0; double average;
		//uses a for loop to get the sum of all double variables in the array data and set it to the addTotal variable
		for (int i = 0; i < data.length; i++) {
			addTotal += data[i];
		}
		//average is added sums divided by the number of elements (length)
		average = addTotal / data.length;
		//returns average
		return average;
	}

	//mode method to return the number that is repeated the most in the array
	public double mode() {
		//if the data array is empty, then it will return double.NaN
		if(data.length == 0) {
			return (0.0 / 0.0);
		}
		//int variables to hold the number of the 2 largest occurences
		int mostRepeats = -1; int secondRepeats = -2;
		//int variable to hold the number of repeats for the for loop
		int repeats = -1;
		//creates a double threshold variable to help check for double equality
		double threshold =  0.0000000001;
		//double variables to hold the top 2 double values that are repeated and sets the mostRepeatsDouble to the first double variable in the array data
		double mostRepeatsDouble = data[0]; double secondRepeatsDoubles;
		//nested for loop to find which values have the most repeats
		for (int i = 0; i < data.length; i++) {
			//will count the number of repeats for the first letter, then the second, etc
			for (int j = 0; j < data.length; j++) {
				//if the data[i] equals data[j], then it will increment repeats
				if ( Math.abs(data[i] - data[j]) < threshold) {
					repeats++;
				}
			}
			//if the number of repeats is greater than the most repeats, then it will set data[i] to mostRepeatsDouble and will set repeats to mostRepeats
			if (repeats > mostRepeats) {
				//will also set the former number of repeats to secondRepeats
				secondRepeats = mostRepeats;
				secondRepeatsDoubles = mostRepeatsDouble;
				mostRepeats = repeats;
				mostRepeatsDouble = data[i];
			}
			//else if the number of repeats is greater than the second most amount of repeats, then it will set data[i] to secondRepeatsDouble and will repeats to secondRepeats
			else if (repeats > secondRepeats) {
				secondRepeats = repeats;
				secondRepeatsDoubles = data[i];
			}
			//at the end of loop, resets repeats to -1
			repeats = -1;

		}
		//if the number of mostRepeats and secondRepeats are the same, then it will return the Double.NaN 
		if (mostRepeats == secondRepeats) {
			//returns NaN by dividing by zero
			return (0.0 / 0.0);
		}
		//else it will return mostRepeatsDouble
		else  {
			return mostRepeatsDouble;
		}

	}

	//method to return the number of times the value occurs in the data array
	public int occursNumberOfTimes(double value) {
		//counter to hold how many times a value occurs
		int counter = 0;
		//for loop to count the number of times a value occurs
		for(int i = 0; i < data.length; i++) {
			//if data[i] == value,  then it will increment the counter
			if(data[i] == value) {
				counter++;
			}
		}
		//returns the counter
		return counter;
	}

	//variance method
	public double variance() {
		//if the length of data is 0, then it will return a double.NaN
		if(data.length == 0) {
			return (0.0 / 0.0);
		}
		//counter variable to hold the variance
		double variance = 0;
		//double variable to hold the distance
		double distance = 0;
		//for loop to find the distance
		for(int i = 0; i < data.length; i++) {
			//first find the distance between the value and the mean and then square it
			distance = Math.abs(data[i] - average());
			//square the distance
			distance = Math.pow(distance, 2);
			//add it to the variance
			variance += distance;
		}
		//return variance divided by the length of the array
		return (variance / data.length);
	}

	//standard deviation method
	public double standardDeviation() {
		//if the data length is 0, then it will return a NaN value
		if(data.length == 0) {
			return (0.0 / 0.0);
		}
		else {
			//else will return the square root of the variance
			return Math.sqrt(variance());
		}
	}

	//main method to help test out the methods
	public static void main(String[] args) {

		double[] data1 = {50.0, 60.0};
		float[] data2 = {70.0F, 80.0F};
		int[] data3 = {90, 100};
		long[] data4 = {100L, 110L};
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data1);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data2);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data3);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.setData(data4);
		System.out.println("stat1 data = " + stat1.toString());
		data1 = null;
		stat1.setData(data1);
		System.out.println("stat1 data = " + stat1.toString());
		

	}

}
