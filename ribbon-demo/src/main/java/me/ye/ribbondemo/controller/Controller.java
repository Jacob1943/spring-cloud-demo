package me.ye.ribbondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jacob
 * @date 14/01/2018
 */

@RestController
public class Controller {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {

        return this.restTemplate.getForObject("http://eureka-client-demo/hello", String.class);
    }
}
