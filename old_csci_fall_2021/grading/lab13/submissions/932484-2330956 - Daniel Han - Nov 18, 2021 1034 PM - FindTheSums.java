/*
 * [FindTheSums].java
 * Author:  [Daniel Han] 
 * Submission Date:  [11/18/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The program will has three methods. The first is the toString method which will return a string of a 2D array.
 * The next two methods are the horizontalSums and the verticalSums method which both require a 2D int array and an int sum total that the values need to add up to.
 * The horizontalSums and verticalSums method both return 2D int arrays that have arrays with 0s except for the values that add up to the sum total.
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


	//toString method that will return a neat string representation
	public static String arrayToString(int[][] a) {
		//creates the string that will be returned
		String returnString = "";
		//uses a for loop to add the int values from a to returnString
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a[i].length-1; j++) {
				//adds the int character a to the string returnString
				returnString += a[i][j] + " ";
			}
			//adds the last element in the inner array
			returnString += a[i][a[i].length-1];
			//then adds a new line tab to the end of each line
			returnString += "\n";
		}
		//uses a for loop to add the last inner array
		for (int i = 0; i < a[a.length-1].length - 1; i++) {
			//adds the int element to the returnString
			returnString += a[a.length-1][i] + " ";
		}
		//adds the last element in the array to the returnString
		returnString += a[a.length-1][a[a.length-1].length-1];
		//returns the string
		return returnString;
	}

	//method horizontalSum which will return an int array
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		//creates an int 2D array b that has the same dimensions of a
		int[][] b = new int[a.length][a[0].length];
		//creates a boolean 2D array that will determine if a[i][j] should be 0 or its original value
		boolean[][] noChange = new boolean[a.length][a[0].length];
		//creates a counter variable that will store the sums and a counter variable that will store the start location of the chain
		int counter = 0; int start = 0;

		//nested for loop code to see if the numbers are part of a sum or not
		for(int i = 0; i < a.length; i++) {
			//will reset the value of counter back to zero and will reset start back to zero
			start = 0;
			counter = 0;
			for(int j = 0; start < a[i].length && j + start < a[i].length; j++) {
				//adds the a[i][start + j] variable to the counter
				counter += a[i][start + j];
				//if the counter goes over sumToFind, then it will increment the start location and start from the start location
				if(counter > sumToFind) {
					start++;
					//default value is already false, so don't need to set it in the array
					//resets the counter to zero and j to -1
					counter = 0;
					j = -1;
				}
				//else if the counter == sumToFind, then it will set the values in noChange array to true
				else if (counter == sumToFind) {
					//uses a for loop to set the values in the noChange array to true
					for(int z = 0; z <= j; z++) {
						noChange[i][z+start] = true;
					}
					//resets counter to 0 and j to -1 and increments start
					counter = 0;
					j = -1;
					start++;
				}
				//else means if the counter is less than zero
				else {
					//if j + counter is the last index in the array, then it cannot set all the remaining values in the inner array of the noChange array to true
					if(j + start == a[i].length -1) {
						//does nothing because the default value in the noChange array is false
						//then it sets j to be equal to a[i].length
						j = a[i].length;
					}
					//else, then it will continue counter and continue on
					
				}

			}

		}

		//nested for loop to assign the values in array b
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				//if noChange[i][j] is true, then it will set b[i][j] to a[i][j], else it will set b[i][j] to 0
				if(noChange[i][j]) {
					b[i][j] = a[i][j];
				}
				else {
					b[i][j] = 0;
				}
			}
		}

		//will return the array b
		return b;
	}


	//method to return the vertical sums
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		//creates a 2D array b of the same length as a
		int[][] b = new int[a.length][a[0].length];
		//creates a boolean array that will determine if the array b will gain values or 0
		boolean[][] noChange = new boolean[a.length][a[0].length];
		//creates a counter and a start variable
		int counter = 0; int start = 0;


		//nested for loop to see if the numbers are a sum or not
		//nested for loop code to see if the numbers are part of a sum or not
		for(int i = 0; i < a[0].length; i++) {
			//will reset the value of counter back to zero and start back to zero
			start = 0;
			counter = 0;
			for(int j = 0; start < a.length && j + start < a.length; j++) {
				//adds the a[i][start + j] variable to the counter
				counter += a[start+j][i];
				//if the counter goes over sumToFind, then it will increment the start location and start from the start location
				if(counter > sumToFind) {
					start++;
					//default value is already false, so don't need to set it in the array
					//resets the counter to zero and j to -1
					counter = 0;
					j = -1;
				}
				//else if the counter == sumToFind, then it will set the values in noChange array to true
				else if (counter == sumToFind) {
					//uses a for loop to set the values in the noChange array to true
					for(int z = 0; z <= j; z++) {
						noChange[z+start][i] = true;
					}
					//resets counter to 0 and j to -1 and increments start
					counter = 0;
					j = -1;
					start++;
				}
				//else means if the counter is less than zero
				else {
					//if j + counter is the last index in the array, then it cannot set all the remaining values in the inner array of the noChange array to true
					if(j + start == a.length -1) {
						//does nothing because the default value in the noChange array is false
						//then it sets j to be equal to a[i].length -1
						j = a.length;
					}
					//else, then it will continue counter and continue on
				}

			}

			
		}
		//nested for loop to assign the values in array b
				for(int i = 0; i < a.length; i++) {
					for(int j = 0; j < a[i].length; j++) {
						//if noChange[i][j] is true, then it will set b[i][j] to a[i][j], else it will set b[i][j] to 0
						if(noChange[i][j]) {
							b[i][j] = a[i][j];
						}
						else {
							b[i][j] = 0;
						}
					}
				}

				//will return the array b
				return b;

	}
}
