package com.example.demo2;

import org.springframework.web.client.RestTemplate;

import org.springframework.stereotype.Service;

@Service
public class Service2Client {

    private final RestTemplate restTemplate = new RestTemplate();

    

	/*
	 * public RestTemplate getRestTemplate() { return restTemplate; }
	 */

	public String fetchDataFromService1() {
        String service1Url = "http://localhost:8080/send-data"; // Replace PORT with the actual Service 1 port
        // Make HTTP GET request
        return restTemplate.getForObject(service1Url, String.class);
    }
}


