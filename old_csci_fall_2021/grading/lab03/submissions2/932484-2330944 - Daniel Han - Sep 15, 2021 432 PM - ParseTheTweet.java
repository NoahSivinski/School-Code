/*
 * [ParseTheTweet].java
 * Author:  [Daniel Han] 
 * Submission Date:  [9/15/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program is supposed to read input strings and reading the strings located after tags. It will accomplish by using various string methods such as the .indexOf() method to get the index location of the tag starts and tag endings
 * Then the program will use the .subString() method to obtain the data behind each tag and assign it to a string. The data behind each tag will also get trimmed and changed following proper I/O. After one tag has been analyzed, the program will cut off the already written tag off the string
 * The program will then repeat reading tags and cutting off tags until all the tags have been read. It will then make sure to trim the data and change some of the strings such as making the type tag all uppercase or by making the commas in the detail or location tag into hyphens
 * Finally, the program will output the various tags following constant I/O
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

//imports the scanner library
import java.util.*;

public class ParseTheTweet {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//we create our String tweet where we are going to assign the string with the input from the user
		String tweet;
		
		
		//we are asking the user to input a tweet and we are assigning the input to the string tweet
		System.out.println("Enter a tweet below:");
		tweet = keyboard.nextLine();
		
		
		//we are initializing several variables like all of our variables that are going to hold the strings within the tag and the integer variables are going to hold the start index number and the end index number
		String typeData; String locationData; String detailData; String latitudeData; String longitudeData;
		int startIndex; int finishIndex;
		
		
		//we start by finding the index number of #typ and assigning it to the startIndex variable and by finding the index number of the first occasion of ";" and assigning it to finishIndex
		startIndex = tweet.indexOf("#typ");
		finishIndex = tweet.indexOf(";");
		//We then use the substring method to extract the string data and then we assign it to the variable typeData and we make sure to trim the data
		typeData = tweet.substring((startIndex + 4), finishIndex).trim();
		//We also make sure to make the typeData string all upper case following proper I/O
		typeData = typeData.toUpperCase();
		//we then use the substring method and cut off the type tag from the tweet string
		tweet = tweet.substring(finishIndex +1);
		
		
		//we find the index number when #det occurs and then we assign the index number to startIndex and we also make sure to assign the index number of the first occasion of ";" to finishIndex
		startIndex = tweet.indexOf("#det");
		finishIndex = tweet.indexOf(";");
		//we then use the substring method to extract the string within the tag and assign it to the variable detailData and make sure to trim the data
		detailData = tweet.substring((startIndex + 4), finishIndex).trim();
		//we then replace all the commas with hyphens following proper I/O
		detailData = detailData.replace(',', '-');
		//we then use the substring method to cut off the detail tag from the tweet string
		tweet = tweet.substring(finishIndex + 1);
		
		
		//we assign the index number of when #loc starts to startIndex and then we assign the index number of the first occasion of ";" to finishIndex
		startIndex = tweet.indexOf("#loc");
		finishIndex = tweet.indexOf(";");
		//we then use the substring method to extract the string and make sure to trim the data to replace whitespace and then assign it to the locationData variable
		locationData = tweet.substring((startIndex + 4), finishIndex).trim();
		//we then replace the commas with hyphens to follow proper I/O
		locationData = locationData.replace(',', '-');
		//we then cut off the location tag and string from the tweet string
		tweet = tweet.substring(finishIndex + 1);
		
		
		//we start by finding the first ocassion of #lat and by assigning that index number to startIndex and also by assigning the first occasion of ";" to finishIndex
		startIndex = tweet.indexOf("#lat");
		finishIndex = tweet.indexOf(";");
		//we use the substring method using both parameters to extract the string without the hashtag and assign it to latitudeData and make sure to trim the tag removing all whitespaces
		latitudeData = tweet.substring((startIndex + 4), finishIndex).trim();
		//we then cut off the latitude tag and string from the tweet string
		tweet = tweet.substring(finishIndex + 1);
		
		
		//we start by finding the first occasioni of #lng and of ";" and then assign those index values to startIndex and finishIndex
		startIndex = tweet.indexOf("#lng");
		finishIndex = tweet.indexOf(";");
		//we then use the substring method to extract the string data from the tag and then we assign it to longitudeData making sure to use the trim method to remove all whitespaces
		longitudeData = tweet.substring((startIndex + 4), finishIndex).trim();
		//we then remove the longitude tag and its string data from the tag using the substring method
		tweet = tweet.substring(finishIndex + 1);
		
		
		//this is the series of println output statements that follow proper I/O
		System.out.println("Type:\t\t" + typeData);
		System.out.println("Detail:\t\t" + detailData);
		System.out.println("Location:\t" + locationData);
		System.out.println("Latitude:\t" + latitudeData);
		System.out.println("Longitude:\t" + longitudeData);
		
		
		//we close the keyboard object
		keyboard.close();
	}
}
