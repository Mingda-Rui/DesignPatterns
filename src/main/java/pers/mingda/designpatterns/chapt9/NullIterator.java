package pers.mingda.designpatterns.chapt9;

import java.util.Iterator;

// This is the laziest Iterator you've
// ever seen, at every step of the 
// way it punts.
class NullIterator implements Iterator<MenuComponent> {

    // When next() is called, we return null.
    public MenuComponent next() {
        return null;
    }

    // Most importantly when hasNext() is 
    // called we always return false.
    public boolean hasNext() {
        return false;
    }

    // And the NullIterator wouldn't think
    // of supporting remove.
    public void remove() {
        throw new UnsupportedOperationException();
    }
}