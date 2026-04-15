package Lesson31.DubaiElevator.emergency;

import Lesson31.DubaiElevator.interfaces.Door;

public class EmergencyDoor implements Door {
    public void open() {
        System.out.println("Emergency door opening fast!");
    }
}
