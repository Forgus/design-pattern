package com.forgus.experiment.abstractfactory;

import org.junit.Test;

public class Client {

    @Test
    public void configTest() {
        System.out.println("Old appConfig:");
        printAppConfig(new OldConfigFactory());
        System.out.println("New appConfig:");
        printAppConfig(new NewConfigFactory());
    }

    private void printAppConfig(AppConfigFactory appConfigFactory) {
        DatabaseConfig dbConfig = appConfigFactory.createDbConfig();
        SearchEngineConfig seConfig = appConfigFactory.createSeConfig();
        System.out.println("dbConfig:" + dbConfig.getUrl());
        System.out.println("seConfig:" + seConfig.getHost());
    }

}
