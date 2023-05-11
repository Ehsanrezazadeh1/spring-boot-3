package com.ehsan.springcoredemo;

import org.springframework.stereotype.Component;
@Component

public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Practice 15 min every day";
    }
}
