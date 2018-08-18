package com.forezp.servicezipkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class HiController {

    private static final Logger LOG = Logger.getLogger(HiController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    public String callHome(){
        LOG.log(Level.INFO, "calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }

    @GetMapping("/info")
    public String info(){
        LOG.log(Level.INFO, "calling trace service-hi ");

        return "calling trace service-hi ";
    }
}
