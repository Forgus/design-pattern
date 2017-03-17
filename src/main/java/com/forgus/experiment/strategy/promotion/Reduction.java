package com.forgus.experiment.strategy.promotion;

/**
 * @author Wenbin Chen
 */
public class Reduction implements Promotion {
    @Override
    public void name() {
        System.out.println("满300减150");
    }
}
