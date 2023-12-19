package cs1302.genlist;

import cs1302.genlistadt.*;
import java.util.Iterator;
import java.util.Comparator;
import java.util.function.*;

/**
 * Tester class for GenList program.
 */
public class LinkedGenListTest<T> extends LinkedGenList<T> {

    public static void main(String[] args) {

        GenList<String> list = new LinkedGenList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        GenList<Integer> list2 = new LinkedGenList<>();
        list2.add(2);
        list2.add(5);
        list2.add(90);
        list2.add(100);
        list2.add(23);
        list2.add(90);
        list2.add(99);

        demoMap(list, list2);

        demoReduce(list, list2);

        demoFilter(list, list2);

        demoMin(list, list2);

        demoAllMatch(list, list2);

    } //main

    /**
     * Testing map method.
     * @param list String list used
     * @param list2 Integer list used
     */
    public static void demoMap(GenList<String> list, GenList<Integer> list2) {
        GenList<String> list4 = list2.map( t -> Integer.toString(t));
        GenList<Integer> list3 = list4.map( t -> Integer.parseInt(t));
        System.out.println("Map Method - Strings: " +
                           list4.makeString(", ").equals("2, 5, 90, 100, 23, 90, 99"));
        System.out.println("Map Method - Integers: " +
                           list3.makeString(", ").equals("2, 5, 90, 100, 23, 90, 99"));
    } //demoMap

    /**
     * Testing reduce method.
     * @param list String list used
     * @param list2 Integer list used
     */
    public static void demoReduce(GenList<String> list, GenList<Integer> list2) {
        BinaryOperator<Integer> boI = (Integer t, Integer u) -> t + u;
        BinaryOperator<String> boS = (String a, String b) -> a + b;
        System.out.println("Reduce Method - Integers: " + (list2.reduce(0, boI) == 409));
        System.out.println("Reduce Method - Strings: " + list.reduce("", boS).equals("abcd"));
    } //demoReduce

    /**
     * Testing filter method.
     * @param list String list used
     * @param list2 Integer list used
     */
    public static void demoFilter(GenList<String> list, GenList<Integer> list2) {
        GenList<Integer> list3 = list2.filter(t -> (t % 2 == 0 && t > 10));
        System.out.println("FilterMethod - Integers: " +
                           list3.makeString(", ").equals("90, 100, 90"));
        list.add("Hello");
        list.add("world");
        list.add("!!!");
        GenList<String> list4 = list.filter(t -> (t.length() > 2 && !t.contains("!")));
        System.out.println("FilterMethod - Strings: " +
                           list4.makeString(", ").equals("Hello, world"));
    } //demoFilter

    /**
     * Testing min method.
     * @param list String list used
     * @param list2 Integer list used
     */
    public static void demoMin(GenList<String> list, GenList<Integer> list2) {
        Comparator<Integer> cInt = (Integer a, Integer b) -> a.compareTo(b);
        Comparator<String> cString = (String a, String b) -> a.compareTo(b);
        GenList<String> list4 = list.filter(t -> t.length() > 2);
        System.out.println("Min Method - Strings: " + list4.min(cString).equals("!!!"));
        System.out.println("Min Method - Integers: " + (list2.min(cInt) == 2));
    } //demoMin

    /**
     * Testing allMatch method.
     * @param list String list used
     * @param list2 Integer list used
     */
    public static void demoAllMatch(GenList<String> list, GenList<Integer> list2) {
        Predicate<String> pred = t -> t.length() == 1;
        GenList<Integer> list4 = list2.filter(t -> t % 2 == 0);
        System.out.println("AllMatch Method - Strings: " + list.allMatch( t -> t.length() < 10));
        System.out.println("AllMatch Method - Integers: " +
                           list4.allMatch(t -> (t >= 0 && t % 2 == 0)));
    } //demoAllMatch

} //LinkedGenListTest
