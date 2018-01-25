package me.demo.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jacob
 * @date 23/01/2018
 */

@RefreshScope
@RestController
public class Controller {

    @Value("${info.profile}")
    private String info;

    @GetMapping("/infoProfile")
    public String infoProfile() {
        return info;
    }
}
