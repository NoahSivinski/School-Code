package cs1302.inter;

public interface Moveable {
    // visibility on variables and methods must be public for interface

    // variables in interfaces are static and final by default
    public boolean canMove = true;

    // methods in interfaces must be abstract (or default methods)
    // default methods give you the ability to add methods without
    // breaking the classes which implement Moveable
    // throw exceptions
    public boolean hasLegs();

}
