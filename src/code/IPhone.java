import java.util.Objects;

public class IPhone extends IDevice
{
    private static final String purpose = "talking";
    private double minRemaining;
    private String carrier;

    /**
     * Constructor for IDevice.
     *
     * @param minRemaining  the number of minutes remaining in the phone plan.
     * @param carrier       the phone carrier.
     */
    public IPhone (double minRemaining, String carrier){
        super(purpose);
        this.minRemaining = minRemaining;
        this.carrier = carrier;
    }

    @Override
    public String printDetails() {
        return minRemaining + " minutes remaining in the phone plan with "
                + carrier + " carrier";
    }

    /**
     * @return all instance variables in a single String.
     */
    @Override
    public String toString() {
        // Get the string from the superclass.
        String IDeviceString = super.toString();
        // Sum of all instance variables.
        return IDeviceString + " " + minRemaining + " " + carrier;
    }

    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof IPhone otherIPhone))
        {
            return false;
        }
        return minRemaining == otherIPhone.minRemaining;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minRemaining);
    }

    // === Setters & Getters ===

    /**
     * @return the number of minutes remaining in the phone plan.
     */
    public double getMinRemaining() {
        return minRemaining;
    }

    /**
     * setMinRemaining sets the number of minutes remaining in the phone plan.
     *
     * @param minRemaining double representing minutes remaining.
     */
    public void setMinRemaining(final double minRemaining) {
        this.minRemaining = minRemaining;
    }

    /**
     * @return the phone carrier.
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * setCarrier sets the phone carrier.
     *
     * @param carrier String representing the carrier.
     */
    public void setCarrier(final String carrier) {
        this.carrier = carrier;
    }
}