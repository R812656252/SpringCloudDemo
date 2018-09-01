package com.java1234.controller;

import com.java1234.service.StudentService;
import org.springframework.web.bind.annotation.*;

import com.java1234.Entity.Student;

import java.util.List;

import javax.annotation.Resource;

@RestController
@RequestMapping("/student")
public class StudentProviderController {

    @Resource
    private StudentService studentService;

    @PostMapping("/save")
    public boolean save(Student student){
        try{
            studentService.save(student);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @GetMapping(value="/list")
    public List<Student> list(){
        return studentService.list();
    }

    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return studentService.findById(id);
    }

    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try{
            studentService.delete(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
