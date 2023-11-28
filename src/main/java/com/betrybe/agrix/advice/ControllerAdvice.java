package com.betrybe.agrix.advice;

import com.betrybe.agrix.exceptions.src.main.java.com.betrybe.agrix.exceptions.FarmNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
  * advice.
  */
@RestControllerAdvice
public class ControllerAdvice {
  @ExceptionHandler(FarmNotFoundException.class)
  public ResponseEntity<String> farmException(FarmNotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Fazenda não encontrada!");
  }
}
