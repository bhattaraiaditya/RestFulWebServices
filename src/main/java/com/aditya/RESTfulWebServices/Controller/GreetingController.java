package com.aditya.RESTfulWebServices.Controller;

import com.aditya.RESTfulWebServices.resource.Greeting;
import com.aditya.RESTfulWebServices.service.GreetingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingInterface greetingInterface;

    @Autowired
    public GreetingController(GreetingInterface greetingInterface){
        this.greetingInterface=greetingInterface;
    }



    @GetMapping(value="/greeting")
    public Greeting getGreetingDetail(@RequestParam(value="name", defaultValue="World") String name){
       return greetingInterface.getMyObject(name);
    }
}
