package com.StorySparkleEmpire.usersystem.exception.clientSideException;

public class RequestTimeOutException extends RuntimeException {
    public RequestTimeOutException() {
        super();
    }

    public RequestTimeOutException(String message) {
        super(message);
    }

    public RequestTimeOutException(String message, Throwable cause) {
        super(message, cause);
    }

    //Throwable allows to chain exceptions together
    public RequestTimeOutException(Throwable cause) {
        super(cause);
    }
}
