package com.luv2code.springcodedemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //define our init method
//    @PostConstruct
//    public void doMyStartUpStaff(){
//        System.out.println("In doMyStartUpStaff():" + getClass().getSimpleName());
//    }

    //define our destory method
//    @PreDestroy
//    public void doMyCleanUpStaff(){
//        System.out.println("In doMyCleanUpStaff():" + getClass().getSimpleName());
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins.";
    }
}
