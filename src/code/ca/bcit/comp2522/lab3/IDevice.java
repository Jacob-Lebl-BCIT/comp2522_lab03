package ca.bcit.comp2522.lab3;

/**
 * IDevice a high level representation of apple mobile devices.
 * @author Jacob, Samuel, Meiko, Son
 * @version 1.0
 */
public abstract class IDevice
{

    private final String purpose;

    /**
     * Constructor for IDevice.
     *
     * @param purpose short description of the device's purpose.
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * getPurpose returns the purpose of the device as a string.
     */
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Abstract method that must be implemented by child classes
     * to print detailed information about the device's specific features.
     */
    public abstract void printDetails();

    /**
     * Returns a string representation of this IDevice.
     *
     * @return formatted string containing device purpose
     */
    @Override
    public String toString()
    {
        return "IDevice [purpose=" + purpose + "]";
    }

    /**
     * Abstract equals method for comparing IDevice objects.
     * Must be implemented by child classes.
     *
     * @param obj the object to compare with
     * @return true if objects are equal, false otherwise
     */
    @Override
    public abstract boolean equals(final Object obj);

    /**
     * Abstract hashCode method for generating hash codes.
     * Must be implemented by child classes.
     *
     * @return hash code for this object
     */
    @Override
    public abstract int hashCode();



}
