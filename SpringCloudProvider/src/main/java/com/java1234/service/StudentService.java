package com.java1234.service;

import com.java1234.Entity.Student;

import java.util.List;

public interface StudentService {

    public void save(Student student);

    public Student findById(Integer id);

    public List<Student> list();

    public void delete(Integer id);
}
