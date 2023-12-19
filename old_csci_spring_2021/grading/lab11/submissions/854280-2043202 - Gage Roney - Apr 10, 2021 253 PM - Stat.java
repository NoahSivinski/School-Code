/*
 * Stat.java
 * Author:  Gage Roney 
 * Submission Date:  4/10/2021
 *
 * Purpose: The purpose of this program is to use a series of methods with two constructors. The methods in this
 * program includes a getter method, setter method, method that determines the minimum value in an array, maximum value in the array,
 * a boolean method that returns true if the values in the arrays being compared are the same, a mode method that determines the value
 * that occurs the most in the array or arrays and will return NaN if there is no unique mode in the series, there is also an average 
 * method, and finally a toString method to display the values. 
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
public class Stat { // Public class that holds the methods for Stat
	private double data[] = { 0.0 }; // Only instance variable in Stat declared a private so it can only be
										// manipulated in Stat

	public Stat() { // First constructor that creates a new array and assigns it to data with only
					// the value of 0.0
		double[] array = { 0.0 };
		data = array;
	}

	public Stat(double[] d) { // Second constructor with the parameters of double [] and d
		double[] newArray = new double[d.length]; // Creates a new array with the same length as the array d
		data = newArray; // then is assigned to data
		for (int i = 0; i < data.length; i++) { // For loop to put the values that will put the values of d into the
												// copy named newArray
			newArray[i] = d[i];
		}
	}

	public double[] getData() { // Getter method
		double[] getArray = new double[data.length]; // creates a new array the same length as data
		for (int i = 0; i < data.length; i++) { // For loop that puts the values of data into the new copy of array
												// named getArray
			getArray[i] = data[i];
		}
		return getArray; // returns the values of the copy array
	}

	public void setData(double[] d) { // Setter method that has the parameters of double [] d
		double setArray[] = new double[d.length]; // Copy array named setArray that is made the same length as d
		for (int i = 0; i < d.length; i++) { // For loop that puts the values of d into the new copy array named
												// setArray
			setArray[i] = d[i];
		}
		data = setArray; // references data to the copy array
	}

	public boolean equals(Stat s) { // Equals method that has the parameters of Stat and s
		boolean areElementsEqual = true; // Initializing the boolean to true
		if (getData().length != s.getData().length) { // Decision statement to see if getData().length is not equal to
														// s.getData().length
			areElementsEqual = false; // then the elements are not equal
		} else {
			for (int i = 0; areElementsEqual && i < s.getData().length; i++) { // For loop to increment and compare each
																				// value of the two arrays
				if (getData()[i] != s.getData()[i]) { // to see whether or not they are truly equal
					areElementsEqual = false; // If they do not have equal values then it will set boolean to false
				}
			}
		}
		return areElementsEqual; // Returns the value of the boolean whether it is false or true
	}

	public String toString() { // The blueprint method to print the values of the arrays when the toString
								// method is called
		if (data.length == 0) { // A error case if the length of the array is no values
			return "NaN"; // It will return the a String value of NaN
		} else { // Otherwise the method will make sure to print each value of the array
			String dataString = "["; // String value to print the brackets before the numbers
			for (int i = 0; i < data.length; i++) { // For loop to put the values of the array into the String
				dataString += data[i];
				if (i == data.length - 1) // Decision statement to make sure it will print the bracket at the end of the
											// values
					dataString += "]";
				else
					dataString += ", "; // otherwise it will make a comma to separate the values
			}
			return dataString; // Returns the brackets, commas, and values that have been stored in dataString

		}

	}

	public double min() { // Method that analyzes the array of values to determine the minimum value
		double min = data.length; // Minimum local variable initialized as the same value of the length of data
		if (data.length == 0) { // If there is a empty array it will display NaN
			min = Double.NaN;
		} else {
			for (int i = data.length - 1; i > -1; i--) { // For loop that searches through the values of the array
				if (data[i] < min) { // If the value at index of data is less than the minimum
					min = data[i]; // put that value in minimum at that index
				}
			}

		}
		return min; // Returns the value of the minimum
	}

	public double max() { // Method that analyzes the array for the max value
		double max = 0; // Max local variable initialized as a double value
		if (data.length == 0) { // If there is an empty array displays NaN
			max = Double.NaN;
		} else {
			max = data[0]; // data declared at index of 0 of the array
			for (int i = 1; i < data.length; i++) { // For loop that searches for the max value until it has looked
													// through all the values
				if (data[i] > max) { // If the value at a particular index is greater than the last it will go until
										// is is not
					max = data[i]; // Then it will store this value into max
				}
			}

		}
		return max; // Returns the value of max as a double value
	}

	public double average() { // Method that averages the numbers based on how many there are
		double sum = 0; // Local variable of the sum initialized as 0
		for (int index = 0; index < data.length; index++) { // For loop that adds each value and stores it in sum
			sum = sum + data[index];
		}
		double average = sum / data.length; // Calculation to determine the average
		return average; // Returns average as a double value
	}

	public double mode() { // Method that determines the mode of the arrays or the value that repeats the
							// most amount of times
		// Series of local variables declared initialized as double values
		double THRESHOLD = 0.000000001; // Used to compare double values, very close to zero
		double mode = 0; // Mode of the array set to 0
		double counter = 0; // Counter set 0
		if (data.length == 0) { // If there is an empty array display NaN
			mode = Double.NaN;
		}
		for (int i = 0; i < data.length; i++) { // Nested for loop that goes through all the values
			int maxCounter = 0;
			for (int j = i; j < data.length; j++) { // Inner loop that looks at those values and if they are equal using
													// the THRESHOLD Then they are equal
				if (Math.abs(data[i] - data[j]) <= THRESHOLD)
					maxCounter++; // Counter that will increase with the loop
			}
			if (maxCounter > counter) { // If the maxCounter is greater than the counter then
				mode = data[i]; // Set that value at a particular index as the mode
				counter = maxCounter; // Makes the counter the same number as the maxCounter
			} else if (maxCounter == counter) {
				mode = Double.NaN; // Else if statement that makes sure if there is no unique mode of the function
			} // that it will set mode to NaN
		}

		return mode; // Returns the value of mode whether it was made an actual number or NaN as
						// there was no specific mode
	}

}
