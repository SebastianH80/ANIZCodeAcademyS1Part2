package Lesson31.DubaiElevator.app;


import Lesson31.DubaiElevator.interfaces.*;

public class ElevatorSystem {

    private Elevator elevator;
    private Door door;
    private ControlSystem control;

    public ElevatorSystem(ElevatorFactory factory) {
        this.elevator = factory.createElevator();
        this.door = factory.createDoor();
        this.control = factory.createControlSystem();
    }

    public void run() {
        control.activate();
        door.open();
        elevator.move();
    }
}