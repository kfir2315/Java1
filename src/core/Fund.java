package core;

import java.util.Date;

/**
 * Represents a Fund which includes an amount of money,
 * the date of the fund, the team receiving the fund, and the sponsor providing
 * the fund.
 */
public class Fund {

    /** The amount of the fund. */
    private final double amount;

    /** The date the fund was received. */
    private final Date fDate;

    /** The team receiving the fund. */
    private final Team team;

    /** The sponsor providing the fund. */
    private final Sponsor sponsor;

    /**
     * Constructs a new Fund object.
     *
     * @param amount  The amount of the fund.
     * @param fDate   The date the fund was received.
     * @param team    The team receiving the fund.
     * @param sponsor The sponsor providing the fund.
     */
    public Fund(double amount, Date fDate, Team team, Sponsor sponsor) {
        this.amount = amount;
        this.fDate = new Date(fDate.getTime());
        this.team = team;
        this.sponsor = sponsor;
    }

    /**
     * Gets the amount of the fund.
     *
     * @return The amount of the fund.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Gets the date the fund was received.
     *
     * @return The date the fund was received.
     */
    public Date getFDate() {
        return fDate;
    }

    /**
     * Gets the team receiving the fund.
     *
     * @return The team receiving the fund.
     */
    public Team getTeam() {
        return team;
    }

    /**
     * Gets the sponsor providing the fund.
     *
     * @return The sponsor providing the fund.
     */
    public Sponsor getSponsor() {
        return sponsor;
    }

    /**
     * Returns a string representation of the Fund object.
     *
     * @return A string representation of the Fund object.
     */
    @Override
    public String toString() {
        return "Fund [amount=" + amount + ", fDate=" + fDate + ", team=" + team + ", sponsor=" + sponsor + "]";
    }
}
