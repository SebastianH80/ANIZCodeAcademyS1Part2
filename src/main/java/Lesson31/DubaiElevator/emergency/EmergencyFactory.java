package Lesson31.DubaiElevator.emergency;

import Lesson31.DubaiElevator.interfaces.ControlSystem;
import Lesson31.DubaiElevator.interfaces.Door;
import Lesson31.DubaiElevator.interfaces.Elevator;
import Lesson31.DubaiElevator.interfaces.ElevatorFactory;

public class EmergencyFactory implements ElevatorFactory {

    public Elevator createElevator() {
        return new EmergencyElevator();
    }

    public Door createDoor() {
        return new EmergencyDoor();
    }

    public ControlSystem createControlSystem() {
        return new EmergencyControl();
    }
}
