public class tester {
    public static void main(String[] args) {
        String a = "hello";
        Object b = a;
        Object c = b;
        Object d = c;
        forEachPrintln();
    } //main

    public static void forEachPrintln(Object ... objs) {
        for (Object obj : objs) {
            System.out.println(obj);
        } //for
    } //forEachPrintln
} //tester
