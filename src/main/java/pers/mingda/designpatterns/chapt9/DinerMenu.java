package pers.mingda.designpatterns.chapt9;

// And here's Mel's implementation of the Diner menu
public class DinerMenu extends Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    // Mel takes a different approach; he's using an Array so he
    // can control the max size of the menu and retrieve menu
    // items out without having to cast his objects.
    MenuItem[] menuItems;

    // public DinerMenu() {
    //     menuItems = new MenuItem[MAX_ITEMS]; 

    //     addItem("Vegetarian BLT",
    //         "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    //     addItem("BLT",
    //         "Bacon with lettuce & tomato on whole wheat", false, 2.99);
    //     addItem("Soup of the day", 
    //         "Soup of the day, with a side of potato salas", false, 3.29);
    //     addItem("Hotdog",
    //         "A hot dog, with saurkraut, relish, onions, topped with cheese",
    //         false, 3.05);
    //     // a couple of other Diner Menu items added here
    // }

    public DinerMenu(String name, String description) {
        super(name, description);
    }

    // addItem() takes all the parameters 
    // necessary to create a MenuItem and 
    // instantiates one. It also checks to make
    // sure we haven't hit hte menu size limit.
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            // Mel specifically wnats to keep his menu under a 
            // certain size (presumably so he doesn't have to
            // remember too many recipes).
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

}