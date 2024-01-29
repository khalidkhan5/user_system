package com.StorySparkleEmpire.usersystem.exception.handler;

import com.StorySparkleEmpire.usersystem.exception.clientSideException.BadRequestException;
import com.StorySparkleEmpire.usersystem.exception.clientSideException.NotFoundException;
import com.StorySparkleEmpire.usersystem.exception.clientSideException.RequestTimeOutException;
import com.StorySparkleEmpire.usersystem.exception.clientSideException.UnAuthorizedException;
import com.StorySparkleEmpire.usersystem.exception.serverException.BadGateWayException;
import com.StorySparkleEmpire.usersystem.exception.serverException.GatewayTimeoutException;
import com.StorySparkleEmpire.usersystem.exception.serverException.InternalServerErrorException;
import com.StorySparkleEmpire.usersystem.exception.serverException.ServiceUnavailableException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.Timestamp;
import java.util.Calendar;

@RestControllerAdvice //This annotation allows centralized exception handling
public class UserSystemExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<?> handleBadRequestException(RuntimeException ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(new ApiError(ex,HttpStatus.BAD_REQUEST,new Timestamp(System.currentTimeMillis())));
    }
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> handleNotFoundException(RuntimeException ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(new ApiError(ex,HttpStatus.NOT_FOUND,new Timestamp(System.currentTimeMillis())));
    }
    @ExceptionHandler(RequestTimeOutException.class)
    public ResponseEntity<?> handleTimeOutException(RuntimeException ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT.value()).body(new ApiError(ex,HttpStatus.REQUEST_TIMEOUT,new Timestamp(System.currentTimeMillis())));
    }
    @ExceptionHandler(UnAuthorizedException.class)
    public ResponseEntity<?> handleUnAuthorizedException(RuntimeException ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED.value()).body(new ApiError(ex,HttpStatus.UNAUTHORIZED,new Timestamp(System.currentTimeMillis())));
    }
    @ExceptionHandler(BadGateWayException.class)
    public ResponseEntity<?> handleBadGatewayException(RuntimeException ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY.value()).body(new ApiError(ex,HttpStatus.BAD_GATEWAY,new Timestamp(System.currentTimeMillis())));
    }
    @ExceptionHandler(GatewayTimeoutException.class)
    public ResponseEntity<?> handleGatewayTimeoutException(RuntimeException ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT.value()).body(new ApiError(ex,HttpStatus.GATEWAY_TIMEOUT,new Timestamp(System.currentTimeMillis())));
    }
    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<?> handleInternalServerErrorException(RuntimeException ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(new ApiError(ex,HttpStatus.INTERNAL_SERVER_ERROR,new Timestamp(System.currentTimeMillis())));
    }
    @ExceptionHandler(ServiceUnavailableException.class)
    public ResponseEntity<?> handleServiceUnavailableException(RuntimeException ex, WebRequest request){
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE.value()).body(new ApiError(ex,HttpStatus.SERVICE_UNAVAILABLE,new Timestamp(System.currentTimeMillis())));
    }
}
