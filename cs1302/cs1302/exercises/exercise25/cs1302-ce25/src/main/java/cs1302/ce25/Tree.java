package cs1302.ce25;

import java.io.File;
import java.util.Arrays;

/**
 * Tree class.
 */
public class Tree {

    /**
     * Prints file name.
     * @param file file to be printed
     * @param lines counter
     */
    public static void printFile(File file, int lines) {
        if (file.exists()) {
            for (int i = 0; i < lines; i++) {
                System.out.print("|   ");
            } //for
            System.out.println("|---" + file.getName());
            if (file.isDirectory()) {
                Arrays.stream(file.listFiles())
                    .forEach(e -> printFile(e, lines + 1));
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
        /*
        Arrays.stream(args)
            .map(File::new)
            .forEach(e -> printFile(e));
        */

        Arrays.stream(args)
            .map(File::new)
            .forEach((File f) -> Tree.printFile(f, 0));
    } // main

} // Tree
