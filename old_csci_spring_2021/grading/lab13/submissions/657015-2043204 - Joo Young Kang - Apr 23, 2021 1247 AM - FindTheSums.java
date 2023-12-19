/*
 * CSCI 1301.java
 * Author: Joo Young Kang 
 * Submission Date:  April 23, 2021
 *
 * Purpose: The purpose of this program is to input a 2D array and neatly produce a printable String. 
 * Furthermore, it will find the horizontal and vertical sums from both input of 2D array and integer.
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
	
	// return a String that is a neat representation of the the values in a
	public static String arrayToString(int[][] a) {
		
		String emptyArray = ""; // create a empty new String
		
		for(int i=0; i<a.length; i++) { // for loop through size of a
			for(int j=0; j<a[i].length; j++) { // for loop through size of a at index i
				
				if(j==a[i].length-1) { // if condition when j equals size of a at index i but reverse
					emptyArray = emptyArray + a[i][j]; // 'emptyArray' equals 'emptyArray' plus a at i and j
				}
				else {
					emptyArray = emptyArray + a[i][j]; // 'emptyArray' equals 'emptyArray' plus a at i and j
					emptyArray = emptyArray + " "; // 'emptyArray' equals 'emptyArray' plus space (" ")
				}
			}
			if(i != a.length-1) { // if condition i does not equal size of a but reverse
				emptyArray = emptyArray + "\n"; // 'emptyArray' equals 'emptyArray' plus go to the next line
			}
		}
		return emptyArray; // return 'emptyArray'
	}
	
	// horizontalSums method
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		
		int[][] b = new int[a.length][a[0].length]; // create a new array 'b'
		
		for(int i=0; i<a.length; i++) { // for loop through size of a
			for(int j=0; j<a[i].length; j++) { // for loop through size of a at index i
				b[i][j] = 0; // elements in array b will initialized to 0
			}
		}
		
		for(int i=0; i<a.length; i++) { // for loop though size of a 
			for(int j=0; j<a[i].length; j++) { // for loop through size of a at index i
				
				int counter = j; // set counter equal to j
				int currentSum = 0; // set currentSum equals to 0
				
				boolean whileLoop = true; // set boolean 'whileLoop' equal to true
				
				while(counter<a[i].length && whileLoop) { // while loop through size of a at index i when is less than counter and condition is true
					currentSum = currentSum + a[i][counter]; // 'currentSum' equals 'currentSum' plus a array at index i and counter
					
					if(currentSum>sumToFind) { // if condition when currentSum greater than sumToFind
						whileLoop = false; // set whileLoop to false
					}
					
					if(currentSum == sumToFind) { // if condition when currentSum equals sumToFind 
						for(int k=j; k<=counter; k++) { // for loop when k equals j and is less than or equal to counter
							b[i][k] = a[i][k]; // set b equals to a at index i and k
							whileLoop = false;
						}
					}
					counter++; // increment counter
				}
			}
		}
		return b; // return b
	}
	
	// verticalSums method
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		
		int[][] b = new int[a.length][a[0].length]; // create a new array 'b'
		
		for(int i=0; i<a.length; i++) { // for loop through size of a
			for(int j=0; j<a[i].length; j++) { // for loop through size of a at index i
				b[i][j] = 0; // set 'b' equal to 0 at index of i and j 
			}
		}
		
		for(int i=0; i<a[0].length; i++) { // for loop through size of a at index 0
			for(int j=0; j<a.length; j++) { // for loop through size of a
				
				int counter = j; // set counter at j
				int currentSum = 0; // set currenSum equal to 0
				
				boolean whileLoop = true; // set boolean 'whileLoop' equal to true
				
				while(counter<a.length && whileLoop) { // while loop through size of a and whileLoop is true
					currentSum = currentSum + a[counter][i]; // currentSum equals to currentSum plus a at index counter and i
					
					if(currentSum>sumToFind) { // if condition when currentSum greater than sumToFind
						whileLoop = false; // set whileLoop equal to false
					}
					
					if(currentSum == sumToFind) { // if condition when currentSum equals to sumToFind
						for(int k=j; k<=counter; k++) { // for loop when k less than or equal to counter
							b[k][i] = a[k][i]; // set 'b' equal to 'a' at index of k and i
							whileLoop = false; // set 'whileLoop' equal to false
						}
					}
					counter++; // increment counter
				}
			}
		}
		return b; // return b
	}
}
