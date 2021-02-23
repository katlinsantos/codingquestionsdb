package com.mychelantonacio.cqdb.controllers;

import com.mychelantonacio.cqdb.models.Question;
import com.mychelantonacio.cqdb.services.QuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    private static final Logger log = LoggerFactory.getLogger(QuestionController.class);


    @CrossOrigin
    @GetMapping("/sample")
    public Question findRandomSampleQuestion(){

        Question question = questionService.findRandomSampleQuestion();
        log.info( question.toString() );

        return question;
    }
}
