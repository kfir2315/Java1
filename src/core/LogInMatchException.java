package core;

/**
 * Exception thrown when there is an error during a login match operation.
 */
public class LogInMatchException extends Exception {

    /**
     * Constructs a new LogInMatchException with the specified detail message.
     *
     * @param message The detail message.
     */
    public LogInMatchException(String message) {
        super(message);
    }
}
