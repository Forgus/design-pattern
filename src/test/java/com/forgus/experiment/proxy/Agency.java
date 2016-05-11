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

package com.forgus.experiment.proxy;

import org.junit.Before;
import org.junit.Test;

/**
 * 房产中介
 *
 * @author Forgus
 * @since 2016-05-12
 */
public class Agency {

    private Buyer mockBuyer;
    private House mockHouse;
    private Proxy mockProxy;

    @Before
    public void init() {
        mockHouse = new House("铂金时代6-2-2201");
        mockProxy = new Proxy(mockHouse);
        mockBuyer = new Buyer(mockHouse,"小明");
    }

    @Test
    public void buyHouseTest() {
        System.out.println("小明亲自买房子：");
        mockBuyer.buyHouse();
        System.out.println("小明通过中介买房子：");
        mockProxy.buyHouse();
    }

}
