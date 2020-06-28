package com.forgus.experiment.composite;

public class TextView extends View {

    private String content;

    public TextView(String content) {
        this.content = content;
    }

    @Override
    public View add(View view) {
        return this;
    }

    @Override
    public String getResolvedResult() {
        return content;
    }
}
