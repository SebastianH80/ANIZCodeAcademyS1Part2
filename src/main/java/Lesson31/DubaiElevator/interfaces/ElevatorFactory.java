package Lesson31.DubaiElevator.interfaces;

public interface ElevatorFactory {

    Elevator createElevator();

    Door createDoor();

    ControlSystem createControlSystem();
}