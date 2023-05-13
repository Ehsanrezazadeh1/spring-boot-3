package com.ehsan.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component


public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Practice 15 min every day";
    }
}
