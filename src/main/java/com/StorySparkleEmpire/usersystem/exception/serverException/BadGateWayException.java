package com.StorySparkleEmpire.usersystem.exception.serverException;

public class BadGateWayException extends RuntimeException{
    public BadGateWayException() {
        super();
    }

    public BadGateWayException(String message) {
        super(message);
    }

    public BadGateWayException(String message, Throwable cause) {
        super(message, cause);
    }
    //Throwable allows to chain exceptions together
    public BadGateWayException(Throwable cause) {
        super(cause);
    }
}
