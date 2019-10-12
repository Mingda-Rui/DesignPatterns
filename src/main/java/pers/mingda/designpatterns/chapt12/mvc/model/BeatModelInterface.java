package pers.mingda.designpatterns.chapt12.mvc.model;

import pers.mingda.designpatterns.chapt12.mvc.observer.BeatObserver;
import pers.mingda.designpatterns.chapt12.mvc.observer.BPMObserver;

public interface BeatModelInterface {
    // There are the methods
    // the controller will use to 
    // direct the model based on 
    // user interaction.
    
    // This gets called after the 
    // BeatModel is instantiated.
    void initialize();

    // These mothods turn the beat
    // generator on and off.
    void on();

    void off();

    // This method sets the beats per
    // minite. After it is called, the beat
    // frequency changes immediately.
    void setBPM(int bpm);

    // These methods allow
    // the view and the
    // controller to get
    // stats and to become observers.

    // The getBPM() method returns 
    // the current BPMs, or 0 if
    // the generator is off.
    int getBPM();

    void registerObserver(BeatObserver o);
    
    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserber(BPMObserver o);

    // This should look familar, these
    // methods allow objects to register
    // as observers for stats changes.

    // We've split this into two kinds of
    // observers: observers that want to be
    // notified on every beat, and obersers
    // that just want to be norified with
    // the beats per minute change.


}