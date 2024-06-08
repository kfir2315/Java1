package core;

import java.util.Date;
import java.util.Objects;

/**
 * Represents a match in the tournament.
 */
public class Match implements Comparable<Match> {

    private String mId;
    private Date mDate;
    private Stadium tookPlace;
    private long totalTickets;

    /**
     * Constructs a Match object with the specified details.
     *
     * @param mId          The match ID.
     * @param mDate        The date of the match.
     * @param tookPlace    The name of the stadium where the match took place.
     * @param totalTickets The total number of tickets for the match.
     */
    public Match(String mId, Date mDate, String tookPlace, long totalTickets) {
        this.mId = mId;
        this.mDate = new Date(mDate.getTime());
        setTookPlace(tookPlace);
        this.totalTickets = totalTickets;
    }

    /**
     * Constructs a Match object with the specified details.
     *
     * @param totalTickets The total number of tickets for the match.
     * @param stadium      The name of the stadium where the match took place.
     * @param date         The date of the match.
     * @param mId          The match ID.
     */
    public Match(long totalTickets, String stadium, Date date, String mId) {
        this.mId = mId;
        this.mDate = new Date(date.getTime());
        this.tookPlace = Stadium.getStadiumByName(stadium);
        this.totalTickets = totalTickets;
    }

    /**
     * Gets the match ID.
     *
     * @return The match ID.
     */
    public String getMId() {
        return mId;
    }

    /**
     * Gets the date of the match.
     *
     * @return The date of the match.
     */
    public Date getMDate() {
        return mDate;
    }

    /**
     * Gets the stadium where the match took place.
     *
     * @return The stadium where the match took place.
     */
    public Stadium getTookPlace() {
        return tookPlace;
    }

    /**
     * Gets the total number of tickets for the match.
     *
     * @return The total number of tickets for the match.
     */
    public long getTotalTickets() {
        return totalTickets;
    }

    /**
     * Sets the match ID.
     *
     * @param mId The match ID.
     */
    public void setMId(String mId) {
        this.mId = mId;
    }

    /**
     * Sets the date of the match.
     *
     * @param mDate The date of the match.
     */
    public void setMDate(Date mDate) {
        this.mDate = mDate;
    }

    /**
     * Sets the stadium where the match took place.
     *
     * @param tookPlace The name of the stadium where the match took place.
     */
    public void setTookPlace(String tookPlace) {
        this.tookPlace = Stadium.getStadiumByName(tookPlace);
    }

    /**
     * Sets the total number of tickets for the match.
     *
     * @param totalTickets The total number of tickets for the match.
     */
    public void setTotalTickets(long totalTickets) {
        this.totalTickets = totalTickets;
    }

    @Override
    public String toString() {
        return "Match [mId=" + mId + ", mDate=" + mDate + ", tookPlace=" + tookPlace + ", totalTickets=" + totalTickets
                + "]";
    }

    /**
     * Compares this match to another match based on their dates.
     *
     * @param other The other match to compare to.
     * @return A negative integer, zero, or a positive integer as this match is less
     *         than, equal to, or greater than the specified match.
     */
    @Override
    public int compareTo(Match other) {
        return this.getMDate().compareTo(other.getMDate());
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj The reference object with which to compare.
     * @return {@code true} if this object is the same as the obj argument;
     *         {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Match other = (Match) obj;
        return Objects.equals(mId, other.mId);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(mId);
    }
}
