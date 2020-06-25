package com.forgus.experiment.command.appliance;

import com.forgus.experiment.command.base.Command;

/**
 * @author Wenbin Chen
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("命令未设置！");
    }
}
