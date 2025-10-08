package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Represents an Apple iPhone device focused on communication.
 * This class extends IDevice and provides specific functionality
 * for phone-related features and carrier information.
 *
 * @author Jacob, Samuel, Meiko, Son
 * @version 1.0
 */
public class IPhone extends IDevice
{
    private static final String PURPOSE = "talking";

    private double planRemainingMinutes;

    /** The name of the carrier service provider */
    private String carrier;

    /**
     * Constructs a new IPhone with the specified remaining minutes and carrier.gi
     *
     * @param planRemainingMinutes the number of minutes remaining on the phone plan
     * @param carrier the name of the carrier service provider
     */
    public IPhone(final double planRemainingMinutes, final String carrier)
    {
        super(PURPOSE);
        this.planRemainingMinutes = planRemainingMinutes;
        this.carrier              = carrier;
    }

    /**
     * Retrieves the number of minutes remaining on the phone plan.
     *
     * @return the remaining minutes
     */
    public double getPlanRemainingMinutes()
    {
        return planRemainingMinutes;
    }

    /**
     * Sets the number of minutes remaining on the phone plan.
     *
     * @param planRemainingMinutes the new remaining minutes
     */
    public void setPlanRemainingMinutes(final double planRemainingMinutes)
    {
        this.planRemainingMinutes = planRemainingMinutes;
    }

    /**
     * Retrieves the name of the carrier service provider.
     *
     * @return the carrier name
     */
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Sets the name of the carrier service provider.
     *
     * @param carrier the new carrier name
     */
    public void setCarrier(final String carrier)
    {
        this.carrier = carrier;
    }

    /**
     * Prints detailed information about this iPhone's features.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Carrier: " + carrier);
        System.out.println("Remaining Minutes: " + planRemainingMinutes);
    }

    /**
     * Returns a string representation of this iPhone.
     *
     * @return formatted string containing iPhone information
     */
    @Override
    public String toString()
    {
        return super.toString() + " [carrier=" + carrier
                + ", numberOfMinutesRemainingOnPhonePlan=" + planRemainingMinutes + "]";
    }

    /**
     * Compares this iPhone with another object for equality.
     * Two iPhones are considered equal if they have the same remaining minutes.
     *
     * @param o the object to compare with
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final IPhone iPhone = (IPhone) o;
        return Objects.equals(iPhone.planRemainingMinutes, planRemainingMinutes);
    }

    /**
     * Generates a hash code for this iPhone based on the remaining minutes.
     *
     * @return hash code for this object
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(planRemainingMinutes);
    }
}