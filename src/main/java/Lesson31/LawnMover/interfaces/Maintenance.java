package Lesson31.LawnMover.interfaces;

import java.time.LocalDateTime;

/**
 * The Maintenance interface is responsible for handling service and maintenance
 * operations of a lawn mower.
 *
 * It allows the system to record when maintenance was last performed and retrieve
 * that information when needed.
 *
 * This abstraction makes it possible to implement different maintenance behaviors
 * depending on the type of mower.
 */
public interface Maintenance {
    void service(LocalDateTime date);
    String getLastService();
}