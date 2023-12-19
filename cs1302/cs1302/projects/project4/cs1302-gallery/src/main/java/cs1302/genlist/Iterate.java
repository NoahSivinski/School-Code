package cs1302.genlist;

import cs1302.genlistadt.*;
import java.util.Iterator;

/**
 * Iterator Class.
 */
public class Iterate<T> implements Iterator<T> {
    private GenList<T> gl;
    private int place;

    /**
     * Constructor.
     * @param gl GenList used
     */
    public Iterate(GenList<T> gl) {
        this.gl = gl;
        place = 0;
    } //Iterate

    /**
     * Checks if gl has a next element.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean hasNext() {
        return place < gl.size();
    } //hasNext

    /**
     * Returns the next element in gl.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public T next() {
        T t = gl.get(place++);
        return t;
    } //next

} //Iterator
