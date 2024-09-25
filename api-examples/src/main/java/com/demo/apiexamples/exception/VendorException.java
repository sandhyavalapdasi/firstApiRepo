package com.demo.apiexamples.exception;

import org.springframework.http.HttpStatus;

public class VendorException {
    private final String message;
    private final Throwable throwable;

    private final HttpStatus httpstatus;

    public VendorException(String message, Throwable throwable, HttpStatus httpstatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpstatus = httpstatus;
    }



}
