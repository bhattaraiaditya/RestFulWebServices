package com.aditya.RESTfulWebServices.service;

import com.aditya.RESTfulWebServices.resource.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingInterfaceImpl implements GreetingInterface {
    @Override
    public Greeting getMyObject(String name){
        Greeting greeting=new Greeting();
        String content=name==null?"Hello world":"Hello "+name;
        greeting.setId(1);
        greeting.setContent(content);
        return greeting;
    }
}

