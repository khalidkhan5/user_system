package com.StorySparkleEmpire.usersystem.exception.handler;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice //This annotation allows centralized exception handling
public class UserSystemExceptionHandler extends ResponseEntityExceptionHandler {

}
