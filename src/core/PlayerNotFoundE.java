package core;

/**
 * Exception thrown when a player is not found.
 */
public class PlayerNotFoundE extends Exception {

    /**
     * Constructs a new PlayerNotFoundE exception with the specified detail message.
     *
     * @param message The detail message.
     */
    public PlayerNotFoundE(String message) {
        super(message);
    }
}
