package com.hrio.springboot.basis.exception.exception;

/**
 * 自定义异常
 *
 * @author Hrio
 * @date 2022/05/16
 */
public class ResourceNotFoundException extends RuntimeException {

    private String message;

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
