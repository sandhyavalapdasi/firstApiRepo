package com.demo.apiexamples.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("questions")
public class QuestionController {

    private Logger logger= LoggerFactory.getLogger(getClass());
    public String getQuestions(@PathVariable String qtype){

        logger.info("first method");
     return "hello";

    }
}
