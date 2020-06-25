package com.forgus.experiment.producersonsumer;

import lombok.Data;

/**
 * @author Wenbin Chen
 */
@Data
public class Task {

    private int id;

    public Task(int id) {
        this.id = id;
    }

    public String toString() {
        return "task:" + id;
    }
}
