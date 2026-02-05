package com.example.demo.controller;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    
    @MessageMapping("/sendMessage")
    @SendTo("/notify/message")
    @CrossOrigin(origins = {"localhost:8080"})
    public String sendMessage(String message){
        System.out.println("Message :"+message);
        return message;
    }
}
