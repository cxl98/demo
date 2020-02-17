package com.example.demo.control;

import com.example.demo.model.ChatResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class WebSocketController {

    @Autowired
    SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal,String msg){
       String [] userAndMessage=msg.split(";");
       messagingTemplate.convertAndSendToUser(userAndMessage[1],"/??/??",new ChatResp(userAndMessage[0],principal.getName()));
    }
}
