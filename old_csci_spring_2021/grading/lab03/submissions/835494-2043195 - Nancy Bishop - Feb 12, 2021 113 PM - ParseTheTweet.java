/*
 * ParseTheTweet.java
 * Author:  Nancy Bishop 
 * Submission Date:  Feb 12,2021
 *
 * Purpose: The purpose of the program is to process tweets similar to TtT and to pull information from them and then manipulate them and print out information from them.
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
	import java.util.Scanner;
	
	public class ParseTheTweet {

		public static void main(String[] args) {

			Scanner keyboard=new Scanner(System.in);

			System.out.println("Enter a tweet below");

			String tweet=keyboard.nextLine();
			int start=0;
			int finish=tweet.indexOf(";");

			String typ=(tweet.substring(start+5, finish)).trim();
			typ=typ.toUpperCase();
			tweet=tweet.substring(finish+1);
			start=0;
			finish=tweet.indexOf(";");

			String det=(tweet.substring(start+5, finish)).trim();
			det=det.replaceAll(",","-");
			tweet=tweet.substring(finish+1);
			finish=tweet.indexOf(";");

			String loc=(tweet.substring(start+5, finish)).trim();
			loc=loc.replaceAll(",","-");
			tweet=tweet.substring(finish+1);
			finish=tweet.indexOf(";");

			String lat=(tweet.substring(start+5, finish)).trim();
			tweet=tweet.substring(finish+1);
			finish=tweet.indexOf(";");

			String lng=(tweet.substring(start+5, finish)).trim();

			System.out.printf("%-25s%s\n%-25s%s\n%-25s%s\n%-25s%s\n%-25s%s\n","Type:",typ,"Detail:",det,"Location:",loc,
					"Latitude:",lat,"Longitude:",lng);
			keyboard.close();
		}
	}