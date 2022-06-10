package com.hrio.springboot.basis.exception.example.alpha.controller;

import com.hrio.springboot.basis.exception.example.alpha.assertion.BusinessExceptionAssert;
import com.hrio.springboot.basis.exception.example.alpha.assertion.enums.ArgumentResponseEnum;
import com.hrio.springboot.basis.exception.example.alpha.assertion.enums.CommonResponseEnum;
import com.hrio.springboot.basis.exception.example.alpha.entity.dto.TestDTO;
import org.springframework.web.bind.annotation.*;

/**
 * 全局异常测试接口
 *
 * @author Hrio
 * @date 2022/06/01
 */
@RestController
@RequestMapping("/exception/alpha")
public class ExceptionController {

    /**
     * 测试Controller上一层相关异常
     * 请求类型错误异常（405）
     */
    @PostMapping("/testMethodNotSupport")
    public void testMethodNotSupport() {
    }

    @PostMapping("/testBusinessAssert")
    public void testBusinessException(@RequestBody TestDTO testDTO) {
        ArgumentResponseEnum.VALID_ERROR.assertNotNull(testDTO.getUserName(), "用户名称不可为空");
    }

}
