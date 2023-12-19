package cs1302.ce17;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Function;

/**
 * This class contains methods related to {@code cs1302-ce17}.
 */
public class LambdaFun {

    /** Standard Input scanner. */
    private static Scanner input = new Scanner(System.in);

    /**
     * Main entry-point into the application.
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {

        String[] myStrings = new String[] {
            "CSCI",        "1302",    "is", "an", "awesome", "course!",
            "Lambda", "expressions", "scare", "me",     "but",       "I",
            "will",   "persevere"
        };

        Email[] inbox = new Email[] {
            new Email("bjb211@uga.edu", "yellowjacket@gatech.edu",
                      LocalDate.of(2019, 2, 4), "Go GA Tech!"),
            new Email("bjb211@uga.edu", "mom@aol.com",
                      LocalDate.of(2019, 2, 5), "Have a good day!"),
            new Email("bjb211@uga.edu", "steve@anyotherschool.edu",
                      LocalDate.of(2019, 2, 6), "I wish I would've chosen UGA"),
            new Email("bjb211@uga.edu", "student1@uga.edu",
                      LocalDate.of(2019, 2, 7), "Thanks for teaching us!"),
            new Email("bjb211@uga.edu", "yellowjacket@gatech.edu",
                      LocalDate.of(2019, 2, 8), "Go GA Tech!")
        };

        System.out.println("Tester1");
        Predicate<String> tester = t -> t.contains("a");

        LambdaFun.printlnMatches(myStrings, tester);
        System.out.println("Tester2");
        Predicate<String> tester2 = t -> t.endsWith("e");

        LambdaFun.printlnMatches(myStrings, tester2);
        System.out.println("Tester3");
        Predicate<String> tester3 = t -> t.length() > 5;

        LambdaFun.printlnMatches(myStrings, tester3);
        System.out.println("Tester4");
        Predicate<String> tester4 = t -> t.contains("scare");

        LambdaFun.printlnMatches(myStrings, tester4);

        System.out.println("\nTesting Emails 1:");
        Predicate<Email> pe = t -> (t.getSender().contains("gatech.edu"));
        Function<Email, String> func = t -> "\nTo: " + t.getRecipient() + "\nFrom: " +
            t.getSender() +
            "\nContents: " + t.getContents() + "\nDate Sent: " + t.getDateSent();
        LambdaFun.<Email>printlnMappedMatches(inbox, pe, func);

    } // main

    /**
     * Prints the elements of the array that pass the test specified by the given predicate.
     * More formally, this method prints all elements {@code e} in the array referred to by
     * {@code t} such that {@code p.test(e)}. Each element will be printed on its own line.
     *
     * @param <T> the type of the array elements
     * @param t the specified array
     * @param p the specified predicate
     * @throws NullPointerException if the specified predicate is {@code null}
     */
    private static <T> void printlnMatches(T[] t, Predicate<T> p) {
        for (T elem : t) {
            if (p.test(elem)) {
                System.out.println(elem);
            } // if
        } //for
    } // printlnMatches

    /**
     * Prints the elements of the array that pass the test specified by the given predicate
     * using a string mapper. More formally, this method prints the string mapped elements
     * {@code f.apply(e)} in the array referred to by {@code t} for each {@code e} such that
     * {@code p.test(e)}. Each string mapped element will be printed on its own line.
     *
     * @param <T> the type of the array elements
     * @param t the specified array
     * @param p the specified predicate
     * @param f the specified string mapper
     * @throws NullPointerException if the specified predicate or string mapper is {@code null}
     */
    private static <T> void printlnMappedMatches(T[] t, Predicate<T> p, Function<T, String> f) {
        for (T elem : t) {
            if (p.test(elem)) {
                System.out.println(f.apply(elem));
            } //if
        } //for
    } // printlnMappedMatches

} // LambdaFun
