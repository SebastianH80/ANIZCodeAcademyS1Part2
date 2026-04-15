package Lesson31.LawnMover.manual;


import Lesson31.LawnMover.interfaces.*;

/**
 * The ManualFactory class is a concrete implementation of the MowerFactory interface.
 *
 * It is responsible for creating all components related to a manual lawn mower system,
 * including the mower itself, the cutting strategy, and the maintenance system.
 *
 * All objects created by this factory belong to the "manual" family and are designed
 * to work together consistently.
 *
 * This ensures that the system behaves correctly when using a manual mower setup.
 */
public class ManualFactory implements MowerFactory {

    public Mower createMower() {
        return new ManualMower();
    }

    public CuttingStrategy createCuttingStrategy() {
        return new ManualCutting();
    }

    public Maintenance createMaintenance() {
        return new ManualMaintenance();
    }
}