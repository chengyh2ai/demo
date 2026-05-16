package com.sinobridge.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public IdGenerator idGenerator() {
        return new IdGenerator();
    }
}