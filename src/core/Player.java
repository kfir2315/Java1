package core;

import java.util.ArrayList;
import java.util.Arrays;

import utils.Country;
import utils.Role;

public class Player extends Person implements Comparable<Player>{
    private int pNum;
    private Role[] skills;
    private int fansCount;
    
    public Player(){
        
    }

    public Player(String pId, String pFullName, int age, Country nation, int pNum, Role[] skills, int fansCount) {
        super(pId, pFullName, age, nation);
        this.pNum = pNum;
        this.skills = skills;
        this.fansCount = fansCount;
    }
    
    public int getpNum() {
        return pNum;
    }

    public void setpNum(int pNum) {
        this.pNum = pNum;
    }

    public Role[] getSkills() {
        return skills;
    }

    public void setSkills(Role[] skills) {
        this.skills = skills;
    }

    public int getFansCount() {
        return fansCount;
    }

    public void setFansCount(int fansCount) {
        this.fansCount = fansCount;
    }
    
    @Override
    public String toString() {
    	return super.toString() + "Player{" + "pNum=" + pNum +
                ", pUECount=" + pUECount +
                ", skills=" + Arrays.toString(skills) +
                ", fansCount=" + fansCount +
                '}';
    }
    
    @Override
    public int compareTo(Player other) {
        // Implement sorting by pId in ascending order
        return this.getpId().compareTo(other.getpId());
    }
   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return pNum == player.pNum;
    }

    @Override
    public int hashCode() {
        return pNum;
    }
    
 // Check how many times the player has participated in the Euro
    public int euroParticipationCount() {
        
        return this.getpUECount();
    }
    
    @Override
    public boolean firstTimeParticipant() {
        // Check if the player is participating for the first time
        return this.getpUECount() == 1;
    }
    
}
