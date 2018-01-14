package me.ye.eurekaclientdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jacob
 * @date 14/01/2018
 */

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Cloud!";
    }
}
