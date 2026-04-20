package Lesson33.ExceptionHierarchyDesignPrincip.Exceptions;

public class BikeException extends Exception {
    public BikeException(String message) {
        super(message);
    }
}