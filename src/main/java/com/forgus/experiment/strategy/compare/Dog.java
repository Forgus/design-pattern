/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.forgus.experiment.strategy.compare;

import lombok.Getter;
import lombok.Setter;


/**
 * 狗
 *
 * @author Forgus
 * @since 2016-05-13
 */

@Getter
@Setter
public class Dog implements Comparable<Dog> {

    /**
     * 默认比较策略
     */
    private Comparator comparator = new DogHeightComparator();
    private int height;
    private int weight;

    public Dog(int height,int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int compareTo(Dog o) {
        return comparator.compare(this,o);
    }

    @Override
    public String toString() {
        return height + "";
    }
}
