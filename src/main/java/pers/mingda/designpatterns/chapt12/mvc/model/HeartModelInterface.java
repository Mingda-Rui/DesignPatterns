package pers.mingda.designpatterns.chapt12.mvc.model;

import pers.mingda.designpatterns.chapt12.mvc.observer.BPMObserver;
import pers.mingda.designpatterns.chapt12.mvc.observer.BeatObserver;

public interface HeartModelInterface  {
    public int getHeartRate();
    public void registerObserver(BeatObserver o);
    public void removeObserver(BeatObserver o);
    public void registerObserver(BPMObserver o);
    public void removeObserver(BPMObserver o);
}