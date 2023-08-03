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
        service.add(new Question("rty", "mnb"));
        service.add(new Question("gfd", "saw"));
        Collection<Question> actual = service.getAll();
        assertEquals(2, actual.size());
        assertTrue(actual.contains(new Question("rty", "mnb")));
        assertTrue(actual.contains(new Question("gfd", "saw")));
    }

    @Test
    void remove() {
        Question q1 = service.add(new Question("rty", "mnb"));
        Question q2 = service.add(new Question("gfd", "saw"));
        Collection<Question> actual = service.getAll();
        service.remove(q1);
        assertEquals(1, actual.size());
        assertFalse(actual.contains(q1));
        assertTrue(actual.contains(q2));
    }
}
