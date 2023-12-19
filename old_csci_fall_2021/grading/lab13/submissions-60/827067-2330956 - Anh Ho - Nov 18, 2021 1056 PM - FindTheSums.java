/*
 * FindTheSums.java
 * Author:  Anh Ho 
 * Submission Date:  11/18/2021
 *
 * Purpose: Word Search
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

public class FindTheSums {
	public static String arrayToString(int[][] a) {
		String result = "";
		for (int i=0;i<a.length-1;i++) {
			for (int j=0;j<a[0].length-1;j++) {
				result += a[i][j] + " ";
			}
			result += a[i][a[0].length-1]+ "\n";
		}
		for (int i=0;i<a[0].length-1;i++) {
			result += a[a.length-1][i] + " ";
		}
		result += a[a.length-1][a[0].length-1];
		
		return result;
	}
	
	//find horizontal sum
	public static int[][] horizontalSums (int[][] a, int sumToFind) {
		int[][] result = new int[a.length][a[0].length];
		for(int i=0 ; i<a.length ; i++){
			for(int j=0 ; j<a[0].length ; j++){
				result[i][j] = 0;
			}
		}
		int sum;   
		//checking all the sub sequence of all the rows(horizontal) of the 2d array .
		//if a sub sequence's sum is equal to the required sum, then the new array with the matching
		//sub sequence will be assigned with the values from the received array
		for(int i=0 ; i<a.length ; i++){
			for(int j=0 ; j<a[0].length ; j++){
				sum = 0;
				for(int k=j ; k<a[0].length ; k++){
					//checking all the sub sequence's sum
					sum += a[i][k];
					//if the sub sequence's sum is equal to sumToFind
					if(sum == sumToFind){
						//then assign the values from the array a[i][l] to result[i][l]
						for(int l=j ; l<=k ; l++){
							result[i][l] = a[i][l];
						}
						k = a[0].length;
					}
				}
			}
		}
		return result;
	}
	
	//find vertical sums
	public static int[][] verticalSums(int [][] a, int sumToFind) {
		int[][] result = new int[a.length][a[0].length];
		for(int i=0 ; i<a.length ; i++){
			for(int j=0 ; j<a[0].length ; j++){
				result[i][j] = 0;
			}
		}
		int sum;
		//checking all the sub sequence of all the columns(vertical) of the 2d array .
		//if a sub sequence's sum is equal to the required sum, then the new array with the matching
		//sub sequence will be assigned with the values from the received array
		for(int i=0 ; i<a[0].length ; i++){
			for(int j=0 ; j<a.length ; j++){
				sum = 0;
				for(int k=j ; k<a.length ; k++){
					//checking all the sub sequence's sum
					sum += a[k][i];
					//if the sub sequence's sum is equal to sumToFind
					if(sum == sumToFind){
						//then assign the values from the array a[l][i] to result[l][i]
						for(int l=j ; l<=k ; l++){
							result[l][i] = a[l][i];
						}
						k = a.length;
					}
				}
			}
		}
		return result;
	}
}
