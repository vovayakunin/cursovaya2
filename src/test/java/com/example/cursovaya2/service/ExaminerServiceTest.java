package com.example.cursovaya2.service;

import com.example.cursovaya2.model.Question;
import com.example.cursovaya2.service.impl.ExaminerServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {
    @Mock
    QuestionService questionService;
    @InjectMocks
    ExaminerServiceImpl examinerService;

    private List<Question> questions = List.of(
            new Question("asd", "zxc"),
            new Question("qwe", "fgh"),
            new Question("iop", "aks")
    );

    @Test
    void getQuestion() {
        when(questionService.getAll()).thenReturn(questions);
        when(questionService.getRandomQuestion())
                .thenReturn(questions.get(0))
                .thenReturn(questions.get(1))
                .thenReturn(questions.get(2));

        Collection<Question> actual = examinerService.getQuestions(2);
        assertEquals(2, actual.size());
        assertTrue(questions.containsAll(actual));
    }

    private void assertTrue(boolean containsAll) {
    }

}

