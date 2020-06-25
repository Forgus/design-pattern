package com.forgus.experiment.command.restaurant;

import com.forgus.experiment.command.base.Command;

/**
 * @author Wenbin Chen
 */
public class MilkCommand implements Command {
    private Cook receiver;

    public MilkCommand() {
        receiver = new Cook("厨师小王",new MakeMilk());
        System.out.println("点菜：一杯热牛奶。");
    }

    @Override
    public void execute() {
        receiver.cook();
    }

    public void setReceiver(Cook cook) {
        this.receiver = cook;
    }
}
