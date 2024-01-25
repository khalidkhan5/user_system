package com.StorySparkleEmpire.usersystem.exception.serverException;

public class InternalServerErrorException extends RuntimeException{
    public InternalServerErrorException(){super();}
    public InternalServerErrorException(String message){
        super(message);
    }
    public InternalServerErrorException(String message, Throwable cause){
        super(message, cause);
    }
    //Throwable allows to chain exceptions together
    public InternalServerErrorException(Throwable cause){
        super(cause);
    }
}
