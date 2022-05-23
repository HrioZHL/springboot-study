package com.hrio.springboot.basis.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 自定义异常
 *
 * @author zhanghl
 * @date 2022/05/16
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundByStatusException extends RuntimeException {

    public ResourceNotFoundByStatusException() {
        super();
    }

    public ResourceNotFoundByStatusException(String message) {
        super(message);
    }
}
