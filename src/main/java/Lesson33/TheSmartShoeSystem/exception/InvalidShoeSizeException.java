package Lesson33.TheSmartShoeSystem.exception;

/**
 * Custom exception used when shoe size is invalid
 */
public class InvalidShoeSizeException extends Exception {

    // Constructor that passes message to parent Exception
    public InvalidShoeSizeException(String message) {
        super(message);
    }
}