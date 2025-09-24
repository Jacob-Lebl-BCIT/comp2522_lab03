/**
 * Represents an Apple iPhone 16 device with enhanced features.
 * This class extends IPhone and provides additional functionality
 * for advanced camera capabilities and memory specifications.
 *
 * @author Jacob, Samuel, Meiko, Son
 * @version 1.0
 */
public class IPhone16 extends IPhone {
    /** Whether this iPhone has a high-resolution camera */
    private boolean highResCamera;

    /** The memory size in gigabytes */
    private int memorySize;

    /**
     * Constructs a new IPhone16 with the specified features.
     *
     * @param remainingMinutes the number of minutes remaining on the phone plan
     * @param carrierName the name of the carrier service provider
     * @param highResCamera whether the device has a high-resolution camera
     * @param memorySize the memory size in gigabytes
     */
    public IPhone16(double remainingMinutes, String carrierName,
                    boolean highResCamera, int memorySize) {
        super(remainingMinutes, carrierName);
        this.highResCamera = highResCamera;
        this.memorySize = memorySize;
    }

    /**
     * Checks whether this iPhone has a high-resolution camera.
     *
     * @return true if the device has a high-resolution camera, false otherwise
     */
    public boolean hasHighResCamera() {
        return highResCamera;
    }

    /**
     * Sets whether this iPhone has a high-resolution camera.
     *
     * @param highResCamera true if the device has a high-resolution camera, false otherwise
     */
    public void setHighResCamera(boolean highResCamera) {
        this.highResCamera = highResCamera;
    }

    /**
     * Retrieves the memory size of this iPhone.
     *
     * @return the memory size in gigabytes
     */
    public int getMemorySize() {
        return memorySize;
    }

    /**
     * Sets the memory size of this iPhone.
     *
     * @param memorySize the new memory size in gigabytes
     */
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    /**
     * Returns a string representation of this iPhone 16.
     *
     * @return formatted string containing iPhone 16 information
     */
    @Override
    public String toString() {
        return super.toString().replace("]", ", highResCamera=" + highResCamera
                + ", memorySize=" + memorySize + " GB]");
    }

    /**
     * Compares this iPhone 16 with another object for equality.
     * Two iPhone 16 devices are considered equal if they have the same remaining minutes
     * AND the same high-resolution camera status.
     *
     * @param obj the object to compare with
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IPhone16) {
            IPhone16 other = (IPhone16) obj;
            return super.equals(other) && this.highResCamera == other.highResCamera;
        } else {
            return false;
        }
    }

    /**
     * Generates a hash code for this iPhone 16 based on remaining minutes and camera status.
     *
     * @return hash code for this object
     */
    @Override
    public int hashCode() {
        return Double.hashCode(getRemainingMinutes()) + (highResCamera ? 1 : 0);
    }
}
