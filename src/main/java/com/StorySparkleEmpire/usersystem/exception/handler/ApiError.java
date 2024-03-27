package com.StorySparkleEmpire.usersystem.exception.handler;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

@Data
public class ApiError {
    private Timestamp timestamp;
    private int status;
    private String error;
    private String message;

    public ApiError(RuntimeException ex, HttpStatus badRequest, Timestamp timestamp) {
        this.message=ex.getMessage();
        this.error=badRequest.getReasonPhrase();
        this.status=badRequest.value();
        this.timestamp=timestamp;
    }

    public String toString(){
        return "{\n"+"timestamp: "+timestamp+",\n"+"status: "+status+",\n"+"error: "+error+",\n"+"message: "+message+"\n}";
    }
}
