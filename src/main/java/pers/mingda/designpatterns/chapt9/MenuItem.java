package pers.mingda.designpatterns.chapt9;

import java.util.Iterator;

// First we need to extend
// the MenuComponent interface.
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    // The constructor just takes
    // the name, description, etc. and
    // keeps a reference to them all.
    // This is pretty much like our old
    // menu item implementation.
    public MenuItem(String name, 
                    String description, 
                    boolean vegetarian, 
                    double price) 
    {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    // Here's our getter methods - just
    // like our previous implementation.
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    // This is different from the previous implementation.
    // Here we're overriding the print() method in the
    // MenuComponent class. For MenuItem this method
    // prints the complete menu entry: name, description,
    // price and whether or not it's veggie.
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("    -- " + getDescription());
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }

}