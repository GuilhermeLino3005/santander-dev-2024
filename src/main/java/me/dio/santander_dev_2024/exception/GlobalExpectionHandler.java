package me.dio.santander_dev_2024.exception;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;


@RestControllerAdvice
public class GlobalExpectionHandler {

    private final Logger logger = (Logger) LoggerFactory.getLogger(GlobalExpectionHandler.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handeleBusinessExection(IllegalArgumentException businessExection){
        return new ResponseEntity<>(businessExection.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handeleNotFoundExection(NoSuchElementException notFoundExection){
        return new ResponseEntity<>("Resource ID not foud", HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handeleUnexpectedException(Throwable unexpectedException){
        var message = "Unexpected server erro, see the logs";
        logger.error(message, unexpectedException);
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
