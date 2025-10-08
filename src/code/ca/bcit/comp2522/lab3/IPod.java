package ca.bcit.comp2522.lab3;

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

    private static final String PURPOSE = "music";
    private int numStoredSongs;
    private double maxVolumeDB;

    /**
     * Constructs a new IPod with the specified number of songs and maximum volume.
     *
     * @param numStoredSongs the number of songs stored on this iPod
     * @param maxVolumeDB the maximum volume in decibels
     */
    public IPod(final int numStoredSongs,
                final double maxVolumeDB)
    {
        super(PURPOSE);
        this.numStoredSongs = numStoredSongs;
        this.maxVolumeDB = maxVolumeDB;
    }

    // === Setters & Getters ===

    /**
     * Gets the number of stored songs on this iPod.
     *
     * @return the number of stored songs
     */
    public int getNumStoredSongs()
    {
        return numStoredSongs;
    }

    /**
     * Sets the number of stored songs on this iPod.
     *
     * @param numStoredSongs the new number of stored songs
     */
    public void setNumStoredSongs(final int numStoredSongs)
    {
        this.numStoredSongs = numStoredSongs;
    }

    /**
     * Gets the maximum volume in decibels (dB) for this iPod.
     *
     * @return the maximum volume in dB
     */
    public double getMaxVolumeDB()
    {
        return maxVolumeDB;
    }


    /**
     * Sets the maximum volume in decibels (dB) for this iPod.
     *
     * @param maxVolumeDB the new maximum volume in dB
     */
    public void setMaxVolumeDB(final double maxVolumeDB)
    {
        this.maxVolumeDB = maxVolumeDB;
    }

    /**
     * Prints detailed information about this iPod's features.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Number of stored songs: " + numStoredSongs);
        System.out.println("Max volume DB: " + maxVolumeDB);
    }

    /**
     * Returns a string representation of this IPod.
     *
     * @return formatted string containing IPod information
     */
    @Override
    public String toString()
    {
        return super.toString() + " [numStoredSongs=" + numStoredSongs
                                + ", maxVolumeDB=" + maxVolumeDB + "]";
    }

    /**
     * Compares this IPod with another object for equality.
     * Two IPods are considered equal if they have the same
     * number of stored songs.
     *
     * @param o the object to compare with
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final IPod iPod = (IPod) o;
        return Objects.equals(numStoredSongs, iPod.numStoredSongs);
    }

    /**
     * Generates a hash code for this IPod based on the number of stored songs.
     *
     * @return hash code for this object
     */
    @Override
    public int hashCode()
    {
        return Objects.hashCode(numStoredSongs);
    }


}
