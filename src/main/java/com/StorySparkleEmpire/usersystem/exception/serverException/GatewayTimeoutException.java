package com.StorySparkleEmpire.usersystem.exception.serverException;

public class GatewayTimeoutException extends RuntimeException{
    public GatewayTimeoutException() {
        super();
    }

    public GatewayTimeoutException(String message) {
        super(message);
    }

    public GatewayTimeoutException(String message, Throwable cause) {
        super(message, cause);
    }
    //Throwable allows to chain exceptions together
    public GatewayTimeoutException(Throwable cause) {
        super(cause);
    }
}
