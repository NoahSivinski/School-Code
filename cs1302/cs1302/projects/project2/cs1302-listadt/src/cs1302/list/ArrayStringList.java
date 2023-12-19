package cs1302.list;

import cs1302.listadt.StringList;
import java.util.Iterator;

/**
 * This class implements the {@code StringList} interface using an array *.
 */
public class ArrayStringList extends AbstractStringList {

    private String[] list;
    private String[] temp;
    private int length;
    private int size = 0;

    /**
     * Default Constructor.
     */
    public ArrayStringList() {
        length = 10;
        list = new String[length];
    } //ArrayStringList()

    /**
     * This is a copy constructor for the class. It makes the new list a deep copy of the
     * {@code other} parameter.
     * @param other the initial list of strings
     */
    public ArrayStringList(StringList other) {
        length = other.size();
        list = new String[length];
        for (int i = 0; i < list.length; i++) {
            list[i] = other.get(i);
            size++;
        } //for
    } //ArrayStringList()

/**
 * Increment the array list by 10.
 */
    private void increaseListLength() {
        length += 10;
        String[] tempList = new String[length];
        for (int i = 0; i < list.length; i++) {
            tempList[i] = list[i];
        } //for
        list = tempList;
    } //increaseListLength

    /**
     * Returns the size of this.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return size;
    } //size

    /**
     * Gets the String at the specified index.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Error: the specified index is out of bounds");
        } else {
            return list[index];
        } //if-else

    } //get

    /**
     * Sets the index to s.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public String set(int index, String s) {
        checker(s);
        if (index != 0 && (index < 0 || index >= this.size())) {
            throw new IndexOutOfBoundsException("Error: the specified index is out of bounds");
        } //if
        String temp = list[index];
        list[index] = s;
        return temp;
    } //set

    /**
     * Clears the list.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public void clear() {
        String[] newList = new String[10];
        list = newList;
        size = 0;
    } //clear

    /**
     * Adds s at index.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean add(int index, String s) {
        checker(s);
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Error: the specified index if out of bounds");
        } //if
        if (this.size() == list.length) {
            increaseListLength();
        } //if
        for (int i = this.size(); i > index; i--) {
            list[i] = list[i - 1];
        } //for
        list[index] = s;
        size++;
        return true;
    } //add

    /**
     * Adds s to end of list.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean add(String s) {

        add(this.size(), s);
        return true;
    } //add

    /**
     * Returns a new StringList containing elements of this from a to b.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public StringList splice(int a, int b) {
        if (a < 0 || b > this.size() || a > b) {
            throw new IndexOutOfBoundsException("Error: the specified index is out of bounds");
        } //if
        StringList object = new ArrayStringList();
        int index = a;
        for (int i = a; i < b; i++) {
            object.add(this.get(i));
        } //for
        return object;
    } //splice

    /**
     * Returns a reversed StringList of this.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public StringList reverse() {
        StringList object = new ArrayStringList(this);
        int j = this.size() - 1;
        for (int i = 0; i < this.size(); i++) {
            object.set(i, this.get(j));
            j -= 1;
        } //for
        return object;
    } //reverse

    /**
     * Returns a StringList without any repeating elements.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public StringList distinct() {
        StringList object = new ArrayStringList();
        int count = 0;
        if (this.isEmpty()) {
            return object;
        } //if
        for (int i = 0; i < this.size(); i++) {
            if (!(object.contains(list[i]))) {
                object.add(list[i]);
                count++;
            } //if
        } //for
        return object;
    } //distinct

    /**
     * Removes the String at index.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public String remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Error");
        } //if
        String removed = this.get(index);
        for (int i = index; i < this.size() - 1; i++) {
            list[i] = list[i + 1];
        } //for
        list[this.size() - 1] = null;
        size--;
        return removed;
    } //remove

    /**
     * Checks if this is empty.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        if (list[0] == null) {
            return true;
        } //if
        return false;
    } //isEmpty

    /**
     * Iterates over this.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public Iterator<String> iterator() {
        return new Iterate(this);
    } //iterator

} //ArrayListString
