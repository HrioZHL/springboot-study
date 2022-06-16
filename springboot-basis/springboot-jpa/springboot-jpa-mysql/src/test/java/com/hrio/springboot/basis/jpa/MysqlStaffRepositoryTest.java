package com.hrio.springboot.basis.jpa;

import com.hrio.springboot.basis.jpa.entity.dto.StaffDTO;
import com.hrio.springboot.basis.jpa.entity.po.Staff;
import com.hrio.springboot.basis.jpa.repository.StaffRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

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

    @Test
    public void test_select_byId() {
        Optional<Staff> byId = staffRepository.findById(1L);
        Assertions.assertTrue(byId.isPresent());
        Assertions.assertEquals("张三", byId.get().getName());
        Assertions.assertEquals(Integer.valueOf(18), byId.get().getAge());
    }

    @Test
    public void test_join_sql() {
        Optional<StaffDTO> staffDTO = staffRepository.queryStaffInfo(1L);
        Assertions.assertTrue(staffDTO.isPresent());
        Assertions.assertEquals("张三",staffDTO.get().getName());


    }
}
