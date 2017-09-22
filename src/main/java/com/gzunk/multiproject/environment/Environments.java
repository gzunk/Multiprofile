package com.gzunk.multiproject.environment;

import org.springframework.context.annotation.Import;

@Import({ConfigurationA.class, ConfigurationB.class, ConfigurationC.class})
public class Environments {
}
