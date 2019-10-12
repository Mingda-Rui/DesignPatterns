package pers.mingda.designpatterns.chapt12.mvc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import pers.mingda.designpatterns.chapt12.mvc.model.BeatModelInterface;
import pers.mingda.designpatterns.chapt12.mvc.controller.ControllerInterface;
import pers.mingda.designpatterns.chapt12.mvc.observer.BPMObserver;
import pers.mingda.designpatterns.chapt12.mvc.observer.BeatObserver;

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
    // BeatBar beatBar;
    JLabel bpmOutputLabel;

    JLabel bpmLabel;
    JTextField bpmTextField;
    JButton setBPMButton;
    JButton increaseBPMButton;
    JButton decreaseBPMButton;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;

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
    // public void updateBeat() {
    //     beatBar.setValue(100);
    // }

    // This method creates all the controls and places them in the
    // interface. It also takes care of the menu. When the stop
    // or start items are chosen, the corresponding mthods are
    // called on the controller.
    public void createControls() {
        // Create all Swing components here
    }

    // All these methods allow the start and
    // stop items in the menu to be enabled and 
    // disabled. We'll see that the controller uses
    // these to change the interface.
    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }

    // This method is called when a button is clicked.
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == setBPMButton) {
            int bpm = Integer.parseInt(bpmTextField.getText());
            // clicked then it is passed
            // on to the controller along
            // with the new bpm.
            controller.setBPM(bpm);
        } else if (event.getSource() == increaseBPMButton) {
            // Likewise, if the increase or decrease buttons are
            // clicked, this information is passed on to the controller.
            controller.increaseBPM();
        } else if (event.getSource() == decreaseBPMButton) {
            controller.decreaseBPM();
        }
    }


}










