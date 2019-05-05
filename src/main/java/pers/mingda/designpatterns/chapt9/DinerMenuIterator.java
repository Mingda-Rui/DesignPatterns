package pers.mingda.designpatterns.chapt9;

// We implement the 
// Iterator interface.
public class DinerMenuIterator implements Iterator {
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
    public Object next() {
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
}