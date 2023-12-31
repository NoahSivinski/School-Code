package cs1302.ce13;

/**
 * Driver program for cs1302 class exercise 13 using various types of
 * container objects.
 *
 * @author Brad Barnes and Supa' Mike
 * @version 1.0
 */

public class Driver {

    /**
     * Creates objects for each type of container to check basic functionality.
     * @param args command line argument array.
     */
    public static void main(String[] args) {

        Container<String> stringHead = createStringList();
        Container<Double> doubleHead = createDoubleList();

        String lastString = (String) stringHead.getNext()
            .getNext()
            .getNext()
            .get();

        Double lastDouble = (Double) doubleHead.getNext()
            .getNext()
            .getNext()
            .get();

        System.out.println(lastString);
        System.out.println(lastDouble);

    } // main

    /**
     * Returns the first {@code Container} reference in a list
     * of {@code Container} objects. The returned list is made
     * up of four {@code Container} objects, each containing
     * a single {@code String}.
     *
     * @return a reference to the head of the {@code Container}
     * list.
     */
    private static Container<String> createStringList() {
        Container<String> oc = new Container<String>("Mike");
        oc = new Container<String>("Steve", oc);
        oc = new Container<String>("Linda", oc);
        oc = new Container<String>("Deborah", oc);
        return oc;
    } // createStringList

    /**
     * Returns the first {@code Container} reference in a list
     * of {@code Container} objects. The returned list is made
     * up of four {@code Container} objects, each containing
     * a single {@code Double}.
     *
     * @return a reference to the head of the {@code Container}
     * list.
     */
    private static Container<Double> createDoubleList() {
        Container<Double> oc = new Container<Double>(2.0);
        oc = new Container(495.18, oc);
        oc = new Container<Double>(1234.18, oc);
        oc = new Container<Double>(1.237, oc);
        return oc;
    } // createStringList

} // Driver
