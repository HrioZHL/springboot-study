package com.hrio.springboot.basis.exception.example.entity;

import cn.hutool.core.bean.BeanUtil;
import com.hrio.springboot.basis.exception.example.constants.RespEnum;
import com.hrio.springboot.basis.exception.example.utils.DateUtil;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 返回参数
 *
 * @author Hrio
 * @date 2022/05/26
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class RespInfo<T> implements Serializable {

    /**
     * 返回状态码
     */
    private String respCode;

    /**
     * 返回描述
     */
    private String respDesc;

    /**
     * 返回业务数据
     */
    private T data;

    /**
     * 时间字段
     */
    private String time = String.valueOf(DateUtil.getTimeMills());

    /**
     * 只包括状态码和状态描述的构造方法
     *
     * @param respCode 状态码
     * @param respDesc 描述
     */
    public RespInfo(String respCode, String respDesc) {
        this.respCode = respCode;
        this.respDesc = respDesc;
    }

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
                .setRespCode(RespEnum.SUCCESS.getCode())
                .setRespDesc(RespEnum.SUCCESS.getDesc());
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
                .setRespCode(RespEnum.SUCCESS.getCode())
                .setRespDesc(RespEnum.SUCCESS.getDesc())
                .setData(data);
    }

    /**
     * 返回业务失败
     *
     * @return 业务失败RespInfo
     */
    public static RespInfo<Void> fail(String message) {
        return new RespInfo<Void>()
                .setRespCode(RespEnum.FAIL.getCode())
                .setRespDesc(message);
    }

    /**
     * 返回状态码枚举对应状态
     *
     * @param respEnum 状态码枚举
     * @return 状态码枚举对应RespInfo
     */
    public static RespInfo<Void> build(RespEnum respEnum) {
        return new RespInfo<Void>()
                .setRespCode(respEnum.getCode())
                .setRespDesc(respEnum.getDesc());
    }

    /**
     * 返回状态码枚举对应状态（可以包含自定义业务描述）
     *
     * @param respEnum 状态码枚举
     * @param bizDesc  自定义业务描述
     * @return 状态码枚举对应RespInfo（可以包含自定义业务描述）
     */
    public static RespInfo<Void> build(RespEnum respEnum, String bizDesc) {
        return new RespInfo<Void>()
                .setRespCode(respEnum.getCode())
                .setRespDesc(respEnum.getDesc() + ":" + bizDesc);
    }

}
