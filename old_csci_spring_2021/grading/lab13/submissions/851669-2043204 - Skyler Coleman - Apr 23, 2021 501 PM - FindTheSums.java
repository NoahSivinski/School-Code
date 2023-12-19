
// * [CSCI 1301].java
// * Author:  [Skyler Coleman] 
// * Submission Date:  [04/23/2021]
// *
// * Purpose: A program that creates a new array with the numbers that sum up to be a specific number both vertically and horizontally.
// *
// * Statement of Academic Honesty:
// *
// * The following code represents my own work. I have neither
// * received nor given inappropriate assistance. I have not copied
// * or modified code from any source other than the course webpage
// * or the course textbook. I recognize that any unauthorized
// * assistance or plagiarism will be handled in accordance with
// * the University of Georgia's Academic Honesty Policy and the
// * policies of this course. I recognize that my work is based
// * on an assignment created by the Department of Computer
// * Science at the University of Georgia. Any publishing 
// * or posting of source code for this assignment is strictly
// * prohibited unless you have written consent from the Department
// * of Computer Science at the University of Georgia.  
// */

public class FindTheSums {

	public static String arrayToString(int [][] a) {
	    
		String table = "";
		
			for (int i = 0; i < a.length; i++) {
				
			for (int j = 0; j < a[i].length; j++) {
				
				if (j != a[i].length - 1)
					table =  table + a[i][j] + " ";
				else
					table = table + a[i][j];
				}
			if (i != a.length -1)
				table = table + "\n";
			}
		return table;
		}
	
	public static int[][] horizontalSums (int[][] a, int sumToFind){

		int[][] b = new int [a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			
			int sum = 0;
			int pastSum = 0;
			int [][] pastArray = new int [b.length][b[0].length];;
			int count = 0;
			int pastCount = 0;
			
			for (int j = 0; j < a[i].length; j++) {
				sum = 0;
				count = 0;
				for (int k = 0; sum < sumToFind && (k + j) < a[i].length; k++) {
						
					sum = sum + a[i][j+k];
						count++;
					}
				
					if (sum == sumToFind && pastSum != sumToFind) {
						
						for(int h = 0; h < count && j + h < a[i].length; h++) {
							b[i][j + h] = a[i][j + h];
							pastArray[i][j+h] = b[i][j + h];
							}
						}
					
					else if(sum == sumToFind ) {
						
						for(int h = 0; h < ((count-pastCount)) && (pastCount + h -1) < a[i].length ; h++) {
							b[i][pastCount + h] = a[i][pastCount + h];
							pastArray[i][pastCount + h] = b[i][pastCount + h];
							}
						}
					else
						for(int h = 0; h < count; h++) {
							b[i][j + h] = 0;
							pastArray[i][j + h] = b[i][j+h];
							}
					
					if (sum == sumToFind) {
							
						int h = 0;
						
							
							for (int y = 0; y < a[i].length; y++) {
								
									
								int newSum = 0;
								
								newSum = sum + a[i][y];
								count++;
								
							if (newSum == sumToFind) {
								
								for(h = 0; h < count && h + count < a[i].length; h++) {
									b[i][count + h] = a[i][count + h];
									}
								}
							}
						
						j =  h + count -1;
					}
					
					
					if( count == a[i].length) {
						j = count -1;
					}
					
					pastSum = sum;
					pastCount = count;
		}
}
		return b;
	}

	public static int[][] verticalSums( int [][] a,int sumToFind){
int[][] b = new int [a.length][a[0].length];
		
		
		for (int i = 0; i < a.length; i++) {
			
			int sum = 0;
			int pastSum = 0;
			int [][] pastArray = new int [b.length][b[0].length];;
			int count = 0;
			int pastCount = 0;
			
			for (int j = 0; j < a.length; j++) {
				sum = 0;
				count = 0;
				for (int k = 0; sum < sumToFind && (k + j) < a.length; k++) {
						
					sum = sum + a[j+k][i];
						count++;
					}
				
					if (sum == sumToFind && pastSum != sumToFind) {
						
						for(int h = 0; h < count && j + h < a.length; h++) {
							b[j + h][i] = a[j + h][i];
							pastArray[j+h][i] = b[j + h][i];
							}
						}
					
					else if(sum == sumToFind ) {
						
						for(int h = 0; h < ((count-pastCount)) && (pastCount + h -1) < a.length ; h++) {
							b[pastCount + h][i] = a[pastCount + h][i];
							pastArray[pastCount + h][i] = b[pastCount + h][i];
							}
						}
					else
						for(int h = 0; h < count; h++) {
							b[j + h][i] = 0;
							pastArray[j + h][i] = b[j+h][i];
			
						}
					
					if (sum == sumToFind) {
							
						int h = 0;
						
						if (count <= j) {
							
							for (int y = 0; y < a.length; y++) {
								
									
								int newSum = 0;
								
								newSum = sum + a[y][i];
								count++;
								
							if (newSum == sumToFind) {
								
								for(h = 0; h < count && h + count < a.length; h++) {
									b[count + h] [i]= a[count + h][i];
									}
								}
							}
						}
						
						else for (int y = 0; y < a.length; y++) {
							
							
							int newSum = 0;
							
							newSum = sum + a[y][i];
							count++;
							
						if (newSum == sumToFind) {
							
							for(h = 0; h < count && h + count < a.length; h++) {
								b[i][count + h] = a[i][count + h];
								}
							}
						}
						
						j =  h + count -1;
						}
					
					
					if( count == a.length) {
						j = count -1;
					}
					
					pastSum = sum;
					pastCount = count;
					}
			}

		return b;
		}
	}
