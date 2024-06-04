package core;

public class MatchResult {
	
	private Team teamA;
    private Team teamB;
    private Match match;
    private int totalTime;
    private boolean penaltyEnd;
    private int tAgoals;
    private int tBgoals;
    private short tAYellowCards;
    private short tBYellowCards;
    private short tARedCards;
    private short tBRedCards;
	
	public MatchResult(Team teamA, Team teamB, Match match, int totalTime, boolean penaltyEnd, int tAgoals, int tBgoals,
						   short tAYellowCards, short tBYellowCards, short tARedCards, short tBRedCards) throws LogInMatchException {
			if (teamA.getPlayers().isEmpty() || teamB.getPlayers().isEmpty()) {
				throw new LogInMatchException("Both teams must have players.");
			}
			this.teamA = teamA;
			this.teamB = teamB;
			this.match = match;
			this.totalTime = totalTime;
			this.penaltyEnd = penaltyEnd;
			this.tAgoals = tAgoals;
			this.tBgoals = tBgoals;
			this.tAYellowCards = tAYellowCards;
			this.tBYellowCards = tBYellowCards;
			this.tARedCards = tARedCards;
			this.tBRedCards = tBRedCards;
		}
	
	public Team getTeamA() {
		return teamA;
	}

	public void setTeamA(Team teamA) {
		this.teamA = teamA;
	}

	public Team getTeamB() {
		return teamB;
	}

	public void setTeamB(Team teamB) {
		this.teamB = teamB;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public boolean isPenaltyEnd() {
		return penaltyEnd;
	}

	public void setPenaltyEnd(boolean penaltyEnd) {
		this.penaltyEnd = penaltyEnd;
	}

	public int gettAgoals() {
		return tAgoals;
	}

	public void settAgoals(int tAgoals) {
		this.tAgoals = tAgoals;
	}

	public int gettBgoals() {
		return tBgoals;
	}

	public void settBgoals(int tBgoals) {
		this.tBgoals = tBgoals;
	}

	public short gettAYellowCards() {
		return tAYellowCards;
	}

	public void settAYellowCards(short tAYellowCards) {
		this.tAYellowCards = tAYellowCards;
	}

	public short gettBYellowCards() {
		return tBYellowCards;
	}

	public void settBYellowCards(short tBYellowCards) {
		this.tBYellowCards = tBYellowCards;
	}

	public short gettARedCards() {
		return tARedCards;
	}

	public void settARedCards(short tARedCards) {
		this.tARedCards = tARedCards;
	}

	public short gettBRedCards() {
		return tBRedCards;
	}

	public void settBRedCards(short tBRedCards) {
		this.tBRedCards = tBRedCards;
	}

	@Override
	public String toString() {
		return "MatchResult [teamA=" + teamA + ", teamB=" + teamB + ", match=" + match + ", totalTime=" + totalTime
				+ ", penaltyEnd=" + penaltyEnd + ", tAgoals=" + tAgoals + ", tBgoals=" + tBgoals + ", tAYellowCards="
				+ tAYellowCards + ", tBYellowCards=" + tBYellowCards + ", tARedCards=" + tARedCards + ", tBRedCards="
				+ tBRedCards + "]";
	}
    
    

}
