package cs1302.shapes;

/**
 * A Square is an {@link Rectangle} where all sides have the same length.
 */
public class Square extends Rectangle {

    /**
     * Constructs a {@link Square} object with the specified radius length.
     *
     * @param length the length of the Square.
     */
    public Square(double length) {
        /* A circle is the same as an ellipse where the semi-major and semi-minor axis lengths are
         * equal.
         */
        super(length, length);
        setName("Square");
    } // Square
} // Square
