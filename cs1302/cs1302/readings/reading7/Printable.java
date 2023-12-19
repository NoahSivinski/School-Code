import java.io.PrintStream;

public interface Printable {
    public default void print(PrintStream dest, String msg) {
        dest.println(msg);
    } //print
} //Printable
