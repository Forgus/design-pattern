package com.forgus.experiment.abstractfactory;

public class OracleConfig extends DatabaseConfig {
    @Override
    public String getUrl() {
        return "oracle.test.com";
    }
}
