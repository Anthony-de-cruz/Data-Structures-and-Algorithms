package datastructures;

public class DuplicateValueException extends Exception {

    /**
     * Thrown when a value already exists in a data structure that does not
     * allow duplicates
     *
     * @param message
     */
    public DuplicateValueException(String message) { super(message); }
}
