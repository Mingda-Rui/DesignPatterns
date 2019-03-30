package pers.mingda.designpatterns.chapt5;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    // This code is only started
    // when the boiler is empty!
    public ChocolateBoiler() {
        empty = true;
        boiled = false;    
    }    

    // To fill the boiler it must be
    // empty, and, once it's full, we set 
    // the empty and boiled flags.  
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    // To drain the boiler, it must be full
    // (non empty) and also boilder. Once it is
    // drained we set empty back to true.
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;    
        }    
    }

    // To boil the mixture, the boiler 
    // has to be full and not already
    // boiled. Once it's boiled we set
    // the boiled flag to true.
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }    
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}