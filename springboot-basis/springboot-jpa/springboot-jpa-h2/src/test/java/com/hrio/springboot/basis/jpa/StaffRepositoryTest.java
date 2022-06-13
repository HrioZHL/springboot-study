package com.hrio.springboot.basis.jpa;

import com.hrio.springboot.basis.jpa.entity.po.Staff;
import com.hrio.springboot.basis.jpa.repository.StaffRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

/**
 * jpa 单元测试
 *
 * @author Hrio
 * @date 2022/06/13
 */
@SpringBootTest
public class StaffRepositoryTest {

    @Autowired
    private StaffRepository staffRepository;

    private Long id;

    @BeforeEach
    public void test_insert_staff() {
        Assertions.assertNotNull(staffRepository);
        Staff staff = new Staff("张三", 18, 1L);
        Staff save = staffRepository.saveAndFlush(staff);
        Assertions.assertNotNull(save.getId());
        id = save.getId();
    }

    @Test
    public void test_select_byId() {
        Optional<Staff> byId = staffRepository.findById(id);
        Assertions.assertTrue(byId.isPresent());
        Assertions.assertEquals("张三", byId.get().getName());
        Assertions.assertEquals(Integer.valueOf(18), byId.get().getAge());
        staffRepository.deleteAll();
    }

    @Test
    public void test_custom_sql() {
        Optional<Staff> staff = staffRepository.queryStaffByCustomSql("1");
        Assertions.assertTrue(staff.isPresent());
        Assertions.assertEquals("张三", staff.get().getName());

        String staffName = staffRepository.queryStaffNameById(id);
        Assertions.assertEquals("张三", staffName);
        staffRepository.deleteAll();
    }

    @Test
    public void test_update_name() {
        staffRepository.updateStaffNameById("李四", id);
        Assertions.assertEquals("李四", staffRepository.queryStaffNameById(id));
        staffRepository.deleteAll();
    }
}
