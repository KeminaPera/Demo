package com.keminapera.springboot.controller;

import com.keminapera.springboot.pojo.Student;
import com.keminapera.springboot.service.StudentWithCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author keminapera
 * @date 2020/9/13
 */
@RestController
@RequestMapping("/student/cache")
public class StudentWithCacheController {
    @Autowired
    private StudentWithCacheService studentService;

    @GetMapping("/{name}")
    public Student getStudent(@PathVariable("name") String name) {
        return studentService.getStudent(name);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        List<Student> allStudent = studentService.getAll();
        return new ResponseEntity<>(allStudent, HttpStatus.OK);
    }
}
