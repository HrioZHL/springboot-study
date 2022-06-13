package com.hrio.springboot.basis.exception.example.alpha.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Hrio
 * @date 2022/06/01
 */
@Data
public class TestDTO implements Serializable {

    private String userName;

    private String password;

}
