package cs1302.exceptions;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/** 
 * A simpler version of the Unix <code>cat</code> command.
 */
public class MyCat {

    /**
     * Entry point for the application. Exactly zero or one command-line arguments are expected.
     * If a filename is given as an argument, then the program should print the contents of that
     * file to standard output. If a single dash (i.e., "-") is given as an argument, then
     * the program should print the contents of standard input. 
     *
     * @param args  the command-line arguments
     */
    public static void main(String[] args) {
	String filename = "";
	try {	
	    filename = args[0];
	} catch(ArrayIndexOutOfBoundsException e) {
	    System.out.println("MyCat: " +  e.toString());
	}
	Scanner input = null;
	if(args.length > 1) {
	    for(int i = 0; i < args.length; i++) {
		filename = args[i];
		try {
		    if (filename.equals("-")) {
			Printer.printStdInLines();
		    } else {
			File file = new File(filename);
			Printer.printFileLines(file);
		    } // if
		} catch(FileNotFoundException exception) {
		    System.out.println("File not found error.");
		}
	    }
	}
    } // main
}// MyCat
    
