package Lesson31.DubaiElevator;


import Lesson31.DubaiElevator.interfaces.*;
import Lesson31.DubaiElevator.luxury.LuxuryFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LuxuryFactoryTest {

    @Test
    public void testLuxurySystem() {
        ElevatorFactory factory = new LuxuryFactory();

        Elevator elevator = factory.createElevator();
        Door door = factory.createDoor();
        ControlSystem control = factory.createControlSystem();

        assertEquals("LuxuryElevator", elevator.getClass().getSimpleName());
        assertEquals("LuxuryDoor", door.getClass().getSimpleName());
        assertEquals("LuxuryControl", control.getClass().getSimpleName());
    }
}