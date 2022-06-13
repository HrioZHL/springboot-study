package com.hrio.springboot.basis.exception.example.alpha.assertion;

import com.hrio.springboot.basis.exception.example.alpha.exception.ArgumentException;
import com.hrio.springboot.basis.exception.example.alpha.exception.BaseException;

import java.text.MessageFormat;

/**
 * 一般断言异常
 *
 * @author Hrio
 * @date 2022/6/8
 */
public interface CommonExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new ArgumentException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable cause, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new ArgumentException(this, args, msg, cause);
    }
}