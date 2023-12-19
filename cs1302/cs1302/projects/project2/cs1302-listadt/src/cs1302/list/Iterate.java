package cs1302.list;

import cs1302.listadt.*;
import java.util.Iterator;

/**
 * Iterator Class.
 */
public class Iterate implements Iterator<String> {
    private StringList sl;
    private int place;

    /**
     * Constructor.
     * @param sl stringlist used
     */
    public Iterate(StringList sl) {
        this.sl = sl;
        place = 0;
    } //Iterator

    /**
     * Checks if sl has a next element.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean hasNext() {
        return place < sl.size();
    } //hasNext

    /**
     * Returns the next element in sl.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public String next() {

        String s = sl.get(place++);
        return s;
    } //next

} //Iterator
