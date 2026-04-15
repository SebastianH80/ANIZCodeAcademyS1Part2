package Lesson31.DubaiElevator.emergency;

import Lesson31.DubaiElevator.interfaces.ControlSystem;

public class EmergencyControl implements ControlSystem {
    public void activate() {
        System.out.println("🚨 Emergency mode ON");
    }
}
