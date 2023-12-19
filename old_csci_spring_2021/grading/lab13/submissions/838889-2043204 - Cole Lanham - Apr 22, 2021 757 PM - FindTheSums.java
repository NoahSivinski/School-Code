/*
 * FindTheSums.java
 * Author:  Cole Lanham
 * Submission Date:  4/22/21
 *
 * Purpose: This program provided an on hands exercise
 * centered around properly implementing static methods and 
 * 2 dimensional arrays. This lab asked us to provide methods 
 * which find all adjacent elements horizontally and vertically 
 * which add up to a specific sum. This logic was probably the 
 * hardest logic we've needed to implement all semester, and
 * allowed us to truly test our abilities to write pseudo-code
 * and problem solve.
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

	/*
	 * Method for returning a string version of array "a"
	 */
	public static String arrayToString(int[][] a) {
		String toString = "";
		for (int i = 0; i < a.length - 1; i++) {
			for (int n = 0; n < a[0].length - 1; n++) {
				toString += a[i][n] + " ";
			}
			toString += a[i][a[0].length - 1] + "\n";
		}
		for (int n = 0; n < a[0].length - 1; n++) {
			toString += a[a.length - 1][n] + " ";
		}
		toString += a[a.length - 1][a[0].length - 1];
		return toString;
	}
	
	
	
	
	/*
	 * Method which returns a copy of input array a, but also finds all
	 * adjacent elements in a column which equal sumToFind
	 */
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] copyArray = new int[a.length][a[0].length]; //Produces a copy of the array so we don't actually change the values of the starting array
		setEqual(a, copyArray);
		
	for (int row = 0; row < copyArray.length; row++ ) {
			
			int[] arrayOfZeros = new int[copyArray[row].length];//Dummy array 
			for (int b = 0; b < arrayOfZeros.length; b++) { //b has no significance just used for array assignment
				arrayOfZeros[b] = 0;
			}
			for (int column = 0; column < copyArray[row].length; column++) { //i has no significance just used for array assignment
				int sum = 0;
				for (int index = column; index < copyArray[row].length; index++) {
					sum += copyArray[row][index];
					if (sum == sumToFind) {
						for (int m = column ; m < index + 1; m++) {
							arrayOfZeros[m] = copyArray[row][m];
						}
						sum = 0;
					}
				}
			}
			for (int i = 0; i < copyArray[row].length; i++) {
				copyArray[row][i] = arrayOfZeros[i];
			}
		}
		return copyArray;
	}
	
	/*
	 * Method which returns a copy of input array a, but also find all
	 * adjacent elements in a column which equal sumToFind
	 */
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] copyArray = new int[a.length][a[0].length]; //Produces a copy of the array so we don't actually change the values of the starting array
		setEqual(a, copyArray);
		
		for (int column = 0; column < copyArray[0].length; column++) {
			
			int[] arrayOfZeros = new int[copyArray.length]; //Dummy array 
			for (int b = 0; b < arrayOfZeros.length; b++) { //b has no significance just used for array assignment
				arrayOfZeros[b] = 0;
			}
			for (int row = 0; row < copyArray.length; row++) {
				int sum = 0;
				for (int index = row; index < copyArray.length; index++) {
					sum += copyArray[index][column];
					if (sum == sumToFind) {
						for (int m = row; m < index + 1; m++) {
							arrayOfZeros[m] = copyArray[m][column];
						}
						sum = 0;
					}
				}
			}
			for (int i = 0; i < copyArray.length; i++) {
				copyArray[i][column] = arrayOfZeros[i];
			}
		}
		return copyArray;
	}
	
	
	/*
	 * Extra Method which allows us to set one array equal to another (used in creating
	 * copy of input arrays)
	 */
	private static void setEqual (int[][] inputArray, int[][] outputArray) {
		if (inputArray.length == outputArray.length && inputArray[0].length == outputArray[0].length) {
			for (int i = 0; i < inputArray.length; i++) {
				for (int n = 0; n < inputArray[i].length; n++) 
					outputArray[i][n] = inputArray[i][n];
			}
		}
	}
	
	
}
