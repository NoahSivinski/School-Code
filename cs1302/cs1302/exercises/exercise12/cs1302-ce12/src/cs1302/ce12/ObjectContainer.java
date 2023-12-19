package cs1302.ce12;

/**
 * Class.
 */
public class ObjectContainer {

    private Object contents;

    /**
     * Constructor.
     * @param contents of type Object
     */
    public ObjectContainer(Object contents) {
        set(contents);
    } //ObjectContainer

    /**
     * Sets contents.
     * @param contents of type Object
     */
    public void set(Object contents) {
        cs1302.Utility.nullCheck("set", contents);
        this.contents = contents;
    } //set

    /**
     * Gets contents.
     * @return contents
     */
    public Object get() {
        return contents;
    } //get

} //ObjectContainer
