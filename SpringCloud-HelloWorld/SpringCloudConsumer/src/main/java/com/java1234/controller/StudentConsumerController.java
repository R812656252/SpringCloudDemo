package com.java1234.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.java1234.Entity.Student;

import java.util.List;
import javax.annotation.Resource;

@RestController
@RequestMapping("/student")
public class StudentConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @PostMapping(value="/save")
    private boolean save(@RequestBody Student student){
        return restTemplate.postForObject("http://localhost:8081/student/save", student, Boolean.class);
    }

    @SuppressWarnings("unchecked")

    @GetMapping(value="/list")
    public List<Student> list(){
        return restTemplate.getForObject("http://localhost:8081/student/list", List.class);
    }

    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id) {
        return restTemplate.getForObject("http://localhost:8081/student/get/" + id, Student.class);
    }

    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try{
            restTemplate.getForObject("http://localhost:8081/student/delete/"+id, Boolean.class);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
