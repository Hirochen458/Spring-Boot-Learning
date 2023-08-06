package com.luv2code.springcodedemo.rest;

import com.luv2code.springcodedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for dependency
    private Coach myCoach;

    //Define a constructor for dependency injection with Qualifier
    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach){

        System.out.println("In constructor: " + getClass().getSimpleName());

        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    //Define a constructor for dependency injection with primary or not
//    @Autowired
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }


    //Setter injection
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

    //check bean singleton or prototype scope
//    @GetMapping("/check")
//    public String check(){
//        return "Comparing beans: myCoach == anotherCoach, "+ (myCoach == anotherCoach);
//    }
}
