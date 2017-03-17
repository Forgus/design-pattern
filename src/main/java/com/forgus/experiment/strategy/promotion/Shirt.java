package com.forgus.experiment.strategy.promotion;

/**
 * @author Wenbin Chen
 */
public class Shirt extends Goods {
    public Shirt() {
        promotions.add(new Discount());//衬衫参与折扣活动
    }

    @Override
    public void joinPromotions() {
        System.out.print("衬衫");
        super.joinPromotions();
    }
}
