package pers.mingda.designpatterns.chapt12;

public class RedheadDuck implements Quackable {
    public void quack() {
        // We've got to have some variation
        // of species if we want this to be an 
        // interesting simulator.
        System.out.println("Quack");
    }
}