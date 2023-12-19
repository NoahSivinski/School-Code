/*
 * ParseTheTweet.java
 * Author: Will Harrison
 * Submission Date: 02/12/21
 * 
 * Purpose: This program takes tweets from twitter, reads them,
 * and sorts the tweet into categories so it is easier
 * to read for the user. This sorting system also can group
 * tweets of similar categories together. 
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
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a tweet below");
		String tweet = input.nextLine();
		String typ;
		String det;
		String loc;
		String lat;
		String lng;
		
		int type = tweet.indexOf("#typ");
		int detail = tweet.indexOf("#det");
		int location = tweet.indexOf("#loc");
		int latitude = tweet.indexOf("#lat");
		int longitude = tweet.indexOf("#lng");
		
		typ = tweet.substring(type);
		int finishTyp = typ.indexOf(";");
		int startTyp = typ.indexOf("#typ");
		typ = typ.substring(startTyp , finishTyp);
		typ = typ.substring(4);
		typ = typ.trim();
		typ = typ.toUpperCase();
		
		det = tweet.substring(detail);
		int finishDet = det.indexOf(";");
		int startDet = det.indexOf("#det");
		det = det.substring(startDet , finishDet);
		det = det.substring(4);
		det = det.trim();
		det = det.replace("," , "-");
		
		loc = tweet.substring(location);
		int finishLoc = loc.indexOf(";");
		int startLoc = loc.indexOf("#loc");
		loc = loc.substring(startLoc , finishLoc);
		loc = loc.substring(4);
		loc = loc.trim();
		loc = loc.replace("," , "-");
		
		lat = tweet.substring(latitude);
		int finishLat = lat.indexOf(";");
		int startLat = lat.indexOf("#lat");
		lat = lat.substring(startLat , finishLat);
		lat = lat.substring(4);
		lat = lat.trim();
		
		lng = tweet.substring(longitude);
		int finishLng = lng.indexOf(";");
		int startLng = lng.indexOf("#lng");
		lng = lng.substring(startLng , finishLng);
		lng = lng.substring(4);
		lng = lng.trim();
		
		System.out.println("Type: \t\t\t" + typ);
		System.out.println("Detail: \t\t" + det);
		System.out.println("Location: \t\t" + loc);
		System.out.println("Latitude: \t\t" + lat);
		System.out.println("Longitude: \t\t" + lng);
		
		input.close();
		
		
	}

}
