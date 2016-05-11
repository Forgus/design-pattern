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

/**
 * @author Forgus
 * @since 2016-05-12
 */
public class Proxy implements Buy {

    private Buyer buyer;

    public Proxy(House house) {
        buyer = new Buyer(house,"小明");
    }

    public void buyHouse() {
        before();
        buyer.buyHouse();
        after();
    }

    private void after() {
        System.out.println("一切搞定，中介把房产证和钥匙送到小明手里。");
    }

    private void before() {
        System.out.println("中介开始帮小明办理购房手续……");
        System.out.println("中介帮小明开具各种证明……");
        System.out.println("中介帮小明填写各种表格……");
    }
}
