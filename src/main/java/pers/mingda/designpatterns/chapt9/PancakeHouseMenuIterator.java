package pers.mingda.designpatterns.chapt9;

import java.util.ArrayList;

class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        return menuItems.get(position) != null;
    }

    public Object next() {
        return menuItems.get(position++);
    }
    
}