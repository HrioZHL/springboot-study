package com.hrio.springboot.basis.exception.exception;

/**
 * 异常返回实体类
 *
 * @author Hrio
 * @date 2022/05/16
 */
public class ErrorResponse {

    private String errorType;

    private String message;

    public ErrorResponse(Exception e) {
        this(e.getClass().getName(), e.getMessage());
    }

    public ErrorResponse(String errorType, String message) {
        this.errorType = errorType;
        this.message = message;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
