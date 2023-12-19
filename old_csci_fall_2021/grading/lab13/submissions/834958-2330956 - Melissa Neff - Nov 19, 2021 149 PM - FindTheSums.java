/*
 * FindTheSums.java
 * Author:  Melissa Neff 
 * Submission Date:  11/19/2021
 *
 * Purpose: The purpose of the program is to find horizontal and 
 * vertical sums in a given 2D array. It works similarly to a word
 * search puzzle, except with finding sums instead of words.
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
	//The following code returns the string of the 2D array:
	public static String arrayToString(int[][] a) {
		String result = "";
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(j == a[i].length - 1)
					result += a[i][j];
				else
					result += a[i][j] + " ";
			}
			if(i != a.length - 1)
				result += "\n";
		}
		return result;
	}
	//The following code is used to find the horizontal sums:
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		//The following code creates the b array:
		int[][] b = new int[a.length][a[0].length];
		for(int i = 0; i < b.length; i++) 
			for(int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		//The following code searches for the sums:
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					int sum = 0, tracker = 0;
					for(int k = j; k < a[0].length; k++) {
						if(sum < sumToFind) {
							sum += a[i][k];
							tracker ++;
						}
					}
					//The following code updates the b array, if the sum is found:
					if (sum == sumToFind) {
						for(int k = 0; k < tracker; k++)
							b[i][j + k] = a[i][j + k];
					}
				}
			}
			return b;
			
		}
		
	//The following code is used to find the vertical sums:
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		//The following code creates the b array:
		int [][] b = new int[a.length][a[0].length];
		for(int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		//The following code searches for sums:
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				int sum = 0, tracker = 0;
				for (int k = j; k < a.length; k++) {
					if (sum < sumToFind) {
						sum += a[k][i];
						tracker ++;
					}
				}
				//The following code updates the b array, if the sum is found:
				if (sum == sumToFind) {
					for (int k = 0; k < tracker; k++)
						b[j + k][i] = a[j + k][i];
				}
			
			}
		}
		return b;
	}
	

}
