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

package com.forgus.experiment.simplefactory;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * simplefactory
 *
 * @author Forgus
 * @since 2016-05-11
 */
public class Calculator {

    private double mockNumberA;
    private double mockNumberB;
    private String operate;

    @Before
    public void initInput() {
        mockNumberA = Math.random()*100;
        mockNumberB = Math.random()*100 + 1;
        String[] strs = {"+","-","*","/"};
        operate = strs[new Random().nextInt(strs.length)];
    }

    @Test
    public void operateTest() {
        Operation operation = OperationFactory.createOperate(operate);
        operation.setNumberA(mockNumberA);
        operation.setNumberB(mockNumberB);
        double result = operation.getResult();
        System.out.println(mockNumberA + " " + operate + " " + mockNumberB + " " + "=" + " " + result);
    }

}
