package com.hrio.springboot.basis.exception;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 全局异常处理单元测试
 *
 * @author Hrio
 * @date 2022/05/16
 */
@AutoConfigureMockMvc
@SpringBootTest
public class ExceptionTest {


    @Autowired
    MockMvc mockMvc;


    @Test
    void test_400_exception() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/exception/illegalArgumentException"))
                .andExpect(status().is(400))
                .andExpect(jsonPath("$.message").value("参数错误！"));
    }

    @Test
    void test_404_exception() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/exception/resourceNotFoundException"))
                .andExpect(status().is(404))
                .andExpect(jsonPath("$.message").value("资源不存在！"));
    }

}
