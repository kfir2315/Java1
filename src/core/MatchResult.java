package core;

/**
 * Represents the result of a match.
 */
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

	/**
	 * Constructs a MatchResult object with the specified details.
	 *
	 * @param teamA         The first team.
	 * @param teamB         The second team.
	 * @param match         The match.
	 * @param totalTime     The total time of the match.
	 * @param penaltyEnd    Whether the match ended in a penalty shootout.
	 * @param tAgoals       The goals scored by team A.
	 * @param tBgoals       The goals scored by team B.
	 * @param tAYellowCards The yellow cards received by team A.
	 * @param tBYellowCards The yellow cards received by team B.
	 * @param tARedCards    The red cards received by team A.
	 * @param tBRedCards    The red cards received by team B.
	 * @throws LogInMatchException If either team has no players.
	 */
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

	/**
	 * Gets team A.
	 *
	 * @return Team A.
	 */
	public Team getTeamA() {
		return teamA;
	}

	/**
	 * Sets team A.
	 *
	 * @param teamA Team A.
	 */
	public void setTeamA(Team teamA) {
		this.teamA = teamA;
	}

	/**
	 * Gets team B.
	 *
	 * @return Team B.
	 */
	public Team getTeamB() {
		return teamB;
	}

	/**
	 * Sets team B.
	 *
	 * @param teamB Team B.
	 */
	public void setTeamB(Team teamB) {
		this.teamB = teamB;
	}

	/**
	 * Gets the match.
	 *
	 * @return The match.
	 */
	public Match getMatch() {
		return match;
	}

	/**
	 * Sets the match.
	 *
	 * @param match The match.
	 */
	public void setMatch(Match match) {
		this.match = match;
	}

	/**
	 * Gets the total time of the match.
	 *
	 * @return The total time of the match.
	 */
	public int getTotalTime() {
		return totalTime;
	}

	/**
	 * Sets the total time of the match.
	 *
	 * @param totalTime The total time of the match.
	 */
	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	/**
	 * Checks if the match ended in a penalty shootout.
	 *
	 * @return {@code true} if the match ended in a penalty shootout, otherwise
	 *         {@code false}.
	 */
	public boolean isPenaltyEnd() {
		return penaltyEnd;
	}

	/**
	 * Sets whether the match ended in a penalty shootout.
	 *
	 * @param penaltyEnd {@code true} if the match ended in a penalty shootout,
	 *                   otherwise {@code false}.
	 */
	public void setPenaltyEnd(boolean penaltyEnd) {
		this.penaltyEnd = penaltyEnd;
	}

	/**
	 * Gets the goals scored by team A.
	 *
	 * @return The goals scored by team A.
	 */
	public int gettAgoals() {
		return tAgoals;
	}

	/**
	 * Sets the goals scored by team A.
	 *
	 * @param tAgoals The goals scored by team A.
	 */
	public void settAgoals(int tAgoals) {
		this.tAgoals = tAgoals;
	}

	/**
	 * Gets the goals scored by team B.
	 *
	 * @return The goals scored by team B.
	 */
	public int gettBgoals() {
		return tBgoals;
	}

	/**
	 * Sets the goals scored by team B.
	 *
	 * @param tBgoals The goals scored by team B.
	 */
	public void settBgoals(int tBgoals) {
		this.tBgoals = tBgoals;
	}

	/**
	 * Gets the yellow cards received by team A.
	 *
	 * @return The yellow cards received by team A.
	 */
	public short gettAYellowCards() {
		return tAYellowCards;
	}

	/**
	 * Sets the yellow cards received by team A.
	 *
	 * @param tAYellowCards The yellow cards received by team A.
	 */
	public void settAYellowCards(short tAYellowCards) {
		this.tAYellowCards = tAYellowCards;
	}

	/**
	 * Gets the yellow cards received by team B.
	 *
	 * @return The yellow cards received by team B.
	 */
	public short gettBYellowCards() {
		return tBYellowCards;
	}

	/**
	 * Sets the yellow cards received by team B.
	 *
	 * @param tBYellowCards The yellow cards received by team B.
	 */
	public void settBYellowCards(short tBYellowCards) {
		this.tBYellowCards = tBYellowCards;
	}

	/**
	 * Gets the red cards received by team A.
	 *
	 * @return The red cards received by team A.
	 */
	public short gettARedCards() {
		return tARedCards;
	}

	/**
	 * Sets the red cards received by team A.
	 *
	 * @param tARedCards The red cards received by team A.
	 */
	public void settARedCards(short tARedCards) {
		this.tARedCards = tARedCards;
	}

	/**
	 * Gets the red cards received by team B.
	 *
	 * @return The red cards received by team B.
	 */
	public short gettBRedCards() {
		return tBRedCards;
	}

	/**
	 * Sets the red cards received by team B.
	 *
	 * @param tBRedCards The red cards received by team B.
	 */
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
