package cs1302.sorting;

import java.util.Comparator;
import java.util.Arrays;

/**
 * Bubble Sort Class.
 */
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        Integer[] array = {3, 2, 1, 5, 4};
        System.out.println("Original Array: " + Arrays.toString(array)); // [ 3, 2, 1, 5, 4 ]
        bubble(array, 0, 4, Integer::compareTo);
        System.out.println("Bubble Sorted Array with 0 lo and 4 hi: " +
                           Arrays.toString(array)); // [ 2, 1, 3, 4, 5 ]
        Integer[] array2 = {5, 4, 2, 3, 1};
        System.out.println("Original Array: " + Arrays.toString(array2)); // [ 5, 4, 2, 3, 1 ]
        bubbleSort(array2, 0, 4, Integer::compareTo);
        System.out.println("Bubble Sorted Array with 0 lo and 4 hi: " +
                           Arrays.toString(array2)); // [ 1, 2, 3, 4, 5 ]

    } // main

    /**
     * Bubble sort method.
     * @param array array to be sorted
     * @param lo low integer
     * @param hi high integer
     * @param c comparator to be used
     * @param <T> any object.
     */
    public static <T> void bubble(T[] array, int lo, int hi, Comparator<T> c) {
        for (int i = lo; i < hi; i++) {
            if (c.compare(array[i], array[i + 1]) > 0) {
                T temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            } // if
        } // for
    } // bubble

    /**
     * Bubble sort method.
     * @param array array to be sorted
     * @param lo low integer
     * @param hi high integer
     * @param c comparator to be used
     * @param <T> any object
     */
    public static <T> void bubbleSort(T[] array, int lo, int hi, Comparator<T> c) {
        for (int i = hi; i > lo; i--) {
            bubble(array, lo, i, c);
        } //for
    } //bubbleSort

} // BubbleSort
