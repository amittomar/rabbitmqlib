package com.tomar.sender;

import com.tomar.packets.Employee;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tomar on 13/07/17.
 */
public class MessageSenderImpl implements MessageSender<Employee> {

    private final RabbitTemplate template;

    @Autowired
    public MessageSenderImpl(RabbitTemplate template) {
        this.template = template;
    }

    public void send(Employee employee) {
        template.convertAndSend("${rabbitmq.queue}",employee);

    }
}
