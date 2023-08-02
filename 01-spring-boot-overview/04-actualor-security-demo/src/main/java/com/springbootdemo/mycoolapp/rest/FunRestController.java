package com.springbootdemo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that return "hello world"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    // expose a new endpoint for "workout";

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard hard 5k!";
    }

    //expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyDailyFortune(){
        return "Today is your lucky day!";
    }
}
