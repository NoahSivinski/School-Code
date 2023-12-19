/*
 * ParseTheTweet.java
 * Author:  Jimmy Breathnach
 * Submission Date:  9/17/21
 *
 * Purpose: The purpose of this program is to sort through tweet information (given that it is in a certain format) and display the information to
 * a viewer of the tweet in an easy to view format. It used hastags or pound signs to start looking for part of the tweet, and then cuts it from the 
 * tweet and it does this until the information has been parsed through. It then displays the information at the end to the user.  
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
import java.util.Scanner; //scanner import

public class ParseTheTweet {

	public static void main(String[] args) {

		System.out.println("Enter a tweet below");
		Scanner keyboard = new Scanner(System.in);
		String tweet = keyboard.nextLine(); // this is the code for the user input of the tweet 

		/* this section is for finding the type that the tweet is advertising.
		* All the variables follow the same naming pattern, and their endings will thus be explained here.
		* blankStart takes the start of the tweet after the type of information is stated.
		* blankEnd finds the ending part of the information
		* blankSpace takes the Start and End and makes a sub sequence out of it
		* blankTrim is the trim of blankSpace and gets rid of the spaces left in blackSpace
		*blankFullStart and blankFullEnd are used to find the full text that needs to be deleted for the next
		*blankStart and blankEnd to propperly work 
		*blank is the final version of the information that will be printed
		*tweet# is the new version of the tweet once the previously obtained information get deleted from it
		*the higher number it is the further cut down it is.
		*/
		int typStart = tweet.indexOf("#") + 5;
		int typEnd = tweet.indexOf(";") ;
		String typSpace = (String) tweet.subSequence(typStart, typEnd);
		String typTrim = typSpace.trim();
		int typFullStart = tweet.indexOf("#");
		int typFullEnd = tweet.indexOf(";") + 1 ;
		String typFull= (String) tweet.subSequence(typFullStart, typFullEnd);
		String typ = typTrim.toUpperCase();
		String tweet2 = tweet.replace(typFull, " ");

		//det information being stored and cut out of the main tweet
		int detStart = tweet2.indexOf("#") + 5;
		int detEnd = tweet2.indexOf(";") ;
		String detSpace = (String) tweet2.subSequence(detStart, detEnd);
		String det = detSpace.trim();
		int detFullStart = tweet2.indexOf("#");
		int detFullEnd = tweet2.indexOf(";") + 1 ;
		String detFull= (String) tweet2.subSequence(detFullStart, detFullEnd);
		String tweet3 = tweet2.replace(detFull, " ");

		//loc information being stored cut out of the tweet.
		int locStart = tweet3.indexOf("#") + 5;
		int locEnd = tweet3.indexOf(";") ;
		String locSpace = (String) tweet3.subSequence(locStart, locEnd);
		String loc = locSpace.trim();
		int locFullStart = tweet3.indexOf("#");
		int locFullEnd = tweet3.indexOf(";") + 1 ;
		String locFull= (String) tweet3.subSequence(locFullStart, locFullEnd);
		String tweet4 = tweet3.replace(locFull, " ");

		//lat information being stored cut out of the tweet.
		int latStart = tweet4.indexOf("#") + 5;
		int latEnd = tweet4.indexOf(";") ;
		String latSpace = (String) tweet4.subSequence(latStart, latEnd);
		String lat = latSpace.trim();
		int latFullStart = tweet4.indexOf("#");
		int latFullEnd = tweet4.indexOf(";") + 1 ;
		String latFull= (String) tweet4.subSequence(latFullStart, latFullEnd);
		String tweet5 = tweet4.replace(latFull, " ");

		//lng information being stored cut out of the tweet.
		int lngStart = tweet5.indexOf("#") + 5;
		int lngEnd = tweet5.indexOf(";") ;
		String lngSpace = (String) tweet5.subSequence(lngStart, lngEnd);
		String lng = lngSpace.trim();


		// here the values are being printed in the order requested as well as the , are being replaced into -.
		System.out.println("Type: \t\t" + typ.replace ("," , "-"));
		System.out.println("Detail:\t\t" + det.replace ("," , "-"));
		System.out.println("Location:\t" + loc.replace("," , "-"));
		System.out.println("Latitude:\t" + lat.replace(",", "-"));
		System.out.println("Longitude:\t" + lng.replace(",", "-"));

	}

}
