package com.java1234.repository;

import com.java1234.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends
        JpaRepository<Student,Integer>, JpaSpecificationExecutor<Student> {

}