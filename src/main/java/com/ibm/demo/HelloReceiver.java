package com.ibm.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author THLiu
 */
@Component
@RabbitListener(queues = "queue")
public class HelloReceiver {
    @RabbitHandler
    public void process(String queue) {
        System.out.println("Receiver  : -------------------------------------" + queue);
    }
}
