package com.ig.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:messages.properties")
@ComponentScan(basePackages="com.ig.service com.ig.repository com.ig.controller")
public class SpringConfig {
	
	
}
