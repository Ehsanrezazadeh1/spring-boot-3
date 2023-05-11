package com.ehsan.springcoredemo;

import com.sun.source.tree.BreakTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach mycoach;

    // define a constructor for dependency injection

    @Autowired // tells the spring to inject the dependency!!!
    public DemoController (Coach thecoach) {
        mycoach = thecoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut() {
        return mycoach.getDailyWorkOut();
    }
}
