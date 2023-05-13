package com.ehsan.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // set to select the baen to run in democontroller

public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "run hard 5k!";
    }
}
