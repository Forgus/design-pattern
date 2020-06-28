package com.forgus.experiment.abstractfactory;

public class ElasticsearchConfig extends SearchEngineConfig {
    @Override
    public String getHost() {
        return "es.test.com";
    }
}
