import java.util.Scanner;

/*
 * ParseTheTweet.java
 * Author:  Jonathan Anderson
 * Submission Date:  9/15/2021
 *
 * Purpose: This program takes in a line of text from the user and separates, or parses, various
 * phrases from the input based on what kind of tag the phrase has. It then returns the separated
 * phrases to the user in printed form.
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

public class ParseTheTweet {
    public static void main(String[] args){
        //Defining delimiters for parsing
        final char start = '#';
        final char finish = ';';

        //Prompting the user for input and removing white space from tweet
        System.out.println("Enter a tweet below");
        Scanner input = new Scanner(System.in);
        String tweet = input.nextLine();
        String trimmedTweet = tweet.trim();

        //Declaring variables that store parsed information
        String type = "";
        String detail = "";
        String location = "";
        String latitude = "";
        String longitude = "";

        //Creating counter variable that creates while-loop exit condition
        int parsedCount = 0;

        while(trimmedTweet.length() > 0){
            //Checks to see if first character of String trimmedTweet is starting delimiter
            if(trimmedTweet.charAt(0) == start){
                //Tag indices are used to determine what tag is currently being parsed
                int tagStartIndex = 1;
                int tagEndIndex = 4;

                //Captures text between end of tag type and ending ';' delimiter
                String parsedText = trimmedTweet.substring(tagEndIndex + 1, trimmedTweet.indexOf(finish));

                String currentTag = trimmedTweet.substring(tagStartIndex, tagEndIndex);

                //Checking to see if current tag indicates type, meaning that String parsedText contains that information
                if(currentTag.equals("typ")) {
                    type = parsedText.toUpperCase();
                    parsedCount++;
                }

                //Checking to see if current tag indicates detail, meaning that String parsedText contains that information
                else if(currentTag.equals("det")) {
                    detail = parsedText;
                    parsedCount++;
                }

                //Checking to see if current tag indicates location, meaning that String parsedText contains that information
                else if(currentTag.equals("loc")) {
                    location = parsedText;
                    parsedCount++;
                }

                //Checking to see if current tag indicates latitude, meaning that String parsedText contains that information
                else if(currentTag.equals("lat")) {
                    latitude = parsedText;
                    parsedCount++;
                }

                //Checking to see if current tag indicates longitude, meaning String parsedText contains that information
                else if(currentTag.equals("lng")) {
                    longitude = parsedText;
                    parsedCount++;
                }

                //If parsedCount is 5, all information has been parsed, so trimmedTweet becomes empty to create exit loop condition
                if(parsedCount == 5)
                    trimmedTweet = "";
                else
                    //Removes parsed section from trimmedTweet
                    trimmedTweet = trimmedTweet.substring(trimmedTweet.indexOf(finish) + 2);
            }
        }

        //Printing results to user
        System.out.println("Type: \t\t\t" + type);
        System.out.println("Detail: \t\t" + detail);
        System.out.println("Location: \t\t" + location);
        System.out.println("Latitude: \t\t" + latitude);
        System.out.println("Longitude: \t\t" + longitude);
    }
}
