/*
 * FindTheSums.java
 * Author:  Evan Zimmerman 
 * Submission Date:  22nd April 2021
 *
 * Purpose: The exercise being explored by Lab #13 is to gain experience with 2d Arrays and nested statements.
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

	//ArrayToString turns the constructor array a into a String that can be printed.
	public static String arrayToString(int[][] a) {
		//Initializes tempString as an empty String
		String tempString = "";
		//For each row of the array
		for(int i = 0; i < a.length; i++) {
			//For each digit in each row
			for(int j = 0; j < a[i].length; j++) {
				//Add the value at a to the string and add a space
				tempString += a[i][j];
				if(j != a[i].length-1) {
					tempString += " ";
				}
			}
			//Starts a new line after finishing the row, unless the last row was just added
			if(i != a.length-1) {
			tempString += "\n";
			}
		}
		//Returns the tempString variable
		return tempString;
	}
	
	public static int[][] horizontalSums(int[][]a, int sumToFind){
		//Initializes a new array b with the same dimensions of constructor array a. Depends on array a being a rectangle,
		//more complex code would need to be written for an array a with rows of varying length.
		int[][] b = new int[a.length][a[a.length-1].length];
		//Initializes an array of booleans with the same dimensions of b and a. This is used to keep track of if an integer
		//is part of a sum, which is used later to tell whether to give a 0 for the returned array.  
		boolean[][] partOfSum = new boolean[a.length][a[a.length-1].length];
		//Fills partOfSum with falses by default.
		for(int i = 0; i < partOfSum.length; i++) {
			for(int j = 0; j < partOfSum[i].length; j++) {
				partOfSum[i][j] = false;
			}
		}
		//Initialize variables tempSum and currentIndex
		int tempSum;
		int currentIndex;
		//For each row of the array
		for(int i = 0; i < a.length; i++) {
			//For each digit of the row
			for(int j = 0; j < a[i].length; j++) {
				//Resets tempSum to 0 and uses currentIndex as a placeholder for j
				tempSum = 0;
				currentIndex = j;
				//do-while loop that adds numbers horizontally (to the right of the value)
				//to tempSum until tempSum is not less than the sumToFind
				//or the max amount of elements in the row is surpassed
				do{
					tempSum += a[i][currentIndex];
					//if the tempSum has reached the sumToFind, uses a for-loop to set the partOfSum Boolean array at the
					//indexes of the contributing numbers to "true"
					if(tempSum == sumToFind) {
						for(int k = j; k <= currentIndex; k++) {
							partOfSum[i][k] = true;
						}
					}
					currentIndex++;
				}while(tempSum<sumToFind && currentIndex!=a[i].length);
			}
		}
		//Since array b and partOfSum are arrays with the same dimensions, for-loops check each index of partOfSum, and
		//for indexes where partOfSum is true, sets the value of b at the index to the value of a at the same index.
		//For elements of partOfSum that are false, sets b to 0 at that index.
		for(int i = 0; i < partOfSum.length; i++) {
			for(int j = 0; j < partOfSum[i].length; j++) {
				if(!partOfSum[i][j]) {
					b[i][j] = 0;
				} else if (partOfSum[i][j]) {
					b[i][j] = a[i][j];
				}
			}
		}
		//Returns b.
		return b;
	}
	
	//Similar to the horizontal sums method, but with changes to the for-loops and references to the array
	//to accomodate the changed manner of reading the array.
	public static int[][] verticalSums(int[][]a, int sumToFind){
		//Declare b and partOfSum as arrays with the same dimensions as a, and fills partOfSum with false.
		int[][] b = new int[a.length][a[a.length-1].length];
		boolean[][] partOfSum = new boolean[a.length][a[a.length-1].length];
		for(int i = 0; i < partOfSum.length; i++) {
			for(int j = 0; j < partOfSum[i].length; j++) {
				partOfSum[i][j] = false;
			}
		}
		//Declare variables tempSum and currentIndex
		int tempSum;
		int currentIndex;
		//Outer for-loop goes through each column. Once again relies on a being a rectangular array, since it assumes that
		//the length of a[0] is the same as the length of other rows.
		for(int i = 0; i < a[0].length; i++) {
			//For each element in the column
			for(int j = 0; j < a.length; j++) {
				//Resets the tempSum to 0 and uses currentIndex as a placeholder for j
				tempSum = 0;
				currentIndex = j;
				//do-while loop adds numbers vertically (with each digit below it) until the value of tempSum
				//is no longer less than the indicated sumToFind
				do{
					tempSum += a[currentIndex][i];
					//If the tempSum of the numbers is exactly the sumToFind, uses a for-loop to set the values of
					//partOfSum at the indexes of the contributing numbers to True
					if(tempSum == sumToFind) {
						for(int k = j; k <= currentIndex; k++) {
							partOfSum[k][i] = true;
						}
					}
					currentIndex++;
				}while(tempSum<sumToFind && currentIndex!=a.length);
			}
		}
		//Since array b and partOfSum are arrays with the same dimensions, for-loops check each index of partOfSum, and
		//for indexes where partOfSum is true, sets the value of b at the index to the value of a at the same index.
		//For elements of partOfSum that are false, sets b to 0 at that index.
		for(int i = 0; i < partOfSum.length; i++) {
			for(int j = 0; j < partOfSum[i].length; j++) {
				if(!partOfSum[i][j]) {
					b[i][j] = 0;
				} else if (partOfSum[i][j]) {
					b[i][j] = a[i][j];
				}
			}
		}
		//Returns b.
		return b;	
	}
	
}

