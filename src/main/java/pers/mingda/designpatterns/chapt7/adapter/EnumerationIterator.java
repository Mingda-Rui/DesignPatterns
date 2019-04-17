package pers.mingda.designpatterns.chapt7.adapter;

import java.util.Iterator;
import java.util.Enumeration;

// Since we're adapting Enumeration
// to Iterator, our Adapter
// implements the Iterator interface...
// it has to look like an Iterator.
public class EnumerationIterator implements Iterator {
    Enumeration enum;

    // The Enumeration we're adapting.
    // we're using composition so we stash
    // it in an instance variable.
    public EnumerationIterator(Enumeratoin enum) {
        this.enum = enum;
    }

    // The Iterator's hasNext() method
    // is delegated to the Enumeration's
    // hasMoreElements() methods...
    public boolean hasNext() {
        return enum.hasMoreElements();
    }

    // ...and the Iterator's next() method
    // is delegated to the Enumerations's
    // nextElement() method.
    public Object next() {
        return enum.nextElement();
    }

    // Unfortunately, we can't support
    // Iterator's remove() method, so 
    // we have to punt (in other words,
    // we give up!). Here we just throw
    // an exception.
    public void remote() {
        throw new UnsupportedOperationException();
    }
}