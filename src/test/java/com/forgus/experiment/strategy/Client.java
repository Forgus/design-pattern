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

package com.forgus.experiment.strategy;

import com.forgus.experiment.strategy.compare.DataSorter;
import com.forgus.experiment.strategy.compare.Dog;
import org.junit.Test;

/**
 * 排序
 *
 * @author Forgus
 * @since 2016-05-13
 */
public class Client {

    @Test
    public void sortTest() {
        Dog[] a = {new Dog(4, 23), new Dog(2, 22), new Dog(3, 56)};
        DataSorter.sort(a);
        DataSorter.p(a);

    }

}
