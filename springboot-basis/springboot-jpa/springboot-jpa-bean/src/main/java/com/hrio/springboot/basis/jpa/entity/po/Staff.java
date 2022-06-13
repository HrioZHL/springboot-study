package com.hrio.springboot.basis.jpa.entity.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 员工
 *
 * @author Hrio
 * @date 2022/06/13
 */
@Entity
@Data
@NoArgsConstructor
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    private Long departId;

    private Long salaryId;

    public Staff(String name, Integer age, Long departId) {
        this.name = name;
        this.age = age;
        this.departId = departId;
    }

}
