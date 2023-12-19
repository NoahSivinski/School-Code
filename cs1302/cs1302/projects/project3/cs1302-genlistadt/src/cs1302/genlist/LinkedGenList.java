package cs1302.genlist;

import cs1302.genlistadt.*;
import java.util.Iterator;
import java.util.Comparator;
import java.util.function.*;

/**
 * LinkedGenList Class.
 */
public class LinkedGenList<T> extends BaseGenList<T> {

    private Node<T> list;
    private Node<T> temp;
    private int size;

    /**
     * Default constructor.
     */
    public LinkedGenList() {
        list = new Node<T>();
        size = 0;
    } //LinkedgenList()

    /**
     * Constructor that sets list equal to parameter other.
     * @param other GenList variable that is used to instantiate list
     * @param <U> extends generic type T
     */
    public <U extends T> LinkedGenList(GenList<U> other) {
        if (other == null) {
            throw new NullPointerException("Error: the specified GenList<U> is invalid");
        } //if
        list = new Node<T>();
        size = 0;
        for (int i = 0; i < other.size(); i++) {
            this.add(other.get(i));
        } //for
    } //LinkedGenList()

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
     * Returns the T at index.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Error: the index is out of range");
        } //if
        Node<T> temp2 = list;
        for (int i = 0; i < index; i++) {
            temp2 = temp2.getNext();
        } //for
        return temp2.getObj();
    } //get

    /**
     * Sets index to s.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public T set(int index, T obj) {
        checker(obj);
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Error");
        } //if-else
        Node<T> temp = list;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        } //for
        T old = temp.getObj();
        temp.setObj(obj);

        return old;
    } //set


    /**
     * Adds list to end of this.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public <U extends T> boolean add(GenList<U> list) {
        if (list == null) {
            throw new NullPointerException("Error: the specified GenList<T> is invalid");
        } //if
        if (list.isEmpty()) {
            return false;
        } //if
        GenList<U> temp = new LinkedGenList<U>(list);
        int tempSize = temp.size();
        for (int i = 0; i < tempSize; i++) {
            checker(temp.get(i));
            add(temp.get(i));
        } //for
        return true;
    } //add

    /**
     * Adds list at index.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public <U extends T> boolean add(int index, GenList<U> list) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Error: the specified index is out of bounds");
        } //if
        if (list == null) {
            throw new NullPointerException("Error: the specified GenList<T> is invalid");
        } //if
        if (list.isEmpty()) {
            return false;
        } //if
        GenList<U> temp = new LinkedGenList<U>(list);
        int tempSize = list.size();
        for (int i = 0; i < tempSize; i++) {
            add((index + i), temp.get(i));
        } //for
        return true;
    } //add

    /**
     * Adds t to the end of this.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean add(T t) {
        checker(t);
        if (size == 0) {
            size++;
            list.setObj(t);
        } else {
            Node<T> temp = list;
            for (int i = 0; i < this.size() - 1; i++) {
                temp = temp.getNext();
            } //for
            temp.setNext(new Node<T>(t));
            size++;
        } //if-else
        return true;
    } //add

    /**
     * Adds s at index.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean add(int index, T t) {
        checker(t);
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException("Error");
        } //if
        if (size() == 0 || size() == index) {
            this.add(t);
        } else {
            GenList<T> tempList = new LinkedGenList<T>(this);
            for (int i = 0; i < this.size(); i++) {
                if (index == i) {
                    this.set(i , t);
                } else if (i > index) {
                    this.set(i, tempList.get(i - 1));
                } //if-else
            } //for
            this.add(tempList.get(tempList.size() - 1));
        } //if-else
        return true;
    } //add

    /**
     * Returns whether all the elements of this list pass the test specified by the given predicate.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean allMatch(Predicate<T> p) {
        if (p == null) {
            throw new NullPointerException("Error: the specified Predicate<T> is invalid");
        } //if
        boolean elemPass = true;
        for (int i = 0; i < this.size() && elemPass; i++) {
            elemPass = p.test(this.get(i));
        } // for
        return elemPass;
    } //allMatch

    /**
     * Returns whether at least one element of this list passes the predicate test.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean anyMatch(Predicate<T> p) {
        if (p == null) {
            throw new NullPointerException("Error: the specified Predicate<T> is invalid");
        } //if
        boolean elemPass = false;
        for (int i = 0; i < this.size() && !elemPass; i++) {
            elemPass = p.test(this.get(i));
        } // for
        return elemPass;
    } //anyMatch

    /**
     * Clears list and size.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public void clear() {
        list = null;
        size = 0;
    } //clear

    /**
     * Returns a GenList without any repeating elements.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public GenList<T> distinct() {
        GenList<T> newList = new LinkedGenList<T>();
        Node<T> temp = list;
        if (this.isEmpty()) {
            return newList;
        } //if
        for (int i = 0; i < this.size(); i++) {
            if (!(newList.contains(temp.getObj()))) {
                newList.add(temp.getObj());
            } //if
            temp = temp.getNext();
        } //for
        return newList;
    } //distinct

    /**
     * Returns a new GenList consisting of the elements of this list
     * that pass the test specified by the given predicate.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public GenList<T> filter(Predicate<T> p) {
        if (p == null) {
            throw new NullPointerException("Error: the specified Predicate<T> is invalid");
        } //if
        GenList<T> newList = new LinkedGenList<T>();
        if (this.isEmpty()) {
            return newList;
        } //if
        for (int i = 0; i < this.size(); i++) {
            if (p.test(this.get(i))) {
                newList.add(this.get(i));
            } //if
        } //for
        return newList;
    } //filter

    /**
     * Checks to see if list is empty.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    } //isEmpty

    /**
     * Returns a new GenList consisting of elements of this list transformed by f.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public <R> GenList<R> map(Function<T,R> f) {
        if (f == null) {
            throw new NullPointerException("Error: the specified Function<T, R> is invalid");
        } //if
        if (list == null || size == 0) {
            throw new NullPointerException("Error: the result of using the function is null");
        } //if
        GenList<R> newList = new LinkedGenList<R>();
        Node<T> temp = list;
        if (this.isEmpty()) {
            return newList;
        } //if
        for (int i = 0; i < this.size(); i++) {
            newList.add(f.apply(temp.getObj()));
            temp = temp.getNext();
        } //for
        return newList;
    } //map

    /**
     * Returns a maximal element of this list according to the provided Comparator.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public T max(Comparator<T> c) {
        if (c == null) {
            throw new NullPointerException("Error: the specified Comparator<T> is invalid");
        } //if
        Node<T> temp = list;
        T max = temp.getObj();
        for (int i = 0; i < this.size - 1; i++) {
            if (c.compare(max, temp.getNext().getObj()) < 0) {
                max = temp.getNext().getObj();
            } //if
            temp = temp.getNext();
        } //for
        return max;
    } //max

    /**
     * Returns a minimal element of this list according to the provided Comparator.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public T min(Comparator<T> c) {
        if (c == null) {
            throw new NullPointerException("Error: the specified Comparator<T> is invalid");
        } //if
        Node<T> temp = list;
        T min = temp.getObj();
        for (int i = 0; i < this.size - 1; i++) {
            if (c.compare(min, temp.getNext().getObj()) > 0) {
                min = temp.getNext().getObj();
            } //if
            temp = temp.getNext();
        } //for
        return min;
    } //min

    /**
     * Returns the result of repeatedly applying some combining operation to this list.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public T reduce(T start, BinaryOperator<T> f) {
        T result = start;
        for (T e : this) {
            result = f.apply(result, e);
        } // for
        return result;
    } //reduce

    /**
     * Removes the T at index.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public T remove(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Error");
        } //if
        Node<T> temp = list;
        T removed = this.get(index);
        if (index == 0) {
            list = list.getNext();
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            } //for
            temp.setNext(temp.getNext().getNext());
        } //if-else
        size--;
        return removed;
    } //remove

    /**
     * Returns a reversed version of this.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public GenList<T> reverse() {
        GenList<T> object = new LinkedGenList<T>(this);
        int j = this.size() - 1;
        for (int i = 0; i < this.size(); i++) {
            object.set(i, this.get(j));
            j -= 1;
        } //for
        return object;
    } //reverse

    /**
     * Returns a new GenList containing elements of this from a to b.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public GenList<T> splice(int a, int b) {
        if (a < 0 || b > this.size() || a > b) {
            throw new IndexOutOfBoundsException("Error: the specified index is out of bounds");
        } //if
        GenList<T> object = new LinkedGenList<T>();
        for (int i = a; i < b; i++) {
            object.add(this.get(i));
        } //for
        return object;
    } //splice

    /**
     * Converts this to an array.
     * <p>
     * {@inheritDoc}
     */
    public T[] toArray(IntFunction<T[]> gen) {
        T[] array = gen.apply(this.size);
        for (int i = 0; i < this.size; i++) {
            array[i] = this.get(i);
        } // for
        return array;
    } // toArray

    /**
     * Iterates over this.
     * <p>
     * {@inheritDoc}
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterate<T>(this);
    }

} //LinkedGenList<T>
