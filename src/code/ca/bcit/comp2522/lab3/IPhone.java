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

    private String carrierName;

    /**
     * Constructs a new IPhone with the specified remaining minutes and carrier.gi
     *
     * @param planRemainingMinutes the number of minutes remaining on the phone plan
     * @param carrierName the name of the carrier service provider
     */
    public IPhone(final double planRemainingMinutes,
                  final String carrierName)
    {
        super(PURPOSE);
        this.planRemainingMinutes = planRemainingMinutes;
        this.carrierName          = carrierName;
    }

    public double getPlanRemainingMinutes()
    {
        return planRemainingMinutes;
    }

    public void setPlanRemainingMinutes(final double planRemainingMinutes)
    {
        this.planRemainingMinutes = planRemainingMinutes;
    }

    public String getCarrierName()
    {
        return carrierName;
    }

    public void setCarrierName(final String carrierName)
    {
        this.carrierName = carrierName;
    }

    /**
     * Prints detailed information about this iPhone's features.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Carrier: " + carrierName);
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
        return super.toString() + " [carrier=" + carrierName
                                + ", numberOfMinutesRemainingOnPhonePlan=" + planRemainingMinutes + "]";
    }

    /**
     * Compares this iPhone with another object for equality.
     * Two iPhones are considered equal if they have the same
     * remaining minutes in their plan.
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

    @Override
    public int hashCode()
    {
        return Double.hashCode(planRemainingMinutes);
    }
}