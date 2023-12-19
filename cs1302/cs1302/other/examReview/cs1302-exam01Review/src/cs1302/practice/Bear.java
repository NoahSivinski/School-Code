package cs1302.practice;

import cs1302.practice.Mammal;

public class Bear extends Mammal {

    public Bear(String name) {
        super(name);
    } // constructor

    public boolean isFarmMammal() {
        return false;
    } // isFarmMammal

    public void sound() {
        System.out.println("Roar!");
    } // sound()

} // Bear
