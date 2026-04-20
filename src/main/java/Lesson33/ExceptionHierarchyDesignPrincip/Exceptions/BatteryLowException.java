package Lesson33.ExceptionHierarchyDesignPrincip.Exceptions;

public class BatteryLowException extends BikeException {
    public BatteryLowException() {
        super("Battery is too low to ride!");
    }
}