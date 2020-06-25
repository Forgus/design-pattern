package com.forgus.experiment.strategy.compare;

import java.util.Comparator;

/**
 * @author Wenbin Chen
 */
public class WeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        }
        if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        return 0;
    }
}
