/*
 * [FindTheSums].java
 * Author:  [Rachel Chesebro'] 
 * Submission Date:  [11/19/2021]
 *
 * Purpose: The purpose of this program is to convert a 2D array into a
 * string and create two methods that find the horizontal and vertical sums
 * for a 2D input array of integers and an input integer called sumToFind.
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

	//create arrayToString method that inputs a 2D array and outputs a string
	public static String arrayToString(int[][] a) {
		String array = "";
		//loops down rows
		for(int i = 0; i < a.length; i++) {
			//loops through each row
			for(int j = 0; j < a[i].length; j++) {
				int arrayElement = a[i][j];
				String arrayElementString = Integer.toString(arrayElement);
				//adds a space in between each int if it's not the last element
				if(j < a[i].length - 1) {
					array += arrayElementString + " ";
				}
				else {
					array += arrayElementString;
				}
			}
			//adds a new line if it's not the last line
			if(i < a.length - 1) {
				array += "\n";
			}
		}
		//return array as string
		return array;
	}
	
	
	//create horizontalSums method that inputs a 2D array and a sum to find in the array, then
	//outputs an array containing the numbers that add up to that sum horizontally
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		//create empty output array that's the same size as input array
		int[][] b = new int[a.length][a[0].length];
		//fill output array with 0s
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				b[i][j] = 0;
			}
		}
		//loop down rows of input array
		for(int i = 0; i < a.length; i++) {
			//loop through row horizontally
			for(int j = 0; j < a[i].length; j++) {
				int sum = 0;
				//loops through horizontally & stops if sum >= sumToFind
				for(int k = 0; k < a[i].length - j; k++) {
					sum += a[i][j + k];
					if(sum == sumToFind) {
						//replace 0s in output array with numbers that add up to sumToFind
						for(int l = 0; l <= k; l++) {
							b[i][j + l] = a[i][j + l];
						}
					}
				}
			}
		}
		//return array with only numbers that add up to sumToFind horizontally
		//all other elements in the array should be 0
		return b;
	}
	
	//create verticalSums method that inputs a 2D array and a sum to find in the array, then
	//outputs an array containing the numbers that add up to that sum vertically
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		//create empty output array that's the same size as input array
		int[][] b = new int[a.length][a[0].length];
		//fill output array with 0s
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				b[i][j] = 0;
			}
		}
		//loops vertically down each column
		for(int j = 0; j < a[0].length; j++) {
			for(int i = 0; i < a.length; i++) {
				int sum = 0;
				for(int k = 0; k < a.length - i; k++) {
					sum += a[i + k][j];
					if(sum == sumToFind) {
						//replace 0s in output array with numbers that add up to sumToFind 
						for(int l = 0; l <= k; l++) {
							b[i + l][j] = a[i + l][j];
						}
					}
				}
			}
		}
		//return array with only numbers that add up to sumToFind vertically
		//all other elements in the array should be 0
		return b;
	}

}
