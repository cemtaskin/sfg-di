package tr.edu.cemtaskin.trakya.sfgdi.controllers;

import tr.edu.cemtaskin.trakya.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
