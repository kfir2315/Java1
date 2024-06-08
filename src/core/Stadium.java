package core;

import utils.Country;

/**
 * Represents a stadium in the system.
 */
public enum Stadium {

	// Enum constants representing different stadiums
	NationalStadium(56070, Country.POLAND, "Warsaw"),
	PGE_Arena(39150, Country.POLAND, "Gdansk"),
	MunicipalStadium(40000, Country.POLAND, "Wrocław"),
	MunicipalRStadium(39550, Country.POLAND, "Poznań"),
	OlympicStadium(64640, Country.UKRAINE, "Kiev"),
	DonbassArena(49400, Country.UKRAINE, "Donetsk"),
	MetalistStadium(37750, Country.UKRAINE, "Kharkiv"),
	ArenaLviv(32990, Country.UKRAINE, "Lviv");

	// Fields representing stadium properties
	private final int capacity;
	private final Country country;
	private final String city;

	// Constructor for Stadium enum
	private Stadium(int capacity, Country country, String city) {
		this.capacity = capacity;
		this.country = country;
		this.city = city;
	}

	/**
	 * Retrieves the capacity of the stadium.
	 *
	 * @return The capacity of the stadium.
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * Retrieves the country where the stadium is located.
	 *
	 * @return The country where the stadium is located.
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * Retrieves the city where the stadium is located.
	 *
	 * @return The city where the stadium is located.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Retrieves the Stadium object by its name.
	 *
	 * @param stadium The name of the stadium.
	 * @return The Stadium object corresponding to the given name, or null if not
	 *         found.
	 */
	public static Stadium getStadiumByName(String stadium) {
		for (Stadium s : Stadium.values()) {
			if (s.toString().equals(stadium)) {
				return s;
			}
		}
		return null;
	}

	/**
	 * Formats the stadium information into a string.
	 *
	 * @return A string representation of the stadium information.
	 */
	public String printStadium() {
		return String.format("Stadium:%s\n\tCountry:%s\n\tcapacity:%d\n\tCity:%s\n",
				this, getCountry(), getCapacity(), getCity());
	}
}
