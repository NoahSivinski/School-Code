package cs1302.list;

import cs1302.listadt.StringList;
import java.util.Iterator;

/**
 * This class implements the {@code StringList} interface using a List.
 */
public class LinkedStringList extends AbstractStringList {

    private StringList.Node list;
    private StringList.Node temp;
    private int size;

    /**
     * Default constructor.
     */
    public LinkedStringList() {
        list = new StringList.Node();
        size = 0;
    } //LinkedStringList()

    /**
     * Constructor that sets list equal to parameter other.
     * @param other StringList variable that is used to instantiate list
     */
    public LinkedStringList(StringList other) {

        list = new StringList.Node();
        size = 0;
        for (int i = 0; i < other.size(); i++) {
            this.add(other.get(i));
        } //for
    } //LinkedStringList()

    /**
     * Returns size.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return size;
    } //size

    /**
     * Returns the String at index.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public String get(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Error: the index is out of range");
        } //if
        StringList.Node temp2 = list;
        for (int i = 0; i < index; i++) {
            temp2 = temp2.getNext();
        } //for
        return temp2.getStr();
    } //get

    /**
     * Sets index to s.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public String set(int index, String s) {
        checker(s);
        if (index == 0 & size() == 0) {
            this.add(s);
        } else if (index != 0 && (index < 0 || index >= this.size())) {
            throw new IndexOutOfBoundsException("Error");
        } //if-else
        StringList.Node temp = list;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        } //for
        String old = temp.getStr();
        temp.setStr(s);

        return old;
    } //set

    /**
     * Adds s at index.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean add(int index, String s) {
        checker(s);
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException("Error");
        } //if
        if (size() == 0 || size() == index) {
            this.add(s);
        } else {
            StringList tempList = new LinkedStringList(this);
            for (int i = 0; i < this.size(); i++) {
                if (index == i) {
                    this.set(i , s);
                } else if (i > index) {
                    this.set(i, tempList.get(i - 1));
                } //if-else
            } //for
            this.add(tempList.get(tempList.size() - 1));
        } //if-else
        return true;
    } //add

    /**
     * Adds s to end of this.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean add(String s) {
        checker(s);
        if (size == 0) {
            size++;
            list.setStr(s);
        } else {
            StringList.Node temp = list;
            for (int i = 0; i < this.size() - 1; i++) {
                temp = temp.getNext();

            } //for
            temp.setNext(new StringList.Node(s));
            size++;
        } //if-else
        return true;
    } //add

    /**
     * Clears this.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public void clear() {
        StringList.Node temp = new StringList.Node();
        list = temp;
        size = 0;
    } //clear

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
        StringList object = new LinkedStringList();
        int index = a;
        for (int i = a; i < b; i++) {
            object.add(this.get(i));
        } //for
        return object;
    } //splice

    /**
     * Returns a reversed version of this.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public StringList reverse() {
        StringList object = new LinkedStringList(this);
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
        StringList newList = new LinkedStringList();
        StringList.Node temp = list;
        int count = 0;
        if (this.isEmpty()) {
            return newList;
        } //if
        for (int i = 0; i < this.size(); i++) {
            if (!(newList.contains(temp.getStr()))) {
                newList.add(temp.getStr());
                count++;
            } //if
            temp = temp.getNext();
        } //for
        return newList;
    } //distinct

    /**
     * Removes the String at index.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public String remove(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Error");
        } //if
        StringList.Node temp = list;
        String removed = this.get(index);
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        } //for
        temp.setNext(temp.getNext().getNext());
        size--;
        return removed;
    } //remove

    /**
     * Checks to see if list is empty.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        if (list == null || list.getStr() == null) {
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
    }

} //LinkedStringList
