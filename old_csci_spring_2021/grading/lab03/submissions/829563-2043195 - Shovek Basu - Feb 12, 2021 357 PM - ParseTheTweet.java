/*
 * [ParseTheTweet].java
 * Author:  [Shovek Basu] 
 * Submission Date:  [02/12/2021]
 *
 * Purpose: parses tweet information.
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
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter a tweet below");
		String wholeTweet = keyboard.nextLine();
		
		//parsing the #typ, typStart is meant for the #typ and 
		//typEnd is meant for the semi colon after
		int typIndex = wholeTweet.indexOf("#typ");
		int typEnd = wholeTweet.indexOf(";");
		
		String typSubstring = wholeTweet.substring(typIndex +4, typEnd);
		String typSubstringUppercase = typSubstring.toUpperCase();
		String typSubstringTrim = typSubstringUppercase.trim();
		
		//parsing for #det, the end index is just where the next # begins but minus 3
		//since thats how many spaces away all of them are
		int detIndex = wholeTweet.indexOf("#det");
		int detEnd = wholeTweet.indexOf("; #loc");
		String detSubstring = wholeTweet.substring(detIndex+4, detEnd);
		String detSubstringNoComma = detSubstring.replace(",", "-");
		String detSubstringTrim = detSubstringNoComma.trim();
		
		//parsing for #loc
		int locIndex = wholeTweet.indexOf("#loc");
		int locEnd = wholeTweet.indexOf("; #lat");
		String locSubstring = wholeTweet.substring(locIndex+4, locEnd);
		String locSubstringNoComma = locSubstring.replace(",", "-");
		String locSubstringTrim = locSubstringNoComma.trim();

		
		//parsing for #lat
		int latIndex = wholeTweet.indexOf("#lat");
		int latEnd = wholeTweet.indexOf("; #lng");
		String latSubstring = wholeTweet.substring(latIndex+4, latEnd);
		String latSubstringTrim = latSubstring.trim();

		
		//parsing for #lng
		int lngIndex = wholeTweet.indexOf("#lng");
		int lngEnd = wholeTweet.lastIndexOf(";");
		String lngSubstring = wholeTweet.substring(lngIndex +4, lngEnd);
		String lngSubstringTrim = lngSubstring.trim();

		
		System.out.print("Type:\t\t" + typSubstringTrim);
		System.out.print("\nDetail:\t\t" + detSubstringTrim);
		System.out.print("\nLocation:\t" + locSubstringTrim);
		System.out.print("\nLatitude:\t" + latSubstringTrim );
		System.out.print("\nLongitude:\t" + lngSubstringTrim);
	
	}

}
