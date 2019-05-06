package pers.mingda.designpatterns.chapt9;

import java.util.ArrayList;

class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position < menuItems.size())
            return menuItems.get(position) != null;
        else return false;
    }

    public Object next() {
        return menuItems.get(position++);
    }
    
}