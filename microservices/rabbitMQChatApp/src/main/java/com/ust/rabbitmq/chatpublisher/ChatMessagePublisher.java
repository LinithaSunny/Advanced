package com.ust.rabbitmq.chatpublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rabbitmq.chatmsg.ChatMessage;
import com.ust.rabbitmq.msgproducer.ChatMessageProducer;

@RestController
public class ChatMessagePublisher {

    private final ChatMessageProducer messageProducer;

    @Autowired
    public ChatMessagePublisher(ChatMessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @PostMapping("/chat/send")
    public void sendMessage(@RequestBody ChatMessage message) {
        // Validate and process the message as required
        messageProducer.sendMessage(message);
    }
}

