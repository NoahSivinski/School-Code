/*
 * ParseTheTweet.java
 * Author: Nnamdi Obichi
 * Submission Date: September 17th, 2021
 *
 * Purpose: 
 * This program parses an inputed tweet in the 
 * "Tweak the Tweet" style as five different 
 * variables called type, detail, location, latitude, and
 * longitude. The program then displays the parsed tweets
 * on screen in a more understandable structure than the
 * inputed tweet. These tweets are designed for disaster response
 * and they have the following format:
 * 
 * #typ value; #det value; #loc value; #lat value; #lng value;
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
 */

import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		
		Scanner keyBo = new Scanner(System.in);
		
		System.out.println("Enter a tweet below");
		String tweet = keyBo.nextLine();
		
		//Creates modTweet, a copy of the tweet variable
		String modTweet = tweet;
		
		/* Creates a String variable called type which extracts a substring of modTweet
		 * starting at the first hashtag(#) of modTweet and to the first semicolon(;) 
		 * which is included in the new String. The type variable is then updated to 
		 * extract the value of the String after the first space to the first semicolon
		 * in modTweet (this semicolon is not included). The type variable then has every 
		 * character in it capitalized.   
		 */
		String type = modTweet.substring(modTweet.indexOf("#"), modTweet.indexOf(";") + 1);
		type = modTweet.substring(modTweet.indexOf(" ") + 1, modTweet.indexOf(";"));
		type = type.toUpperCase();
		type = type.trim();
		
		/* modTweet is updated to exclude all characters from the first hashtag and 
		 * the first semicolon (#typ...;). Then modTweet trims any trailing spaces
		 */
		modTweet = modTweet.substring(modTweet.indexOf(";") + 1); 
		modTweet = modTweet.trim();
		
		/* Creates a String variable called detail which extracts a substring of modTweet
		 * starting at the first hashtag(#) of modTweet and to the first semicolon(;) 
		 * which is included in the new String. The detail variable is then updated to 
		 * extract the value of the String after the first space to the first semicolon 
		 * in modTweet (this semicolon is not included). All commas are replaced with 
		 * hyphens (-) for processing reasons.   
		 */
		String detail = modTweet.substring(modTweet.indexOf("#"), modTweet.indexOf(";") + 1);
		detail = modTweet.substring(modTweet.indexOf(" ") + 1, modTweet.indexOf(";"));
		detail = detail.replace(",", "-");
		detail = detail.trim();
		
		/* modTweet is updated to exclude all characters from the first hashtag and 
		 * the first semicolon (#det...;). Then modTweet trims any trailing spaces
		 */
		modTweet = modTweet.substring(modTweet.indexOf(";") + 1); 
		modTweet = modTweet.trim();
		
		/* Creates a String variable called location which extracts a substring of modTweet
		 * starting at the first hashtag(#) of modTweet and to the first semicolon(;) 
		 * which is included in the new String. The location variable is then updated to 
		 * extract the value of the String after the first space to the first semicolon 
		 * in modTweet (this semicolon is not included). All commas are replaced with 
		 * hyphens (-) for processing reasons.   
		 */
		String location = modTweet.substring(modTweet.indexOf("#"), modTweet.indexOf(";") + 1);
		location = modTweet.substring(modTweet.indexOf(" ") + 1, modTweet.indexOf(";"));
		location = location.replace(",", "-");
		location = location.trim();
		
		/* modTweet is updated to exclude all characters from the first hashtag and 
		 * the first semicolon (#loc...;). Then modTweet trims any trailing spaces
		 */
		modTweet = modTweet.substring(modTweet.indexOf(";") + 1); 
		modTweet = modTweet.trim();
		
		/* Creates a String variable called latitude which extracts a substring of modTweet
		 * starting at the first hashtag(#) of modTweet and to the first semicolon(;) 
		 * which is included in the new String. The latitude variable is then updated to 
		 * extract the value of the String after the first space to the first semicolon 
		 * in modTweet (this semicolon is not included).   
		 */
		String latitude = modTweet.substring(modTweet.indexOf("#"), modTweet.indexOf(";") + 1);
		latitude = modTweet.substring(modTweet.indexOf(" ") + 1, modTweet.indexOf(";"));
		latitude = latitude.trim();
		
		/* modTweet is updated to exclude all characters from the first hashtag and 
		 * the first semicolon (#lat...;). Then modTweet trims any trailing spaces
		 */
		modTweet = modTweet.substring(modTweet.indexOf(";") + 1); 
		modTweet = modTweet.trim();
		
		/* Creates a String variable called longitude which extracts a substring of modTweet
		 * starting at the first hashtag(#) of modTweet and to the first semicolon(;) 
		 * which is included in the new String. The detail variable is then updated to 
		 * extract the value of the String after the first space to the first semicolon 
		 * in modTweet (this semicolon is not included).   
		 */
		String longitude = modTweet.substring(modTweet.indexOf("#"), modTweet.indexOf(";") + 1);
		longitude = modTweet.substring(modTweet.indexOf(" ") + 1, modTweet.indexOf(";"));
		longitude = longitude.trim();
		
		/* modTweet is updated to exclude all characters from the first hashtag and 
		 * the first semicolon (#lng...;). Then modTweet trims any trailing spaces
		 */
		modTweet = modTweet.substring(modTweet.indexOf(";") + 1); 
		modTweet = modTweet.trim();
		

		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		keyBo.close();
	}
}
