/*
 * FindTheSums.java
 * Author: Chase Pitser
 * Submission Date: 11/18/2021
 *
 * Purpose: The purpose of this java program is to have 3 methods related to 2d int arrays.
 * The first method simply prints out the 2d array in correct format. The second method searches 
 * for a user inputted value in which the entries in the array add up to horizontally. The third method
 * does the same as the second but searches vertially instead of horizontally.  
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
	
	//--------------
	// arrayToString(int[][] a): String
	//--------------
	public static String arrayToString(int[][] a) {
		String output = "";
		for(int m=0; m<a.length; m++) {
			for(int n=0; n<a[m].length-1; n++) {
				output += a[m][n] + " ";
			}
			output += a[m][a[m].length-1];
			if(m<a.length-1){
				output += "\n";
			}
		}
		return output;
	}

	//--------------
	// horizontalSums(int[][] a, int sumToFind): int[][]
	//--------------
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] output = new int[a.length][a[0].length];
		for(int row=0; row<a.length; row++) {
			for(int column=0; column<a[row].length; column++) {
				int index=column;
				int endIndex = -1;
				int sum = 0;
				while(sum<sumToFind && index<a[row].length) {
					sum += a[row][index];
					endIndex = index;
					index++;
				}
				if(sum==sumToFind) {
					for(int i=column; i<endIndex+1; i++) {
						output[row][i] = a[row][i];
					}
				}
			}
		}
		return output;
	}
	
	//--------------
	// verticalSums(int[][] a, int sumToFind): int[][]
	//--------------
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] output = new int[a.length][a[0].length];
		for(int column=0; column<a[0].length; column++) {
			for(int row=0; row<a.length; row++) {
				int index=row;
				int endIndex = -1;
				int sum = 0;
				while(sum<sumToFind && index<a.length) {
					sum += a[index][column];
					endIndex = index;
					index++;
				}
				if(sum==sumToFind) {
					for(int i=row; i<endIndex+1; i++) {
						output[i][column] = a[i][column];
					}
				}
			}
		}
		return output;
	}
	
}
