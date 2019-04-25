package pers.mingda.designpatterns.chapt8;

// Remeber, we need to implement the Comparable
// interface since we aren't really subclassing.
public class Duck implements Comparable {
    // Our Ducks have a name and a weight
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // We're keepin' it simple; all Ducks do
    // is print their name and weight!
    public String toString() {
        return name + " weighs " + weight;
    }

    // Okay, here's what sort needs...
    public int compareTo(Object object) {
        // compareTo() takes another Duck to compare THIS Duck to.
        Duck otherDuck = (Duck)object;

        // Here's where we specify how Ducks
        // compare. If THIS Duck weighs less
        // than other Duck then we return -1;
        // if they are equal, we return 0; and if 
        // THIS Duck weighs more, we return 1.
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else { // this.weight > otherDuck.weight
            return 1;
        }
    }

}