package cs1302.ce07.contract;

/**
 * Represents the interface for an object that is drivable.
 * Drivable objects can {@code speedUp} and {@code slowDown}.
 */
public interface Drivable {

    /**
     * LicenseClass is an enum that represents license classifications.
     *
     */
    enum LicenseClass {
        /** Indicates the Non-commercial roadway license. */
        NONCOMMERCIALROADWAY,
/** Indicates the Commercial roadway license. */
        COMMERCIALROADWAY,
/** Indicates the Watercraft license. */
        WATERCRAFT,
/** Indicates the Aircraft license. */
        AIRCRAFT,
/** Indicates the Unclassified license. */
        UNCLASSIFIED
    } //LicenseClass

/**
 * Returns this {@code object's} license classification.
 * @return this {@code object's} license classification
 */
    public default LicenseClass getLicenseClass() {
        return LicenseClass.UNCLASSIFIED;
    } //getLicenseClass

/**
 * Increases the speed of the object by the specified amount.
 * @param amount the specified amount in mph
 * @return true when the operation was successful; false otherwise
 */
    public boolean speedUp(double amount);

    /**
     * Decreases the speed of the object by the specified amount.
     * @param amount the specified amount in mph
     * @return true when the operation was successful; false otherwise
     */
    public boolean slowDown(double amount);

} // Drivable
