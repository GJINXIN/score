package com.score.scorestatistics.controller;


import com.score.scorestatistics.dto.ResultDTO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GloballException {
    @ExceptionHandler(value = {Exception.class})
    Object handleException(Exception e, HttpServletRequest request) {
        return ResultDTO.error(500, e.toString());
    }
}
