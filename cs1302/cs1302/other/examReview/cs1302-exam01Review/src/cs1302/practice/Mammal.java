package cs1302.practice;

import cs1302.practice.Animal;

    // abstract classes are like normal concrete classes
    // except they can have abstract methods
public abstract class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    } // constructor

    public abstract void sound();

    public abstract boolean isFarmMammal();

    // all Mammals have legs
    public boolean hasLegs() {
        return true;
    } // hasLegs


} // Mammal
