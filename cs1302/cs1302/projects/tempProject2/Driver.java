package cs1302.driv;

import cs1302.listadt.*;
import cs1302.list.*;

/**
 * This is a Driver that will test the Linked and Array StringList classes and their
 * methods.
*/
public class Driver {
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";
    private static StringList[] testArr = {new LinkedStringList(),
                                           new ArrayStringList()};
    private static String temp;

    public static void main(String[] args) {
        System.out.println("\n\t***TESTING LINKEDSTRINGLIST METHODS: ***");
        for (int i = 0; i < testArr.length; i++) {
            test1(testArr[i]);
            test2(testArr[i]);
            test3(testArr[i]);
            testLast(testArr[i]);
            if (i == 0) {
                System.out.println("\n\t***TESTING ARRAYSTRINGLIST METHODS: ***");
            } // if
        } // for
    } // main

    /**
     * Helper method that reduces the main method size so it will pass checkstyle.
     * @param test The StringList object that will be tested.
     */
    private static void test1(StringList test) {
        temp = test.makeString("", ", ", "");
        if (temp.equals("")) {
            System.out.println(GREEN + "PASSED: Default Constructor" + RESET);
        } else {
            System.out.println(RED + "FAILED: Default Constructor" + RESET);
        } // if
        if (test.isEmpty()) {
            System.out.println(GREEN + "PASSED: isEmpty() Method" + RESET);
        } else {
            System.out.println(RED + "FAILED: isEmpty() Method" + RESET);
        } // if
        try {
            test.get(1);
            System.out.println(RED + "FAILED: get(int index) IOOBE throw" + RESET);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(GREEN + "PASSED: get(int index) IOOBE throw" + RESET);
        } // try-catch
        try {
            test.add("");
            System.out.println(RED + "FAILED: add(String s) ILE throw" + RESET);
        } catch (IllegalArgumentException ex) {
            System.out.println(GREEN + "PASSED: add(String s) ILE throw" + RESET);
        } // try-catch
        String nullC = null;
        try {
            test.add(nullC);
            System.out.println(RED + "FAILED: add(String s) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: add(String s) NPE throw" + RESET);
        } // try-catch
        test.add("Pineapple");
        temp = test.makeString();
        if (temp.equals("Pineapple")) {
            System.out.println(GREEN + "PASSED: add(String s) add String" + RESET);
        } else {
            System.out.println(RED + "FAILED: add(String s) add String" + RESET);
        } // if
        if (test.size() == 1) {
            System.out.println(GREEN + "PASSED: size() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: size() method" + RESET);
        } // if
        test.add("Pizza");
        test.add("Is");
        test.add("Actually");
        test.add("Good");
        temp = test.makeString();
        if (temp.equals("PineapplePizzaIsActuallyGood")) {
            System.out.println(GREEN + "PASSED: add(String s) for >1 size" + RESET);
        } else {
            System.out.println(RED + "FAILED: add(String s) for >1 size" + RESET);
        } // if
        temp = test.get(0) + test.get(2);
        if (temp.equals("PineappleIs")) {
            System.out.println(GREEN + "PASSED: get(int index) get String" + RESET);
        } else {
            System.out.println(RED + "FAILED: get(int index) get String" + RESET);
        } // if
    } // test1

    /**
     * Helper method that reduces the main method size so it will pass checkstyle.
     * @param test The StringList object that will be tested.
     */
    private static void test2(StringList test) {
        StringList testa = new LinkedStringList(test);
        String temp = testa.makeString();
        if (temp.equals("PineapplePizzaIsActuallyGood") && (testa != test)) {
            System.out.println(GREEN + "PASSED: Copy Constructor" + RESET);
        } else {
            System.out.println(RED + "FAILED: Copy Constructor" + RESET);
        } // if
        StringList nullT = null;
        try {
            StringList blah = new LinkedStringList(nullT);
            System.out.println(RED + "FAILED: Copy Constructor NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: Copy Constructor NPE Throw" + RESET);
        } // try-catch
        test.set(1, "Juice");
        temp = test.makeString();
        if (temp.equals("PineappleJuiceIsActuallyGood")) {
            System.out.println(GREEN + "PASSED: set(int index, String s) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: set(int index, String s) method" + RESET);
        } // if
        test.set(1, "Pizza");
        try {
            test.set(10, "Juice");
            System.out.println(RED + "FAILED:  set(int index, String s) IOOBE Throw" + RESET);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(GREEN + "PASSED: set(int index, String s) IOOBE Throw" + RESET);
        } // try-catch
        try {
            test.set(0, "");
            System.out.println(RED + "FAILED: set(int index, String s) ILE throw" + RESET);
        } catch (IllegalArgumentException ex) {
            System.out.println(GREEN + "PASSED: set(int index, String s) ILE throw" + RESET);
        } // try-catch
        String nullC = null;
        try {
            test.set(0, nullC);
            System.out.println(RED + "FAILED: set(int index, String s) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: set(int index, String s) NPE throw" + RESET);
        } // try-catch
    } //test2


    /**
     * Helper method that reduces the main method size so it will pass checkstyle.
     * @param test The StringList object that will be tested.
     */
    private static void test3(StringList test) {
        temp = test.makeString("!", ", ", "???");
        if (temp.equals("!Pineapple, Pizza, Is, Actually, Good???")) {
            System.out.println(GREEN + "PASSED: makeString(String start, String sep, " +
                               "String end) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: makeString(String start, String sep, " +
                               "String end) method" + RESET);
        } // if
        temp = test.makeString();
        if (temp.equals("PineapplePizzaIsActuallyGood")) {
            System.out.println(GREEN + "PASSED: makeString() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: makeString() method \t****IF THIS METHOD IS " +
                               "INCORRECT THEN IT WILL CAUSE OTHER TEST CASES TO " +
                               "FALSE NEGATIVE ****" + RESET);
        } // if
        temp = test.makeString(", ");
        if (temp.equals("Pineapple, Pizza, Is, Actually, Good")) {
            System.out.println(GREEN + "PASSED: makeString(String sep) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: makeString(String sep) method" + RESET);
        } // if
        boolean temp1 = test.contains("Pineapple");
        boolean temp2 = test.contains("Computer");
        if (temp1 && !temp2) {
            System.out.println(GREEN + "PASSED: contains(String o) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: contains(String o) method" + RESET);
        } // if
        temp1 = test.containsIgnoreCase("PINEAPPLE");
        temp2 = test.containsIgnoreCase("COMPUTER");
        if (temp1 && !temp2) {
            System.out.println(GREEN + "PASSED: containsIgnoreCase(String o) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: containsIgnoreCase(String o) method" + RESET);
        } // if
    } // test3

    /**
     * Helper method that reduces the main method size so it will pass checkstyle.
     * @param test The StringList object that will be tested.
     */
    private static void testLast(StringList test) {
        StringList testa = new LinkedStringList(test);
        if (testa.set(0, "Apple").equals("Pineapple")) {
            System.out.println(GREEN + "PASSED: set(int index, String s) return value" + RESET);
        } else {
            System.out.println(RED + "FAILED: set(int index, String s) return value" + RESET);
        } // if
        if (testa.add("!")) {
            System.out.println(GREEN + "PASSED: add(String s) return value" + RESET);
        } else {
            System.out.println(RED + "FAILED: add(String s) return value" + RESET);
        } // if

        StringList test2 = new LinkedStringList();
        test2.add("a");
        test2.add("b");
        test2.add("c");
        test2.add("d");
        test2.add("e");

        StringList test3 = new LinkedStringList();
        test3.add("1");
        test3.add("2");
        test3.add("3");
        test3.add("4");
        test3.add("5");
        test2.add(1, test3);

        if (test2.makeString().equals("a12345bcde")) {
            System.out.println(GREEN + "PASSED: add(int index, StringList s) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: add(String s) method" + RESET);
        } // if

        StringList test4 = new LinkedStringList();


        try {
            //String s = test4.get(5);
            test2.add(test4);
            System.out.println(RED + "FAILED: add(StringList s) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: add(int index, StringList s) NPE throw" + RESET);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(GREEN + "PASSED: add(int index, StringList s) NPE throw" + RESET);
        } // try-catch

        try {
            //String s = test4.get(0);
            test2.add(1, test4);
            System.out.println(RED + "FAILED: add(int index, StringList s) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: add(int index, StringList s) NPE throw" + RESET);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(GREEN + "PASSED: add(int index, StringList s) IOOE throw" + RESET);
        } // try-catch

        test4 = test3.reverse();
        if (test4.makeString().equals("54321")) {
            System.out.println(GREEN + "PASSED: reverse() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: reverse() method" + RESET);
        } //if-else

        try {
            test4.clear();
            String s = test4.get(10);
            System.out.println("clear test: " + s);
            System.out.println(RED + "FAILED: clear() method" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: clear()" + RESET);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(GREEN + "PASSED: clear()" + RESET);
        } //try-catch


        if (test.containsSubstring("apple")) {
            System.out.println(GREEN + "PASSED: containsSubstring() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: containsSubstring() method" + RESET);
        } //if-else

        if (!test.containsSubstring("apples")) {
            System.out.println(GREEN + "PASSED: containsSubstring() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: containsSubstring() method" + RESET);
        } //if-else

        test3.add("4");
        test3.add("2");
        test3.add("6");
        StringList test5 = test3.distinct();

        if (test5.makeString().equals("123456")) {
            System.out.println(GREEN + "PASSED: distinct() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: distinct() method" + RESET);
        } //if-else

        if (test3.indexOf("6") == 7) {
            System.out.println(GREEN + "PASSED: indexOf() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: indexOf() method" + RESET);
        } //if-else

        if (test2.indexOfIgnoreCase("B") == 6) {
            System.out.println(GREEN + "PASSED: indexOfIgnoreCase() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: indexOfIgnoreCase() method" + RESET);
        } //if-else

        test5.remove(1);
        if (test5.makeString().equals("13456")) {
            System.out.println(GREEN + "PASSED: remove() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: remove() method" + RESET);
        } //if-else

        String a = "";
        String[] array = test5.toArray();
        for (int i = 0; i < array.length; i++) {
            a += array[i];
        } //for

        if (a.equals("13456")) {
            System.out.println(GREEN + "PASSED: toArray() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: toArray() method" + RESET);
        } //if-else

        StringList test6 = test5.splice(1, 4);
        if (test6.makeString().equals("345")) {
            System.out.println(GREEN + "PASSED: splice(int a, int b) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: splice(int a, int b) method" + RESET);
        } //if-else



    } // test4

} // Driver
