package com.forgus.experiment.strategy.promotion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wenbin Chen
 */
public abstract class Goods {

    protected List<Promotion> promotions = new ArrayList<>();

    public void joinPromotions() {
        System.out.println("参与的促销活动有：");
        for (Promotion promotion : promotions) {
            promotion.name();
        }
    }

    public void addPromotion(Promotion prototion) {
        promotions.add(prototion);
    }
}
