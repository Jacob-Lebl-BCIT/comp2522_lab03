import java.util.Objects;

/**
 * Represents an Apple iPod device focused on music playback.
 * This class extends IDevice and provides specific functionality
 * for music-related features and storage.
 *
 * @author Jacob, Samuel, Meiko, Son
 * @version 1.0
 */
public class IPod extends IDevice
{

    // The purpose of all IPod instances is music.
    private static final String PURPOSE = "music";
    // The number of songs stored on the iPod.
    private int numStoredSongs;
    // The maximum volume level of the iPod in decibels.
    private double maxVolumeDB;

    /**
     * Constructor for IDevice.
     *
     * @param numStoredSongs the number of songs stored on the iPod.
     * @param maxVolumeDB    the maximum volume level of the iPod in decibels.
     */
    public IPod(final int numStoredSongs,
                final double maxVolumeDB)
    {
        super(PURPOSE);
        this.numStoredSongs = numStoredSongs;
        this.maxVolumeDB = maxVolumeDB;
    }

    /**
     * printDetails prints an english description of all the instance variables in the IPod.
     *
     */
    @Override
    public void printDetails()
    {
        System.out.println("Number of stored songs: " + numStoredSongs);
        System.out.println("Max volume DB: " + maxVolumeDB);
    }


    /**
     * @return all instance variables in a single String.
     */
    @Override
    public String toString()
    {
        return super.toString() + " [numStoredSongs=" + numStoredSongs + ", maxVolumeDB=" + maxVolumeDB + "]";
    }

    @Override
    public boolean equals(final Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final IPod iPod = (IPod) o;
        return numStoredSongs == iPod.numStoredSongs;
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(numStoredSongs);
    }

    // === Setters & Getters ===

    /**
     * @return the number of songs stored on the iPod.
     *
     */
    public int getNumStoredSongs()
    {
        return numStoredSongs;
    }

    /**
     * setNumStoredSongs sets the number of songs stored on the iPod.
     *
     * @param numStoredSongs int of stored songs.
     */
    public void setNumStoredSongs(final int numStoredSongs)
    {
        this.numStoredSongs = numStoredSongs;
    }

    /**
     * @return the maximum volume level of the iPod in decibels.
     *
     */
    public double getMaxVolumeDB()
    {
        return maxVolumeDB;
    }

    /**
     * setMaxVolumeDB sets the maximum volume level of the iPod in decibels.
     *
     * @param maxVolumeDB volume in decibels.
     */
    public void setMaxVolumeDB(final double maxVolumeDB)
    {
        this.maxVolumeDB = maxVolumeDB;
    }
}
