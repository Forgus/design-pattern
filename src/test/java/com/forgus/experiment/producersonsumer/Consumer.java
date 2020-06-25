package com.forgus.experiment.producersonsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author Wenbin Chen
 */
public class Consumer implements Runnable {

    private BlockingQueue<Task> queue;

    public Consumer(BlockingQueue<Task> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        System.out.println("start consumer id=" + Thread.currentThread().getId());
        try {
            while (true) {
                Task task = queue.take();
                System.out.println(task + " is get from queue");
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
