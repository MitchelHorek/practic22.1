package com.company;

public class Exception extends Throwable {
    private String exception;
    public Exception(String exception) {
        this.exception = exception;
    }
    public String getMessage() {
        return exception;
    }
}
