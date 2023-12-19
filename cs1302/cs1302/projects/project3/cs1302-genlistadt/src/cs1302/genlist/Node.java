package cs1302.genlist;


/**
 * Generic Node Class.
 */
public class Node<T> {

    private T obj;
    private Node<T> next;

    /**
     * Default constructor.
     */
    public Node() {

    } //Node

    /**
     * Constructor initializing obj.
     * @param obj intial obj for this
     */
    public Node(T obj) {
        this.obj = obj;
    } //Node

    /**
     * Constructor initializing obj and next.
     * @param obj intial obj for this
     * @param next initial next for this
     */
    public Node(T obj, Node<T> next) {
        this.obj = obj;
        this.next = next;
    } //Node

    /**
     * Gets this' object.
     * @return T object
     */
    public T getObj() {
        return obj;
    } // getObj

    /**
     * Returns the next node.
     * @return the next node
     */
    public Node<T> getNext() {
        return next;
    } //getNext

    /**
     * Sets this object to obj.
     * @param obj this object set to this
     */
    public void setObj(T obj) {
        this.obj = obj;
    } //setObj

    /**
     * Sets the next node.
     * @param next this' next is set to this
     */
    public void setNext(Node<T> next) {
        this.next = next;
    } //setNext

} //Node
