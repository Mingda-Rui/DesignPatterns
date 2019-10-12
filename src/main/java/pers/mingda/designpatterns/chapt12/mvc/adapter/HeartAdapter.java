package pers.mingda.designpatterns.chapt12.mvc.adapter;

import pers.mingda.designpatterns.chapt12.mvc.model.HeartModelInterface;
import pers.mingda.designpatterns.chapt12.mvc.model.BeatModelInterface;
import pers.mingda.designpatterns.chapt12.mvc.observer.BPMObserver;
import pers.mingda.designpatterns.chapt12.mvc.observer.BeatObserver;

// We need to implement the
// target interface, in this 
// case, BeatModelInterface.
public class HeartAdapter implements BeatModelInterface {
    // Here, we store a reference to the herat model.
    HeartModelInterface heart;

    public HeartAdapter(HeartModelInterface heart) {
        this.heart = heart;
    }

    // We don't know what these would do
    // to a heart, but it sounds scary. So
    // we'll just leave them as "no ops."
    public void initialize() { }

    public void on() { }

    public void off() { }

    // When getBPM() is called, we'll just
    // translate it to a getHeartRate() call
    // on the heart model.
    public int getBPM() {
        return heart.getHeartRate();
    }

    // We don't want to do this on a heart!
    // Again, let's leave it as a "no op".
    public void setBPM(int bpm) { }

    // Here are our observer methods.
    // We just delegate them to the
    // wrapped heart model.
    public void registerObserver(BeatObserver o) {
        heart.registerObserver(o);
    }

    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);
    }

    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);
    }

    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);
    }
}