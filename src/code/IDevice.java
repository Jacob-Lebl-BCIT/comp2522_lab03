/**
 * IDevice a high level representation of apple mobile devices.
 */
public abstract class IDevice
{

    private final String purpose;

    /**
     * Constructor for IDevice.
     *
     * @param purpose short description of the device's purpose.
     */
    public IDevice(String purpose)
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

    public abstract String printDetails();


}
