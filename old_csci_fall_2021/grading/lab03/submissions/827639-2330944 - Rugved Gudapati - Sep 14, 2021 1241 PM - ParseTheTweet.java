/*
 * ParseTheTweet.java
 * Author:  Rugved Gudapati
 * Submission Date:  09/17/21
 *
 * Purpose: To process messages similar to TtT tweets using 
 * substring and other methods in order to obtain information 
 * from the text, manipulate it, and produce output onto the screen.
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

//Imports scanner class used to obtain user input
import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		
		//Prompts for and obtains the tweet inputed by the user.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a tweet below");
		String originalTweet = keyboard.nextLine();
		keyboard.close();
		
		//Removes white space from the string to make it easier to work with.
		String trimmedTweet = originalTweet.trim();
		
		
		
		//Starting position for all of the data will be 6. 
		int start = 6;
		
		//Finds ending position of #typ data by indexing for the first ';'.
		int finish = trimmedTweet.indexOf(";");
		
		//Assigns the substring of #typ data to the variable rawTyp.
		String rawTyp = trimmedTweet.substring(start, finish);
		
		//Converts all of rawTyp to upper case for correct formatting and assigns it to typ variable.
		String typ = rawTyp.toUpperCase();
		
		/*Discards the #typ part of the trimmed tweet by creating a substring from the start of the #det 
		 *part to the end of the trimmed string. Updates the trimmed string.
		 */
		trimmedTweet = trimmedTweet.substring(finish += 1);
		
		
		
		//Finds ending position of #det data by indexing for the first ';'.
		finish = trimmedTweet.indexOf(";");
	
		//Assigns the substring of #det data to the variable rawDet.
		String rawDet = trimmedTweet.substring(start, finish);
				
		//Converts commas from rawDet to hyphens for correct formatting and assigns it to det variable.
		String det = rawDet.replace("," , "-");
		
		/*Discards the #det part of the trimmed tweet by creating a substring from the start of the #loc 
		 *part to the end of the trimmed string. Updates the trimmed string.
		 */
		trimmedTweet = trimmedTweet.substring(finish += 1);

		
		
		//Finds ending position of #loc data by indexing for the first ';'.
		finish = trimmedTweet.indexOf(";");
	
		//Assigns the substring of #loc data to the variable rawLoc.
		String rawLoc = trimmedTweet.substring(start, finish);
				
		//Converts commas from rawLoc to hyphens for correct formatting and assigns it to loc variable.
		String loc = rawLoc.replace("," , "-");
		
		/*Discards the #loc part of the trimmed tweet by creating a substring from the start of the #lat 
		 *part to the end of the trimmed string. Updates the trimmed string.
		 */
		trimmedTweet = trimmedTweet.substring(finish += 1);
		
		
		
		//Finds ending position of #lat data by indexing for the first ';'.
		finish = trimmedTweet.indexOf(";");
	
		//Assigns the substring of #lat data to the variable lat since no modifications are required.
		String lat = trimmedTweet.substring(start, finish);
		
		/*Discards the #lat part of the trimmed tweet by creating a substring from the start of the #lng 
		 *part to the end of the trimmed string. Updates the trimmed string.
		 */
		trimmedTweet = trimmedTweet.substring(finish += 1);
		
		
		
		//Finds ending position of #lng data by indexing for the first ';'.
		finish = trimmedTweet.indexOf(";");
	
		//Assigns the substring of #lng data to the variable lng since no modifications are required.
		String lng = trimmedTweet.substring(start, finish);
		
		
		
		//Prints values stored in typ, det, loc, lat, and lng variables consistently in correct format.
		System.out.println("Type: \t\t" + typ);
		System.out.println("Detail: \t" + det);
		System.out.println("Location: \t" + loc);
		System.out.println("Latitude: \t" + lat);
		System.out.println("Longitude: \t" + lng);

	}

}
