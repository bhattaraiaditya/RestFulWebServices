package com.aditya.RESTfulWebServices.service;

import com.aditya.RESTfulWebServices.resource.Greeting;
import org.springframework.stereotype.Service;


public interface GreetingInterface {
    Greeting getMyObject(String name);
}
