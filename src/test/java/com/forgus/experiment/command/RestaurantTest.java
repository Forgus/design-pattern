package com.forgus.experiment.command;

import com.forgus.experiment.command.restaurant.*;
import org.junit.Test;

/**
 * @author Wenbin Chen
 */
public class RestaurantTest {

    @Test
    public void order() {
        Order order = new Order();
        order.setTable(new Table("05"));
        order.addCommand(new MakeBurgerCommand());
        order.addCommand(new MilkCommand());
        order.orderUp();
    }

}
