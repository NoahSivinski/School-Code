package cs1302.ce06;

import cs1302.ce06.impl.Car;
import cs1302.ce06.impl.Plane;
import cs1302.ce06.contract.Drivable;

/**
 * A driver program to test the functionality of
 * {@code cs1302.ce06.impl.Drivable} which implements
 * {@code cs1302.ce06.contract.Drivable}.
 */
public class Driver {

    /**
     * Attempts to speedup and slowdown the {@link cs1302.ce06.contract.Drivable} object
     * by a specified amount. If the {@link cs1302.ce06.contract.Drivable} object is unable
     * to speedup or slowdown by the specified amount, an appropriate message is
     * printed.
     *
     * @param vehicle the vehicle to test
     * @param speedupAmount the amount to speedup the vehicle
     * @param slowdownAmount the amount to slowdown the vehicle
     */
    public static void test(Drivable vehicle, double speedupAmount,
                            double slowdownAmount) {
        System.out.println(vehicle);
        if (vehicle.speedUp(speedupAmount)) {
            System.out.println("The vehicle sped up by " + speedupAmount + " mph");
        } else {
            System.out.println("The vehicle cannot go that fast");
        } // if

        if (vehicle.slowDown(slowdownAmount)) {
            System.out.println("The vehicle slowed down by " + slowdownAmount + " mph");
        } else {
            System.out.println("The vehicle is cannot slow down by that amount");
        } // if

        System.out.println(vehicle);
    } // test

    /**
     * Main method that calls other methods to run the program.
     * @param args the command-line arguments to the program
     */
    public static void main(String[] args) {
        Drivable fastCar = new Plane(185.5);
        Drivable slowCar = new Car(75.0);

        System.out.println("--------------------");

        test(fastCar, 200.5, 20);
        System.out.println("--------------------");

        test(fastCar, 125, 20);
        System.out.println("--------------------");

        test(slowCar, 85, 20);
        System.out.println("--------------------");

        test(slowCar, 65, 65);
        System.out.println("--------------------");
    } // main
} // Driver
