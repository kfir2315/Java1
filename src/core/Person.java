package core;

import java.io.Serializable;

import utils.Country;

public abstract class Person implements Serializable {
	
	protected String pId;
    protected String pFullName;
    protected int age;
    protected Country nation;
    protected int pUECount;

    public Person(String pId, String pFullName, int age, Country nation) {
        this.pId = pId;
        this.pFullName = pFullName;
        this.age = age;
        this.nation = nation;
        this.pUECount = 1;
    }
    
    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpFullName() {
        return pFullName;
    }

    public void setpFullName(String pFullName) {
        this.pFullName = pFullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getNation() {
        return nation;
    }

    public void setNation(Country nation) {
        this.nation = nation;
    }

    public int getpUECount() {
        return pUECount;
    }

    public void addpUECount() {
        this.pUECount++;
    }

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pFullName=" + pFullName + ", age=" + age + ", nation=" + nation + ", pUECount="
				+ pUECount + "]";
	}

	public boolean firstTimeParticipant() {
		// TODO Auto-generated method stub
		return false;
	}

}
