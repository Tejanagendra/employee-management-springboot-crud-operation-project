package com.teja.employee.repository;

import com.teja.employee.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departmentRepository extends JpaRepository<Department,Integer> {
}
