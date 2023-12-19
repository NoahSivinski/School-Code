/*
 * FindTheSums.java
 * Author:  Brianna Tiglao
 * Submission Date: April 22, 2021
 *
 * Purpose: The purpose of this program is to find horizontal and vertical sums
 * within a 2D input array of integers that equal an input integer value.
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
	
	public static String arrayToString (int[][] a) {
		String output = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				output += a[i][j];
				if (j < a[i].length - 1) {
					output += " ";
				}
			}
			if (i < a.length - 1) {
				output += "\n";
			}
		}
		return output;
	}
	
	public static int[][] horizontalSums (int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		//tells computer to look at 'i'th stored array
		for (int i = 0; i < a.length; i++) {
			//tells computer to look at 'j'th index within 'i'th stored array
			for(int j = 0; j < a[i].length; j++) {
				int indexCountVal = 0;
				//tells computer to take 'j'th value and adds each consecutive k value until the target value is reached
				for (int k = j; k < a[i].length; k++) {
					indexCountVal = indexCountVal + a[i][k];
					//once the indexCountVal reaches the target number the numbers that were added will individually be added to the b array
					if (indexCountVal == sumToFind) {
						for (int l = j; l <= k; l++) {
							b[i][l] = a[i][l];
						}
					}
				}
			}
		}
		return b;
	}
	
	public static int[][] verticalSums (int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a[0].length; i++) {
			for(int j = 0; j < a.length; j++) {
				int indexCountVal = 0;
				for (int k = j; k < a.length; k++) {
					indexCountVal = indexCountVal + a[k][i];
					if (indexCountVal == sumToFind) {
						for (int l = j; l <= k; l++) {
							b[l][i] = a[l][i];
						}
					}
				}
			}
		}
		return b;
	}
}
