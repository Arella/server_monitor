package com.ds.hackathan.hackathan.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.ds.hackathan.hackathan.repos")
@EnableCaching
public class JpaConfig {

}