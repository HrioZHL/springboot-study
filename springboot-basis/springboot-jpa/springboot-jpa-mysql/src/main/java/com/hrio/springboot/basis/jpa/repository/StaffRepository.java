package com.hrio.springboot.basis.jpa.repository;

import com.hrio.springboot.basis.jpa.entity.po.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * 员工数据库操作
 *
 * @author zhanghl
 * @date 2022/06/13
 */
@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    @Query("select s from Staff s where s.name like %:name%")
    Optional<Staff> queryStaffByCustomSql(@Param("name") String name);

    @Query("select s.name from Staff s where s.id = :id")
    String queryStaffNameById(@Param("id") Long id);

    @Modifying
    @Transactional
    @Query("update Staff s set s.name = ?1 where s.id=?2")
    void updateStaffNameById(String name, Long id);
}
