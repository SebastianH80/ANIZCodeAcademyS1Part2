package Lesson31.LawnMover.interfaces;

/**
 * The MowerFactory interface represents the Abstract Factory in the system.
 *
 * Its purpose is to define a set of methods for creating a family of related objects,
 * including a Mower, a CuttingStrategy, and a Maintenance component.
 *
 * Each concrete factory (e.g., ManualFactory or RobotFactory) will implement this interface
 * and ensure that all created objects belong to the same "family" and work correctly together.
 *
 * This design allows the system to remain flexible and extensible, as new types of mowers
 * can be added without modifying existing code.
 */
public interface MowerFactory {

    //En factory er en maskine der bygger komplette systemer
    //Den laver IKKE objekter selv, den definerer kun regler
    Mower createMower();

    CuttingStrategy createCuttingStrategy();

    Maintenance createMaintenance();
}