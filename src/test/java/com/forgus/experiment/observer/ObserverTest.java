package com.forgus.experiment.observer;

import com.forgus.experiment.observer.cut.Book;
import com.forgus.experiment.observer.cut.Customer;

/**
 * @author Wenbin Chen
 */
public class ObserverTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java编程思想",100);
        Customer c1 = new Customer("张三");
        Customer c2 = new Customer("李四");
        c1.subscribe(b1);
        c2.subscribe(b1);
        System.out.println("");
        b1.setPrice(105);
        b1.setPrice(98);
        System.out.println("");
        c1.unSubscribe(b1);
        System.out.println("");
        b1.setPrice(86);
    }
}
