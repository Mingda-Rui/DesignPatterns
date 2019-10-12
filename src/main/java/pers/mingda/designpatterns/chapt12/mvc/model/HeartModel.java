package pers.mingda.designpatterns.chapt12.mvc.model;

import pers.mingda.designpatterns.chapt12.mvc.observer.BPMObserver;
import pers.mingda.designpatterns.chapt12.mvc.observer.BeatObserver;

public class HeartModel implements HeartModelInterface {

    @Override
    public int getHeartRate() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeObserver(BeatObserver o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerObserver(BPMObserver o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeObserver(BPMObserver o) {
        // TODO Auto-generated method stub

    }
    
}