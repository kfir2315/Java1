package core;

import java.util.ArrayList;
import java.util.List;

import utils.Country;

public class Team {
	
	private String tNumber;
    private String tName;
    private Country represents;
    private short goalsScored;
    private short goalsAgainst;
    private short yellowCards;
    private short redCards;
    private List<Player> players;
    private int fansCount;

    public Team(String tNumber, String tName, Country represents) {
        this.tNumber = tNumber;
        this.tName = tName;
        this.represents = represents;
        this.goalsScored = 0;
        this.goalsAgainst = 0;
        this.yellowCards = 0;
        this.redCards = 0;
        this.players = new ArrayList<>();
        this.fansCount = 0;
    }

	public String gettNumber() {
		return tNumber;
	}

	public void settNumber(String tNumber) {
		this.tNumber = tNumber;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public Country getRepresents() {
		return represents;
	}

	public void setRepresents(Country represents) {
		this.represents = represents;
	}

	public short getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(short goalsScored) {
		this.goalsScored = goalsScored;
	}

	public short getGoalsAgainst() {
		return goalsAgainst;
	}

	public void setGoalsAgainst(short goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}

	public short getYellowCards() {
		return yellowCards;
	}

	public void setYellowCards(short yellowCards) {
		this.yellowCards = yellowCards;
	}

	public short getRedCards() {
		return redCards;
	}

	public void setRedCards(short redCards) {
		this.redCards = redCards;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public int getFansCount() {
		return fansCount;
	}

	public void setFansCount(int fansCount) {
		this.fansCount = fansCount;
	}

	@Override
	public String toString() {
		return "Team [tNumber=" + tNumber + ", tName=" + tName + ", represents=" + represents + ", goalsScored="
				+ goalsScored + ", goalsAgainst=" + goalsAgainst + ", yellowCards=" + yellowCards + ", redCards="
				+ redCards + ", players=" + players + ", fansCount=" + fansCount + "]";
	}
    
	
	
    

}
