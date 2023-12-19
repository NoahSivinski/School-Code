/*
 * FindTheSums.java
 * Author:  Delaney Ott
 * Submission Date:  April 20th 2021
 *
 * Purpose: This program is designed to search a 2D input array of integers in
 * order to find horizontal and vertical sums that equal an integer value that is inputed.
 * Overall, it is a word search for horizontal and vertical sums.
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
		String arrayString = " ";
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				arrayString += a[row][col] + " ";
			}
			arrayString = arrayString.trim();
			if(row != a.length-1) {
				arrayString = arrayString + "\n";
			}
		}
		return arrayString;
	} 
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][]b = new int[a.length][a[0].length];
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++){
				b[row][col] = 0;
			}
		}
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				int sum = 0;
				int count = col;
				while((sum < sumToFind)&&(count < a[row].length)) {
					sum = sum + a[row][count];
					count++;
				}
				if(sum == sumToFind) {
					for(int i = col; i < count; i++) {
						b[row][i] = a[row][i];
					}
				}
			}
		}
		return b;
	}
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][]b = new int[a.length][a[0].length];
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				b[row][col] = 0;
			}
		}
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				int sum = 0;
				int count = row;
				while((sum < sumToFind)&&(count < a.length)) {
					sum = sum + a[count][col];
					count++;
				}
				if(sum == sumToFind) {
					for(int i = row; i < count; i++) {
						b[i][col] = a[i][col];
					}
				}
			}
		}
		return b;
	}
}
