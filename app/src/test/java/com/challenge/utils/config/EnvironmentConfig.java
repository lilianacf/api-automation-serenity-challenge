package com.challenge.utils.config;

import net.serenitybdd.model.environment.ConfiguredEnvironment;
import net.thucydides.model.util.EnvironmentVariables;

public class EnvironmentConfig {

    private static final EnvironmentVariables environmentVariables =
            ConfiguredEnvironment.getEnvironmentVariables();

    public static String getBaseUrl() {
        return environmentVariables.getProperty("restapi.baseurl");
    }
}
