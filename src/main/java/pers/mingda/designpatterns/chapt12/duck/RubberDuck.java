package pers.mingda.designpatterns.chapt12.duck;

public class RubberDuck implements Quackable {
    public void quack() {
        // A RubberDuck that makes a 
        // squeak when it quacks.
        System.out.println("Squeak");
    }
}