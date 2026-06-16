package com.autotestkit.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ConfigLoader {

    private static final String DEFAULT_CONFIG = "config.properties";

    private ConfigLoader() {
    }

    public static Properties loadDefault() {
        Properties properties = new Properties();
        try (InputStream inputStream = ConfigLoader.class.getClassLoader().getResourceAsStream(DEFAULT_CONFIG)) {
            if (inputStream != null) {
                properties.load(inputStream);
            }
        } catch (IOException exception) {
            throw new IllegalStateException("Unable to load configuration", exception);
        }
        return properties;
    }
}