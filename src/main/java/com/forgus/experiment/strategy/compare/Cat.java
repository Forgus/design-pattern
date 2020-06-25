package com.forgus.experiment.strategy.compare;


import java.util.Comparator;

/**
 * @author Wenbin Chen
 */
public class Cat implements Comparable<Cat> {

    private double weight;
    private Comparator<Cat> comparator = new WeightComparator();

    public Cat(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat o) {
        return comparator.compare(this, o);
    }

    @Override
    public String toString() {
        return weight + " ";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
