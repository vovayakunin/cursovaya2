package com.example.cursovaya2.service.impl;

import com.example.cursovaya2.exceptions.NotEnoughQuestionException;
import com.example.cursovaya2.model.Question;
import com.example.cursovaya2.service.ExaminerService;
import com.example.cursovaya2.service.QuestionService;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService service;

    public ExaminerServiceImpl(QuestionService service) {
        this.service = service;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > service.getAll().size()) {
            throw new NotEnoughQuestionException();
        }


        return Stream.generate(service::getRandomQuestion)
                .distinct()
                .limit(amount)
                .collect(Collectors.toList());
    }
}
