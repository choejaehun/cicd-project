package com.cicd.user.exception.handler;

import com.cicd.user.exception.DataNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;




/**
 * packageName : com.cicd.user.logging.handler
 * fileName    : ExceptionControllerAdvice
 * author      : jaejun
 * date        : 2024-10-25
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-25         jaejun
 */

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleDataNotFoundException(DataNotFoundException exception) {
        return new ResponseEntity<>(
                ExceptionResponse
                        .builder()
                        .status(HttpStatus.NOT_FOUND)
                        .message("Excpetion: Data Not Found")
                        .build(),
                HttpStatus.NOT_FOUND
        );
    }
}
