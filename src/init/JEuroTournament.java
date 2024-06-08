package init;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import core.Fund;
import core.Match;
import core.MatchResult;
import core.Person;
import core.Player;
import core.Sponsor;
import core.Stadium;
import core.Team;

import utils.Country;
import utils.Role;

/**
 * This JEuroTournament object represents the class system
 * 
 * Author: Java Course Team 2012
 * Author: University Of Haifa-Israel
 */
public class JEuroTournament {
    // ---------------------the class parameters -------------------------
    /**
     * All teams list in the system
     */
    private ArrayList<Team> teams;

    /**
     * All Matches listed in the system
     */
    private ArrayList<Match> matches;

    /**
     * all players sponsors
     */
    private ArrayList<Player> players;

    // --------------------- Constructors -------------------------
    /**
     * Constructor Perform initialization for related data structures
     */
    public JEuroTournament() {
        super();
        teams = new ArrayList<Team>();
        matches = new ArrayList<Match>();
        players = new ArrayList<Player>();
    }

    // ---------------------- DB Methods -----------------------------

    /**
     * @return the teams
     */
    public ArrayList<Team> getTeams() {
        return teams;
    }

    /**
     * @return the matches
     */
    public ArrayList<Match> getMatches() {
        return matches;
    }

    /**
     * @return all players and sponsors
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * the method creates and add new team to the system IFF the team does not
     * exist.
     * 
     * @param tNumber
     * @param tName
     * @param represents
     * @param fansCount
     * @param finalStage
     * @return if manage to add
     */
    public boolean addTeam(String tId, String tName, String represents,
                           int fansCount) {
        Team teamToAdd = new Team(tId);
        if (tId != null && tName != null
                && represents != null) {
            // checking if the team exist
            if (!teams.contains(teamToAdd)) {
                teamToAdd = new Team(tId, tName, represents, fansCount);
                teams.add(teamToAdd);
                return true;
            }
        }
        return false;
    } // ~ END OF addTeam

    /**
     * adds a match to the system IFF it does not exist
     * 
     * @param matchID
     * @param date
     * @param stadium
     * @return true if managed to add the match
     */
    public boolean addMatch(String matchID, Date date, String stadium, long totalTickets) {
        if (matchID != null && date != null && stadium != null) {
            Match matchToAdd = new Match(matchID, date, stadium, totalTickets);
            if (matches.contains(matchToAdd)) {
                return false;
            } else {
                matches.add(matchToAdd);
                return true;
            }
        }
        return false;
    } // ~ END OF addMatch
        
        

    /**
     * Adds a player to the system IFF the player does not exist
     * 
     * @param player The player to add
     * @return true if managed to add the player
     */
    public boolean addPlayer(Player player) {
        if (player != null && !players.contains(player)) {
            return players.add(player);
        }
        return false;
    }

    /**
     * receive a person and without knowing its exact type the method adds the
     * Person to the system data base If the person does not exist
     * 
     * @param person
     * @return true if successfully added
     */
    public boolean addPerson(Person person) {
        // Implementation for adding a person (Player, Sponsor, etc.) to the system
        // Example implementation (you may need to adjust based on actual requirements):
        if (person instanceof Player) {
            return addPlayer((Player) person);
        }
        // Handle other types of Person (e.g., Sponsor) here
        return false;
    }

    // ===================== Queries ===================================

    /**
     * this public method is used to save object of player in .ser file this method
     * needs to run on the ArrayList and save all the Players objects
     */
    public void savePlayerToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("player.dat"))) {
            oos.writeObject(players);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * this public method is used to read objects of Players from .ser file
     */
    @SuppressWarnings("unchecked")
    public void loadPlayersFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("player.dat"))) {
            players = (ArrayList<Player>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method returns all the Player that are above a certain age
     * 
     * @param players list of players to filter
     * @param age     the age to filter by
     * @return list of players above the specified age
     */
    public static List<Player> getPlayersAboveAge(List<Player> players, int age) {
        List<Player> result = new ArrayList<>();

        for (Player player : players) {
            if (player.getAge() > age) {
                result.add(player);
            }
        }
        return result;
    }
}
