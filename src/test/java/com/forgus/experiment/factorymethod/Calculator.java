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

package com.forgus.experiment.factorymethod;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 工厂方法模式
 *
 * @author Forgus
 * @since 2016-05-11
 */
public class Calculator {

    private double mockNumberA;
    private double mockNumberB;
    private OperationFactory operationFactory;

    @Before
    public void initInput() {
        mockNumberA = Math.random()*100;
        mockNumberB = Math.random()*100 + 1;
        List<OperationFactory> operate = new ArrayList<OperationFactory>();
        operate.add(new AddFactory());
        operate.add(new SubFactory());
        operate.add(new MulFactory());
        operate.add(new DivFactory());
        operationFactory = operate.get(new Random().nextInt(operate.size()));
    }

    @Test
    public void operateTest() {
        Operation operation = operationFactory.createOperate();
        operation.setNumberA(mockNumberA);
        operation.setNumberB(mockNumberB);
        double result = operation.getResult();
        System.out.println(mockNumberA + " " + operation.getSymbol() + " " + mockNumberB + " " + "=" + " " + result);
    }

}
