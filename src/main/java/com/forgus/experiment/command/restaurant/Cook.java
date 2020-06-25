package com.forgus.experiment.command.restaurant;

/**
 * @author Wenbin Chen
 */
public class Cook {
    private String name;
    private Cooking cooking;

    public Cook(String name,Cooking cooking) {
        this.cooking = cooking;
        this.name = name;
    }

    public void cook() {
        System.out.print(name);
        cooking.cook();
    }

    public void makeBurger() {
        System.out.println(name + "开始制作汉堡……");
    }

    public void makeMilk() {
        System.out.println(name + "开始制作热牛奶……");
    }

    public void setCooking(Cooking cooking) {
        this.cooking = cooking;
    }
}
