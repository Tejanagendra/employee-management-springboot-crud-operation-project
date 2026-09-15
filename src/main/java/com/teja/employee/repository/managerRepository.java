package com.teja.employee.repository;

import com.teja.employee.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface managerRepository extends JpaRepository<Manager,Integer> {
}
