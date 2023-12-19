/*
 * [FindTheSums.java]
 * Author:  [Austin Perales] 
 * Submission Date:  [4/19/2021]
 *
 * This program does the following: 
 * FindTheSums.java is a program that has three methods to use on a 2D array. The first method is arrayToString, which takes
 * the 2D array and creates it into a string that can be displayed for the user to see. The second method is horizontalSums, which
 * receives an array and an int, sumToFind, as a parameter. This method displays all the values in a horizontal row that add up to
 * the value sumToFind, and displays them in an array the size of a. If there are no numbers that add up to sumToFind, then a 0 is
 * displayed. The final method, verticalSums, does the same process as horizontalSums, except vertically. If there is a column that
 * adds up to the number sumToFind, then they are displayed, otherwise, a 0 is displayed.
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
	
	//toString method that displays the array as a string to be printed and viewed by the user
	public static String arrayToString(int[][] a) {
		String arrayString = "";
		
		//nested loop to go through the entire 2D array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				//checks for length to see if a " " is needed after a number
				if (j != a[i].length - 1) {
					arrayString = arrayString + a[i][j] + " ";
				}
				else {
					arrayString = arrayString + a[i][j];
				}
			}
			//checks to see if the row is finished and a new line is needed
			if (i != a.length - 1) {
				arrayString = arrayString + "\n";
			}
		}
		return arrayString;
	}
	
	//method that displays a 2D array showing the numbers that equal a horizontal sum of the int sumToFind. If there is not a
	//sequence of numbers that equals sumToFind, then a 0 is displayed
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		
		//declaring new array b with dimensions of a
		int[][] b = new int[a.length][a[0].length];
		int sum = 0;

		//nested loop that goes through the whole array
		for (int row = 0; row < a.length; row++) {
			for (int i = 0; i < a[row].length; i++) {
				sum = 0;
				
				//third for loop that goes through the row a second time to check for summation
				for (int col = i; col < a[row].length; col++) {
					//sum equations that adds up  numbers
					sum += a[row][col];
					
					//if the sum equals sumToFind, then those numbers are transfered to b using a for loop
					if (sumToFind == sum) {
						for (int j = i; j < col + 1; j++) {
							b[row][j] = a[row][j];
						}
					}
				}
			}
		}
		return b;
	}
	
	//method that displays a 2D array showing the numbers that equal a vertical sum of the int sumToFind. If there is not a
	//sequence of numbers that equals sumToFind, then a 0 is displayed
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		
		//declaring new array b with dimensions of a
		int[][] b = new int[a.length][a[0].length];
		int sum = 0;

		//nested loop that goes through the whole array
		for (int col = 0; col < a[0].length; col++) {
			for (int i = 0; i < a.length; i++) {
				sum = 0;
				
				//third for loop that goes through the column a second time to check for summation
				for (int row = i; row < a.length; row++) {
					//sum equations that adds up  numbers
					sum += a[row][col];
					
					//if the sum equals sumToFind, then those numbers are transfered to b using a for loop
					if (sumToFind == sum) {
						for (int j = i; j < row + 1; j++) {
							b[j][col] = a[j][col];
						}
					}
				}
			}
		}
		return b;
	}
}