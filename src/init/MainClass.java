package init;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.TimeZone;

import core.Fund;
import core.MatchResult;
import core.Player;
import core.Sponsor;
import core.Stadium;
import core.Team;
import utils.Country;
import utils.MyFileLogWriter;
import utils.Role;

/**
 * The Main Class -The program runner  
 */
public class MainClass {

    /**
     * The main method of this system, gets input from text file Writes output
     * to output.txt file
     * @param args
     * @throws IOException
     * @throws ParseException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ParseException,
            ClassNotFoundException {
        // the command read from the input file 
        String command;

        // to check if the command updated the objects 
        boolean isUpdated;

        // writer buffer creation used after update 
        MyFileLogWriter.initializeMyFileWriter();

        DateFormat df = new SimpleDateFormat("d/M/yyyy");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Jerusalem"));

        // the JEuroTournament Object    
        JEuroTournament jEuroTournament = null;

        // create Scanner for the text file named "input.txt" 
        Scanner input = new Scanner(new File("input.txt"));

        // if the file has next - not empty 
        if (input.hasNext()) {
            jEuroTournament = new JEuroTournament();            
        }

        /*
         *  read the commands. loop while input file [input.hasnext()]
         * and the jEuroTournament is not null 
         */
        while (input.hasNextLine() && jEuroTournament != null) {
            // read the entire line
            String line = input.nextLine().trim();
            // split the line into tokens
            String[] tokens = line.split("\\s+");

            // ensure there are tokens to process
            if (tokens.length == 0) continue;

            // the first token is the command
            command = tokens[0];
            isUpdated = false;

            // ================                Command            ================
            if (command.equals("addTeam")) {
                if (tokens.length != 5) {
                    System.out.println("Invalid input for addTeam: " + line);
                    continue;
                }

                String tId = tokens[1];
                String tName = tokens[2];
                Country represents = null;
                int fansCount = 0;

                try {
                    represents = Country.valueOf(tokens[3].toUpperCase()); // Convert string to Country enum
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid country for addTeam: " + tokens[3]);
                    continue; // Skip this command as the country is invalid
                }

                try {
                    fansCount = Integer.parseInt(tokens[4]);
                } catch (NumberFormatException e) {
                    System.out.println("Error reading fansCount for addTeam: " + e.getMessage());
                }

                System.out.println("addTeam: tId=" + tId + ", tName=" + tName + ", represents=" + represents + ", fansCount=" + fansCount);

                isUpdated = jEuroTournament.addTeam(represents, tName, tId, fansCount);

                MyFileLogWriter.writeToFileInSeparateLine("addTeam returns:");

                if (isUpdated) { // if adding successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter.writeToFileInSeparateLine("\tSuccessfully added team " + tId + "," + represents + " to jEuroTournament");
                } else {
                    MyFileLogWriter.writeToFileInSeparateLine("\tFailed to add new team " + tId + " to jEuroTournament");
                }
            }
            // ================                Command            ================
            else if (command.equals("addMatch")) {
                if (tokens.length != 5) {
                    System.out.println("Invalid input for addMatch: " + line);
                    continue;
                }

                String matchID = tokens[1];
                Date date = null;
                Stadium stadium = null;
                int soldTickets = 0;

                try {
                    date = df.parse(tokens[2]);
                } catch (ParseException e) {
                    System.out.println("Error parsing date for addMatch: " + e.getMessage());
                }

                try {
                    soldTickets = Integer.parseInt(tokens[4]);
                } catch (NumberFormatException e) {
                    System.out.println("Error reading soldTickets for addMatch: " + e.getMessage());
                }

                System.out.println("addMatch: matchID=" + matchID + ", date=" + date + ", stadium=" + stadium + ", soldTickets=" + soldTickets);

                isUpdated = jEuroTournament.addMatch(matchID, date, stadium, soldTickets);
                MyFileLogWriter.writeToFileInSeparateLine("addMatch returns:");

                if (isUpdated) {
                    MyFileLogWriter.writeToFileInSeparateLine("\tSuccessfully added match with identifier: " + matchID + " " + date + " to jEuroTournament");
                } else {
                    MyFileLogWriter.writeToFileInSeparateLine("\tFailed to add new match " + matchID + " to jEuroTournament");
                }
            }
            // ================                Command            ================
            else if (command.equals("addPlayer")) {
                if (tokens.length != 10) {
                    System.out.println("Invalid input for addPlayer: " + line);
                    continue;
                }

                String pId = tokens[1];
                String pFullName = tokens[2] + " " + tokens[3];
                short age = 0;
                String nation = tokens[5];
                int pNum = 0;
                Role skill1 = null;
                Role skill2 = null;
                int fansCount = 0;

                try {
                    age = Short.parseShort(tokens[4]);
                } catch (NumberFormatException e) {
                    System.out.println("Error reading age for addPlayer: " + e.getMessage());
                }

                try {
                    pNum = Integer.parseInt(tokens[6]);
                } catch (NumberFormatException e) {
                    System.out.println("Error reading pNum for addPlayer: " + e.getMessage());
                }

                skill1 = Role.getRoleByAcronym(tokens[7]);
                skill2 = Role.getRoleByAcronym(tokens[8]);

                try {
                    fansCount = Integer.parseInt(tokens[9]);
                } catch (NumberFormatException e) {
                    System.out.println("Error reading fansCount for addPlayer: " + e.getMessage());
                }

                Role[] skills = { skill1, skill2 };

                System.out.println("addPlayer: pId=" + pId + ", pFullName=" + pFullName + ", age=" + age + ", nation=" + nation + ", pNum=" + pNum + ", skills=" + skill1 + "," + skill2 + ", fansCount=" + fansCount);

                if (pId != null && pFullName != null && nation != null && skill1 != null && skill2 != null) {

                    isUpdated = jEuroTournament.addPlayer(new Player(pId, pFullName, age, nation, pNum, fansCount, skills, fansCount));

                    MyFileLogWriter.writeToFileInSeparateLine("addPlayer returns:");
                    if (isUpdated) {
                        MyFileLogWriter.writeToFileInSeparateLine("\tSuccessfully added Player " + pId + " , " + pNum + " to jEuroTournament");
                    } else {
                        MyFileLogWriter.writeToFileInSeparateLine("\tFailed adding Player " + pId + " , " + pNum + " to jEuroTournament");
                    }
                } else {
                    MyFileLogWriter.writeToFileInSeparateLine("addPlayer returns: invalid input pId , " + pId);
                }
            }
        } //~ end of clause - while input has next
        // Save players to file
        jEuroTournament.savePlayerToFile();

        // Load players from file
        jEuroTournament.loadPlayersFromFile();

        // Get players above a certain age (e.g., 25)
        List<Player> playersAboveAge = JEuroTournament.getPlayersAboveAge(jEuroTournament.getPlayers(), 25);
        for (Player player : playersAboveAge) {
            System.out.println("Player above age 25: " + player.getpFullName() + ", Age: " + player.getAge());
        }
        MyFileLogWriter.saveLogFile(); // save the output file
        input.close(); // close connection to input file
        System.out.println("[End Of process]");
        System.out.println("\n NOTICE:\n\t\"End of process\" " +
                        "does NOT mean that all your methods are correct.\n" +
                        "\n==>\t You NEED to check the \"output.txt\" file");
    }
}
