package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://nacos-provider2/add?a=10&b=20", String.class).getBody();
    }

//    private final RestTemplate restTemplate;
//
//    @Value("${server.port}")
//    private String port;
//
//    @Autowired
//    public ConsumerController(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    @RequestMapping(value = "/hi", method = RequestMethod.GET)
//    public String echo() {
//        return "I'm port:" + port + ", " + restTemplate.getForObject("http://nacos-provider1/hi", String.class);
//    }
}