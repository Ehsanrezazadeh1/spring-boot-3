package com.ehsan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "run hard 5k!";
    }
}
