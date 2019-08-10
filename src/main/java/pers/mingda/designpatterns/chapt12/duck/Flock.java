package pers.mingda.designpatterns.chapt12.duck;

import java.util.ArrayList;
import java.util.Iterator;

// Remember, the composite needs to implement
// the same interface as the leaf elements. Our
// leaf elements are Quackables.
public class Flock implements Quackable {
    // We're using an ArrayList inside
    // each Flock to hold the Quackables
    // that belong to the Flock.
    ArrayList<Quackable> quackers = new ArrayList<>();

    // The add() method adds a 
    // Quackable to the Flock.
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        // Now for the quack() method - after all, the Flock is a Quackable too.
        // The quack() method in Flock needs to work over the entire Flock. Here
        // we iterate through the ArrayList and call quack() on each element.
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }
}