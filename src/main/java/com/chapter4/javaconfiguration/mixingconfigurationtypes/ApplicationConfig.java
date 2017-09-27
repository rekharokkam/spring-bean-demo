package com.chapter4.javaconfiguration.mixingconfigurationtypes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration ("mixingTypesApplicationConfig")
@ComponentScan ("com.chapter4.javaconfiguration.mixingconfigurationtypes")
//@ImportResource ("application-context-mixing-configuration-types.xml") //If we are basing our configuration primarily upon Java configuration
public class ApplicationConfig
{
}
