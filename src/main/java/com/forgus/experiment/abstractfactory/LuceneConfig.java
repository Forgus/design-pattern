package com.forgus.experiment.abstractfactory;

public class LuceneConfig extends SearchEngineConfig {
    @Override
    public String getHost() {
        return "lucene.test.com";
    }
}
