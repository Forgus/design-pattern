package com.forgus.experiment.abstractfactory;

public class OldConfigFactory extends AppConfigFactory {

    @Override
    public DatabaseConfig createDbConfig() {
        return new OracleConfig();
    }

    @Override
    public SearchEngineConfig createSeConfig() {
        return new LuceneConfig();
    }
}
