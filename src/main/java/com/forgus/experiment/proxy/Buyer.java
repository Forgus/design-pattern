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

import lombok.Getter;
import lombok.Setter;

/**
 *
 * 购买者
 *
 * @author Forgus
 * @since 2016-05-12
 */
@Getter
@Setter
public class Buyer implements Buy {

    private String name;
    private House house;

    public Buyer(House house,String name) {
        this.name = name;
        this.house = house;
    }

    public void buyHouse() {
        house.setOwner(name);
        System.out.println(house.getName()+"已被"+house.getOwner()+"购买");
    }
}
