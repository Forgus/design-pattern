package com.forgus.experiment.command.appliance;

/**
 * @author Wenbin Chen
 */
public class RemoteControl {
    private Command command = new NoCommand();

    public void click() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
