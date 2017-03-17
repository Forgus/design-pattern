package com.forgus.experiment.strategy.promotion;


/**
 * @author Wenbin Chen
 */
public class Book extends Goods {
    public Book() {
        promotions.add(new Reduction());//图书参与满减活动
    }

    @Override
    public void joinPromotions() {
        System.out.print("图书");
        super.joinPromotions();
    }
}
