package com.example.cursovaya2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class StorageIsEmptyException extends RuntimeException {

    public StorageIsEmptyException() {
        super();
    }

    public StorageIsEmptyException(String message) {
        super(message);
    }

    public StorageIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsEmptyException(Throwable cause) {
        super(cause);
    }

    public StorageIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
