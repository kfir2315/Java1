package core;

import java.util.Arrays;
import utils.Country;
import utils.Role;

/**
 * Represents a player with specific attributes such as skills, fans count, and
 * participation count.
 * Extends the Person class and implements Comparable interface for comparison
 * based on player ID.
 */
public class Player extends Person implements Comparable<Player> {
    private int pNum;
    private Role[] skills;
    private int fansCount;
    private int pUECount;

    /**
     * Constructs a Player object with the specified details.
     *
     * @param pId                    The ID of the player.
     * @param pFullName              The full name of the player.
     * @param age                    The age of the player.
     * @param nation                 The country of the player, represented as a
     *                               string.
     * @param pNum                   The player's number.
     * @param fansCount              The number of fans the player has.
     * @param skills                 The array of roles representing the player's
     *                               skills.
     * @param euroParticipationCount The count of the player's participation in the
     *                               Euro.
     */
    public Player(String pId, String pFullName, short age, String nation, int pNum, int fansCount, Role[] skills,
            int euroParticipationCount) {
        super(pId, pFullName, age, Country.valueOf(nation.toUpperCase())); // Assuming nation is passed as a string
                                                                           // representing a Country enum value
        this.pNum = pNum;
        this.skills = skills;
        this.fansCount = fansCount;
        this.pUECount = euroParticipationCount;
    }

    /**
     * Constructs a Player object with default details.
     */
    public Player() {
        this("kfir", "maziar", (short) 39, "CROATIA", 23, 2000, new Role[] { Role.DE }, 0);
    }

    /**
     * Constructs a Player object with the specified details, excluding Euro
     * participation count.
     *
     * @param pId       The ID of the player.
     * @param pFullName The full name of the player.
     * @param age       The age of the player.
     * @param nation    The country of the player, represented as a string.
     * @param pNum      The player's number.
     * @param skills    The array of roles representing the player's skills.
     * @param fansCount The number of fans the player has.
     */
    public Player(String pId, String pFullName, short age, String nation, int pNum, Role[] skills, int fansCount) {
        super(pId, pFullName, age, Country.valueOf(nation.toUpperCase())); // Assuming nation is passed as a string
                                                                           // representing a Country enum value
        this.pNum = pNum;
        this.skills = skills;
        this.fansCount = fansCount;
    }

    /**
     * Gets the player's number.
     *
     * @return The player's number.
     */
    public int getpNum() {
        return pNum;
    }

    /**
     * Sets the player's number.
     *
     * @param pNum The player's number.
     */
    public void setpNum(int pNum) {
        this.pNum = pNum;
    }

    /**
     * Gets the player's skills.
     *
     * @return The array of roles representing the player's skills.
     */
    public Role[] getSkills() {
        return skills;
    }

    /**
     * Sets the player's skills.
     *
     * @param skills The array of roles representing the player's skills.
     */
    public void setSkills(Role[] skills) {
        this.skills = skills;
    }

    /**
     * Gets the number of fans the player has.
     *
     * @return The number of fans the player has.
     */
    public int getFansCount() {
        return fansCount;
    }

    /**
     * Sets the number of fans the player has.
     *
     * @param fansCount The number of fans the player has.
     */
    public void setFansCount(int fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * Gets the player's Euro participation count.
     *
     * @return The player's Euro participation count.
     */
    public int getpUECount() {
        return pUECount;
    }

    /**
     * Sets the player's Euro participation count.
     *
     * @param pUECount The player's Euro participation count.
     */
    public void setpUECount(int pUECount) {
        this.pUECount = pUECount;
    }

    /**
     * Provides a string representation of the player.
     *
     * @return A string representation of the player.
     */
    @Override
    public String toString() {
        return super.toString() + "Player{" + "pNum=" + pNum +
                ", pUECount=" + pUECount +
                ", skills=" + Arrays.toString(skills) +
                ", fansCount=" + fansCount +
                '}';
    }

    /**
     * Compares this player to another player based on their ID.
     *
     * @param other The other player to compare to.
     * @return A negative integer, zero, or a positive integer as this player's ID
     *         is less than, equal to, or greater than the other player's ID.
     */
    @Override
    public int compareTo(Player other) {
        return this.getpId().compareTo(other.getpId());
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return {@code true} if this object is the same as the obj argument;
     *         {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Player player = (Player) o;

        return pNum == player.pNum;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        return pNum;
    }

    /**
     * Gets the count of the player's participation in the Euro.
     *
     * @return The count of the player's participation in the Euro.
     */
    public int euroParticipationCount() {
        return this.getpUECount();
    }

    /**
     * Determines if the player is participating for the first time.
     *
     * @return {@code true} if the player is participating for the first time,
     *         otherwise {@code false}.
     */
    @Override
    public boolean firstTimeParticipant() {
        return this.getpUECount() > 1;
    }

    /**
     * Updates the Euro participation count for the player.
     *
     * @param newCount The new participation count.
     * @throws IllegalArgumentException if the new count is not greater than the
     *                                  current count.
     */
    public void updateEuroParticipation(int newCount) {
        if (newCount > this.pUECount) {
            this.pUECount = newCount;
        } else {
            throw new IllegalArgumentException("New participation count must be greater than the current count.");
        }
    }
}
