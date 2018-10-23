package com.gzunk.multiproject.environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("configurationc")
public class ConfigurationC {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigurationC.class);

    // Automatically populated from property file
    @Value("${configuration.name}")
    String configurationName;

    @Bean( name = "configurationName")
    String configurationName() {
        LOG.info("Creating Configuration C");
        LOG.info(configurationName);
        return configurationName;
    }

}
