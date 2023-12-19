/**
 * 
 */

/**
 * @author Hriddhiman Dey
 *
 */
/*
 * [ParseTheTweet].java
 * Author:  [Hriddhiman Dey] 
 * Submission Date:  [2/12/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * The program takes information from the tweet, manipulates it, and prints
 * it out to the screen. The user simply has to insert the tweet and the
 * program separates the text within the tweet in categories such as
 * type, detail, location, and latitude. 
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a tweet below");
		String twt = keyboard.nextLine();



		//variable
		int start = 0;
		int finish = twt.indexOf(";");

		//type
		String type = (twt.substring(start+5,finish)).trim();
		type = type.toUpperCase();
		twt=twt.substring(finish+1);
		start = 0;
		finish=twt.indexOf(";");

		//detail
		String detail=(twt.substring(start+5, finish)).trim();
		detail=detail.replaceAll(",","-");
		twt=twt.substring(finish+1);
		finish=twt.indexOf(";");

		//location
		String location=(twt.substring(start+5, finish)).trim();
		location=location.replaceAll(",","-");
		twt=twt.substring(finish+1);
		finish=twt.indexOf(";");

		//latitude
		String latitude=(twt.substring(start+5, finish)).trim();
		twt=twt.substring(finish+1);
		finish=twt.indexOf(";");

		//longitude
		String longitude=(twt.substring(start+5, finish)).trim();



		System.out.println("Type:\t\t"+type);
		System.out.println("Detail:\t\t"+detail);
		System.out.println("Location:\t"+location);
		System.out.println("Latitude:\t"+latitude);
		System.out.println("Longitude:\t"+longitude);


		keyboard.close();


	}

}
