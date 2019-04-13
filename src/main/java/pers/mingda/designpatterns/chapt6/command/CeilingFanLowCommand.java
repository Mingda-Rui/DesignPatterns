package pers.mingda.designpatterns.chapt6.command;

import pers.mingda.designpatterns.chapt6.applicant.CeilingFan;

public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    // We've added local state
    // to keep track of the
    // previous speed of the fan.
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        // In execute, before we change 
        // the speed of the fan, we
        // need to first record its
        // previous state, just in case we
        // need to undo our actions.
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    // To undo, we set the speed
    // of the fan back to its
    // previous speed.
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }

}