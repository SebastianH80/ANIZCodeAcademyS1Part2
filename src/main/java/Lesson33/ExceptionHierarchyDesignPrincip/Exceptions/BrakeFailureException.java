package Lesson33.ExceptionHierarchyDesignPrincip.Exceptions;


public class BrakeFailureException extends BikeException {
    public BrakeFailureException() {
        super("The brakes are not working!");
    }
}