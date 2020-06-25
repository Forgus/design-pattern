package com.forgus.experiment.command.restaurant;

/**
 * @author Wenbin Chen
 */
public class MakeBurger implements Cooking {
    @Override
    public void cook() {
        System.out.println("开始制作汉堡……");
    }
}
