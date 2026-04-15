package Lesson31.LawnMover.interfaces;

/**
 * The Mower interface defines the behavior of any lawn mower in the system.
 *
 * It represents the action of cutting grass, but does not specify how the cutting
 * is performed. This allows different implementations, such as manual or robotic mowers,
 * to provide their own behavior.
 *
 * By using this interface, the system can work with any type of mower without
 * depending on a specific implementation.
 */
public interface Mower {
    //Beskriver hvad en mower KAN gøre. Vi er ligeglade med: HVORDAN den klipper
    void mow();
}