package pers.mingda.designpatterns.chapt9;

import java.util.Iterator;
import java.util.ArrayList;

// Menu is also a MenuComponent,
// just like MenuItem.
public class Menu extends MenuComponent {
    // Menu can have any number of childern
    // of type MenuComponent, we'll use an
    // internal ArrayList to hold these.
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    // This is different than our old implementation:
    // we're going to give each Menu a name and a 
    // description. Before, we just relied on having
    // different classes for each menu.
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Here's how you add MenuItems or
    // other Menus to a Menu. Because
    // both MenuItems and Menus are
    // MenuComponents, we just need one
    // mehtod to do both.
    // You can also remove a MenuComponent
    // or get a MenuComponent.
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    // Here are the getter methods for getting the name and description.
    public String getName() {
        return name;
    }

    // Notice, we aren't overriding getPrice() or isVegetarian()
    // becase those methods don't make sense for a Menu
    // (although you could argue that isVegetarian() might make
    // sense). If someone tries to call those methods on a Menu,
    // they'll get an UnsupportedOperationException.
    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        // Look! We get to use an Iterator. We
        // use it to iterate through all the Menu's 
        // components... those could be other Menus,
        // or they could be MenuItems. Since both
        // Menus and MenuItems implement print(), we 
        // just call print() and the rest is up to them.
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}