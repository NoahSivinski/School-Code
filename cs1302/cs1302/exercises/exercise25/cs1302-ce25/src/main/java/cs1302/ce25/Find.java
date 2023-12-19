package cs1302.ce25;

import java.io.File;
import java.util.Arrays;

/**
 * Find class.
 */
public class Find {

    /**
     * Prints file name.
     * @param file file to be printed
     */
    public static void printFile(File file) {
        if (file.exists()) {
            System.out.println("File Path: " + file.getPath());
            if (file.isDirectory()) {

                Arrays.stream(file.listFiles())
                    .forEach(e -> printFile(e));
            } //if
        } else {
            System.out.printf("find: `%s`: No such file or directory", file.toString());
        } //if
    } // printFile

    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[] { "." }; // default to "."
        } // if
        //Arrays.stream(args).forEach(System.out::println);
        // TODO implement stream code
        Arrays.stream(args)
            .map(File::new)
            .forEach(e -> printFile(e));
    } // main

} // Find
