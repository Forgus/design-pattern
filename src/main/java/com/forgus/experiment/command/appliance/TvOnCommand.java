package com.forgus.experiment.command.appliance;

/**
 * @author Wenbin Chen
 */
public class TvOnCommand implements Command {

    private Television television;

    public TvOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}
