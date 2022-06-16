package com.hrio.springboot.basis.jpa.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工信息
 *
 * @author zhanghl
 * @date 2022/06/16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StaffDTO {

    private String name;

    private Integer age;

    private String departName;

    private Integer salary;

}
