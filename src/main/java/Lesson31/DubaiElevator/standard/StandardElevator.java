package Lesson31.DubaiElevator.standard;


import Lesson31.DubaiElevator.interfaces.Elevator;

public class StandardElevator implements Elevator {
    public void move() {
        System.out.println("Standard elevator moving...");
    }
}