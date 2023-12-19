/*
 * FindTheSums.java
 * Author:  Evan McKinney 
 * Submission Date:  11/18/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 	This class has three methods. The first method is arrayToString,
 * 	which has a 2D array as a parameter and returns a string that is
 * 	a readable format of that 2D array. The horizontalSums method has
 * 	a 2D array as a parameter and assumes it is rectangle and contains 
 * 	integers from 1-9 inclusive. It also takes an integer as a parameter
 * 	which is the desired sum. The method finds all horizontally adjacent 
 * 	values in the input array that equal the desired sum. The verticalSums
 * 	does the same thing but vertically.
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
		String output = "";
		for(int i = 0; i < a.length; i++) {
			//prints the first element of the row so there isn't an extra space
			if(a[i].length > 0) {
				output += a[i][0];
			}
			for(int j = 1; j < a[i].length; j++) {
				output += " " + a[i][j];
			}
			//makes sure there won't be an extra new line character
			if(i != a.length - 1) {
				output += "\n";
			}
		}
		return output;
	}
	
	//horizontalSums finds all horizontally adjacent values in a that sum to sumToFind
	//assumes that int[][] a will be a rectangle containing integers from 1-9 inclusive
	//returns a 2D array that contains all zeros except for the horizontal sums
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		int sum, start, end;
		
		//loops through each row
		for(int row = 0; row < a.length; row++) {
			sum = 0;
			//start and end are the indices that the loop is checking if they sum to sumToFind
			start = 0;
			end = 0;
			//start and end are initially at 0, if sum < sumToFind, then the next element in the row is added
			//to the sum and end is incremented. That keeps happening until either sum > sumToFind or 
			//sum == sumToFind. If sum == sumToFind, then the values from start to end are copied from 2D array a
			//into 2D array b and the value at the starting index is subtracted from sum and start is incremented
			//in order to look for other sums. If sum > sumToFind, then the value at the start index is subtracted 
			//and start is incremented. This continues until end == the last element index and sum <= sumToFind
			while(end != a[row].length || sum > sumToFind) {
				if(sum < sumToFind) {
					sum += a[row][end];
					end++;
				}else if(sum > sumToFind){
					sum -= a[row][start];
					start++;
				}
				if(sum == sumToFind) {
					for(int col = start; col < end; col++) {
						b[row][col] = a[row][col];
					}
					sum -= a[row][start];
					start++;
				}
			}
		}
		return b;
	}
	
	//verticalSums finds all vertically adjacent values in a that sum to sumToFind
	//assumes that int[][] a will be a rectangle containing integers from 1-9 inclusive
	//returns a 2D array that contains all zeros except for the vertical sums
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		int sum, start, end;
		
		//works the same as horizontalSums except it loops through the columns
		for(int col = 0; col < a[0].length; col++) {
			sum = 0;
			start = 0;
			end = 0;
			while(end != a.length || sum > sumToFind) {
				if(sum < sumToFind) {
					sum += a[end][col];
					end++;
				}else if(sum > sumToFind){
					sum -= a[start][col];
					start++;
				}
				if(sum == sumToFind) {
					for(int row = start; row < end; row++) {
						b[row][col] = a[row][col];
					}
					sum -= a[start][col];
					start++;
				}
			}
		}
		return b;
	}
}
