package com.hrio.springboot.basis.jpa;

import com.hrio.springboot.basis.jpa.entity.po.Staff;
import com.hrio.springboot.basis.jpa.repository.StaffRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * JPA MySQL单元测试
 *
 * @author zhanghl
 * @date 2022/06/13
 */
@SpringBootTest
public class MysqlStaffRepositoryTest {

    @Autowired
    private StaffRepository staffRepository;

    @Test
    public void test_insert_staff() {
        Assertions.assertNotNull(staffRepository);
        Staff staff = new Staff("张三", 18, 1L);
        Staff save = staffRepository.saveAndFlush(staff);
        Assertions.assertNotNull(save.getId());
    }
}
