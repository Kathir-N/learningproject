package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

	//private final Service2Client service2Client = new Service2Client();

	//Service2Client service2Client = new Service2Client();
	@Autowired
	Service2Client service2Client2;
	
	
	/*
	 * public Service2Controller(Service2Client service2Client) {
	 * this.service2Client = service2Client; }
	 */

    @GetMapping("/consume-data")
    public String consumeData() {
        return "Consumed: " + service2Client2.fetchDataFromService1();
    }
}
