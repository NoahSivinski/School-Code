/*/
 * FindTheSums.java
 * Author:  Jimmy Breathnach 
 * Submission Date:  11/19/2021
 *
 * Purpose: The purpose of this program is to add up numbers to a certain sum in the format of a word search.
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
	//to string code
	public static String arrayToString(int[][] a) {
		//starts the output as nothing
		String output ="";
		//runs a loop for the lines of the array except the final one.
		for(int i =0; i<a.length-1; i++) {
			for(int j =0; j<a[i].length -1; j++) {
				output += a[i][j] + " ";
			}
			output += a[i][a[i].length-1] + "\n";
		}
		//the finalRow and Column get the number of the final spot in the array.
		int finalRow=a.length-1;
		int finalColumn=a[finalRow].length-1;
		//the last line is put in a loop so there is no end new line
		for(int j =0; j<a[finalRow].length -1; j++) {
			output += a[finalRow][j] + " ";
		}
		//the last va;ue is added to the string
		output += a[finalRow][finalColumn];
		return output;
	}

	//horizontal sums code
	public static int[][] horizontalSums(int [][] a, int sumToFind){
		//a blank array is set up.
		int [][] b= new int [a.length][];
		for(int i = 0; i<a.length; i++) {
			b [i] = new int [a[i].length];
		}
		//the counter is started. i is the row value, k is the value of the next usable starting point,
		//and l is the value for the number of number which were added to get get the make the 
		for (int i =0,k=0,l=0; i<a.length; i++) {
			int sum=0;
			l=0;
			k=0;
			//j is used as the row value
			for(int j =0; j<a[i].length; j++) {
				sum += a[i][j];
				l++;
				//if the sum is larger than it resets
				if (sum>sumToFind) {
					j=k;
					k++;
					sum=0;
					l=0;
				}
				//if the sum is equal then it makes the puts the values into array b.
				else if (sum == sumToFind) {
					for(int m=0; m<l; m++) {
						b[i][k+m]=a[i][k+m];

					}
					j=k;
					k++;
					sum=0;
					l=0;
				}
			}
		}
		return b;
	}
	//vertical sums 
	public static int[][] verticalSums(int [][] a, int sumToFind){
		int [][] b= new int [a.length][];
		int lines=0;
		for(int i = 0; i<a.length; i++) {
			b [i] = new int [a[i].length];
			//counts the number of lines
			lines++;
		}
		//same as before except q is used to count the number of lines.
		for (int i =0,k=0,l=0,q=0; i<a[q].length && q< lines-1; i++, q++) {
			int sum=0;
			l=0;
			k=0;
			//adds the column values
			for(int j =0; j<a.length; j++) {
				sum += a[j][i];
				l++;
				//does the same process as before
				if (sum>sumToFind) {
					j=k;
					k++;
					sum=0;
					l=0;
				}
				else if (sum == sumToFind) {
					for(int m=0; m<l; m++) {
						b[k+m][i]=a[k+m][i];
						
					}
					j=k;
					k++;
					sum=0;
					l=0;
				}
			
			}
		}
		return b;
	}

}
