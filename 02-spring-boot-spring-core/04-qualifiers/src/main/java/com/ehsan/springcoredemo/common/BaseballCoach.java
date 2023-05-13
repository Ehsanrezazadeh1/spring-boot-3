package com.ehsan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "practice Baseball";
    }
}
