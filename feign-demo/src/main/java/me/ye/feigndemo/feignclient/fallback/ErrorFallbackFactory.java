package me.ye.feigndemo.feignclient.fallback;


import feign.hystrix.FallbackFactory;
import me.ye.feigndemo.feignclient.DemoFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Jacob
 * @date 16/01/2018
 */



@Component
public class ErrorFallbackFactory implements FallbackFactory<DemoFeignClient> {


    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorFallbackFactory.class);

    @Override
    public DemoFeignClient create(Throwable throwable) {
        return new DemoFeignClient() {
            @Override
            public String hello() {
                ErrorFallbackFactory.LOGGER.info("fall back cause: ", throwable);
                return "Error!";
            }
        };
    }
}
