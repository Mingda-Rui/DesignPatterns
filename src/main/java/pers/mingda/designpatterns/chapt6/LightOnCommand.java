package pers.mingda.designpatterns.chapt6;


import pers.mingda.designpatterns.chapt6.applicant.Light;

// This is a command, so we need to
// implement the Command interface
public class LightOnCommand implements Command {
    Light light;

    // The constructor is passed the specific
    // light that this command is going to 
    // control - say the living room light
    // - and stashes it in the light instance
    // variable. When execute gets called, this
    // is the light object that is going to be
    // the Receiver of the request
    public LightOnCommand(Light light) {
        this.light = light;
    }

    // The execute method calls the 
    // on(), method on the receiving 
    // oject, which is the light we 
    // are controlling.
    public void execute() {
        light.on();
    }
}