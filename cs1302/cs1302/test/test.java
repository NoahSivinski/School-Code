import java.util.List;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        List<String> list = Arrays.asList("one", "two", "three", "oneX");
        System.out.println("method test: " + shortNoXorZ(list));
    } //main

    public static long factorial(int n) {
        if (n == 0) { return 1; }
        return n * factorial(n - 1);
    } //factorial

    public static int shortNoXorZ (List<String> l) {
        if (l == null) {
            return -1;
        } //if
        return l.stream()
            .filter(s -> s.length() < 5 && !(s.contains("X") || s.contains("Z")))
            .mapToInt(s -> s.length())
            .sum();
    } // addToEnd
} //test
