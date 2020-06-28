package com.forgus.experiment.composite;

import java.util.ArrayList;
import java.util.List;

public class Template extends View {

    private String name;
    private List<View> views;

    public Template(String name) {
        this.name = name;
    }

    @Override
    public View add(View view) {
        if(views == null || views.size() == 0) {
            views = new ArrayList<>();
        }
        views.add(view);
        return this;
    }

    @Override
    public String getResolvedResult() {
        StringBuilder sb = new StringBuilder();
        getResolvedResult(sb,this);
        return sb.toString();
    }

    public void getResolvedResult(StringBuilder sb,View view) {
        if(view instanceof Template) {
            Template template = (Template) view;
            sb.append("from template: ").append(template.name).append("\n");
            for(View v : template.views) {
                getResolvedResult(sb,v);
            }
        }else {
            sb.append(view.getResolvedResult()).append("\n");
        }
    }
}
