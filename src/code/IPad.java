import java.util.Objects;

public class IPad extends IDevice
{
    private static final String purpose = "learning";
    private boolean hasCase;
    private String osVersion;

    /**
     * Constructor for IDevice.
     *
     * @param hasCase the IPad has a case or not.
     * @param osVersion the operating system of the IPad.
     */
    public IPad (final boolean hasCase,
                 final String osVersion){
        super(purpose);
        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }


    /**
     * printDetails prints all the instance variables of the IPad.
     *
     * @return an English description of the IPad's instance variables.
     */
    @Override
    public String printDetails() {
        String caseDescription = hasCase ? "has a case" : "does not have a case";
        return caseDescription + ", " + osVersion + " operating system version";
    }


    /**
     * @return all instance variables in a single String.
     */
    @Override
    public String toString() {
        // Get the string from the superclass.
        String IDeviceString = super.toString();
        // Sum of all instance variables.
        return IDeviceString + " " + hasCase + " " + osVersion;
    }

    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof IPad otherIPad))
        {
            return false;
        }
        return Objects.equals(osVersion, otherIPad.osVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasCase, osVersion);
    }

    // === Setters & Getters ===

    /**
     * @return true if the iPad has a case, false otherwise.
     */
    public boolean getHasCase() {
        return hasCase;
    }

    /**
     * setHasCase sets whether the iPad has a case.
     *
     * @param hasCase boolean indicating if the iPad has a case.
     */
    public void setHasCase(final boolean hasCase) {
        this.hasCase = hasCase;
    }

    /**
     * @return the operating system version of the iPad.
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * setOsVersion sets the operating system version of the iPad.
     *
     * @param osVersion String representing the OS version.
     */
    public void setOsVersion(final String osVersion)
    {
        this.osVersion = osVersion;
    }

}
