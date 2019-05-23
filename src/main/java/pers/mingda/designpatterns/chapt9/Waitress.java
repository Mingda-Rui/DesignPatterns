package pers.mingda.designpatterns.chapt9;

// Yup! The Waitress code really is this simple.
// Now we just hand her the top level menu
// component, the one that contains all the
// other menus. We've called that allMenus.
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    // All she has to do to print the entire menu
    // hierarchy - all the menus, and all the menu
    // items - is call print() on the top level menu.
    public void printMenu() {
        allMenus.print();
    }
} 