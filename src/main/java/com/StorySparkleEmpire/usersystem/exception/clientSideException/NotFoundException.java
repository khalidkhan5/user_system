package com.StorySparkleEmpire.usersystem.exception.clientSideException;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super();
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    //Throwable allows to chain exceptions together
    public NotFoundException(Throwable cause) {
        super(cause);
    }
}
