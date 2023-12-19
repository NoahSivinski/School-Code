/*
 * [ParseTheTweet].java
 * Author:  [Cindy Nguyen] 
 * Submission Date:  02/12/2021
 *
 * Purpose: The purpose of this program is to use prior material (variables, assignments, expressions, etc) 
 * learned from the previous lessons in order to be able to write an application that
 * uses the String method to read tweets.
 *
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
 * 
 * Agree C.N.
 */
import java.util.Scanner;
public class ParseTheTweet {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String tweet = input.nextLine();

		String typValue;
		String detValue;
		String locValue;
		String latValue;
		String lngValue;

		String start = "#typ";
		String finish = ";";
		int startNum = tweet.indexOf(start);
		int finishNum = tweet.indexOf(finish);
		typValue = tweet.substring(startNum + 4, finishNum);

		String tweet2 = tweet.substring(finishNum + 1);
		String start2 = "#det";
		String finish2 = ";";
		int startNum2 = tweet2.indexOf(start2);
		int finishNum2 = tweet2.indexOf(finish2);
		detValue = tweet2.substring(startNum2 + 4, finishNum2);

		String tweet3 = tweet2.substring(finishNum2 + 1);
		String start3 = "#loc";
		String finish3 = ";";
		int startNum3 = tweet3.indexOf(start3);
		int finishNum3 = tweet3.indexOf(finish3);
		locValue = tweet3.substring(startNum3 + 4, finishNum3);

		String tweet4 = tweet3.substring(finishNum3 + 1);
		String start4 = "#lat";
		String finish4 = ";";
		int startNum4 = tweet4.indexOf(start4);
		int finishNum4 = tweet4.indexOf(finish4);
		latValue = tweet4.substring(startNum4 + 4, finishNum4);

		String tweet5 = tweet4.substring(finishNum4 + 1);
		String start5 = "#lng";
		String finish5 = ";";
		int startNum5 = tweet5.indexOf(start5);
		int finishNum5 = tweet5.indexOf(finish5);
		lngValue = tweet5.substring(startNum5 + 4, finishNum5);


		System.out.println("Type:           " + typValue.toUpperCase());
		System.out.println("Detail:         " + detValue.replace(',','-'));
		System.out.println("Location:       " + locValue.replace(',','-'));
		System.out.println("Latitude:       " + latValue);
		System.out.println("Longitude:      " + lngValue);

		input.close();

	}

}
