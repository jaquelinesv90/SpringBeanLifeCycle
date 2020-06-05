package com.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//pode-se definir um bean com uma classe de configuração.
@Configuration
public class ConfigurationService { 
	   
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public CustomerActivationService customerActivationService() {
		return new CustomerActivationService();
	}

}
