/*
 * FunWithStrings.java
 * Author: Justin Byun
 * Submission Date:  March 19th, 2021
 *
 * Purpose: This code allows a person to enter in a sentence,
 * which then you can manipulate using 5 basic commands.
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

	class FunWithStrings{
			Scanner sc = new Scanner(System.in);

			String menu() {
					System.out.print("\n\n Enter your command" + "(reverse, replace first, replace last " + "remove all, remove, quit)");

    return sc.nextLine();
} 

  String acceptString() {
    System.out.print("Enter the string to be manipulated ");
    return sc.nextLine();
} 
  String reverse(String string) {
    String rev = "";
    for (int c = string.length() - 1; c >= 0; c--) rev += string.charAt(c);
    return rev;
} 
  
  String replaceFirst(String st) {
    String rep = "";
    	System.out.print("\n Enter the character to replace ");
    char toReplace = sc.next().charAt(0);
    	System.out.print("\n Enter the new character ");
    char newChar = sc.next().charAt(0);

    sc.nextLine();
    int found = -1;
    for (int c = 0; c < st.length(); c++) {
           if (st.charAt(c) == toReplace && found==-1) {
        rep += newChar;
        found = c;
        rep += st.substring(c + 1);
} 
      else if(found==-1){
        rep += st.charAt(c);
      } } 
    
    if (found == -1) {
      System.out.print("\n The letter was not found in the word.");
      return null;
    } 
    else return rep; 
  } 
  String replaceLast(String st) {
    String las = "";
    System.out.print("\n Enter the character to replace ");
    	char toReplace = sc.next().charAt(0);
    System.out.print("\n Enter the new character ");
    	char newChar = sc.next().charAt(0);
    sc.nextLine();
    int found = -1;    
    for (int c = st.length() - 1; c >= 0; c--) 
    {
      if (st.charAt(c) == toReplace) {
        las = newChar + las;
        found = c;
        las = st.substring(0, c) + las;       
        break;
      } 

      else las = las + st.charAt(c);
    } 
    if (found == -1) {
      System.out.print("\n The letter was not found in the word.");
      return null;
    } 
    else return las; 
  } 
  String removeAll(String st) {  
    String all = "";    
    System.out.print("\n Enter the character to remove ");
    char toRem = sc.next().charAt(0);
    sc.nextLine();   
    int found = -1;   
    for (int c = 0; c < st.length(); c++) {
      if (st.charAt(c) == toRem) {
        found = c;
        continue;
      } 
      else all = all + st.charAt(c);
} 
    if (found == -1) {
      System.out.print("\n The letter was not found in the word.");
      return null;
    } 
    else return all; 
  } 

  String remove(String st) {
    System.out.print("\n Enter the character to remove ");
    char toRemove = sc.next().charAt(0);
    System.out.print("\n Enter the " + toRemove + " you would like to remove");
    int pos = sc.nextInt();
    sc.nextLine();
    if (pos < 0 || pos >= st.length()) {
      System.out.print("\n Invalid index position: " + pos);      
      return null;
    }     
    else if (st.charAt(pos) != toRemove) {
      System.out.print("Error: the letter you are trying to remove does not exist");      
      return null;
    } 
    else 
    {
    	if (
        pos == 0
      ) return (st.substring(1)); 
      else 
      return (st.substring(0, pos) + st.substring(pos + 1));
    } 
  } 
  public static void main(String ss[]) {    
    String fin = "";  
    FunWithStrings so = new FunWithStrings();   
    String ori = so.acceptString();   
    do {     
      String choice = so.menu();      
      if (choice.equalsIgnoreCase("reverse")) {      
        ori = so.reverse(ori);       
        System.out.print("\n The new sentence is: " + ori);
      }
      else if (choice.equalsIgnoreCase("replace first")) {   
        fin = so.replaceFirst(ori);
        if (fin != null){        
          System.out.print("\n The new sentence is: " + fin);         
          ori = fin;
        } 
      }       
      else if (choice.equalsIgnoreCase("replace last")) {                     
        fin = so.replaceLast(ori);       
        if (fin != null) {         
          System.out.print("\n The new sentence is: " + fin);         
          ori = fin;
        }
      }     
      else if (choice.equalsIgnoreCase("remove all")) {               
        fin = so.removeAll(ori);        
        if (fin != null) {          
          System.out.print("\n The new sentence is: " + fin);          
          ori = fin;
          }
      }       
      else if (choice.equalsIgnoreCase("remove")) {       
        fin = so.remove(ori);        
        if (fin != null) {         
          System.out.print("\n The new sentence is: " + fin);         
          ori = fin;
        } 
      }      
      else if (choice.equalsIgnoreCase("quit")) System.exit(0);    
      else System.out.print("Invalid choice!!");
    }
    while (true); 
  }
} 