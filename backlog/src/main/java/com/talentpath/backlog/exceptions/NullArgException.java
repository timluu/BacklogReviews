package com.talentpath.backlog.exceptions;

public class NullArgException extends Exception {
    public NullArgException(String message) {
        super(message);
    }

    public NullArgException(String message, Throwable innerEx) {
        super(message, innerEx);
    }
}
