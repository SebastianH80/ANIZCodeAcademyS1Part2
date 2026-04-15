package Lesson31.LawnMover.robot;


import Lesson31.LawnMover.interfaces.CuttingStrategy;
import java.time.LocalDateTime;

/**
 * The RobotCutting class implements the CuttingStrategy interface and defines
 * the behavior of a robotic mower.
 *
 * In this implementation, the robot mower is always ready to cut the grass,
 * meaning the method always returns true.
 *
 * This reflects the automated nature of robotic mowers, which can operate daily
 * without manual effort.
 */
public class RobotCutting implements CuttingStrategy {

    public boolean shouldCut(LocalDateTime time) {
        // cut every day
        return true;
    }
}