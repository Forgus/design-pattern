package com.forgus.experiment.observer.cut;


import java.util.Observable;
import java.util.Observer;

/**
 * @author Forgus
 */
public class Customer implements Observer {

    private Book book;
    private double originPrice;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Book) {
            this.book = (Book) o;
            if (book.getPrice() < originPrice) {
                notice();
            }
        }
    }

    public void subscribe(Book book) {
        book.addObserver(this);
        originPrice = book.getPrice();
        System.out.println(name + "订阅《" + book.getName() + "》降价通知服务。");

    }

    public void unSubscribe(Book book) {
        book.deleteObserver(this);
        System.out.println(name + "退订《" + book.getName() + "》降价通知服务。");
    }

    private void notice() {
        System.out.println(name + " 收到通知：《" + book.getName() + "》降价，已降价：" + (originPrice - book.getPrice()) + "元");
    }
}
