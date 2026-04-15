package Lesson31.DubaiElevator.standard;

import Lesson31.DubaiElevator.interfaces.*;

public class StandardFactory implements ElevatorFactory {

    public Elevator createElevator() {
        return new StandardElevator();
    }

    public Door createDoor() {
        return new StandardDoor();
    }

    public ControlSystem createControlSystem() {
        return new StandardControl();
    }
}