package com.hrio.springboot.basis.jpa.entity.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 薪资
 *
 * @author Hrio
 * @date 2022/06/13
 */
@Entity
@Data
@NoArgsConstructor
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer salary;

    private String level;

    public Salary(Integer salary, String level) {
        this.salary = salary;
        this.level = level;
    }
}
