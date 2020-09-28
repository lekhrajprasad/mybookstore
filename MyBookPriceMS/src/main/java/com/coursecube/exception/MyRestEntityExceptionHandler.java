package com.coursecube.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@ControllerAdvice
public class MyRestEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({BookIDNotFoundException.class})
    public ResponseEntity<MyErrorMessage> handleBookNotFound(HttpServletResponse response) {
        MyErrorMessage errMsg = new MyErrorMessage();
        errMsg.setTimestamp(LocalDateTime.now());
        errMsg.setStatus(HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(errMsg, HttpStatus.NOT_FOUND);
    }

    //@ExceptionHandler({CityNotFoundException.class})
    public ResponseEntity<MyErrorMessage> handleCityNotFound(RuntimeException ex,
                                                                WebRequest request) {
        System.out.println("===========================================");
        ex.printStackTrace();
        System.out.println(request.getContextPath());
        System.out.println("===========================================");
        MyErrorMessage errMsg = new MyErrorMessage();
        errMsg.setTimestamp(LocalDateTime.now());
        errMsg.setError("-----City not found -------");
        errMsg.setStatus(HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(errMsg, HttpStatus.NOT_FOUND);
    }
}
