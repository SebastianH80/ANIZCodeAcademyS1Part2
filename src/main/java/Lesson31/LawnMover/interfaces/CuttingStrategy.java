package Lesson31.LawnMover.interfaces;

import java.time.LocalDateTime;

/**
 * The CuttingStrategy interface defines the logic that determines whether the lawn
 * should be cut at a given time.
 *
 * This separates the decision-making logic from the actual mowing action,
 * making the system more flexible and easier to maintain.
 *
 * Different implementations can define different rules, such as cutting every day,
 * every second day, or based on more advanced conditions.
 */
public interface CuttingStrategy {
    boolean shouldCut(LocalDateTime time);
}