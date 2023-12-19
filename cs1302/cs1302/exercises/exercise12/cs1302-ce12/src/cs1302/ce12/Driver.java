package cs1302.ce12;

/**
 * Driver program for cs1302 class exercise 12 using various types of
 * container objects.
 *
 * @author Brad Barnes and Supa' Mike
 * @version 1.0
 */

public class Driver {

    /**
     * Creates objects for each type of container to check basic functionality.
     * @param args argument parameter
     */
    public static void main(String[] args) {

        //Declare objects of all of our container types
        ObjectContainer oc = new ObjectContainer("hello");

        //Print the contents of each container
        System.out.println(oc.get());

    } // main

} // Driver
