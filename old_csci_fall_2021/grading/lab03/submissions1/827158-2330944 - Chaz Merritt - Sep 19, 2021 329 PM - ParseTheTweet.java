/*
 * ParseTheTweet.java
 * Author:  Charles Merritt 
 * Submission Date:  09/16/21
 *
 * Purpose: This program is meant to interpret Tweak the Tweet Tweets that are formatted
 * in a particular way to quickly communicate information for disaster situations. We will
 * be working with strings and a new method called trim() to help us in extracting useful 
 * data from string type user inputs. 
 *
 * Statement of Academic Honesty: CEM
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

/* notes
 * . You will be splitting up (parsing) the information in the tweet into the 5 different types of 
information specified by the hashtags (type, location, detail, latitude, & longitude). Declare 
variables to store each of these pieces of information. Be sure to give these variables the 
appropriate data types and meaningful names. 4. Now you actually need to divide the information in the tweet into the separate substrings of 
information. Declare 2 variables (start and finish) to hold the indices of where each substring 
starts and finishes.  
▪ Hint: Each substring starts with a hashtag and finishes with a semicolon ( Is there a 
String class method that you can use to get the index of  “#typ” or a ‘;’ ?)   
#typ value; #det value; #loc value; #lat value; #lng value; 
 5. Once you have numbers assigned to start and finish, we want to discard the #tag and extract 
only the value. We know that the ‘;’ is where the value finishes – but we need to find the 
index where the actual value begins. Hint: our start variable currently points to the index of 
the “#” – and we know that all hashtag identifiers have the format, hashtag, 3 letters, and a 
space. Can we do simple math here to figure out the starting position of our value? 
*
* trim->indexOf("substring")->
* 
*/

import java.util.Scanner;
public class ParseTheTweet {

	public static void main(String[] args) {
		//input
		Scanner keyboard=new Scanner (System.in);
		System.out.println("Enter a tweet below");
		//variables 
		String Tweet=keyboard.nextLine();
		String TweetTrimmed=Tweet.trim();
		String Type, Location, Detail, Latitude, Longitude, ReplaceDetail, ReplaceLocation;
		Integer Start, Finish, Value;
		//first tag TYPE
		Start=TweetTrimmed.indexOf("#");
		Finish=TweetTrimmed.indexOf(";");
		Value=Start+5;
		Type=TweetTrimmed.substring(Value,Finish);
		System.out.println("Type:\t\t"+Type.toUpperCase());
		//second tag DETAIL
		Start=TweetTrimmed.indexOf("#", Finish);
		Finish=TweetTrimmed.indexOf(";", Start);
		Value=Start+5;
		Detail=TweetTrimmed.substring(Value, Finish);
		ReplaceDetail=Detail.replace(",","-");
		System.out.println("Detail:\t\t"+ReplaceDetail);
		//third tag LOCATION
		Start=TweetTrimmed.indexOf("#",Finish);
		Finish=TweetTrimmed.indexOf(";",Start);
		Value=Start+5;
		Location=TweetTrimmed.substring(Value, Finish);
		ReplaceLocation=Location.replace(",","-");
		System.out.println("Location:\t"+ReplaceLocation);
		//fourth tag LATITUDE
		Start=TweetTrimmed.indexOf("#", Finish);
		Finish=TweetTrimmed.indexOf(";", Start);
		Value=Start+5;
		Latitude=TweetTrimmed.substring(Value, Finish);
		System.out.println("Latitude:\t"+Latitude);
		//fifth tag LONGITUDE
		Start=TweetTrimmed.indexOf("#", Finish);
		Finish=TweetTrimmed.indexOf(";", Start);
		Value=Start+5;
		Longitude=TweetTrimmed.substring(Value, Finish);
		System.out.println("Longitude:\t"+Longitude);
	}

}
