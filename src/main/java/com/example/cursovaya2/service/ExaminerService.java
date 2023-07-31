package com.example.cursovaya2.service;

import com.example.cursovaya2.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}

