package com.ehsan.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public class CricketCoach implements Coach{
    public CricketCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }



    @Override
    public String getDailyWorkOut() {
        return "Practice 15 min every day";
    }
}
