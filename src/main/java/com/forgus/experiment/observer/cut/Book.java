package com.forgus.experiment.observer.cut;

import lombok.Getter;

import java.util.Observable;

/**
 * @author Forgus
 */
@Getter
public class Book extends Observable {

    private final String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        if (this.price != price) {
            this.price = price;
            priceChanged();
        }
    }

    private void priceChanged() {
        System.out.println("《" + name + "》价格调整,调整后价格：" + this.price);
        setChanged();
        notifyObservers();
    }

}
