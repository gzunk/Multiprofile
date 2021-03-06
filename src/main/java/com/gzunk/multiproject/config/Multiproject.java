package com.gzunk.multiproject.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class Multiproject {

    private static final Logger LOG = LoggerFactory.getLogger(Multiproject.class);

    @Value("${configuration.fred}")
    public String configurationFred;

    @Resource(name="configurationName")
    private String configurationName;

    @Resource(name="configurationName.1")
    private String configurationName1;


    @Bean( name= "mainBean" )
    String mainBean() {
        LOG.info("Creating mainBean");
        LOG.info(configurationName);
        LOG.info(configurationFred);
        return configurationName;
    }

    @Bean( name= "otherBean" )
    String otherBean() {
        LOG.info("Creating mainBean");
        LOG.info(configurationName);
        LOG.info(configurationFred);
        LOG.info(configurationName1);
        return configurationName;
    }


}
