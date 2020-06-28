package com.forgus.experiment.abstractfactory;

public class NewConfigFactory extends AppConfigFactory {
    @Override
    public DatabaseConfig createDbConfig() {
        return new MySqlConfig();
    }

    @Override
    public SearchEngineConfig createSeConfig() {
        return new ElasticsearchConfig();
    }
}
