package com.sunan.systemStoreDesk.exceptions.hadler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.sunan.systemStoreDesk.exceptions.EnumException;
import com.sunan.systemStoreDesk.exceptions.ExceptionResponse;

@ControllerAdvice
public class ExceptionResponseHadler {
    
    @ExceptionHandler(EnumException.class)
    public ResponseEntity<ExceptionResponse> handlerEnumBadRequest(Exception ex, WebRequest request){
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

}
