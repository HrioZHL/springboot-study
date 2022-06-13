package com.hrio.springboot.basis.jpa.entity.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 员工
 *
 * @author Hrio
 * @date 2022/06/13
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "td_m_staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "departId")
    private Long departId;

    @Column(name = "salaryId")
    private Long salaryId;

    public Staff(String name, Integer age, Long departId) {
        this.name = name;
        this.age = age;
        this.departId = departId;
    }

}
