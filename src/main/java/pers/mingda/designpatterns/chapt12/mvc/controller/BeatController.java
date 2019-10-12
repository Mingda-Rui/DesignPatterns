package pers.mingda.designpatterns.chapt12.mvc.controller;

import pers.mingda.designpatterns.chapt12.mvc.model.BeatModelInterface;
import pers.mingda.designpatterns.chapt12.mvc.view.DJView;

// The controller implements the ControllerInterface.
public class BeatController implements ControllerInterface {
    // The controller is the creamy sfuff in the middle of the MVC oreo
    // cookie, so it is the object that gets to hold on to the view and the
    // model and glues it all together.
    BeatModelInterface model;
    DJView view;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);
        // The controller is passed the model in the constructor and
        // then creates the view.
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    // When you choose Start from the user 
    // interface menu, the controler turns the
    // model on and then alters the user interface 
    // so that the start menu item is disabled and
    // stop menu item is enabled.
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    // Likewise, when you choose Stop from the
    // menu, the controller turns the model off
    // and alters the user interface so that
    // the stop menu item is disabled and the
    // start menu item is enables.
    public void stop() {
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    // If the increase button is clicked, the
    // controller gets the current BPM
    // from the model, adds one, and then
    // sets a new BPM.
    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
    }

    // Same thing here, only we subtract 
    // one from the current BPM.
    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
    }

    // Finally, if the user interface is used to
    // set an arbitrary BPM, the controller
    // instructs the model to set its BPM.
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }

}

