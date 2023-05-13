package com.ehsan.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "swim 1000 meter as a warm up!!!!!!!!";
    }
}
