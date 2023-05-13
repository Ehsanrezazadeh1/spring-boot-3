package com.ehsan.springcoredemo.config;

import com.ehsan.springcoredemo.common.Coach;
import com.ehsan.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("ehsan")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
