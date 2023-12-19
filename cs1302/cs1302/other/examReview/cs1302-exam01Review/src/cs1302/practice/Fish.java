package cs1302.practice;

import cs1302.practice.Animal;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    } // constructor

    public boolean hasLegs() {
        return false;
    } // hasLegs

    public void sound() {
        System.out.println("???? fish??");
    } // sound
} // Fish
