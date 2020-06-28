package com.forgus.experiment.composite;

public abstract class View {

    public abstract View add(View view);

    public abstract String getResolvedResult();
}
