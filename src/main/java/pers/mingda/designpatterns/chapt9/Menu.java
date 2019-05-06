package pers.mingda.designpatterns.chapt9;

// This is a simple interface that just
// lets clients get an iterator for 
// the items in the menu.
public interface Menu {
    public Iterator createIterator();
}