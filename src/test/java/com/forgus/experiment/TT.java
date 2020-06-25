package com.forgus.experiment;

/**
 * @author Wenbin Chen
 */
public class TT implements Runnable {
    int b = 100;

    public synchronized void m1() throws InterruptedException {
        b = 1000;
        System.out.println("b = " + b);
    }

    public synchronized void m2() throws InterruptedException {
        b = 2000;
    }

    public void run() {
        try {
            m1();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TT tt = new TT();
        Thread t = new Thread(tt);
        t.start();

        tt.m2();
        Thread.sleep(1000);
        System.out.println(tt.b);
    }
}
