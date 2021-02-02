package com.redditclone.backend.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
public class AppConfiguration {
    @NotNull
    private String appUrl;

    public String getAppUrl() {
        return appUrl;
    }
}
