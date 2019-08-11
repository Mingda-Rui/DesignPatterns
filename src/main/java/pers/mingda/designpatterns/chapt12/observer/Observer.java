package pers.mingda.designpatterns.chapt12.observer;

public interface Observer extends java.util.Observer {

    public void update(QuackObservable quackObservable);

}