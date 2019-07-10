package pers.mingda.designpatterns.chapt12;

// Remember, and Adapter implements the target interface,
// which in this case is Quackable.
public class GooseAdapter implements Quackable {
    Goose goose;

    // The constructor takes the 
    // goose we are going to adapt.
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }
}