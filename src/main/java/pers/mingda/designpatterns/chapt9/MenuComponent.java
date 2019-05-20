package pers.mingda.designpatterns.chapt9;

// MenuComponent provides default
// implementations for every method.
public abstract class MenuComponent {
    
    // We've grouped together the
    // "composite" methods - that is,
    // methods to add, remove and get
    // MenuComponents.
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    
    // Here are the "operation" methods;
    // these are used by the MenuItems.
    // It turns out we can also use a 
    // couple of them in Menu too, as
    // you'll see in a couple of pages when
    // we show the Menu code.
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    // print() is an "operation" method
    // that both our Menus and MenuItem
    // will implement, but we provide a 
    // default operation here.
    public void print() {
        throw new UnsupportedOperationException();
    }

}