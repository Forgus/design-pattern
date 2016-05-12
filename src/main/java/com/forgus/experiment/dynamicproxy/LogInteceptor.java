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

package com.forgus.experiment.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 日志记录拦截器
 *
 * @author Forgus
 * @since 2016-05-12
 */
public class LogInteceptor implements InvocationHandler {

    public LogInteceptor(Object target) {
        this.target = target;
    }

    private Object target;

    private void before(Method method) {
        System.out.println(method.getName() + "开始……");
    }

    private void after(Method method) {
        System.out.println(method.getName() + "结束……");
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method);
        method.invoke(target,args);
        after(method);
        return null;
    }
}
