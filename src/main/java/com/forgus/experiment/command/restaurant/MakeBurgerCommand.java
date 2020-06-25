package com.forgus.experiment.command.restaurant;

import com.forgus.experiment.command.base.Command;

/**
 * @author Wenbin Chen
 */
public class MakeBurgerCommand implements Command {

    private Cook receiver;

    public MakeBurgerCommand() {
        receiver = new Cook("厨师小李", new MakeBurger());
        System.out.println("点菜：一个汉堡。");
    }

    @Override
    public void execute() {
        receiver.cook();
    }

    public void setReceiver(Cook cook) {
        this.receiver = cook;
    }
}
