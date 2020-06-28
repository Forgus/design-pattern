package com.forgus.experiment.abstractfactory;

/**
 * 应用配置工厂
 */
public abstract class AppConfigFactory {

    public abstract DatabaseConfig createDbConfig();

    public abstract SearchEngineConfig createSeConfig();

}
