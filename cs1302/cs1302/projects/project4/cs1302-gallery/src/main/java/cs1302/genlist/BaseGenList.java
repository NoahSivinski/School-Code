package cs1302.genlist;

import cs1302.genlistadt.*;
import java.util.function.*;

/**
 * Abstract Parent Class.
 */
public abstract class BaseGenList<T> implements GenList<T> {

    private Node<T> list;
    private Node<T> temp;
    private int size;

    /**
     * Checks to see if t is null.
     * @param t T being checked
     */
    public void checker(T t) {
        if (t == null) {
            throw new NullPointerException("Error: the specified string is null");
        } //if
    } //checker

    /**
     * Finds the first occurence of t, returns -1 else.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public int indexOf(T t) {
        checker(t);
        int check = -1;
        for (int i = 0; i < this.size() && check < 0; i++) {
            if (t.equals(this.get(i))) {
                check = i;
            } //if
        } //for
        return check;
    } //indexOf

    /**
     * Makes a string of this' elements seperated by sep.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public String makeString(String sep) {
        String print = "";
        if (this.size() == 0) {
            return print;
        } //if
        for (int i = 0; i < this.size() - 1; i++) {
            print += this.get(i).toString() + sep;
        } //for
        if (this.size() == 0) {
            return print;
        } else {
            print += this.get(this.size() - 1).toString();
        }
        return print;
    } //makeString

    /**
     * Makes a string of all elements.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public String makeString() {
        String print = this.makeString("");
        return print;
    } //makeString

    /**
     * Makes a String starting with start, then each element separated by sep, and ending in end.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public String makeString(String start, String sep, String end) {
        String print = start;
        print += this.makeString(sep);
        print += end;
        return print;
    } //makeString

    /**
     * Checks if this contains o.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean contains(T o) {
        checker(o);
        for (int i = 0; i < this.size(); i++) {
            if (o.equals(this.get(i))) {
                return true;
            } //if
        } //for
        return false;
    } //contains

} //BaseGenList<T>
