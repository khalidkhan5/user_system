package com.StorySparkleEmpire.usersystem.exception.clientSideException;

public class UnAuthorizedException extends RuntimeException {
    public UnAuthorizedException() {
        super();
    }

    public UnAuthorizedException(String message) {
        super(message);
    }

    public UnAuthorizedException(String message, Throwable cause) {
        super(message, cause);
    }
    //Throwable allows to chain exceptions together
    public UnAuthorizedException(Throwable cause) {
        super(cause);
    }
}
