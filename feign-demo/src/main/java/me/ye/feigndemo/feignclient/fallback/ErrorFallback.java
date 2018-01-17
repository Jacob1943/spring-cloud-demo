package me.ye.feigndemo.feignclient.fallback;

import me.ye.feigndemo.feignclient.DemoFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author Jacob
 * @date 15/01/2018
 */

@Component
public class ErrorFallback implements DemoFeignClient {

    @Override
    public String hello() {
        return "Error!";
    }
}
