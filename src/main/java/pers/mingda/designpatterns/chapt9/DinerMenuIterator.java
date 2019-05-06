package pers.mingda.designpatterns.chapt9;

import java.util.Iterator;

// We implement the 
// Iterator interface.
public class DinerMenuIterator implements Iterator<MenuItem> {
    // position maintains the 
    // current position of the 
    // iteration over the array.
    MenuItem[] items;
    int position = 0;

    // The constructor takes the
    // array of menu items we are
    // going to iterate over.
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    // The next() method returns the
    // next item in the array and 
    // increments the position.
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        // Because the diner chef went ahead and 
        // allocated a max sized array, we need to
        // check not only if we are at the end of 
        // the array, but also if the next item is
        // null, which indicates there are no more
        // items.
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    // We need to implement remove().
    // Here, because the chef us using a fixed
    // sized Array, we just shift all the
    // elements up one when remove() is called.
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position-1] != null) {
            for (int i = position-1; i < (items.length-1); i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}