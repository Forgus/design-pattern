package com.forgus.experiment.strategy;

import com.forgus.experiment.strategy.promotion.Book;
import com.forgus.experiment.strategy.promotion.Discount;
import com.forgus.experiment.strategy.promotion.Goods;
import com.forgus.experiment.strategy.promotion.Shirt;
import org.junit.Test;

/**
 * @author Wenbin Chen
 */
public class PromotionTest {

    @Test
    public void test() {
        Goods book = new Book();
        book.joinPromotions();
        System.out.println("");
        Goods shirt = new Shirt();
        shirt.joinPromotions();
        System.out.println("");
        book.addPromotion(new Discount());//图书加大促销力度
        book.joinPromotions();
    }
}
