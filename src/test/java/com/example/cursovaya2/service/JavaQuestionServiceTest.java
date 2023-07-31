package com.example.cursovaya2.service;

import com.example.cursovaya2.model.Question;
import com.example.cursovaya2.service.impl.JavaQuestionService;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaQuestionServiceTest {
    JavaQuestionService service = new JavaQuestionService();

    @Test
    void add() {

        service.add(new Question("asd", "zxc"));
        service.add(new Question("fgh", "jkl"));

        Collection<Question> actual = service.getAll();
        assertEquals(2, actual.size());
        assertTrue(actual.contains(new Question("asd", "zxc")));
        assertTrue(actual.contains(new Question("fgh", "jkl")));
    }

}
