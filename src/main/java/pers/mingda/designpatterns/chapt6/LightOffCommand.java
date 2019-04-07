package pers.mingda.designpatterns.chapt6;

import pers.mingda.designpatterns.chapt6.applicant.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        // The LightOffCommand works exactly
        // the same way as the LightOnCommand,
        // except that we are binding the receiver
        // to a different action: the off() method.
        light.off();
    }
}