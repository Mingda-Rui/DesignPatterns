package pers.mingda.designpatterns.chapt9;

import java.util.HashMap;

// CafeMenu implements the Menu
// interface, so the Waitress can use
// it just like the other two Menus.
public class CafeMenu extends Menu {
    // The Cafe is storing their menu items in a Hashtable.
    // Does that support Iterator? We'l see shortly...
    HashMap<String, MenuItem> menuItems = new HashMap<>();

    // public CafeMenu() {
    //     // Like the other Menus, the menu items are
    //     // initialized in the constructor.
    //     addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true,
    //             3.99);
    //     addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
    //     addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
    // }

    public CafeMenu(String name, String description) {
        super(name, description);
    }

    // Here's where we create a new MenuItem
    // and add it to the menuItems hashtable.
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        // the key is the item name, the value is the menuItem object
        menuItems.put(menuItem.getName(), menuItem);
    }

}