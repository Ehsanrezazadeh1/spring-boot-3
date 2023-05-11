package com.ehsan.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //inject properties for: coach.name and team.name:
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for {team name } and {coach name}
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "coach " + coachName + ", team name " + teamName;
    }



    //expose simple "/" to return hello world

    @GetMapping("/")
    public String sayHello() {
        return "Hello! I am going to be the BEST Spring developer!";
    }



    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getdailyWorkout() {
        return "run a hard 5k!!";
    }



    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getdailyFortune() {
        return "today is your lucky day";
    }


}
