package com.example.cursovaya2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotEnoughQuestionException extends RuntimeException {
    public NotEnoughQuestionException() {
        super();

    }

    public NotEnoughQuestionException(String message) {
        super(message);
    }

    public NotEnoughQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughQuestionException(Throwable cause) {
        super(cause);
    }

    public NotEnoughQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
