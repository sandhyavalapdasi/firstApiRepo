package com.demo.apiexamples.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class UsernotFoundException extends RuntimeException {
    public UsernotFoundException(String noUser) {
        super(noUser);
    }
}
