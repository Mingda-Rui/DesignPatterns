package pers.mingda.designpatterns.chapt12.observer;

import java.util.Observer;

public interface MockObserver extends Observer {

    public void update(QuackObservable quackObservable);

}