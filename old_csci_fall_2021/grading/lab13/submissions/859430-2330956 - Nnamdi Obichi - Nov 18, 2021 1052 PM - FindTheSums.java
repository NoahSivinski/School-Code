/*
 * FindTheSums.java
 * Author: Nnamdi Obichi
 * Submission Date: November 18th, 2021
 *
 * Purpose:
 * 
 * Reads through a m*n 2D array. Prints out said 
 * array. This program creates two methods that read
 * through an array and return a new array with
 * valid indices. These methods return the numbers
 * in a 2D array that add up to a set sum in a
 * horizontal or vertical line. If there is an index
 * has no valid number that can add to that set
 * sum, then that index of the new array will equal 
 * zero 
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
		
		//Calculates maximum row and column indexes
		int rows = a.length-1;
		int cols = a[0].length-1;
		String arrayPrint = "";
		
		//If the array has a number of rows and columns greater than 1 
		if(rows > 0 && cols > 0){
			
			//Converts the first row of a to a String
			arrayPrint = a[0][0] + " ";
			for(int j = 1; j < cols; ++j) {
				arrayPrint += a[0][j] + " "; 
			}
			
			arrayPrint += a[0][cols] + "\n";
			
			//Converts middle rows to Strings
			for(int i = 1; i < rows; ++i) {
				
				arrayPrint += a[i][0] + " ";
				for(int j = 1; j < cols; ++j) {
					arrayPrint += a[i][j] + " "; 
				}
				arrayPrint += a[i][cols] + "\n";
			}
			
			//Converts the last row of a to a String
			arrayPrint += a[rows][0] + " ";
			
			for(int j = 1; j < cols; ++j) {
				
				arrayPrint += a[rows][j] + " "; 
				
			}
			arrayPrint += a[rows][cols];
		}
		
		//If the array has 1 row a number of columns is greater than 1 
		else if(rows == 0 && cols > 0){
			//Converts the first row of a to a String
			arrayPrint = a[0][0] + " ";
			for(int j = 1; j < cols; ++j) {
				arrayPrint += a[0][j] + " "; 
			}
			arrayPrint += a[0][cols];
		}
		
		//If the array has 1 column a number of rows is greater than 1 
		else if(rows > 0 && cols == 0){
			//Converts the first column of a to a String
			arrayPrint = a[0][0] + "\n";
			for(int i = 1; i < rows; ++i) {
				arrayPrint += a[i][0] + "\n"; 
			}
			arrayPrint += a[rows][0];
		}
		
		//If the array has 1 column and 1 row 
		else if (rows == 0 && cols == 0) {
			//Converts the first row of a to a String
			arrayPrint = a[0][0] + "";
		}
		
		return arrayPrint;
	}
	
	
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		
		//Calculates maximum row and column indexes
		int rows = a.length-1;
		int cols = a[0].length-1;
		
		//Creates a 1D int array full of -1's that is the size of a row of a 
		int[] aIndex = new int[cols+1];
		for(int j = 0; j < cols+1; ++j) {
			aIndex[j]= -1;
		}
		
		//Creates another 1D int array full of -1's that is the size of a row of a 
		int[] temporaryIndex = new int[cols+1];
		for(int j = 0; j < cols+1; ++j) {
			temporaryIndex[j]= -1;
		}
		
		//Assigns sum variable used later
		int sum = 0;
		
		//Creates an array b with dimensions rows*cols full of zeroes
		int[][] b = new int[rows+1][cols+1];
		
		//Reads through i rows
		for (int i = 0; i < rows+1; ++i) {
			
			//Resets aIndex so that it is full of zeroes
			aIndex = new int[cols+1];
			
			/*
			 * Sets the new starting place for j columns (in the for loop below 
			 * designated with "K USED IN THIS ONE") for every loop at k
			 */
			for(int k = 0; k < cols+1; ++k) {
				
				//Resets sum to 0 and temporaryIndex to be full of zeroes 
				sum = 0;
				temporaryIndex = new int[cols+1];
				
				//Fills temporaryIndex with -1 at every index 
				for(int j = 0; j < cols+1; ++j) {
					temporaryIndex[j]= -1;
				}
				
				/*
				 * Reads through j columns starting at at k and continues
				 * until the length of a's rows and if sum is not equal to
				 * sumToFind. "K USED IN THIS ONE" 
				 */
				for(int j = k; j < cols+1 && sum != sumToFind; ++j) {
					temporaryIndex[j] = j;
					sum += a[i][j];
				}
				
				//If sum equals sumToFind 
				if (sum == sumToFind) {
					
					//Copies temporaryIndex into a aIndex's columns
					for(int j = 0; j < cols+1; ++j) {
						aIndex[j]= temporaryIndex[j];
					}
					
					for(int j = 0; j < cols+1; ++j) {
						
						/*
						 * If aIndex's indices at j are greater than or equal to 
						 * zero, b[i][j] equals a's row i at column aIndex[j] 
						 */
						if(aIndex[j] >= 0) {
							b[i][j] = a[i][aIndex[j]];
						}
						
					}
				}
			}
		}
		return b;
	}
	
	
	public static int[][] verticalSums(int[][] a, int sumToFind){
		
		//Calculates maximum row and column indexes
		int rows = a.length-1;
		int cols = a[0].length-1;
		
		//Creates a 1D int array full of zeroes that is the size of a column of a 
		int[] aIndex = new int[rows+1];
		
		//Creates a 1D int array full of -1's that is the size of a column of a 
		int[] temporaryIndex = new int[rows+1];
		for(int j = 0; j < rows+1; ++j) {
			temporaryIndex[j]= -1;
		}
		
		//Assigns sum variable used later
		int sum = 0;
		
		//Creates an array b with dimensions rows*cols full of zeroes
		int[][] b = new int[rows+1][cols+1];
		
		//Reads through j columns
		for (int j = 0; j < cols+1; ++j) {
			
			//Resets aIndex so that it is full of zeroes
			aIndex = new int[rows+1];
			
			/*
			 * Sets the new starting place for i rows (in the for loop below 
			 * designated with "K USED IN THIS ONE") for every loop at k
			 */
			for(int k = 0; k < rows+1; ++k) {
				
				//Resets sum to 0 and temporaryIndex to be full of zeroes 
				sum = 0;
				temporaryIndex = new int[rows+1];
				
				//Fills temporaryIndex with -1 at every index
				for(int i = 0; i < rows+1; ++i) {
					temporaryIndex[i]= -1;
				}
				
				/*
				 * Reads through i rows starting at at k and continues
				 * until the length of a's columns and if sum is not equal to
				 * sumToFind. "K USED IN THIS ONE"
				 */
				for(int i = k; i < rows+1 && sum != sumToFind; ++i) {
					temporaryIndex[i] = i;
					sum += a[i][j];
				}
				
				//If sum equals sumToFind
				if (sum == sumToFind) {
					
					//Copies temporaryIndex into a aIndex's columns
					for(int i = 0; i < rows+1; ++i) {
						aIndex[i]= temporaryIndex[i];
					}
					
					for(int i = 0; i < rows+1; ++i) {
						
						/*
						 * If aIndex's indices at j are greater than or equal to 
						 * zero, b[i][j] equals a's row i at column aIndex[j] 
						 */
						if(aIndex[i] >= 0) {
							b[i][j] = a[aIndex[i]][j];
						}	
					}
				}
			}
		}
		return b;
	}
}
