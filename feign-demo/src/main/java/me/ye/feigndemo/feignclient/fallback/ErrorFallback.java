package me.ye.feigndemo.feignclient.fallback;

import me.ye.feigndemo.feignclient.Client;
import org.springframework.stereotype.Component;

/**
 * @author Jacob
 * @date 15/01/2018
 */

@Component
public class ErrorFallback implements Client {

    @Override
    public String hello() {
        return "Error!";
    }
}
