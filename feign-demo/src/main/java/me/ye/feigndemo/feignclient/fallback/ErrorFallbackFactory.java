package me.ye.feigndemo.feignclient.fallback;


import feign.hystrix.FallbackFactory;
import me.ye.feigndemo.feignclient.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Jacob
 * @date 16/01/2018
 */



@Component
public class ErrorFallbackFactory implements FallbackFactory<Client> {


    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorFallbackFactory.class);

    @Override
    public Client create(Throwable throwable) {
        //ErrorFallbackFactory.LOGGER.info("fall back cause: ", throwable);
        return new Client() {
            @Override
            public String hello() {
                ErrorFallbackFactory.LOGGER.info("fall back cause: ", throwable);
                return "Error!";
            }
        };
    }
}
