package cs1302.ce24;

import java.util.List;
import java.util.LinkedList;

/**
 * SplitString class.
 */
public class SplitString {

    public static void main(String[] args) {
        List<String> list1 = splitString("Hello_1302_students!", "_");
        list1.stream().forEach(System.out::println);
    } //main

    /**
     * Returns a list of tokens from {@code str} based on the delimiter
     * {@code delim}.
     * @param str   input string
     * @param delim delimiter / separator
     * @return list of tokens
     */
    public static List<String> splitString(String str, String delim) {
        int index = str.indexOf(delim.charAt(0));
        if (index == -1) {
            List<String> list = new LinkedList();
            list.add(0, str);
            return list;
        } //if
        if (str.length() <= 1) {
            return new LinkedList<String>();
        } //if
        List<String> list = splitString(str.substring(index + 1), delim);
        list.add(0, str.substring(0, index));
        return list;
    } //splitString

} //SplitString
