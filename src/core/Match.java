package core;

import java.util.Date;

public class Match implements Comparable<Match> {

	private String mId;
    private Date mDate;
    private Stadium tookPlace;
    private MatchResult result;
    private long totalTickets;

    public Match(String mId, Date mDate, Stadium tookPlace, long totalTickets) {
        this.mId = mId;
        this.mDate = new Date(mDate.getTime());
        this.tookPlace = tookPlace;
        this.totalTickets = totalTickets;
    }
    
    // New constructor
    public Match(long totalTickets, String stadium, Date date, String mId) {
        this.mId = mId;
        this.mDate = new Date(date.getTime());
        this.tookPlace = Stadium.getStadiumByName(stadium);
        this.totalTickets = totalTickets;
    }
    
    public String getMId() {
        return mId;
    }

    public Date getMDate() {
        return mDate;
    }

    public Stadium getTookPlace() {
        return tookPlace;
    }

    public long getTotalTickets() {
        return totalTickets;
    }

    // Setters
    public void setMId(String mId) {
        this.mId = mId;
    }

    public void setMDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setTookPlace(String tookPlace) {
        this.tookPlace = Stadium.getStadiumByName(tookPlace);
    }

    public void setTotalTickets(long totalTickets) {
        this.totalTickets = totalTickets;
    }

	@Override
	public String toString() {
		return "Match [mId=" + mId + ", mDate=" + mDate + ", tookPlace=" + tookPlace + ", totalTickets=" + totalTickets
				+ "]";
	}

    @Override
    public int compareTo(Match other) {
       
        return this.getMDate().compareTo(other.getMDate());
    }


    
      
}
