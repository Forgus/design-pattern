package com.forgus.experiment.command.appliance;

import com.forgus.experiment.command.base.Command;

/**
 * @author Wenbin Chen
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

}
