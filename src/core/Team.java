package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import utils.Country;

/**
 * Represents a team in the system.
 */
public class Team {

    // Fields representing team properties
    private String tNumber;
    private String tName;
    private Country represents;
    private short goalsScored;
    private short goalsAgainst;
    private short yellowCards;
    private short redCards;
    private ArrayList<Player> players;
    private int fansCount;

    /**
     * Constructs a team with the specified parameters.
     *
     * @param tNumber    The team number.
     * @param tName      The team name.
     * @param represents The country the team represents.
     * @param fansCount  The number of fans of the team.
     */
    public Team(String tNumber, String tName, String represents, int fansCount) {
        this.tNumber = tNumber;
        this.tName = tName;
        this.represents = Country.getCountryByName(represents);
        this.goalsScored = 0;
        this.goalsAgainst = 0;
        this.yellowCards = 0;
        this.redCards = 0;
        this.players = new ArrayList<>();
        this.fansCount = fansCount;
    }

    /**
     * Constructs a team with the specified team number.
     *
     * @param tNumber The team number.
     */
    public Team(String tNumber) {
        this.tNumber = tNumber;
    }

    /**
     * Constructs a team with the specified parameters.
     *
     * @param represents The country the team represents.
     * @param tName      The team name.
     * @param tNumber    The team number.
     * @param fansCount  The number of fans of the team.
     */
    public Team(Country represents, String tName, String tNumber, int fansCount) {
        this.represents = represents;
        this.tName = tName;
        this.tNumber = tNumber;
        this.fansCount = fansCount;
    }

    // Getters and setters for team properties

    /**
     * Retrieves the team number.
     *
     * @return The team number.
     */
    public String gettNumber() {
        return tNumber;
    }

    /**
     * Sets the team number.
     *
     * @param tNumber The team number.
     */
    public void settNumber(String tNumber) {
        this.tNumber = tNumber;
    }

    /**
     * Retrieves the team name.
     *
     * @return The team name.
     */
    public String gettName() {
        return tName;
    }

    /**
     * Sets the team name.
     *
     * @param tName The team name.
     */
    public void settName(String tName) {
        this.tName = tName;
    }

    /**
     * Retrieves the country the team represents.
     *
     * @return The country the team represents.
     */
    public Country getRepresents() {
        return represents;
    }

    /**
     * Sets the country the team represents.
     *
     * @param countryName The name of the country.
     */
    public void setRepresents(String countryName) {
        this.represents = Country.getCountryByName(countryName);
    }

    /**
     * Retrieves the number of goals scored by the team.
     *
     * @return The number of goals scored by the team.
     */
    public short getGoalsScored() {
        return goalsScored;
    }

    /**
     * Sets the number of goals scored by the team.
     *
     * @param goalsScored The number of goals scored by the team.
     */
    public void setGoalsScored(short goalsScored) {
        this.goalsScored = goalsScored;
    }

    /**
     * Retrieves the number of goals conceded by the team.
     *
     * @return The number of goals conceded by the team.
     */
    public short getGoalsAgainst() {
        return goalsAgainst;
    }

    /**
     * Sets the number of goals conceded by the team.
     *
     * @param goalsAgainst The number of goals conceded by the team.
     */
    public void setGoalsAgainst(short goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    /**
     * Retrieves the number of yellow cards received by the team.
     *
     * @return The number of yellow cards received by the team.
     */
    public short getYellowCards() {
        return yellowCards;
    }

    /**
     * Sets the number of yellow cards received by the team.
     *
     * @param yellowCards The number of yellow cards received by the team.
     */
    public void setYellowCards(short yellowCards) {
        this.yellowCards = yellowCards;
    }

    /**
     * Retrieves the number of red cards received by the team.
     *
     * @return The number of red cards received by the team.
     */
    public short getRedCards() {
        return redCards;
    }

    /**
     * Sets the number of red cards received by the team.
     *
     * @param redCards The number of red cards received by the team.
     */
    public void setRedCards(short redCards) {
        this.redCards = redCards;
    }

    /**
     * Retrieves the list of players in the team.
     *
     * @return The list of players in the team.
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * Sets the list of players in the team.
     *
     * @param players The list of players in the team.
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Retrieves the number of fans of the team.
     *
     * @return The number of fans of the team.
     */
    public int getFansCount() {
        return fansCount;
    }

    /**
     * Sets the number of fans of the team.
     *
     * @param fansCount The number of fans of the team.
     */
    public void setFansCount(int fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * Adds a player to the team.
     *
     * @param player The player to add to the team.
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Removes a player from the team.
     *
     * @param player The player to remove from the team.
     * @throws PlayerNotFoundE If the player is not found in the team.
     */
    public void removePlayer(Player player) throws PlayerNotFoundE {
        if (!players.remove(player)) {
            throw new PlayerNotFoundE("Player not found: " + player.getpId());
        }
    }

    /**
     * Checks if this team is equal to another object.
     *
     * @param o The object to compare.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Team team = (Team) o;
        return Objects.equals(tNumber, team.tNumber) && Objects.equals(tName, team.tName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tNumber, tName);
    }

}
