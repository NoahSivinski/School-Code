package cs1302.ce06.impl;

import cs1302.ce06.contract.Drivable;

/**
 * This class represents a plane. It implements
 * the {@link cs1302.ce06.contract.Drivable} interface.
 *
 */
public class Plane implements Drivable {
    private double speed; // in mph
    private double maxSpeed; // in mph

    /**
     * Constructs a {@code Plane} object with a specified
     * maximum speed. The maximum speed of the object
     * will default to zero if a negative value is given.
     * @param maxSpeed the maximum speed of the {@code Plane}
     */
    public Plane(double maxSpeed) {
        speed = 0;
        if (maxSpeed >= 0) {
            this.maxSpeed = maxSpeed;
        } // if
    } //Plane

    /**
     *{@inheritDoc}
     */
    public boolean speedUp (double amount) {
        boolean success = false;
        if (speed + amount <= maxSpeed) {
            speed += amount;
            success = true;
        } // if
        return success;
    } // speedUp

    /**
     * {@inheritDoc}
     */
    public boolean slowDown(double amount) {
        boolean success = false;
        if (speed - amount >= 0) {
            speed -= amount;
            success = true;
        }
        return success;
    } // slowDown

    /**
     * {@inheritDoc}
     */
    public void stop() {
        speed = 0;
    }

    /**
     * Returns a {@code String} representation of this {@code Plane}
     * in the format Plane(speed: speed, maxspeed: maxSpeed).
     *
     * @return the {@code String} representation of this object.
     */
    public String toString() {
        return String.format("Plane(speed: %.2f, maxspeed: %.2f)", speed, maxSpeed);
    }
} // Plane
