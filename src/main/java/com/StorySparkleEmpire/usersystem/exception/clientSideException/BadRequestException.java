package com.StorySparkleEmpire.usersystem.exception.clientSideException;

public class BadRequestException extends RuntimeException {
    public BadRequestException() {
        super();
    }
    //passing reason for exception
    public BadRequestException(String message) {
        super(message);
    }
    //Throwable allows to chain exceptions together
    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadRequestException(Throwable cause) {
        super(cause);
    }
}
