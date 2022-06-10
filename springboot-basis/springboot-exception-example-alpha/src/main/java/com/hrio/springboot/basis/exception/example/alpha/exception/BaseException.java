package com.hrio.springboot.basis.exception.example.alpha.exception;

import com.hrio.springboot.basis.exception.example.alpha.assertion.IResponseEnum;

/**
 * @author Hrio
 * @date 2022/05/31
 */
public class BaseException extends RuntimeException {

    protected IResponseEnum responseEnum;
    protected Object[] args;

    public BaseException(IResponseEnum iResponseEnum) {
        super(iResponseEnum.getMessage());
        this.responseEnum = iResponseEnum;
    }

    public BaseException(String code, String message) {
        super(message);
        this.responseEnum = new IResponseEnum() {
            @Override
            public String getCode() {
                return code;
            }

            @Override
            public String getMessage() {
                return message;
            }
        };
    }

    public BaseException(IResponseEnum responseEnum, Object[] args, String message) {
        super(message);
        this.responseEnum = responseEnum;
        this.args = args;
    }

    public BaseException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(message, cause);
        this.responseEnum = responseEnum;
        this.args = args;
    }

    public IResponseEnum getResponseEnum() {
        return responseEnum;
    }
}
