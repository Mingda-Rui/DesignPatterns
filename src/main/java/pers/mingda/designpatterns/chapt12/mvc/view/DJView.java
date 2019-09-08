package pers.mingda.designpatterns.chapt12.mvc.view;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import pers.mingda.designpatterns.chapt12.mvc.model.BeatModelInterface;

// DJView is an observer for both real-time beats and BPM changes.
public class DJView implements ActionListener, BeatObserver, BPMObserver {
    // The view holds a reference to both the model and
    // the controller. The controller is only used by the
    // control interface, which we'll go over in a sec...
    BeatModelInterface model;
    ControllerInterface controller;

    // Here, we create a few components for the display.
    JFrame viewFrame;
    JPanel viewPanel;
    BeatBar beatBar;
    JLabel bpmOutputLabel;

    public DJView(ControllerInterface controller, BeatModelInterface model) {
        // The contructor gets a reference 
        // to the controller and the model,
        // and we store references to those in
        // the instance variables.
        this.controller = controller;
        this.model = model;
        
        // We also register as a BeatObserver and a 
        // BPMObserver of the model.
        model.registerObserver( (BeatObserver) this );
        model.registerObserver( (BPMObserver) this );
    }

    public void createView() {
        // Create all Swing components here
    }

    // The updateBPM() method is called when a state change
    // occurs in the model. When that happens we udpate the
    // display with the current BPM. We can get this value
    // by requesting it directly from model.
    public void updateBPM() {
        int bpm = model.getBPM();
        if (bpm == 0) {
            bpmOutputLabel.setText("offline");
        } else {
            bpmOutputLabel.setText("Current BPM: " + model.getBPM());
        }
    }

    // Likewise, the updateBeat() method is called
    // when the model starts a new beat. When that
    // happens, we need to pulse our "beat bar". We
    // do this by setting it to its maximum value (100)
    // and letting it handle the animation of the pulse.
    public void updateBeat() {
        beatBar.setValue(100);
    }
}










