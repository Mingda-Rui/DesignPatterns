package pers.mingda.designpatterns.chapt6.command;

import pers.mingda.designpatterns.chapt6.applicant.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    // Just like the LightOnCommand, we get 
    // passed the instance of the stereo we 
    // are going to be controlling and we store
    // it in a local instance variable.
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    // To carry out this request, we need to call three
    // methods on the stereo: first, turn it on, then set
    // it to play the CD, and fianlly set the volume to 11.
    // Why 11? Well, it's better than 10, right?
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}