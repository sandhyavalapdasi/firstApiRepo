package com.demo.apiexamples.controller;

import com.demo.apiexamples.data.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    private Logger logger= LoggerFactory.getLogger(getClass());

    @GetMapping("say-hello")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello(@RequestParam String name){
        //ResponseEntity.created(null).build();

        //throw new UsernotFoundException("no user");
        return "Hello! how are you";
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public String sayPost(@RequestBody String message){
        return "hello"+ message;
    }

    @PostMapping("/post-order")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String sayPost(@RequestBody Order neworder){
        return "hello:"+ neworder.toString();
    }



}
