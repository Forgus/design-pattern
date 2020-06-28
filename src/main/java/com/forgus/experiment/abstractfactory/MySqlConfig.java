package com.forgus.experiment.abstractfactory;

public class MySqlConfig extends DatabaseConfig {
    @Override
    public String getUrl() {
        return "mysql.test.com";
    }
}
