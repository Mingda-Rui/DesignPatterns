package pers.mingda.designpatterns.chapt12.duck;

import pers.mingda.designpatterns.chapt12.observer.QuackObservable;

// So, we extend the Quackable
// interface with QuackObserver.
public interface Quackable extends QuackObservable {
    // Quackables only need to do
    // one thing well: Quack!
    public void quack();
}