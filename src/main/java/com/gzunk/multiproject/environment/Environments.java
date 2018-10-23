package com.gzunk.multiproject.environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import({ConfigurationA.class, ConfigurationB.class, ConfigurationC.class})
public class Environments {

    private static final Logger LOG = LoggerFactory.getLogger(Environments.class);

    // Automatically populated from property file
    @Value("${configuration.name.1}")
    String configurationName;

    @Bean( name = "configurationName.1")
    String configurationName1() {
        LOG.info("Creating Environment");
        LOG.info(configurationName);
        return configurationName;
    }
}
