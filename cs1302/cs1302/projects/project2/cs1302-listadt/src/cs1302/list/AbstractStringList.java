package cs1302.list;

import cs1302.listadt.*;

/**
 * Abstract Parent Class.
 */
public abstract class AbstractStringList implements StringList {

    /**
     * Checks to see if a String is null or empty.
     * @param s String being checked
     */
    public void checker(String s) {
        if (s == null) {
            throw new NullPointerException("Error: the specified string is null");
        } else if (s.equals("")) {
            throw new IllegalArgumentException("Error: the specified string is empty");
        } //if-else
    } //checker

    /**
     * Adds sl to end of this.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean add(StringList sl) {
        if (sl == null) {
            throw new NullPointerException("Error: the specified sl is invalid");
        } //if
        if (sl.isEmpty()) {
            return false;
        } //if
        for (int i = 0; i < sl.size(); i++) {
            checker(sl.get(i));
            add(sl.get(i));
        } //for
        return true;
    } //add

    /**
     * Adds sl at index.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean add(int index, StringList sl) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Error: the specified index is out of bounds");
        } //if
        if (sl == null) {
            throw new NullPointerException("Error: the specified sl is invalid");
        } //if
        if (sl.isEmpty()) {
            return false;
        } //if
        for (int i = 0; i < sl.size(); i++) {
            add((index + i), sl.get(i));
        } //for
        return true;
    } //add

    /**
     * Finds the first occurence of s, returns -1 else.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public int indexOf(String s) {
        checker(s);
        int check = -1;
        for (int i = 0; i < this.size() && check < 0; i++) {
            if (s.equals(this.get(i))) {
                check = i;
            } //if
        } //for
        return check;
    } //indexOf

    /**
     * Finds the first occurance of s, ignoring case, returns -1 else.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public int indexOfIgnoreCase(String s) {
        checker(s);
        int check = -1;
        for (int i = 0; i < this.size() && check < 0; i++) {
            if (s.equalsIgnoreCase(this.get(i))) {
                check = i;
            } //if
        } //for
        return check;
    } //indexOfIgnoreCase

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
            print += this.get(i) + sep;
        } //for
        if (this.size() == 0) {
            return print;
        } else {
            print += this.get(this.size() - 1);
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
     * Converts this to a String array.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public String[] toArray() {
        String[] array = new String[this.size()];
        if (this.size() == 0) {
            return array;
        } //if
        int count = 0;
        for (int i = 0; i < this.size(); i++) {
            array[i] = this.get(i);
        } //for
        return array;
    } //toArray

    /**
     * Checks if this contains o.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean contains(String o) {
        this.checker(o);
        for (int i = 0; i < this.size(); i++) {
            if (o.equals(this.get(i))) {
                return true;
            } //if
        } //for
        return false;
    } //contains

    /**
     * Checks if this contains o ignoring case.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean containsIgnoreCase(String o) {
        this.checker(o);
        for (int i = 0; i < this.size(); i++) {
            if (o.equalsIgnoreCase(this.get(i))) {
                return true;
            } //if
        } //for
        return false;
    } //containsIgnoreCase

    /**
     * Checks if this contains substring o.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean containsSubstring(String o) {
        this.checker(o);
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).contains(o)) {
                return true;
            } //if
        } //for
        return false;
    } //containsSubstring

} //AbstractStringList
