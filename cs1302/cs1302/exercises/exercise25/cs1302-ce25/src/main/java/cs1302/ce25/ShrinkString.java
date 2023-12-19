package cs1302.ce25;

/**
 * ShrinkString class.
 */
public class ShrinkString {

    public static void main(String[] args) {
        System.out.println("shrinkString:\n");
        System.out.println(shrinkString("yyzzza"));
        System.out.println(shrinkString("abbbcdd"));
        System.out.println(shrinkString("Hello"));
        System.out.println(shrinkString("abcd"));
        System.out.println(shrinkString(" "));
        System.out.println(shrinkString(""));
        System.out.println("\nprintShrunkStrings:\n");
        String[] array = {"yyzzza", "abbbcdd", "Hello", "abcd", " ", ""};
        printShrunkStrings(array, 0);
    } //main

    /**
     * Prints the shrunk array elements from index i on.
     * @param array String array to de modified
     * @param i initial array index
     */
    public static void printShrunkStrings(String[] array, int i) {
        if (array.length != 0 && i < array.length) {
            System.out.println(shrinkString(array[i]));
            printShrunkStrings(array, i + 1);
        } //if
    } //printShrunkStrings

    /**
     * Returns a string without duplicates.
     * @param str string to be altered
     * @return new string w/o duplicates
     */
    public static String shrinkString(String str) {
        if (str.length() <= 1) {
            return str;
        } //if
        if (str.substring(0, 1).equals(str.substring(1,2))) {
            return shrinkString(str.substring(1));
        } else {
            return str.substring(0, 1) + shrinkString(str.substring(1));
        } //if-else
    } //shrinkString

} //ShrinkString
