package com.cicd.user.exception.handler;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * packageName : com.cicd.user.logging.handler
 * fileName    : ExceptionResponse
 * author      : jaejun
 * date        : 2024-10-25
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-25         jaejun
 */
@Data
@Builder
public class ExceptionResponse {

    private HttpStatus status;
    private String message;
}
