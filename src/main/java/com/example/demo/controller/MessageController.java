package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

    //url mapping
    @ResponseBody  // this tells spring we are returning Message object and spring converts the message to JSON format
    @GetMapping("/message")  //this maps the url ./message to this method, send()
    Message send(){
        return new Message("first message");
    }

}
