package com.hrio.springboot.basis.exception.example.constants;

/**
 * 返回状态码枚举
 *
 * @author Hrio
 * @date 2022/05/27
 */
public enum RespEnum {

    /**
     * 业务成功
     */
    SUCCESS("0000", "成功"),

    /**
     * 业务失败
     */
    FAIL("9999", "失败");

    /**
     * 状态码
     */
    private String code;

    /**
     * 描述
     */
    private String desc;

    RespEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
