package pers.mingda.designpatterns.chapt6.command;

public interface Command {
    // Simple. All we need is one method called execute().
    void execute();
    // Here's the new undo() method
    default void undo() {
        System.out.println("Nothing");
    }
}