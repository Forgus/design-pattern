package com.forgus.experiment.command.appliance;

/**
 * @author Wenbin Chen
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("命令未设置！");
    }
}
