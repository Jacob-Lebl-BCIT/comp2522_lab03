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
}
