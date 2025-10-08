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

    private boolean hasCase;
    private String osVersion;

    /**
     * Constructs a new IPad with the specified case status and OS version.
     *
     * @param hasCase   whether the iPad has a protective case
     * @param osVersion the operating system version
     */
    public IPad(final boolean hasCase,
                final String osVersion)
    {
        super(PURPOSE);
        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }

    // Getters and setters:

    /**
     * Checks if this iPad has a protective case.
     *
     * @return true if the iPad has a case, false otherwise
     */
    public boolean hasCase()
    {
        return hasCase;
    }

    /**
     * Sets whether this iPad has a protective case.
     *
     * @param hasCase true if the iPad has a case, false otherwise
     */
    public void setHasCase(final boolean hasCase)
    {
        this.hasCase = hasCase;
    }

    /**
     * Gets the operating system version of this iPad.
     *
     * @return the operating system version
     */
    public String getOsVersion()
    {
        return osVersion;
    }

    /**
     * Sets the operating system version of this iPad.
     *
     * @param osVersion the new operating system version
     */
    public void setOsVersion(final String osVersion)
    {
        this.osVersion = osVersion;
    }

    // Implement IDevice methods:

    /**
     * Prints detailed information about this iPad's features.
     */
    @Override
    public void printDetails()
    {
        System.out.println("OS Version: " + osVersion);
        System.out.println("Has Case: " + hasCase);
    }

    /**
     * Returns a string representation of this iPad.
     *
     * @return formatted string containing iPad information
     */
    @Override
    public String toString()
    {
        return super.toString() + " [hasCase=" + hasCase
                + ", osVersion=" + osVersion + "]";
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
        return Objects.equals(osVersion, iPad.osVersion);
    }

    /**
     * Generates a hash code for this iPad based on the OS version.
     *
     * @return hash code for this object
     */
    @Override
    public int hashCode()
    {
        return osVersion.hashCode();
    }
}
