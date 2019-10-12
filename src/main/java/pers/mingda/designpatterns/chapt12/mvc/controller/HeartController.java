package pers.mingda.designpatterns.chapt12.mvc.controller;

import pers.mingda.designpatterns.chapt12.mvc.model.HeartModelInterface;
import pers.mingda.designpatterns.chapt12.mvc.view.DJView;
import pers.mingda.designpatterns.chapt12.mvc.adapter.HeartAdapter;

// The HeartController imploements
// the ControllerInterface, just
// like the BeatController did.
public class HeartController implements ControllerInterface {
    HeartModelInterface model;
    DJView view;

    // There is one change: we are passed a 
    // HeartModel, not a BeatModel...
    public HeartController(HeartModelInterface model) {
        this.model = model;
        // ...and we need to wrap that 
        // model with an adapter before
        // we hand it to the view.
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        // Finally, the HeartController disables the 
        // menu items as they aren't needed.
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    // There's not a lot to do here;
    // after all, we can't really control
    // hearts like we can beat machines.
    public void start() { }

    public void stop() { }

    public void increaseBPM() { }

    public void decreaseBPM() { } 

    public void setBPM(int bpm) { }
}