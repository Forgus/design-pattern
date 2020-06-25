package com.forgus.experiment.command.restaurant;

import com.forgus.experiment.command.base.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wenbin Chen
 */
public class Order {

    private List<Command> commands;
    private Table table;

    public Order() {
        commands = new ArrayList<>();
    }

    public void orderUp() {
        System.out.println("下单！");
        for (Command command : commands) {
            command.execute();
        }
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

}
