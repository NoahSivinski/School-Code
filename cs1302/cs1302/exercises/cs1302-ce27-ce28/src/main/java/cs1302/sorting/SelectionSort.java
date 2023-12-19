package cs1302.sorting;

import java.util.Comparator;
import java.util.Arrays;

/**
 * Selection Sort Class.
 */
public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Selection Sort");
        Integer[] array = {2, 3, 1, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(array)); // [ 2, 3, 1, 4, 5 ]
        selectMin(array, 0, 4, Integer::compareTo);
        System.out.println("Array after selectMin with 0 lo and 4 hi: " +
                           Arrays.toString(array)); // [ 1, 3, 2, 4, 5 ]
        Integer[] array2 = {5, 3, 1, 4, 2};
        System.out.println("Original Array: " + Arrays.toString(array2)); // [ 5, 3, 1, 4, 2 ]
        selectionSort(array2, 0, 4, Integer::compareTo);
        System.out.println("Array after selectMin with 0 lo and 4 hi: " +
                           Arrays.toString(array2)); // [ 1, 3, 2, 4, 5 ]

    } // main

    /**
     * Method that find the min in the range and swaps it with lo.
     * @param array array to be analyzed
     * @param lo point to have min element
     * @param hi end of range
     * @param c Comparator to compare with
     * @param <T> any class.
     */
    public static <T> void selectMin(T[] array, int lo, int hi, Comparator<T> c) {
        int minIndex = lo;
        T minO = array[lo];
        for (int i = lo; i <= hi; i++) {
            if (c.compare(array[minIndex], array[i]) > 0) {
                minIndex = i;
                minO = array[i];
            } // if
        } // for
        T temp = minO;
        array[minIndex] = array[lo];
        array[lo] = temp;
    } // selectMin

    /**
     * Method that find the min in the range and swaps it with lo.
     * @param array array to be analyzed
     * @param lo point to have min element
     * @param hi end of range
     * @param c Comparator to compare with
     * @param <T> any comparator.
     */
    public static <T> void selectionSort(T[] array, int lo, int hi, Comparator<T> c) {
        for (int i = 0; i < hi; i++) {
            selectMin(array, i, hi, c);
        } //for
    } //selectionSort

} // SelectionSort
