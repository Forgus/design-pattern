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

import java.util.Arrays;

/**
 * @author Forgus
 * @since 2016-05-13
 */
public class DataSorter {

    public static void sort(Comparable[] a) {
//        for (int i=a.length; i>0; i--) {
//            for (int j=0; j<i-1; j++) {
//                Comparable o1 = a[j];
//                Comparable o2 = a[j+1];
//                if(o1.compareTo(o2) == 1) {
//                    swap(a, j, j+1);
//                }
//            }
//        }
        Arrays.sort(a);
    }


    private static void swap(Object[] a, int j, int i) {
        Object temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }



    public static void p(Object[] a) {
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
