package core;

import utils.Country;

public class Sponsor extends Person implements Comparable<Sponsor>{
    private String surname;

    public Sponsor(String pId, String pFullName, int age, Country nation, String surname) {
        super(pId, pFullName, age, nation);
        this.surname = surname;
    }
    
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    @Override
    public String toString() {
    	return super.toString() + " Sponsor{" +
                "surname='" + surname + '\'' +
                ", pUECount=" + pUECount +
                '}';
    }

    @Override
    public int compareTo(Sponsor other) {
        // Implement sorting by pId in ascending order
        return this.getpId().compareTo(other.getpId());
    }
}

