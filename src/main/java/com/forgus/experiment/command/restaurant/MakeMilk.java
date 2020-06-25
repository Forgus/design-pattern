package com.forgus.experiment.command.restaurant;

/**
 * @author Wenbin Chen
 */
public class MakeMilk implements Cooking {
    @Override
    public void cook() {
        System.out.println("开始制作热牛奶……");
    }
}
