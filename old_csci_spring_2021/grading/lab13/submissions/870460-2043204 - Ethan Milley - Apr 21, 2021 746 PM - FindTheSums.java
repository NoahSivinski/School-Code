/*
 * DrawingShapes.java
 * Author:  Ethan Milley 
 * Submission Date:  4/21/21
 *
 * Purpose: The purpose of this class is to create a 
 * "Number Search" table based off a user given 2D array and
 * find the horizontal and vertical sums of the array that equal
 * a user given number. It does this using a variety of static
 * methods that use a variety of loops and if statements.  
 * However this class is limited to only horizontal and vertical
 * sums and can not find answers for an actual "Word Search".
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

	public static String arrayToString(int[][] a) {//Creates a String version of the 2D array 
		String arrayString = "";
		
		for (int i = 0; (i < a.length); i++) {
			
			for (int j = 0; (j < a[i].length); j++) {	
				
				if(j < a[i].length - 1) {
					arrayString += (a[i][j] + " ");	
				}
				else {
					arrayString += a[i][j];
				}
			}
			if (i < (a.length - 1)) {
				arrayString += "\n";
			}
		}
		
		return arrayString;
	}
	
	public static int[][] horizontalSums (int[][] a, int sumToFind) {//Creates a 2D array that holds all the horizontal sums
		
		int[][] b = new int[a.length][a[0].length];
		
		for (int y = 0; (y < b.length); y++) {//Sets all values in the b array to 0
			
			for (int x = 0; (x < b[y].length); x++) {
				b[y][x] = 0;
			}
		}
		
		
		for (int y = 0; (y < b.length); y++) {//Finds the sums
			
			int start = 0;//The starting point for finding the sums 
			boolean run = true;//Used to help control the loops
			
			while ((run) && (start < b[y].length)) {
				
				int sum = 0;
				
				for (int x = 0; ((x + start) < b[y].length) && (sum < sumToFind ) && (sum != sumToFind); x++) {
					sum += a[y][x + start];
					
					if (sum == sumToFind) {
						
						for (int i = 0; (i <= x); i++) {//Sets values that create the desired sum into b array
							
							b[y][(x + start) - i] = a[y][(x + start) - i];
						}
						
						start++;
					}
					
					else if (sum > sumToFind) {
						start++;
					}
					else if ((sum < sumToFind) && ((x + start) == b[y].length - 1)) {//Ends the loop if all the values in the row are less than the desired sum
						run = false;
					}
				}
			}	
		}
		
		return b;
	}
	
	public static int[][] verticalSums (int[][] a, int sumToFind) {////Creates a 2D array that holds all the horizontal sums
		
		int[][] b = new int[a.length][a[0].length];
		
		for (int y = 0; (y < b.length); y++) {//Sets all values in the b array to 0 
			
			for (int x = 0; (x < b[y].length); x++) {
				b[y][x] = 0;
			}
		}
		
		
		for (int x = 0; (x < b[0].length); x++) {//Finds the sums
			
			int start = 0;//The starting point for finding the sums 
			boolean run = true;//Used to help control the loops
			
			while ((run) && (start < b.length)) {
				
				int sum = 0;
				
				for (int y = 0; ((y + start) < b.length) && (sum < sumToFind ) && (sum != sumToFind); y++) {
					sum += a[y + start][x];
					
					if (sum == sumToFind) {
						
						for (int i = 0; (i <= y); i++) {//Sets values that create the desired sum into b array
							
							b[(y + start) - i][x] = a[(y + start) - i][x];
						}
						
						start++;
					}
					
					else if (sum > sumToFind) {
						start++;
					}
					else if ((sum < sumToFind) && ((y + start) == b.length - 1)) {//Ends the loop if all the values in the columns are less than the desired sum
						run = false;
					}
				}
			}	
		}
		
		return b;
	}
}
