package com.mychelantonacio.cqdb.services;

import com.mychelantonacio.cqdb.models.Question;
import com.mychelantonacio.cqdb.util.LoadSampleQuestions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class QuestionService {

    private static final Logger log = LoggerFactory.getLogger(QuestionService.class);


    public Question findRandomSampleQuestion(){

        List<Question> questions = LoadSampleQuestions.getSampleQuestions.stream().collect(Collectors.toList());
        int randomInt = (int)(Math.random() * questions.size());

        log.info(questions.get(randomInt).getTitle());
        return questions.get(randomInt);
    }


    public Question findQuestionById(long id){
        List<Question> questions = LoadSampleQuestions.getSampleQuestions.stream()
                .filter(q -> q.getId() == id)
                .collect(Collectors.toList());

        return questions.size() == 0 ? new Question() : questions.get(0);
    }
}