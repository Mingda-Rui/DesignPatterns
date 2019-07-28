package pers.mingda.designpatterns.chapt12.duck;

// Your standard Mallard duck.
public class MallardDuck implements Quackable {
    public void quack() {
        System.out.println("Quack");
    }
}