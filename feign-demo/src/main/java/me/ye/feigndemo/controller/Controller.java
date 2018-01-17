package me.ye.feigndemo.controller;

import me.ye.feigndemo.feignclient.DemoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jacob
 * @date 15/01/2018
 */


@RestController
public class Controller {


    @Autowired
    private DemoFeignClient client;


    @GetMapping("/hello")
    public String hello() {
        return client.hello();
    }
}
