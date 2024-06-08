package core;

import utils.Country;

/**
 * Represents a sponsor in the system.
 */
public class Sponsor extends Person implements Comparable<Sponsor> {

    private String surname;
    private int pUECount;

    /**
     * Constructs a Sponsor object with the specified parameters.
     *
     * @param pId       The ID of the sponsor.
     * @param pFullName The full name of the sponsor.
     * @param age       The age of the sponsor.
     * @param nation    The country of the sponsor.
     * @param surname   The surname of the sponsor.
     */
    public Sponsor(String pId, String pFullName, int age, Country nation, String surname) {
        super(pId, pFullName, age, nation);
        this.surname = surname;
    }

    /**
     * Retrieves the surname of the sponsor.
     *
     * @return The surname of the sponsor.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the surname of the sponsor.
     *
     * @param surname The surname to set.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Retrieves the participation count of the sponsor.
     *
     * @param pUECount The participation count of the sponsor.
     * @return The participation count of the sponsor.
     */
    public int getpUECount(int pUECount) {
        return pUECount;
    }

    /**
     * Sets the participation count of the sponsor.
     *
     * @param pUECount The participation count to set.
     */
    public void setpUECount(int pUECount) {
        this.pUECount = pUECount;
    }

    @Override
    public String toString() {
        return super.toString() + " Sponsor{" +
                "surname='" + surname + '\'' +
                ", pUECount=" + pUECount +
                '}';
    }

    @Override
    public int compareTo(Sponsor other) {
        // Implement sorting by pId in ascending order
        return this.getpId().compareTo(other.getpId());
    }

    // Check if the sponsor is participating for the first time
    @Override
    public boolean firstTimeParticipant() {
        return this.getpUECount() == 1;
    }
}
