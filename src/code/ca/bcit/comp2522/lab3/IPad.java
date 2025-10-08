package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Represents an Apple iPad device focused on learning and education.
 * This class extends IDevice and provides specific functionality
 * for tablet-related features and operating system information.
 *
 * @author Jacob, Samuel, Meiko, Son
 * @version 1.0
 */
public class IPad extends IDevice
{
    private static final String PURPOSE = "learning";

    private boolean hasACase;
    private String operatingSystemVersion;

    /**
     * Constructs a new IPad with the specified case status and OS version.
     *
     * @param hasACase   whether the iPad has a protective case
     * @param operatingSystemVersion the operating system version
     */
    public IPad(final boolean hasACase,
                final String operatingSystemVersion)
    {
        super(PURPOSE);
        this.hasACase = hasACase;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    // Getters and setters:

    /**
     * Checks if this iPad has a protective case.
     *
     * @return true if the iPad has a case, false otherwise
     */
    public boolean getHasACase()
    {
        return hasACase;
    }

    /**
     * Sets whether this iPad has a protective case.
     *
     * @param hasACase true if the iPad has a case, false otherwise
     */
    public void setHasACase(final boolean hasACase)
    {
        this.hasACase = hasACase;
    }

    /**
     * Gets the operating system version of this iPad.
     *
     * @return the operating system version
     */
    public String getOperatingSystemVersion()
    {
        return operatingSystemVersion;
    }

    /**
     * Sets the operating system version of this iPad.
     *
     * @param operatingSystemVersion the new operating system version
     */
    public void setOperatingSystemVersion(final String operatingSystemVersion)
    {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    // Implement IDevice methods:

    /**
     * Prints detailed information about this iPad's features.
     */
    @Override
    public void printDetails()
    {
        System.out.println("OS Version: " + operatingSystemVersion);
        System.out.println("Has A Case: " + hasACase);
    }

    /**
     * Returns a string representation of this iPad.
     *
     * @return formatted string containing iPad information
     */
    @Override
    public String toString()
    {
        return super.toString() + " [hasACase=" + hasACase
                + ", operatingSystemVersion=" + operatingSystemVersion + "]";
    }

    /**
     * Compares this iPad with another object for equality.
     * Two iPads are considered equal if they have the same operating system version.
     *
     * @param o the object to compare with
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final IPad iPad = (IPad) o;
        return Objects.equals(operatingSystemVersion, iPad.operatingSystemVersion);
    }

    /**
     * Generates a hash code for this iPad based on the OS version.
     *
     * @return hash code for this object
     */
    @Override
    public int hashCode()
    {
        return operatingSystemVersion.hashCode();
    }
}
