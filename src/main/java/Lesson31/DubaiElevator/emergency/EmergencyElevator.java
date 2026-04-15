package Lesson31.DubaiElevator.emergency;


import Lesson31.DubaiElevator.interfaces.*;

public class EmergencyElevator implements Elevator {
    public void move() {
        System.out.println("Emergency evacuation!");
    }
}

