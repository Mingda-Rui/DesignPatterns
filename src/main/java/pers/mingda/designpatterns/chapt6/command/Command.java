package pers.mingda.designpatterns.chapt6.command;

public interface Command {
    // Simple. All we need is one method called execute().
    public void execute();
    // Here's the new undo() method
    public void undo();
}