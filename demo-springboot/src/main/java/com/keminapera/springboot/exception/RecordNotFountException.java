package com.keminapera.springboot.exception;

/**
 * @author keminapera
 * @date 2020/9/12
 */
public class RecordNotFountException extends RuntimeException {
    public RecordNotFountException(String message) {
        super(message);
    }
}
