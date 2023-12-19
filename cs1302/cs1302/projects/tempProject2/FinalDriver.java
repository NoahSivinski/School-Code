package cs1302.driv;

import cs1302.list.*;
import cs1302.listadt.*;

/**
 * This is a Driver that will test the Linked and Array StringList classes and their
 * methods.
*/
public class FinalDriver {
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
            test4(testArr[i]);
            test5(testArr[i]);
            test6(testArr[i]);
            test7(testArr[i]);
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
            System.out.println(GREEN + "PASSED: get(int index) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: get(int index) method" + RESET);
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
            System.out.println(GREEN + "PASSED: LinkedStringList Copy Constructor" + RESET);
        } else {
            System.out.println(RED + "FAILED: LinkedStringList Constructor" + RESET);
        } // if
        StringList testab = new LinkedStringList(test);
        temp = testab.makeString();
        if (temp.equals("PineapplePizzaIsActuallyGood") && (testab != test)) {
            System.out.println(GREEN + "PASSED: ArrayStringList Copy Constructor" + RESET);
        } else {
            System.out.println(RED + "FAILED: ArrayStringList Constructor" + RESET);
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
            System.out.println(RED + "FAILED: set(int index, String s) IAE throw" + RESET);
        } catch (IllegalArgumentException ex) {
            System.out.println(GREEN + "PASSED: set(int index, String s) IAE throw" + RESET);
        } // try-catch
        String nullC = null;
        try {
            test.set(0, nullC);
            System.out.println(RED + "FAILED: set(int index, String s) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: set(int index, String s) NPE throw" + RESET);
        } // try-catch
    } // test2


    /**
     * Helper method that reduces the main method size so it will pass checkstyle.
     * @param test The StringList object that will be tested.
     */
    private static void test3(StringList test) {
        String[] arrT = test.toArray();
        boolean sameA = true;
        for (int i = 0; i < arrT.length; i++) {
            if (!(arrT[i].equals(test.get(i)))) {
                sameA = false;
            } // if
        } // for
        if (sameA) {
            System.out.println(GREEN + "PASSED: toArray() Method" + RESET);
        } else {
            System.out.println(RED + "FAILED: toArray() method" + RESET);
        } // if
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
        temp1 = test.containsSubstring("apple");
        temp2 = test.containsIgnoreCase("comp");
        if (temp1 && !temp2) {
            System.out.println(GREEN + "PASSED: containsSubstring(String o) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: containsSubstring(String o) method" + RESET);
        } // if
    } // test3

    /**
     * Helper method that reduces the main method size so it will pass checkstyle.
     * @param test The StringList object that will be tested.
     */
    private static void test4(StringList test) {
        StringList testb = new LinkedStringList();
        testb.add("Not");
        testb.add("Really");
        test.add(testb);
        temp = test.makeString();
        if (temp.equals("PineapplePizzaIsActuallyGoodNotReally")) {
            System.out.println(GREEN + "PASSED: add(StringList sl) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: add(StringList sl) method" + RESET);
        } // if
        test.add(3, testb);
        temp = test.makeString();
        if (temp.equals("PineapplePizzaIsNotReallyActuallyGoodNotReally")) {
            System.out.println(GREEN + "PASSED: add(int index, String s) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: add(int index, String s) method" + RESET);
        } // if
        test.add(3, "Not");
        temp = test.makeString();
        if (temp.equals("PineapplePizzaIsNotNotReallyActuallyGoodNotReally")) {
            System.out.println(GREEN + "PASSED: add(int index, StringList sl) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: add(int index, StringList sl) method" + RESET);
        } // if
        test.remove(3);
        temp = test.makeString();
        if (temp.equals("PineapplePizzaIsNotReallyActuallyGoodNotReally")) {
            System.out.println(GREEN + "PASSED: remove(int index) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: remove(int index) method" + RESET);
        } // if
        StringList testc = test.distinct();
        temp = testc.makeString();
        if (temp.equals("PineapplePizzaIsNotReallyActuallyGood")) {
            System.out.println(GREEN + "PASSED: distinct() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: distinct() method" + RESET);
        } // if
        testc = testc.reverse();
        temp = testc.makeString();
        if (temp.equals("GoodActuallyReallyNotIsPizzaPineapple")) {
            System.out.println(GREEN + "PASSED: reverse() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: reverse() method" + RESET);
        } // if
        testc = testc.splice(4, 6);
        temp = testc.makeString();
        if (temp.equals("IsPizza")) {
            System.out.println(GREEN + "PASSED: splice(int fromIndex, int toIndex) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: splice(int fromIndex, int toIndex) method" + RESET);
        } // if
        int tempI = test.indexOf("Not");
        if (tempI == 3) {
            System.out.println(GREEN + "PASSED: indexOf(String s) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: indexOf(String s) method" + RESET);
        } // if
    } // test4

    /**
     * Helper method that reduces the main method size so it will pass checkstyle.
     * @param test The StringList object that will be tested.
     */
    private static void test5(StringList test) {
        int tempI = test.indexOfIgnoreCase("ACTUALLY");
        if (tempI == 5) {
            System.out.println(GREEN + "PASSED: indexOfIgnoreCase(String s) method" + RESET);
        } else {
            System.out.println(RED + "FAILED: indexOfIgnoreCase(String s) method" + RESET);
        } // if
        StringList testc = test.distinct();
        testc.clear();
        if (testc.makeString().equals("") && testc.isEmpty()) {
            System.out.println(GREEN + "PASSED: clear() method" + RESET);
        } else {
            System.out.println(RED + "FAILED: clear() method" + RESET);
        } // if
        StringList nullSL = null;
        String nullS = null;
        try {
            testc.add(nullSL);
            System.out.println(RED + "FAILED: add(StringList sl) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: add(StringList sl) NPE Throw" + RESET);
        } // try-catch
        try {
            testc.add(0, nullSL);
            System.out.println(RED + "FAILED: add(int index, StringList sl) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: add(int index, StringList sl) NPE Throw" + RESET);
        } // try-catch
        try {
            testc.add(0, nullS);
            System.out.println(RED + "FAILED: add(int index, String s) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: add(int index, String s) NPE Throw" + RESET);
        } // try-catch
        try {
            testc.add(-1, "Potato");
            System.out.println(RED + "FAILED: add(int index, String s) IOOBE throw" + RESET);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(GREEN + "PASSED: add(int index, String s) IOOBE Throw" + RESET);
        } // try-catch
        try {
            testc.add(-1, testc);
            System.out.println(RED + "FAILED: add(int index, StringList sl) IOOBE throw" + RESET);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(GREEN + "PASSED: add(int index, StringList sl) IOOBE Throw" + RESET);
        } // try-catch
        try {
            testc.add(0, "");
            System.out.println(RED + "FAILED: add(int index, String s) IAE throw" + RESET);
        } catch (IllegalArgumentException ex) {
            System.out.println(GREEN + "PASSED: add(int index, String s) IAE Throw" + RESET);
        } // try-catch
    } // test5

    /**
     * Helper method that reduces the main method size so it will pass checkstyle.
     * @param test The StringList object that will be tested.
     */
    private static void test6(StringList test) {
        StringList testa = test.distinct();     //size: 7
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
        if (testa.remove(7).equals("!")) {
            System.out.println(GREEN + "PASSED: remove(int index) return value" + RESET);
        } else {
            System.out.println(RED + "FAILED: remove(int index) return value" + RESET);
        } // if
        StringList testb = test.distinct();
        testb.clear();
        testb.add("?");
        testb.add("!");
        testb.add("?");
        if (testa.add(testb)) {
            System.out.println(GREEN + "PASSED: add(StringList sl) return value" + RESET);
        } else {
            System.out.println(RED + "FAILED: add(StringList sl) return value" + RESET);
        } // if
        if (testa.add(7, testb)) {
            System.out.println(GREEN + "PASSED: add(int index, StringList sl) return value"
                               + RESET);
        } else {
            System.out.println(RED + "FAILED: add(int index, StringList sl) return value" + RESET);
        } // if
        if (testa.add(8, "!")) {
            System.out.println(GREEN + "PASSED: add(int index, String s) return value" + RESET);
        } else {
            System.out.println(RED + "FAILED: add(int index, String s) return value" + RESET);
        } // if
        try {
            testa.contains("");
            System.out.println(RED + "FAILED: contains(String o) IAE throw" + RESET);
        } catch (IllegalArgumentException ex) {
            System.out.println(GREEN + "PASSED: contains(String o) IAE Throw" + RESET);
        } // try-catch
        try {
            testa.containsIgnoreCase("");
            System.out.println(RED + "FAILED: containsIgnoreCase(String o) IAE throw" + RESET);
        } catch (IllegalArgumentException ex) {
            System.out.println(GREEN + "PASSED: containsIgnoreCase(String o) IAE Throw" + RESET);
        } // try-catch
        try {
            testa.containsSubstring("");
            System.out.println(RED + "FAILED: containsSubstring(String o) IAE throw" + RESET);
        } catch (IllegalArgumentException ex) {
            System.out.println(GREEN + "PASSED: containsSubstring(String o) IAE Throw" + RESET);
        } // try-catch
    } // test6

    /**
     * Helper method that reduces the main method size so it will pass checkstyle.
     * @param test The StringList object that will be tested.
     */
    private static void test7(StringList test) {
        StringList testa = test.distinct();
        String nullS = null;
        try {
            testa.contains(nullS);
            System.out.println(RED + "FAILED: contains(String o) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: contains(String o) NPE Throw" + RESET);
        } // try-catch
        try {
            testa.containsIgnoreCase(nullS);
            System.out.println(RED + "FAILED: containsIgnoreCase(String o) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: containsIgnoreCase(String o) NPE Throw" + RESET);
        } // try-catch
        try {
            testa.containsSubstring(nullS);
            System.out.println(RED + "FAILED: containsSubstring(String o) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: containsSubstring(String o) NPE Throw" + RESET);
        } // try-catch
        try {
            testa.remove(-1);
            System.out.println(RED + "FAILED: remove(int index) IOOBE throw" + RESET);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(GREEN + "PASSED: remove(int index) IOOBE throw" + RESET);
        } // try-catch
        try {
            testa.splice(-1, 3);
            System.out.println(RED + "FAILED: splice(int fromIndex, int toIndex) IOOBE throw 1"
                               + RESET);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(GREEN + "PASSED: splice(int fromIndex, int toIndex) IOOBE throw 1"
                               + RESET);
        } // try-catch
        try {
            testa.splice(0, 300);
            System.out.println(RED + "FAILED: splice(int fromIndex, int toIndex) IOOBE throw 2"
                               + RESET);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(GREEN + "PASSED: splice(int fromIndex, int toIndex) IOOBE throw 2"
                               + RESET);
        } // try-catch
        try {
            testa.splice(4, 3);
            System.out.println(RED + "FAILED: splice(int fromIndex, int toIndex) IOOBE throw 3"
                               + RESET);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(GREEN + "PASSED: splice(int fromIndex, int toIndex) IOOBE throw 3"
                               + RESET);
        } // try-catch
    } // test7

    /**
     * Helper method that reduces the main method size so it will pass checkstyle.
     * @param test The StringList object that will be tested.
     */
    private static void test8(StringList test) {
        StringList testa = test.distinct();
        String nullS = null;
        try {
            testa.indexOf(nullS);
            System.out.println(RED + "FAILED: indexOf(String s) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: indexOf(String s) NPE throw" + RESET);
        } // try-catch
        try {
            testa.indexOfIgnoreCase(nullS);
            System.out.println(RED + "FAILED: indexOfIgnoreCase(String s) NPE throw" + RESET);
        } catch (NullPointerException ex) {
            System.out.println(GREEN + "PASSED: indexOfIgnoreCase(String s) NPE throw" + RESET);
        } // try-catch
        try {
            testa.indexOf("");
            System.out.println(RED + "FAILED: indexOf(String s) IAE throw" + RESET);
        } catch (IllegalArgumentException ex) {
            System.out.println(GREEN + "PASSED: indexOf(String s) IAE throw" + RESET);
        } // try-catch
        try {
            testa.indexOfIgnoreCase("");
            System.out.println(RED + "FAILED: indexOfIgnoreCase(String s) IAE throw" + RESET);
        } catch (IllegalArgumentException ex) {
            System.out.println(GREEN + "PASSED: indexOfIgnoreCase(String s) IAE throw" + RESET);
        } // try-catch
    } // test8


} // Driver
