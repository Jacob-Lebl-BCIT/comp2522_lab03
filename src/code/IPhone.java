/**
 * Represents an Apple iPhone device focused on communication.
 * This class extends IDevice and provides specific functionality
 * for phone-related features and carrier information.
 *
 * @author Jacob, Samuel, Meiko, Son
 * @version 1.0
 */
public class IPhone extends IDevice {
    /** The number of minutes remaining on the phone plan */
    private double remainingMinutes;

    /** The name of the carrier service provider */
    private String carrierName;

    /**
     * Constructs a new IPhone with the specified remaining minutes and carrier.
     *
     * @param remainingMinutes the number of minutes remaining on the phone plan
     * @param carrierName the name of the carrier service provider
     */
    public IPhone(double remainingMinutes, String carrierName) {
        super("talking");
        this.remainingMinutes = remainingMinutes;
        this.carrierName = carrierName;
    }

    /**
     * Retrieves the number of minutes remaining on the phone plan.
     *
     * @return the remaining minutes
     */
    public double getRemainingMinutes() {
        return remainingMinutes;
    }

    /**
     * Sets the number of minutes remaining on the phone plan.
     *
     * @param remainingMinutes the new remaining minutes
     */
    public void setRemainingMinutes(double remainingMinutes) {
        this.remainingMinutes = remainingMinutes;
    }

    /**
     * Retrieves the name of the carrier service provider.
     *
     * @return the carrier name
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the name of the carrier service provider.
     *
     * @param carrierName the new carrier name
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * Prints detailed information about this iPhone's features.
     */
    @Override
    public void printDetails() {
        System.out.println("Carrier Name: " + carrierName);
        System.out.println("Remaining Minutes: " + remainingMinutes);
    }

    /**
     * Returns a string representation of this iPhone.
     *
     * @return formatted string containing iPhone information
     */
    @Override
    public String toString() {
        return super.toString() + ", carrierName=" + carrierName
                + ", remainingMinutes=" + remainingMinutes + "]";
    }

    /**
     * Compares this iPhone with another object for equality.
     * Two iPhones are considered equal if they have the same remaining minutes.
     *
     * @param obj the object to compare with
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IPhone) {
            IPhone iPhone = (IPhone) obj;
            return iPhone.remainingMinutes == this.remainingMinutes;
        } else {
            return false;
        }
    }

    /**
     * Generates a hash code for this iPhone based on the remaining minutes.
     *
     * @return hash code for this object
     */
    @Override
    public int hashCode() {
        return Double.hashCode(remainingMinutes);
    }
}