package com.gzunk.multiproject.environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("configurationb")
public class ConfigurationB {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigurationB.class);

    @Value("${configuration.name}")
    String configurationName;

    @Bean( name = "configurationName")
    String configurationName() {
        LOG.info("Creating Configuration B");
        LOG.info(configurationName);
        return configurationName;
    }
}
