package Lesson31.DubaiElevator;

import Lesson31.DubaiElevator.interfaces.*;
import Lesson31.DubaiElevator.emergency.EmergencyFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmergencyFactoryTest {

    @Test
    public void testEmergencySystem() {
        ElevatorFactory factory = new EmergencyFactory();

        Elevator elevator = factory.createElevator();
        Door door = factory.createDoor();
        ControlSystem control = factory.createControlSystem();

        assertEquals("EmergencyElevator", elevator.getClass().getSimpleName());
        assertEquals("EmergencyDoor", door.getClass().getSimpleName());
        assertEquals("EmergencyControl", control.getClass().getSimpleName());
    }
}