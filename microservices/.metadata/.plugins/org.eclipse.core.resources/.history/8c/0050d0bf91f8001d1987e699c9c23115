package com.ust.rabbitmq.msgproducer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ust.rabbitmq.chatmsg.ChatMessage;

@Component
public class ChatMessageProducer {

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public ChatMessageProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(ChatMessage message) {
        rabbitTemplate.convertAndSend("chatExchange", "", message);
    }
}
