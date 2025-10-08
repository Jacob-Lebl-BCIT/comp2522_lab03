package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Represents an Apple iPhone 16 device with enhanced features.
 * This class extends IPhone and provides additional functionality
 * for advanced camera capabilities and memory specifications.
 *
 * @author Jacob, Samuel, Meiko, Son
 * @version 1.0
 */
public class IPhone16 extends IPhone
{
    private boolean highResolutionCamera;
    private int gigabytesOfMemory;

    /**
     * Constructs a new IPhone16 with the specified features.
     *
     * @param remainingMinutes the number of minutes remaining on the phone plan
     * @param carrier the name of the carrier service provider
     * @param highResolutionCamera whether the device has a high-resolution camera
     * @param gigabytesOfMemory the memory size in gigabytes
     */
    public IPhone16(final double remainingMinutes,
                    final String carrier,
                    final boolean highResolutionCamera,
                    final int gigabytesOfMemory)
    {
        super(remainingMinutes, carrier);
        this.highResolutionCamera = highResolutionCamera;
        this.gigabytesOfMemory  = gigabytesOfMemory;
    }


    /**
     * Checks if this iPhone 16 has a high-resolution camera.
     *
     * @return true if the device has a high-resolution camera, false otherwise
     */
    public boolean getHighResolutionCamera()
    {
        return highResolutionCamera;
    }


    /**
     * Sets whether this iPhone 16 has a high-resolution camera.
     *
     * @param highResolutionCamera true if the device has a high-resolution camera, false otherwise
     */
    public void setHighResolutionCamera(final boolean highResolutionCamera)
    {
        this.highResolutionCamera = highResolutionCamera;
    }

    /**
     * Gets the memory size of this iPhone 16 in gigabytes (GB).
     *
     * @return the memory size in GB
     */
    public int getGigabytesOfMemory()
    {
        return gigabytesOfMemory;
    }


    /**
     * Sets the memory size of this iPhone 16 in gigabytes (GB).
     *
     * @param gigabytesOfMemory the new memory size in GB
     */
    public void setGigabytesOfMemory(final int gigabytesOfMemory)
    {
        this.gigabytesOfMemory = gigabytesOfMemory;
    }

    /**
     * Returns a string representation of this iPhone 16.
     *
     * @return formatted string containing iPhone 16 information
     */
    @Override
    public String toString()
    {
        return super.toString() + " [ highResolutionCamera=" + highResolutionCamera
                                    + ", gigabytesOfMemory=" + gigabytesOfMemory + " GB]";
    }

    /**
     * Compares this iPhone 16 with another object for equality.
     * Two iPhone 16 devices are considered equal if they have the same remaining minutes
     * AND the same high-resolution camera status.
     *
     * @param o the object to compare with
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final IPhone16 other = (IPhone16) o;
        return Objects.equals(other.highResolutionCamera, highResolutionCamera)
                && Objects.equals(other.getNumberOfMinutesRemainingOnPhonePlan(), this.getNumberOfMinutesRemainingOnPhonePlan());

    }

    /**
     * Generates a hash code for this iPhone 16 based on remaining minutes and camera status.
     *
     * @return hash code for this object
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(getNumberOfMinutesRemainingOnPhonePlan()) + (highResolutionCamera ? 1 : 0);
    }
}
