/*
 * FindTheSums.java
 * Author:  Eric Shindell 
 * Submission Date:  11/19/2021
 *
 * Purpose: This code lets the user input a two dimensional array of 
 * any lengths and height, then lets the user find which numbers in those
 * array, that are next to each other, add up to a number of their choice.
 * They can check either horizontally or vertically, though it calls the same
 * method in the end since the vertical option only rotates the array, calls
 * the horizontal sums method, then rotates it back to vertical. It then returns
 * an array only containing the numbers that are used in the sum that the user
 * wants to find.
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

	//Printing the array
	public static String arrayToString(int[][] a) {
		String output = "";
		int j; //Declaring outside so it can be used outside the for loop area
		for(int i = 0; i < a.length; i++) {
			for(j = 0; j < a[0].length - 1; j++) {
				output = output + a[i][j] + " ";
			}
			output = output + a[i][j]; //Adds the last line to make sure a space isn't added incorrectly
			if(i < a.length - 1) { //Checks to make sure that the array isn't going to add a new line at the end
				output = output + "\n";
			}
		}
		return output;
	}
	
	
	//Creates horizontal sums to see if the sumToFind is reached
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		int sum = 0;
		boolean reachedSum = false;
		
		for(int i = 0; i < a.length; i++) {
			sum = 0;
			for(int j = 0; j < a[0].length; j++) {
				sum = 0;
				sum = sum + a[i][j];
				if(sum < sumToFind) {
					for(int z = j + 1; z < a[0].length; z++) {
						sum = sum + a[i][z];
						if(sum == sumToFind) {
							reachedSum = true;
							z = a[0].length;
						}
						else if(sum > sumToFind) {
							z = a[0].length;
						}
					}
				}
				sum = 0;
				if(reachedSum) {
					reachedSum = false;
					int z = j;
					while(sum < sumToFind) {
						sum = sum + a[i][z];
						b[i][z] = a[i][z];
						z++;
					}
				}
			}
		}
				
		return b;
	}
	
	//Creates vertical sums to see if the sumToFind is reached
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] TempHorizontalArray = new int[a[0].length][a.length];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				TempHorizontalArray[j][i] = a[i][j];
			}
		}
		//Creates a temporary array that holds a horizontal version of the a array
		
		TempHorizontalArray = horizontalSums(TempHorizontalArray, sumToFind);
		//Calls the above method
		
		int[][] b = new int[a.length][a[0].length];
		for(int i = 0; i < TempHorizontalArray.length; i++) {
			for(int j = 0; j < TempHorizontalArray[0].length; j++) {
				b[j][i] = TempHorizontalArray[i][j];
			}
		}
		//Makes the array vertical again.
		
		
		return b;
	}
}
