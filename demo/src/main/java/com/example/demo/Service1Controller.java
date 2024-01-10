package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {

    @GetMapping("/send-data")
    public String sendData() {
        // Logic to send data
        return "Data sent from Service 1 to Service 2";
    }
    
    

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
    
    //http://localhost:8080/hello?name=kathires -->output will be hello kathires!
}
