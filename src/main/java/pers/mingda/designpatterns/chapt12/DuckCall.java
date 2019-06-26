package pers.mingda.designpatterns.chapt12;

public class DuckCall implements Quackable {
    public void quack() {
        // A DuckCall that quacks but doesn't
        // sound quite like the real thing.
        System.out.println("Kwak");
    }
}