package com.hrio.springboot.basis.exception.example.alpha;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 全局异常单元测试类
 *
 * @author Hrio
 * @date 2022/06/10
 */
@AutoConfigureMockMvc
@SpringBootTest
public class ExceptionController_CASE {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testMethodNotSupport() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/exception/alpha/testMethodNotSupport"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.respCode").value("4405"))
                .andExpect(jsonPath("$.respDesc").value(containsString("请求类型错误")));
        System.out.println("111111");
    }

    @Test
    public void testNoHandlerFound() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/exception/alpha/xxx"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.respCode").value("4404"))
                .andExpect(jsonPath("$.respDesc").value(containsString("接口不存在")));
    }

    @Test
    public void test(){

    }



}
