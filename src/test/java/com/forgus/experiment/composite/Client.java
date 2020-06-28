package com.forgus.experiment.composite;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        View view = new Template("index.html");
        view.add(new TextView("hello composite!"));
        View a = new Template("a.html");
        a.add(new TextView("aaa"));
        view.add(a);
        System.out.println(view.getResolvedResult());
    }

}
