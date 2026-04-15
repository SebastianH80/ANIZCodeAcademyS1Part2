package Lesson31.DubaiElevator.standard;


import Lesson31.DubaiElevator.interfaces.ControlSystem;

public class StandardControl implements ControlSystem {
    public void activate() {
        System.out.println("Standard control activated");
    }
}