/*
 * ParseTheTweet.java
 * Author:  Jonathan Sanderford 
 * Submission Date:  9/17/2021
 *
 * Purpose: This program takes tweets and sorts out important information given by it based on
 * the hashtags used. The tweet is input and the type, details, location
 * latitude, and longitude are regurgitated by the program which would make it easier for 
 * first responders to react to situations based on tweets people send.
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
		
		//hashtags for determining start
		final String hashtyp = "#typ";
		final String hashdet = "#det";
		final String hashloc = "#loc";
		final String hashlat = "#lat";
		final String hashlng = "#lng";
		
		//declaring variables
		String typ, det, loc, lat, lng;
		int start, finish;
		
		Scanner scanner = new Scanner(System.in);
		
		//prompt
		System.out.println("Enter a tweet below");
		String tweet = scanner.nextLine();
		
		//finds start and finish
		start = tweet.indexOf(hashtyp)+4; finish = tweet.indexOf("; #det");
		//creates subString based on start and finish integers
		typ = tweet.substring(start,finish);
		//gets rid of white space
		typ.trim();
		
		//finds start and finish
		start = tweet.indexOf(hashdet)+4; finish = tweet.indexOf("; #loc");
		//creates subString based on start and finish integers
		det = tweet.substring(start,finish);
		//gets rid of white space
		det.trim();
		
		//finds start and finish
		start = tweet.indexOf(hashloc)+4; finish = tweet.indexOf("; #lat");
		//creates subString based on start and finish integers
		loc = tweet.substring(start,finish);
		//gets rid of white space
		loc.trim();
		
		//finds start and finish
		start = tweet.indexOf(hashlat)+4; finish = tweet.indexOf("; #lng");
		//creates subString based on start and finish integers
		lat = tweet.substring(start,finish);
		//gets rid of white space
		lat.trim();
		//converts string into a double value
		scanner = new Scanner(lat);
		Double latdouble = scanner.nextDouble();
		
		//finds start and finish
		start = tweet.indexOf(hashlng)+4; finish = tweet.indexOf(";\"");
		//creates subString based on start and finish integers
		lng = tweet.substring(start,finish);
		//gets rid of white space
		lng.trim();
		//converts string into a double value
		scanner = new Scanner(lng);
		Double lngdouble = scanner.nextDouble();
		
		//output
		//makes typ uppercase to match lab I/O
		System.out.println("Type:\t\t"+typ.toUpperCase());
		//replaces comma with a hyphen for next two output lines
		System.out.println("Detail:\t\t"+det.replace(',', '-'));
		System.out.println("Location:\t"+loc.replace(',', '-'));
		System.out.println("Latitude:\t "+latdouble);
		System.out.println("Longitude:\t "+lngdouble);

		

	}

}
