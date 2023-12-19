/*
 * [Stat].java
 * Author:  [Daniel Han] 
 * Submission Date:  [11/4/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The program is a class with 2 constructors (default and one that sets the double[] array data) and the class has a private array that will hold double values named data.
 * The class has a variety of public methods that return the array, whether the array is equal or not, the toString, the minimum value, the maximum value, the average, and the mode.
 * The class also has a mutator method that can change data's memory reference.
 * The accessor method will return a memory reference instead of data's memory reference.
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

	//the other stat constructor that takes a parameter of an double array and sets the array of data the same as the array of d
	public Stat(double[] d) {
		//creates a new array with the same length and values of array d
		double[] newData = new double[d.length];
		//uses a for each loop to assign the values of array d in array newData
		for (int i = 0; i < d.length; i++) {
			newData[i] = d[i];
		}
		//assigns the variable data to the memory reference of the array newData
		data = newData;
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
		//creates a new array with the same length and values of array d
		double[] newData = new double[d.length];
		//uses a for loop to assign values to newData
		for (int i = 0; i < d.length; i++) {
			newData[i] = d[i];
		}
		//sets the data variable to the reference location of newData
		data = newData;
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

	//toString method to return a string representing the data inside the stat object following proper I/O
	public String toString() {
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
	
	
	//main method to help test out the methods
	public static void main(String[] args) {
		
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 data = " + stat1.toString());		
		
	}

}
