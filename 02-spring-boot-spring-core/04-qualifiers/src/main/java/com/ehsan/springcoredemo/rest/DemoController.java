package com.ehsan.springcoredemo.rest;

import com.ehsan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach mycoach;


    // define setter injection
    @Autowired
    public void DemoController (@Qualifier("cricketCoach") Coach thecoach) {
        mycoach = thecoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut() {
        return mycoach.getDailyWorkOut();
    }
}
