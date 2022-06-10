package com.hrio.springboot.basis.exception.example.exception;

/**
 * 业务异常
 *
 * @author Hrio
 * @date 2022/05/26
 */
public class BusinessException extends RuntimeException {

    private String message;

    public BusinessException() {
    }

    public BusinessException(String message) {
        this.message = message;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
