/* FindTheSums.java
 * Author:  Prateek Yadav
 * Submission Date:  11/17/2021
 * Due Date: 11/19/2021
 *
 *
 * Code Description:
 * The following code iterates through a 2D array to
 * perform various functions - the toString method
 * simply formats prints the array in a specified manner.
 * 
 * The Horizontal and Vertical sum methods solve a word-search-esque
 * game in which the user inputs an integer value, and any consecutive sums
 * to this value (horizontally and vertically respectively) are added to
 * another 2D array of zeros. 
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
public class FindTheSums {
	
	public static String arrayToString(int[][] a) {
		//String to return
		String str = "";
		//iterating thru rows
		for(int i = 0; i < a.length; i++) {
			//iterating thru items per row, ie the column
			for(int j = 0; j < a[0].length; j++) {
				str += a[i][j];
				//spacing when needed
				if (j != a[0].length-1) {
					str += " ";
				}
			}
			//new lines when needed
			if (i != a.length-1) {
				str += "\n";
			}
		}
		//return
		return str;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		//2D Array to return
		int[][] solution = new int[a.length][a[0].length];
		//Variables, named aptly
		int currentSum = 0;
		int solutionRow = 0;
		int solutionStart = 0;
		int solutionEnd = 0;
		
		//Iterates through each row
		for(int i = 0; i < a.length; i++) {
			//Iterates through each item in the row
			for(int j = 0; j < a[0].length; j++) {
				//Iterates through each item in the row again
				for(int k = j; k < a[0].length; k++) {
					//Adds up from the given item index, j
					currentSum += a[i][k];
					//While we add up, if we reach a solution, we take the indexes of the
					//Solution and iterate through the solution array to replace
					//any zeros with the numbers that added up to the "sumToFind"
					if(currentSum == sumToFind) {
						solutionRow = i;
						solutionStart = j;
						solutionEnd = k;
						
						for( int m = solutionStart; m < solutionEnd + 1; m++) {
							solution[solutionRow][m] = a[solutionRow][m];
						}
					}
				}
				//Resetting the sum as we move through each item at index j
				currentSum = 0;
			}
		}
		//returning the 2D Array
		return solution;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind){
		//2D Array to return
		int[][] solution = new int[a.length][a[0].length];
		//Variables, named aptly
		int currentSum = 0;
		int solutionColumn = 0;
		int solutionStart = 0;
		int solutionEnd = 0;
		
		//Iterates through each "column"
		for(int i = 0; i < a[0].length; i++) {
			//Iterates through each item in the "column"
			for(int j = 0; j < a.length; j++) {
				//Iterates through each item in the "column" again
				for(int k = j; k < a.length; k++) {
					//Adds up from the given item index, j
					currentSum += a[k][i];
					//While we add up, if we reach a solution, we take the indexes of the
					//Solution and iterate through the solution array to replace
					//any zeros with the numbers that added up to the "sumToFind"
					if(currentSum == sumToFind) {
						solutionColumn = i;
						solutionStart = j;
						solutionEnd = k;
						
						for( int m = solutionStart; m < solutionEnd + 1; m++) {
							solution[m][solutionColumn] = a[m][solutionColumn];
						}
					}
				}
				//Resetting the sum as we move through each item at index j
				currentSum = 0;
			}
		}
		//returning the 2D Array
		return solution;	
	}
}
