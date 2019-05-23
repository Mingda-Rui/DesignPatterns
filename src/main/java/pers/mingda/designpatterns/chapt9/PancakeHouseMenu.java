package pers.mingda.designpatterns.chapt9;

import java.util.Iterator;
import java.util.ArrayList;

public class PancakeHouseMenu extends Menu {
    ArrayList<MenuItem> menuItems;

    // Lou's using an ArrayList to store
    // his menu items
    // public PancakeHouseMenu() {
    //     menuItems = new ArrayList<MenuItem>();
    
    //     // Each menu item is added to the
    //     // ArrayList here, in the constructor
    //     addItem("K&B's Pancake Breakfast", 
    //         "Pancakes with scrambled eggs, and toast", 
    //         true,
    //         2.99);

    //     // Each MenuItem has a name, a 
    //     // description, whether or not it's a 
    //     // vegetarian item, and the price.
    //     addItem("Regular Pancake Breakfast", 
    //         "Pancakes with fried eggs, sausage", 
    //         false, 
    //         2.99);

    //     addItem("Blueberry Pancakes",
    //         "Pancakes made with fresh blueberries", 
    //         true,
    //         3.49);

    //     addItem("Waffles",
    //         "Waffles, with your choice of blueberries or starwberries",
    //         true, 
    //         3.59);
    // }
    public PancakeHouseMenu(String name, String description) {
        super(name, description);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        // To add a menu item, Lou creates a new 
        // Menuitem object, passing in each argument,
        // and then adds it to the ArrayList
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    // public ArrayList<MenuItem> getMenuItems() {
    //     // The getMenuItems() method returns the list of memu items
    //     return menuItems;
    // }

    public Iterator<MenuItem> createIterator() {
        // return new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();
    }

    // other menu methods here
    // Lou has a bunch of other menu code that depends
    // on the ArrayList implementation. He doesn't want
    // to have to rewrite all that code!

}