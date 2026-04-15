package Lesson31.LawnMover.robot;


import Lesson31.LawnMover.interfaces.*;

/**
 * The RobotFactory class is a concrete factory that creates components for a robotic mower system.
 *
 * It ensures that all created objects (mower, cutting strategy, and maintenance)
 * belong to the robotic family and are designed to work together.
 *
 * This allows the system to easily switch from a manual mower to a robotic mower
 * by simply changing the factory used.
 */
public class RobotFactory implements MowerFactory {

    public Mower createMower() {
        return new RobotMower();
    }

    public CuttingStrategy createCuttingStrategy() {
        return new RobotCutting();
    }

    public Maintenance createMaintenance() {
        return new RobotMaintenance();
    }
}