package com.java1234.service.impl;

import com.java1234.Entity.Student;
import com.java1234.repository.StudentRepository;
import com.java1234.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository studentRepository;

    @Override
    public void save(Student student){
        studentRepository.save(student);
    }

    @Override
    public Student findById(Integer id){
        return studentRepository.findOne(id);
    }

    @Override
    public List<Student> list(){
        return studentRepository.findAll();
    }

    @Override
    public void delete(Integer id){
        studentRepository.delete(id);
    }

}
