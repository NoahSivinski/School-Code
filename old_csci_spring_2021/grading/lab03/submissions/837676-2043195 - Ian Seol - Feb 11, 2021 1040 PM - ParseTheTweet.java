/*
 * [CSCI1301L].java
 * Author:  [Jaehoon Seol] 
 * Submission Date:  [02102021]
 *
 * Purpose:Program parses tweet message containing 5 different information entered by a user
 * differentiated by hashtags. Program displays Type, Detail, Location, Latitude, and Longitude,
 * with a format easy to read. 
 * *
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

public class ParseTheTweet{

	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Enter a tweet below");
		String tweet = scannerObject.nextLine();//User Input by keyboard

		//Type of message by user
		int typ = tweet.lastIndexOf("#typ");
		int typestart = tweet.indexOf(" ", typ);
		int typeend = tweet.indexOf(";");
		String type = tweet.substring(typestart, typeend);//parsing without # and spaces
		type = type.toUpperCase();
		System.out.printf("Type:\t\t" + type, trim());
		System.out.println();

		//Detail of the message by user
		int det = tweet.lastIndexOf("#det");
		int detailstart = tweet.indexOf(" ", det);
		int detailend = tweet.indexOf(";",det);
		String detail1 = tweet.substring(detailstart, detailend);//parsing without # and spaces
		String detail2 = detail1.replace(',','-');//replaced to enhance readability
		System.out.printf("Detail:\t\t" + detail2, trim());
		System.out.println();

		//Locaton of the user
		int loc = tweet.lastIndexOf("#loc");
		int locationstart = tweet.indexOf(" ", loc);
		int locationend = tweet.indexOf(";",loc);
		String location1 = tweet.substring(locationstart, locationend);//parsing without # and spaces
		String location2 = location1.replace(',','-');//replaced to enhance readability
		System.out.printf("Location:\t" + location2, trim());
		System.out.println();

		//Latitude location of the user
		int lat = tweet.lastIndexOf("#lat");
		int latitudestart = tweet.indexOf(" ", lat);
		int latitudeend = tweet.indexOf(";",lat);
		String latitude = tweet.substring(latitudestart, latitudeend);
		System.out.printf("Latitude:\t" + latitude, trim());
		System.out.println();

		//Longitude location of the user
		int lng = tweet.lastIndexOf("#lng");
		int longitudestart = tweet.indexOf(" ", lng);
		int longitudeend = tweet.indexOf(";",lng);
		String longitude = tweet.substring(longitudestart, longitudeend);//parsing without # and spaces
		System.out.printf("Longitude:\t" + longitude, trim());
		System.out.println();

		scannerObject.close();

	}

	private static Object trim() {
		// TODO Auto-generated method stub
		// Trim method
		return null;
		}
}