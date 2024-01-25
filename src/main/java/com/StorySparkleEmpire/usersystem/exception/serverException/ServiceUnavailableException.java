package com.StorySparkleEmpire.usersystem.exception.serverException;

public class ServiceUnavailableException extends RuntimeException{
    public ServiceUnavailableException() {
        super();
    }

    public ServiceUnavailableException(String message) {
        super(message);
    }

    public ServiceUnavailableException(String message, Throwable cause) {
        super(message, cause);
    }
    //Throwable allows to chain exceptions together
    public ServiceUnavailableException(Throwable cause) {
        super(cause);
    }
}
