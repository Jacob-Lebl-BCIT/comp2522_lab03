/**
 * Main class for testing the iDevice inheritance hierarchy.
 * This class demonstrates the functionality of all device types
 * and tests their equality implementations.
 *
 * @author Jacob, Samuel, Meiko, Son
 * @version 1.0
 */
public class Main
{

    /** Default number of songs for testing */
    private static final int DEFAULT_SONG_COUNT = 300;

    /** Default volume in decibels for testing */
    private static final double DEFAULT_VOLUME_DB = 80.0;

    /** Default remaining minutes for phone plan testing */
    private static final double DEFAULT_REMAINING_MINUTES = 120.0;

    /** Default memory size in GB for iPhone 16 testing */
    private static final int DEFAULT_MEMORY_SIZE = 512;

    /**
     * Main method that creates and tests various iDevice objects.
     *
     * @param args command line arguments (not used)
     */
    public static void main(final String[] args)
    {
        // Create IPod objects
        final IPod ipod1 = new IPod(DEFAULT_SONG_COUNT, DEFAULT_VOLUME_DB);
        final IPod ipod2 = new IPod(400, 85.0);
        final IPod ipod3 = new IPod(DEFAULT_SONG_COUNT, 70.0);

        // Test equality and inequality for IPod
        System.out.println("IPod Equality Test:");
        if (!ipod1.equals(ipod2)) {
            System.out.println("CORRECT: ipod1 is not equal to ipod2");
        } else {
            System.out.println("INCORRECT: ipod1 should not be equal to ipod2");
        }

        if (ipod1.equals(ipod3)) {
            System.out.println("CORRECT: ipod1 is equal to ipod3");
        } else {
            System.out.println("INCORRECT: ipod1 should be equal to ipod3");
        }
        System.out.println();

        // Create IPad objects
        final IPad ipad1 = new IPad(true, "iPadOS 15");
        final IPad ipad2 = new IPad(false, "iPadOS 14");
        final IPad ipad3 = new IPad(true, "iPadOS 15");

        // Test equality and inequality for IPad
        System.out.println("IPad Equality Test:");
        if (!ipad1.equals(ipad2)) {
            System.out.println("CORRECT: ipad1 is not equal to ipad2");
        } else {
            System.out.println("INCORRECT: ipad1 should not be equal to ipad2");
        }

        if (ipad1.equals(ipad3)) {
            System.out.println("CORRECT: ipad1 is equal to ipad3");
        } else {
            System.out.println("INCORRECT: ipad1 should be equal to ipad3");
        }
        System.out.println();

        // Create IPhone objects
        final IPhone iphone1 = new IPhone(DEFAULT_REMAINING_MINUTES, "Verizon");
        final IPhone iphone2 = new IPhone(180.0, "T-Mobile");
        final IPhone iphone3 = new IPhone(DEFAULT_REMAINING_MINUTES, "AT&T");

        // Test equality and inequality for IPhone
        System.out.println("IPhone Equality Test:");
        if (!iphone1.equals(iphone2)) {
            System.out.println("CORRECT: iphone1 is not equal to iphone2");
        } else {
            System.out.println("INCORRECT: iphone1 should not be equal to iphone2");
        }

        if (iphone1.equals(iphone3)) {
            System.out.println("CORRECT: iphone1 is equal to iphone3");
        } else {
            System.out.println("INCORRECT: iphone1 should be equal to iphone3");
        }
        System.out.println();

        // Create IPhone16 objects
        final IPhone16 iphone16_1 = new IPhone16(100.0, "Verizon", true, DEFAULT_MEMORY_SIZE);
        final IPhone16 iphone16_2 = new IPhone16(100.0, "Verizon", true, 256);
        final IPhone16 iphone16_3 = new IPhone16(100.0, "Verizon", false, DEFAULT_MEMORY_SIZE);

        // Test equality and inequality for IPhone16
        System.out.println("IPhone16 Equality Test:");
        if (iphone16_1.equals(iphone16_2)) {
            System.out.println("CORRECT: iphone16_1 is equal to iphone16_2");
        } else {
            System.out.println("INCORRECT: iphone16_1 should be equal to iphone16_2");
        }

        if (!iphone16_1.equals(iphone16_3)) {
            System.out.println("CORRECT: iphone16_1 is not equal to iphone16_3");
        } else {
            System.out.println("INCORRECT: iphone16_1 should not be equal to iphone16_3");
        }
        System.out.println();
    }
}