package Lesson31.DubaiElevator.luxury;

import Lesson31.DubaiElevator.interfaces.ControlSystem;
import Lesson31.DubaiElevator.interfaces.Door;
import Lesson31.DubaiElevator.interfaces.Elevator;
import Lesson31.DubaiElevator.interfaces.ElevatorFactory;

public class LuxuryFactory implements ElevatorFactory {

    public Elevator createElevator() {
        return new LuxuryElevator();
    }

    public Door createDoor() {
        return new LuxuryDoor();
    }

    public ControlSystem createControlSystem() {
        return new LuxuryControl();
    }
}
