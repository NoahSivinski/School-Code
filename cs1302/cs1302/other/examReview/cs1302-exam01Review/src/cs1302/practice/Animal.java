package cs1302.practice;

import cs1302.inter.Moveable;

public abstract class Animal implements Moveable {
    private String name;

    public Animal(String name) {
        setName(name);
    } // constructor

    public abstract boolean hasLegs();

    public abstract void sound();

    public void setName(String n) {
        this.name = n;
    } // setName

    public String getName() {
        return this.name;
    } // getName

} // Animal
