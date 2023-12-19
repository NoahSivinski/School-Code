/*
 * FindTheSums.java
 * Author: Aaron Brown
 * Submission Date: 04/20/2021
 *
 * Purpose: The purpose of this program creates three methods that can
 * be used with 2D arrays of integers. It can print the arrays in a neat
 * organized way with a space between each column and one new line character
 * between each row. The horizontal and vertical sum methods return the arrays
 * given as a parameter but only as strings of numbers that add up to give the
 * specified sum value. Horizontal returns horizontal strings that add up to the
 * sum, and vertical returns vertical strings that add up to the sum. Any other
 * value in both instances that is not part of a string of values to add up to a
 * sub is represented by a 0 in the returned array.
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
public class FindTheSums {
	
	/**
	 * This method allows for a neat way of printing the 2D arrays.
	 * It prints out in the format of each column being separated by 
	 * a space and each row being separated by a new line character.
	 */
	public static String arrayToString(int[][] a) {
		String arrayString = "";
		for(int row = 0; row < a.length; row++) {
			if(row > 0) arrayString = arrayString + '\n';
			for(int column = 0; column < a[row].length; column ++) {
				if(column > 0) arrayString = arrayString + ' ';
				arrayString = arrayString + a[row][column];
			}
		}
		return arrayString;
	}
	
	/**
	 * 
	 * @param a The array to find horizontal sums of.
	 * @param sumToFind The value to find sums of.
	 * @return The method returns a 2D array that only has
	 * horizontal strings of numbers that add up to give the
	 * sum requested. Any number that is not part of a string
	 * of values that adds to give a sum is a 0.
	 */
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		//This creates the new array.
		int[][] b = new int[a.length][a[0].length];
		//This is used to keep the current sum of numbers.
		int runningSum = 0;
		//This helps control the while loops of the program.
		boolean run = true;
		//The outer loop iterates through the rows of our 2D array.
		for(int row = 0; row < a.length; row++) {
			//This inner loop iterates through the columns of the 2D array.
			for(int column = 0; column < a[row].length; column++) {
				//This stores the current column value for later.
				int oldColumn = column;
				/* This while loop continues finding a sum of the values until
				 * the sum either meets the sumToFind, exceeds it, or runs out of values.
				 */
				while(run) {
					/* If the end of the row has been reached
					 * this sets the sum to one above sumToFind
					 * and returns the column value to the original
					 * value.
					 */
					if(column == a[row].length) {
						runningSum = sumToFind + 1;
						column = oldColumn;
					}
					else {
						//This adds the next value in the row to the sum.
						runningSum += a[row][column];
					}
					/* If the sum has met the sum to find or exceeded it the
					 * value of the while condition is set to false.
					 */
					if(runningSum >= sumToFind) run = false;
					//Otherwise, the column value is increased and the loop continues.
					else column++;
				}
				//If the sum to find was met this code stores the values in the return array.
				if(runningSum == sumToFind) {
					do {
						//Sets the b coordinates equal to the a coordinates.
						b[row][column] = a[row][column];
						/* If all values have not been stored yet, column is decreased to
						 * continue storing numbers. The value is also erased from sum.
						 */
						if(runningSum != 0) {
							runningSum = runningSum - a[row][column];
							column--;
						}
					} while(runningSum != 0);
				}
				/* If the sum wasn't met or was exceeded, the code resets the sum and
				 * returns the column to the original stored column to start from the
				 * next number in the line. The boolean is also returned to true.
				 */
				else {
					runningSum = 0;
					column = oldColumn;
					run = true;
				}
			}
		}
		//Returns the horizontal sum array.
		return b;
	}
	
	/**
	 * 
	 * @param a The array to find vertical sums of.
	 * @param sumToFind The value to find sums of.
	 * @return The method returns a 2D array that only has
	 * vertical strings of numbers that add up to give the
	 * sum requested. Any number that is not part of a string
	 * of values that adds to give a sum is a 0.
	 */
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		//This creates the new array.
		int[][] b = new int[a.length][a[0].length];
		//This is used to keep the current sum of numbers.
		int runningSum = 0;
		int row = 0;
		//This helps control the while loops of the method.
		boolean run = true;
		//The outer loop iterates through the columns of our 2D array.
		for(int column = 0; column < a[row].length; column++) {
			//This inner loop iterates through the rows of the 2D array.
			for(row = 0; row < a.length; row++) {
				//This stores the current row value for later.
				int oldRow = row;
				/* This while loop continues finding a sum of the values until
				 * the sum either meets the sumToFind, exceeds it, or runs out of values.
				 */
				while(run) {
					/* If the end of the column has been reached
					 * this sets the sum to one above sumToFind
					 * and returns the row value to the original
					 * value.
					 */
					if(row == a.length) {
						runningSum = sumToFind + 1;
						row = oldRow;
					}
					else {
						//This adds the next value in the column to the sum.
						runningSum += a[row][column];
					}
					/* If the sum has met the sum to find or exceeded it the
					 * value of the while condition is set to false.
					 */
					if(runningSum >= sumToFind) run = false;
					//Otherwise, the row value is increased and the loop continues.
					else row++;
				}
				//If the sum to find was met this code stores the values in the return array.
				if(runningSum == sumToFind) {
					do {
						//Sets the b coordinates equal to the a coordinates.
						b[row][column] = a[row][column];
						/* If all values have not been stored yet, row is decreased to
						 * continue storing numbers. The value is also erased from sum.
						 */
						if(runningSum != 0) {
							runningSum = runningSum - a[row][column];
							row--;
						}
					} while(runningSum != 0);
				}
				/* If the sum wasn't met or was exceeded, the code resets the sum and
				 * returns the row to the original stored row to start from the
				 * next number in the line. The boolean is also returned to true.
				 */
					else {
						runningSum = 0;
						row = oldRow;
						run = true;
					}
				}
			if(row == a.length) row--;
			}
		//Returns the horizontal sum array.
		return b;
	}
}
