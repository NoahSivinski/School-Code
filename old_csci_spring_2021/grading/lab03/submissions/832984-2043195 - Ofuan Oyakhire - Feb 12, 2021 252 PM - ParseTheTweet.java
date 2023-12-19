/*
 * ParseTheTweet.java
 * Author: Ofuan Oyakhire
 * Submission Date: 02/12/21
 *
 * Purpose: Parse tweets making it easier for users to find useful information.
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

        Scanner keyboard = new Scanner(System.in);

        final String HASHTAG = "#";
        final String SEMICOLON = ";";
        int start, finish;
        String tweet, type, detail, location, longitude, latitude;

        System.out.println("Enter a tweet below");
        tweet = keyboard.nextLine();


        start = tweet.indexOf(HASHTAG);
        finish = tweet.indexOf(SEMICOLON);
        type = tweet.substring(start, finish).substring(5).toUpperCase();


        tweet = tweet.substring(finish + 1);
        start = tweet.indexOf(HASHTAG);
        finish = tweet.indexOf(SEMICOLON);
        detail = tweet.substring(start, finish).substring(5).replace(",", "-");


        tweet = tweet.substring(finish + 1);
        start = tweet.indexOf(HASHTAG);
        finish = tweet.indexOf(SEMICOLON);
        location = tweet.substring(start, finish).substring(5).replace(",", "-");


        tweet = tweet.substring(finish + 1);
        start = tweet.indexOf(HASHTAG);
        finish = tweet.indexOf(SEMICOLON);
        latitude = tweet.substring(start, finish).substring(5);


        tweet = tweet.substring(finish + 1);
        start = tweet.indexOf(HASHTAG);
        finish = tweet.indexOf(SEMICOLON);
        longitude = tweet.substring(start, finish).substring(5);


        System.out.println("Type:\t\t\t " + type);
        System.out.println("Detail:\t\t\t " + detail);
        System.out.println("Location:\t\t " + location);
        System.out.println("Latitude:\t\t " + latitude);
        System.out.println("Longitude:\t\t " + longitude);
    }
}
