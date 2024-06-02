package core;

import java.util.Date;

public class Fund {
	
	private final double amount;
    private final Date fDate;
    private final Team team;
    private final Sponsor sponsor;

    public Fund(double amount, Date fDate, Team team, Sponsor sponsor) {
        this.amount = amount;
        this.fDate = new Date(fDate.getTime());
        this.team = team;
        this.sponsor = sponsor;
    }
    
    public double getAmount() {
        return amount;
    }

    public Date getFDate() {
        return fDate;
    }

    public Team getTeam() {
        return team;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

	@Override
	public String toString() {
		return "Fund [amount=" + amount + ", fDate=" + fDate + ", team=" + team + ", sponsor=" + sponsor + "]";
	}
    
    

}
