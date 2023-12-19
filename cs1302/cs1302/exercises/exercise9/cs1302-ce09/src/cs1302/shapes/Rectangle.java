package cs1302.shapes;

/**
 * An ellipse is a shape comprising of a curve in a plane surrounding two focal points such that
 * the sum of the distances to the two focal points is constant for every point on the curve. The
 * line through the focal points is called the major axis, and the line perpendicular to it through
 * the center is called the minor axis. If you halve each of these lengths, then they are known as
 * the semi-major axis and semi-minor axis, respectively.
 *
 */
public class Rectangle extends Shape {

    /** Length of the semi-major axis. */
    private double length;

    /** Length of the semi-minor axis. */
    private double width;

    /**
     * Constructs an {@link Rectangle} object with the specified length and width.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */
    public Rectangle(double length, double width) {
        setName("Rectangle");
        this.length = length;
        this.width = width;
    } // Rectangle

    /**
     * Returns the length.
     *
     * @return the length.
     */
    public double getLength() {
        return length;
    } // getLength

    /**
     * Returns the width.
     *
     * @return the width.
     */
    public double getWidth() {
        return width;
    } // getWidth

    @Override
    public double getArea() {
        return length * width;
    } // getArea()

    /**
     * Returns the perimeter.
     *
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {

        return ((2 * length) + (2 * width));
    } // getPerimeter()

} // Rectangle
