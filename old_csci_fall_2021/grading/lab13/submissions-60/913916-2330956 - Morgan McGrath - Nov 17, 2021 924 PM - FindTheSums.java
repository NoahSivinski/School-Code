/*
 * FindTheSums.java
 * Author:  Morgan McGrath 
 * Submission Date:  11/17/2021
 *
 * Purpose: This program implements 3 methods: arrayToString, horizontalSums, and verticalSums.
 * arrayToString returns the String representation of an integer array. horizontalSums and verticalSums return arrays with sums in rows that 
 *add up to sumToFind and sums in columns that add up to sumToFind respectively.
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
	/*
	 * This method will return a String that is a neat representation of the values in a
	 */
	public static String arrayToString(int[][] a) {
		String array="";
		//go through every row and add all its values to array plus a space
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length-1; j++) {
				array+=a[i][j]+" ";
			}
			//if it is the last row, don't add a new line character
			//if it is not the last row, add a new line character
			if(i==a.length-1) {
				array+=a[i][a[i].length-1];
			}
			else {
				array+=a[i][a[i].length-1]+"\n";
			}
			
		}
		return array;
	}
	/*
	 * This method will return an array with sums in rows that add up to sumToFind
	 */
	
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		//create new array
		int[][] b=new int[a.length][a[0].length];
		//create sum variable
		int sum;
		//create and initialize index variable
		int index=0;
		//for loops to go through every element in each row in the 2D array
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				//initialize sum
				sum=0;
				//create variable assigned to j to use to make sure j doesn't change
				int j2=j;
				//initialize the starting index to j
				index=j;
				//loop while the sum isn't the sum to find and the index is less than the length
				while(sum!=sumToFind && index<a[i].length) {
					//add the current element and elements next to it in its row to sum
					sum+=a[i][index];
					//increment index by one each time you go through loop
					index++;
				}
				//if the sum = sumToFind, then go through each element in a from j to 1 less than index
				//(since you increment by one after adding the element to the sum) and change b's value 
				//at those same positions to the values in a
				//otherwise, the elements in b are initialized to 0 as default
				if(sum==sumToFind) {
					for(int k=j2; k<index; k++) {
						b[i][k]=a[i][k];
					}
				}
			}
		}
		//return the horizontalSum array 
		return b;
	}
	/*
	 * This method will return an array with sums in columns that add up to sumToFind 
	 */
	public static int[][] verticalSums(int[][] a, int sumToFind){
		//create new array
		int[][] b=new int[a.length][a[0].length];
		//create sum variable
		int sum;
		//create and initialize index variable
		int index=0;
		//for loops to go through every element in each column in the 2D array
		for(int i=0; i<a[0].length; i++) {
			for(int j=0; j<a.length; j++) {
				//initialize sum
				sum=0;
				//create variable assigned to j to use to make sure j doesn't change
				int j2=j;
				//initialize the starting index to j
				index=j;
				//loop while the sum isn't the sum to find and the index is less than the length
				while(sum!=sumToFind && index<a.length) {
					//add the current element and elements next to it in its column to sum
					sum+=a[index][i];
					//increment index by one each time you go through loop
					index++;
				}
				//if the sum = sumToFind, then go through each element in a from j to 1 less than index
				//(since you increment by one after adding the element to the sum) and change b's value 
				//at those same positions to the values in a
				//otherwise, the elements in b are initialized to 0 as default
				if(sum==sumToFind) {
					for(int k=j2; k<index; k++) {
						b[k][i]=a[k][i];
					}
				}
			}
		}
		//return the verticalSum array
		return b;
	}
	

}
