package com.tomar.consumer;

import com.tomar.packets.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tomar on 13/07/17.
 */
@RabbitListener(queues = "sample")
public class MessageConsumerImpl implements MessageConsumer<Employee> {


    private final  MessageProcessor<Employee> messageProcessor;

    @Autowired
    public MessageConsumerImpl(MessageProcessor<Employee> messageProcessor) {
        this.messageProcessor = messageProcessor;
    }

    public void recieve(Employee message) {
        messageProcessor.process(message);
        System.out.println("message consumed");
    }
}
