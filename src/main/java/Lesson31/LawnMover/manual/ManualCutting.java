package Lesson31.LawnMover.manual;


import Lesson31.LawnMover.interfaces.CuttingStrategy;
import java.time.LocalDateTime;

/**
 * The ManualCutting class implements the CuttingStrategy interface and defines
 * the logic for when a manual mower should cut the grass.
 *
 * In this implementation, the mower cuts the grass every second day.
 * This is determined by checking whether the current day of the month is even.
 *
 * This simple rule simulates a realistic limitation of manual mowing,
 * where mowing is not performed every day.
 */
public class ManualCutting implements CuttingStrategy {

    public boolean shouldCut(LocalDateTime time) {
        // cut every 2 days
        return time.getDayOfMonth() % 2 == 0;
    }
}