package me.ye.feigndemo.feignClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jacob
 * @date 15/01/2018
 */

@FeignClient(name = "eureka-client-demo")
public interface Client {


    @GetMapping("/hello")
    public String hello();
}
