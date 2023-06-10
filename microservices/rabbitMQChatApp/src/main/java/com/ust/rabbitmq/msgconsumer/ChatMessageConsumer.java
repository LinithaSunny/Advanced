package com.ust.rabbitmq.msgconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ust.rabbitmq.chatmsg.ChatMessage;

@Component
public class ChatMessageConsumer {

    @RabbitListener(queues = "chatQueue")
    public void receiveMessage(ChatMessage message) {
        System.out.println("Received message: " + message.getMessage());
        // Process the received message as required
    }
}

