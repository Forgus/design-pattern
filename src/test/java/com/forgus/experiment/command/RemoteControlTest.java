package com.forgus.experiment.command;

import com.forgus.experiment.command.appliance.*;
import org.junit.Test;

/**
 * @author Wenbin Chen
 */
public class RemoteControlTest {

    @Test
    public void click() {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.click();
        remoteControl.setCommand(new LightOnCommand(new Light()));
        remoteControl.click();
        remoteControl.setCommand(new AirConditionerOnCommand(new AirConditioner()));
        remoteControl.click();
    }
}
