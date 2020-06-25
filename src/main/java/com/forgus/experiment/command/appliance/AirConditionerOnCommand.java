package com.forgus.experiment.command.appliance;

import com.forgus.experiment.command.base.Command;

/**
 * @author Wenbin Chen
 */
public class AirConditionerOnCommand implements Command {

    private AirConditioner airConditioner;

    public AirConditionerOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}
