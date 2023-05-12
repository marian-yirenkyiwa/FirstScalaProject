package com.springboot.demo.springbootdemo.repository;

import com.springboot.demo.springbootdemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//The Jpa repository contains some predefined method. The angle brackets here take 2 arguments: The entity object and the PK (data)type.
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
