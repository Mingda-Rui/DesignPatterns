package pers.mingda.designpatterns.chapt9;

import java.util.Hashtable;

// CafeMenu doesn't implement our new Menu
// interface, but this is easily fixed.
public class CafeMenu {
    // The Cafe is storing their menu items in a Hashtable.
    // Does that support Iterator? We'l see shortly...
    Hashtable<String, MenuItem> menuItems = new Hashtable<>();

    public CafeMenu() {
        // Like the other Menus, the menu items are
        // initialized in the constructor.
        addItem("Veggie Burger and Air Fries", 
            "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
            true, 3.99);
        addItem("Soup of the day",
            "A cup of the soup of the day, with a side salad",
            false, 3.69);
        addItem("Burrito",
            "A large burrito, with whole pinto beans, salsa, guacamole",
            true, 4.29);
    }

    // Here's where we create a new MenuItem
    // and add it to the menuItems hashtable.
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        // the key is the item name, the value is the menuItem object
        menuItems.put(menuItem.getName(), menuItem);
    }

    // We're not going to need this anymore.
    public Hashtable<String, MenuItem> getItems() {
        return menuItems;
    }
}