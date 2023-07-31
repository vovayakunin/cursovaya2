package com.example.cursovaya2.service;

import com.example.cursovaya2.model.Question;
import com.example.cursovaya2.service.impl.JavaQuestionService;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class JavaQuestionServiceTest {
    JavaQuestionService service = new JavaQuestionService();

    @Test
    void add() {

        Question q1 = new Question("asd", "zxc");
        service.add(q1);
        Question q2 = new Question("fgh", "jkl");
        service.add(q2);

        Collection<Question> actual = service.getAll();
        assertEquals(2, actual.size());
        assertTrue(actual.contains(q1));
        assertTrue(actual.contains(q2));


        service.remove(q1);
        assertEquals(1, actual.size());
        assertFalse(actual.contains(q1));
        assertTrue(actual.contains(q2));


    }
}
