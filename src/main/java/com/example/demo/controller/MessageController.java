package com.example.demo.controller;

import com.example.demo.model.Message;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//when you make @Controller a @RestController.The @ResponseBody on the send() method can be removed

@RestController
public class MessageController {

    //url mapping
   // @ResponseBody  // this tells spring we are returning Message object and spring converts the message to JSON format
    @GetMapping("/message")  //this maps the url ./message to this method, send()
    Message send(){
        return new Message("first message");
    }

    @PostMapping("/message")
    Message echo(@RequestBody Message message){
        return  message;
    }

}
