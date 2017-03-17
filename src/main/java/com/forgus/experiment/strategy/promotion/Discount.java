package com.forgus.experiment.strategy.promotion;

/**
 * @author Wenbin Chen
 */
public class Discount implements Promotion {
    @Override
    public void name() {
        System.out.println("3件8折");
    }
}
