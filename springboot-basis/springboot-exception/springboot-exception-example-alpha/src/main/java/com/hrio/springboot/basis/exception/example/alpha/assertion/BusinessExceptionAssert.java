package com.hrio.springboot.basis.exception.example.alpha.assertion;

import com.hrio.springboot.basis.exception.example.alpha.exception.BaseException;
import com.hrio.springboot.basis.exception.example.alpha.exception.BusinessException;

import java.text.MessageFormat;

/**
 * 业务异常断言
 *
 * @author Hrio
 * @date 2022/6/8
 */
public interface BusinessExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(this, args, msg, t);
    }

}