package pers.mingda.designpatterns.chapt12.mvc.model;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.Sequencer;
import javax.sound.midi.MetaMessage;
import java.util.ArrayList;

import pers.mingda.designpatterns.chapt12.mvc.observer.BeatObserver;
import pers.mingda.designpatterns.chapt12.mvc.observer.BPMObserver;

// We implement the BeatModelInterface
public class BeatModel implements BeatModelInterface, MetaEventListener {
    // The sequencer is the object that knows how to
    // generate real beats (that you can hear!).
    Sequencer sequencer;

    // These ArrayLists hold the two kinds of
    // obervers (Beat and BPM obervers).
    ArrayList beatObervers = new ArrayList();
    ArrayList bpmObservers = new ArrayList();
    
    // The bpm instance variable holds the frequency
    // of beats - by default, 90 BPM.
    int bpm = 90;
    // other instance variables here

    // This method does setup on the sequencer
    // and sets up the beat tracks for us.
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    // The on() method starts the sequencer and 
    // sets the BPMs to the default: 90 BPM.
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    // And off() shuts it down by setting BPMs to
    // 0 and stopping the sequencer.
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    // The setBPM() method is the way the controller
    // manipulates the beat. It does three things:
    //   (1) Sets the bpm instance variable
    //   (2) Asks the sequencer to change its BPMs.
    //   (3) Notifies all BPM Observers that the BPM has changed.
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    // Code to register and notify observers
    public void registerObserver(BeatObserver o) { }

    public void removeObserver(BeatObserver o) { }

    public void registerObserver(BPMObserver o) { }

    public void removeObserver(BPMObserver o) { }

    public void notifyBPMObservers() { }

    // Lots of MIDI code to handle the beat
    public void setUpMidi() { }

    public void buildTrackAndStart() { }

    public void meta(MetaMessage mm) { }

    @Override
    public int getBPM() {
        return this.bpm;
    }
}








