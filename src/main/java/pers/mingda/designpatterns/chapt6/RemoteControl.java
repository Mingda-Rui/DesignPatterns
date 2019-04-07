package pers.mingda.designpatterns.chapt6;

public class RemoteControl {
    // This time around the remote is going to 
    // handle seven On and Off commands, which 
    // we'll hold in corresponding arrays.
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        // In the constructor all we need to do is
        // instantiate and initialize the on and off
        // arrays.
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    // The setCommand() method takes a slot position
    // and an On and Off command to be stored in
    // that slot. It puts these commands in the on and
    // off arrays for later use.
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // When an On or Off button is 
    // pressed, the hardware takes
    // care of calling the corresponding 
    // methods on ButtonWasPushed() or 
    // offButtonWasPushed().
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}