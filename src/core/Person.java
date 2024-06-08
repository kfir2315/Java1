package core;

import java.io.Serializable;
import utils.Country;

/**
 * Represents a person with basic attributes.
 * This class is abstract and intended to be extended by specific types of
 * persons.
 */
public abstract class Person implements Serializable {

    protected String pId;
    protected String pFullName;
    protected int age;
    protected Country nation;
    protected int pUECount;

    /**
     * Constructs a Person object with the specified details.
     *
     * @param pId       The ID of the person.
     * @param pFullName The full name of the person.
     * @param age       The age of the person.
     * @param nation    The country of the person.
     */
    public Person(String pId, String pFullName, int age, Country nation) {
        this.pId = pId;
        this.pFullName = pFullName;
        this.age = age;
        this.nation = nation;
        this.pUECount = 1;
    }

    /**
     * Gets the ID of the person.
     *
     * @return The ID of the person.
     */
    public String getpId() {
        return pId;
    }

    /**
     * Sets the ID of the person.
     *
     * @param pId The ID of the person.
     */
    public void setpId(String pId) {
        this.pId = pId;
    }

    /**
     * Gets the full name of the person.
     *
     * @return The full name of the person.
     */
    public String getpFullName() {
        return pFullName;
    }

    /**
     * Sets the full name of the person.
     *
     * @param pFullName The full name of the person.
     */
    public void setpFullName(String pFullName) {
        this.pFullName = pFullName;
    }

    /**
     * Gets the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age The age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the country of the person.
     *
     * @return The country of the person.
     */
    public Country getNation() {
        return nation;
    }

    /**
     * Sets the country of the person.
     *
     * @param nation The country of the person.
     */
    public void setNation(Country nation) {
        this.nation = nation;
    }

    /**
     * Gets the participation count of the person.
     *
     * @return The participation count of the person.
     */
    public int getpUECount() {
        return pUECount;
    }

    /**
     * Increments the participation count of the person.
     */
    public void addpUECount() {
        this.pUECount++;
    }

    /**
     * Provides a string representation of the person.
     *
     * @return A string representation of the person.
     */
    @Override
    public String toString() {
        return "Person [pId=" + pId + ", pFullName=" + pFullName + ", age=" + age + ", nation=" + nation + ", pUECount="
                + pUECount + "]";
    }

    /**
     * Determines if the person is a first-time participant.
     *
     * @return {@code true} if the person is a first-time participant, otherwise
     *         {@code false}.
     */
    public boolean firstTimeParticipant() {
        // TODO Auto-generated method stub
        return false;
    }
}
