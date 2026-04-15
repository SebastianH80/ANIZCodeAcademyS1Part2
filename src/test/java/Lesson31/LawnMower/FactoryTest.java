package Lesson31.LawnMower;


import Lesson31.LawnMover.interfaces.*;
import Lesson31.LawnMover.manual.ManualFactory;
import Lesson31.LawnMover.robot.RobotFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    public void testManualFactoryCreatesObjects() {

        MowerFactory factory = new ManualFactory();

        assertNotNull(factory.createMower());
        assertNotNull(factory.createCuttingStrategy());
        assertNotNull(factory.createMaintenance());
    }

    @Test
    public void testRobotFactoryCreatesObjects() {

        MowerFactory factory = new RobotFactory();

        assertNotNull(factory.createMower());
        assertNotNull(factory.createCuttingStrategy());
        assertNotNull(factory.createMaintenance());
    }

    @Test
    public void testDifferentFactoriesCreateDifferentTypes() {

        MowerFactory manual = new ManualFactory();
        MowerFactory robot = new RobotFactory();

        assertNotEquals(
                manual.createMower().getClass(),
                robot.createMower().getClass()
        );
    }
}