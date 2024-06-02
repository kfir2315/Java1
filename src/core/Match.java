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

    public void setTookPlace(Stadium tookPlace) {
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
        // Implement sorting by mDate
        return this.getMDate().compareTo(other.getMDate());
    }

      
}
