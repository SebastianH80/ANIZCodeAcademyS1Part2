package Lesson31.DubaiElevator;


import Lesson31.DubaiElevator.app.ElevatorSystem;
import Lesson31.DubaiElevator.interfaces.ElevatorFactory;
import Lesson31.DubaiElevator.standard.StandardFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ElevatorSystemTest {

    @Test
    public void testSystemRuns() {

        ElevatorFactory factory = new StandardFactory();

        ElevatorSystem system = new ElevatorSystem(factory);

        assertNotNull(system);

        // Vi tester bare at den ikke crasher
        system.run();
    }
}