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
    private boolean highResCamera;
    private int memorySizeGB;

    /**
     * Constructs a new IPhone16 with the specified features.
     *
     * @param remainingMinutes the number of minutes remaining on the phone plan
     * @param carrierName the name of the carrier service provider
     * @param highResCamera whether the device has a high-resolution camera
     * @param memorySizeGB the memory size in gigabytes
     */
    public IPhone16(final double remainingMinutes,
                    final String carrierName,
                    final boolean highResCamera,
                    final int memorySizeGB)
    {
        super(remainingMinutes, carrierName);
        this.highResCamera = highResCamera;
        this.memorySizeGB  = memorySizeGB;
    }


    /**
     * Checks if this iPhone 16 has a high-resolution camera.
     *
     * @return true if the device has a high-resolution camera, false otherwise
     */
    public boolean hasHighResCamera()
    {
        return highResCamera;
    }


    /**
     * Sets whether this iPhone 16 has a high-resolution camera.
     *
     * @param highResCamera true if the device has a high-resolution camera, false otherwise
     */
    public void setHighResCamera(final boolean highResCamera)
    {
        this.highResCamera = highResCamera;
    }

    /**
     * Gets the memory size of this iPhone 16 in gigabytes (GB).
     *
     * @return the memory size in GB
     */
    public int getMemorySizeGB()
    {
        return memorySizeGB;
    }


    /**
     * Sets the memory size of this iPhone 16 in gigabytes (GB).
     *
     * @param memorySizeGB the new memory size in GB
     */
    public void setMemorySizeGB(final int memorySizeGB)
    {
        this.memorySizeGB = memorySizeGB;
    }

    /**
     * Returns a string representation of this iPhone 16.
     *
     * @return formatted string containing iPhone 16 information
     */
    @Override
    public String toString()
    {
        return super.toString() + " [ highResCamera=" + highResCamera
                                    + ", memorySize=" + memorySizeGB + " GB]";
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
        return Objects.equals(other.highResCamera, highResCamera);

    }

    /**
     * Generates a hash code for this iPhone 16 based on remaining minutes and camera status.
     *
     * @return hash code for this object
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(getPlanRemainingMinutes()) + (highResCamera ? 1 : 0);
    }
}
