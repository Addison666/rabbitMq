package com.ibm.demo;


import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author THLiu
 */
@Configuration
public class SenderConf {
    @Bean
    public Queue queue() {
        return new Queue("queue");
    }
}
