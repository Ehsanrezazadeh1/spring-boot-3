package com.ehsan.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "run hard 5k!";
    }
}
