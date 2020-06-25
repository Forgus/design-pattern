package com.forgus.experiment.producersonsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Wenbin Chen
 */
public class Producer implements Runnable {

    private BlockingQueue<Task> queue;
    private static AtomicInteger count = new AtomicInteger();
    private volatile boolean isRunning = true;

    public Producer(BlockingQueue<Task> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        System.out.println("start producer id=" + Thread.currentThread().getId());

        try {
            while (isRunning) {
                TimeUnit.SECONDS.sleep(1);
                Task task = new Task(count.incrementAndGet());
                System.out.println(task + " is put into queue");
                if (!queue.offer(task, 2, TimeUnit.SECONDS)) {
                    System.out.println("failed to put task: " + task.getId());
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public void stop() {
        isRunning = false;
    }
}
