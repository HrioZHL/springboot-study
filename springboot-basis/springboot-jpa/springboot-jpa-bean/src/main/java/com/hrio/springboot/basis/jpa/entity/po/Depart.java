package com.hrio.springboot.basis.jpa.entity.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 部门
 *
 * @author Hrio
 * @date 2022/06/13
 */
@Entity
@Data
@NoArgsConstructor
public class Depart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String desc;

    public Depart(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
