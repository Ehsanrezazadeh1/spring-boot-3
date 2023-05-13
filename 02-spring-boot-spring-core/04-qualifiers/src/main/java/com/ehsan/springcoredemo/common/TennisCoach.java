package com.ehsan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "practice Tennis";
    }
}
