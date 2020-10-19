package com.keminapera.springboot.controller;

import com.keminapera.springboot.pojo.Student;
import com.keminapera.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author keminapera
 * @date 2020/9/12
 */
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        List<Student> allStudent = studentService.getAll();
        return new ResponseEntity<>(allStudent, HttpStatus.OK);
    }
    @PostMapping("/name/{name}")
    public HttpStatus addStudent(Student student) {
        studentService.addStudent(student);
        return HttpStatus.NO_CONTENT;
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable("name") String name) {
        Student student = studentService.getStudentByName(name);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping("/name/{name}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student newStudent = studentService.updateStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/name/{name}")
    public HttpStatus deleteStudentByName(@PathVariable("name") String name) {
        studentService.deleteStudentByName(name);
        return HttpStatus.NO_CONTENT;
    }
}
