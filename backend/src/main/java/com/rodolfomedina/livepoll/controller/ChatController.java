package com.rodolfomedina.livepoll.controller;


import com.rodolfomedina.livepoll.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    //catches messages sent to /app/chat
    // "app" in "/app/chat" is implied from the config
    @MessageMapping("/chat")
    // return value gets broadcast to everyone subscribed to /topic/messages
    @SendTo("/topic/messages")
    public ChatMessage handleChat(ChatMessage message){
        System.out.println("Recieved from " + message.getSender() + ": " + message.getContent());
        return message; // whatever you rteturn gets broadcast to the topic

    }

}
