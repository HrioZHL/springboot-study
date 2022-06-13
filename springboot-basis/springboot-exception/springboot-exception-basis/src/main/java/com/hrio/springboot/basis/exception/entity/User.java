package com.hrio.springboot.basis.exception.entity;

import lombok.Data;

/**
 * 用户实体类
 *
 * @author Hrio
 * @date 2022/05/12
 */
@Data
public class User {

    /**
     * id
     */
    private String id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;
}
