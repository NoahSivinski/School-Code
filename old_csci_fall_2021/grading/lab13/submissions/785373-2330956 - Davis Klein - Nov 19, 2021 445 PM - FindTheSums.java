/*
 * [FindTheSums].java
 * Author:  [Davis Klein] 
 * Submission Date:  [11/19/2021]
 *
 * Purpose: This program returns a 2D array based on input a, having only the numbers that add either vertically or horizontally
 * to the input parameter.
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
	
	public static String arrayToString(int[][] a) {
		int arrayLength = a.length;
		int rowCount = 0; 	//rowCount is used to track how many rows have been iterated through
		String arrayString = "";
		for (int i = 0; i < arrayLength; i++) {
			rowCount++;
			for (int j = 0; j < a[i].length; j++) {
				if (j < (a[i].length)-1) {
					arrayString += a[i][j] + " ";	//if the element is not the last of the row, a space is added after
				}
				else {
					arrayString += a[i][j];
				}
			}
			if (rowCount < arrayLength) {	//as long as the amount of rows iterated through is less than the amount of rows
				arrayString += "\n";		//in the array, a newline character is added at the end of the row
			}
		}
		return arrayString;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];		//new array created - of same size as a
		for (int i = 0; i < b.length; i++) {			//new array is populated with 0's
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = 0;
			}
		}
		for (int i = 0; i < a.length; i++) {		//iterate through rows
			for (int j = 0; j < a[i].length; j++) {		//iterate through columns
				int sum = 0;
				int index = 0;
				for (int k = j; k < a[i].length; k++){	//iterate through each value in row
					index = (k - j) + 1;	//index of last number that adds to sum
					sum += a[i][k];			//add each value to sum, until equals sumToFind
					if (sum == sumToFind) {
						for (int h = 0; h < index; h++) {
							b[i][h] = a[i][h];		//replace 0's with original values of a, where they add to sumToFind
						}
					}
				}
			}
		}
		return b;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++) {		
			for (int j = 0; j < b[i].length; j++) {		
				b[i][j] = 0;
			}
		}
		for (int i = 0; i < a[0].length; i++) {		//iterate through columns
			for (int j = 0; j < a.length; j++) {		//iterate through rows
				int sum = 0;
				int index = 0;
				for (int k = j; k < a.length; k++){
					index = (k - j) + 1;
					sum += a[k][i];
					if (sum == sumToFind) {
						for (int h = 0; h < index; h++) {
							b[i][h] = a[i][h];
						}
					}
				}
			}
		}
		return b;
	}
	
}
