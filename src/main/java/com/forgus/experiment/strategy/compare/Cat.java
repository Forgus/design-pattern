package com.forgus.experiment.strategy.compare;


/**
 * @author Wenbin Chen
 */
public class Cat implements java.lang.Comparable<Cat> {

    private double weight;
    private java.util.Comparator<Cat> comparator = new WeightComparator();

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
