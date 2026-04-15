package Lesson31.DubaiElevator;

import Lesson31.DubaiElevator.interfaces.ElevatorFactory;
import Lesson31.DubaiElevator.interfaces.*;
import Lesson31.DubaiElevator.standard.StandardFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardFactoryTest {

    @Test
    public void testCreateStandardElevator() {
        ElevatorFactory factory = new StandardFactory();

        Elevator elevator = factory.createElevator();

        assertNotNull(elevator);
        assertEquals("StandardElevator", elevator.getClass().getSimpleName());
    }

    @Test
    public void testCreateStandardDoor() {
        ElevatorFactory factory = new StandardFactory();

        Door door = factory.createDoor();

        assertNotNull(door);
        assertEquals("StandardDoor", door.getClass().getSimpleName());
    }

    @Test
    public void testCreateStandardControl() {
        ElevatorFactory factory = new StandardFactory();

        ControlSystem control = factory.createControlSystem();

        assertNotNull(control);
        assertEquals("StandardControl", control.getClass().getSimpleName());
    }
}