package pers.mingda.designpatterns.chapt9;

public interface Iterator {
    // Here's our two methods:
    // The hasNext() method returns a boolean
    // indicating whether or not there are more
    // elements to iterate over...
    boolean hasNext();
    // ...and the next() method
    // returns the next element.
    Object next();
}