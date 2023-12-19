package cs1302.ce18;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * This class contains methods related to {@code cs1302-ce18}.
 */
public class MoreLambdaFun {

    /**
     * Main entry-point into the application.
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {

        Quiz[] quizzes = new Quiz[] {
            new Quiz(1,  20, false, 100),
            new Quiz(2,  20, false, 100),
            new Quiz(3,  10,  true,  10),
            new Quiz(4,  10, false,  20),
            new Quiz(5, 100,  true, 100), // 100 pt. bonus quiz?!?
        };

        Predicate<Quiz> bonusPred = t -> t.getTimeLimit() < 20;
        Function<Quiz, String> numberFunc = t -> "Quiz Number: " + t.getNumber();
        MoreLambdaFun.<Quiz>printlnMappedMatches(quizzes, bonusPred, numberFunc);

        Quiz[] lessQuizzes = MoreLambdaFun.copyOf(quizzes, 5, t -> new Quiz[5]);
        for (Quiz q : lessQuizzes) {
            if (q != null) {
                System.out.println("Quiz #: " + q.getNumber());
            } // if
        } // for-each
        System.out.println();
        Quiz[] moreQuizzes = MoreLambdaFun.copyOf(quizzes, 9, t -> new Quiz[9]);

        for (Quiz q : moreQuizzes) {
            if (q != null) {
                System.out.println("Quiz #: " + q.getNumber());
            } // if
        } // for-each
        System.out.println(moreQuizzes.length);

        Quiz[] twentyQuizzes = MoreLambdaFun.copyOf(quizzes, 20, MoreLambdaFun::makeQuizArray);

        for (Quiz q : twentyQuizzes) {
            if (q != null) {
                System.out.println("Quiz #: " + q.getNumber());
            } // if
        } // for-each
        System.out.println(twentyQuizzes.length);

    } // main

    /**
     * Prints the elements of the array that pass the test specified by the
     * given predicate using a string mapper. More formally, this method prints
     * the string mapped elements {@code f.apply(e)} in the array referred to by
     * {@code t} for each {@code e} such that {@code p.test(e)}. Each string
     * mapped element will be printed on its own line.
     *
     * @param <T> the type of the array elements
     * @param t the specified array
     * @param p the specified predicate
     * @param f the specified string mapper
     * @throws NullPointerException if the specified predicate or string mapper
     *                              is {@code null}
     */
    private static <T> void printlnMappedMatches(T[] t, Predicate<T> p, Function<T, String> f) {
        for (T elem : t) {
            if (p.test(elem)) {
                System.out.println(f.apply(elem));
            } //if
        } //for
    } // printlnMappedMatches

    /**
     * Returns a copy of the specified array, truncating or padding with nulls
     * (if necessary) so that the copy has the specified length. For all
     * indices that are valid in both the original array and the copy, the two
     * arrays will contain identical values. For any indices that are valid in
     * the copy but not the original, the copy will contain {@code null}. Such
     * indices will exist if, and only if, {@code l} is greater than
     * {@code a.length}. The resulting array is created using {@code g}.
     *
     * @param <T> the type of the array elements.
     * @param a the array to be copied
     * @param l the length of the copy to be returned
     * @param g a function which produces a new array of the desired type and length
     * @return a copy of the original array with the specified length
     * @throws NegativeArraySizeException if {@code l} is negative
     * @throws NullPointerException if {@code a} or {@code g} is {@code null}
     */
    public static <T> T[] copyOf(T[] a, int l, IntFunction<T[]> g) {
        T[] b = g.apply(l);
        for (int i = 0; i < l; i++) {
            if (i < a.length) {
                b[i] = a[i];
            } else {
                b[i] = null;
            } // else
        } // for
        return b;
    } // copyOf

    /**
     * This method  returns a copy of a Quiz array.
     *
     */
    public static Quiz[] makeQuizArray(int len) {

        return new Quiz[len];
    } // makeQuizArray

} // MoreLambdaFun
