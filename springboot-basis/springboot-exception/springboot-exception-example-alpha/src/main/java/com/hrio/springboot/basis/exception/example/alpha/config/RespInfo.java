package com.hrio.springboot.basis.exception.example.alpha.config;

import cn.hutool.core.bean.BeanUtil;
import com.hrio.springboot.basis.exception.example.alpha.assertion.enums.CommonResponseEnum;
import com.hrio.springboot.basis.exception.example.alpha.assertion.IResponseEnum;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * 统一返回对象
 *
 * @author Hrio
 * @date 2022/06/01
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class RespInfo<T> {

    protected String respCode;

    protected String respDesc;

    protected T data;


    /**
     * 获取返回Data
     *
     * @param clazz 类的Class对象
     * @param <D>   对象类型
     * @return 返回D类型的data
     */
    public <D> D getData(Class<D> clazz) {
        return BeanUtil.toBean(data, clazz);
    }

    /**
     * 无参业务成功状态（无data）
     *
     * @return 业务成功返回
     */
    public static RespInfo<Void> success() {
        return new RespInfo<Void>()
                .setRespCode(CommonResponseEnum.SERVER_SUCCESS.getCode())
                .setRespDesc(CommonResponseEnum.SERVER_SUCCESS.getMessage());
    }

    /**
     * 有参业务成功（有data）
     *
     * @param data 返回数据
     * @param <D>  泛型D
     * @return 返回D类型data
     */
    public static <D> RespInfo<D> success(D data) {
        return new RespInfo<D>()
                .setRespCode(CommonResponseEnum.SERVER_SUCCESS.getCode())
                .setRespDesc(CommonResponseEnum.SERVER_SUCCESS.getMessage())
                .setData(data);
    }

    /**
     * 返回业务失败
     *
     * @return 业务失败RespInfo
     */
    public static RespInfo<Void> fail(String message) {
        return new RespInfo<Void>()
                .setRespCode(CommonResponseEnum.SERVER_ERROR.getCode())
                .setRespDesc(message);
    }

    public static RespInfo<Void> build(String code, String message) {
        return new RespInfo<Void>().setRespCode(code).setRespDesc(message);
    }

    /**
     * 返回状态码枚举对应状态
     *
     * @param responseEnum 状态码枚举
     * @return 状态码枚举对应RespInfo
     */
    public static RespInfo<Void> build(IResponseEnum responseEnum) {
        return new RespInfo<Void>()
                .setRespCode(responseEnum.getCode())
                .setRespDesc(responseEnum.getMessage());
    }

    /**
     * 返回状态码枚举对应状态（可以包含自定义业务描述）
     *
     * @param responseEnum 状态码枚举
     * @param bizDesc      自定义业务描述
     * @return 状态码枚举对应RespInfo（可以包含自定义业务描述）
     */
    public static RespInfo<Void> build(IResponseEnum responseEnum, String bizDesc) {
        return new RespInfo<Void>()
                .setRespCode(responseEnum.getCode())
                .setRespDesc(responseEnum.getMessage() + ":" + bizDesc);
    }
}
