/* FindTheSums.java
 * Author: Madison Bardwell 
 * Submission Date: 4/22/21
 *
 * Purpose: This lab acts like a word search and will help with my understanding of 2D arrays, nested loops, nested statements, static methods, and problem decomposition. 
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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FindTheSums {
public static void main(String[] args) throws FileNotFoundException {
  
//creating object for Scanner class
Scanner scan = new Scanner(System.in);
int row, column ,sumToFind;
  
//reading number of rows, number of columns and sum to find
System.out.print("Number of Rows : ");
row = scan.nextInt();
System.out.print("Number of Columns :");
column = scan.nextInt();
System.out.print("Sum to find :");
sumToFind = scan.nextInt();
int[][] array = new int[row][column];

//to read 2d array from a .txt file
Scanner sc = new Scanner(new BufferedReader(new FileReader("array.txt")));
while(sc.hasNextLine()) {
for (int i=0; i<array.length; i++) {
String[] line = sc.nextLine().trim().split(" ");
for (int j=0; j<line.length; j++) {
array[i][j] = Integer.parseInt(line[j]);
}
}

}
  
  
int[][] n_arr;
System.out.println("Array returned by horizontalSums() method and print by arrayToString() method.");
n_arr = horizontalSums(array,sumToFind);
System.out.println(arrayToString(n_arr));
  
System.out.println("Array returned by verticalSums() method and print by arrayToString() method.");
n_arr = verticalSums(array,sumToFind);
System.out.println(arrayToString(n_arr));
}
  

public static int[][] horizontalSums(int[][] a,int sumToFind){
//creating new array with the number of rows and columns same as the given array and initializing them to 0
int[][] h_sum = new int[a.length][a[0].length];
for(int i=0 ; i<a.length ; i++){
for(int j=0 ; j<a[0].length ; j++){
h_sum[i][j] = 0;
}
}
int sum;   


for(int i=0 ; i<a.length ; i++){
for(int j=0 ; j<a[0].length ; j++){
sum = 0;
for(int k=j ; k<a[0].length ; k++){

sum += a[i][k];
//if the sub sequence's sum is equal to sumToFind
if(sum ==sumToFind){
//then assign the values from the array a[i][l] to n_arr[i][l]
for(int l=j ; l<=k ; l++){
h_sum[i][l] = a[i][l];
}
k = a[0].length;
}
}
}
}
return h_sum;
}
//***********************************************************************************************************//
//verticalSums() - accepts a 2d array and an integer value
//returns a 2d array
public static int[][] verticalSums(int[][] a,int sumToFind){
//creating new array with the number of rows and columns same as the given array and initializing them to 0
int[][] v_sum = new int[a.length][a[0].length];
for(int i=0 ; i<a.length ; i++){
for(int j=0 ; j<a[0].length ; j++){
v_sum[i][j] = 0;
}
}
int sum;
//checking all the sub sequence of all the columns(vertical) of the 2d array .
//if a sub sequence's sum is equal to the required sum, then the new array with the matching
//sub sequence will be assigned with the values from the recieved array
for(int i=0 ; i<a[0].length ; i++){
for(int j=0 ; j<a.length ; j++){
sum = 0;
for(int k=j ; k<a.length ; k++){
//checking all the sub sequence's sum
sum += a[k][i];
//if the sub sequence's sum is equal to sumToFind
if(sum ==sumToFind){
//then assign the values from the array a[l][i] to n_arr[l][i]
for(int l=j ; l<=k ; l++){
v_sum[l][i] = a[l][i];
}
k = a.length;
}
}
}
}
return v_sum;
}


public static String arrayToString(int a[][]){
int row = a.length;
int column = a[0].length;
String string_array = "";
for(int i=0 ; i<row ; i++){
for(int j=0 ; j<column ; j++){
string_array += a[i][j]+" ";
}
string_array += "\n";
}
return string_array;
}

}
