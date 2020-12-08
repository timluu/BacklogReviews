package com.talentpath.backlog.exceptions;

public class DoesNotExistException extends Exception {
    public DoesNotExistException(String message) {
        super(message);
    }

    public DoesNotExistException(String message, Throwable innerEx) {
        super(message, innerEx);
    }
}
